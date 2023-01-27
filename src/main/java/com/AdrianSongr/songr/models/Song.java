package com.AdrianSongr.songr.models;

import javax.persistence.*;

@Entity
public class Song {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    private String title;
    private Double length;
    private Integer trackNumber;
    @ManyToOne
    private Album songAlbum;

    protected Song() {};

    public Song(String title, Double length, Integer trackNumber, Album songAlbum) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.songAlbum = songAlbum;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Integer getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(Integer trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Album getAlbum() {
        return songAlbum;
    }

    public void setAlbum(Album songAlbum) {
        this.songAlbum = songAlbum;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", length=" + length +
                ", trackNumber=" + trackNumber +
                ", album=" + songAlbum +
                '}';
    }
}

