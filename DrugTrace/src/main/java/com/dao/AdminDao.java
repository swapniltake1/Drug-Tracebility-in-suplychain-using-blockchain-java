package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bean.AdminBean;
import com.bean.PatientBean;
import com.connection.DBConnection;

public class AdminDao {
	Connection connection=null;
	Boolean resultStatus=Boolean.FALSE;
	PreparedStatement ps;
	ResultSet rs;
    Statement st=null;
    String sql;
    boolean flag = false;
    

	 
	 public boolean InsertAdminData(AdminBean userbean) {
		 sql = "insert into admin(name,address,email,mobileno,dob,password,status) values(?,?,?,?,?,?,?)";

			Connection con = DBConnection.getConnection();

			try {
				ps = con.prepareStatement(sql);

				ps.setString(1, userbean.getName());
				ps.setString(2, userbean.getAddress());
				ps.setString(3, userbean.getEmail());
				ps.setString(4, userbean.getMobileno());
				ps.setString(5, userbean.getDob());
				ps.setString(6, userbean.getPassword());
				ps.setString(7, userbean.getStatus());
				/*ps.setBlob(8, userbean.getImage());
				ps.setString(9, userbean.getImage_name());*/

				int index = ps.executeUpdate();

				if (index > 0) {
					flag = true;
				} else {
					flag = false;
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
			return flag;
		}



	public AdminBean CheckAdmin(String email, String password) {
		AdminBean bean=new AdminBean();
		sql = "select * from admin where email='" + email + "' and password='" + password + "' ";
		int flag = 0;
		try {
			Statement stmt = DBConnection.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			if (rs.next()) {
				flag = 1;
				bean.setId(rs.getInt(1));
				bean.setName(rs.getString(2));
				bean.setAddress(rs.getString(3));
				bean.setEmail(rs.getString(4));
				bean.setMobileno(rs.getString(5));
				bean.setDob(rs.getString(6));
				bean.setPassword(rs.getString(7));
				bean.setStatus(rs.getString(8));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		if(flag ==1)
			return bean;
		else 
			return null;
	}


}
