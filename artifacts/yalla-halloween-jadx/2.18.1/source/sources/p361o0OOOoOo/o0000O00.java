package p361o0OOOoOo;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;
import p351o0OOOOo.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000O00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO f38449OooO00o;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f38452OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Boolean f38454OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f38450OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public TaskCompletionSource<Void> f38451OooO0OO = new TaskCompletionSource<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final TaskCompletionSource<Void> f38453OooO0o = new TaskCompletionSource<>();

    public o0000O00(OooOOO oooOOO) {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        this.f38452OooO0Oo = false;
        oooOOO.OooO00o();
        Context context = oooOOO.f38263OooO00o;
        this.f38449OooO00o = oooOOO;
        SharedPreferences sharedPreferencesOooO0oO = Oooo0.OooO0oO(context);
        if (sharedPreferencesOooO0oO.contains("firebase_crashlytics_collection_enabled")) {
            this.f38452OooO0Oo = false;
            boolValueOf = Boolean.valueOf(sharedPreferencesOooO0oO.getBoolean("firebase_crashlytics_collection_enabled", true));
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
                this.f38452OooO0Oo = false;
                boolValueOf = null;
            } else {
                this.f38452OooO0Oo = true;
                boolValueOf = Boolean.valueOf(Boolean.TRUE.equals(boolValueOf2));
            }
        }
        this.f38454OooO0o0 = boolValueOf;
        synchronized (this.f38450OooO0O0) {
            if (OooO00o()) {
                this.f38451OooO0OO.trySetResult(null);
            }
        }
    }

    public final synchronized boolean OooO00o() {
        boolean zBooleanValue;
        Boolean bool = this.f38454OooO0o0;
        zBooleanValue = bool != null ? bool.booleanValue() : this.f38449OooO00o.OooO0oO();
        OooO0O0(zBooleanValue);
        return zBooleanValue;
    }

    public final void OooO0O0(boolean z) {
        String str;
        String str2 = z ? "ENABLED" : "DISABLED";
        if (this.f38454OooO0o0 == null) {
            str = "global Firebase setting";
        } else {
            str = this.f38452OooO0Oo ? "firebase_crashlytics_collection_enabled manifest flag" : "API";
        }
        String str3 = String.format("Crashlytics automatic data collection %s by %s.", str2, str);
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str3, null);
        }
    }
}
