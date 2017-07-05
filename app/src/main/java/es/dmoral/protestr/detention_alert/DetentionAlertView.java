package es.dmoral.protestr.detention_alert;

/**
 * Created by grender on 5/06/17.
 */

interface DetentionAlertView {
    void contactSelected(String displayName);
    void contactError();
    void showOngoingNotification();
    void clearNotification();
    void setNotificationState();
    void setButtonState();
    void setMessage();
    void setContactName();
    void showLocationRequestDialog();
    void selectContactAction();
    void enableAlertAction();
}
