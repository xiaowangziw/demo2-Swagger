package com.example.demo.model;

import java.io.Serializable;

public class XcCompany implements Serializable {
    private String id;

    private String linkname;

    private String name;

    private String mobile;

    private String email;

    private String intro;

    private String logo;

    private String identitypic;

    private String worktype;

    private String businesspic;

    private String status;

    private static final long serialVersionUID = 1L;

    public XcCompany(String id, String linkname, String name, String mobile, String email, String intro, String logo, String identitypic, String worktype, String businesspic, String status) {
        this.id = id;
        this.linkname = linkname;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.intro = intro;
        this.logo = logo;
        this.identitypic = identitypic;
        this.worktype = worktype;
        this.businesspic = businesspic;
        this.status = status;
    }

    public XcCompany() {
        super();
    }

    public String getId() {
        return id;
    }

    public XcCompany withId(String id) {
        this.setId(id);
        return this;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getLinkname() {
        return linkname;
    }

    public XcCompany withLinkname(String linkname) {
        this.setLinkname(linkname);
        return this;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname == null ? null : linkname.trim();
    }

    public String getName() {
        return name;
    }

    public XcCompany withName(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public XcCompany withMobile(String mobile) {
        this.setMobile(mobile);
        return this;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getEmail() {
        return email;
    }

    public XcCompany withEmail(String email) {
        this.setEmail(email);
        return this;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIntro() {
        return intro;
    }

    public XcCompany withIntro(String intro) {
        this.setIntro(intro);
        return this;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getLogo() {
        return logo;
    }

    public XcCompany withLogo(String logo) {
        this.setLogo(logo);
        return this;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getIdentitypic() {
        return identitypic;
    }

    public XcCompany withIdentitypic(String identitypic) {
        this.setIdentitypic(identitypic);
        return this;
    }

    public void setIdentitypic(String identitypic) {
        this.identitypic = identitypic == null ? null : identitypic.trim();
    }

    public String getWorktype() {
        return worktype;
    }

    public XcCompany withWorktype(String worktype) {
        this.setWorktype(worktype);
        return this;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype == null ? null : worktype.trim();
    }

    public String getBusinesspic() {
        return businesspic;
    }

    public XcCompany withBusinesspic(String businesspic) {
        this.setBusinesspic(businesspic);
        return this;
    }

    public void setBusinesspic(String businesspic) {
        this.businesspic = businesspic == null ? null : businesspic.trim();
    }

    public String getStatus() {
        return status;
    }

    public XcCompany withStatus(String status) {
        this.setStatus(status);
        return this;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
        XcCompany other = (XcCompany) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getLinkname() == null ? other.getLinkname() == null : this.getLinkname().equals(other.getLinkname()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getMobile() == null ? other.getMobile() == null : this.getMobile().equals(other.getMobile()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getIntro() == null ? other.getIntro() == null : this.getIntro().equals(other.getIntro()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getIdentitypic() == null ? other.getIdentitypic() == null : this.getIdentitypic().equals(other.getIdentitypic()))
            && (this.getWorktype() == null ? other.getWorktype() == null : this.getWorktype().equals(other.getWorktype()))
            && (this.getBusinesspic() == null ? other.getBusinesspic() == null : this.getBusinesspic().equals(other.getBusinesspic()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getLinkname() == null) ? 0 : getLinkname().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getMobile() == null) ? 0 : getMobile().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getIntro() == null) ? 0 : getIntro().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getIdentitypic() == null) ? 0 : getIdentitypic().hashCode());
        result = prime * result + ((getWorktype() == null) ? 0 : getWorktype().hashCode());
        result = prime * result + ((getBusinesspic() == null) ? 0 : getBusinesspic().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", linkname=").append(linkname);
        sb.append(", name=").append(name);
        sb.append(", mobile=").append(mobile);
        sb.append(", email=").append(email);
        sb.append(", intro=").append(intro);
        sb.append(", logo=").append(logo);
        sb.append(", identitypic=").append(identitypic);
        sb.append(", worktype=").append(worktype);
        sb.append(", businesspic=").append(businesspic);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}