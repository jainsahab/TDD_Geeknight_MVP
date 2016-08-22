package android.geeknight.com.tdd_geeknight.model;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LoginValidatorTest {

  @Test
  public void shouldDenyLoginForInvalidCredentials() throws Exception {
    LoginValidator loginValidator = new LoginValidator();
    String email = "invalidemail@thoughtworks.com";
    String password = "$12345";
    assertFalse(loginValidator.isValid(email, password));
  }

  @Test
  public void shouldAllowLoginForValidCredentials() throws Exception {
    LoginValidator loginValidator = new LoginValidator();
    String email = "gurgaon@thoughtworks.com";
    String password = "$12345";
    assertTrue(loginValidator.isValid(email, password));
  }
}