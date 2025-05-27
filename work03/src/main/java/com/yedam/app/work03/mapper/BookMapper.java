package com.yedam.app.work03.mapper;

import java.util.List;
import com.yedam.app.work03.model.books;

public interface BookMapper {
    List<books> findAll(); // 전체조회
}

