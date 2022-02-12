package com.ckp.learning.springbatchexample.batch.writer;

import com.ckp.learning.springbatchexample.model.User;
import com.ckp.learning.springbatchexample.repository.UserRepository;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DatabaseWriter implements ItemWriter<User> {

    private UserRepository userRepository;

    @Autowired
    DatabaseWriter(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void write(List<? extends User> users) throws Exception {
        System.out.println("saved users : " + users);
        userRepository.saveAll(users);
    }
}
