import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

		int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
        String fezAniversario = request.getParameter("fezAniversario");

        java.util.Calendar cal = java.util.Calendar.getInstance();
        int anoAtual = cal.get(java.util.Calendar.YEAR);

        int idade;
        if ("sim".equals(fezAniversario)) {
            idade = anoAtual - anoNascimento;
        } else {
            idade = anoAtual - anoNascimento - 1;
        }


        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<html><body>");
        response.getWriter().println("<h1>Idade Atual:</h1>");
        response.getWriter().println("Ano de Nascimento: " + anoNascimento + "<br>");
        response.getWriter().println("Ano Atual: " + anoAtual + "<br>");
        response.getWriter().println("Idade Atual: " + idade + " anos<br>");
        response.getWriter().println("</body></html>");
    }
}


