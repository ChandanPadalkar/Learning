package com.ckp.learning.springbatchexample.batch.processor;

import com.ckp.learning.springbatchexample.model.User;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Map;

@Component
public class Processor implements ItemProcessor<User, User> {

    private static final Map<String, String> DEPT_NAMES = Map.of(
            "001", "Technology",
            "002", "HR",
            "003", "Operations"
    );

    @Override
    public User process(User user) throws Exception {
        String departmentCode = user.getDept();
        String departmentName = DEPT_NAMES.get(departmentCode);
        user.setDept(departmentName);
        user.setTime(LocalDateTime.now());
        System.out.println(String.format("Converted from department code [%s] to department name [%s]", departmentCode, departmentName));
        return user;
    }
}
