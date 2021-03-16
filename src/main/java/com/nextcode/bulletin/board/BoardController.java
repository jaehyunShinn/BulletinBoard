package com.nextcode.bulletin.board;

import com.nextcode.bulletin.board.domain.BoardForm;
import com.nextcode.bulletin.board.domain.BoardVO;
import com.nextcode.bulletin.user.domain.UserVO;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.activation.CommandMap;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * BoardInterceptor를 만들어서 세션검사를 해아 한다.
 * 반복 코드가 들어가 있음
 *
 *
 */
@Controller
@RequestMapping("/board")
public class BoardController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private BoardService boardService;

    @ResponseBody
    @RequestMapping(value = "/boardPost", method = {RequestMethod.POST})
    public ModelMap boardPost(@RequestBody BoardVO boardVO, HttpServletRequest request) {
//        BoardVO boardVO = convertFormToVO(boardForm);
        UserVO userVO = getSession(request);
        ModelMap map = new ModelMap();

        boardVO.setEmail(userVO.getEmail());
        try {
            boardService.postArticle(boardVO);
        }catch (Exception e){
            map.addAttribute("resultCode", 500);
            map.addAttribute("resultMsg", e.getMessage());

            return map;
        }

        map.addAttribute("resultCode", 200);
        return map;
    }

    @RequestMapping(value = "/boardList", method = {RequestMethod.GET})
    public void getBoardList(Model model, HttpServletRequest request) {
        getSession(request);
        List<BoardVO> boardList = boardService.getBoardList();
        model.addAttribute("boardList", boardList);
    }

    private UserVO getSession(HttpServletRequest request) {
        UserVO userVO = (UserVO) request.getSession().getAttribute("userInfo");
        if (userVO == null) {
            throw new IllegalStateException("login 되지 않았습니다");
        }
        return userVO;
    }

    @RequestMapping(value = "/registerBoard", method = {RequestMethod.GET})
    public void registerBoard(HttpServletRequest request) {
        getSession(request);
    }


    //상세보기 페이지
    @RequestMapping(value = "/boardDetail", method = {RequestMethod.GET})
    private void getBoardDetail(Model map, HttpServletRequest request, BoardForm form) {
        getSession(request);
        BoardVO boardDetail = boardService.getBoardDetail(form);
        map.addAttribute("boardDetail", boardDetail);
    }

    @RequestMapping(value = "/registerSub", method = {RequestMethod.GET})
    public void registerSub(Model map, HttpServletRequest request, BoardForm form) {
        getSession(request);
    }

    @ResponseBody
    @RequestMapping(value = "/subPost", method = {RequestMethod.POST})
    public ModelMap subPost(@RequestBody BoardVO boardVO, HttpServletRequest request) {
        UserVO userVO = getSession(request);
        log.info("this is subPost");
        ModelMap map = new ModelMap();
        if (boardVO.getTitle() == null && boardVO.getContent() == null) {
            map.addAttribute("resultCode", 400);
            return map;
        }
        map.addAttribute("resultCode", 200);
        boardVO.setEmail(userVO.getEmail());
        boardService.postComment(boardVO);
        return map;
    }

}
