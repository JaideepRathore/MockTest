package com.selfDevelopment.MockTest.Entity;

import org.springframework.data.annotation.Id;

import java.util.Map;

public class RealTest {
    @Id
    private long questionNumber;
    private String question;
   private Map<Character,String> option;
   
}
