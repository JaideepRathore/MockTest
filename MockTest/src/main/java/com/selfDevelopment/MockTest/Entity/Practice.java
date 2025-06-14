package com.selfDevelopment.MockTest.Entity;

import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Practice {
    @Id
    private long id;
    private String ExamName;
    private ArrayList<RealTest> realTests;

}
