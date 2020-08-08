package jlexdev.com.loginmvp.Home;

import java.util.List;

/**
 * Created by JLex on 18/01/18.
 */

public class HomePresenterImpl implements HomePresenter, FindItemsInteractor.OnFinishedListener{

    private HomeView homeView;
    private FindItemsInteractor findItemsInteractor;

    public HomePresenterImpl(HomeView homeView, FindItemsInteractor findItemsInteractor) {
        this.homeView = homeView;
        this.findItemsInteractor = findItemsInteractor;
    }

    @Override
    public void onResume() {
        if (homeView != null){
            homeView.showProgress();
        }

        findItemsInteractor.findItems(this);
    }

    @Override
    public void onItemClicked(int position) {
        if (homeView != null){
            homeView.showMessage(String.format("Click en posición %d", position + 1));
        }
    }

    @Override
    public void onDestroy() {
        homeView = null;
    }

    @Override
    public void onFinished(List<String> items) {
        if (homeView != null){
            homeView.setItems(items);
            homeView.hideProgress();
        }
    }


    // Get HomeView
    public HomeView getHomeView() {
        return homeView;
    }
}
