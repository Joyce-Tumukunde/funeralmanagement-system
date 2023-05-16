package com.mycompany;

import com.mycompany.user.UserRepository;
import com.mycompany.user.user;
import org.apache.catalina.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

import static org.apache.catalina.User.*;
import static org.assertj.core.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(false)
public class UserRepositoryTest {
    @Autowired
    private UserRepository repo;

    @Test
    public void testAddNew() {
        Integer userId = 1;
        User user = new User();
        user.setemail("joyce@gmail.com");
        user.setPassword("1234");
        user.setFullName("joyce");
        user.setFullName("tumukunde");

        User savedUser = repo.save(user);

        assertThat(savedUser).isNotNull();

        @Test
        public void testListAll () {
            Iterable<User> =repo.findAll();
            assertThat(user).hasSizeGreaterThan(0);

            User[] users;
            for (User user : users) {
                System.out.println(user);
            }


        }
        @Test
        public void testUpdate () {
            Integer UserId = 1;
            Optional<com.mycompany.user.user> optionalUser = repo.findById(userId);
            User user = optionalUser.get();
            User.setPassword("hello2000");
            repo.save(user);

            user UpdatedUser = repo.findById(UserId).get();
            Assertions.assertThat(UpdatedUser.getPassword()).isEqualTo("hello2000");


        }


            Integer UserId = 2;
            Optional<com.mycompany.user.user> optionalUser = repo.findById(userId);
            Assertions.assertThat(optionalUser.isPresent());
            System.out.println(optionalUser.get());
        }
        @Test
        public void testDelete () {
            Integer userId = 2;
            repo.deleteById(userId);

            Optional<user> optionalUser = repo.findById(userId);
            Assertions.assertThat(optionalUser).isPresent();

        }
    }
