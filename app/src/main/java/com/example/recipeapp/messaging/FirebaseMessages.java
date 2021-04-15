package com.example.recipeapp.messaging;

import android.app.AlertDialog;

import androidx.annotation.NonNull;

import com.example.recipeapp.R;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

public class FirebaseMessages extends FirebaseMessagingService {
    @Override
    public void onNewToken(@NonNull String s) {
        super.onNewToken(s);
    }

    @Override
    public void onMessageReceived(@NonNull RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        AlertDialog.Builder alert = new AlertDialog.Builder(this)
                .setIcon(R.drawable.ic_launcher_foreground)
                .setTitle(remoteMessage.getData().get("Title"))
                .setMessage(remoteMessage.getData().get("Message"));
        AlertDialog a = alert.create();
        a.show();
    }

    @Override
    public void onMessageSent(@NonNull String s) {
        super.onMessageSent(s);
    }

}
