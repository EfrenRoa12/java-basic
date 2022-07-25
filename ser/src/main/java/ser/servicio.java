package ser;

import java.io.IOException;
//https://www.codejava.net/java-ee/servlet/solved-httpservlet-cannot-be-resolved-to-a-type
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class servicio extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ... codigo para una peticion GET
		System.out.println("ejecucion peticion get");
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ... codigo para una peticion POST
		System.out.println("ejecucion peticion post");
	}
}
