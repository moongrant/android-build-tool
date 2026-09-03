package com.google.android.exoplayer2;

import Oooo000.o00O0O;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.android.billingclient.api.o0OO00O;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p310o0O0o0oo.o00O00O;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlaybackException extends Exception {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public final Format f13112Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final int f13113Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public final String f13114Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final int f13115Oooo0oo;

    /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
    @Nullable
    public final o00O00O.OooO00o f13116OoooO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final int f13117OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final int f13118OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public final long f13119OoooO0O;

    /* JADX INFO: renamed from: OoooOO0, reason: collision with root package name */
    @Nullable
    public final Throwable f13120OoooOO0;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimeoutOperation {
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    public ExoPlaybackException(int i, Throwable th) {
        this(i, th, null, -1, null, 4, 0);
    }

    @CheckResult
    public final ExoPlaybackException OooO00o(@Nullable o00O00O.OooO00o oooO00o) {
        return new ExoPlaybackException(getMessage(), this.f13120OoooOO0, this.f13113Oooo0o, this.f13114Oooo0oO, this.f13115Oooo0oo, this.f13112Oooo, this.f13118OoooO00, oooO00o, this.f13117OoooO0, this.f13119OoooO0O);
    }

    public ExoPlaybackException(@Nullable String str, @Nullable Throwable th, int i, @Nullable String str2, int i2, @Nullable Format format, int i3, @Nullable o00O00O.OooO00o oooO00o, int i4, long j) {
        super(str, th);
        this.f13113Oooo0o = i;
        this.f13120OoooOO0 = th;
        this.f13114Oooo0oO = str2;
        this.f13115Oooo0oo = i2;
        this.f13112Oooo = format;
        this.f13118OoooO00 = i3;
        this.f13116OoooO = oooO00o;
        this.f13117OoooO0 = i4;
        this.f13119OoooO0O = j;
    }

    public ExoPlaybackException(int i, @Nullable Throwable th, @Nullable String str, int i2, @Nullable Format format, int i3, int i4) {
        String string;
        String str2;
        if (i == 0) {
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? i != 4 ? i != 5 ? "Unexpected runtime error" : "Timeout error" : "Out of memory error" : "Remote error";
        } else {
            String strValueOf = String.valueOf(format);
            if (i3 == 0) {
                str2 = "NO";
            } else if (i3 == 1) {
                str2 = "NO_UNSUPPORTED_TYPE";
            } else if (i3 == 2) {
                str2 = "NO_UNSUPPORTED_DRM";
            } else if (i3 == 3) {
                str2 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i3 != 4) {
                    throw new IllegalStateException();
                }
                str2 = "YES";
            }
            StringBuilder sb = new StringBuilder(str2.length() + strValueOf.length() + o0OO00O.OooO00o(str, 53));
            sb.append(str);
            sb.append(" error, index=");
            sb.append(i2);
            sb.append(", format=");
            string = o00O0O.OooO0O0(sb, strValueOf, ", format_supported=", str2);
        }
        if (!TextUtils.isEmpty(null)) {
            String strValueOf2 = String.valueOf(string);
            StringBuilder sb2 = new StringBuilder("null".length() + strValueOf2.length() + 2);
            sb2.append(strValueOf2);
            sb2.append(": ");
            sb2.append((String) null);
            string = sb2.toString();
        }
        this(string, th, i, str, i2, format, i3, null, i4, SystemClock.elapsedRealtime());
    }
}
