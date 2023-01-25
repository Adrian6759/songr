package com.AdrianSongr.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class helloController {

    @ResponseBody
    @RequestMapping(value = "/hello", method =  RequestMethod.GET)
    public String getHome(){
        return "Hello World";
    }

    @GetMapping("/")
    public String getHello(Model m){
        //How we sent data to our Thymeleaf fragments
        m.addAttribute("name", "Lou");
        return "Hello";
    }

    @GetMapping("/albums")
    public String getAlbum(Model m){
        //How we sent data to our Thymeleaf fragments
        m.addAttribute("albumName", "");
        return "album";
    }

    //URL params is one way we GET data from our View
    @ResponseBody
    @GetMapping("/speak/{word}")
    public String speak(@PathVariable String word){
        return word;
    }
    @ResponseBody
    @GetMapping("/capitalize/{word}")
    public String capitalize(@PathVariable String word){
        return word.toUpperCase();
    }
    @ResponseBody
    @GetMapping("/albums/[array]")
    public String albums(@PathVariable String word){
        return word.toUpperCase();
    }

}
