package es.dmoral.protestr.utils;

import android.content.Context;

import es.dmoral.protestr.R;

/**
 * Created by grender on 13/02/17.
 */

public class Constants {

    //public static final String BASE_URL = "http://protestr.tk/";
    public static final String BASE_URL = "http://192.168.1.135:5000/";
    public static final String API_URL = BASE_URL + "api/v1/";
    public static final String USERS_ENDPOINT = "users";
    public static final String LOGIN_ENDPOINT = USERS_ENDPOINT + "/login";
    public static final String SIGN_UP_ENDPOINT = USERS_ENDPOINT + "/signup";
    public static final String EVENTS_ENDPOINT = "events";
    public static final String NEW_EVENT_ENDPOINT = EVENTS_ENDPOINT + "/new";
    public static final String UPLOAD_IMAGE_URL = "https://api.imgur.com/3/image";
    public static final String TERMS_URL = BASE_URL + "terms";

    public static final int EVENT_LIMIT_CALL = 32;
    public static final String ORDER_CREATION_DATE_ASC = "creation_date_asc";
    public static final String ORDER_CREATION_DATE_DESC = "creation_date_desc";
    public static final String ORDER_FROM_PARTICIPANTS_DESC = "participants_desc";

    public static final String BROADCAST_SMS_SENT = "broadcast_sms_sent";
    public static final String BROADCAST_SHAKE_DETECTED = "broadcast_shake_detected";
    public static final String BROADCAST_SHAKE_COMPLETED = "broadcast_shake_completed";
    public static final String BROADCAST_SHAKE_RESTARTED = "broadcast_shake_restarted";

    public static String getImgurAuthHeader(Context context) {
        return "Client-ID " + context.getString(R.string.imgur_client_id);
    }

}
