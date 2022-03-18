package com.cloudclass.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author yy
 * @date 2022/3/18 13:04
 */
@Entity
@Table(name = "t_course", schema = "soft2176_orm", catalog = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TCourseEntity {
    private Integer id;
    private String title;
    private String des;
    private Integer createUserId;
    private String coverUrl;
    private Integer displayOrder;
    private Integer publicFlag;
    private Timestamp createTime;
    private String classNum;
    private String termTitle;
    private String clazzCourseInfoUrl;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "des")
    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    @Basic
    @Column(name = "create_user_id")
    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    @Basic
    @Column(name = "cover_url")
    public String getCoverUrl() {
        return coverUrl;
    }

    public void setCoverUrl(String coverUrl) {
        this.coverUrl = coverUrl;
    }

    @Basic
    @Column(name = "display_order")
    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    @Basic
    @Column(name = "public_flag")
    public Integer getPublicFlag() {
        return publicFlag;
    }

    public void setPublicFlag(Integer publicFlag) {
        this.publicFlag = publicFlag;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "class_num")
    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }

    @Basic
    @Column(name = "term_title")
    public String getTermTitle() {
        return termTitle;
    }

    public void setTermTitle(String termTitle) {
        this.termTitle = termTitle;
    }

    @Basic
    @Column(name = "clazz_course_info_url")
    public String getClazzCourseInfoUrl() {
        return clazzCourseInfoUrl;
    }

    public void setClazzCourseInfoUrl(String clazzCourseInfoUrl) {
        this.clazzCourseInfoUrl = clazzCourseInfoUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCourseEntity that = (TCourseEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(des, that.des) && Objects.equals(createUserId, that.createUserId) && Objects.equals(coverUrl, that.coverUrl) && Objects.equals(displayOrder, that.displayOrder) && Objects.equals(publicFlag, that.publicFlag) && Objects.equals(createTime, that.createTime) && Objects.equals(classNum, that.classNum) && Objects.equals(termTitle, that.termTitle) && Objects.equals(clazzCourseInfoUrl, that.clazzCourseInfoUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, des, createUserId, coverUrl, displayOrder, publicFlag, createTime, classNum, termTitle, clazzCourseInfoUrl);
    }
}
