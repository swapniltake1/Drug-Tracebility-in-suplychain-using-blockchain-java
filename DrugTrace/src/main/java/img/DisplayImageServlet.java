package img;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayImageServlet
 */
@WebServlet("/DisplayImageServlet")
public class DisplayImageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayImageServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		System.out.println("In do post method of Add Image servlet.");
		String imageId=request.getParameter("imageId");
		int id=Integer.parseInt(imageId);
		
		Connection con=null;
		int imgId=0;
		String imgFileName=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/imagetutorial","root","root");
			Statement stmt;
			String sql="select * from image";
			stmt=con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next())
			{
				if(rs.getInt("imageId")==id)
				{
					imgId=rs.getInt("imageId");
					imgFileName=rs.getString("imageFileName");
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		RequestDispatcher rd;
		request.setAttribute("id", String.valueOf(imgId));
		request.setAttribute("img", imgFileName);
		rd=request.getRequestDispatcher("DisplayImage.jsp");
		rd.forward(request, response);
	
	}

}
