package comjeffersonschmitt.github.bancoandroid.domain.contracts;

import java.util.List;

import comjeffersonschmitt.github.bancoandroid.domain.Conta;
import comjeffersonschmitt.github.bancoandroid.domain.User;

public interface IContaService {
    List<Conta> get();
    void create(Conta conta);
    void remove(Conta conta);
}
