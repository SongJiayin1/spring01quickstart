package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Author: SongJiayin
 * Date: 2018/6/25 16:46
 * Description:
 */
@Component
public class CDPlayer {

    private CompactDisc cd;

    public CDPlayer() {
        super();
        System.out.println("CDPlayer的无参构造函数");
    }
    @Autowired
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
        System.out.println("CDPlayer的有参构造函数");
    }

    public void play() {
        cd.play();
    }
}
