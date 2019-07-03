package com.tardy.web.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Board
 * userId, title, content, regdate, view;
 */
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Entity
@Getter
@Setter
@ToString
@Table(name = "FREEBOARD")
public class Board implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="userid") private String userid;
    @Column(name="title") private String title;
    @Column(name="content") private String content;
    @Column(name="regdate") private String regdate;
    @Column(name="view") private String view;

   /*  @Override
    public String toString(){
        return "FreeBoard : id:%d"+id+"userId:"+userId+"title:"+title+"content:"+content+"regdate:"+regdate+"view:"+view;
    } */

    @Override
    public String toString(){
        return String.format("고객정보 No: %d\n"
        +"USERID: %s", id,userid
        +"TITLE: %s",title
        +"CONTENT: %s", content
        +"REGDATE: %s", regdate      
        +"VIEW: %s", view
        );
    }




    @Builder
    private Board(String userId, String title, String content, String regdate, String view){
        this.userid = userId;
        this.title = title;
        this.content = content;
        this.regdate = regdate;
        this.view = view;
    }

    

}