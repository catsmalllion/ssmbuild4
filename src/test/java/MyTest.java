import com.tang.pojo.Books;
import com.tang.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author GodLike
 * @create 2020-03-20-10:57
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceImpl = (BookService) context.getBean("BookServiceImpl");

        for (Books e :
                bookServiceImpl.queryAllBook()) {
            System.out.println(e);
        }
    }
}
