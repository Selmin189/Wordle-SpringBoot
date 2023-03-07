package pu.fmi.wordle.model;

import java.time.LocalDateTime;
import java.util.List;

public class Game {
  String id;
  String word;
  LocalDateTime startedOn;

  int maxGuesses = 6;
  List<Guess> guesses;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public LocalDateTime getStartedOn() {
    return startedOn;
  }

  public void setStartedOn(LocalDateTime startedOn) {
    this.startedOn = startedOn;
  }

  public int getMaxGuesses() {
    return maxGuesses;
  }

  public void setMaxGuesses(int maxGuesses) {
    this.maxGuesses = maxGuesses;
  }

  public List<Guess> getGuesses() {
    return guesses;
  }

  public void setGuesses(List<Guess> guesses) {
    this.guesses = guesses;
  }
}
