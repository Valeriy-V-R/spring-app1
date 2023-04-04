package by.valery.firstProject;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("by.valery.firstProject")
@PropertySource("musicPlayer.properties")
public class SpringConfig {
}
