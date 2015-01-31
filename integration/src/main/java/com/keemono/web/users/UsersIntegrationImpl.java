package com.keemono.web.users;

import com.keemono.common.bean.entities.user.UserVO;
import com.keemono.common.exceptions.ServiceErrors;
import com.keemono.service.users.UsersServiceI;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by edu on 15/01/2015.
 */
@RestController
public class UsersIntegrationImpl implements UsersIntegrationI{

    @Autowired
    UsersServiceI usersServiceI;

    @RequestMapping(value = "/login", method = RequestMethod.POST, produces = "application/json")
    @Override
    public UserVO login(@RequestBody UserVO userVO) throws ServiceErrors {

        Subject currentUser = SecurityUtils.getSubject();
        UsernamePasswordToken token =
                new UsernamePasswordToken(userVO.getUsername(), userVO.getPassword());


        currentUser.login(token);

        return usersServiceI.login(userVO);
    }
}
