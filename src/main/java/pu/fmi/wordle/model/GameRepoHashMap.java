package pu.fmi.wordle.model;

import java.util.concurrent.ConcurrentHashMap;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class GameRepoHashMap implements GameRepo {

  ConcurrentHashMap<String, Game> games = new ConcurrentHashMap<>();

  @Override
  public Game get(String id) {
    System.out.println("---- I was in GameRepo!!! ----");
    return games.get(id);
  }

  @Override
  public void save(Game game) {
    games.put(game.getId(), game);
  }

  @Override
  public void update(Game game) {
    save(game);
  }

  @Override
  public Game delete(String id) {
    return games.remove(id);
  }
}
