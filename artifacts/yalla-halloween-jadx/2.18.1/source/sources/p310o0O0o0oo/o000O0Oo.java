package p310o0O0o0oo;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.trackselection.OooO0OO;
import java.io.IOException;
import java.util.Objects;
import p318o0O0oOo.o00000O0;
import p318o0O0oOo.o000OO;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o0000O0O;
import p466o0OooO0.o000O0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0Oo implements o00O00, o00O00.OooO00o {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00O00 f36285Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @Nullable
    public o00O00.OooO00o f36286Oooo0oO;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public long f36288OoooO0;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public OooO00o[] f36287Oooo0oo = new OooO00o[0];

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public long f36284Oooo = 0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public long f36289OoooO00 = 0;

    public final class OooO00o implements SampleStream {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SampleStream f36290OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f36291OooO0O0;

        public OooO00o(SampleStream sampleStream) {
            this.f36290OooO00o = sampleStream;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void OooO00o() throws IOException {
            this.f36290OooO00o.OooO00o();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean OooO0O0() {
            return !o000O0Oo.this.OooO0oO() && this.f36290OooO00o.OooO0O0();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooO0OO(long j) {
            if (o000O0Oo.this.OooO0oO()) {
                return -3;
            }
            return this.f36290OooO00o.OooO0OO(j);
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooO0Oo(o0000O0O o0000o0o2, DecoderInputBuffer decoderInputBuffer, boolean z) {
            if (o000O0Oo.this.OooO0oO()) {
                return -3;
            }
            if (this.f36291OooO0O0) {
                decoderInputBuffer.setFlags(4);
                return -4;
            }
            int iOooO0Oo = this.f36290OooO00o.OooO0Oo(o0000o0o2, decoderInputBuffer, z);
            if (iOooO0Oo != -5) {
                o000O0Oo o000o0oo2 = o000O0Oo.this;
                long j = o000o0oo2.f36288OoooO0;
                if (j == Long.MIN_VALUE || ((iOooO0Oo != -4 || decoderInputBuffer.f13640Oooo < j) && !(iOooO0Oo == -3 && o000o0oo2.OooOOo0() == Long.MIN_VALUE && !decoderInputBuffer.f13643Oooo0oo))) {
                    return iOooO0Oo;
                }
                decoderInputBuffer.clear();
                decoderInputBuffer.setFlags(4);
                this.f36291OooO0O0 = true;
                return -4;
            }
            Format format = o0000o0o2.f40508OooO0O0;
            Objects.requireNonNull(format);
            int i = format.f13146o00Oo0;
            if (i != 0 || format.f13147o00Ooo != 0) {
                o000O0Oo o000o0oo3 = o000O0Oo.this;
                if (o000o0oo3.f36289OoooO00 != 0) {
                    i = 0;
                }
                int i2 = o000o0oo3.f36288OoooO0 == Long.MIN_VALUE ? format.f13147o00Ooo : 0;
                Format.OooO0O0 oooO0O0OooO00o = format.OooO00o();
                oooO0O0OooO00o.f13179OooOoOO = i;
                oooO0O0OooO00o.f13181OooOoo0 = i2;
                o0000o0o2.f40508OooO0O0 = oooO0O0OooO00o.OooO00o();
            }
            return -5;
        }
    }

    public o000O0Oo(o00O00 o00o01, long j) {
        this.f36285Oooo0o = o00o01;
        this.f36288OoooO0 = j;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    @Override // p310o0O0o0oo.o00O00
    public final long OooO(long j) {
        this.f36284Oooo = -9223372036854775807L;
        boolean z = false;
        for (OooO00o oooO00o : this.f36287Oooo0oo) {
            if (oooO00o != null) {
                oooO00o.f36291OooO0O0 = false;
            }
        }
        long jOooO = this.f36285Oooo0o.OooO(j);
        if (jOooO == j) {
            z = true;
        } else if (jOooO >= this.f36289OoooO00) {
            long j2 = this.f36288OoooO0;
            if (j2 == Long.MIN_VALUE || jOooO <= j2) {
                z = true;
            }
        }
        o00000O0.OooO0Oo(z);
        return jOooO;
    }

    @Override // o0O0o0oo.o00O00.OooO00o
    public final void OooO00o(o00O00 o00o01) {
        o00O00.OooO00o oooO00o = this.f36286Oooo0oO;
        Objects.requireNonNull(oooO00o);
        oooO00o.OooO00o(this);
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooO0O0(long j, o000O0O0 o000o0o1) {
        long j2 = this.f36289OoooO00;
        if (j == j2) {
            return j2;
        }
        long jOooO = o000OOo0.OooO(o000o0o1.f40535OooO00o, 0L, j - j2);
        long j3 = o000o0o1.f40536OooO0O0;
        long j4 = this.f36288OoooO0;
        long jOooO2 = o000OOo0.OooO(j3, 0L, j4 == Long.MIN_VALUE ? Long.MAX_VALUE : j4 - j);
        if (jOooO != o000o0o1.f40535OooO00o || jOooO2 != o000o0o1.f40536OooO0O0) {
            o000o0o1 = new o000O0O0(jOooO, jOooO2);
        }
        return this.f36285Oooo0o.OooO0O0(j, o000o0o1);
    }

    @Override // p310o0O0o0oo.o00O00
    public final void OooO0OO(o00O00.OooO00o oooO00o, long j) {
        this.f36286Oooo0oO = oooO00o;
        this.f36285Oooo0o.OooO0OO(this, j);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    @Override // p310o0O0o0oo.o00O00
    public final long OooO0Oo(OooO0OO[] oooO0OOArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        boolean z;
        this.f36287Oooo0oo = new OooO00o[sampleStreamArr.length];
        SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
        int i = 0;
        while (true) {
            SampleStream sampleStream = null;
            if (i >= sampleStreamArr.length) {
                break;
            }
            OooO00o[] oooO00oArr = this.f36287Oooo0oo;
            oooO00oArr[i] = (OooO00o) sampleStreamArr[i];
            if (oooO00oArr[i] != null) {
                sampleStream = oooO00oArr[i].f36290OooO00o;
            }
            sampleStreamArr2[i] = sampleStream;
            i++;
        }
        long jOooO0Oo = this.f36285Oooo0o.OooO0Oo(oooO0OOArr, zArr, sampleStreamArr2, zArr2, j);
        boolean z2 = true;
        if (OooO0oO()) {
            long j3 = this.f36289OoooO00;
            if (j != j3) {
                j2 = -9223372036854775807L;
            } else {
                if (j3 == 0) {
                    z = false;
                    break;
                }
                int length = oooO0OOArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    OooO0OO oooO0OO = oooO0OOArr[i2];
                    if (oooO0OO != null) {
                        Format formatOooO0oo = oooO0OO.OooO0oo();
                        if (!o000OO.OooO00o(formatOooO0oo.f13131OoooOOo, formatOooO0oo.f13129OoooOO0)) {
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
        this.f36284Oooo = j2;
        if (jOooO0Oo != j) {
            if (jOooO0Oo >= this.f36289OoooO00) {
                long j4 = this.f36288OoooO0;
                if (j4 != Long.MIN_VALUE && jOooO0Oo > j4) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        o00000O0.OooO0Oo(z2);
        for (int i3 = 0; i3 < sampleStreamArr.length; i3++) {
            if (sampleStreamArr2[i3] == null) {
                this.f36287Oooo0oo[i3] = null;
            } else {
                OooO00o[] oooO00oArr2 = this.f36287Oooo0oo;
                if (oooO00oArr2[i3] == null || oooO00oArr2[i3].f36290OooO00o != sampleStreamArr2[i3]) {
                    oooO00oArr2[i3] = new OooO00o(sampleStreamArr2[i3]);
                }
            }
            sampleStreamArr[i3] = this.f36287Oooo0oo[i3];
        }
        return jOooO0Oo;
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooO0o() {
        long jOooO0o = this.f36285Oooo0o.OooO0o();
        if (jOooO0o != Long.MIN_VALUE) {
            long j = this.f36288OoooO0;
            if (j == Long.MIN_VALUE || jOooO0o < j) {
                return jOooO0o;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // o0O0o0oo.oo0oOO0.OooO00o
    public final void OooO0o0(oo0oOO0 oo0ooo0) {
        o00O00.OooO00o oooO00o = this.f36286Oooo0oO;
        Objects.requireNonNull(oooO00o);
        oooO00o.OooO0o0(this);
    }

    public final boolean OooO0oO() {
        return this.f36284Oooo != -9223372036854775807L;
    }

    @Override // p310o0O0o0oo.o00O00
    public final void OooO0oo() throws IOException {
        this.f36285Oooo0o.OooO0oo();
    }

    @Override // p310o0O0o0oo.o00O00
    public final boolean OooOO0(long j) {
        return this.f36285Oooo0o.OooOO0(j);
    }

    @Override // p310o0O0o0oo.o00O00
    public final boolean OooOO0o() {
        return this.f36285Oooo0o.OooOO0o();
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooOOO() {
        if (OooO0oO()) {
            long j = this.f36284Oooo;
            this.f36284Oooo = -9223372036854775807L;
            long jOooOOO = OooOOO();
            return jOooOOO != -9223372036854775807L ? jOooOOO : j;
        }
        long jOooOOO2 = this.f36285Oooo0o.OooOOO();
        if (jOooOOO2 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        o00000O0.OooO0Oo(jOooOOO2 >= this.f36289OoooO00);
        long j2 = this.f36288OoooO0;
        o00000O0.OooO0Oo(j2 == Long.MIN_VALUE || jOooOOO2 <= j2);
        return jOooOOO2;
    }

    @Override // p310o0O0o0oo.o00O00
    public final TrackGroupArray OooOOOO() {
        return this.f36285Oooo0o.OooOOOO();
    }

    @Override // p310o0O0o0oo.o00O00
    public final void OooOOo(long j, boolean z) {
        this.f36285Oooo0o.OooOOo(j, z);
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooOOo0() {
        long jOooOOo0 = this.f36285Oooo0o.OooOOo0();
        if (jOooOOo0 != Long.MIN_VALUE) {
            long j = this.f36288OoooO0;
            if (j == Long.MIN_VALUE || jOooOOo0 < j) {
                return jOooOOo0;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // p310o0O0o0oo.o00O00
    public final void OooOOoo(long j) {
        this.f36285Oooo0o.OooOOoo(j);
    }
}
