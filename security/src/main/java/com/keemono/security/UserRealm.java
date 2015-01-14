package com.keemono.security;

import com.keemono.dao.entities.users.User;
import com.keemono.dao.repositories.users.UsersRepository;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import javax.annotation.Resource;

/**
 * Created by edu on 12/01/2015.
 */
public class UserRealm extends AuthorizingRealm {

    @Resource
    private UsersRepository usersRepository;

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
        final User user = new User();

        user.setUsername(username);
        user.setPassword(password);

        final User userForLogin = usersRepository.findByUser(user);
        if(userForLogin == null){
            throw new AuthenticationException("not exists");
        }

        AuthenticationInfo oAccount =
                new SimpleAuthenticationInfo( userForLogin,
                        ByteSource.Util.bytes(userForLogin.getPassword()), "usernamePasswordRealm");
        return oAccount;
    }
}

