package es.dmoral.protestr.ui.activities.splash;

/**
 * Created by grender on 15/02/17.
 */

public interface SplashPresenter {

    void confirmLoginAttempt(final String email, final String password);

    void onDestroy();
}
