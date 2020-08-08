package jlexdev.com.loginmvp.Home;

import java.util.List;

/**
 * Created by JLex on 18/01/18.
 */

public interface HomeView {

    void showProgress();

    void hideProgress();

    void setItems(List<String> items);

    void showMessage(String message);
}
