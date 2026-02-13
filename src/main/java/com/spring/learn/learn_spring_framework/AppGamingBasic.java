package com.spring.learn.learn_spring_framework;
import com.spring.learn.learn_spring_framework.game.*;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

  @SpringBootApplication
public  class AppGamingBasic{
  public static void main(String[] args){
    SpringApplication.run(AppGamingBasic.class, args);
    System.out.println("-".repeat(60));
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the game you want to play: ");
    System.out.println("Available games are :Contra, Mario or Pacman");
    String gameName = scanner.nextLine();
    var game = switch (gameName){ // Object creation
        case "Contra" -> new ContraGame();
        case "Mario" -> new MarioGame();
        case "Pacman" -> new PacmanGame();
        default -> throw new IllegalArgumentException("Invalid game name: " + gameName);
    };
  var gameRunner = new GameRunner(game); // Object creation + wiring of dependencies
    // game is a dependency of GameRunner
  gameRunner.run();
    }
}