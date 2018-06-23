package hello;

/**
 * Author: SongJiayin
 * Date: 2018/6/23 19:46
 * Description:
 */
public class Application {

    public static void main(String[] args) {
        System.out.println("application");
        MessagePrinter printer = new MessagePrinter();
        MessageService service = new MessageService();
        printer.setService(service);
        printer.printMessage();
    }
}
