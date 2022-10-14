package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class GeraTabuada extends HttpServlet {
	
	private static final long serialVersionUID = 2083064638859898784L;
	
	protected void imprimeTabuada(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Tabuada do 1</title>");
//        out.println("<h1 style='color:blue'>");
//        out.println("h1 {");        // note leading brace
//        out.println("color:blue;");
//        out.println("background-color:yellow;");
//        out.println("border: 1px solid black;");
//        out.println("}");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Tabuada do 1</h1>");
        out.println("<h1>1 x 1 = 1</h1>");
        out.println("<h1>1 x 2 = 2</h1>");
        out.println("<h1>1 x 3 = 3</h1>");
        out.println("<h1>1 x 4 = 4</h1>");
        out.println("<h1>1 x 5 = 5</h1>");
        out.println("<h1>1 x 6 = 6</h1>");
        out.println("<h1>1 x 7 = 7</h1>");
        out.println("<h1>1 x 8 = 8</h1>");
        out.println("<h1>1 x 9 = 9</h1>");
        out.println("<h1>1 x 10 = 10</h1>");
        out.println("</body>");
        out.println("</html>");
        out.close();
	}
}
		
