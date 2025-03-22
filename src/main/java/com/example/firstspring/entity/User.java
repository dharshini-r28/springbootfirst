package com.example.firstspring.entity;
//import jakarta.persistence.Entity;
//import jakarta.persistence.Id;
//import jakarta.persistence.Table;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class User {

//    @Id
//    private int id;
//    private String name;
//    private String email;
//
//    // Default constructor
//    public User() {
//    }
//
//    public User(int id, String name, String email) {
//        this.id = id;
//        this.name = name;
//        this.email = email;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    @Override
//    public String toString() {
//        return "User details : id =" + id + ", name : " + name + " , email: " + email;
//    }
//}
@Id
private int id;
    private String name;
    private String email;
}