package sec.chat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class ChatApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(ChatApplication.class, args);
    }
}
