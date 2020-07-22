package com.chkpt4training.training.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {

    @Autowired ArtistRepository artistRepository;

    public List<Artist> getArtists() {
        return artistRepository.findAll();
    }
}
