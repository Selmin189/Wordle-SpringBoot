package pu.fmi.wordle.model;

public interface GameRepo {
  Game get(String id);

  void save(Game game);

  void update(Game game);

  Game delete(String id);
}
