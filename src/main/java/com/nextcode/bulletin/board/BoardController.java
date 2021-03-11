package com.nextcode.bulletin.board;

import com.nextcode.bulletin.board.domain.BoardForm;
import com.nextcode.bulletin.board.domain.BoardVO;
import com.nextcode.bulletin.board.domain.ListDTO;
import com.nextcode.bulletin.user.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.xml.ws.Response;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    @ResponseBody
    @RequestMapping(value="/boardPost/{seq}", method= {RequestMethod.POST})
    public ModelMap boardPost(@RequestBody BoardForm boardForm, HttpServletRequest request) {
         ModelMap map=new ModelMap();
         if (boardForm.getTitle() == null && boardForm.getContent()==null ) {
             map.addAttribute("errorCode",400);
         } else {
//             map.addAttribute();
         }
//         BoardVO boardVO = getBoardVO(boardForm);
//         ModelVO modelVO =
        return map;

    }

//    private BoardVO postBoard(BoardForm boardForm) {
//        return boardService.postArticle(boardForm);
//    }

//    private BoardVO getBoardVO(BoardForm boardForm) {
//
//    }


    @RequestMapping(value="/boardList", method={RequestMethod.GET})
    public void getBoardList(ListDTO param , HttpServletRequest request) {

//        Map<String,Object> map =new HashMap<String,Object>();
//        map.put("param1",request.getParameter("param1"));
//        map.put("")
    }
}
