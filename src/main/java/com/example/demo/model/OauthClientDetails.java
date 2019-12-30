package com.example.demo.model;

import java.io.Serializable;

public class OauthClientDetails implements Serializable {
    private String clientId;

    private String resourceIds;

    private String clientSecret;

    private String scope;

    private String authorizedGrantTypes;

    private String webServerRedirectUri;

    private String authorities;

    private Integer accessTokenValidity;

    private Integer refreshTokenValidity;

    private String additionalInformation;

    private String autoapprove;

    private static final long serialVersionUID = 1L;

    public OauthClientDetails(String clientId, String resourceIds, String clientSecret, String scope, String authorizedGrantTypes, String webServerRedirectUri, String authorities, Integer accessTokenValidity, Integer refreshTokenValidity, String additionalInformation, String autoapprove) {
        this.clientId = clientId;
        this.resourceIds = resourceIds;
        this.clientSecret = clientSecret;
        this.scope = scope;
        this.authorizedGrantTypes = authorizedGrantTypes;
        this.webServerRedirectUri = webServerRedirectUri;
        this.authorities = authorities;
        this.accessTokenValidity = accessTokenValidity;
        this.refreshTokenValidity = refreshTokenValidity;
        this.additionalInformation = additionalInformation;
        this.autoapprove = autoapprove;
    }

    public OauthClientDetails() {
        super();
    }

    public String getClientId() {
        return clientId;
    }

    public OauthClientDetails withClientId(String clientId) {
        this.setClientId(clientId);
        return this;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getResourceIds() {
        return resourceIds;
    }

    public OauthClientDetails withResourceIds(String resourceIds) {
        this.setResourceIds(resourceIds);
        return this;
    }

    public void setResourceIds(String resourceIds) {
        this.resourceIds = resourceIds == null ? null : resourceIds.trim();
    }

    public String getClientSecret() {
        return clientSecret;
    }

    public OauthClientDetails withClientSecret(String clientSecret) {
        this.setClientSecret(clientSecret);
        return this;
    }

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret == null ? null : clientSecret.trim();
    }

    public String getScope() {
        return scope;
    }

    public OauthClientDetails withScope(String scope) {
        this.setScope(scope);
        return this;
    }

    public void setScope(String scope) {
        this.scope = scope == null ? null : scope.trim();
    }

    public String getAuthorizedGrantTypes() {
        return authorizedGrantTypes;
    }

    public OauthClientDetails withAuthorizedGrantTypes(String authorizedGrantTypes) {
        this.setAuthorizedGrantTypes(authorizedGrantTypes);
        return this;
    }

    public void setAuthorizedGrantTypes(String authorizedGrantTypes) {
        this.authorizedGrantTypes = authorizedGrantTypes == null ? null : authorizedGrantTypes.trim();
    }

    public String getWebServerRedirectUri() {
        return webServerRedirectUri;
    }

    public OauthClientDetails withWebServerRedirectUri(String webServerRedirectUri) {
        this.setWebServerRedirectUri(webServerRedirectUri);
        return this;
    }

    public void setWebServerRedirectUri(String webServerRedirectUri) {
        this.webServerRedirectUri = webServerRedirectUri == null ? null : webServerRedirectUri.trim();
    }

    public String getAuthorities() {
        return authorities;
    }

    public OauthClientDetails withAuthorities(String authorities) {
        this.setAuthorities(authorities);
        return this;
    }

    public void setAuthorities(String authorities) {
        this.authorities = authorities == null ? null : authorities.trim();
    }

    public Integer getAccessTokenValidity() {
        return accessTokenValidity;
    }

    public OauthClientDetails withAccessTokenValidity(Integer accessTokenValidity) {
        this.setAccessTokenValidity(accessTokenValidity);
        return this;
    }

    public void setAccessTokenValidity(Integer accessTokenValidity) {
        this.accessTokenValidity = accessTokenValidity;
    }

    public Integer getRefreshTokenValidity() {
        return refreshTokenValidity;
    }

    public OauthClientDetails withRefreshTokenValidity(Integer refreshTokenValidity) {
        this.setRefreshTokenValidity(refreshTokenValidity);
        return this;
    }

    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    public String getAdditionalInformation() {
        return additionalInformation;
    }

    public OauthClientDetails withAdditionalInformation(String additionalInformation) {
        this.setAdditionalInformation(additionalInformation);
        return this;
    }

    public void setAdditionalInformation(String additionalInformation) {
        this.additionalInformation = additionalInformation == null ? null : additionalInformation.trim();
    }

    public String getAutoapprove() {
        return autoapprove;
    }

    public OauthClientDetails withAutoapprove(String autoapprove) {
        this.setAutoapprove(autoapprove);
        return this;
    }

    public void setAutoapprove(String autoapprove) {
        this.autoapprove = autoapprove == null ? null : autoapprove.trim();
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
        OauthClientDetails other = (OauthClientDetails) that;
        return (this.getClientId() == null ? other.getClientId() == null : this.getClientId().equals(other.getClientId()))
            && (this.getResourceIds() == null ? other.getResourceIds() == null : this.getResourceIds().equals(other.getResourceIds()))
            && (this.getClientSecret() == null ? other.getClientSecret() == null : this.getClientSecret().equals(other.getClientSecret()))
            && (this.getScope() == null ? other.getScope() == null : this.getScope().equals(other.getScope()))
            && (this.getAuthorizedGrantTypes() == null ? other.getAuthorizedGrantTypes() == null : this.getAuthorizedGrantTypes().equals(other.getAuthorizedGrantTypes()))
            && (this.getWebServerRedirectUri() == null ? other.getWebServerRedirectUri() == null : this.getWebServerRedirectUri().equals(other.getWebServerRedirectUri()))
            && (this.getAuthorities() == null ? other.getAuthorities() == null : this.getAuthorities().equals(other.getAuthorities()))
            && (this.getAccessTokenValidity() == null ? other.getAccessTokenValidity() == null : this.getAccessTokenValidity().equals(other.getAccessTokenValidity()))
            && (this.getRefreshTokenValidity() == null ? other.getRefreshTokenValidity() == null : this.getRefreshTokenValidity().equals(other.getRefreshTokenValidity()))
            && (this.getAdditionalInformation() == null ? other.getAdditionalInformation() == null : this.getAdditionalInformation().equals(other.getAdditionalInformation()))
            && (this.getAutoapprove() == null ? other.getAutoapprove() == null : this.getAutoapprove().equals(other.getAutoapprove()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getClientId() == null) ? 0 : getClientId().hashCode());
        result = prime * result + ((getResourceIds() == null) ? 0 : getResourceIds().hashCode());
        result = prime * result + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        result = prime * result + ((getScope() == null) ? 0 : getScope().hashCode());
        result = prime * result + ((getAuthorizedGrantTypes() == null) ? 0 : getAuthorizedGrantTypes().hashCode());
        result = prime * result + ((getWebServerRedirectUri() == null) ? 0 : getWebServerRedirectUri().hashCode());
        result = prime * result + ((getAuthorities() == null) ? 0 : getAuthorities().hashCode());
        result = prime * result + ((getAccessTokenValidity() == null) ? 0 : getAccessTokenValidity().hashCode());
        result = prime * result + ((getRefreshTokenValidity() == null) ? 0 : getRefreshTokenValidity().hashCode());
        result = prime * result + ((getAdditionalInformation() == null) ? 0 : getAdditionalInformation().hashCode());
        result = prime * result + ((getAutoapprove() == null) ? 0 : getAutoapprove().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", clientId=").append(clientId);
        sb.append(", resourceIds=").append(resourceIds);
        sb.append(", clientSecret=").append(clientSecret);
        sb.append(", scope=").append(scope);
        sb.append(", authorizedGrantTypes=").append(authorizedGrantTypes);
        sb.append(", webServerRedirectUri=").append(webServerRedirectUri);
        sb.append(", authorities=").append(authorities);
        sb.append(", accessTokenValidity=").append(accessTokenValidity);
        sb.append(", refreshTokenValidity=").append(refreshTokenValidity);
        sb.append(", additionalInformation=").append(additionalInformation);
        sb.append(", autoapprove=").append(autoapprove);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}