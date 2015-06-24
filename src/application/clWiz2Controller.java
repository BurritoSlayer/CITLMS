package application;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class clWiz2Controller
 */
@WebServlet("/clWiz2Controller")
public class clWiz2Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clWiz2Controller() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher requestDispatcher = null;
		request.setAttribute("UsersName", indexController.cUser.getName());
		String enhancements = request.getParameter("enhancements");
		String extns = request.getParameter("extns");
		String deets = request.getParameter("deets");
		String mats = request.getParameter("mats");
		
		DBconnection db = new DBconnection();
		System.out.println("current lessons name is: " + clWiz1Controller.cl.getName());
		db.query("Update Lesson set Enhancements='" + enhancements + "', Extensions='" + extns + "', Details='" + deets + "',  Materials='" + mats + "' where Name like '" + clWiz1Controller.cl.getName() + "'");
		
		ResultSet rs = null;
		
		DBConn dbc = new DBConn();
		try {
			rs = dbc.query("Select * from Lesson");
			
		} catch (SQLException e) {
			System.out.println("DBConn error..?");
		}
		
		try {
			System.out.println(rs.getNString(0));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		requestDispatcher = request.getRequestDispatcher("clWiz3.jsp");
		requestDispatcher.forward(request, response);
	}

}
