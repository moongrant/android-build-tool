package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p060o0000o.oo000o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SharedPreferences f19191OooO00o;

    /* JADX INFO: renamed from: com.google.firebase.messaging.OooO00o$OooO00o, reason: collision with other inner class name */
    public static class C0153OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final long f19192OooO0Oo = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f19193OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f19194OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f19195OooO0OO;

        public C0153OooO00o(String str, String str2, long j) {
            this.f19193OooO00o = str;
            this.f19194OooO0O0 = str2;
            this.f19195OooO0OO = j;
        }

        public static String OooO00o(String str, String str2, long j) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(FirebaseMessagingService.EXTRA_TOKEN, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
                return null;
            }
        }

        public static C0153OooO00o OooO0O0(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new C0153OooO00o(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new C0153OooO00o(jSONObject.getString(FirebaseMessagingService.EXTRA_TOKEN), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }
    }

    public OooO00o(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f19191OooO00o = sharedPreferences;
        Object obj = o000O000.OooO00o.f28085OooO00o;
        File file = new File(o000O000.OooO00o.OooO0OO.OooO0OO(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (file.createNewFile()) {
                synchronized (this) {
                    zIsEmpty = sharedPreferences.getAll().isEmpty();
                }
                if (zIsEmpty) {
                    return;
                }
                Log.i("FirebaseMessaging", "App restored, clearing state");
                synchronized (this) {
                    sharedPreferences.edit().clear().commit();
                }
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Error creating file in no backup dir: ");
                sbOooO0o0.append(e.getMessage());
                Log.d("FirebaseMessaging", sbOooO0o0.toString());
            }
        }
    }

    public final String OooO00o(String str, String str2) {
        return oo000o.OooO00o(str, "|T|", str2, "|", "*");
    }
}
