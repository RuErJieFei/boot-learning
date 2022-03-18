package com.cloudclass.service.impl;

import com.cloudclass.common.RestResult;
import com.cloudclass.dto.CourseAddDTO;
import com.cloudclass.dto.CourseDTO;
import com.cloudclass.dto.CourseUpdateDTO;
import com.cloudclass.entity.TCourseEntity;
import com.cloudclass.entity.TCourseUserEntity;
import com.cloudclass.entity.TUserEntity;
import com.cloudclass.repository.CourseRepository;
import com.cloudclass.repository.CourseUserRepository;
import com.cloudclass.repository.UserRepository;
import com.cloudclass.vo.CourseVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author yy
 * @date 2022/3/18 13:40
 */
@Service
public class CourseServiceImpl implements com.cloudclass.service.CourseService {
    @Resource
    private CourseRepository courseRepository;

    @Resource
    private CourseUserRepository courseUserRepository;

    @Resource
    private UserRepository userRepository;

    @Override
    public RestResult<List<CourseVO>> getList(CourseDTO courseDTO) {
        ArrayList<CourseVO> courseVOArrayList = new ArrayList<>();

        Sort sort = Sort.by(Sort.Direction.DESC, "displayOrder");
        Pageable pageable = PageRequest.of(courseDTO.getPage(), courseDTO.getSize(), sort);
        Page<TCourseEntity> all = courseRepository.findAll(pageable);

        all.getContent().forEach(e -> {
            TUserEntity user = userRepository.findById(e.getCreateUserId()).get();
            courseVOArrayList.add(CourseVO.builder().course(e).creater(user).build());
        });

        return new RestResult<>(200, "成功", courseVOArrayList);
    }

    @Override
    public RestResult add(CourseAddDTO courseAddDTO) {
        TUserEntity user = userRepository.findById(courseAddDTO.getCreater()).get();

        courseRepository.save(TCourseEntity.builder()
                .termTitle(courseAddDTO.getTermTitle())
                .title(courseAddDTO.getName())
                .publicFlag(courseAddDTO.getStatus())
                .coverUrl(courseAddDTO.getCoverUrl())
                .build());

        courseUserRepository.save(TCourseUserEntity.builder()
                .uId(courseAddDTO.getCreater())
                .cId(user.getId())
                .createTime(new Timestamp(System.currentTimeMillis()))
                .build());
        return new RestResult<>(200, "成功", null);
    }

    @Override
    public RestResult update(CourseUpdateDTO courseUpdateDTO) {
        TCourseEntity tCourseEntity = null;
        Optional<TCourseEntity> courseEntity = courseRepository.findById(courseUpdateDTO.getId());
        if (courseEntity.isPresent()) {
            tCourseEntity = courseEntity.get();
            tCourseEntity.setTermTitle(courseUpdateDTO.getTermTitle());
            tCourseEntity.setTitle(courseUpdateDTO.getName());
            tCourseEntity.setPublicFlag(courseUpdateDTO.getStatus());
            tCourseEntity.setCoverUrl(courseUpdateDTO.getCoverUrl());
            return new RestResult<>(200, "成功", courseRepository.saveAndFlush(tCourseEntity));
        }
        return new RestResult<>(400, "网络错误", null);
    }

    @Override
    public RestResult delete(Integer id) {
        Optional<TCourseEntity> courseEntity = courseRepository.findById(id);
        if (courseEntity.isPresent()) {
            courseRepository.delete(courseEntity.get());
            return new RestResult(200, "成功", null);
        }
        return new RestResult<>(400, "网络错误", null);
    }
}
