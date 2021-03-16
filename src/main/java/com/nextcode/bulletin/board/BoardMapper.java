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

     /**
      * 부모글과 그룹번호 같고, 부모글의 그룹내순서보다 큰 순서를 가진 데이터의 그룹번호를 1식 증가
      * @param parentVO
      */
     void updateChildGroupOrder(BoardVO parentVO);
}
