package com.example.jinjiKoukaSystem.mapper

import com.example.jinjiKoukaSystem.model.AppUser
import org.springframework.jdbc.core.RowMapper
import java.sql.ResultSet
import java.sql.SQLException

class AppUserMapper : RowMapper<AppUser> {
    @Throws(SQLException::class)
    override fun mapRow(rs: ResultSet, rowNum: Int): AppUser {
        val userId = rs.getLong("User_Id")
        val userName = rs.getString("User_Name")
        val encrytedPassword = rs.getString("Encryted_Password")
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
                = "Select u.User_Id, u.User_Name, u.Encryted_Password From App_User u "
        const val BASE_SQL1 //
                = "Select  u.User_Id  From App_User u WHERE u.email = ?1 "
    }
}