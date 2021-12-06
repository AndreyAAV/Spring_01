import by.itclass.Dog;
import by.itclass.Person2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner_exm1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        //Получение Java объекта из bean-a
        Dog dog = (Dog) context.getBean("dog1");
        System.out.println(dog);

        dog = (Dog) context.getBean("dog2");
        System.out.println(dog);

        Person2 person2 = (Person2) context.getBean("person2");
        System.out.println(person2);

        //Class.forName("jash")->Class.get

    }
}
