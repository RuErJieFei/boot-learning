package com.cloudclass.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author yy
 * @date 2022/3/18 13:04
 */
@Entity
@Table(name = "t_role_user", schema = "soft2176_orm", catalog = "")
public class TRoleUserEntity {
    private Integer id;
    private Integer uId;
    private Integer rId;
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
    @Column(name = "u_id")
    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    @Basic
    @Column(name = "r_id")
    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
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
        TRoleUserEntity that = (TRoleUserEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(uId, that.uId) && Objects.equals(rId, that.rId) && Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, uId, rId, createTime);
    }
}
