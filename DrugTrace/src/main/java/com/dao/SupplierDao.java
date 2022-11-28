package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.bean.SupplierBean;
import com.bean.PatientBean;
import com.connection.DBConnection;

public class SupplierDao {
	
	Connection connection=null;
	Boolean resultStatus=Boolean.FALSE;
	PreparedStatement ps;
	ResultSet rs;
    Statement st=null;
    String sql;
    boolean flag = false;
    

	 
	 



	public boolean InsertRawMaterial(SupplierBean b) {
		sql = "insert into supplier_rawmaterial(suppliername,materialname,quantity,date,payment,quality,status) values(?,?,?,?,?,?,?)";

		Connection con = DBConnection.getConnection();

		try {
			ps = con.prepareStatement(sql);

			ps.setString(1, b.getSuppliername());
			ps.setString(2, b.getMaterialname());
			ps.setString(3, b.getQuantity());
			ps.setString(4, b.getDate());
			ps.setString(5, b.getPayment());
			ps.setString(6, b.getQuality());
			ps.setString(7, b.getStatus());
			

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







	public boolean SendboxSupplier(SupplierBean b) {
		sql = "insert into suppliermailsent(to,subject,message,status) values(?,?,?,?)";

		Connection con = DBConnection.getConnection();

		try {
			ps = con.prepareStatement(sql);

			ps.setString(1, b.getTo());
			ps.setString(2, b.getSubject());
			ps.setString(3, b.getMessage());			
			ps.setString(4, b.getStatus());
			

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

}
