package ch07_3_abstract_class;

public class HttpServletExample {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}
}
