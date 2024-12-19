package com.northcoders.recordshop.api.model;

import jakarta.persistence.*;
import lombok.Data;

import static jakarta.persistence.GenerationType.*;

@Entity
@Table(name="artists")
@Data // Creates toString, equals, hashCode, getters, setters and relevant constructors
public class Artist {

    @Id
    @GeneratedValue(strategy=IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @ManyToMany(mappedBy="artist")
    private Album album;

}
