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


    public BoardVO getBoardDetail(BoardForm form) {
        System.out.println("form=" + form.toString());
        BoardVO dto = boardMapper.getBoardDetail(form);
        System.out.println("dto=" + dto.toString());
        return dto;
    }

    public void postComment(BoardVO boardDetail) {
        BoardForm boardForm = new BoardForm();
        boardForm.setId(boardDetail.getId());
        boardDetail=boardMapper.getBoardDetail(boardForm);
        boardMapper.createComment(boardDetail);
    }


}
