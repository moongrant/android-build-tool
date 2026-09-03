package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class ClippingMediaSource extends o0ooOOo {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f7844OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f7845OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f7846OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f7847OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f7848OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final androidx.media3.common.Oooo0.OooO0o f7849OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final ArrayList<OooO0O0> f7850OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooO00o f7851OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f7852OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public IllegalClippingException f7853OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f7854OooOo0O;

    public static final class IllegalClippingException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalClippingException(int i) {
            super("Illegal clipping: ".concat(i != 0 ? i != 1 ? i != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count"));
        }
    }

    public static final class OooO00o extends o000O.OooOo00 {

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final long f7855OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final long f7856OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final long f7857OooOO0o;

        /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
        public final boolean f7858OooOOO0;

        public OooO00o(androidx.media3.common.Oooo0 oooo0, long j, long j2) throws IllegalClippingException {
            super(oooo0);
            boolean z = false;
            if (oooo0.OooOO0o() != 1) {
                throw new IllegalClippingException(0);
            }
            androidx.media3.common.Oooo0.OooO0o oooO0oOooOOo0 = oooo0.OooOOo0(0, new androidx.media3.common.Oooo0.OooO0o());
            long jMax = Math.max(0L, j);
            if (!oooO0oOooOOo0.f6679OooOOOO && jMax != 0 && !oooO0oOooOOo0.f6675OooOO0O) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? oooO0oOooOOo0.f6682OooOOo0 : Math.max(0L, j2);
            long j3 = oooO0oOooOOo0.f6682OooOOo0;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f7855OooOO0 = jMax;
            this.f7856OooOO0O = jMax2;
            this.f7857OooOO0o = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (oooO0oOooOOo0.f6676OooOO0o && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z = true;
            }
            this.f7858OooOOO0 = z;
        }

        @Override // o000O.OooOo00, androidx.media3.common.Oooo0
        public final androidx.media3.common.Oooo0.OooO0O0 OooOO0(int i, androidx.media3.common.Oooo0.OooO0O0 oooO0O0, boolean z) {
            this.f33844OooO.OooOO0(0, oooO0O0, z);
            long j = oooO0O0.f6645OooO0oo - this.f7855OooOO0;
            long j2 = this.f7857OooOO0o;
            oooO0O0.OooOOO0(oooO0O0.f6641OooO0Oo, oooO0O0.f6643OooO0o0, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, AdPlaybackState.f6176OooOO0, false);
            return oooO0O0;
        }

        @Override // o000O.OooOo00, androidx.media3.common.Oooo0
        public final androidx.media3.common.Oooo0.OooO0o OooOOo(int i, androidx.media3.common.Oooo0.OooO0o oooO0o, long j) {
            this.f33844OooO.OooOOo(0, oooO0o, 0L);
            long j2 = oooO0o.f6684OooOo00;
            long j3 = this.f7855OooOO0;
            oooO0o.f6684OooOo00 = j2 + j3;
            oooO0o.f6682OooOOo0 = this.f7857OooOO0o;
            oooO0o.f6676OooOO0o = this.f7858OooOOO0;
            long j4 = oooO0o.f6680OooOOOo;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                oooO0o.f6680OooOOOo = jMax;
                long j5 = this.f7856OooOO0O;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                oooO0o.f6680OooOOOo = jMax - j3;
            }
            long jO000oOoO = o00.o000oOoO(j3);
            long j6 = oooO0o.f6673OooO0oo;
            if (j6 != -9223372036854775807L) {
                oooO0o.f6673OooO0oo = j6 + jO000oOoO;
            }
            long j7 = oooO0o.f6668OooO;
            if (j7 != -9223372036854775807L) {
                oooO0o.f6668OooO = j7 + jO000oOoO;
            }
            return oooO0o;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClippingMediaSource(OooOOOO oooOOOO, long j, long j2, boolean z, boolean z2, boolean z3) {
        super(oooOOOO);
        oooOOOO.getClass();
        p080o000OoO.o00Oo0.OooO00o(j >= 0);
        this.f7844OooOO0o = j;
        this.f7846OooOOO0 = j2;
        this.f7845OooOOO = z;
        this.f7847OooOOOO = z2;
        this.f7848OooOOOo = z3;
        this.f7850OooOOo0 = new ArrayList<>();
        this.f7849OooOOo = new androidx.media3.common.Oooo0.OooO0o();
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final OooOOO OooO0OO(OooOOOO.OooO0O0 oooO0O0, p074o000OO0o.o00Oo0 o00oo1, long j) {
        OooO0O0 oooO0O1 = new OooO0O0(this.f8099OooOO0O.OooO0OO(oooO0O0, o00oo1, j), this.f7845OooOOO, this.f7852OooOo0, this.f7854OooOo0O);
        this.f7850OooOOo0.add(oooO0O1);
        return oooO0O1;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final void OooO0oO(OooOOO oooOOO) {
        ArrayList<OooO0O0> arrayList = this.f7850OooOOo0;
        p080o000OoO.o00Oo0.OooO0Oo(arrayList.remove(oooOOO));
        this.f8099OooOO0O.OooO0oO(((OooO0O0) oooOOO).f7880OooO0Oo);
        if (!arrayList.isEmpty() || this.f7847OooOOOO) {
            return;
        }
        OooO00o oooO00o = this.f7851OooOOoo;
        oooO00o.getClass();
        OooOoo0(oooO00o.f33844OooO);
    }

    @Override // androidx.media3.exoplayer.source.OooO0OO, androidx.media3.exoplayer.source.OooOOOO
    public final void OooOO0o() throws IOException {
        IllegalClippingException illegalClippingException = this.f7853OooOo00;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.OooOO0o();
    }

    @Override // androidx.media3.exoplayer.source.OooO0OO, androidx.media3.exoplayer.source.OooO00o
    public final void OooOOoo() {
        super.OooOOoo();
        this.f7853OooOo00 = null;
        this.f7851OooOOoo = null;
    }

    @Override // androidx.media3.exoplayer.source.o0ooOOo
    public final void OooOoO(androidx.media3.common.Oooo0 oooo0) {
        if (this.f7853OooOo00 != null) {
            return;
        }
        OooOoo0(oooo0);
    }

    public final void OooOoo0(androidx.media3.common.Oooo0 oooo0) {
        long j;
        long j2;
        long j3;
        androidx.media3.common.Oooo0.OooO0o oooO0o = this.f7849OooOOo;
        oooo0.OooOOo0(0, oooO0o);
        long j4 = oooO0o.f6684OooOo00;
        OooO00o oooO00o = this.f7851OooOOoo;
        long j5 = this.f7846OooOOO0;
        ArrayList<OooO0O0> arrayList = this.f7850OooOOo0;
        if (oooO00o == null || arrayList.isEmpty() || this.f7847OooOOOO) {
            boolean z = this.f7848OooOOOo;
            long j6 = this.f7844OooOO0o;
            if (z) {
                long j7 = oooO0o.f6680OooOOOo;
                j6 += j7;
                j = j7 + j5;
            } else {
                j = j5;
            }
            this.f7852OooOo0 = j4 + j6;
            this.f7854OooOo0O = j5 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                OooO0O0 oooO0O0 = arrayList.get(i);
                long j8 = this.f7852OooOo0;
                long j9 = this.f7854OooOo0O;
                oooO0O0.f7884OooO0oo = j8;
                oooO0O0.f7879OooO = j9;
            }
            j2 = j6;
            j3 = j;
        } else {
            long j10 = this.f7852OooOo0 - j4;
            j3 = j5 != Long.MIN_VALUE ? this.f7854OooOo0O - j4 : Long.MIN_VALUE;
            j2 = j10;
        }
        try {
            OooO00o oooO00o2 = new OooO00o(oooo0, j2, j3);
            this.f7851OooOOoo = oooO00o2;
            OooOOo(oooO00o2);
        } catch (IllegalClippingException e) {
            this.f7853OooOo00 = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).f7885OooOO0 = this.f7853OooOo00;
            }
        }
    }
}
