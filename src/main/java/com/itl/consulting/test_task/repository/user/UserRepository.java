package com.itl.consulting.test_task.repository.user;

import com.itl.consulting.test_task.entity.user.AppUser;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserRepository extends CrudRepository<AppUser, Long> {
    Optional<AppUser> findByLogin(String login);
}
