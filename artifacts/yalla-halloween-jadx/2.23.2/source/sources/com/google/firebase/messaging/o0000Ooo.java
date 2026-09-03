package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.ContextCompat;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class o0000Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final SharedPreferences f19865OooO00o;

    public static class OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final long f19866OooO0Oo = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final String f19867OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final String f19868OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final long f19869OooO0OO;

        public OooO00o(String str, String str2, long j) {
            this.f19867OooO00o = str;
            this.f19868OooO0O0 = str2;
            this.f19869OooO0OO = j;
        }

        public static String OooO00o(long j, String str, String str2) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("token", str);
                jSONObject.put(RemoteConfigConstants$RequestFieldKey.APP_VERSION, str2);
                jSONObject.put("timestamp", j);
                return jSONObject.toString();
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to encode token: " + e);
                return null;
            }
        }

        public static OooO00o OooO0O0(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new OooO00o(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new OooO00o(jSONObject.getString("token"), jSONObject.getString(RemoteConfigConstants$RequestFieldKey.APP_VERSION), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                Log.w("FirebaseMessaging", "Failed to parse token: " + e);
                return null;
            }
        }
    }

    public o0000Ooo(Context context) {
        boolean zIsEmpty;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        this.f19865OooO00o = sharedPreferences;
        Object obj = ContextCompat.f5281OooO00o;
        File file = new File(ContextCompat.OooO0OO.OooO0OO(context), "com.google.android.gms.appid-no-backup");
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
                OooO0O0();
            }
        } catch (IOException e) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Error creating file in no backup dir: " + e.getMessage());
            }
        }
    }

    public static String OooO00o(String str, String str2) {
        return str + "|T|" + str2 + "|*";
    }

    public final synchronized void OooO0O0() {
        this.f19865OooO00o.edit().clear().commit();
    }
}
