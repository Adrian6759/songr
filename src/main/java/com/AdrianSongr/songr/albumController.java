package com.AdrianSongr.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class albumController {
@Autowired
AlbumsRepository albumsRepository;


    @GetMapping("/")
    public String getHello(){
        //How we sent data to our Thymeleaf fragments
        return "Hello";
    }

    @GetMapping("/albums")
    public String getAllAlbums(Model m){

        List<Album> albums = albumsRepository.findAll();

        m.addAttribute("albums", albums);

        return "album";
    }

    //URL params is one way we GET data from our View
    @ResponseBody
    @GetMapping("/capitalize/{word}")
    public String capitalize(@PathVariable String word){

        return word.toUpperCase();
    }
    // post route to stores
    @PostMapping("/stores")
    public RedirectView createAnAlbum(String title, String artist, Integer songCount, Double length, String imageURL){
        // create new store
        Album albums = new Album("title", "artist", 5, 29.8, "url");
        // add it to the DB
        albumsRepository.save(albums);
        return new RedirectView("/albums");
    }


}
