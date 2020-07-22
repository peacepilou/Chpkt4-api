package com.chkpt4training.training.review;

import com.chkpt4training.training.menu.Menu;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "review_id")
    private Long id;

    private String name;
    private String description;
    private Long score;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference(value = "menu-review")
    private Menu menu;

    public Review() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }


    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
