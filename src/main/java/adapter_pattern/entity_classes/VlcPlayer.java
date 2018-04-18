package adapter_pattern.entity_classes;

import adapter_pattern.interfaces.AdvancedMediaPlayer;

public class VlcPlayer implements AdvancedMediaPlayer{
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file:" + fileName);
    }

    public void playMp4(String fileName) {
        //do nothing.
    }
}
