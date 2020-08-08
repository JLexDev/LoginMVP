package jlexdev.com.loginmvp.Home;

import java.util.List;

/**
 * Created by JLex on 18/01/18.
 */

public interface FindItemsInteractor {

    interface OnFinishedListener{
        void onFinished(List<String> items);
    }

    void findItems(OnFinishedListener listener);
}
