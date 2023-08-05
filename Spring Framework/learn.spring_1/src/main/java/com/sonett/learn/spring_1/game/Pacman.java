package com.sonett.learn.spring_1.game;

import com.sonett.learn.spring_1.GameManage;

public class Pacman implements GameManage
{
	public Pacman() {}
	
	public void up() { System.out.println("pacman going up.."); }
	public void down() { System.out.println("pacman went into ground.."); }
	public void left() { System.out.println("pacman running forward.."); }
	public void right() { System.out.println("pacman looking back"); }
}