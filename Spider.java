import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class Spider {
    public static void main(String[] args) {
        try {
            Document doc = Jsoup.connect("https://movies.yahoo.com.tw/movie_intheaters.html").get();
            System.out.println("doc.title()");
            String name = doc.select("#content_l > div.release_box > ul > li:nth-child(1) > div.release_info > div.release_info_text > div.release_movie_name > a").text();
            System.out.println(name);
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
