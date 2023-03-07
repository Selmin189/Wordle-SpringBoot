package pu.fmi.wordle.model;

import java.time.LocalDateTime;

public class Guess {
  public static final char PLACE_MATCH = 'P';
  public static final char LETTER_MATCH = 'L';
  public static final char NO_MATCH = 'N';

  String word;
  LocalDateTime madeOn;
  String matches;

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public LocalDateTime getMadeOn() {
    return madeOn;
  }

  public void setMadeAt(LocalDateTime madeOn) {
    this.madeOn = madeOn;
  }

  public String getMatches() {
    return matches;
  }

  public void setMatches(String matches) {
    this.matches = matches;
  }
}
