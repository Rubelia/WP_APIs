package com.example.ttv_magento_thang.wpapi;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.util.Log;

import java.net.HttpURLConnection;

/**
 * Created by ttv-magento-thang on 12/23/16.
 */
public class RestTask extends AsyncTask<HttpURLConnection, Void, String> {

    private static final String TAG = "AARestTask";
    public static final String HTTP_RESPONSE = "httpResponse";

    private Context mContext;
//    private HttpClient mClient;
    private String mAction;

    public RestTask(Context context, String action)
    {
        mContext = context;
        mAction = action;
//        mClient = new DefaultHttpClient();
    }

    @Override
    protected String doInBackground(HttpURLConnection... params)
    {
        try {
            BasicResponseHandler
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
        return null;
    }

    @Override
    protected void onPostExecute(String result)
    {
        Log.i(TAG, "RESULT = " + result);
        Intent intent = new Intent(mAction);
        intent.putExtra(HTTP_RESPONSE, result);

        // broadcast the completion
        mContext.sendBroadcast(intent);
    }

}
