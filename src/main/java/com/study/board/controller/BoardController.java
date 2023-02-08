package com.study.board.controller;

import com.study.board.dto.Board;
import com.study.board.service.BoardServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
@Component
public class BoardController {
    private final BoardServiceImpl boardService;

    @GetMapping("/boardWrite")
    public String boardWrite() {
        return "boardWrite";
    }

    @PostMapping("boardWrite")
    public String boardWriteForm(Board board, Model model) {
        boardService.insert(board);
        return "redirect:/boardList";
    }

    @GetMapping("boardList")
    public String boardList(Model model) {
        List<Board> list = boardService.list();
        model.addAttribute("list", list);
        return "boardList";
    }

    @GetMapping("boardDetail")
    public String boardDetail(int bno, Model model) {
        boardService.readCnt(bno);
        Board board = boardService.select(bno);
        model.addAttribute("board", board);
        return "boardDetail";
    }

    @GetMapping("boardUpdate")
    public String boardUpdate(int bno, Model model) {
        Board board = boardService.select(bno);
        model.addAttribute("board", board);
        return "boardUpdate";
    }

    @PostMapping("boardUpdate")
    public String boardUpdateForm(Board board, Model model) {
        boardService.update(board);
        model.addAttribute("board", board);
        model.addAttribute("bno", board.getBno());
        return "boardDetail";
    }

    @GetMapping("boardDelete")
    public String boardDelete(int bno, Model model) {
        boardService.delete(bno);
        return "redirect:/boardList";
    }
}
