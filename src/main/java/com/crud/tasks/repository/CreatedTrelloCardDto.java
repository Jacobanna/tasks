package com.crud.tasks.repository;

import com.crud.tasks.domain.TrelloBadgeDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatedTrelloCardDto {
    private String id;
    private String name;
    private String shortUrl;
    @JsonProperty("badges")
    private TrelloBadgeDto trelloBadgeDto;

    public CreatedTrelloCardDto(String id, String name, String shortUrl) {
        this.id = id;
        this.name = name;
        this.shortUrl = shortUrl;
    }
}