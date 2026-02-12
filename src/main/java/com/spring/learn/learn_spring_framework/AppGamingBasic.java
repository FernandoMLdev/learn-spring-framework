package com.spring.learn.learn_spring_framework;
import com.spring.learn.learn_spring_framework.game.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
  @SpringBootApplication
public  class AppGamingBasic{
  public static void main(String[] args){
    SpringApplication.run(AppGamingBasic.class, args);


  var marioGame = new MarioGame();
  var gameRunner = new GameRunner(marioGame);
  gameRunner.run();
    System.out.println("Hello World!");
    }
}