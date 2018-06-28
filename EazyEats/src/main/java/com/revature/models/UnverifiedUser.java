package com.revature.models;

import java.util.List;

import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DELIMITER", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Unverified")
public class UnverifiedUser extends User {

	@Column(name="REASON")
	String qualifications;

	public UnverifiedUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UnverifiedUser(int id, String name, String username, String password, String email,
			List<Restaurant> favorites) {
		super(id, name, username, password, email, favorites);
		// TODO Auto-generated constructor stub
	}

	public UnverifiedUser(String qualifications) {
		super();
		this.qualifications = qualifications;
	}

	public String getQualifications() {
		return qualifications;
	}

	public void setQualifications(String qualifications) {
		this.qualifications = qualifications;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((qualifications == null) ? 0 : qualifications.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		UnverifiedUser other = (UnverifiedUser) obj;
		if (qualifications == null) {
			if (other.qualifications != null)
				return false;
		} else if (!qualifications.equals(other.qualifications))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "UnverifiedUser [qualifications=" + qualifications + "]";
	}
}
