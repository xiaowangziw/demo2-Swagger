package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class XcUser implements Serializable {
    private String id;

    private String username;

    private String password;

    private String salt;

    private String name;

    private String userpic;

    private String utype;

    private Date birthday;

    private String sex;

    private String email;

    private String phone;

    private String qq;

    private String status;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public XcUser(String id, String username, String password, String salt, String name, String userpic, String utype, Date birthday, String sex, String email, String phone, String qq, String status, Date createTime, Date updateTime) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.salt = salt;
        this.name = name;
        this.userpic = userpic;
        this.utype = utype;
        this.birthday = birthday;
        this.sex = sex;
        this.email = email;
        this.phone = phone;
        this.qq = qq;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public XcUser() {
        super();
    }

    public String getId() {
        return id;
    }

    public XcUser withId(String id) {
        this.setId(id);
        return this;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUsername() {
        return username;
    }

    public XcUser withUsername(String username) {
        this.setUsername(username);
        return this;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public XcUser withPassword(String password) {
        this.setPassword(password);
        return this;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public XcUser withSalt(String salt) {
        this.setSalt(salt);
        return this;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getName() {
        return name;
    }

    public XcUser withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUserpic() {
        return userpic;
    }

    public XcUser withUserpic(String userpic) {
        this.setUserpic(userpic);
        return this;
    }

    public void setUserpic(String userpic) {
        this.userpic = userpic == null ? null : userpic.trim();
    }

    public String getUtype() {
        return utype;
    }

    public XcUser withUtype(String utype) {
        this.setUtype(utype);
        return this;
    }

    public void setUtype(String utype) {
        this.utype = utype == null ? null : utype.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public XcUser withBirthday(Date birthday) {
        this.setBirthday(birthday);
        return this;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public XcUser withSex(String sex) {
        this.setSex(sex);
        return this;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getEmail() {
        return email;
    }

    public XcUser withEmail(String email) {
        this.setEmail(email);
        return this;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public XcUser withPhone(String phone) {
        this.setPhone(phone);
        return this;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQq() {
        return qq;
    }

    public XcUser withQq(String qq) {
        this.setQq(qq);
        return this;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getStatus() {
        return status;
    }

    public XcUser withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public XcUser withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public XcUser withUpdateTime(Date updateTime) {
        this.setUpdateTime(updateTime);
        return this;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        XcUser other = (XcUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
            && (this.getPassword() == null ? other.getPassword() == null : this.getPassword().equals(other.getPassword()))
            && (this.getSalt() == null ? other.getSalt() == null : this.getSalt().equals(other.getSalt()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getUserpic() == null ? other.getUserpic() == null : this.getUserpic().equals(other.getUserpic()))
            && (this.getUtype() == null ? other.getUtype() == null : this.getUtype().equals(other.getUtype()))
            && (this.getBirthday() == null ? other.getBirthday() == null : this.getBirthday().equals(other.getBirthday()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()))
            && (this.getQq() == null ? other.getQq() == null : this.getQq().equals(other.getQq()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPassword() == null) ? 0 : getPassword().hashCode());
        result = prime * result + ((getSalt() == null) ? 0 : getSalt().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getUserpic() == null) ? 0 : getUserpic().hashCode());
        result = prime * result + ((getUtype() == null) ? 0 : getUtype().hashCode());
        result = prime * result + ((getBirthday() == null) ? 0 : getBirthday().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        result = prime * result + ((getQq() == null) ? 0 : getQq().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", name=").append(name);
        sb.append(", userpic=").append(userpic);
        sb.append(", utype=").append(utype);
        sb.append(", birthday=").append(birthday);
        sb.append(", sex=").append(sex);
        sb.append(", email=").append(email);
        sb.append(", phone=").append(phone);
        sb.append(", qq=").append(qq);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}