import com.jiekeliu.pojo.Books;
import com.jiekeliu.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Auther: jiekeliu
 * @Date: 2020/11/17 0017 21:53
 * @Description:
 */
public class Mytest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookServiceImpl bookServiceImpl = (BookServiceImpl)context.getBean("BookServiceImpl");
        List<Books> books = bookServiceImpl.getBooks();
        for (Books b:books) {
            System.out.println(b);
        }


    }
}

