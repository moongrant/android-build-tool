package com.google.android.exoplayer2.video.spherical;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class Projection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f14378OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f14379OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f14380OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f14381OooO0Oo;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0[] f14382OooO00o;

        public OooO00o(OooO0O0... oooO0O0Arr) {
            this.f14382OooO00o = oooO0O0Arr;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f14383OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f14384OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float[] f14385OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float[] f14386OooO0Oo;

        public OooO0O0(float[] fArr, int i, float[] fArr2, int i2) {
            this.f14383OooO00o = i;
            o00O000o.OooO00o(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f14385OooO0OO = fArr;
            this.f14386OooO0Oo = fArr2;
            this.f14384OooO0O0 = i2;
        }
    }

    public Projection() {
        throw null;
    }

    public Projection(OooO00o oooO00o, OooO00o oooO00o2, int i) {
        this.f14378OooO00o = oooO00o;
        this.f14379OooO0O0 = oooO00o2;
        this.f14380OooO0OO = i;
        this.f14381OooO0Oo = oooO00o == oooO00o2;
    }
}
