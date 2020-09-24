package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Customer;
import service.CustomerService;

/**
 * Servlet implementation class DoRegister
 */
@WebServlet("/doRegister")
public class DoRegister extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoRegister() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id=request.getParameter("id");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String gender=request.getParameter("gender");
		String email=request.getParameter("email");
		
		// Perform business logic. Return a bean as a result
		//CustomerService service=new CustomerService(); //request가 올 때마다 객체 생성
		CustomerService service=(CustomerService) CustomerService.getInstance(); //request가 올 때마다 객체 생성되는걸 singleton으로 만들어줌
		
		service.addCustomer(new Customer(id,password,name,gender,email));
		
		Customer customer=service.findCustomer(id);
		request.setAttribute("customer", customer); //key, value 중요해요!
		
		String page="/view/registerSuccess.jsp";
		
		RequestDispatcher dispatcher=request.getRequestDispatcher(page);
		dispatcher.forward(request, response);
	}

}
