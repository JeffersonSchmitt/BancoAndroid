package comjeffersonschmitt.github.bancoandroid.domain.contracts;

import java.util.List;

import comjeffersonschmitt.github.bancoandroid.domain.User;

public interface IContaService {
    List<User> get();
    User getByUser(int id);
    void create(User user);
    void remove(int id);
}
