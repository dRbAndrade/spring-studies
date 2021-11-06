package springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import springjdbc.DAO;

import java.util.List;

public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springorm/config.xml");
        DAO<Product> dao = (DAO<Product>) context.getBean("dao");
        Product p = new Product(1,"Ryzen 5","High-end processor", 3000.00);
//        dao.create(p);
//        dao.update(p);
//        dao.delete(p);
        Product p1 = dao.select(3);
        System.out.println(p1);
        List<Product> productList = dao.selectAll();
        System.out.println(productList);
    }

}
