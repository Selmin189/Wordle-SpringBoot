package pu.fmi.wordle.logic;

import pu.fmi.wordle.model.Game;

public interface GameService {

  Game startNewGame();

  Game getGame(String id);

  Game makeGuess(String id, String word);
}
