package org.mjbudden.android.solarsystem;

import org.mjbudden.android.infoboxes.InfoboxListActivity;

import android.os.Bundle;

/**
 * Displays a list of solar system objects.
 * 
 */
public class SolarSystemListActivity extends InfoboxListActivity {

    /**
     * Called when the activity is first created.
     * 
     * @param savedInstanceState
     *            a Bundle containing state saved from a previous execution, or null if this is a
     *            new execution
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        layoutResourceId = R.layout.ibx_infobox_scroll_content_layout;

        listHeaderResourceId = R.drawable.list_header;

        infoboxesResourceId = R.array.infoboxes;
        setupInfoboxes();
    }
}
