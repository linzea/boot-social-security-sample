package com.bss.sample.app.bbdd.jpa;
// Generated 17-feb-2017 15:47:50 by Hibernate Tools 5.1.0.Beta1

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserconnectionId generated by hbm2java
 */
@Embeddable
public class UserconnectionId implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private String userId;
	private String providerId;
	private String providerUserId;

	public UserconnectionId() {
	}

	public UserconnectionId( final String userId, final String providerId, final String providerUserId ) {
		this.userId = userId;
		this.providerId = providerId;
		this.providerUserId = providerUserId;
	}

	@Column( name = "userId", nullable = false )
	public String getUserId() {
		return userId;
	}

	public void setUserId( final String userId ) {
		this.userId = userId;
	}

	@Column( name = "providerId", nullable = false )
	public String getProviderId() {
		return providerId;
	}

	public void setProviderId( final String providerId ) {
		this.providerId = providerId;
	}

	@Column( name = "providerUserId", nullable = false )
	public String getProviderUserId() {
		return providerUserId;
	}

	public void setProviderUserId( final String providerUserId ) {
		this.providerUserId = providerUserId;
	}

	@Override
	public boolean equals( final Object other ) {
		if( this == other ) {
			return true;
		}
		if( other == null ) {
			return false;
		}
		if( !(other instanceof UserconnectionId) ) {
			return false;
		}
		UserconnectionId castOther = (UserconnectionId) other;

		return (getUserId() == castOther.getUserId() || getUserId() != null && castOther.getUserId() != null && getUserId().equals( castOther.getUserId() ))
				&& (getProviderId() == castOther.getProviderId() || getProviderId() != null && castOther.getProviderId() != null && getProviderId().equals( castOther.getProviderId() ))
				&& (getProviderUserId() == castOther.getProviderUserId() || getProviderUserId() != null && castOther.getProviderUserId() != null && getProviderUserId().equals( castOther.getProviderUserId() ));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getUserId() == null ? 0 : getUserId().hashCode());
		result = 37 * result + (getProviderId() == null ? 0 : getProviderId().hashCode());
		result = 37 * result + (getProviderUserId() == null ? 0 : getProviderUserId().hashCode());
		return result;
	}

}
