package com.festwebsite.miracle.model;

import jakarta.persistence.*;

@Entity
@Table(name= "t_student")
public class Student {
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;


    private String username;


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private String password;

    public String getConfirmpassword() {
        return confirmpassword;
    }

    public void setConfirmpassword(String confirmpassword) {
        this.confirmpassword = confirmpassword;
    }

    private String confirmpassword;



    public Student(){

    }

   public Student(String username, String email, String password, String confirmpassword ){
       this.username = username;
       this.email = email;
       this.password = password;
       this.confirmpassword = confirmpassword;

   }

    public String getEmail() {
        return email;
    }



    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmpassword='" + confirmpassword + '\'' +

                '}';
    }

}
