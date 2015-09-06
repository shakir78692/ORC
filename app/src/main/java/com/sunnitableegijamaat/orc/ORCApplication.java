package com.sunnitableegijamaat.orc;

import android.app.Application;

import com.parse.Parse;

/**
 * Created by Shakir on 06/09/15.
 */
public class ORCApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "xL2Km6eEE9t0Pr4WgeY9lvXE2exugGZkjfG1Snxv", "slUN3w7eXICKwwvIcvChWkBsyOzojocjJLNoxKAq");
    }
}
