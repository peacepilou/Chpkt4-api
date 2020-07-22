package com.chkpt4training.training.menu;

import com.chkpt4training.training.artist.Artist;
import com.chkpt4training.training.review.Review;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Menu {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="menu_id")
    private Long id;

    private String title;
    private String description;
    private Long price;

    @OneToMany(mappedBy ="menu", cascade = CascadeType.ALL)
    @JsonManagedReference(value="menu-review")
    private List<Review> reviews;

    @OneToOne(mappedBy = "menu")
    private Artist artist;

    public Menu() {}

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
