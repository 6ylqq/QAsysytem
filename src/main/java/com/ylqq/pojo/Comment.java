package com.ylqq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.security.Identity;
import java.util.Date;

/**
 * @author ylqq
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Comment {
    private int commentID;
    private int answerID;
    private int id;
    private String name;
    private String identity;
    private Date commentTime;
    private String comment;
}
