package pu.fmi.wordle.logic;

import static java.lang.String.format;

public class UnknownWordException extends RuntimeException {

  private static final long serialVersionUID = 8991207085059009828L;

  public UnknownWordException(String word) {
    super(format("Unknown word [%s]", word));
  }
}
