package pu.fmi.wordle.model;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Order(1)
@Component
public class GameRepoDummy implements GameRepo {

  @Override
  public Game get(String id) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void save(Game game) {
    // TODO Auto-generated method stub

  }

  @Override
  public void update(Game game) {
    // TODO Auto-generated method stub

  }

  @Override
  public Game delete(String id) {
    // TODO Auto-generated method stub
    return null;
  }
}
