package com.example.rickandmortyapi_exercise;

import com.example.rickandmortyapi_exercise.model.RickAndMortyCharacter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RickAndMortyController {

    private RickAndMortyAPIService service;

    public RickAndMortyController(RickAndMortyAPIService service) {
        this.service = service;
    }

    @GetMapping("/characters")
    public List<RickAndMortyCharacter> getAllCharacters() {
        return service.getAllRickAndMortyCharacters();
    }

    @GetMapping("/character/{filter}/{attribute}") // alternative change it to request params so the style is better
    public List<RickAndMortyCharacter> getFilteredCharacters(@PathVariable String filter, @PathVariable String attribute) {
        return service.getFilteredCharacters(filter, attribute);
    }
}
