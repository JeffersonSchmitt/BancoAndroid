package comjeffersonschmitt.github.bancoandroid;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main) public class MainActivity extends Activity {

  @ViewById EditText usuario;
  @ViewById EditText senha;
  @ViewById Button entrar;

}
