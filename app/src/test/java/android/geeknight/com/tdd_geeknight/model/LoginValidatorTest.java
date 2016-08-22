package android.geeknight.com.tdd_geeknight.model;

import org.junit.Test;

import static org.junit.Assert.assertFalse;

public class LoginValidatorTest {

  @Test
  public void shouldDenyLoginForInvalidCredentials() throws Exception {
    LoginValidator loginValidator = new LoginValidator();
    String email = "invalidemail@thoughtworks.com";
    String password = "$12345";
    assertFalse(loginValidator.isValid(email, password));
  }

}