package com.jarvis.mm.dao.Impl;

import com.jarvis.mm.dao.UserDao;
import com.jarvis.mm.model.entity.User;

/**
 * Created by jafar.rizvi on 10/09/16.
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    public UserDaoImpl() {
        super(User.class);
    }
}
