package com.example.demo.model;

import java.io.Serializable;
import java.util.Arrays;

public class OauthCode implements Serializable {
    private String code;

    private byte[] authentication;

    private static final long serialVersionUID = 1L;

    public OauthCode(String code) {
        this.code = code;
    }

    public OauthCode(String code, byte[] authentication) {
        this.code = code;
        this.authentication = authentication;
    }

    public OauthCode() {
        super();
    }

    public String getCode() {
        return code;
    }

    public OauthCode withCode(String code) {
        this.setCode(code);
        return this;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public byte[] getAuthentication() {
        return authentication;
    }

    public OauthCode withAuthentication(byte[] authentication) {
        this.setAuthentication(authentication);
        return this;
    }

    public void setAuthentication(byte[] authentication) {
        this.authentication = authentication;
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
        OauthCode other = (OauthCode) that;
        return (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (Arrays.equals(this.getAuthentication(), other.getAuthentication()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + (Arrays.hashCode(getAuthentication()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", authentication=").append(authentication);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}