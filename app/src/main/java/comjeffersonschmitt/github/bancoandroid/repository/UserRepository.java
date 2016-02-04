package comjeffersonschmitt.github.bancoandroid.repository;

import com.activeandroid.query.Delete;
import com.activeandroid.query.Select;
import comjeffersonschmitt.github.bancoandroid.domain.User;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IUserRepository;
import java.util.List;

public class UserRepository implements IUserRepository{
  @Override public List<User> get() {
    return new Select().from(User.class).execute();
  }

  @Override public User getById(int id) {
    return new Select().from(User.class).where("Id = ?",id).executeSingle();
  }

  @Override public User getByUsername(String username) {
    return new Select().from(User.class).where("Login = ?", username).executeSingle();
  }

  @Override public void add(User user) {
    user.save();
  }

  @Override public void update(User user) {
    user.save();
  }

  @Override public void delete(int id) {
    new Delete().from(User.class).where("usuario=?",id).executeSingle();
  }
}
