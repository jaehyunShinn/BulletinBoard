package com.nextcode.bulletin.board;

import com.nextcode.bulletin.board.domain.BoardForm;
import com.nextcode.bulletin.board.domain.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardMapper boardMapper;

//    public void createComment(BoardVO boardVO) {
//
//        return boardMapper.createComment(boardVO);
//
//    }

    public void postArticle(BoardVO boardVO) {
        boardMapper.createBoard(boardVO);
    }

    public List<BoardVO> getBoardList() {
        return boardMapper.getBoardList();
    }

    public BoardVO convertFormToVO(BoardForm boardForm) {
        return boardMapper.convertFormToVO(boardForm);
    }
}
