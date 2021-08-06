package com.example.jinjiKoukaSystem.dao

import com.example.jinjiKoukaSystem.mapper.AppUserMapper
import com.example.jinjiKoukaSystem.model.AppUser
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.jdbc.core.support.JdbcDaoSupport
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import javax.sql.DataSource


@Repository
@Transactional
class AppUserDao : JdbcDaoSupport() {

    @Autowired
    fun AppUserDao(dataSource: DataSource?) {
        setDataSource(dataSource!!)
    }

    fun findUserAccount(userName: String): AppUser? {
        // Select .. from App_User u Where u.User_Name = ?
        val sql = AppUserMapper.BASE_SQL + " where u.employee_cd = ? "
        println(sql)
        val params = arrayOf<Any>(userName)
        val mapper = AppUserMapper()
        return try {
            jdbcTemplate!!.queryForObject(sql, params, mapper)
        } catch (e: EmptyResultDataAccessException) {
            null
        }
    }
}