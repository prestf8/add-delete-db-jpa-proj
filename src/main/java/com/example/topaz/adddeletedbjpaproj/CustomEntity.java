package com.example.topaz.adddeletedbjpaproj;

import javax.persistence.*;

@Entity
@Table(name="customentity")
public class CustomEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String title;
    private String descr;

    public CustomEntity() {}

    public CustomEntity(String title, String descr) {
        super();
        this.title = title;
        this.descr = descr;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

}
