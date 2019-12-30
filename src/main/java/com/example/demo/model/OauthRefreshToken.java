package com.example.demo.model;

import java.io.Serializable;
import java.util.Arrays;

public class OauthRefreshToken implements Serializable {
    private String tokenId;

    private byte[] token;

    private byte[] authentication;

    private static final long serialVersionUID = 1L;

    public OauthRefreshToken(String tokenId) {
        this.tokenId = tokenId;
    }

    public OauthRefreshToken(String tokenId, byte[] token, byte[] authentication) {
        this.tokenId = tokenId;
        this.token = token;
        this.authentication = authentication;
    }

    public OauthRefreshToken() {
        super();
    }

    public String getTokenId() {
        return tokenId;
    }

    public OauthRefreshToken withTokenId(String tokenId) {
        this.setTokenId(tokenId);
        return this;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId == null ? null : tokenId.trim();
    }

    public byte[] getToken() {
        return token;
    }

    public OauthRefreshToken withToken(byte[] token) {
        this.setToken(token);
        return this;
    }

    public void setToken(byte[] token) {
        this.token = token;
    }

    public byte[] getAuthentication() {
        return authentication;
    }

    public OauthRefreshToken withAuthentication(byte[] authentication) {
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
        OauthRefreshToken other = (OauthRefreshToken) that;
        return (this.getTokenId() == null ? other.getTokenId() == null : this.getTokenId().equals(other.getTokenId()))
            && (Arrays.equals(this.getToken(), other.getToken()))
            && (Arrays.equals(this.getAuthentication(), other.getAuthentication()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getTokenId() == null) ? 0 : getTokenId().hashCode());
        result = prime * result + (Arrays.hashCode(getToken()));
        result = prime * result + (Arrays.hashCode(getAuthentication()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", tokenId=").append(tokenId);
        sb.append(", token=").append(token);
        sb.append(", authentication=").append(authentication);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}