package com.nextcode.bulletin.board;

import com.nextcode.bulletin.board.domain.BoardForm;
import com.nextcode.bulletin.board.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

     void createBoard(BoardVO boardVO);
//    void deleteBoard(BoardForm boardForm);
     List<BoardVO> getBoardList();
     BoardVO getBoardDetail(BoardForm form);
     void createComment(BoardVO boardVO);
}
