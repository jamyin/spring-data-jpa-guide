package com.example.jpa.example1;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSaveUser() {
        User user = userRepository.save(User.builder().name("jackxx").email("123456@126.com").sex("man").address("shanghai").build());
        Assert.assertNotNull(user);
//        List<User> users= userRepository.findAll();
//        System.out.println(users);
//        Assert.assertNotNull(users);
//
//        UserDto userDto = userRepository.findBySex("man");
//        System.out.println(userDto);
//
//        UserOnlyName userOnlyName = userRepository.findByAddress("shanghai");
//        System.out.println(userOnlyName.getName()+"==============");

        UserDto userDtox = userRepository.findByEmail("123456@126.com");
        System.out.println(userDtox);
    }
}