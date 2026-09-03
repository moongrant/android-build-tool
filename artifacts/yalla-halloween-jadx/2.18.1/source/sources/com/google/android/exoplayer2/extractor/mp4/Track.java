package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p300o0O0OooO.o000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class Track {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final long[] f14018OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f14019OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f14020OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f14021OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f14022OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final Format f14023OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f14024OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f14025OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final long[] f14026OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f14027OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final o000O0[] f14028OooOO0O;

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    public Track(int i, int i2, long j, long j2, long j3, Format format, int i3, @Nullable o000O0[] o000o0Arr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f14019OooO00o = i;
        this.f14020OooO0O0 = i2;
        this.f14021OooO0OO = j;
        this.f14022OooO0Oo = j2;
        this.f14024OooO0o0 = j3;
        this.f14023OooO0o = format;
        this.f14025OooO0oO = i3;
        this.f14028OooOO0O = o000o0Arr;
        this.f14027OooOO0 = i4;
        this.f14026OooO0oo = jArr;
        this.f14018OooO = jArr2;
    }

    @Nullable
    public final o000O0 OooO00o(int i) {
        o000O0[] o000o0Arr = this.f14028OooOO0O;
        if (o000o0Arr == null) {
            return null;
        }
        return o000o0Arr[i];
    }
}
