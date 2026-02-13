package com.spring.learn.learn_spring_framework.game;

public class GameRunner{
   GameWithController game;
   public GameRunner(GameWithController game){
      this.game = game;
   }
   public void run(){
      System.out.println("Running game: " + game);
       game.up();
       game.down();
       game.left();
       game.right();
      
   }
}