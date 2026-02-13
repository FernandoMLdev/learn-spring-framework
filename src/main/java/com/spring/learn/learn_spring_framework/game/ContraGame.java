package com.spring.learn.learn_spring_framework.game;

public class ContraGame implements GameWithController{
   public void up(){
      System.out.println("Aim up");
   }
   public void down(){
      System.out.println("Duck");
   }
   public void left(){
      System.out.println("Go back");
   }
   public void right(){
      System.out.println("Advance");
   }
  
}