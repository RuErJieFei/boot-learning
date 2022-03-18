package com.cloudclass.repository;

import com.cloudclass.entity.TCourseUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yy
 * @date 2022/3/18 16:07
 */
@Repository
public interface CourseUserRepository extends JpaRepository<TCourseUserEntity, Integer> {
    List<TCourseUserEntity> findBycId(Integer id);
}
