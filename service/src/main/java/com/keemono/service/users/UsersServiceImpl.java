package com.keemono.service.users;

import com.keemono.common.bean.entities.user.UserVO;
import com.keemono.common.exceptions.ServiceErrors;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Service;

/**
 * Created by edu on 15/01/2015.
 */
@Service
public class UsersServiceImpl implements UsersServiceI {

    @Override
    public UserVO login(UserVO userVO) throws ServiceErrors {

        final Subject currentUser = SecurityUtils.getSubject();

        final UsernamePasswordToken token =
                new UsernamePasswordToken( userVO.getUsername(), userVO.getPassword());

        currentUser.login(token);

        return userVO;
    }
}
