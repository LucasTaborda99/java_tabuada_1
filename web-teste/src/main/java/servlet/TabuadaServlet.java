package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		name = "TabuadaServlet",
		urlPatterns = {"/tabuada"}
)

public class TabuadaServlet extends HttpServlet {

	private static final long serialVersionUID = 2595351072673549924L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		GeraTabuada gera = new GeraTabuada();
		gera.imprimeTabuada(req, resp);	
	}
}
