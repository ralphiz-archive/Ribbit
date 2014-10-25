package com.ralphiz.ribbit;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

/**
 * Created by RALNISE on 10/25/2014.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate() {
        Parse.initialize(this, "sLdmpXU5x1dtA0CpkOBZOnZKN9pLp63njILjDIIW", "Ow8tCudCEEcNDXLpTyqyWIq6zfP6h4EEwUSKYPBO");

        ParseObject testObject = new ParseObject("TestObject");
        testObject.put("foo", "bar");
        testObject.saveInBackground();
    }
}
