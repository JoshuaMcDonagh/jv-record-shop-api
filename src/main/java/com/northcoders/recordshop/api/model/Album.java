package com.northcoders.recordshop.api.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table(name="albums")
@Data
public class Album {

    @Id
    @GeneratedValue(strategy=IDENTITY)
    private long id;

    @Column(nullable = false)
    private String title;

    @ManyToMany
    @JoinTable(
            name="album_genre",
            joinColumns=@JoinColumn(name="album_id"),
            inverseJoinColumns=@JoinColumn(name="genre"),
            uniqueConstraints=@UniqueConstraint(columnNames={"album_id", "genre"})
    )
    @Column(nullable = false)
    private Set<GenreEntity> genres = new HashSet<>();

    @ManyToMany
    @JoinTable(
            name="album_artist",
            joinColumns=@JoinColumn(name="album_id"),
            inverseJoinColumns=@JoinColumn(name="artist_id"),
            uniqueConstraints=@UniqueConstraint(columnNames={"album_id", "artist_id"})
    )
    @Column(nullable = false)
    private Set<Artist> artists;

    @Column(nullable = false)
    private int yearReleased;

    @Column(nullable = false)
    private long stock;

    @Column(nullable = false)
    private double price;

}
