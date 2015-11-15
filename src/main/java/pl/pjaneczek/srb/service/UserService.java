package pl.pjaneczek.srb.service;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pl.pjaneczek.srb.model.Users;

@Service
@Repository
public interface UserService {

    Users findByUserName(String username);

}
