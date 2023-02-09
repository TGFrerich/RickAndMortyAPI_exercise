package com.example.rickandmortyapi_exercise.model;

import com.example.rickandmortyapi_exercise.model.RickAndMortyCharacter;
import lombok.Data;

import java.util.List;

public record RickAndMortyApiResponse(
        List<RickAndMortyCharacter> results
) {




}
