package by.valery.firstProject;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    List<String> classicalMusicArray = Arrays.asList("Классика №1", "Классика №2", "Классика №3");

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
