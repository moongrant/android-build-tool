package com.google.android.gms.common.logging;

import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public class Logger {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f14702OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f14703OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f14704OooO0OO;

    @KeepForSdk
    public Logger(@NonNull String str, @NonNull String... strArr) {
        String string;
        if (strArr.length == 0) {
            string = "";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (String str2 : strArr) {
                if (sb.length() > 1) {
                    sb.append(",");
                }
                sb.append(str2);
            }
            sb.append("] ");
            string = sb.toString();
        }
        this.f14703OooO0O0 = string;
        this.f14702OooO00o = str;
        new GmsLogger(str);
        int i = 2;
        while (i <= 7 && !Log.isLoggable(this.f14702OooO00o, i)) {
            i++;
        }
        this.f14704OooO0OO = i;
    }

    @NonNull
    @KeepForSdk
    public final String OooO00o(@NonNull String str, @NonNull Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            str = String.format(Locale.US, str, objArr);
        }
        return this.f14703OooO0O0.concat(str);
    }

    @KeepForSdk
    public void d(@NonNull String str, @NonNull Object... objArr) {
        if (isLoggable(3)) {
            Log.d(this.f14702OooO00o, OooO00o(str, objArr));
        }
    }

    @KeepForSdk
    public void e(@NonNull String str, @NonNull Throwable th, @NonNull Object... objArr) {
        Log.e(this.f14702OooO00o, OooO00o(str, objArr), th);
    }

    @NonNull
    @KeepForSdk
    public String getTag() {
        return this.f14702OooO00o;
    }

    @KeepForSdk
    public void i(@NonNull String str, @NonNull Object... objArr) {
        Log.i(this.f14702OooO00o, OooO00o(str, objArr));
    }

    @KeepForSdk
    public boolean isLoggable(int i) {
        return this.f14704OooO0OO <= i;
    }

    @KeepForSdk
    public void v(@NonNull String str, @NonNull Throwable th, @NonNull Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.f14702OooO00o, OooO00o(str, objArr), th);
        }
    }

    @KeepForSdk
    public void w(@NonNull String str, @NonNull Object... objArr) {
        Log.w(this.f14702OooO00o, OooO00o(str, objArr));
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull Throwable th, @NonNull Object... objArr) {
        Log.wtf(this.f14702OooO00o, OooO00o(str, objArr), th);
    }

    @KeepForSdk
    public void e(@NonNull String str, @NonNull Object... objArr) {
        Log.e(this.f14702OooO00o, OooO00o(str, objArr));
    }

    @KeepForSdk
    public void wtf(@NonNull Throwable th) {
        Log.wtf(this.f14702OooO00o, th);
    }

    @KeepForSdk
    public void v(@NonNull String str, @NonNull Object... objArr) {
        if (isLoggable(2)) {
            Log.v(this.f14702OooO00o, OooO00o(str, objArr));
        }
    }
}
