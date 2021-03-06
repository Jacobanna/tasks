package com.crud.tasks.controller;

import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloCardDto;
import com.crud.tasks.repository.CreatedTrelloCardDto;
import com.crud.tasks.service.TrelloService;
import com.crud.tasks.trello.facade.TrelloFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/trello")
public class TrelloController {
    @Autowired
    private TrelloFacade trelloFacade;

    @RequestMapping(method = RequestMethod.GET, value = "/boards")
    public List<TrelloBoardDto> getTrelloBoards() {
        return trelloFacade.fetchTrelloBoards();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/cards")
    public CreatedTrelloCardDto createdTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
        return trelloFacade.createCard(trelloCardDto);
    }

//    2) NO FACADE
//    @Autowired
//    private TrelloService trelloService;

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

//    2) Using Logger, NO FACADE
//    @RequestMapping(method = RequestMethod.GET, value = "getTrelloBoards")
//    public List<TrelloBoardDto> getTrelloBoards() {
//        return trelloService.fetchTrelloBoards();
//    }
//
//    @RequestMapping(method = RequestMethod.POST, value = "createTrelloCard")
//    public CreatedTrelloCardDto createdTrelloCard(@RequestBody TrelloCardDto trelloCardDto) {
//        return trelloService.createTrelloCard(trelloCardDto);
//    }
}