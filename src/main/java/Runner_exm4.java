import by.itclass.components.services.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner_exm4 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("by.itclass.components");

        Service service = context.getBean(Service.class);
        System.out.println(service);
    }
}
