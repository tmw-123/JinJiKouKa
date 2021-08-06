package com.example.jinjiKoukaSystem.mapper

import com.example.jinjiKoukaSystem.model.AppUser
import org.springframework.jdbc.core.RowMapper
import java.sql.ResultSet
import java.sql.SQLException

class AppUserMapper : RowMapper<AppUser> {
    @Throws(SQLException::class)
    override fun mapRow(rs: ResultSet, rowNum: Int): AppUser {
        val userId = rs.getLong("user_id")
        val userName = rs.getString("employee_cd")
        val encrytedPassword = rs.getString("password")
        return AppUser(userId, userName, encrytedPassword)
    }

    @Throws(SQLException::class)
    fun mapRowID(rs: ResultSet, rowNum: Int): AppUser {
        val userId = rs.getLong("User_Id")
        /*
		 * String userName = rs.getString("User_Name"); String encrytedPassword =
		 * rs.getString("Encryted_Password");
		 */return AppUser(userId)
    }

    companion object {
        const val BASE_SQL //
                = "Select u.user_id, u.employee_cd, u.password From password u "
        /*const val BASE_SQL1 //
                = "Select  u.user_id  From user_master u WHERE u.email = ?1 "*/
    }
}