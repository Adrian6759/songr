package com.AdrianSongr.songr.repositories;

import com.AdrianSongr.songr.models.Song;
import org.springframework.data.jpa.repository.JpaRepository;


public interface SongRepository extends JpaRepository<Song, Long> {
    public Song findByTitle(String title);
}
