package hello;

import org.springframework.stereotype.Component;

/**
 * Author: SongJiayin
 * Date: 2018/6/23 19:44
 * Description:
 */
@Component
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
