package com.example.demo.model;

import java.io.Serializable;
import java.util.Arrays;

public class OauthClientToken implements Serializable {
    private String authenticationId;

    private String tokenId;

    private String userName;

    private String clientId;

    private byte[] token;

    private static final long serialVersionUID = 1L;

    public OauthClientToken(String authenticationId, String tokenId, String userName, String clientId) {
        this.authenticationId = authenticationId;
        this.tokenId = tokenId;
        this.userName = userName;
        this.clientId = clientId;
    }

    public OauthClientToken(String authenticationId, String tokenId, String userName, String clientId, byte[] token) {
        this.authenticationId = authenticationId;
        this.tokenId = tokenId;
        this.userName = userName;
        this.clientId = clientId;
        this.token = token;
    }

    public OauthClientToken() {
        super();
    }

    public String getAuthenticationId() {
        return authenticationId;
    }

    public OauthClientToken withAuthenticationId(String authenticationId) {
        this.setAuthenticationId(authenticationId);
        return this;
    }

    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId == null ? null : authenticationId.trim();
    }

    public String getTokenId() {
        return tokenId;
    }

    public OauthClientToken withTokenId(String tokenId) {
        this.setTokenId(tokenId);
        return this;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId == null ? null : tokenId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public OauthClientToken withUserName(String userName) {
        this.setUserName(userName);
        return this;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public OauthClientToken withClientId(String clientId) {
        this.setClientId(clientId);
        return this;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public byte[] getToken() {
        return token;
    }

    public OauthClientToken withToken(byte[] token) {
        this.setToken(token);
        return this;
    }

    public void setToken(byte[] token) {
        this.token = token;
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
        OauthClientToken other = (OauthClientToken) that;
        return (this.getAuthenticationId() == null ? other.getAuthenticationId() == null : this.getAuthenticationId().equals(other.getAuthenticationId()))
            && (this.getTokenId() == null ? other.getTokenId() == null : this.getTokenId().equals(other.getTokenId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (Arrays.equals(this.getToken(), other.getToken()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAuthenticationId() == null) ? 0 : getAuthenticationId().hashCode());
        result = prime * result + ((getTokenId() == null) ? 0 : getTokenId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + (Arrays.hashCode(getToken()));
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", authenticationId=").append(authenticationId);
        sb.append(", tokenId=").append(tokenId);
        sb.append(", userName=").append(userName);
        sb.append(", clientId=").append(clientId);
        sb.append(", token=").append(token);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}