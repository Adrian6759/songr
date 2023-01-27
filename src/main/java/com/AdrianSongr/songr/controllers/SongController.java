package com.AdrianSongr.songr.controllers;

import com.AdrianSongr.songr.models.Album;
import com.AdrianSongr.songr.models.Song;
import com.AdrianSongr.songr.repositories.AlbumsRepository;
import com.AdrianSongr.songr.repositories.SongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongController {

    @Autowired AlbumsRepository albumsRepository;
    @Autowired
    SongRepository songRepository;


    @PostMapping("/songs")
    public RedirectView createASong(String title, Double length, Integer trackNumber, String albumTitle){
        Album songAlbum = albumsRepository.findByTitle(albumTitle);
        Song newSong = new Song(title, length, trackNumber, songAlbum);
        songRepository.save(newSong);
                return new RedirectView("/albums");
    }
}
