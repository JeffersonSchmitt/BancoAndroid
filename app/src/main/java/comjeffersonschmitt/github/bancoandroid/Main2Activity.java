package comjeffersonschmitt.github.bancoandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.UiThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;
import org.w3c.dom.Text;

import java.util.List;

import comjeffersonschmitt.github.bancoandroid.business.ContaService;
import comjeffersonschmitt.github.bancoandroid.business.UserService;
import comjeffersonschmitt.github.bancoandroid.domain.Conta;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IContaService;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IUserService;

@EActivity(R.layout.activity_main2) public class Main2Activity extends Activity {

  IContaService contaService;

  @ViewById TextView saldouser;
  @ViewById Button Saque;
  @ViewById Button Deposito;
  @ViewById Button Sair;

  @AfterViews void init() {
    contaService = new ContaService();
   // updateSaldo();
  }

  @Click void Sair() {
    Intent Sair = new Intent(this, MainActivity_.class);
    startActivity(Sair);
  }

  @Click void Saque() {
    Intent Saque = new Intent(this, Saque_.class);
    startActivity(Saque);
  }

  @Click void Deposito() {
    Intent Deposito = new Intent(this, Deposito_.class);
    startActivity(Deposito);
  }
/*
  @UiThread void updateSaldo() {
    saldouser.setText(pegaSaldo());
  }

  String pegaSaldo() {
    //fazer exibir o saldo aqui

  }*/
}
