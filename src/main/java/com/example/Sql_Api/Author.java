package com.example.Sql_Api;

import jakarta.persistence.*;




@Entity

@Table(name = "author")

public class Author {




    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment

    private int id;




    @Column(unique = true)

    private String name;




    private int booksWritten;







    private String country;




    private int age;




    public Author() {

    }




    public Author(int id, String name, int booksWritten, String country, int age) {

        this.id = id;

        this.name = name;

        this.booksWritten = booksWritten;

        this.country = country;

        this.age = age;

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




    public int getBooksWritten() {

        return booksWritten;

    }




    public void setBooksWritten(int booksWritten) {

        this.booksWritten = booksWritten;

    }




    public String getCountry() {

        return country;

    }




    public void setCountry(String country) {

        this.country = country;

    }




    public int getAge() {

        return age;

    }




    public void setAge(int age) {

        this.age = age;

    }

}