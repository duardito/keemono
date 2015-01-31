package com.keemono.security;

import com.keemono.common.bean.entities.user.UserVO;
import com.keemono.common.exceptions.ServiceErrors;
import com.keemono.service.users.UsersServiceI;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by edu on 12/01/2015.
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UsersServiceI usersServiceI;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        final String username =
                ((UsernamePasswordToken) token).getUsername();

        final String password =
                new String(((UsernamePasswordToken) token).getPassword());
        UserVO user = new UserVO();

        user.setUsername(username);
        user.setPassword(password);

        try {
            user = usersServiceI.login(user);
            if(user == null){
                throw new AuthenticationException("not exists");
            }
        } catch (ServiceErrors serviceErrors) {
            serviceErrors.printStackTrace();
        }

        AuthenticationInfo oAccount =
                new SimpleAuthenticationInfo( user,
                        ByteSource.Util.bytes(user.getPassword()), "usernamePasswordRealm");
        return oAccount;
    }
}

