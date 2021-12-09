package by.itclass.config;

import by.itclass.beans.Dog;
import by.itclass.beans.Person2;
import by.itclass.components.dao.DAO;
import by.itclass.components.services.Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {

//    @Bean(name = "dog1")
//    public Dog getDog() {
//        return new Dog();
//    }
    //это тоже в .xml
//    <bean name="dog" class="by.itclass.beans.Dog">
//    </bean>

    @Bean(name = "dog1")
    public Dog dog1() {
        return new Dog();
    }

    @Bean(name = "dog2")
    public Dog dog2() {
        return new Dog("Barsik");
    }

    @Bean("person2")
    public Person2 person2() {
        return new Person2(dog1());
    }

    @Bean
    public DAO dao() {
        return new DAO();
    }

    @Bean
    public Service service() {
        return new Service(dao());
    }

}
