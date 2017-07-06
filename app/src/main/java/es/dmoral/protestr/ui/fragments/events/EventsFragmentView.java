package es.dmoral.protestr.ui.fragments.events;

import android.view.Menu;

import java.util.ArrayList;

import es.dmoral.protestr.data.models.Event;

/**
 * Created by grender on 16/02/17.
 */

public interface EventsFragmentView {

    void populateNewEventList(ArrayList<Event> newEvents);
    void setFirstMenuItemChecked(Menu menu);
}
