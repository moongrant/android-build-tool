package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import kotlin.jvm.internal.LongCompanionObject;
import p203o00o0o0o.o00OOO0O;
import p203o00o0o0o.o0O00OO;
import p226o00oOo00.o000O0;
import p245o00oo0o.o00O000o;
import p245o00oo0o.o00OO0OO;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooO0O0 implements OooOOO, OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public long f12980OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO f12981OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public OooO00o[] f12982OooO0o = new OooO00o[0];

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public OooOOO.OooO00o f12983OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public long f12984OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public long f12985OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public ClippingMediaSource.IllegalClippingException f12986OooOO0;

    public final class OooO00o implements SampleStream {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final SampleStream f12987OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f12989OooO0o0;

        public OooO00o(SampleStream sampleStream) {
            this.f12987OooO0Oo = sampleStream;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void OooO00o() throws IOException {
            this.f12987OooO0Oo.OooO00o();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean OooO0O0() {
            return !OooO0O0.this.OooO0Oo() && this.f12987OooO0Oo.OooO0O0();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooOOO(o00OOO0O o00ooo0o, DecoderInputBuffer decoderInputBuffer, int i) {
            OooO0O0 oooO0O0 = OooO0O0.this;
            if (oooO0O0.OooO0Oo()) {
                return -3;
            }
            if (this.f12989OooO0o0) {
                decoderInputBuffer.f39410OooO0Oo = 4;
                return -4;
            }
            int iOooOOO = this.f12987OooO0Oo.OooOOO(o00ooo0o, decoderInputBuffer, i);
            if (iOooOOO != -5) {
                long j = oooO0O0.f12980OooO;
                if (j == Long.MIN_VALUE || ((iOooOOO != -4 || decoderInputBuffer.f11677OooO0oo < j) && !(iOooOOO == -3 && oooO0O0.OooOOoo() == Long.MIN_VALUE && !decoderInputBuffer.f11676OooO0oO))) {
                    return iOooOOO;
                }
                decoderInputBuffer.OooO0oo();
                decoderInputBuffer.f39410OooO0Oo = 4;
                this.f12989OooO0o0 = true;
                return -4;
            }
            com.google.android.exoplayer2.OooOo oooOo = o00ooo0o.f39211OooO0O0;
            oooOo.getClass();
            int i2 = oooOo.f11227OooOooo;
            int i3 = oooOo.f11229Oooo000;
            if (i2 != 0 || i3 != 0) {
                if (oooO0O0.f12985OooO0oo != 0) {
                    i2 = 0;
                }
                if (oooO0O0.f12980OooO != Long.MIN_VALUE) {
                    i3 = 0;
                }
                com.google.android.exoplayer2.OooOo.OooO00o OooO00o2 = oooOo.OooO00o();
                OooO00o2.f11260OooOoOO = i2;
                OooO00o2.f11262OooOoo0 = i3;
                o00ooo0o.f39211OooO0O0 = OooO00o2.OooO00o();
            }
            return -5;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooOOOo(long j) {
            if (OooO0O0.this.OooO0Oo()) {
                return -3;
            }
            return this.f12987OooO0Oo.OooOOOo(j);
        }
    }

    public OooO0O0(OooOOO oooOOO, boolean z, long j, long j2) {
        this.f12981OooO0Oo = oooOOO;
        this.f12984OooO0oO = z ? j : -9223372036854775807L;
        this.f12985OooO0oo = j;
        this.f12980OooO = j2;
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO() {
        if (OooO0Oo()) {
            long j = this.f12984OooO0oO;
            this.f12984OooO0oO = -9223372036854775807L;
            long jOooO = OooO();
            return jOooO != -9223372036854775807L ? jOooO : j;
        }
        long jOooO2 = this.f12981OooO0Oo.OooO();
        if (jOooO2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        boolean z = true;
        o00O000o.OooO0Oo(jOooO2 >= this.f12985OooO0oo);
        long j2 = this.f12980OooO;
        if (j2 != Long.MIN_VALUE && jOooO2 > j2) {
            z = false;
        }
        o00O000o.OooO0Oo(z);
        return jOooO2;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0.OooO00o
    public final void OooO00o(o00Oo0 o00oo1) {
        OooOOO.OooO00o oooO00o = this.f12983OooO0o0;
        oooO00o.getClass();
        oooO00o.OooO00o(this);
    }

    @Override // com.google.android.exoplayer2.source.OooOOO.OooO00o
    public final void OooO0O0(OooOOO oooOOO) {
        if (this.f12986OooOO0 != null) {
            return;
        }
        OooOOO.OooO00o oooO00o = this.f12983OooO0o0;
        oooO00o.getClass();
        oooO00o.OooO0O0(this);
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO0OO(long j, o0O00OO o0o00oo2) {
        long j2 = this.f12985OooO0oo;
        if (j == j2) {
            return j2;
        }
        long jOooOO0 = o0O00.OooOO0(o0o00oo2.f39283OooO00o, 0L, j - j2);
        long j3 = o0o00oo2.f39284OooO0O0;
        long j4 = this.f12980OooO;
        long jOooOO1 = o0O00.OooOO0(j3, 0L, j4 == Long.MIN_VALUE ? LongCompanionObject.MAX_VALUE : j4 - j);
        if (jOooOO0 != o0o00oo2.f39283OooO00o || jOooOO1 != o0o00oo2.f39284OooO0O0) {
            o0o00oo2 = new o0O00OO(jOooOO0, jOooOO1);
        }
        return this.f12981OooO0Oo.OooO0OO(j, o0o00oo2);
    }

    public final boolean OooO0Oo() {
        return this.f12984OooO0oO != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooO0o0() {
        long jOooO0o0 = this.f12981OooO0Oo.OooO0o0();
        if (jOooO0o0 != Long.MIN_VALUE) {
            long j = this.f12980OooO;
            if (j == Long.MIN_VALUE || jOooO0o0 < j) {
                return jOooO0o0;
            }
        }
        return Long.MIN_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO0oO(long j) {
        this.f12984OooO0oO = -9223372036854775807L;
        boolean z = false;
        for (OooO00o oooO00o : this.f12982OooO0o) {
            if (oooO00o != null) {
                oooO00o.f12989OooO0o0 = false;
            }
        }
        long jOooO0oO = this.f12981OooO0Oo.OooO0oO(j);
        if (jOooO0oO == j) {
            z = true;
        } else if (jOooO0oO >= this.f12985OooO0oo) {
            long j2 = this.f12980OooO;
            if (j2 == Long.MIN_VALUE || jOooO0oO <= j2) {
                z = true;
            }
        }
        o00O000o.OooO0Oo(z);
        return jOooO0oO;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooO0oo() {
        return this.f12981OooO0Oo.OooO0oo();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOO0(OooOOO.OooO00o oooO00o, long j) {
        this.f12983OooO0o0 = oooO00o;
        this.f12981OooO0Oo.OooOO0(this, j);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0066  */
    /* JADX WARN: Code duplicated, block: B:36:0x0084  */
    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooOO0O(com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.f12982OooO0o = new OooO00o[sampleStreamArr.length];
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i >= sampleStreamArr.length) {
                break;
            }
            OooO00o[] oooO00oArr = this.f12982OooO0o;
            OooO00o oooO00o = (OooO00o) sampleStreamArr[i];
            oooO00oArr[i] = oooO00o;
            if (oooO00o != null) {
                sampleStream = oooO00o.f12987OooO0Oo;
            }
            sampleStreamArr2[i] = sampleStream;
            i++;
        }
        long jOooOO0O = this.f12981OooO0Oo.OooOO0O(oooO0oArr, zArr, sampleStreamArr2, zArr2, j);
        boolean z2 = true;
        if (OooO0Oo()) {
            long j3 = this.f12985OooO0oo;
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
                    com.google.android.exoplayer2.trackselection.OooO0o oooO0o = oooO0oArr[i2];
                    if (oooO0o != null) {
                        com.google.android.exoplayer2.OooOo oooOoOooOOOo = oooO0o.OooOOOo();
                        if (!o00OO0OO.OooO00o(oooOoOooOOOo.f11211OooOOOO, oooOoOooOOOo.f11208OooOO0o)) {
                            z = true;
                            break;
                        }
                    }
                    i2++;
                }
                if (z) {
                    j2 = jOooOO0O;
                } else {
                    j2 = -9223372036854775807L;
                }
            }
        } else {
            j2 = -9223372036854775807L;
        }
        this.f12984OooO0oO = j2;
        if (jOooOO0O != j) {
            if (jOooOO0O >= this.f12985OooO0oo) {
                long j4 = this.f12980OooO;
                if (j4 != Long.MIN_VALUE && jOooOO0O > j4) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        o00O000o.OooO0Oo(z2);
        for (int i3 = 0; i3 < sampleStreamArr.length; i3++) {
            SampleStream sampleStream2 = sampleStreamArr2[i3];
            if (sampleStream2 == null) {
                this.f12982OooO0o[i3] = null;
            } else {
                OooO00o[] oooO00oArr2 = this.f12982OooO0o;
                OooO00o oooO00o2 = oooO00oArr2[i3];
                if (oooO00o2 == null || oooO00o2.f12987OooO0Oo != sampleStream2) {
                    oooO00oArr2[i3] = new OooO00o(sampleStream2);
                }
            }
            sampleStreamArr[i3] = this.f12982OooO0o[i3];
        }
        return jOooOO0O;
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOOOO() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f12986OooOO0;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f12981OooO0Oo.OooOOOO();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final o000O0 OooOOo() {
        return this.f12981OooO0Oo.OooOOo();
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooOOo0(long j) {
        return this.f12981OooO0Oo.OooOOo0(j);
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooOOoo() {
        long jOooOOoo = this.f12981OooO0Oo.OooOOoo();
        if (jOooOOoo != Long.MIN_VALUE) {
            long j = this.f12980OooO;
            if (j == Long.MIN_VALUE || jOooOOoo < j) {
                return jOooOOoo;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final void OooOo0(long j) {
        this.f12981OooO0Oo.OooOo0(j);
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOo00(long j, boolean z) {
        this.f12981OooO0Oo.OooOo00(j, z);
    }
}
