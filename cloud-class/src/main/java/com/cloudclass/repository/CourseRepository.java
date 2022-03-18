package com.cloudclass.repository;

import com.cloudclass.entity.TCourseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author yy
 * @date 2022/3/18 13:08
 */
@Repository
public interface CourseRepository extends JpaRepository<TCourseEntity, Integer> {

}
