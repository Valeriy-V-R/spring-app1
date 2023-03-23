package by.valery.firstProject;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class RockMusic implements Music{

    List<String> rockMusicArray = Arrays.asList("Рок №1","Рок №2", "Рок №3");

    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
