package com.geetest.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.qiniu.android.http.request.Request;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class GeeGuard {

    public interface CallbackHandler {
        void onCompletion(Integer num, GeeGuardReceipt geeGuardReceipt);
    }

    public class a implements Runnable {
        public final /* synthetic */ String a;
        public final /* synthetic */ GeeGuardReceipt b;
        public final /* synthetic */ CallbackHandler c;

        public a(String str, GeeGuardReceipt geeGuardReceipt, CallbackHandler callbackHandler) {
            this.a = str;
            this.b = geeGuardReceipt;
            this.c = callbackHandler;
        }

        @Override // java.lang.Runnable
        public void run() {
            Pair pair;
            HashMap map = new HashMap();
            map.put("API-Version", "1");
            map.put("AppID", this.a);
            map.put("GeeID", this.b.geeID);
            map.put("Client-Type", "1");
            String str = this.b.geeToken;
            try {
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://riskct.geetest.com/g2/api/v1/client_report").openConnection();
                httpURLConnection.setConnectTimeout(8000);
                httpURLConnection.setReadTimeout(5000);
                httpURLConnection.setRequestMethod(Request.HttpMethodPOST);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                if (map.size() > 0) {
                    for (Map.Entry entry : map.entrySet()) {
                        httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                }
                if (!TextUtils.isEmpty(str)) {
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write(str.getBytes(StandardCharsets.UTF_8));
                    outputStream.flush();
                    outputStream.close();
                }
                int responseCode = httpURLConnection.getResponseCode();
                Pair<Boolean, String> pairA = com.geetest.core.a.a(httpURLConnection.getInputStream());
                pair = ((Boolean) pairA.first).booleanValue() ? new Pair(Integer.valueOf(responseCode), (String) pairA.second) : new Pair(Integer.valueOf(-responseCode), (String) pairA.second);
            } catch (MalformedURLException e) {
                e.printStackTrace();
                pair = new Pair(-11, e.toString());
            } catch (ProtocolException e2) {
                e2.printStackTrace();
                pair = new Pair(-12, e2.toString());
            } catch (IOException e3) {
                e3.printStackTrace();
                pair = new Pair(-13, e3.toString());
            } catch (Exception e4) {
                e4.printStackTrace();
                pair = new Pair(-14, e4.toString());
            }
            if (((Integer) pair.first).intValue() != 200) {
                this.c.onCompletion(-300, null);
                return;
            }
            this.b.originalResponse = (String) pair.second;
            try {
                JSONObject jSONObject = new JSONObject((String) pair.second);
                if (jSONObject.getInt("code") == 0) {
                    this.b.geeQueryToken = jSONObject.getJSONObject("data").getString("query_token");
                    this.c.onCompletion(200, this.b);
                } else {
                    this.c.onCompletion(-200, this.b);
                }
            } catch (JSONException e5) {
                e5.printStackTrace();
                this.c.onCompletion(-200, this.b);
            }
        }
    }

    public static GeeGuardReceipt fetchReceipt(Context context, String str, String str2) {
        String data = Core.getData(context.getApplicationContext(), new GeeGuardConfiguration.Builder().setAppId(str).addSignature(str2).build());
        String string = context.getSharedPreferences("gt_core", 0).getString("gt_gid3", null);
        GeeGuardReceipt geeGuardReceipt = new GeeGuardReceipt();
        geeGuardReceipt.geeToken = data;
        geeGuardReceipt.geeID = string;
        if (string.length() > 0) {
            String[] strArrSplit = string.split("-");
            if (strArrSplit.length == 4) {
                geeGuardReceipt.geeIDTimestamp = strArrSplit[1];
            }
        }
        return geeGuardReceipt;
    }

    public static String getData(Context context, GeeGuardConfiguration geeGuardConfiguration) {
        return Core.getData(context.getApplicationContext(), geeGuardConfiguration);
    }

    public static String getVersion() {
        return "2.0.1";
    }

    public static void submitReceipt(Context context, String str, String str2, CallbackHandler callbackHandler) {
        new Thread(new a(str, fetchReceipt(context, str, str2), callbackHandler)).start();
    }
}
