package comjeffersonschmitt.github.bancoandroid.domain;

import android.widget.EditText;
import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "Conta")
public class Conta extends Model {
  //aqui é a entidade Conta fica tudo o que ela vai ter ou vai conseguir fazer

  @Column(name = "Saldo") double saldo = 1000.0;
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

  public void saca(double valorSaque) {
    this.saldo -= valorSaque;
  }

  public void deposita(double valorSaque) {
    this.saldo += valorSaque;
  }
}
