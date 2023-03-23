package by.valery.firstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(GenreOfMusic genreOfMusic) {

        Random random = new Random();

        if (genreOfMusic == GenreOfMusic.CLASSICAL) {
            int randomIndexClassical = random.nextInt(classicalMusic.classicalMusicArray.size());
            System.out.println(classicalMusic.classicalMusicArray.get(randomIndexClassical));
        }
        else if (genreOfMusic == GenreOfMusic.ROCK) {
            int randomIndexRock = random.nextInt(classicalMusic.classicalMusicArray.size());
            System.out.println(rockMusic.rockMusicArray.get(randomIndexRock));
        }
    }
}
