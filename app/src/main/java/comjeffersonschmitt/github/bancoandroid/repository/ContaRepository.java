package comjeffersonschmitt.github.bancoandroid.repository;

import com.activeandroid.query.Select;

import java.util.List;

import comjeffersonschmitt.github.bancoandroid.domain.Conta;
import comjeffersonschmitt.github.bancoandroid.domain.User;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IContaRepository;

public class ContaRepository implements IContaRepository {

  @Override
  public List<Conta> get() {
    return new Select().from(Conta.class).execute();
  }

  @Override
  public Conta getByUserId(long id) {
    return new Select().from(Conta.class).innerJoin(User.class).on("User.Id = Conta.User").where("UserId = ?", id).executeSingle();
  }

  @Override
  public void add(Conta conta) {

  }

  @Override
  public void update(Conta conta) {

  }

  @Override
  public void delete(Conta Saldo) {

  }
}
