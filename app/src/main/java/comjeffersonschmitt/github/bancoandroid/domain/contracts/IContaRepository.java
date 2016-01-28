package comjeffersonschmitt.github.bancoandroid.domain.contracts;

import java.util.List;

import comjeffersonschmitt.github.bancoandroid.domain.Conta;
import comjeffersonschmitt.github.bancoandroid.domain.User;

public interface IContaRepository {
    List<Conta> get();
    void add(Conta conta);
    void update(Conta conta);
    void delete(Conta Saldo);
}
