package androidx.media3.common;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes.dex */
public class PlaybackException extends Exception implements OooO0OO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f6698OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f6699OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f6693OooO0o = o00.Oooo00o(0);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f6694OooO0oO = o00.Oooo00o(1);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f6695OooO0oo = o00.Oooo00o(2);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f6692OooO = o00.Oooo00o(3);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f6696OooOO0 = o00.Oooo00o(4);

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @UnstableApi
    public static final androidx.compose.animation.Oooo000 f6697OooOO0O = new androidx.compose.animation.Oooo000();

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0051 A[PHI: r4
      0x0051: PHI (r4v6 java.lang.Throwable) = (r4v0 java.lang.Throwable), (r4v1 java.lang.Throwable) binds: [B:3:0x0017, B:7:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Illegal instructions before constructor call */
    @UnstableApi
    public PlaybackException(Bundle bundle) {
        RemoteException remoteException;
        Throwable th;
        String string = bundle.getString(f6695OooO0oo);
        String string2 = bundle.getString(f6692OooO);
        String string3 = bundle.getString(f6696OooOO0);
        Throwable th2 = null;
        if (TextUtils.isEmpty(string2)) {
            th = th2;
        } else {
            try {
                Class<?> cls = Class.forName(string2, true, PlaybackException.class.getClassLoader());
                th2 = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string3) : null;
                if (th2 == null) {
                    remoteException = new RemoteException(string3);
                    th = remoteException;
                } else {
                    th = th2;
                }
            } catch (Throwable unused) {
                remoteException = new RemoteException(string3);
            }
        }
        this(string, th, bundle.getInt(f6693OooO0o, 1000), bundle.getLong(f6694OooO0oO, SystemClock.elapsedRealtime()));
    }

    @Override // androidx.media3.common.OooO0OO
    @CallSuper
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f6693OooO0o, this.f6698OooO0Oo);
        bundle.putLong(f6694OooO0oO, this.f6699OooO0o0);
        bundle.putString(f6695OooO0oo, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f6692OooO, cause.getClass().getName());
            bundle.putString(f6696OooOO0, cause.getMessage());
        }
        return bundle;
    }

    @UnstableApi
    public PlaybackException(@Nullable String str, @Nullable Throwable th, int i, long j) {
        super(str, th);
        this.f6698OooO0Oo = i;
        this.f6699OooO0o0 = j;
    }
}
