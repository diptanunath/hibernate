package com.javatpoint;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name= "user")
public class user{
	@Id
    @Column(name="id")
    private int    userId;
    
    @Column(name="email") 
    private String eMail;
    
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String geteMail() {
        return eMail;
    }
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
    public String toString()
    {
        return "[User ID: "+userId+"EMAIL: "+eMail+"]";
    }

}
