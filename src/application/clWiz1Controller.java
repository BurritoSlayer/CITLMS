package application;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class clWiz1Controller
 */
@WebServlet("/clWiz1Controller")
public class clWiz1Controller extends HttpServlet {	
	public static boolean isAdvanced = false;
	public static Lesson cl = new Lesson();
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public clWiz1Controller() {
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
		
		String name = request.getParameter("name");
		cl.setName(name);
		
		String sdescription = request.getParameter("sdescription");
		String fdescription = request.getParameter("fdescription");
		request.setAttribute("UsersName", indexController.cUser.getName());
		
		String[] advanced = new String[1]; //creates a string array that will hold our advanced checkbox value
		Arrays.fill(advanced, null); //sets the value in the array to null just in case a previous iteration of the page set this array to something else
		advanced = request.getParameterValues("advbox"); //grabs the users checkbox and stores it into advanced array
		 
		/**
		 * Logic for advanced check:
		 * 
		 */
		if(advanced != null){ //if there is something in the array, i.e. the user didnt check anything
			isAdvanced = true; //then change this global boolean to true
		}
		else{
			isAdvanced = false; //otherwise change this global boolean to false
		}
		
		/**
		 * Query and Directory:
		 * 
		 */
		if((name != "") && (sdescription != "")){
			
			DBconnection db = new DBconnection();
			if(isAdvanced){
				db.query("Insert into Lesson (Name, ShortDescription, FullDescription, Advanced) Values ('" + name + "','" + sdescription + "','" + fdescription + "','1')");
			}
			else{
				db.query("Insert into Lesson (Name, ShortDescription, FullDescription, Advanced) Values ('" + name + "','" + sdescription + "','" + fdescription + "','0')");
			}
			requestDispatcher = request.getRequestDispatcher("clWiz2.jsp");
		}
		else{
			requestDispatcher = request.getRequestDispatcher("clWiz1fail.jsp");
			System.out.println("failing failing failing..");
		}
		
		requestDispatcher.forward(request, response);
	}
}
