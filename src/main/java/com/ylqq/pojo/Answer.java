package com.ylqq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Answer {
    private int answerID;/*主键*/
    private int questionID;
    private int id;/*回答者ID*/
    private String name;
    private String identity;
    private String answer;
    private Date answerTime;
}
