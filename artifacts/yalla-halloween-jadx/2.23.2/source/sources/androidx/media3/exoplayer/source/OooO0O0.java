package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;
import o000O.oo0o0Oo;
import o000O00O.o00O0000;
import o000O00O.o00OO0O0;
import p069o0000ooO.o0000oo;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooO0O0 implements OooOOO, OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f7879OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO f7880OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o[] f7881OooO0o = new OooO00o[0];

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooOOO.OooO00o f7882OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f7883OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f7884OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ClippingMediaSource.IllegalClippingException f7885OooOO0;

    public final class OooO00o implements SampleStream {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SampleStream f7886OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f7887OooO0O0;

        public OooO00o(SampleStream sampleStream) {
            this.f7886OooO00o = sampleStream;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void OooO00o() throws IOException {
            this.f7886OooO00o.OooO00o();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int OooO0O0(o00O0000 o00o0001, DecoderInputBuffer decoderInputBuffer, int i) {
            OooO0O0 oooO0O0 = OooO0O0.this;
            if (oooO0O0.OooOO0O()) {
                return -3;
            }
            if (this.f7887OooO0O0) {
                decoderInputBuffer.f33931OooO0Oo = 4;
                return -4;
            }
            long jOooOOOo = oooO0O0.OooOOOo();
            int iOooO0O0 = this.f7886OooO00o.OooO0O0(o00o0001, decoderInputBuffer, i);
            if (iOooO0O0 != -5) {
                long j = oooO0O0.f7879OooO;
                if (j == Long.MIN_VALUE || ((iOooO0O0 != -4 || decoderInputBuffer.f7087OooO0oo < j) && !(iOooO0O0 == -3 && jOooOOOo == Long.MIN_VALUE && !decoderInputBuffer.f7086OooO0oO))) {
                    return iOooO0O0;
                }
                decoderInputBuffer.OooO0oo();
                decoderInputBuffer.f33931OooO0Oo = 4;
                this.f7887OooO0O0 = true;
                return -4;
            }
            androidx.media3.common.OooOO0 oooOO1 = o00o0001.f34055OooO0O0;
            oooOO1.getClass();
            int i2 = oooOO1.f6428OooOooo;
            int i3 = oooOO1.f6430Oooo000;
            if (i2 != 0 || i3 != 0) {
                if (oooO0O0.f7884OooO0oo != 0) {
                    i2 = 0;
                }
                if (oooO0O0.f7879OooO != Long.MIN_VALUE) {
                    i3 = 0;
                }
                androidx.media3.common.OooOO0.OooO00o oooO00oOooO0OO = oooOO1.OooO0OO();
                oooO00oOooO0OO.f6461OooOoOO = i2;
                oooO00oOooO0OO.f6463OooOoo0 = i3;
                o00o0001.f34055OooO0O0 = oooO00oOooO0OO.OooO00o();
            }
            return -5;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int OooO0OO(long j) {
            if (OooO0O0.this.OooOO0O()) {
                return -3;
            }
            return this.f7886OooO00o.OooO0OO(j);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean OooO0Oo() {
            return !OooO0O0.this.OooOO0O() && this.f7886OooO00o.OooO0Oo();
        }
    }

    public OooO0O0(OooOOO oooOOO, boolean z, long j, long j2) {
        this.f7880OooO0Oo = oooOOO;
        this.f7883OooO0oO = z ? j : -9223372036854775807L;
        this.f7884OooO0oo = j;
        this.f7879OooO = j2;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0.OooO00o
    public final void OooO(o00Oo0 o00oo1) {
        OooOOO.OooO00o oooO00o = this.f7882OooO0o0;
        oooO00o.getClass();
        oooO00o.OooO(this);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO.OooO00o
    public final void OooO00o(OooOOO oooOOO) {
        if (this.f7885OooOO0 != null) {
            return;
        }
        OooOOO.OooO00o oooO00o = this.f7882OooO0o0;
        oooO00o.getClass();
        oooO00o.OooO00o(this);
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final long OooO0O0() {
        long jOooO0O0 = this.f7880OooO0Oo.OooO0O0();
        if (jOooO0O0 != Long.MIN_VALUE) {
            long j = this.f7879OooO;
            if (j == Long.MIN_VALUE || jOooO0O0 < j) {
                return jOooO0O0;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0OO(long j) {
        this.f7883OooO0oO = -9223372036854775807L;
        boolean z = false;
        for (OooO00o oooO00o : this.f7881OooO0o) {
            if (oooO00o != null) {
                oooO00o.f7887OooO0O0 = false;
            }
        }
        long jOooO0OO = this.f7880OooO0Oo.OooO0OO(j);
        if (jOooO0OO == j) {
            z = true;
        } else if (jOooO0OO >= this.f7884OooO0oo) {
            long j2 = this.f7879OooO;
            if (j2 == Long.MIN_VALUE || jOooO0OO <= j2) {
                z = true;
            }
        }
        p080o000OoO.o00Oo0.OooO0Oo(z);
        return jOooO0OO;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0Oo(androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.f7881OooO0o = new OooO00o[sampleStreamArr.length];
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i >= sampleStreamArr.length) {
                break;
            }
            OooO00o[] oooO00oArr = this.f7881OooO0o;
            OooO00o oooO00o = (OooO00o) sampleStreamArr[i];
            oooO00oArr[i] = oooO00o;
            if (oooO00o != null) {
                sampleStream = oooO00o.f7886OooO00o;
            }
            sampleStreamArr2[i] = sampleStream;
            i++;
        }
        long jOooO0Oo = this.f7880OooO0Oo.OooO0Oo(oooO0oArr, zArr, sampleStreamArr2, zArr2, j);
        boolean z2 = true;
        if (OooOO0O()) {
            long j3 = this.f7884OooO0oo;
            if (j != j3) {
                j2 = -9223372036854775807L;
            } else {
                if (j3 == 0) {
                    z = false;
                    break;
                }
                int length = oooO0oArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    androidx.media3.exoplayer.trackselection.OooO0o oooO0o = oooO0oArr[i2];
                    if (oooO0o != null) {
                        androidx.media3.common.OooOO0 oooOO0OooOO0O = oooO0o.OooOO0O();
                        if (!o0000oo.OooO00o(oooOO0OooOO0O.f6412OooOOOO, oooOO0OooOO0O.f6409OooOO0o)) {
                            z = true;
                            break;
                        }
                    }
                    i2++;
                }
                if (z) {
                    j2 = jOooO0Oo;
                } else {
                    j2 = -9223372036854775807L;
                }
            }
        } else {
            j2 = -9223372036854775807L;
        }
        this.f7883OooO0oO = j2;
        if (jOooO0Oo != j) {
            if (jOooO0Oo >= this.f7884OooO0oo) {
                long j4 = this.f7879OooO;
                if (j4 != Long.MIN_VALUE && jOooO0Oo > j4) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        p080o000OoO.o00Oo0.OooO0Oo(z2);
        for (int i3 = 0; i3 < sampleStreamArr.length; i3++) {
            SampleStream sampleStream2 = sampleStreamArr2[i3];
            if (sampleStream2 == null) {
                this.f7881OooO0o[i3] = null;
            } else {
                OooO00o[] oooO00oArr2 = this.f7881OooO0o;
                OooO00o oooO00o2 = oooO00oArr2[i3];
                if (oooO00o2 == null || oooO00o2.f7886OooO00o != sampleStream2) {
                    oooO00oArr2[i3] = new OooO00o(sampleStream2);
                }
            }
            sampleStreamArr[i3] = this.f7881OooO0o[i3];
        }
        return jOooO0Oo;
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0o() {
        if (OooOO0O()) {
            long j = this.f7883OooO0oO;
            this.f7883OooO0oO = -9223372036854775807L;
            long jOooO0o = OooO0o();
            return jOooO0o != -9223372036854775807L ? jOooO0o : j;
        }
        long jOooO0o2 = this.f7880OooO0Oo.OooO0o();
        if (jOooO0o2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        p080o000OoO.o00Oo0.OooO0Oo(jOooO0o2 >= this.f7884OooO0oo);
        long j2 = this.f7879OooO;
        if (j2 != Long.MIN_VALUE && jOooO0o2 > j2) {
            z = false;
        }
        p080o000OoO.o00Oo0.OooO0Oo(z);
        return jOooO0o2;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final boolean OooO0o0() {
        return this.f7880OooO0Oo.OooO0o0();
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooO0oO() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f7885OooOO0;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f7880OooO0Oo.OooO0oO();
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final boolean OooO0oo(long j) {
        return this.f7880OooO0Oo.OooO0oo(j);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooOO0(long j, o00OO0O0 o00oo0o1) {
        long j2 = this.f7884OooO0oo;
        if (j == j2) {
            return j2;
        }
        long jOooOO0 = o00.OooOO0(o00oo0o1.f34130OooO00o, 0L, j - j2);
        long j3 = o00oo0o1.f34131OooO0O0;
        long j4 = this.f7879OooO;
        long jOooOO1 = o00.OooOO0(j3, 0L, j4 == Long.MIN_VALUE ? LongCompanionObject.MAX_VALUE : j4 - j);
        if (jOooOO0 != o00oo0o1.f34130OooO00o || jOooOO1 != o00oo0o1.f34131OooO0O0) {
            o00oo0o1 = new o00OO0O0(jOooOO0, jOooOO1);
        }
        return this.f7880OooO0Oo.OooOO0(j, o00oo0o1);
    }

    public final boolean OooOO0O() {
        return this.f7883OooO0oO != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooOO0o(OooOOO.OooO00o oooO00o, long j) {
        this.f7882OooO0o0 = oooO00o;
        this.f7880OooO0Oo.OooOO0o(this, j);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final oo0o0Oo OooOOO0() {
        return this.f7880OooO0Oo.OooOOO0();
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final long OooOOOo() {
        long jOooOOOo = this.f7880OooO0Oo.OooOOOo();
        if (jOooOOOo != Long.MIN_VALUE) {
            long j = this.f7879OooO;
            if (j == Long.MIN_VALUE || jOooOOOo < j) {
                return jOooOOOo;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final void OooOOo(long j) {
        this.f7880OooO0Oo.OooOOo(j);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooOOo0(long j, boolean z) {
        this.f7880OooO0Oo.OooOOo0(j, z);
    }
}
