package com.yy.bootconfig.util;


import com.ulisesbocchio.jasyptspringboot.encryptor.DefaultLazyEncryptor;
import lombok.extern.slf4j.Slf4j;
import org.jasypt.encryption.StringEncryptor;
import org.springframework.core.env.StandardEnvironment;


@Slf4j
public class EncryptorTest {
    public static void main(String[] args) {
        System.setProperty("jasypt.encryptor.password", "encryptor");
        StringEncryptor encryptor = new DefaultLazyEncryptor(new StandardEnvironment());
        String username = encryptor.encrypt("Ssy@2021");
        String password = encryptor.encrypt("123");
        log.info("username:{}", username);
        log.info("password:{}", password);
    }
}
