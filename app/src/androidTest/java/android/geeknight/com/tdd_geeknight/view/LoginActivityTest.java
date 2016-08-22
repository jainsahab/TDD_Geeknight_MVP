package android.geeknight.com.tdd_geeknight.view;

import android.geeknight.com.tdd_geeknight.R;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

  @Rule
  public ActivityTestRule<LoginActivity> rule = new ActivityTestRule<>(LoginActivity.class, true, false);

  @Test
  public void shouldAllowLoginForValidCredentials() throws Exception {
    rule.launchActivity(null);
    onView(withId(R.id.email_text)).perform(typeText("gurgaon@thoughtworks.com"));
    onView(withId(R.id.password_text)).perform(typeText("$12345"), closeSoftKeyboard());
    onView(withId(R.id.login_button)).perform(click());

    onView(withId(R.id.login_status)).check(matches(withText("Login Succeed")));
  }

  @Test
  public void shouldDenyLoginForInvalidCredentials() throws Exception {
    rule.launchActivity(null);
    onView(withId(R.id.email_text)).perform(typeText("invalidemail@thoughtworks.com"));
    onView(withId(R.id.password_text)).perform(typeText("$12345"), closeSoftKeyboard());
    onView(withId(R.id.login_button)).perform(click());

    onView(withId(R.id.login_status)).check(matches(withText("Login Failure")));
  }
}