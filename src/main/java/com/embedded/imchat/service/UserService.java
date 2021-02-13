package com.embedded.imchat.service;

import com.embedded.imchat.entity.User;
import com.embedded.imchat.vo.MessageContactVO;

import java.util.List;

public interface UserService {

    User login(String email, String password);

    List<User> getAllUsersExcept(long exceptUid);

    List<User> getAllUsersExcept(User exceptUser);

    MessageContactVO getContacts(User ownerUser);
}
