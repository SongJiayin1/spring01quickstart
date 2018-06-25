package hello1;

/**
 * Author: SongJiayin
 * Date: 2018/6/23 19:44
 * Description:
 */
public class MessagePrinter {

    public MessagePrinter() {
        super();
        System.out.println("MessagePrinter...");
    }

    private MessageService service;
    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
