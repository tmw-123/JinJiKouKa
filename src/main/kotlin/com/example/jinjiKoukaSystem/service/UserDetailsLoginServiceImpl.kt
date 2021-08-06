package com.example.jinjiKoukaSystem.service

import com.example.jinjiKoukaSystem.dao.AppRoleDAO
import com.example.jinjiKoukaSystem.dao.AppUserDao
import com.example.jinjiKoukaSystem.model.AppUser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.User
import org.springframework.security.core.userdetails.UserDetails
import org.springframework.security.core.userdetails.UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException
import org.springframework.stereotype.Service

@Service
class UserDetailsLoginServiceImpl : UserDetailsService {
    @Autowired
    private val appUserDAO: AppUserDao? = null

    @Autowired
    private val appRoleDAO: AppRoleDAO? = null

    @Throws(UsernameNotFoundException::class)
    override fun loadUserByUsername(userName: String): UserDetails {
        val appUser: AppUser? = this.appUserDAO?.findUserAccount(userName)
        if (appUser == null) {
            println("User not found! $userName was not found in the database111")
            throw UsernameNotFoundException("User $userName was not found in the database")
        }
        println("Found User: $appUser")

        // [ROLE_USER, ROLE_ADMIN,..]
        val roleNames = appRoleDAO!!.getRoleNames(appUser.getUserId()!!)
        val grantList: MutableList<GrantedAuthority> = ArrayList()
        if (roleNames != null) {
            for (role in roleNames) {
                // ROLE_USER, ROLE_ADMIN,..
                val authority: GrantedAuthority = SimpleGrantedAuthority(role)
                grantList.add(authority)
            }
        }
        return User(
            appUser.getUserName(),  //
            appUser.getEncrytedPassword(), grantList
        )
    }
}