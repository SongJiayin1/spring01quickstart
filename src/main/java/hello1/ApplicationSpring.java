package hello1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: SongJiayin
 * Date: 2018/6/23 19:46
 * Description:
 */
public class ApplicationSpring {

    public static void main(String[] args) {
        System.out.println("applicationSpring");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        MessagePrinter printer = context.getBean(MessagePrinter.class);

        System.out.println(printer);
        //System.out.println(service);
        printer.printMessage();
    }

}
