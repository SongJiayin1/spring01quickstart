package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author: SongJiayin
 * Date: 2018/6/23 19:46
 * Description:
 */
@ComponentScan
public class ApplicationSpring {

    public static void main(String[] args) {
        System.out.println("applicationSpring");
//        MessagePrinter printer = new MessagePrinter();
//        MessageService service = new MessageService();
//        printer.setService(service);
//        printer.printMessage();
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationSpring.class);
    }
}
