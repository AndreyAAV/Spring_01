import by.itclass.beans.Dog;
import by.itclass.beans.Person2;
import by.itclass.config.AppConfig1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner_exm2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig1.class);

        Dog dog = (Dog) context.getBean("dog1");
        System.out.println(dog);

        dog = (Dog) context.getBean("dog2");
        System.out.println(dog);

        Person2 person2 = (Person2) context.getBean("person2");
        System.out.println(person2);

    }
}
