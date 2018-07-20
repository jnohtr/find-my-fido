package com.example.demo;


import javax.persistence.*;

@Entity
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String petname;

    private String datelost;

    private String description;

    private String petpicture;

    private String petfound;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPetname() {
        return petname;
    }

    public void setPetname(String petname) {
        this.petname = petname;
    }

    public String getDatelost() {
        return datelost;
    }

    public void setDatelost(String datelost) {
        this.datelost = datelost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPetpicture() {
        return petpicture;
    }

    public void setPetpicture(String petpicture) {
        this.petpicture = petpicture;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPetfound() {
        return petfound;
    }

    public void setPetfound(String petfound) {
        this.petfound = petfound;
    }
}
