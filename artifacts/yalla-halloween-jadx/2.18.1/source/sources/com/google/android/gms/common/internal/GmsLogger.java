package com.google.android.gms.common.internal;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.FormatMethod;
import com.google.errorprone.annotations.FormatString;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public final class GmsLogger {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final String f15587OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public final String f15588OooO0O0;

    @KeepForSdk
    public GmsLogger(@NonNull String str) {
        this(str, null);
    }

    public final String OooO00o(String str) {
        String str2 = this.f15588OooO0O0;
        return str2 == null ? str : str2.concat(str);
    }

    @KeepForSdk
    public boolean canLog(int i) {
        return Log.isLoggable(this.f15587OooO00o, i);
    }

    @KeepForSdk
    public boolean canLogPii() {
        return false;
    }

    @KeepForSdk
    public void d(@NonNull String str, @NonNull String str2) {
        if (canLog(3)) {
            Log.d(str, OooO00o(str2));
        }
    }

    @KeepForSdk
    public void e(@NonNull String str, @NonNull String str2) {
        if (canLog(6)) {
            Log.e(str, OooO00o(str2));
        }
    }

    @KeepForSdk
    @FormatMethod
    public void efmt(@NonNull String str, @NonNull @FormatString String str2, @NonNull Object... objArr) {
        if (canLog(6)) {
            String strConcat = String.format(str2, objArr);
            String str3 = this.f15588OooO0O0;
            if (str3 != null) {
                strConcat = str3.concat(strConcat);
            }
            Log.e(str, strConcat);
        }
    }

    @KeepForSdk
    public void i(@NonNull String str, @NonNull String str2) {
        if (canLog(4)) {
            Log.i(str, OooO00o(str2));
        }
    }

    @KeepForSdk
    public void pii(@NonNull String str, @NonNull String str2) {
    }

    @KeepForSdk
    public void pii(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
    }

    @KeepForSdk
    public void v(@NonNull String str, @NonNull String str2) {
        if (canLog(2)) {
            Log.v(str, OooO00o(str2));
        }
    }

    @KeepForSdk
    public void w(@NonNull String str, @NonNull String str2) {
        if (canLog(5)) {
            Log.w(str, OooO00o(str2));
        }
    }

    @KeepForSdk
    @FormatMethod
    public void wfmt(@NonNull String str, @NonNull @FormatString String str2, @NonNull Object... objArr) {
        if (canLog(5)) {
            String str3 = this.f15587OooO00o;
            String strConcat = String.format(str2, objArr);
            String str4 = this.f15588OooO0O0;
            if (str4 != null) {
                strConcat = str4.concat(strConcat);
            }
            Log.w(str3, strConcat);
        }
    }

    @KeepForSdk
    public void wtf(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (canLog(7)) {
            Log.e(str, OooO00o(str2), th);
            Log.wtf(str, OooO00o(str2), th);
        }
    }

    @KeepForSdk
    public GmsLogger(@NonNull String str, @Nullable String str2) {
        Preconditions.checkNotNull(str, "log tag cannot be null");
        Preconditions.checkArgument(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
        this.f15587OooO00o = str;
        if (str2 == null || str2.length() <= 0) {
            this.f15588OooO0O0 = null;
        } else {
            this.f15588OooO0O0 = str2;
        }
    }

    @KeepForSdk
    public void d(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (canLog(3)) {
            Log.d(str, OooO00o(str2), th);
        }
    }

    @KeepForSdk
    public void e(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (canLog(6)) {
            Log.e(str, OooO00o(str2), th);
        }
    }

    @KeepForSdk
    public void i(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (canLog(4)) {
            Log.i(str, OooO00o(str2), th);
        }
    }

    @KeepForSdk
    public void v(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (canLog(2)) {
            Log.v(str, OooO00o(str2), th);
        }
    }

    @KeepForSdk
    public void w(@NonNull String str, @NonNull String str2, @NonNull Throwable th) {
        if (canLog(5)) {
            Log.w(str, OooO00o(str2), th);
        }
    }
}
