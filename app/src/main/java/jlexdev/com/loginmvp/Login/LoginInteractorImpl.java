package jlexdev.com.loginmvp.Login;

import android.os.Handler;
import android.text.TextUtils;

/**
 * Created by JLex on 18/01/18.
 */

public class LoginInteractorImpl implements LoginInteractor {

    @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {
        // Simulación de LOGIN. Manejo una pausa de 2s
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (TextUtils.isEmpty(username)){
                    listener.onUsernameError();
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onPasswordError();
                    return;
                }
                listener.onSuccess();
            }
        }, 2000);
    }
}
