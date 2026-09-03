package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.OooOO0;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p090o000o00o.o0O00000;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class Track {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public final long[] f8777OooO;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final int f8778OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final int f8779OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final long f8780OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final long f8781OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooOO0 f8782OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f8783OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final int f8784OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public final long[] f8785OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final int f8786OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @Nullable
    public final o0O00000[] f8787OooOO0O;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Transformation {
    }

    public Track(int i, int i2, long j, long j2, long j3, OooOO0 oooOO1, int i3, @Nullable o0O00000[] o0o00000Arr, int i4, @Nullable long[] jArr, @Nullable long[] jArr2) {
        this.f8778OooO00o = i;
        this.f8779OooO0O0 = i2;
        this.f8780OooO0OO = j;
        this.f8781OooO0Oo = j2;
        this.f8783OooO0o0 = j3;
        this.f8782OooO0o = oooOO1;
        this.f8784OooO0oO = i3;
        this.f8787OooOO0O = o0o00000Arr;
        this.f8786OooOO0 = i4;
        this.f8785OooO0oo = jArr;
        this.f8777OooO = jArr2;
    }
}
