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


//    public BoardVO createBoard(BoardForm boardForm) {
//
//        return boardMapper.createBoard(boardForm);
//
//    }
    public BoardVO postArticle(BoardForm boardForm) {

        return boardMapper.createBoard(boardForm);
    }

    public List<BoardVO> getBoardList(int seq) {
        return boardMapper.getBoardList(seq);

    }
}
