package cn.itcast1.servlet;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ServletDemo5")
public class ServletDemo5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public ServletDemo5() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// ȡ��ServletContext�д�Ĵ���
		int count = (Integer) getServletContext().getAttribute("count");
		// ��ʾ��ҳ��
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("<h1>��վ�������� "+count+" ��!</h1>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
