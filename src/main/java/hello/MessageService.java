package hello;

import org.springframework.stereotype.Component;

/**
 * Author: SongJiayin
 * Date: 2018/6/23 19:43
 * Description:
 */
@Component
public class MessageService {

    public MessageService() {
        super();
        System.out.println("MessageService...");
    }

    public String getMessage() {
        return "Hello World";
    }
}
