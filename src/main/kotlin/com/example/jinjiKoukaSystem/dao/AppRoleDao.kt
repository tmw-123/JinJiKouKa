package com.example.jinjiKoukaSystem.dao

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.support.JdbcDaoSupport
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import javax.sql.DataSource


@Repository
@Transactional
class AppRoleDAO @Autowired constructor(dataSource: DataSource?) : JdbcDaoSupport() {
    fun getRoleNames(userId: Long): List<String> {
        val sql = ("Select r.Role_Name " //
                + " from User_Role ur, App_Role r " //
                + " where ur.Role_Id = r.Role_Id and ur.User_Id = ? ")
        val params = arrayOf<Any>(userId)
        return jdbcTemplate!!
            .queryForList(
                sql, params,
                String::class.java
            )
    }

    init {
        setDataSource(dataSource!!)
    }
}