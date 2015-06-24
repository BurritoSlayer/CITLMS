package application;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class indexController
 */
@WebServlet("/indexController")
public class indexController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String indexUserName;
	private String indexPassword;
	
    public final static CurrentUser cUser = new CurrentUser();
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public indexController() {
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
		indexUserName = request.getParameter("username");
		indexPassword = request.getParameter("password");
		
		DBconnection db = new DBconnection();
		if(indexUserName != null && indexPassword !=null){
			db.setShowData("");
			db.query("Select Name, Password From Account Where Name='" + indexUserName + "' And Password='" + indexPassword + "'");
			System.out.println("getData is " + db.getShowData());
			
			if(db.getShowData() != ""){ //make sure we found a match for the username and password in our db
				cUser.setUserName(indexUserName); //gives our current user the username they entered
				/**
				 * Grab our person ID from their account data and store it in a string called 
				 * persID, so that we can later grab info from where this points to in person
				 */
				db.setShowData("");
				db.query("Select PersonID From Account Where Name='" + indexUserName + "'");
				String persID = db.getShowData().trim(); //set our persons id to what we found it to be in the db
				System.out.println("Person's ID: " + persID);
				
				/**
				 * Look up this persons ID in the person table and use it to grab their name, 
				 * which we will set our current user's name to
				 */
				db.setShowData("");
				db.query("Select Name from Person where ID='" + persID + "'"); //ask db what this persons name is
				cUser.setName(db.getShowData().trim()); //set the current users name to our query result
				request.setAttribute("UsersName", cUser.getName());
				System.out.println("Current Users name: " + cUser.getName());
				
				/**
				 * Look up this persons ID in the person table again, and use it to grab their
				 * role this time and set it to the current user's role
				 */
				db.setShowData(""); //user name will be the name of our current user
				db.query("Select Role From Person where ID='" + persID + "'"); //ask db what this persons role is
				cUser.setRoleID(db.getShowData().trim()); //set the current users role id to our query result
				request.setAttribute("userRole", cUser.getRoleID());
				System.out.println("Current Users roleID: " + cUser.getRoleID());
				
				/**
				 * Navigate to a specific dashboard determined by the current users role
				 */
				String userRole = cUser.getRoleID(); //user role will be the role of our current user
				RequestDispatcher requestDispatcher = null;
				
				System.out.println("username is: " + indexUserName);
				
				switch (userRole){
					case "1": //student 
						requestDispatcher = request.getRequestDispatcher("Dashboard.html");
						break;
					case "2": //counselor
						requestDispatcher = request.getRequestDispatcher("CounselorDashboard.html");
						break;
					case "3": //teacher
						requestDispatcher = request.getRequestDispatcher("TeacherDashboard.jsp");
						break;
					case "4": //principal
						requestDispatcher = request.getRequestDispatcher("PrincipalDashboard.html");
						break;
					default: //guest or undefined role
						requestDispatcher = request.getRequestDispatcher("guestPage.html");
						break;
				}
				
				requestDispatcher.forward(request, response);
			}
			else //if query result set is blank
			{
				response.sendRedirect("failLogin.jsp"); //send to our fail login page
			}
		}
		else //if user didn't type in username or password
		{
			response.sendRedirect("failLogin.jsp"); //send to our fail login page
		}
	}
	
}
