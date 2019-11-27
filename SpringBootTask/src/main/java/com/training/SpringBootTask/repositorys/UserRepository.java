package com.training.SpringBootTask.repositorys;

import com.training.SpringBootTask.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Component
public interface UserRepository extends MongoRepository<User, String> {
    List<User> findUserByLogin(String login);
    Optional<User> findUserById(String id);

}
