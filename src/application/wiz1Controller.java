package application;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class wiz1Controller
 */
@WebServlet("/wiz1Controller")
public class wiz1Controller extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public wiz1Controller() {
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
		String name = request.getParameter("name");
		String description = request.getParameter("description");
		RequestDispatcher requestDispatcher = null;
		System.out.println("cUser's name is:" + indexController.cUser.getName());
		request.setAttribute("UsersName", indexController.cUser.getName());
		
		System.out.println("Name and description = " + name + ", " + description);
		
		if((name != "") && (description != "")) {
			DBconnection db = new DBconnection();
			db.query("Insert into LessonPlan (Name, Description) Values ('" + name  + "', '" + description + "')");
			requestDispatcher = request.getRequestDispatcher("wiz2.jsp");
		}
		else{
			requestDispatcher = request.getRequestDispatcher("wiz1fail.jsp");
			System.out.println("this should be failing");
		}
		
		requestDispatcher.forward(request, response);
	
	}

}
