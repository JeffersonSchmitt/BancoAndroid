package comjeffersonschmitt.github.bancoandroid.domain;


public class Conta {
  protected double saldo;
  int valorSaque;

  public double getSaldo() {
    return this.saldo;
  }

  public void saca(int valorSaque){
    this.saldo-=valorSaque;
  }

  public void deposita(int valorSaque){
    this.saldo+=valorSaque;
  }
}
