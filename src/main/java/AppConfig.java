import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by CoT on 10/12/17.
 */

@Configuration
public class AppConfig {

    @Bean
    public HelloManager getHelloManager(){
        return new HelloManager();
    }
}
