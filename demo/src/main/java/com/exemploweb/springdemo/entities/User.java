package com.exemploweb.springdemo.entities;

import java.io.Serializable;

public class User implements Serializable {

private static final long serialVersionUID = 1L;

private long id;
private String name;
private String email;
private String phone;
private String password;

public User() {}

public User(long id, String name, String email, String phone, String password) {
    this.id = id;
    this.name = name;
    this.email = email;
    this.phone = phone;
    this.password = password;
}

public String getName() {
    return name;
}

public String getEmail() {
    return email;
}

public String getPhone() {
    return phone;
}

public String getPassword() {
    return password;
}

public long getId() {
    return id;
}



@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + (int) (id ^ (id >>> 32));
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
    User other = (User) obj;
    if (id != other.id)
        return false;
    return true;
}

@Override
public String toString() {
    return "User [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + "]";
}


}
