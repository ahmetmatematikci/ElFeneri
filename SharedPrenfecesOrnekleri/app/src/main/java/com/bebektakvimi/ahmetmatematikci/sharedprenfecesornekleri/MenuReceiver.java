package com.bebektakvimi.ahmetmatematikci.sharedprenfecesornekleri;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by a on 19.04.2017.
 */

public class MenuReceiver {

    private Context context;
    private SharedPreferences pref;
    private AppSettings as;

    public MenuReceiver(Context context, SharedPreferences pref) {
        this.context = context;
        this.pref = pref;
        as = new AppSettings(context, pref);
    }

    public void SaveAction(int r, int g, int b) {
        as.Serialize(r, g, b);
    }

    public void LoadAction() {
        as.Deserialize();
    }
}
