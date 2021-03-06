/*
package com.plantrip.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.TestPropertySource;

import javax.transaction.Transactional;

@SpringBootTest
@Transactional //테스트 실행 후 롤백 처리위한 어노테이션
@TestPropertySource(locations = "classpath:application-test.properties")
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Autowired
    PasswordEncoder passwordEncoder;

    public User createUser(){//회원 정보 입력한 user 엔티티 만드는 메소드
        UserFormDto userFormDto = new UserFormDto();
        userFormDto.setEmail("test@email.com");
        userFormDto.setName("제갈길동");
        userFormDto.setPassword("1234");
        userFormDto.setPhone("010-1234-5678");
        return User.createUser(userFormDto, passwordEncoder);
    }

    @Test
    @DisplayName("회원 가입 테스트입니다")
    public void saveUserTest(){
        User user = createUser();
        User saveUser = userService.saveUser(user);

        assertEquals(user.getEmail(), saveUser.getEmail());
        assertEquals(user.getName(), saveUser.getName());
        assertEquals(user.getPassword(), saveUser.getPassword());
        assertEquals(user.getPhone(), saveUser.getPhone());
        assertEquals(user.getRole(), saveUser.getRole());



    }
}
*/
