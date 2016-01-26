package comjeffersonschmitt.github.bancoandroid.domain.contracts;

import comjeffersonschmitt.github.bancoandroid.domain.User;
import java.util.List;

// Create Read Update Delete
public interface IUserRepository {

  List<User> get();
  User getById(int id);
  void add(User user);
  void update(User user);
  void delete(int id);

}
