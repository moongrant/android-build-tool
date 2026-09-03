package p381o0OOoOOO;

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
import org.conscrypt.EvpMdRef;
import p088o000o00.OooOO0;
import p142o00OOooO.o00Oo0;
import p351o0OOOOo.OooOOO;
import p375o0OOo0oo.o0OOO0o;
import p377o0OOoO00.Oooo000;
import p382o0OOoOo.o00000;

/* JADX INFO: loaded from: classes2.dex */
public final class oo0o0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO f38831OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final oo0oOO0 f38832OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Rpc f38833OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0OOO0o<o00000> f38834OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final p377o0OOoO00.OooOOO f38835OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0OOO0o<HeartBeatInfo> f38836OooO0o0;

    public oo0o0O0(OooOOO oooOOO, oo0oOO0 oo0ooo0, o0OOO0o<o00000> o0ooo0o2, o0OOO0o<HeartBeatInfo> o0ooo0o3, p377o0OOoO00.OooOOO oooOOO2) {
        oooOOO.OooO00o();
        Rpc rpc = new Rpc(oooOOO.f38263OooO00o);
        this.f38831OooO00o = oooOOO;
        this.f38832OooO0O0 = oo0ooo0;
        this.f38833OooO0OO = rpc;
        this.f38834OooO0Oo = o0ooo0o2;
        this.f38836OooO0o0 = o0ooo0o3;
        this.f38835OooO0o = oooOOO2;
    }

    public final Task<String> OooO00o(Task<Bundle> task) {
        return task.continueWith(OooOO0.f28598Oooo0o, new o00Oo0(this, 2));
    }

    public final void OooO0O0(String str, String str2, Bundle bundle) throws ExecutionException, InterruptedException {
        int i;
        String str3;
        String strEncodeToString;
        HeartBeatInfo.HeartBeat heartBeatOooO0O0;
        PackageInfo packageInfoOooO0OO;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        OooOOO oooOOO = this.f38831OooO00o;
        oooOOO.OooO00o();
        bundle.putString("gmp_app_id", oooOOO.f38265OooO0OO.f38283OooO0O0);
        oo0oOO0 oo0ooo0 = this.f38832OooO0O0;
        synchronized (oo0ooo0) {
            if (oo0ooo0.f38840OooO0Oo == 0 && (packageInfoOooO0OO = oo0ooo0.OooO0OO("com.google.android.gms")) != null) {
                oo0ooo0.f38840OooO0Oo = packageInfoOooO0OO.versionCode;
            }
            i = oo0ooo0.f38840OooO0Oo;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.f38832OooO0O0.OooO00o());
        oo0oOO0 oo0ooo1 = this.f38832OooO0O0;
        synchronized (oo0ooo1) {
            if (oo0ooo1.f38839OooO0OO == null) {
                oo0ooo1.OooO0o0();
            }
            str3 = oo0ooo1.f38839OooO0OO;
        }
        bundle.putString("app_ver_name", str3);
        OooOOO oooOOO2 = this.f38831OooO00o;
        oooOOO2.OooO00o();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance(EvpMdRef.SHA1.JCA_NAME).digest(oooOOO2.f38264OooO0O0.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strOooO00o = ((Oooo000) Tasks.await(this.f38835OooO0o.getToken())).OooO00o();
            if (TextUtils.isEmpty(strOooO00o)) {
                Log.w("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strOooO00o);
            }
        } catch (InterruptedException | ExecutionException e) {
            Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString(AppsFlyerProperties.APP_ID, (String) Tasks.await(this.f38835OooO0o.getId()));
        bundle.putString("cliv", "fcm-23.0.8");
        HeartBeatInfo heartBeatInfo = this.f38836OooO0o0.get();
        o00000 o00000Var = this.f38834OooO0Oo.get();
        if (heartBeatInfo == null || o00000Var == null || (heartBeatOooO0O0 = heartBeatInfo.OooO0O0()) == HeartBeatInfo.HeartBeat.NONE) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(heartBeatOooO0O0.OooO00o()));
        bundle.putString("Firebase-Client", o00000Var.OooO00o());
    }

    public final Task<Bundle> OooO0OO(String str, String str2, Bundle bundle) {
        try {
            OooO0O0(str, str2, bundle);
            return this.f38833OooO0OO.send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }
}
