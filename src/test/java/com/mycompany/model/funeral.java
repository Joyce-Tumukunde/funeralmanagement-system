package com.mycompany.model;

import jakarta.persistence.*;

@Entity
public enum funeral {
    @Id
    @GeneratedValue
    strategy =;GenerationType.IDENTITY
    )

    funeral(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private int id;


    private String deceasedDate;
    private String birthDate;
    private String lacation;
    private String name;
}
