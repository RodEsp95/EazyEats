package com.revature.models;

import javax.persistence.*;

@Entity
@Table(name="REQUEST")
public class VerificationRequest {
	@Id
	@OneToOne
	@JoinColumn(name="USER_ID")
	private User user;
	@Column(name="REASON")
	String qualifications;

	public VerificationRequest() {
		super();
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	@Override
	public String toString() {
		return "VerificationRequest [user=" + user + ", qualifications=" + qualifications + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((qualifications == null) ? 0 : qualifications.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		VerificationRequest other = (VerificationRequest) obj;
		if (qualifications == null) {
			if (other.qualifications != null)
				return false;
		} else if (!qualifications.equals(other.qualifications))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
}
