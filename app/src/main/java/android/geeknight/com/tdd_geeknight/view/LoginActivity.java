package android.geeknight.com.tdd_geeknight.view;

import android.geeknight.com.tdd_geeknight.R;
import android.geeknight.com.tdd_geeknight.model.LoginValidator;
import android.geeknight.com.tdd_geeknight.presenter.LoginPresenter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener, ILoginView {

  private EditText emailField;
  private EditText passwordField;
  private LoginPresenter loginPresenter;
  private TextView loginStatus;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_login);
    emailField = (EditText) findViewById(R.id.email_text);
    passwordField = (EditText) findViewById(R.id.password_text);
    loginStatus = (TextView) findViewById(R.id.login_status);
    findViewById(R.id.login_button).setOnClickListener(this);
    loginPresenter = new LoginPresenter(this, new LoginValidator());
  }

  @Override
  public void onClick(View view) {
    if(view.getId() == R.id.login_button) {
      String email = emailField.getText().toString();
      String password = passwordField.getText().toString();
      loginPresenter.performLogin(email, password);
    }
  }

  @Override
  public void onLoginSuccess() {
    loginStatus.setText("Login Succeed");
  }

  @Override
  public void onLoginFailure() {
    loginStatus.setText("Login Failure");
  }
}
