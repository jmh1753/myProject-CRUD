package com.tardy.web.controller;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.persistence.EntityNotFoundException;

import com.tardy.web.domain.BoardDTO;
import com.tardy.web.entities.Board;
import com.tardy.web.repositories.BoardRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * BoardController
 */
@CrossOrigin(origins = "http://localhost:8080", maxAge = 3600)
@RestController
@RequestMapping("/board")
public class BoardController {
    @Autowired BoardDTO board;
    @Autowired BoardRepository repo;
    @Autowired ModelMapper modelMapper;
    
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }

    //1. 게시판글쓰기
    @PostMapping("")
    public HashMap<String,String> insertBoard(@RequestBody BoardDTO dto) {
        HashMap<String, String> map = new HashMap<>();

        SimpleDateFormat format1 = new SimpleDateFormat();
        Date time = new Date();
        String time1 = format1.format(time);

        Board entity = new Board();
        entity.setUserid(dto.getUserid());
        entity.setTitle(dto.getTitle());
        entity.setContent(dto.getContent());
        entity.setRegdate(time1);

        Board board = repo.save(entity);
        System.out.println(board);
        
        map.put("result", "게시글등록 성공");           
        System.out.println(map);

        return map;
    }

    
    //2. 게시판 리스트 출력하기
    @GetMapping("/list")
    public List<BoardDTO> selectList(){
        Iterable<Board> board = repo.findAll();
        List<BoardDTO> list = new ArrayList<>();
        for (Board s : board){
            BoardDTO bo = modelMapper.map(s, BoardDTO.class);
            list.add(bo);
        }
        return list;
    }


    //3. 게시글 수정
    @PutMapping("/{id}")
    public HashMap<String, String> updateList(@PathVariable String id, @RequestBody BoardDTO dto) {       
        Board entity = repo.findById(Long.parseLong(id)).get();
        entity.setTitle(dto.getTitle());
        entity.setContent(dto.getContent());
       
        repo.save(entity);

        HashMap map = new HashMap<>();
        map.put("result", "SUCCESS");
        
        return map;
    }


    //4. 게시글 삭제
    @DeleteMapping("/{id}")
    public void deleteList(@PathVariable String id){
        repo.deleteById(Long.parseLong(id));
    }



    
}