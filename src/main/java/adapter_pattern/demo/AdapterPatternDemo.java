package adapter_pattern.demo;

import adapter_pattern.adapter.AudioPlayer;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3","file1");
        audioPlayer.play("mp4","file2");
        audioPlayer.play("vlc","file3");
        audioPlayer.play("mp1","file4");
    }
}
