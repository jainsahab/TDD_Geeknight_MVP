package android.geeknight.com.tdd_geeknight.view;

import android.geeknight.com.tdd_geeknight.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, ILoginView {

  private EditText emailField;
  private EditText passwordField;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    emailField = (EditText) findViewById(R.id.email_text);
    passwordField = (EditText) findViewById(R.id.password_text);
    findViewById(R.id.login_button).setOnClickListener(this);
  }

  @Override
  public void onClick(View view) {
  }

  @Override
  public void onLoginSuccess() {

  }

  @Override
  public void onLoginFailure() {

  }
}
