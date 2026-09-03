package com.google.firebase.messaging;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.heartbeatinfo.HeartBeatInfo;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
import p314o0O0oOo0.o000OO0O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p281o0O0O0oO.OooOO0 f20376OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0O0O00 f20377OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rpc f20378OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p298o0O0o00o.OooO0OO<o000OO0O> f20379OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o0O0o0.OooO f20380OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p298o0O0o00o.OooO0OO<HeartBeatInfo> f20381OooO0o0;

    public o0OOO0o(p281o0O0O0oO.OooOO0 oooOO1, o0O0O00 o0o0o00, p298o0O0o00o.OooO0OO<o000OO0O> oooO0OO, p298o0O0o00o.OooO0OO<HeartBeatInfo> oooO0OO2, o0O0o0.OooO oooO) {
        oooOO1.OooO00o();
        Rpc rpc = new Rpc(oooOO1.f41949OooO00o);
        this.f20376OooO00o = oooOO1;
        this.f20377OooO0O0 = o0o0o00;
        this.f20378OooO0OO = rpc;
        this.f20379OooO0Oo = oooO0OO;
        this.f20381OooO0o0 = oooO0OO2;
        this.f20380OooO0o = oooO;
    }

    public final Task<String> OooO00o(Task<Bundle> task) {
        return task.continueWith(new androidx.arch.core.executor.OooO00o(1), new o0ooOOo(this));
    }

    public final void OooO0O0(Bundle bundle, String str, String str2) throws ExecutionException, InterruptedException {
        int i;
        String strEncodeToString;
        HeartBeatInfo.HeartBeat heartBeatOooO0O0;
        PackageInfo packageInfoOooO0Oo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        p281o0O0O0oO.OooOO0 oooOO1 = this.f20376OooO00o;
        oooOO1.OooO00o();
        bundle.putString("gmp_app_id", oooOO1.f41951OooO0OO.f41961OooO0O0);
        o0O0O00 o0o0o00 = this.f20377OooO0O0;
        synchronized (o0o0o00) {
            if (o0o0o00.f20374OooO0Oo == 0 && (packageInfoOooO0Oo = o0o0o00.OooO0Oo("com.google.android.gms")) != null) {
                o0o0o00.f20374OooO0Oo = packageInfoOooO0Oo.versionCode;
            }
            i = o0o0o00.f20374OooO0Oo;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f20377OooO0O0.OooO00o());
        bundle.putString("app_ver_name", this.f20377OooO0O0.OooO0O0());
        p281o0O0O0oO.OooOO0 oooOO2 = this.f20376OooO00o;
        oooOO2.OooO00o();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(oooOO2.f41950OooO0O0.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strOooO00o = ((o0O0o0.OooOOO) Tasks.await(this.f20380OooO0o.getToken())).OooO00o();
            if (TextUtils.isEmpty(strOooO00o)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strOooO00o);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(this.f20380OooO0o.getId()));
        bundle.putString("cliv", "fcm-23.1.2");
        HeartBeatInfo heartBeatInfo = this.f20381OooO0o0.get();
        o000OO0O o000oo0o2 = this.f20379OooO0Oo.get();
        if (heartBeatInfo == null || o000oo0o2 == null || (heartBeatOooO0O0 = heartBeatInfo.OooO0O0()) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatOooO0O0.OooO00o()));
        bundle.putString("Firebase-Client", o000oo0o2.OooO00o());
    }

    public final Task OooO0OO(Bundle bundle, String str, String str2) {
        try {
            OooO0O0(bundle, str, str2);
            return this.f20378OooO0OO.send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }
}
