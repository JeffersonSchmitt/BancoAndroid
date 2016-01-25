package comjeffersonschmitt.github.bancoandroid.domain;

import com.activeandroid.Model;

public class User extends Model{
  private String login;
  private String nome;
  private String senha;
  private String cpf;

  public User(){
    super(); // pra que serve?
  }

  public User(String login, String nome, String senha, String cpf) {
    this.login = login;
    this.nome = nome;
    this.senha = senha;
    this.cpf = cpf;
  }

  public String getLogin() {
    return login;
  } //pega o login

  public String getNome(){return nome;} // pega o nome

  public String getSenha() {
    return senha;
  } // pega o senha

  public String getCpf() {
    return cpf;
  }// pega o cpf


}
