package com.nextcode.bulletin.board;

import com.nextcode.bulletin.board.domain.BoardForm;
import com.nextcode.bulletin.board.domain.BoardVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional(rollbackFor = Throwable.class)
    public void postArticle(BoardVO boardVO) {
        if(StringUtils.isBlank(boardVO.getTitle())){
            throw new IllegalStateException("제목을 입력해주세요.");
        }

        if(boardVO.getTitle().length() > 20){
            throw new IllegalStateException("제목은 20자까지 입력 가능합니다.");
        }


        if(StringUtils.isBlank(boardVO.getContent())){
            throw new IllegalStateException("내용을 입력해주세요.");
        }

        if(boardVO.getContent().length() > 200){
            throw new IllegalStateException("내용은 200자까지 입력 가능합니다.");
        }

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

    /**
     * 답글 등록
     * 유저가 입력한 정보에 부모 정보 (parent_id)까지 포함 되어
     * @param boardDetail
     */
    @Transactional(rollbackFor = Throwable.class)
    public void postComment(BoardVO boardDetail) {
        // 부모글 정보를 가져온다.
        BoardForm boardForm = new BoardForm();
        boardForm.setId(boardDetail.getParent_id());
        BoardVO parentVO=boardMapper.getBoardDetail(boardForm);

        // 부모글과 그룹번호 같고, 부모글의 그룹내순서보다 큰 순서를 가진 데이터의 그룹번호를 1식 증가
        boardMapper.updateChildGroupOrder(parentVO);

        // 답글의 정보를 계산한다.
        boardDetail.setGrpNum(parentVO.getGrpNum());
        boardDetail.setGrpOrd(parentVO.getGrpOrd()+1);
        boardDetail.setDepth(parentVO.getDepth()+1);

        // 답글 등록
        boardMapper.createComment(boardDetail);
    }


}
