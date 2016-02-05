package comjeffersonschmitt.github.bancoandroid.business;

import java.util.List;

import comjeffersonschmitt.github.bancoandroid.domain.Conta;
import comjeffersonschmitt.github.bancoandroid.domain.User;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IContaRepository;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IContaService;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IUserRepository;
import comjeffersonschmitt.github.bancoandroid.repository.ContaRepository;
import comjeffersonschmitt.github.bancoandroid.repository.UserRepository;

public class ContaService implements IContaService {

  private IContaRepository _contaRepository;

  public void ContaService() {
    _contaRepository = new ContaRepository();
  }

  @Override
  public List<Conta> get() {
    return _contaRepository.get();
  }

  @Override
  public Conta getById(long id) {
    return _contaRepository.getByUserId(id);
  }

  @Override
  public void create(Conta conta) {
    _contaRepository.add(conta);
  }

  @Override
  public void remove(Conta conta) {
    _contaRepository.delete(conta);
  }
}
