package adapter_pattern.entity_classes;

import adapter_pattern.interfaces.AdvancedMediaPlayer;

public class Mp4Player implements AdvancedMediaPlayer{
    public void playVlc(String fileName) {
        //DO NOTHING
    }

    public void playMp4(String fileName) {
        System.out.println("Playing MP4 file:" + fileName);
    }
}
