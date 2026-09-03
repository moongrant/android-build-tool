package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.oo0o0Oo;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import p226o00oOo00.o0000Ooo;
import p244o00oo0Oo.o000OO0O;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class ClippingMediaSource extends o0ooOOo {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final long f12945OooOO0o;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f12946OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final long f12947OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public final boolean f12948OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public final boolean f12949OooOOOo;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public final oo0o0Oo.OooO0OO f12950OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public final ArrayList<OooO0O0> f12951OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @Nullable
    public OooO00o f12952OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public long f12953OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @Nullable
    public IllegalClippingException f12954OooOo00;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public long f12955OooOo0O;

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

    public static final class OooO00o extends o0000Ooo {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final long f12956OooO;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final long f12957OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final long f12958OooOO0O;

        /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
        public final boolean f12959OooOO0o;

        public OooO00o(oo0o0Oo oo0o0oo, long j, long j2) throws IllegalClippingException {
            super(oo0o0oo);
            boolean z = false;
            if (oo0o0oo.OooO() != 1) {
                throw new IllegalClippingException(0);
            }
            oo0o0Oo.OooO0OO oooO0OOOooOOO = oo0o0oo.OooOOO(0, new oo0o0Oo.OooO0OO());
            long jMax = Math.max(0L, j);
            if (!oooO0OOOooOOO.f12938OooOOOO && jMax != 0 && !oooO0OOOooOOO.f12934OooOO0O) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? oooO0OOOooOOO.f12941OooOOo0 : Math.max(0L, j2);
            long j3 = oooO0OOOooOOO.f12941OooOOo0;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    throw new IllegalClippingException(2);
                }
            }
            this.f12956OooO = jMax;
            this.f12957OooOO0 = jMax2;
            this.f12958OooOO0O = jMax2 == -9223372036854775807L ? -9223372036854775807L : jMax2 - jMax;
            if (oooO0OOOooOOO.f12935OooOO0o && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z = true;
            }
            this.f12959OooOO0o = z;
        }

        @Override // p226o00oOo00.o0000Ooo, com.google.android.exoplayer2.oo0o0Oo
        public final oo0o0Oo.OooO0O0 OooO0oO(int i, oo0o0Oo.OooO0O0 oooO0O0, boolean z) {
            this.f39858OooO0oo.OooO0oO(0, oooO0O0, z);
            long j = oooO0O0.f12909OooO0oo - this.f12956OooO;
            long j2 = this.f12958OooOO0O;
            oooO0O0.OooOO0(oooO0O0.f12905OooO0Oo, oooO0O0.f12907OooO0o0, 0, j2 == -9223372036854775807L ? -9223372036854775807L : j2 - j, j, AdPlaybackState.f13125OooOO0, false);
            return oooO0O0;
        }

        @Override // p226o00oOo00.o0000Ooo, com.google.android.exoplayer2.oo0o0Oo
        public final oo0o0Oo.OooO0OO OooOOOO(int i, oo0o0Oo.OooO0OO oooO0OO, long j) {
            this.f39858OooO0oo.OooOOOO(0, oooO0OO, 0L);
            long j2 = oooO0OO.f12943OooOo00;
            long j3 = this.f12956OooO;
            oooO0OO.f12943OooOo00 = j2 + j3;
            oooO0OO.f12941OooOOo0 = this.f12958OooOO0O;
            oooO0OO.f12935OooOO0o = this.f12959OooOO0o;
            long j4 = oooO0OO.f12939OooOOOo;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                oooO0OO.f12939OooOOOo = jMax;
                long j5 = this.f12957OooOO0;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                oooO0OO.f12939OooOOOo = jMax - j3;
            }
            long jOoooOO0 = o0O00.OoooOO0(j3);
            long j6 = oooO0OO.f12932OooO0oo;
            if (j6 != -9223372036854775807L) {
                oooO0OO.f12932OooO0oo = j6 + jOoooOO0;
            }
            long j7 = oooO0OO.f12927OooO;
            if (j7 != -9223372036854775807L) {
                oooO0OO.f12927OooO = j7 + jOoooOO0;
            }
            return oooO0OO;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClippingMediaSource(OooOOOO oooOOOO, long j, long j2, boolean z, boolean z2, boolean z3) {
        super(oooOOOO);
        oooOOOO.getClass();
        o00O000o.OooO00o(j >= 0);
        this.f12945OooOO0o = j;
        this.f12947OooOOO0 = j2;
        this.f12946OooOOO = z;
        this.f12948OooOOOO = z2;
        this.f12949OooOOOo = z3;
        this.f12951OooOOo0 = new ArrayList<>();
        this.f12950OooOOo = new oo0o0Oo.OooO0OO();
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final void OooO0o0(OooOOO oooOOO) {
        ArrayList<OooO0O0> arrayList = this.f12951OooOOo0;
        o00O000o.OooO0Oo(arrayList.remove(oooOOO));
        this.f13360OooOO0O.OooO0o0(((OooO0O0) oooOOO).f12981OooO0Oo);
        if (!arrayList.isEmpty() || this.f12948OooOOOO) {
            return;
        }
        OooO00o oooO00o = this.f12952OooOOoo;
        oooO00o.getClass();
        OooOoo0(oooO00o.f39858OooO0oo);
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final OooOOO OooO0oo(OooOOOO.OooO0O0 oooO0O0, o000OO0O o000oo0o2, long j) {
        OooO0O0 oooO0O1 = new OooO0O0(this.f13360OooOO0O.OooO0oo(oooO0O0, o000oo0o2, j), this.f12946OooOOO, this.f12953OooOo0, this.f12955OooOo0O);
        this.f12951OooOOo0.add(oooO0O1);
        return oooO0O1;
    }

    @Override // com.google.android.exoplayer2.source.OooO0OO, com.google.android.exoplayer2.source.OooOOOO
    public final void OooOO0o() throws IOException {
        IllegalClippingException illegalClippingException = this.f12954OooOo00;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.OooOO0o();
    }

    @Override // com.google.android.exoplayer2.source.OooO0OO, com.google.android.exoplayer2.source.OooO00o
    public final void OooOOoo() {
        super.OooOOoo();
        this.f12954OooOo00 = null;
        this.f12952OooOOoo = null;
    }

    @Override // com.google.android.exoplayer2.source.o0ooOOo
    public final void OooOoO(oo0o0Oo oo0o0oo) {
        if (this.f12954OooOo00 != null) {
            return;
        }
        OooOoo0(oo0o0oo);
    }

    public final void OooOoo0(oo0o0Oo oo0o0oo) {
        long j;
        long j2;
        long j3;
        oo0o0Oo.OooO0OO oooO0OO = this.f12950OooOOo;
        oo0o0oo.OooOOO(0, oooO0OO);
        long j4 = oooO0OO.f12943OooOo00;
        OooO00o oooO00o = this.f12952OooOOoo;
        long j5 = this.f12947OooOOO0;
        ArrayList<OooO0O0> arrayList = this.f12951OooOOo0;
        if (oooO00o == null || arrayList.isEmpty() || this.f12948OooOOOO) {
            boolean z = this.f12949OooOOOo;
            long j6 = this.f12945OooOO0o;
            if (z) {
                long j7 = oooO0OO.f12939OooOOOo;
                j6 += j7;
                j = j7 + j5;
            } else {
                j = j5;
            }
            this.f12953OooOo0 = j4 + j6;
            this.f12955OooOo0O = j5 != Long.MIN_VALUE ? j4 + j : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                OooO0O0 oooO0O0 = arrayList.get(i);
                long j8 = this.f12953OooOo0;
                long j9 = this.f12955OooOo0O;
                oooO0O0.f12985OooO0oo = j8;
                oooO0O0.f12980OooO = j9;
            }
            j2 = j6;
            j3 = j;
        } else {
            long j10 = this.f12953OooOo0 - j4;
            j3 = j5 != Long.MIN_VALUE ? this.f12955OooOo0O - j4 : Long.MIN_VALUE;
            j2 = j10;
        }
        try {
            OooO00o oooO00o2 = new OooO00o(oo0o0oo, j2, j3);
            this.f12952OooOOoo = oooO00o2;
            OooOOo(oooO00o2);
        } catch (IllegalClippingException e) {
            this.f12954OooOo00 = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                arrayList.get(i2).f12986OooOO0 = this.f12954OooOo00;
            }
        }
    }
}
