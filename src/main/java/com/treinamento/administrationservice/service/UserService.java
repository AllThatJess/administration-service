package com.treinamento.administrationservice.service;

import com.treinamento.administrationservice.entity.User;
import com.treinamento.administrationservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository repo;

    public List<User> findAll(){

        return this.repo.findAll();
    }

    public User findById(Integer id) throws Exception{

        Optional<User> userExisted = this.repo.findById(id);

        if (userExisted.isPresent()) {
            return userExisted.get();
        }else {
            throw new Exception("User not found: " + id);
        }
    }
}
