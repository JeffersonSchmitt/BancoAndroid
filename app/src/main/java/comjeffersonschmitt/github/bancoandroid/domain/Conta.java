package comjeffersonschmitt.github.bancoandroid.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Conta")
public class Conta extends Model {

  @Column(name = "Saldo") double saldo=1000.0;
  @Column(name = "User") User user;

  public Conta() {
    super();
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public double getSaldo() {
    return saldo;
  }

  public void saca(int valorSaque){
    this.saldo -= valorSaque;
  }

  public void deposita(int valorSaque){
    this.saldo += valorSaque;
  }
}
