package Concrete;

import Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService{

	@Override
	public void add(Game game) {
		System.out.println(game.getGameName()+ " added with " + game.getGamePrice() + " price");		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getGameName() +" updated");
		
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getGameName() +" deleted");
		
	}

	@Override
	public void addMultiple(Game[] games) {
		for (Game game : games) {
			add(game);
		}
		
	}

}
