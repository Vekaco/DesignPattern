package adapter_pattern.adapter;

import adapter_pattern.entity_classes.Mp4Player;
import adapter_pattern.entity_classes.VlcPlayer;
import adapter_pattern.interfaces.AdvancedMediaPlayer;
import adapter_pattern.interfaces.MediaPlayer;

public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String mediaType){
        if("vlc".equalsIgnoreCase(mediaType)) {
            advancedMediaPlayer = new VlcPlayer();
        }
        if("mp4".equalsIgnoreCase(mediaType)) {
            advancedMediaPlayer = new Mp4Player();
        }
    }
    public void play(String mediaType, String fileName) {
        if("vlc".equalsIgnoreCase(mediaType)){
            advancedMediaPlayer.playVlc(fileName);
        }
        if("mp4".equalsIgnoreCase(mediaType)) {
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
