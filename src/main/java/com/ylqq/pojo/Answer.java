package com.ylqq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author ylqq
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Answer {
    private int answerID;
    private int questionID;
    private int id;
    private String name;
    private String identity;
    private String answer;
    private Date answerTime;
}
