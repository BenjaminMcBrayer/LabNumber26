package co.grandcircus.coffeeshopapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "customerid")
	private Long customerid;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "emailaddress")
	private String emailaddress;
	@Column(name = "phonenumber")
	private String phonenumber;
	@Column(name = "birthdate")
	private String birthdate;
	@Column(name = "usergender")
	private String usergender;
	@Column(name = "pword")
	private String pword;

	public User() {
	}

	public User(Long customerid, String firstname, String lastname, String emailaddress, String phonenumber,
			String birthdate, String usergender, String pword) {
		this.customerid = customerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailaddress = emailaddress;
		this.phonenumber = phonenumber;
		this.birthdate = birthdate;
		this.usergender = usergender;
		this.pword = pword;
	}

	public User(Long customerid, String firstname, String lastname, String emailaddress, String phonenumber,
			String birthdate, String usergender) {
		this.customerid = customerid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.emailaddress = emailaddress;
		this.phonenumber = phonenumber;
		this.birthdate = birthdate;
		this.usergender = usergender;
	}

	public User(User user) {
		this.customerid = user.getCustomerid();
		this.firstname = user.getFirstname();
		this.lastname = user.getLastname();
		this.emailaddress = user.getEmailaddress();
		this.phonenumber = user.getPhonenumber();
		this.birthdate = user.getBirthdate();
		this.usergender = user.getUsergender();
	}

	public Long getCustomerid() {
		return customerid;
	}

	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmailaddress() {
		return emailaddress;
	}

	public void setEmailaddress(String emailaddress) {
		this.emailaddress = emailaddress;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getUsergender() {
		return usergender;
	}

	public void setUsergender(String usergender) {
		this.usergender = usergender;
	}

	public String getPword() {
		return pword;
	}

	public void setPword(String pword) {
		this.pword = pword;
	}
}
