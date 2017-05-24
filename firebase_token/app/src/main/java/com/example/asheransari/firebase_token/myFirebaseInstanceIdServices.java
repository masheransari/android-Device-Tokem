package com.example.asheransari.firebase_token;

import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by asher.ansari on 5/24/2017.
 */

public class myFirebaseInstanceIdServices extends FirebaseInstanceIdService {
    @Override
    public void onTokenRefresh() {
//        super.onTokenRefresh();
        String token = FirebaseInstanceId.getInstance().getToken();
//        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
        Log.d("Token Name", token);
    }
}
