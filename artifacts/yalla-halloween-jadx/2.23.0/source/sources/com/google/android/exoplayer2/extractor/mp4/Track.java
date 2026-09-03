package com.google.android.exoplayer2.extractor.mp4;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.OooOo;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p214o00oO00o.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Track {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final long[] f12085OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f12086OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f12087OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f12088OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f12089OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOo f12090OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f12091OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f12092OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final long[] f12093OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f12094OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final o000Oo0[] f12095OooOO0O;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    public Track(int i, int i2, long j, long j2, long j3, OooOo oooOo, int i3, @Nullable o000Oo0[] o000oo0Arr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f12086OooO00o = i;
        this.f12087OooO0O0 = i2;
        this.f12088OooO0OO = j;
        this.f12089OooO0Oo = j2;
        this.f12091OooO0o0 = j3;
        this.f12090OooO0o = oooOo;
        this.f12092OooO0oO = i3;
        this.f12095OooOO0O = o000oo0Arr;
        this.f12094OooOO0 = i4;
        this.f12093OooO0oo = jArr;
        this.f12085OooO = jArr2;
    }
}
