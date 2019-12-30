package com.example.demo.model;

import java.io.Serializable;
import java.util.Date;

public class XcMenu implements Serializable {
    private String id;

    private String code;

    private String pId;

    private String menuName;

    private String url;

    private String isMenu;

    private Integer level;

    private Integer sort;

    private String status;

    private String icon;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public XcMenu(String id, String code, String pId, String menuName, String url, String isMenu, Integer level, Integer sort, String status, String icon, Date createTime, Date updateTime) {
        this.id = id;
        this.code = code;
        this.pId = pId;
        this.menuName = menuName;
        this.url = url;
        this.isMenu = isMenu;
        this.level = level;
        this.sort = sort;
        this.status = status;
        this.icon = icon;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public XcMenu() {
        super();
    }

    public String getId() {
        return id;
    }

    public XcMenu withId(String id) {
        this.setId(id);
        return this;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getCode() {
        return code;
    }

    public XcMenu withCode(String code) {
        this.setCode(code);
        return this;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getpId() {
        return pId;
    }

    public XcMenu withpId(String pId) {
        this.setpId(pId);
        return this;
    }

    public void setpId(String pId) {
        this.pId = pId == null ? null : pId.trim();
    }

    public String getMenuName() {
        return menuName;
    }

    public XcMenu withMenuName(String menuName) {
        this.setMenuName(menuName);
        return this;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName == null ? null : menuName.trim();
    }

    public String getUrl() {
        return url;
    }

    public XcMenu withUrl(String url) {
        this.setUrl(url);
        return this;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getIsMenu() {
        return isMenu;
    }

    public XcMenu withIsMenu(String isMenu) {
        this.setIsMenu(isMenu);
        return this;
    }

    public void setIsMenu(String isMenu) {
        this.isMenu = isMenu == null ? null : isMenu.trim();
    }

    public Integer getLevel() {
        return level;
    }

    public XcMenu withLevel(Integer level) {
        this.setLevel(level);
        return this;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getSort() {
        return sort;
    }

    public XcMenu withSort(Integer sort) {
        this.setSort(sort);
        return this;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getStatus() {
        return status;
    }

    public XcMenu withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getIcon() {
        return icon;
    }

    public XcMenu withIcon(String icon) {
        this.setIcon(icon);
        return this;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public XcMenu withCreateTime(Date createTime) {
        this.setCreateTime(createTime);
        return this;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public XcMenu withUpdateTime(Date updateTime) {
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
        XcMenu other = (XcMenu) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getpId() == null ? other.getpId() == null : this.getpId().equals(other.getpId()))
            && (this.getMenuName() == null ? other.getMenuName() == null : this.getMenuName().equals(other.getMenuName()))
            && (this.getUrl() == null ? other.getUrl() == null : this.getUrl().equals(other.getUrl()))
            && (this.getIsMenu() == null ? other.getIsMenu() == null : this.getIsMenu().equals(other.getIsMenu()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdateTime() == null ? other.getUpdateTime() == null : this.getUpdateTime().equals(other.getUpdateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getpId() == null) ? 0 : getpId().hashCode());
        result = prime * result + ((getMenuName() == null) ? 0 : getMenuName().hashCode());
        result = prime * result + ((getUrl() == null) ? 0 : getUrl().hashCode());
        result = prime * result + ((getIsMenu() == null) ? 0 : getIsMenu().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
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
        sb.append(", code=").append(code);
        sb.append(", pId=").append(pId);
        sb.append(", menuName=").append(menuName);
        sb.append(", url=").append(url);
        sb.append(", isMenu=").append(isMenu);
        sb.append(", level=").append(level);
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", icon=").append(icon);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}