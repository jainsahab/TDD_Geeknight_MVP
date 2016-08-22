package android.geeknight.com.tdd_geeknight.model;

public class LoginValidator {
  public Boolean isValid(String email, String password) {
    return email.equals("gurgaon@thoughtworks.com") && password.equals("$12345");
  }
}
