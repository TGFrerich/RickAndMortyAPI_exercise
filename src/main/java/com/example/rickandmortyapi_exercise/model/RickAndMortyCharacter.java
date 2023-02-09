package com.example.rickandmortyapi_exercise.model;

public record RickAndMortyCharacter(
        int id,
        String status,
        String name,
        String species,
        String type,
        String gender) {
}
