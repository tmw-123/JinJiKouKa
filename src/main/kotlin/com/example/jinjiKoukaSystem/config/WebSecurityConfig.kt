package com.example.jinjiKoukaSystem.config


import com.example.jinjiKoukaSystem.service.UserDetailsLoginServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

@Configuration
@EnableWebSecurity
class WebSecurityConfig : WebSecurityConfigurerAdapter() {

    @Autowired
    var userDetailsService: UserDetailsLoginServiceImpl? = null

    @Bean
    fun passwordEncoder(): BCryptPasswordEncoder {
        return BCryptPasswordEncoder()
    }


    @Autowired
    @Throws(Exception::class)
    fun configureGlobal(auth: AuthenticationManagerBuilder) {
        auth.userDetailsService<UserDetailsService?>(userDetailsService).passwordEncoder(passwordEncoder())
    }

    override fun configure(http: HttpSecurity) {

      http.csrf().disable()
        http.authorizeRequests().antMatchers("/", "/adminLogin", "/userLogin", "/login", "/logout").permitAll()
        http.authorizeRequests().antMatchers("/userInfo").access("hasAnyRole('ROLE_USER', 'ROLE_ADMIN')")
        http.authorizeRequests().antMatchers("/adminLogin/home").access("hasRole('ROLE_ADMIN')")
        http.authorizeRequests().and().exceptionHandling().accessDeniedPage("/403")
        http.authorizeRequests().and().formLogin()
            .loginProcessingUrl("/j_spring_security_check") // Submit URL
            .loginPage("/adminLogin")
            .loginPage("/userLogin") //
            .defaultSuccessUrl("/userAccountInfo") //
            .failureUrl("/loginfail") //
            .usernameParameter("username") //
            .passwordParameter("password")
            .and()
            .logout().logoutUrl("/logout").logoutSuccessUrl("/LoginPage")
    }
}