package ch07_3_abstract_class;

public class FileDownloadServlet extends HttpServlet {

	@Override
	public void service() {
		System.out.println("파일다운로드합니다.");
	}
}
