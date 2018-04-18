package adapter_pattern.adapter;

import adapter_pattern.adapter.MediaAdapter;
import adapter_pattern.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer{

    MediaAdapter mediaAdapter;

    public void play(String mediaType, String fileName) {
        if("mp3".equalsIgnoreCase(mediaType)){
            System.out.println("Playing MP3 file:" + fileName);
        } else if("vlc".equalsIgnoreCase(mediaType) || "mp4".equalsIgnoreCase(mediaType)){
            mediaAdapter = new MediaAdapter(mediaType);
            mediaAdapter.play(mediaType, fileName);
        } else {
            System.err.println("Playing"+ fileName + " occurs format error," + mediaType + "not supported." );
        }
    }
}
