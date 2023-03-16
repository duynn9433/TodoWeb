package com.duynn.todoweb.service;

import com.duynn.todoweb.entity.User;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class UserService {
    private static List<User> listUser = new ArrayList<>();
    private static long count =0;
    static{
        listUser.add(new User(++count, "duynn", LocalDate.now()));
        listUser.add(new User(++count, "duynn1", LocalDate.now()));
        listUser.add(new User(++count, "duynn2", LocalDate.now()));
    }

    public List<User> findAll() {
        return listUser;
    }

    public User findUserById(Long id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return listUser.stream().filter(predicate).findFirst().orElse(null);
    }

    public User save(User user) {
        user.setId(++count);
        listUser.add(user);
        return user;
    }

    public void delete(Long id) {
        Predicate<? super User> predicate= user -> user.getId().equals(id);
        listUser.removeIf(predicate);
    }
}
