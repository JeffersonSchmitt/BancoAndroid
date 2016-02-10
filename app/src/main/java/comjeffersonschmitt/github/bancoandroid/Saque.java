package comjeffersonschmitt.github.bancoandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.UiThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import comjeffersonschmitt.github.bancoandroid.domain.Conta;
import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import comjeffersonschmitt.github.bancoandroid.business.ContaService;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IContaService;
import org.w3c.dom.Text;

@EActivity(R.layout.activity_saque)
public class Saque extends Activity {

  IContaService contaService;
  Conta conta;
  Bundle bundle;
  @ViewById Button Saque;
  @ViewById Button Voltar;
  @ViewById TextView saldorestante;
  @ViewById EditText valorsaque;
  double valorSaque;

  @AfterViews void init() {
    contaService = new ContaService();
    bundle = getIntent().getExtras();
    Long id = bundle.getLong("id");
    conta = contaService.getByUserId(id);
    updateSaldo();
  }

  @Click void Voltar() {
    Intent Voltar = new Intent(this, Main2Activity_.class);
    startActivity(Voltar);
  }

  @Click void Saque() {
    conta.saca(valorSaque);
    Toast.makeText(this, "Saque efetuado com sucesso", Toast.LENGTH_SHORT).show();
  }

  @UiThread void updateSaldo() {
    saldorestante.setText(String.valueOf(conta.getSaldo()));
  }
}
