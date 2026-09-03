package com.google.android.exoplayer2;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p226o00oOo00.o0000oo;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ExoPlaybackException extends PlaybackException {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final int f10921OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @Nullable
    public final String f10922OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    @Nullable
    public final OooOo f10923OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final int f10924OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final int f10925OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    @Nullable
    public final o0000oo f10926OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final boolean f10927OooOOo0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final String f10915OooOOo = o0O00.Oooo00O(1001);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public static final String f10916OooOOoo = o0O00.Oooo00O(1002);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public static final String f10918OooOo00 = o0O00.Oooo00O(1003);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public static final String f10917OooOo0 = o0O00.Oooo00O(1004);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final String f10919OooOo0O = o0O00.Oooo00O(1005);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final String f10920OooOo0o = o0O00.Oooo00O(1006);

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public ExoPlaybackException() {
        throw null;
    }

    public ExoPlaybackException(int i, Throwable th, int i2) {
        this(i, th, i2, null, -1, null, 4, false);
    }

    @CheckResult
    public final ExoPlaybackException OooO00o(@Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0) {
        return new ExoPlaybackException(getMessage(), getCause(), this.f11340OooO0Oo, this.f10921OooOO0O, this.f10922OooOO0o, this.f10924OooOOO0, this.f10923OooOOO, this.f10925OooOOOO, oooO0O0, this.f11341OooO0o0, this.f10927OooOOo0);
    }

    @Override // com.google.android.exoplayer2.PlaybackException, com.google.android.exoplayer2.OooO
    public final Bundle toBundle() {
        Bundle bundle = super.toBundle();
        bundle.putInt(f10915OooOOo, this.f10921OooOO0O);
        bundle.putString(f10916OooOOoo, this.f10922OooOO0o);
        bundle.putInt(f10918OooOo00, this.f10924OooOOO0);
        OooOo oooOo = this.f10923OooOOO;
        if (oooOo != null) {
            bundle.putBundle(f10917OooOo0, oooOo.OooO0o0(false));
        }
        bundle.putInt(f10919OooOo0O, this.f10925OooOOOO);
        bundle.putBoolean(f10920OooOo0o, this.f10927OooOOo0);
        return bundle;
    }

    public ExoPlaybackException(String str, @Nullable Throwable th, int i, int i2, @Nullable String str2, int i3, @Nullable OooOo oooOo, int i4, @Nullable com.google.android.exoplayer2.source.OooOOOO.OooO0O0 oooO0O0, long j, boolean z) {
        super(str, th, i, j);
        o00O000o.OooO00o(!z || i2 == 1);
        o00O000o.OooO00o(th != null || i2 == 3);
        this.f10921OooOO0O = i2;
        this.f10922OooOO0o = str2;
        this.f10924OooOOO0 = i3;
        this.f10923OooOOO = oooOo;
        this.f10925OooOOOO = i4;
        this.f10926OooOOOo = oooO0O0;
        this.f10927OooOOo0 = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExoPlaybackException(int i, @Nullable Throwable th, int i2, @Nullable String str, int i3, @Nullable OooOo oooOo, int i4, boolean z) {
        String string;
        String str2;
        if (i == 0) {
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i3);
            sb.append(", format=");
            sb.append(oooOo);
            sb.append(", format_supported=");
            int i5 = o0O00.f40595OooO00o;
            if (i4 == 0) {
                str2 = "NO";
            } else if (i4 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i4 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    throw new IllegalStateException();
                }
                str2 = "YES";
            }
            sb.append(str2);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : androidx.camera.core.impl.OooOOOO.OooO00o(string, ": null"), th, i2, i, str, i3, oooOo, i4, null, SystemClock.elapsedRealtime(), z);
    }
}
