package comjeffersonschmitt.github.bancoandroid.business;

import java.util.List;

import comjeffersonschmitt.github.bancoandroid.domain.User;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IContaRepository;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IContaService;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IUserRepository;
import comjeffersonschmitt.github.bancoandroid.repository.ContaRepository;
import comjeffersonschmitt.github.bancoandroid.repository.UserRepository;

public class ContaService implements IContaService {

    private IContaRepository _contaRepository;

    public ContaService() {
        _contaRepository = new ContaRepository();
    }
    @Override
    public List<User> get() {
        return null;
    }

    @Override
    public User getByUser(int id) {
        return null;
    }

    @Override
    public void create(User user) {

    }

    @Override
    public void remove(int id) {

    }
}
