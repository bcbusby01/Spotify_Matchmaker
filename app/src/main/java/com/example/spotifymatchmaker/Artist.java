package com.example.spotifymatchmaker;

public class Artist {

    private String id;
    private String name;
    private String[] genres;
    private int popularity;

    public Artist(String id, String name, String[] genres, int popularity) {
        this.name = name;
        this.id = id;
        this.genres = genres;
        this.popularity = popularity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getGenres() {
        return genres;
    }

    public void setGenres(String[] genres) {
        this.genres = genres;
    }

    public int getPopularity() {
        return popularity;
    }

    public void setPopularity (int popularity) {
        this.popularity = popularity;
    }
}
