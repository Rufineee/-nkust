import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class spider {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int page = i * 25;
            Document document = Jsoup.connect("https://movies.yahoo.com.tw/movie_intheaters.html"+ page).get();
            Elements items = document.getElementsByClass("item");
            for (Element item : items) {
                String num = item.getElementsByTag("em").get(0).text();
                String title = item.getElementsByClass("hd").get(0).getElementsByTag("span").get(0).text();
            }
        }
    }
}
