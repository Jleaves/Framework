package com.leaves.framework.service.impl;

import com.leaves.framework.dao.impl.UserDao;
import com.leaves.framework.model.User;
import com.leaves.framework.service.ILoginService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by jiangq on 2015/1/5.
 */
@Service("loginService")
@Transactional
public class LoginService implements ILoginService {
    @Resource(name = "userDao")
    UserDao userDao;

    @Override
    public List<User> getUser(String code) {
        return userDao.findByCode(code);
    }
}
