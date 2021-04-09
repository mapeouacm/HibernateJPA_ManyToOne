package mx.edu.uacm.hibernatejpamanytoone.entity;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String number;
	
	@ManyToOne
	@JoinColumn(name = "person_id", 
					foreignKey = @ForeignKey(name="PERSON_ID_FK"))
	private Person person;
	
	
	public Phone() { }
	
	public Phone(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public long getId() {
		return id;
	}

}