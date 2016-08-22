package android.geeknight.com.tdd_geeknight.presenter;

import android.geeknight.com.tdd_geeknight.model.LoginValidator;
import android.geeknight.com.tdd_geeknight.view.ILoginView;

public class LoginPresenter {
  private ILoginView view;
  private LoginValidator validator;

  public LoginPresenter(ILoginView view, LoginValidator validator) {
    this.view = view;
    this.validator = validator;
  }

  public void performLogin(String email, String password) {
    view.onLoginFailure();
  }
}
