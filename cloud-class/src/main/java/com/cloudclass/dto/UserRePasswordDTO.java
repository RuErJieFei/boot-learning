package com.cloudclass.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yy
 * @date 2022/3/18 15:04
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRePasswordDTO {
    private String account;
    private String code;
    private String password;
    private String rePassword;
}
