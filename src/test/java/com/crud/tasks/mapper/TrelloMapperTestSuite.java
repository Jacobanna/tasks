package com.crud.tasks.mapper;

import com.crud.tasks.domain.TrelloBoard;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.domain.TrelloList;
import com.crud.tasks.domain.TrelloListDto;
import org.junit.Test;

public class TrelloMapperTestSuite {
    @Test
    public void testMapToBoards() {
        //Given
        TrelloListDto trelloListDto = new TrelloListDto("1", "trello_list", true);
        TrelloBoardDto trelloBoardDto = new TrelloBoardDto("board", "1", trelloListDto);
        //When
        //Then
    }

    public void testMapToBoardsDto() {
        TrelloList trelloList = new TrelloList("1", "trello_list", false);
        TrelloBoard trelloBoard = new TrelloBoard("1", "board", trelloList);
    }
}
