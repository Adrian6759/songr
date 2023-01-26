package com.AdrianSongr.songr;

import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepository extends JpaRepository<Album, Long> {
    public Album findByTitle(String title);
    public Album findByArtist(String artist);
}
