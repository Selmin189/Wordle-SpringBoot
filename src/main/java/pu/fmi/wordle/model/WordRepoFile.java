package pu.fmi.wordle.model;

import jakarta.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Random;
import java.util.random.RandomGenerator;
import org.springframework.stereotype.Component;

@Component
public class WordRepoFile implements WordRepo {
  HashSet<String> words = new HashSet<>();
  RandomGenerator randomGen = new Random();

  @PostConstruct
  public void popuplateWordsFromFile() {
    var in =
        Thread.currentThread()
            .getContextClassLoader()
            .getResourceAsStream("wordle-bg-words-list.csv");
    var reader = new InputStreamReader(in, StandardCharsets.UTF_8);
    var lineReader = new BufferedReader(reader);
    lineReader.lines().forEach(words::add);
  }

  @Override
  public Collection<String> list() {
    return words;
  }

  @Override
  public String getRandom() {
    int pos = randomGen.nextInt(words.size());
    return words.stream().skip(pos - 1).findFirst().get();
  }

  @Override
  public boolean exists(String word) {
    return words.contains(word);
  }
}
