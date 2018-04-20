package com.example.a10580.new2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class New2Receiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.

        Toast.makeText(context, " new2 Received", Toast.LENGTH_SHORT).show();
       Bundle bundle = intent.getExtras();

       if (bundle!=null)
       {
          String KeyName = bundle.getString("KeyName");

           Toast.makeText(context, KeyName, Toast.LENGTH_SHORT).show();
       }
    }
}
