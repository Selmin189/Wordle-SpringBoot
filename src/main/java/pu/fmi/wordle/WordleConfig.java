package pu.fmi.wordle;

// import java.util.Collection;
// import java.util.List;
// import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
// import pu.fmi.wordle.logic.GameService;
// import pu.fmi.wordle.logic.GameServiceImpl;
// import pu.fmi.wordle.model.GameRepo;
// import pu.fmi.wordle.model.WordRepo;

/** Example of Java Configuration with factory method */
@Configuration
public class WordleConfig {

  /**
   * Example of how to turn a manually created instance to a Spring Bean sing factory method
   * annotated with {@link Bean} annotation
   *
   * <p>The example demonstrates also:
   *
   * <ul>
   *   <li>Method injection, possible only when the method is called/managed by Spring
   *   <li>Dependency injection conflict resolution using {@link Collection} or {@link List} when
   *       particular order is required and indicated using {@link Order} annotation
   * </ul>
   */
  //  @Bean
  //  public GameService gameService(List<GameRepo> gameRepo, WordRepo wordRepo) {
  //    return new GameServiceImpl(gameRepo.get(0), wordRepo);
  //  }
}
