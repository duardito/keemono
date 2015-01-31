package com.keemono.service.users;

import com.keemono.common.bean.entities.user.UserVO;
import com.keemono.common.exceptions.ServiceErrors;

/**
 * Created by edu on 15/01/2015.
 */
public interface UsersServiceI {

    public UserVO login(UserVO userVO) throws ServiceErrors;
}
