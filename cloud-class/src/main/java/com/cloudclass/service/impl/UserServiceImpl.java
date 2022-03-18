package com.cloudclass.service.impl;

import com.cloudclass.common.RestResult;
import com.cloudclass.dto.UserDTO;
import com.cloudclass.dto.UserRePasswordDTO;
import com.cloudclass.entity.TUserEntity;
import com.cloudclass.repository.UserRepository;
import com.cloudclass.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

/**
 * @author yy
 * @date 2022/3/18 14:34
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public RestResult<TUserEntity> login(UserDTO userDTO) {
        TUserEntity user = userRepository.findByNickname(userDTO.getUsername());
        if (user != null) {
            if (user.getPassword().equals(userDTO.getPassword())) {
                return new RestResult<>(200, "成功", user);
            } else {
                return new RestResult<>(200, "密码错误", null);
            }
        }

        return new RestResult<>(400, "无该用户", null);
    }

    @Override
    public RestResult<TUserEntity> logout(Integer id) {
        Optional<TUserEntity> byId = userRepository.findById(id);
        return new RestResult<>(200, "成功", byId.orElse(null));
    }

    @Override
    public RestResult<TUserEntity> forget(UserRePasswordDTO userRePasswordDTO) {
        TUserEntity user = userRepository.findByNickname(userRePasswordDTO.getAccount());
        if (user != null) {
            if (userRePasswordDTO.getPassword().equals(userRePasswordDTO.getRePassword())) {
                user.setPassword(userRePasswordDTO.getRePassword());
                TUserEntity reUser = userRepository.saveAndFlush(user);
                return new RestResult<>(200, "成功", reUser);
            } else {
                return new RestResult<>(400, "两次密码不一致", null);
            }
        }
        return new RestResult<>(400, "无该用户", null);
    }
}
