package by.valery.firstProject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class ClassicalMusic implements Music {

    @PostConstruct
    public void doMyInit(){
        System.out.println("Инициализация");
    }

    @PreDestroy
    public void doMyDestroy(){
        System.out.println("Завершение");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
