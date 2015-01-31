package com.keemono.web.users;

import com.keemono.common.bean.entities.user.UserVO;
import com.keemono.common.exceptions.ServiceErrors;

/**
 * Created by edu on 15/01/2015.
 */
public interface UsersIntegrationI {

    public UserVO login(final UserVO userVO) throws ServiceErrors;
}
