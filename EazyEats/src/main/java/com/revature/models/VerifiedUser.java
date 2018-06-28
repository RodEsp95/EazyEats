package com.revature.models;

import javax.persistence.*;

@Entity
@Table
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DELIMITER", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Verified")
public class VerifiedUser extends User {

}
