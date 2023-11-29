package com.comrade.model.entityinheritance;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "notification")
@Inheritance(strategy=InheritanceType.JOINED)
public class Notification {
	  @Id
	    @GeneratedValue(strategy=GenerationType.IDENTITY)
	    @Column(name="notification_id")
	    private Long id;
	 
	    @Column(name = "first_name")
	    private String firstName;
	 
	    @Column(name = "last_name")
	    private String lastName;
	    
	    @Temporal(TemporalType.TIMESTAMP)
	    @CreationTimestamp
	    @Column(name = "created_on")
	    private Date createdOn;

		public Notification() {
			super();
		}

		

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFirstName() {
			return firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public Date getCreatedOn() {
			return createdOn;
		}

		public void setCreatedOn(Date createdOn) {
			this.createdOn = createdOn;
		}
	    
		@Override
		public String toString() {
			return "Notification [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", createdOn="
					+ createdOn + "]";
		}  
}
