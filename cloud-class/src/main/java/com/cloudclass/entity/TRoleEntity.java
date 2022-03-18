package com.cloudclass.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @author yy
 * @date 2022/3/18 13:04
 */
@Entity
@Table(name = "t_role", schema = "soft2176_orm", catalog = "")
public class TRoleEntity {
    private Integer id;
    private String desc;
    private Integer type;
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
    @Column(name = "desc")
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Basic
    @Column(name = "type")
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
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
        TRoleEntity that = (TRoleEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(desc, that.desc) && Objects.equals(type, that.type) && Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, desc, type, createTime);
    }
}
