package comjeffersonschmitt.github.bancoandroid.business;

import comjeffersonschmitt.github.bancoandroid.domain.User;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IUserRepository;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IUserService;
import comjeffersonschmitt.github.bancoandroid.repository.UserRepository;
import java.util.List;

public class UserService implements IUserService {

  private IUserRepository _userRepository;

  public UserService() {
    _userRepository = new UserRepository();
  }

  @Override public List<User> get() {
    return _userRepository.get();
  }

  @Override
  public User getByUser(int id) {
    return _userRepository.getById(id);
  }

  @Override public void changeSenha(String senha) {
    this.changeSenha(senha);
  }

  @Override public void create(User user) {
    _userRepository.add(user);
  }

  @Override public void remove(int id) {
    _userRepository.delete(id);
  }
}
