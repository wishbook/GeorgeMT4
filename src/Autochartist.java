import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Autochartist {

	public static void main(String[] args) throws Exception {
		// 从 URL 直接加载 HTML 文档
		Document doc = Jsoup.connect("http://tradertoolkit.efxnow.com/index.html").get();
//		 String title = doc.title();
		System.out.println(doc);

//		Document doc = Jsoup.connect("https://tradertoolkit.efxnow.com").data("query", "Java") // 请求参数
//				.userAgent("I ’ m jsoup") // 设置 User-Agent
//				.cookie("auth", "token") // 设置 cookie
//				.timeout(3000) // 设置连接超时时间
//				.post(); // 使用 POST 方法访问 URL
//		System.out.println(doc);
	}

}
