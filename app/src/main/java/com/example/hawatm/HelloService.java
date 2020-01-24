package com.example.hawatm;

import android.app.IntentService;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

import androidx.annotation.Nullable;

public class HelloService extends IntentService {
    public static final String ACTION_HELLO_DONE = "action_hello_done";
    private static final String TAG = HelloService.class.getSimpleName();

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public HelloService() {
        super("HelloService");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate:");
    }

//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId) {
//        Log.d(TAG, "onStartCommand:");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        return START_STICKY;
//    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy:");
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        Log.d(TAG, "onHandleIntent: " + intent.getStringExtra("NAME"));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Intent done = new Intent();
        done.setAction(ACTION_HELLO_DONE);
        sendBroadcast(done);
    }
}
