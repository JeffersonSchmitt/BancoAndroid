package comjeffersonschmitt.github.bancoandroid.domain.contracts;

import java.util.List;

import comjeffersonschmitt.github.bancoandroid.domain.Conta;
import comjeffersonschmitt.github.bancoandroid.domain.User;

public interface IContaRepository {
    List<User> get();
    void add(Conta conta);
    void changesaldo(double saldo);
    void update(Conta conta);
    void delete(Conta Saldo);
}
