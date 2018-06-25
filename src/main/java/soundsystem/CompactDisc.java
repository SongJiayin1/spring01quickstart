package soundsystem;

import org.springframework.stereotype.Component;

/**
 * Author: SongJiayin
 * Date: 2018/6/25 16:39
 * Description:
 */
@Component
public class CompactDisc {
    public CompactDisc() {
        super();
        System.out.println("CompactDisc无参构造函数");
    }

    public void play() {
        System.out.println("正在播放音乐");
    }
}
