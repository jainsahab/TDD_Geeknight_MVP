package android.geeknight.com.tdd_geeknight.presenter;

import android.geeknight.com.tdd_geeknight.model.LoginValidator;
import android.geeknight.com.tdd_geeknight.view.ILoginView;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LoginPresenterTest {

  @Test
  public void shouldNotifyViewForLoginFailure() throws Exception {
    String email = "invalidmail@thoughtworks.com";
    String password = "$12345";
    LoginValidator validator = mock(LoginValidator.class);
    ILoginView view = mock(ILoginView.class);
    when(validator.isValid(email, password)).thenReturn(false);

    LoginPresenter loginPresenter = new LoginPresenter(view, validator);

    loginPresenter.performLogin(email, password);

    verify(view, times(1)).onLoginFailure();
  }

}