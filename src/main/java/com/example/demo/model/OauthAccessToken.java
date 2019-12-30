package com.example.demo.model;

import java.io.Serializable;

public class OauthAccessToken implements Serializable {
    private String authenticationId;

    private String tokenId;

    private String userName;

    private String clientId;

    private String refreshToken;

    private static final long serialVersionUID = 1L;

    public OauthAccessToken(String authenticationId, String tokenId, String userName, String clientId, String refreshToken) {
        this.authenticationId = authenticationId;
        this.tokenId = tokenId;
        this.userName = userName;
        this.clientId = clientId;
        this.refreshToken = refreshToken;
    }

    public OauthAccessToken() {
        super();
    }

    public String getAuthenticationId() {
        return authenticationId;
    }

    public OauthAccessToken withAuthenticationId(String authenticationId) {
        this.setAuthenticationId(authenticationId);
        return this;
    }

    public void setAuthenticationId(String authenticationId) {
        this.authenticationId = authenticationId == null ? null : authenticationId.trim();
    }

    public String getTokenId() {
        return tokenId;
    }

    public OauthAccessToken withTokenId(String tokenId) {
        this.setTokenId(tokenId);
        return this;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId == null ? null : tokenId.trim();
    }

    public String getUserName() {
        return userName;
    }

    public OauthAccessToken withUserName(String userName) {
        this.setUserName(userName);
        return this;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public OauthAccessToken withClientId(String clientId) {
        this.setClientId(clientId);
        return this;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public OauthAccessToken withRefreshToken(String refreshToken) {
        this.setRefreshToken(refreshToken);
        return this;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken == null ? null : refreshToken.trim();
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
        OauthAccessToken other = (OauthAccessToken) that;
        return (this.getAuthenticationId() == null ? other.getAuthenticationId() == null : this.getAuthenticationId().equals(other.getAuthenticationId()))
            && (this.getTokenId() == null ? other.getTokenId() == null : this.getTokenId().equals(other.getTokenId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getRefreshToken() == null ? other.getRefreshToken() == null : this.getRefreshToken().equals(other.getRefreshToken()));
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
        sb.append(", refreshToken=").append(refreshToken);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}