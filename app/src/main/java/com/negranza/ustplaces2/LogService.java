package com.negranza.ustplaces2;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class LogService extends IntentService {

    public LogService(String name) {
        super("LogService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        for (int i = 0; i < 10; i++) {
            Log.d("Great", "Roque");
            Log.d("Great", "Arch");
            Log.d("Great", "Q.Pav");
            Log.d("Great", "Hospi");
        }
    }
}
