import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by CoT on 10/12/17.
 */
public class Main {
    public static void main(String[] args){

        AnnotationConfigApplicationContext configApplicationContext = new AnnotationConfigApplicationContext();

        configApplicationContext.register(AppConfig.class);

        configApplicationContext.refresh();

        HelloManager helloManager = configApplicationContext.getBean(HelloManager.class);

        helloManager.greet();

    }
}
