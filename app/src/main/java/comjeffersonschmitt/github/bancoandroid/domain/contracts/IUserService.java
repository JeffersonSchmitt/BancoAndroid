package comjeffersonschmitt.github.bancoandroid.domain.contracts;
import comjeffersonschmitt.github.bancoandroid.domain.User;
import java.util.List;

public interface IUserService {
  List<User> get();
  User getByUser(int id);
  User getByUsername(String username, String pass);
  void changeSenha(String senha);
  void create(User user);
  void remove(int id);


}
