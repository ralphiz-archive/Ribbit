package com.ralphiz.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseInstallation;
import com.parse.ParseObject;
import com.parse.ParseUser;
import com.parse.PushService;
import com.ralphiz.ribbit.ui.MainActivity;
import com.ralphiz.ribbit.utils.ParseConstants;

/**
 * Created by RALNISE on 10/25/2014.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        Parse.initialize(this,
                "sLdmpXU5x1dtA0CpkOBZOnZKN9pLp63njILjDIIW",
                "Ow8tCudCEEcNDXLpTyqyWIq6zfP6h4EEwUSKYPBO");
        PushService.setDefaultPushCallback(this, MainActivity.class);
        ParseInstallation.getCurrentInstallation().saveInBackground();
    }

    public static void updateParseInstallation(ParseUser user) {
        ParseInstallation installation = ParseInstallation.getCurrentInstallation();
        installation.put(ParseConstants.KEY_USER_ID, user.getObjectId());
        installation.saveInBackground();
    }
}
