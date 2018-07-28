package com.crud.tasks.controller;

import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.repository.CreatedTrelloCard;
import com.crud.tasks.trello.client.TrelloClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/trello")
public class TrelloController {

    @Autowired
    private TrelloClient trelloClient;

//    1) USING sout()
//    @RequestMapping(method = RequestMethod.GET, value = "getTrelloBoards")
//    public void getTrelloBoards() {
//
//        List<TrelloBoardDto> trelloBoards = trelloClient.getTrelloBoards();
//
//        for (TrelloBoardDto trelloBoardDto: trelloBoards) {
//            if(trelloBoardDto.getName() != null && trelloBoardDto.getId() != null && trelloBoardDto.getName().contains("Kodilla")) {
//                System.out.println(trelloBoardDto.getId() + " " + trelloBoardDto.getName());
//                System.out.println("This board contains lists: ");
//                trelloBoardDto.getLists().forEach(trelloList -> System.out.println(trelloList.getName() + " " + trelloList.getId() + " " + trelloList.isClosed()));
//            }
//        }
//    }

//    2) Using Logger
    @RequestMapping(method = RequestMethod.GET, value = "getTrelloBoards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloClient.getTrelloBoards();
    }

    @RequestMapping(method = RequestMethod.POST, value = "createTrelloCard")
    public CreatedTrelloCard createdTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloClient.createNewCard(trelloCardDto);
    }
}