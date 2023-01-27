package com.AdrianSongr.songr.models;

import java.net.URL;
import java.util.List;


import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String title;
    private String artist;
    private Integer songCount;
    private Double length;
    private String imageURL;
    @OneToMany(mappedBy = "songAlbum")
    private List<Song> songs;

    protected Album(){}


public Album(String title, String artist, Integer songCount, Double length, String imageURL){
    this.title = title;
    this.artist = artist;
    this.songCount = songCount;
    this.length = length;
    this.imageURL = imageURL;
}

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
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

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getSongCount() {
        return songCount;
    }

    public void setSongCount(Integer songCount) {
        this.songCount = songCount;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Album Name: " + title + "from" + artist + " has " + songCount + " songs. The length of the album in seconds is" + length + "seconds. Here is a link to the photo of the album" + imageURL;}

}

