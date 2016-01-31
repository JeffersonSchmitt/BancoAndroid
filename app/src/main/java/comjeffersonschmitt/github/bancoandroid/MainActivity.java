package comjeffersonschmitt.github.bancoandroid;

import android.app.Activity;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.UiThread;
import org.androidannotations.annotations.ViewById;

import java.util.List;

import comjeffersonschmitt.github.bancoandroid.business.ContaService;
import comjeffersonschmitt.github.bancoandroid.business.UserService;
import comjeffersonschmitt.github.bancoandroid.domain.User;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IContaRepository;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IContaService;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IUserService;

@EActivity(R.layout.activity_main) public class MainActivity extends Activity {

  @ViewById EditText usuario;
  @ViewById EditText senha;
  @ViewById Button entrar;

  IUserService userService;
  IContaService contaService;

@AfterViews void init(){
  userService= new UserService();
  contaService= new ContaService();

}

  @Click void entrar(){
    Intent main = new Intent(this, Main2Activity_.class);
    startActivity(main);
  }

@Click void registrar(){
  String usuarioUser = usuario.getText().toString();
  String senhaUser = senha.getText().toString();
  User user = new User(usuarioUser, senhaUser);


  userService.create(user);
  Toast.makeText(this, "Criado com Sucesso", Toast.LENGTH_SHORT).show();

}



}
