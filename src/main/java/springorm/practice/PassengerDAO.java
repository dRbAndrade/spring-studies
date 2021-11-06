package springorm.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import springjdbc.DAO;

import java.util.List;

@Component
public class PassengerDAO implements DAO<Passenger> {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int create(Passenger passenger) {
        return (int) hibernateTemplate.save(passenger);
    }

    @Override
    @Transactional
    public void update(Passenger passenger) {
        hibernateTemplate.update(passenger);
    }

    @Override
    @Transactional
    public void delete(Passenger passenger) {
        hibernateTemplate.delete(passenger);
    }

    @Override
    @Transactional
    public Passenger select(int id) {
        return hibernateTemplate.get(Passenger.class,id);
    }

    @Override
    @Transactional
    public List<Passenger> selectAll() {
        return hibernateTemplate.loadAll(Passenger.class);
    }
}
