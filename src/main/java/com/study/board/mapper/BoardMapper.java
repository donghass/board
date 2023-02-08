package com.study.board.mapper;

import com.study.board.dto.Board;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int insert(Board board);

    List<Board> list();

    void readCnt(int bno);

    Board select(int bno);

    int update(Board board);

    int delete(int bno);
}
