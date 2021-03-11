package com.nextcode.bulletin.board;

import com.nextcode.bulletin.board.domain.BoardForm;
import com.nextcode.bulletin.board.domain.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    public BoardVO createBoard(BoardForm boardForm);

    public void deleteBoard(BoardForm boardForm);
    public List<BoardVO> getBoardList(int seq);
}
