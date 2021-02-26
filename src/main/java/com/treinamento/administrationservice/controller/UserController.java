package com.treinamento.administrationservice.controller;

import com.treinamento.administrationservice.entity.User;
import com.treinamento.administrationservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/users")
public class UserController {

    @Autowired
    UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll() throws Exception{

        List<User> users = this.service.findAll();
        if (users == null) {
            throw new Exception("Usuários não encontrados");
        } else {
            return new ResponseEntity<>(users, HttpStatus.OK);
        }

    }

    @GetMapping("{id}")
    public ResponseEntity<User> findById(@PathVariable("id") Integer id) throws Exception{
        return new ResponseEntity<>(this.service.findById(id), HttpStatus.OK);
    }
}
