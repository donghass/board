package com.study.board.service;

import com.study.board.dto.Board;

import java.util.List;


public interface BoardService {
    int insert(Board board);

    List<Board> list();

    void readCnt(int bno);

    Board select(int bno);

    int update(Board board);

    int delete(int bno);
}
