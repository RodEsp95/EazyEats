package com.revature.models;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Table
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="DELIMITER", discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue("Admin")
public class Admin extends User {

}
