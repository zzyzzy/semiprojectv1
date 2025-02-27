package com.example.zzyzzy.semiprojectv1.service;

import com.example.zzyzzy.semiprojectv1.domain.BoardDTO;

import java.util.List;

public interface BoardService {

    List<BoardDTO> readBoard(int cpg);

    int countBoard();
}
