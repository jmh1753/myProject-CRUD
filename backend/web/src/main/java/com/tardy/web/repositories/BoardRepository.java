package com.tardy.web.repositories;

import com.tardy.web.entities.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * BoardRepository
 */
@Repository
public interface BoardRepository extends CrudRepository<Board, Long>{
    public Board findByUserid(String board);

}