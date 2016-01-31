package comjeffersonschmitt.github.bancoandroid;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import comjeffersonschmitt.github.bancoandroid.business.ContaService;
import comjeffersonschmitt.github.bancoandroid.domain.contracts.IContaService;

@EActivity(R.layout.activity_deposito)
public class Deposito extends Activity {

    IContaService contaService;

    @ViewById Button depositar;
    @ViewById Button Voltar;

    @AfterViews
    void init(){
        contaService= new ContaService();
    }
    @Click void Voltar(){
        Intent voltar = new Intent(this, Main2Activity_.class);
        startActivity(voltar);
    }
}
