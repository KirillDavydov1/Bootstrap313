package ru.kata.spring.boot_security.demo.services;

import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {


    Optional<User> findByEmail(String email);

    List<User> findAll();

    void save(User user);

    void update(User user);

    void deleteById(Long id);

}
