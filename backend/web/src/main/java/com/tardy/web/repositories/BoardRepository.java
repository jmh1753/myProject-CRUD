package com.tardy.web.repositories;

import com.tardy.web.domain.BoardDTO;
import com.tardy.web.entities.Board;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 * BoardRepository
 */
@Repository
public interface BoardRepository extends CrudRepository<Board, Long>{
    public Board findByUserid(String board);
    /* @Modifying
    @Query(value = "insert into FREEBOARD(userId, title, content, regdate, view) values(:userId, :title, :content, :regdate, :view)", nativeQuery=true);
    void insertBoard(@Param("userId") String userId, @Param("title") String title, @Param("content") String content, @Param("regdate") String regdate, @Param("view") String view);  */
    // @Modifying
    // @Query(value = "insert into FREEBOARD(userId,title,content,view) values(:userId, :title, :content, :view)");
    
}