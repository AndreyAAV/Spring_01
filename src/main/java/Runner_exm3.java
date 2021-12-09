import by.itclass.components.dao.DAO;
import by.itclass.components.services.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner_exm3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DAO.class, Service.class);
        ApplicationContext context2 = new AnnotationConfigApplicationContext("by.itclass.components");

        DAO dao = (DAO) context2.getBean("DAO");
        System.out.println(dao);

        Service service = (Service) context2.getBean("service");
        System.out.println(service);
    }
}
