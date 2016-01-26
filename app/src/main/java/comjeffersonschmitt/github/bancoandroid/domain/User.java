package comjeffersonschmitt.github.bancoandroid.domain;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

@Table(name = "user")
public class User extends Model{

  @Column(name = "Login") String login;
  @Column(name = "Nome") String nome;
  @Column(name = "Senha") String senha;
  @Column(name = "Cpf") String cpf;

  public User() {
    super();
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
