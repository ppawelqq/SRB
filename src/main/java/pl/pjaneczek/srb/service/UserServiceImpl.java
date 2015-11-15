package pl.pjaneczek.srb.service;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pl.pjaneczek.srb.model.Users;

@Transactional
@Repository
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    SessionFactory sessionFactory;

    @SuppressWarnings("unchecked")
    public Users findByUserName(String username) {
        List<Users> users = new ArrayList<Users>();

        users = sessionFactory.getCurrentSession()
                .createQuery("from Users where username=?")
                .setParameter(0, username)
                .list();

        if (users.size() > 0) {
            return users.get(0);
        } else {
            return null;
        }
    }

}
