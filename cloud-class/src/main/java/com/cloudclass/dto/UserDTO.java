package com.cloudclass.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yy
 * @date 2022/3/18 14:36
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDTO {
    private String username;
    private String password;
}
