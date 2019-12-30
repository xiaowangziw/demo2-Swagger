package com.example.demo.model;

import java.io.Serializable;
import java.util.Arrays;

public class OauthAccessTokenWithBLOBs extends OauthAccessToken implements Serializable {
    private byte[] token;

    private byte[] authentication;

    private static final long serialVersionUID = 1L;

    public OauthAccessTokenWithBLOBs(String authenticationId, String tokenId, String userName, String clientId, String refreshToken, byte[] token, byte[] authentication) {
        super(authenticationId, tokenId, userName, clientId, refreshToken);
        this.token = token;
        this.authentication = authentication;
    }

    public OauthAccessTokenWithBLOBs() {
        super();
    }

    public byte[] getToken() {
        return token;
    }

    public OauthAccessTokenWithBLOBs withToken(byte[] token) {
        this.setToken(token);
        return this;
    }

    public void setToken(byte[] token) {
        this.token = token;
    }

    public byte[] getAuthentication() {
        return authentication;
    }

    public OauthAccessTokenWithBLOBs withAuthentication(byte[] authentication) {
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
        OauthAccessTokenWithBLOBs other = (OauthAccessTokenWithBLOBs) that;
        return (this.getAuthenticationId() == null ? other.getAuthenticationId() == null : this.getAuthenticationId().equals(other.getAuthenticationId()))
            && (this.getTokenId() == null ? other.getTokenId() == null : this.getTokenId().equals(other.getTokenId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getRefreshToken() == null ? other.getRefreshToken() == null : this.getRefreshToken().equals(other.getRefreshToken()))
            && (Arrays.equals(this.getToken(), other.getToken()))
            && (Arrays.equals(this.getAuthentication(), other.getAuthentication()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAuthenticationId() == null) ? 0 : getAuthenticationId().hashCode());
        result = prime * result + ((getTokenId() == null) ? 0 : getTokenId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getRefreshToken() == null) ? 0 : getRefreshToken().hashCode());
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
        sb.append(", token=").append(token);
        sb.append(", authentication=").append(authentication);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}