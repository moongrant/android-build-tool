package com.google.android.exoplayer2;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class PlaybackException extends Exception implements OooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final int f11340OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f11341OooO0o0;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final String f11336OooO0o = o0O00.Oooo00O(0);

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final String f11337OooO0oO = o0O00.Oooo00O(1);

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static final String f11338OooO0oo = o0O00.Oooo00O(2);

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static final String f11335OooO = o0O00.Oooo00O(3);

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final String f11339OooOO0 = o0O00.Oooo00O(4);

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ErrorCode {
    }

    public PlaybackException(@Nullable String str, @Nullable Throwable th, int i, long j) {
        super(str, th);
        this.f11340OooO0Oo = i;
        this.f11341OooO0o0 = j;
    }

    @CallSuper
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putInt(f11336OooO0o, this.f11340OooO0Oo);
        bundle.putLong(f11337OooO0oO, this.f11341OooO0o0);
        bundle.putString(f11338OooO0oo, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f11335OooO, cause.getClass().getName());
            bundle.putString(f11339OooOO0, cause.getMessage());
        }
        return bundle;
    }
}
