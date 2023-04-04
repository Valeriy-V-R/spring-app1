package by.valery.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;


public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private Music music1;
    private Music music2;

    public MusicPlayer(Music music1, Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic() {

        System.out.println(name);
        System.out.println(volume);
        System.out.println("Playing: " + music1.getSong() + ", " + music2.getSong());

    }
}
