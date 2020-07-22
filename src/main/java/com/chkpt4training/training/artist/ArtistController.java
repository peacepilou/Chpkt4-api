package com.chkpt4training.training.artist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/artists")
public class ArtistController {

    @Autowired ArtistService artistService;

    @GetMapping()
    public List<Artist> getArtists() {
        return artistService.getArtists();
    }
}
