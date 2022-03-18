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
@Table(name = "t_user", schema = "soft2176_orm", catalog = "")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class TUserEntity {
    private Integer id;
    private String ids;
    private String nickname;
    private String password;
    private String avatar;
    private Timestamp createTime;
    private String status;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Column(name = "ids")
    public String getIds() {
        return ids;
    }

    public void setIds(String ids) {
        this.ids = ids;
    }

    @Basic
    @Column(name = "nickname")
    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "avatar")
    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TUserEntity that = (TUserEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(ids, that.ids) && Objects.equals(nickname, that.nickname) && Objects.equals(password, that.password) && Objects.equals(avatar, that.avatar) && Objects.equals(createTime, that.createTime) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ids, nickname, password, avatar, createTime, status);
    }
}
