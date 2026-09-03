package com.google.android.gms.common.config;

import android.os.Binder;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.VisibleForTesting;
import p332o0O0oooo.o0OOo000;
import p332o0O0oooo.o0o0000;
import p332o0O0oooo.o0oo0000;
import p332o0O0oooo.oO0Oo;
import p332o0O0oooo.ooo0Oo0;

/* JADX INFO: loaded from: classes2.dex */
@KeepForSdk
public abstract class GservicesValue<T> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Object f15444OooO0Oo = new Object();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final String f15445OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Object f15446OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Object f15447OooO0OO = null;

    public GservicesValue(@NonNull String str, @NonNull Object obj) {
        this.f15445OooO00o = str;
        this.f15446OooO0O0 = obj;
    }

    @KeepForSdk
    public static boolean isInitialized() {
        synchronized (f15444OooO0Oo) {
        }
        return false;
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Float> value(@NonNull String str, @NonNull Float f) {
        return new o0oo0000(str, f);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Integer> value(@NonNull String str, @NonNull Integer num) {
        return new oO0Oo(str, num);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Long> value(@NonNull String str, @NonNull Long l) {
        return new o0o0000(str, l);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<String> value(@NonNull String str, @NonNull String str2) {
        return new ooo0Oo0(str, str2);
    }

    @NonNull
    @KeepForSdk
    public static GservicesValue<Boolean> value(@NonNull String str, boolean z) {
        return new o0OOo000(str, Boolean.valueOf(z));
    }

    @NonNull
    public abstract Object OooO00o();

    @NonNull
    @KeepForSdk
    public final T get() {
        T t = (T) this.f15447OooO0OO;
        if (t != null) {
            return t;
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        Object obj = f15444OooO0Oo;
        synchronized (obj) {
        }
        synchronized (obj) {
            try {
            } catch (Throwable th) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th;
            }
        }
        try {
            T t2 = (T) OooO00o();
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
            return t2;
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                T t3 = (T) OooO00o();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                return t3;
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        }
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public final T getBinderSafe() {
        return get();
    }

    @VisibleForTesting
    @KeepForSdk
    public void override(@NonNull T t) {
        Log.w("GservicesValue", "GservicesValue.override(): test should probably call initForTests() first");
        this.f15447OooO0OO = t;
        Object obj = f15444OooO0Oo;
        synchronized (obj) {
            synchronized (obj) {
            }
        }
    }

    @VisibleForTesting
    @KeepForSdk
    public void resetOverride() {
        this.f15447OooO0OO = null;
    }
}
