package androidx.media3.exoplayer.video.spherical;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import p080o000OoO.o00Oo0;

/* JADX INFO: loaded from: classes2.dex */
public final class Projection {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o f8323OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO00o f8324OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final int f8325OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final boolean f8326OooO0Oo;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DrawMode {
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0[] f8327OooO00o;

        public OooO00o(OooO0O0... oooO0O0Arr) {
            this.f8327OooO00o = oooO0O0Arr;
        }
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final int f8328OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final int f8329OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final float[] f8330OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final float[] f8331OooO0Oo;

        public OooO0O0(float[] fArr, int i, float[] fArr2, int i2) {
            this.f8328OooO00o = i;
            o00Oo0.OooO00o(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
            this.f8330OooO0OO = fArr;
            this.f8331OooO0Oo = fArr2;
            this.f8329OooO0O0 = i2;
        }
    }

    public Projection() {
        throw null;
    }

    public Projection(OooO00o oooO00o, OooO00o oooO00o2, int i) {
        this.f8323OooO00o = oooO00o;
        this.f8324OooO0O0 = oooO00o2;
        this.f8325OooO0OO = i;
        this.f8326OooO0Oo = oooO00o == oooO00o2;
    }
}
