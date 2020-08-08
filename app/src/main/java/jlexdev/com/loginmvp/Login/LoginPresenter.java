package jlexdev.com.loginmvp.Login;

/**
 * Created by JLex on 18/01/18.
 */

public interface LoginPresenter {
    void validateDredentials(String username, String password);

    void onDestroy();
}
