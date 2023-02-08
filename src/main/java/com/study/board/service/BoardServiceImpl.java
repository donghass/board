package com.study.board.service;

import com.study.board.dto.Board;
import com.study.board.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl {
    private final BoardMapper boardMapper;

    public int insert(Board board) {
    return boardMapper.insert(board);
    }

    public List<Board> list() {

        return boardMapper.list();
    }

    public void readCnt(int bno) {
        boardMapper.readCnt(bno);
    }

    public Board select(int bno) {
        return boardMapper.select(bno);
    }

    public int update(Board board) {
        return boardMapper.update(board);
    }


    public int delete(int bno) {
        return boardMapper.delete(bno);
    }
}
