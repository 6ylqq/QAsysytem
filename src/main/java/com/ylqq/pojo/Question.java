package com.ylqq.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Question {
    private int questionID;/*主键*/
    private String questionPart;
    private String questionTitle;
    private String problemElaboration;
    private Date releaseTime;
    private int views;
    private int collection;
    private int id;/*提问者ID*/
}
