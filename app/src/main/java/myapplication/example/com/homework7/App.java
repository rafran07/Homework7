package myapplication.example.com.homework7;
import android.app.Application;

import com.parse.Parse;
public class App extends Application {

    @Override public void onCreate() {
        super.onCreate();

        Parse.initialize(this, "Dvtxzyw83mVYM4y7mGNGpV3Bo9Uq7wWTiW4Et8Xa", "lE3evcqP8M1qNYdW3dO3o3HzBFKolW3RFm7GDdht"); // Your Application ID and Client Key are defined elsewhere
    }
} 