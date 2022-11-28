package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.Part;

import com.bean.ManufacturerBean;
import com.bean.PatientBean;
import com.connection.DBConnection;

public class ManufacturerDao {
	
	Connection connection=null;
	Boolean resultStatus=Boolean.FALSE;
	PreparedStatement ps;
	ResultSet rs;
    Statement st=null;
    String sql;
    boolean flag = false;
    
   
	

	public boolean AddCatagory(ManufacturerBean b) {
		
		    
			sql = "insert into addcategory(addcategory,status) values(?,?)";

			Connection con = DBConnection.getConnection();

			try {
				ps = con.prepareStatement(sql);
				
				
				ps.setString(1, b.getCategoryname());				
				ps.setString(2, b.getStatus());
				

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

	public boolean AddDrug(ManufacturerBean b) {
		
		sql = "insert into adddrug(image,imagename,categoryname,drugname,hashcode,drugprice,drugdesc,date,email,status,statuss) values(?,?,?,?,?,?,?,?,?,?,?)";

		Connection con = DBConnection.getConnection();

		try {
			ps = con.prepareStatement(sql);
			
			ps.setBlob(1, b.getImage());
			ps.setString(2, b.getImage_name());
			ps.setString(3, b.getCategoryname());
			ps.setString(4, b.getDrugname());
			ps.setInt(5, b.getHashcode());
			ps.setString(6, b.getDrugprice());
			ps.setString(7, b.getDrugdesc());
			ps.setString(8, b.getDate());
			ps.setString(9, b.getEmail());
			ps.setString(10, b.getStatus());
			ps.setString(11, b.getStatuss());
			

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
	
public boolean DeleteDrug(int id) {
		
		String sql="delete from adddrug where id='"+id+"'";
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

public boolean addpaymentdetails(ManufacturerBean b) {
	
	sql = "insert into payment(suppliername,rowmaterialname,accountno,amount,date,status) values(?,?,?,?,?,?)";

	Connection con = DBConnection.getConnection();

	try {
		ps = con.prepareStatement(sql);
		
		ps.setString(1, b.getSuppliername());
		ps.setString(2, b.getRowmaterialname());
		ps.setString(3, b.getAccountno());
		ps.setString(4, b.getAmount());
		ps.setString(5, b.getDate());		
		ps.setString(6, b.getStatus());
		

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



public boolean DeleteCatagory(int id) {
	String sql="delete from addcategory where id='"+id+"'";
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

public boolean UpdateDrugApprovalStatus(int id, String statuss) {
	if(statuss.equalsIgnoreCase("Approve"))
		statuss="Pending";
	else
		statuss="Approve";
	
	String sql="update adddrug set statuss=? where id=?";
	
	try {
		ps=DBConnection.getConnection().prepareStatement(sql);
		ps.setString(1, statuss);
		ps.setInt(2, id);
		
		int index=ps.executeUpdate();
		if(index>0)
		{
			flag=true;
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return flag;
}

public ResultSet SelectManu() {
	ResultSet rs= null;
	String sql ="Select * from adddrug";
	try {
		PreparedStatement pstmt = DBConnection.getConnection().prepareStatement(sql);
		rs = pstmt.executeQuery();			
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return rs;
}

public boolean CreateBatch(ManufacturerBean b) {
	
	sql = "insert into createbatch(hashcode,batchname,manufacturingdate,expirydate,price,weight,quantity,email,status,statuss) values(?,?,?,?,?,?,?,?,?,?)";

	Connection con = DBConnection.getConnection();

	try {
		ps = con.prepareStatement(sql);
		
		ps.setInt(1, b.getHashcode());
		ps.setString(2, b.getBatchname());		
		ps.setString(3, b.getManufacturingdate());
		ps.setString(4, b.getExpirydate());
		ps.setString(5, b.getPrice());
		ps.setString(6, b.getWeight());
		ps.setString(7, b.getQuantity());
		ps.setString(8, b.getEmail());		
		ps.setString(9, b.getStatus());
		ps.setString(10, b.getStatuss());
		
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



public boolean InsertManufacturerData(ManufacturerBean userbean) {
	sql = "insert into manufacturer(name,address,email,mobileno,dob,password,status) values(?,?,?,?,?,?,?)";

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

/*public boolean UpdateBatchStatus(int id, String statuss) {
	
	if(statuss.equalsIgnoreCase("Approve"))
		statuss="Pending";
	else
		statuss="Approve";
	
	String sql="update createbatch set statuss=? where id=?";
	
	try {
		ps=DBConnection.getConnection().prepareStatement(sql);
		ps.setString(1, statuss);
		ps.setInt(2, id);
		
		int index=ps.executeUpdate();
		if(index>0)
		{
			flag=true;
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return flag;
	
}*/

/*public ResultSet SelectBatch() {
	
	ResultSet rs= null;
	String sql ="Select * from createbatch";
	try {
		PreparedStatement pstmt = DBConnection.getConnection().prepareStatement(sql);
		rs = pstmt.executeQuery();			
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return rs;
}*/

public boolean SendToDistributorBatch(ManufacturerBean b) {
	sql = "insert into sendbatch(hashcode,batchname,manufacturingdate,expirydate,price,weight,quantity,email,status,statuss) values(?,?,?,?,?,?,?,?,?,?)";

	Connection con = DBConnection.getConnection();

	try {
		ps = con.prepareStatement(sql);
		
		ps.setInt(1, b.getHashcode());
		ps.setString(2, b.getBatchname());		
		ps.setString(3, b.getManufacturingdate());
		ps.setString(4, b.getExpirydate());
		ps.setString(5, b.getPrice());
		ps.setString(6, b.getWeight());
		ps.setString(7, b.getQuantity());
		ps.setString(8, b.getEmail());		
		ps.setString(9, b.getStatus());
		ps.setString(10, b.getStatuss());
		
		

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

public boolean UpdateSendBatch(int id, String status) {
	if(status.equalsIgnoreCase("Receive"))
		status="Send";
	else
		status="Receive";
	
	String sql="update createbatch set status=? where id=?";
	
	try {
		ps=DBConnection.getConnection().prepareStatement(sql);
		ps.setString(1, status);
		ps.setInt(2, id);
		
		int index=ps.executeUpdate();
		if(index>0)
		{
			flag=true;
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return flag;
}

public ResultSet SelectSendBatch() {
	ResultSet rs= null;
	String sql ="Select * from createbatch";
	try {
		PreparedStatement pstmt = DBConnection.getConnection().prepareStatement(sql);
		rs = pstmt.executeQuery();			
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return rs;
}

public boolean UpdateSendNextBatch(int id, String status) {
	if(status.equalsIgnoreCase("Receive"))
		status="Send";
	else
		status="Receive";
	
	String sql="update createbatch set status=? where id=?";
	
	try {
		ps=DBConnection.getConnection().prepareStatement(sql);
		ps.setString(1, status);
		ps.setInt(2, id);
		
		int index=ps.executeUpdate();
		if(index>0)
		{
			flag=true;
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return flag;
}

public ResultSet SelectSendNextBatch() {
	ResultSet rs= null;
	String sql ="Select * from createbatch";
	try {
		PreparedStatement pstmt = DBConnection.getConnection().prepareStatement(sql);
		rs = pstmt.executeQuery();			
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return rs;
}

public boolean UpdateSendNextPharmacy(int id, String statuss) {
	if(statuss.equalsIgnoreCase("Receive"))
		statuss="Send";
	else
		statuss="Receive";
	
	String sql="update createbatch set statuss=? where id=?";
	
	try {
		ps=DBConnection.getConnection().prepareStatement(sql);
		ps.setString(1, statuss);
		ps.setInt(2, id);
		
		int index=ps.executeUpdate();
		if(index>0)
		{
			flag=true;
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return flag;
}

public ResultSet SelectSendNextP() {
	ResultSet rs= null;
	String sql ="Select * from createbatch";
	try {
		PreparedStatement pstmt = DBConnection.getConnection().prepareStatement(sql);
		rs = pstmt.executeQuery();			
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return rs;
}

public boolean UpdateBuyMedStatus(int id, String status) {
	if(status.equalsIgnoreCase("Receive"))
		status="Send";
	else
		status="Receive";
	
	String sql="update buymed set status=? where id=?";
	
	try {
		ps=DBConnection.getConnection().prepareStatement(sql);
		ps.setString(1, status);
		ps.setInt(2, id);
		
		int index=ps.executeUpdate();
		if(index>0)
		{
			flag=true;
		}
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return flag;
}

public ResultSet SelectBuyMed() {
	ResultSet rs= null;
	String sql ="Select * from buymed";
	try {
		PreparedStatement pstmt = DBConnection.getConnection().prepareStatement(sql);
		rs = pstmt.executeQuery();			
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return rs;
}

	}

