package jlexdev.com.loginmvp.Login;

/**
 * Created by JLex on 18/01/18.
 */

public interface LoginInteractor {

    interface OnLoginFinishedListener{
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String username, String password, OnLoginFinishedListener listener);
}
