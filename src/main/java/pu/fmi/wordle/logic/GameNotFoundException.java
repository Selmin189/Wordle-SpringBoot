package pu.fmi.wordle.logic;

import static java.lang.String.format;

public class GameNotFoundException extends RuntimeException {

  private static final long serialVersionUID = 8224953078061192501L;

  public GameNotFoundException(String gameId) {
    super(format("Game with ID [%s] does not exist", gameId));
  }
}
