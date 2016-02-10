package comjeffersonschmitt.github.bancoandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.UiThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import android.widget.TextView;
import android.widget.Toast;
import comjeffersonschmitt.github.bancoandroid.domain.Conta;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import comjeffersonschmitt.github.bancoandroid.business.ContaService;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IContaService;

@EActivity(R.layout.activity_deposito)
public class Deposito extends Activity {

  IContaService contaService;
  Conta conta;
  Bundle bundle;
  @ViewById Button depositar;
  @ViewById Button Voltar;
  @ViewById TextView saldorestante;
  double valorSaque;

  @AfterViews void init() {
    contaService = new ContaService();
    bundle = getIntent().getExtras();
    Long id = bundle.getLong("id");
    conta = contaService.getByUserId(id);
    updateSaldo();
  }
  @Click void depositar(){
    conta.deposita(valorSaque);
    Toast.makeText(this,"Deposito feito com sucesso",Toast.LENGTH_LONG).show();
  }

  @Click void Voltar() {
    Intent voltar = new Intent(this, Main2Activity_.class);
    startActivity(voltar);
  }

  @UiThread void updateSaldo() {
    saldorestante.setText(String.valueOf(conta.getSaldo()));
  }

}
