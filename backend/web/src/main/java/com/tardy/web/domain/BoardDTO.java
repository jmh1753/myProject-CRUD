package com.tardy.web.domain;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import lombok.Data;

/**
 * BoardDTO
 */
@Data @Component @Lazy
public class BoardDTO {
    private String id,userid, title, content, regdate;
    
}