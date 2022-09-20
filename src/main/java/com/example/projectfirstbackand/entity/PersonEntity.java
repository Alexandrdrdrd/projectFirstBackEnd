package com.example.projectfirstbackand.entity;

import javax.persistence.*;

@Entity
@Table(name = "persons")
public class PersonEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "surname")
    String surname;

    @Column(name = "patronymic")
    String patronymic;

    @Column(name = "agreement")
    boolean agreement;
    @Column(name = "code")
    int code;

    public PersonEntity(String name, String surname, String patronymic,  boolean agreement, int code) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;

        this.agreement = agreement;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public PersonEntity() {
    }



    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }



    public boolean isAgreement() {
        return agreement;
    }

    public void setAgreement(boolean agreement) {
        this.agreement = agreement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PersonEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +

                ", agreement=" + agreement +
                ", code='" + code + '\'' +
                '}';
    }
}