package com.crud.tasks.trello.validator;

import com.crud.tasks.domain.TrelloBoard;
import com.crud.tasks.domain.TrelloCard;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class TrelloValidator {
    private static final Logger LOGGER = LoggerFactory.getLogger(TrelloValidator.class);

    public void validateCard(final TrelloCard trelloCard) {
        if(trelloCard.getName().contains("test")) {
            LOGGER.info("Getting test cards");
        } else {
            LOGGER.info("Getting valid cards");
        }
    }

    public List<TrelloBoard> validateTrelloBoards(final List<TrelloBoard> trelloBoards) {
        LOGGER.info("Starting filtering boards...");
        List<TrelloBoard> filteredBaords = trelloBoards.stream()
                .filter(trelloBoard -> !trelloBoard.getName().equalsIgnoreCase("test"))
                .collect(Collectors.toList());
        LOGGER.info("Boards have been filtered. Current list size: " + filteredBaords.size());
        return filteredBaords;
    }
}
