package hello;

import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage() {
        System.out.println(this.service.getMessage());
    }
}
