package com.crud.tasks.repository;

import com.crud.tasks.domain.TrelloBadgeDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class CreatedTrelloCard {
    private String id;
    private String name;
    private String shortUrl;
    private TrelloBadgeDto trelloBadgeDto;
}
