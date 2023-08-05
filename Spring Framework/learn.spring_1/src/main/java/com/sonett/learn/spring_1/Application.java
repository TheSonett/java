package com.sonett.learn.spring_1;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sonett.learn.spring_1.game.MarioGame;
import com.sonett.learn.spring_1.game.Pacman;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		var game = new MarioGame();
		//var game = new Pacman();
		GameRunner runner = new GameRunner(game);
		runner.play();
	}

}