package com.cloudclass.repository;

import com.cloudclass.entity.TUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<TUserEntity, Integer> {
    TUserEntity findByNickname(String nickname);
}
