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
@Table(name = "t_course_user", schema = "soft2176_orm", catalog = "")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TCourseUserEntity {
    private Integer id;
    private Integer cId;
    private Integer uId;
    private Integer score;
    private Timestamp createTime;

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
    @Column(name = "c_id")
    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    @Basic
    @Column(name = "u_id")
    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    @Basic
    @Column(name = "score")
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TCourseUserEntity that = (TCourseUserEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(cId, that.cId) && Objects.equals(uId, that.uId) && Objects.equals(score, that.score) && Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cId, uId, score, createTime);
    }
}
