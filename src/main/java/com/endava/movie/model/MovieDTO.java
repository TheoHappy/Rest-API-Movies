package com.endava.movie.model;

import lombok.Data;

@Data
public class MovieDTO {
    private Long id;
    private String genre;
    private String name;
    private Double budget;
}
