package p285o0O0OOoo;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import p281o0O0O0oO.OooOO0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOO0 f42169OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f42172OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public final Boolean f42174OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f42170OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final TaskCompletionSource<Void> f42171OooO0OO = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final TaskCompletionSource<Void> f42173OooO0o = new TaskCompletionSource<>();

    public o000OO(OooOO0 oooOO1) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f42172OooO0Oo = false;
        oooOO1.OooO00o();
        Context context = oooOO1.f41949OooO00o;
        this.f42169OooO00o = oooOO1;
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.crashlytics", 0);
        if (sharedPreferences.contains("firebase_crashlytics_collection_enabled")) {
            this.f42172OooO0Oo = false;
            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("firebase_crashlytics_collection_enabled", true));
        } else {
            boolValueOf = null;
        }
        if (boolValueOf == null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                boolValueOf2 = (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_crashlytics_collection_enabled")) ? null : Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_crashlytics_collection_enabled"));
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("FirebaseCrashlytics", "Could not read data collection permission from manifest", e);
            }
            if (boolValueOf2 == null) {
                this.f42172OooO0Oo = false;
                boolValueOf = null;
            } else {
                this.f42172OooO0Oo = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f42174OooO0o0 = boolValueOf;
        synchronized (this.f42170OooO0O0) {
            if (OooO00o()) {
                this.f42171OooO0OO.trySetResult(null);
            }
        }
    }

    public final synchronized boolean OooO00o() {
        boolean zBooleanValue;
        Boolean bool = this.f42174OooO0o0;
        zBooleanValue = bool != null ? bool.booleanValue() : this.f42169OooO00o.OooO0oo();
        OooO0O0(zBooleanValue);
        return zBooleanValue;
    }

    public final void OooO0O0(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.f42174OooO0o0 == null) {
            str = "global Firebase setting";
        } else {
            str = this.f42172OooO0Oo ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String str3 = String.format("Crashlytics automatic data collection %s by %s.", str2, str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str3, null);
        }
    }
}
