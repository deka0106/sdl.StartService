package jp.ac.titech.itpro.sdl.startservice;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

import static android.content.Intent.ACTION_ANSWER;

public class Service3 extends IntentService {
    private final static String TAG = Service3.class.getSimpleName();
    public final static String EXTRA_ANSWER = "ANSWER";

    public Service3() {
        super(TAG);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.d(TAG, "onHandleIntent in " + Thread.currentThread());
        sendActionAnswer();
    }

    private void sendActionAnswer() {
        final Intent intent = new Intent();
        intent.setAction(ACTION_ANSWER);
        intent.putExtra(EXTRA_ANSWER, "This is my answer! 🔥");
        sendBroadcast(intent);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate in " + Thread.currentThread());
    }

    @Override
    public void onDestroy() {
        Log.d(TAG, "onDestroy in " + Thread.currentThread());
        super.onDestroy();
    }
}
