package com.learn.services;

import com.learn.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class UserService {

    List<User> list=new ArrayList<>();

    public UserService() {
        list.add(new User("abc","abc","abc@gmail.com"));
        list.add(new User("xyz","xyz","xyz@gmail.com"));
    }

    //get all users
    public List<User> getAllUsers(){

        return this.list;
    }

    //get single user
    public User getSingleUser(String userName){
        return this.list.stream().filter((user)->user.getUserName().equals(userName)).findAny().orElse(null);
    }
    //Add new user
    public  User addUser(User user){
        this.list.add(user);
        return user;
    }
}
