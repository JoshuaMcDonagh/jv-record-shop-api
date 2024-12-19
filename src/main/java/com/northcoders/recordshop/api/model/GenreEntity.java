package com.northcoders.recordshop.api.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import static jakarta.persistence.EnumType.STRING;

@Entity
@Table(name="genres")
@Data
public class GenreEntity {

    @Id
    @Enumerated(STRING)
    @Column(nullable = false)
    private Genre genre;

    @ManyToMany(mappedBy="genres")
    private ArrayList<Album> album = new ArrayList<>();

}
