package krishnas.loginregister;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by Personal on 06-02-2018.
 */

public class Loginregister extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);


    }



}
