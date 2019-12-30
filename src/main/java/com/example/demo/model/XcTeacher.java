package com.example.demo.model;

import java.io.Serializable;

public class XcTeacher implements Serializable {
    private String id;

    private String userId;

    private String name;

    private String intro;

    private String resume;

    private String pic;

    private static final long serialVersionUID = 1L;

    public XcTeacher(String id, String userId, String name, String intro, String resume, String pic) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.intro = intro;
        this.resume = resume;
        this.pic = pic;
    }

    public XcTeacher() {
        super();
    }

    public String getId() {
        return id;
    }

    public XcTeacher withId(String id) {
        this.setId(id);
        return this;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public XcTeacher withUserId(String userId) {
        this.setUserId(userId);
        return this;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getName() {
        return name;
    }

    public XcTeacher withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIntro() {
        return intro;
    }

    public XcTeacher withIntro(String intro) {
        this.setIntro(intro);
        return this;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getResume() {
        return resume;
    }

    public XcTeacher withResume(String resume) {
        this.setResume(resume);
        return this;
    }

    public void setResume(String resume) {
        this.resume = resume == null ? null : resume.trim();
    }

    public String getPic() {
        return pic;
    }

    public XcTeacher withPic(String pic) {
        this.setPic(pic);
        return this;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
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
        XcTeacher other = (XcTeacher) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()))
            && (this.getResume() == null ? other.getResume() == null : this.getResume().equals(other.getResume()))
            && (this.getPic() == null ? other.getPic() == null : this.getPic().equals(other.getPic()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        result = prime * result + ((getResume() == null) ? 0 : getResume().hashCode());
        result = prime * result + ((getPic() == null) ? 0 : getPic().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", name=").append(name);
        sb.append(", intro=").append(intro);
        sb.append(", resume=").append(resume);
        sb.append(", pic=").append(pic);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}