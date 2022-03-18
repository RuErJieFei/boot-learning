package com.cloudclass.service;

import com.cloudclass.common.RestResult;
import com.cloudclass.dto.UserDTO;
import com.cloudclass.dto.UserRePasswordDTO;
import com.cloudclass.entity.TUserEntity;

public interface UserService {

    /**
     * 登录
     *
     * @param userDTO
     * @return
     */
    RestResult<TUserEntity> login(UserDTO userDTO);

    /**
     * 退出登录
     *
     * @return
     */
    RestResult<TUserEntity> logout(Integer id);

    /**
     * 忘记密码
     *
     * @param userRePasswordDTO
     * @return
     */
    RestResult<TUserEntity> forget(UserRePasswordDTO userRePasswordDTO);
}
