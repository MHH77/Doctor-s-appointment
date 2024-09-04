package com.app.Service;



import com.app.model.User;

import java.util.List;

public interface UserService {
    List<User> findAllUser();
    User findUserByEmail(String email);
}
