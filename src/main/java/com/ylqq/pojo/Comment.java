package com.ylqq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Identity;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment {
    private int commentID;/*评论主键*/
    private int answerID;
    private int id;/*评论者信息*/
    private String name;
    private String identity;
    private Date commentTime;
    private String comment;
}
