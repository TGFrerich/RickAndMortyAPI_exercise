package com.example.rickandmortyapi_exercise;

import com.example.rickandmortyapi_exercise.model.RickAndMortyApiResponse;
import com.example.rickandmortyapi_exercise.model.RickAndMortyCharacter;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;
import java.util.Objects;

@Service
public class RickAndMortyAPIService {

    private WebClient webClient = WebClient.create("https://rickandmortyapi.com/api/");
    public List<RickAndMortyCharacter> getAllRickAndMortyCharacters(){

RickAndMortyApiResponse rickAndMortyApiResponse = Objects.requireNonNull(webClient.get()
        .uri("/character")
        .retrieve()
        .toEntity(RickAndMortyApiResponse.class)
        .block())
        .getBody();

return  rickAndMortyApiResponse.results();

    }

    public List<RickAndMortyCharacter> getFilteredCharacters(String filter, String attribute){

        RickAndMortyApiResponse rickAndMortyApiResponse = Objects.requireNonNull(webClient.get()
                        .uri("/character?"+filter+"="+attribute)
                        .retrieve()
                        .toEntity(RickAndMortyApiResponse.class)
                        .block())
                        .getBody();

        return  rickAndMortyApiResponse.results();

    }

}
