package jlexdev.com.loginmvp.Login;

/**
 * Created by JLex on 18/01/18.
 */

public interface LoginView {
    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void navigateToMain();
}
