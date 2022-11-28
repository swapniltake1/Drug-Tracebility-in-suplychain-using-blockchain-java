package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.Part;

import com.bean.SupplierBean;
import com.bean.ManufacturerBean;
import com.bean.PatientBean;
import com.connection.DBConnection;

public class PatientDao {
	
	Connection connection=null;
	Boolean resultStatus=Boolean.FALSE;
	PreparedStatement ps;
	ResultSet rs;
    Statement st=null;
    String sql;
    boolean flag = false;
    

	 
	 public boolean InsertSupplierData(PatientBean userbean) {
			sql = "insert into supplier(name,address,email,mobileno,dob,password,status) values(?,?,?,?,?,?,?)";

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
	 
	public boolean alreadyUser(String email) throws SQLException {
			String sql="select * from supplier where email=?";
			connection=DBConnection.getConnection();
			ps=connection.prepareStatement(sql);
			ps.setString(1, email);
			rs=ps.executeQuery();
			if(rs.next())
			{
				resultStatus=true;
			}
			return resultStatus;
		}
		
	 public PatientBean CheckUser(String email, String password) {
			
			PatientBean bean=new PatientBean();
			sql = "select * from supplier where email='" + email + "' and password='" + password + "' ";
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

	
	 
	public PatientBean CheckManufacturer(String email, String password) {
		
		PatientBean bean=new PatientBean();
		sql = "select * from manufacturer where email='" + email + "' and password='" + password + "' ";
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
	
	public boolean InsertDistributorData(PatientBean userbean) {
		sql = "insert into distributor(name,address,email,mobileno,dob,password,status) values(?,?,?,?,?,?,?)";

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

	public PatientBean CheckDistributor(String email, String password) {
		PatientBean bean=new PatientBean();
		sql = "select * from distributor where email='" + email + "' and password='" + password + "' ";
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

	public boolean InsertPharmacyData(PatientBean userbean) {
		
		sql = "insert into pharmacy(name,address,email,mobileno,dob,password,status) values(?,?,?,?,?,?,?)";

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

	public PatientBean CheckPharmacy(String email, String password) {
		PatientBean bean=new PatientBean();
		sql = "select * from pharmacy where email='" + email + "' and password='" + password + "' ";
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

	public boolean InsertPatientData(PatientBean userbean) {
		sql = "insert into patient(name,address,email,mobileno,dob,password,status) values(?,?,?,?,?,?,?)";

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
	public ResultSet viewUsers(String ID)
	{
		ResultSet rs=null;
		connection=DBConnection.getConnection();
		
		String query="select * from patient";
		
		try
		{
			Statement st=connection.createStatement();
		 rs=st.executeQuery(query);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return rs;
		
	}

 
	public boolean Deletesupplier(int id) {
		
		String sql="delete from supplier where id='"+id+"'";
		 Connection con=DBConnection.getConnection();
		 try {
			ps=con.prepareStatement(sql);
			int index =ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
			return flag;
	}
public boolean DeletePatient(int id) {
		
		String sql="delete from patient where id='"+id+"'";
		 Connection con=DBConnection.getConnection();
		 try {
			ps=con.prepareStatement(sql);
			int index =ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
			return flag;
	}

	public String extractFileName(Part part) {
		
		final String partHeader = part.getHeader("content-disposition");
	    for (String content : part.getHeader("content-disposition").split(";")) {
	        if (content.trim().startsWith("filename")) {
	            return content.substring(
	                    content.indexOf('=') + 1).trim().replace("\"", "");
	        }
	    }
		
		return null;
	}

	/*public PatientBean CheckPatient(String email, String password) {
		
		PatientBean bean=new PatientBean();
		sql = "select * from patient where email='" + email + "' and password='" + password + "' ";
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
		
	}*/

	public boolean DeleteBatch(int id) {
		String sql="delete from createbatch where id='"+id+"'";
		 Connection con=DBConnection.getConnection();
		 try {
			ps=con.prepareStatement(sql);
			int index =ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
			return flag;
	}

	public boolean InsertPatientD(PatientBean user) {
		sql = "insert into patient(name,address,email,mobileno,dob,password,status) values(?,?,?,?,?,?,?)";

		Connection con = DBConnection.getConnection();
		

		try {
			ps = con.prepareStatement(sql);	
			
			ps.setString(1, user.getName());
			ps.setString(2, user.getAddress());
			ps.setString(3, user.getEmail());
			ps.setString(4, user.getMobileno());
			ps.setString(5, user.getDob());
			ps.setString(6, user.getPassword());
			ps.setString(7, user.getStatus());
			
			

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

	public PatientBean CheckPatient(String email, String password) {
		PatientBean bean=new PatientBean();
		sql = "select * from patient where email='" + email + "' and password='" + password + "' ";
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

	public boolean InsertBuyMedicineData(PatientBean b) {
		sql = "insert into buymed(image,imagename,date,email,status,statuss) values(?,?,?,?,?,?)";

		Connection con = DBConnection.getConnection();
		

		try {
			ps = con.prepareStatement(sql);	
			
			ps.setBlob(1, b.getImage());
			ps.setString(2, b.getImage_name());
			ps.setString(3, b.getDate());
			ps.setString(4, b.getEmail());
			ps.setString(5, b.getStatus());
			ps.setString(6, b.getStatuss());
		
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

	public boolean InsertPayment(ManufacturerBean user) {
		sql = "insert into pay(name,accountno,amount,date,status) values(?,?,?,?,?)";

		Connection con = DBConnection.getConnection();
		

		try {
			ps = con.prepareStatement(sql);	
			
			ps.setString(1, user.getName());
			ps.setString(2, user.getAccountno());
			ps.setString(3, user.getAmount());
			ps.setString(4, user.getDate());
			ps.setString(5, user.getStatus());
		
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

	public boolean InsertPaymentDist(ManufacturerBean user) {
		sql = "insert into distpay(name,accountno,ifsc,amount,date,status) values(?,?,?,?,?,?)";

		Connection con = DBConnection.getConnection();
		

		try {
			ps = con.prepareStatement(sql);	
			
			ps.setString(1, user.getName());
			ps.setString(2, user.getAccountno());
			ps.setString(3, user.getIfsc());
			ps.setString(4, user.getAmount());
			ps.setString(5, user.getDate());
			ps.setString(6, user.getStatus());
		
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

	public boolean DeleteBuyMedicine(int id) {
		String sql="delete from buymed where id='"+id+"'";
		 Connection con=DBConnection.getConnection();
		 try {
			ps=con.prepareStatement(sql);
			int index =ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
			return flag;
	}

	public boolean DeletesupplierPayment(int id) {
		String sql="delete from payment where id='"+id+"'";
		 Connection con=DBConnection.getConnection();
		 try {
			ps=con.prepareStatement(sql);
			int index =ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
			return flag;
	}

	public boolean DeleteDistiPayment(int id) {
		String sql="delete from pay where id='"+id+"'";
		 Connection con=DBConnection.getConnection();
		 try {
			ps=con.prepareStatement(sql);
			int index =ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
			return flag;
	}

	public boolean DeleteDistibutorPayment(int id) {
		String sql="delete from distpay where id='"+id+"'";
		 Connection con=DBConnection.getConnection();
		 try {
			ps=con.prepareStatement(sql);
			int index =ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
			return flag;
	}

	public boolean DeleteRowMaterial(int id) {
		String sql="delete from supplier_rawmaterial where id='"+id+"'";
		 Connection con=DBConnection.getConnection();
		 try {
			ps=con.prepareStatement(sql);
			int index =ps.executeUpdate();
			if(index>0)
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		 
			return flag;
	}

	
	}

	
	
