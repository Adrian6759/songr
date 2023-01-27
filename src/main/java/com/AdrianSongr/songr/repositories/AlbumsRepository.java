package com.AdrianSongr.songr.repositories;

import com.AdrianSongr.songr.models.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepository extends JpaRepository<Album, Long> {
    public Album findByTitle(String title);
    public Album findByArtist(String artist);
}
