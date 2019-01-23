package cn.pomxl.springbootelastic;

import cn.pomxl.springbootelastic.entry.Article;
import cn.pomxl.springbootelastic.entry.Book;
import cn.pomxl.springbootelastic.repository.BookRepository;
import io.searchbox.client.JestClient;
import io.searchbox.core.Index;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.xml.ws.Action;
import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootelasticApplicationTests {

    @Autowired
    JestClient jestClient;

    @Test
    public void contextLoads() {
        Article article = new Article();
        article.setId(1);
        article.setName("zhaomengjie");
        article.setAge(12);
        Index index = new Index.Builder(article).index("pomxl").type("news").build();
        try {
            jestClient.execute(index);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Autowired
    BookRepository bookRepository;
    @Test
    public void test1() {
        Book book = new Book();
        book.setId(13);
        book.setName("zhomengjie");
        bookRepository.index(book);
    }


}
