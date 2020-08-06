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
public class Question {
    private int questionID;
    private String questionPart;
    private String questionTitle;
    private String problemElaboration;
    private Date releaseTime;
    private int views;
    private int collection;
    private int id;
}
