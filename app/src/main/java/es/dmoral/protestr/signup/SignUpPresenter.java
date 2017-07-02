package es.dmoral.protestr.signup;

import android.support.annotation.NonNull;

/**
 * Created by grender on 1/07/17.
 */

public interface SignUpPresenter {
    void attemptSignUp(@NonNull final String email, @NonNull final String password);
    void onDestroy();
}
