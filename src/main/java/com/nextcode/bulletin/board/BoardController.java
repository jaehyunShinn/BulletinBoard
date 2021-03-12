package com.nextcode.bulletin.board;

import com.nextcode.bulletin.board.domain.BoardForm;
import com.nextcode.bulletin.board.domain.BoardVO;
import com.nextcode.bulletin.user.domain.UserVO;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    @ResponseBody
    @RequestMapping(value="/boardPost", method= {RequestMethod.POST})
    public ModelMap boardPost(@RequestBody BoardVO boardVO, HttpServletRequest request) {
//        BoardVO boardVO = convertFormToVO(boardForm);
        UserVO userVO = getSession(request);
        ModelMap map=new ModelMap();
         if (boardVO.getTitle() == null && boardVO.getContent()==null ) {
             map.addAttribute("resultCode",400);
             return map;
         }

        map.addAttribute("resultCode", 200);
         //todo 글 작성 로직 처리
        System.out.println("이메일 확인"+userVO.getEmail());
        boardVO.setEmail(userVO.getEmail());
        boardService.postArticle(boardVO);
        return map;
    }

    @RequestMapping(value="/boardList", method={RequestMethod.GET})
    public void getBoardList(Model model, HttpServletRequest request) {
        getSession(request);
        List<BoardVO> boardList = boardService.getBoardList();
        model.addAttribute("boardList",boardList);
    }

    private UserVO getSession(HttpServletRequest request){
        UserVO userVO= (UserVO) request.getSession().getAttribute("userInfo");
        if ( userVO== null)
        {
            throw new IllegalStateException("login 되지 않았습니다");
        }
        return userVO;
    }

    @RequestMapping(value="/registerBoard",method={RequestMethod.GET})
    public void registerBoard(HttpServletRequest request){
        getSession(request);
    }
    @RequestMapping(value="/registerComment",method={RequestMethod.POST})
    private BoardVO convertFormToVO(BoardForm boardForm) {
        return boardService.convertFormToVO(boardForm);
    }

}
