package by.valery.firstProject;

import org.springframework.stereotype.Component;

@Component
public class PopMusic implements Music{
    @Override
    public String getSong() {
        return "Потому что есть Алёшка у тебя :)";
    }
}
