package springorm;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import springjdbc.DAO;

import java.util.List;

@Component("dao")
public class ProductDAO implements DAO<Product> {

    @Autowired
    HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int create(Product product) {
        return (int) hibernateTemplate.save(product);
    }

    @Override
    @Transactional
    public void update(Product product) {
        hibernateTemplate.update(product);
    }

    @Override
    @Transactional
    public void delete(Product product) {
        hibernateTemplate.delete(product);
    }

    @Override
    public Product select(int id) {
        return hibernateTemplate.get(Product.class, id);
    }

    @Override
    public List<Product> selectAll() {
        return hibernateTemplate.loadAll(Product.class);
    }
}
