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
import p106o000ooO.o00O00OO;

/* JADX INFO: loaded from: classes3.dex */
public final class o00Ooo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final p626o0ooO.o0OOO0o f19897OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final o0OOO0o f19898OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rpc f19899OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final p301o0O0o0O.OooO0o<p315o0O0oOo.o0000O> f19900OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final p302o0O0o0OO.o0000O0O f19901OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p301o0O0o0O.OooO0o<HeartBeatInfo> f19902OooO0o0;

    public o00Ooo(p626o0ooO.o0OOO0o o0ooo0o2, o0OOO0o o0ooo0o3, p301o0O0o0O.OooO0o<p315o0O0oOo.o0000O> oooO0o, p301o0O0o0O.OooO0o<HeartBeatInfo> oooO0o2, p302o0O0o0OO.o0000O0O o0000o0o2) {
        o0ooo0o2.OooO00o();
        Rpc rpc = new Rpc(o0ooo0o2.f57662OooO00o);
        this.f19897OooO00o = o0ooo0o2;
        this.f19898OooO0O0 = o0ooo0o3;
        this.f19899OooO0OO = rpc;
        this.f19900OooO0Oo = oooO0o;
        this.f19902OooO0o0 = oooO0o2;
        this.f19901OooO0o = o0000o0o2;
    }

    public final Task<String> OooO00o(Task<Bundle> task) {
        return task.continueWith(new o00O00OO(), new androidx.media3.session.o00oO0o(this));
    }

    public final void OooO0O0(Bundle bundle, String str, String str2) throws ExecutionException, InterruptedException {
        int i;
        String strEncodeToString;
        HeartBeatInfo.HeartBeat heartBeatOooO0O0;
        PackageInfo packageInfoOooO0Oo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        p626o0ooO.o0OOO0o o0ooo0o2 = this.f19897OooO00o;
        o0ooo0o2.OooO00o();
        bundle.putString("gmp_app_id", o0ooo0o2.f57664OooO0OO.f57675OooO0O0);
        o0OOO0o o0ooo0o3 = this.f19898OooO0O0;
        synchronized (o0ooo0o3) {
            if (o0ooo0o3.f19910OooO0Oo == 0 && (packageInfoOooO0Oo = o0ooo0o3.OooO0Oo("com.google.android.gms")) != null) {
                o0ooo0o3.f19910OooO0Oo = packageInfoOooO0Oo.versionCode;
            }
            i = o0ooo0o3.f19910OooO0Oo;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f19898OooO0O0.OooO00o());
        bundle.putString("app_ver_name", this.f19898OooO0O0.OooO0O0());
        p626o0ooO.o0OOO0o o0ooo0o4 = this.f19897OooO00o;
        o0ooo0o4.OooO00o();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(o0ooo0o4.f57663OooO0O0.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strOooO00o = ((p302o0O0o0OO.o000) Tasks.await(this.f19901OooO0o.getToken())).OooO00o();
            if (TextUtils.isEmpty(strOooO00o)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strOooO00o);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(this.f19901OooO0o.getId()));
        bundle.putString("cliv", "fcm-23.1.2");
        HeartBeatInfo heartBeatInfo = this.f19902OooO0o0.get();
        p315o0O0oOo.o0000O o0000o2 = this.f19900OooO0Oo.get();
        if (heartBeatInfo == null || o0000o2 == null || (heartBeatOooO0O0 = heartBeatInfo.OooO0O0()) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatOooO0O0.OooO00o()));
        bundle.putString("Firebase-Client", o0000o2.OooO00o());
    }

    public final Task OooO0OO(Bundle bundle, String str, String str2) {
        try {
            OooO0O0(bundle, str, str2);
            return this.f19899OooO0OO.send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }
}
