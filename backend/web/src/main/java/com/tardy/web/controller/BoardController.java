package com.tardy.web.controller;



import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import com.tardy.web.domain.BoardDTO;
import com.tardy.web.entities.Board;
import com.tardy.web.repositories.BoardRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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


    //1. 게시판글쓰기 먼저 
    @PostMapping("")
    public HashMap<String,String> insertBoard(@RequestBody BoardDTO dto) {
        HashMap<String, String> map = new HashMap<>();
        System.out.println("insertBoard : " + dto.toString());
        SimpleDateFormat format1 = new SimpleDateFormat();
        Date time = new Date();
        String time1 = format1.format(time);



        Board entity = new Board();
        entity.setUserid(dto.getUserid());
        entity.setTitle(dto.getTitle());
        entity.setContent(dto.getContent());
        entity.setView("100");
        entity.setRegdate(time1);

        System.out.println("엔티티로 바뀐 정보 : " + entity.toString());
        repo.save(entity);
        map.put("result", "게시글등록 성공");
        return map;
    }

    
    //2. 게시판 리스트 출력하기
    @GetMapping("list")
    public List<BoardDTO> selectList(){
        System.out.println("리스트 출력 메소드");
        Iterable<Board> board = repo.findAll();
        List<BoardDTO> list = new ArrayList<>();
        for (Board s : board){
            BoardDTO bo = modelMapper.map(s, BoardDTO.class);
            System.out.println("index"+bo.getId());
            list.add(bo);
        }
        System.out.println(list);
        return list;
    }

    
}