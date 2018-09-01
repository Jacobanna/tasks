package com.crud.tasks.mapper;

import com.crud.tasks.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

//@SpringBootTest
//@RunWith(SpringRunner.class)
public class TrelloMapperTestSuite {
    @Test
    public void testPlaceholder() {
    }
//    @Autowired
//    TrelloMapper trelloMapper;
//
//    @Test
//    public void testMapToBoards() {
//        //Given
//        TrelloListDto trelloListDto = new TrelloListDto("1", "trello_list", true);
//        List<TrelloListDto> trelloListsDto = new ArrayList<>();
//        trelloListsDto.add(trelloListDto);
//        TrelloBoardDto trelloBoardDto = new TrelloBoardDto("trello_board", "1", trelloListsDto);
//        List<TrelloBoardDto> trelloBoardsDto = new ArrayList<>();
//        trelloBoardsDto.add(trelloBoardDto);
//        //When
//        TrelloList trelloList = new TrelloList("1", "trello_list", true);
//        List<TrelloList> trelloLists = new ArrayList<>();
//        trelloLists.add(trelloList);
//        TrelloBoard trelloBoard = new TrelloBoard("1", "trello_board", trelloLists);
//        List<TrelloBoard> notTransformedBoards = new ArrayList<>();
//        notTransformedBoards.add(trelloBoard);
//
//        List<TrelloBoard> trelloBoards = trelloMapper.mapToBoards(trelloBoardsDto);
//        //Then
//        assertEquals(notTransformedBoards.get(0).getId(), trelloBoards.get(0).getId());
//        assertEquals(notTransformedBoards.get(0).getLists().get(0).getId(), trelloBoards.get(0).getLists().get(0).getId());
//        assertEquals(notTransformedBoards.get(0).getName(), trelloBoards.get(0).getName());
//    }
//
//    @Test
//    public void testMapToBoardsDto() {
//        //Given
//        TrelloList trelloList = new TrelloList("1", "trello_list", true);
//        List<TrelloList> trelloLists = new ArrayList<>();
//        trelloLists.add(trelloList);
//        TrelloBoard trelloBoard = new TrelloBoard("1", "trello_board", trelloLists);
//        List<TrelloBoard> trelloBoards = new ArrayList<>();
//        trelloBoards.add(trelloBoard);
//        //When
//        TrelloListDto trelloListDto = new TrelloListDto("1", "trello_list", true);
//        List<TrelloListDto> trelloListsDto = new ArrayList<>();
//        trelloListsDto.add(trelloListDto);
//        TrelloBoardDto trelloBoardDto = new TrelloBoardDto("trello_board", "1", trelloListsDto);
//        List<TrelloBoardDto> notTransformedBoardsDto = new ArrayList<>();
//        notTransformedBoardsDto.add(trelloBoardDto);
//
//        List<TrelloBoardDto> trelloBoardsDto = trelloMapper.mapToBoardsDto(trelloBoards);
//        //Then
//        assertEquals(notTransformedBoardsDto.get(0).getId(), trelloBoardsDto.get(0).getId());
//        assertEquals(notTransformedBoardsDto.get(0).getLists().get(0).getId(), trelloBoardsDto.get(0).getLists().get(0).getId());
//        assertEquals(notTransformedBoardsDto.get(0).getName(), trelloBoardsDto.get(0).getName());
//    }
//
//    @Test
//    public void testMapToCard() {
//        //Given
//        TrelloCardDto trelloCardDto = new TrelloCardDto("card", "description", "upper", "1");
//        //When
//        TrelloCard notTransformedCard = new TrelloCard("card", "description", "upper", "1");
//
//        TrelloCard trelloCard = trelloMapper.mapToCard(trelloCardDto);
//        //Then
//        assertEquals(notTransformedCard.getDescription(), trelloCard.getDescription());
//        assertEquals(notTransformedCard.getListId(), trelloCard.getListId());
//        assertEquals(notTransformedCard.getName(), trelloCard.getName());
//        assertEquals(notTransformedCard.getPos(), trelloCard.getPos());
//    }
//
//    @Test
//    public void testMapToCardDto() {
//        //Given
//        TrelloCard trelloCard = new TrelloCard("card", "description", "upper", "1");
//        //When
//        TrelloCardDto notTransformedCardDto = new TrelloCardDto("card", "description", "upper", "1");
//
//        TrelloCardDto trelloCardDto = trelloMapper.mapToCardDto(trelloCard);
//        //Then
//        assertEquals(notTransformedCardDto.getDescription(), trelloCard.getDescription());
//        assertEquals(notTransformedCardDto.getListId(), trelloCard.getListId());
//        assertEquals(notTransformedCardDto.getName(), trelloCard.getName());
//        assertEquals(notTransformedCardDto.getPos(), trelloCard.getPos());
//    }
}
