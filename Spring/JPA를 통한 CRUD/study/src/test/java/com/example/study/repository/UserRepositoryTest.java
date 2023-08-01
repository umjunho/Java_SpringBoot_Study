package com.example.study.repository;

import com.example.study.StudyApplicationTests;
import com.example.study.model.entity.Item;
import com.example.study.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDateTime;
import java.util.Optional;

public class UserRepositoryTest extends StudyApplicationTests {

    //Dependency Injection (DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create(){
        // String sql = insert into user (%s, %s, %d) value (account,email,age);
        User user = new User();
        user.setAccount("TestUser02");
        user.setEmail("TestUser01@gmail.com");
        user.setPhoneNumber("010-1111-2222");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("testuser02");

        User newUser = userRepository.save(user);
        System.out.println("newUser :"+newUser);
    }

    @Test
    @Transactional
    public void read(){

        // select * from user where id = ?

        Optional<User> user = userRepository.findByAccount("TestUser02");

        user.ifPresent(selectUser->{

            selectUser.getOrderDetailList().stream().forEach(detail->{
                Item item = detail.getItem();
                System.out.println(item);
            });
        });
    }



    @Test
    public void update(){
        Optional<User> user = userRepository.findById(2L);

        user.ifPresent(selectUser->{
            selectUser.setAccount("PPPP");
            selectUser.setUpdatedAt(LocalDateTime.now());
            selectUser.setUpdatedBy("update method()");

            userRepository.save(selectUser);
        });
    }

    @Test
    @Transactional
//    @DeleteMapping("api/user")
    public void delete(){
        Optional<User> user = userRepository.findById(2L);

//        Assert.assertTrue(user.isPresent());

        user.ifPresent(selectUser->{
            userRepository.delete(selectUser);
        });

        Optional<User> deleteUser = userRepository.findById(2L);

//        Assert.assertFalse(deleteUser.isPresent());
        if(deleteUser.isPresent()){
            System.out.println("데이터 존재:"+deleteUser.get());
        }else{
            System.out.println("데이터 삭제 데이터 없음");
        }
    }


}
