package by.valery.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class MusicPlayer {

    private List musicList;

    public MusicPlayer(List musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {

        Random random = new Random();
        int randomIndex = random.nextInt(musicList.size());
        Music musicRandom = musicList.get(randomIndex);

        System.out.println("");

        }

    }
