package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.util.Log;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import p203o00o0o0o.o00OOO0O;
import p203o00o0o0o.o0O00OO;
import p226o00oOo00.o0000;
import p226o00oOo00.o000O0;
import p226o00oOo00.o000O00O;
import p244o00oo0Oo.o00O000;
import p244o00oo0Oo.o00O0O0;
import p244o00oo0Oo.o00O0OO0;
import p245o00oo0o.o00OO0OO;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class oo000o implements OooOOO, Loader.OooO00o<OooO0O0> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o000O0 f13361OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final DataSpec f13362OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final o00O0OO0 f13363OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o f13364OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f13365OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOo00.OooO00o f13366OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f13368OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f13370OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final com.google.android.exoplayer2.OooOo f13371OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f13372OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public byte[] f13373OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f13374OooOOo0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList<OooO00o> f13367OooOO0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Loader f13369OooOO0o = new Loader("SingleSampleMediaPeriod");

    public final class OooO00o implements SampleStream {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f13375OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public boolean f13377OooO0o0;

        public OooO00o() {
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void OooO00o() throws IOException {
            oo000o oo000oVar = oo000o.this;
            if (oo000oVar.f13370OooOOO) {
                return;
            }
            oo000oVar.f13369OooOO0o.OooO00o();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean OooO0O0() {
            return oo000o.this.f13372OooOOOO;
        }

        public final void OooO0OO() {
            if (this.f13377OooO0o0) {
                return;
            }
            oo000o oo000oVar = oo000o.this;
            oo000oVar.f13366OooO0oo.OooO00o(o00OO0OO.OooO0oo(oo000oVar.f13371OooOOO0.f11211OooOOOO), oo000oVar.f13371OooOOO0, 0, null, 0L);
            this.f13377OooO0o0 = true;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooOOO(o00OOO0O o00ooo0o, DecoderInputBuffer decoderInputBuffer, int i) {
            OooO0OO();
            oo000o oo000oVar = oo000o.this;
            boolean z = oo000oVar.f13372OooOOOO;
            if (z && oo000oVar.f13373OooOOOo == null) {
                this.f13375OooO0Oo = 2;
            }
            int i2 = this.f13375OooO0Oo;
            if (i2 == 2) {
                decoderInputBuffer.OooO0o0(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                o00ooo0o.f39211OooO0O0 = oo000oVar.f13371OooOOO0;
                this.f13375OooO0Oo = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            oo000oVar.f13373OooOOOo.getClass();
            decoderInputBuffer.OooO0o0(1);
            decoderInputBuffer.f11677OooO0oo = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.OooOO0(oo000oVar.f13374OooOOo0);
                decoderInputBuffer.f11674OooO0o.put(oo000oVar.f13373OooOOOo, 0, oo000oVar.f13374OooOOo0);
            }
            if ((i & 1) == 0) {
                this.f13375OooO0Oo = 2;
            }
            return -4;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooOOOo(long j) {
            OooO0OO();
            if (j <= 0 || this.f13375OooO0Oo == 2) {
                return 0;
            }
            this.f13375OooO0Oo = 2;
            return 1;
        }
    }

    public static final class OooO0O0 implements Loader.OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f13378OooO00o = o0000.f39822OooO0O0.getAndIncrement();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final DataSpec f13379OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o00O0O0 f13380OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public byte[] f13381OooO0Oo;

        public OooO0O0(com.google.android.exoplayer2.upstream.OooO00o oooO00o, DataSpec dataSpec) {
            this.f13379OooO0O0 = dataSpec;
            this.f13380OooO0OO = new o00O0O0(oooO00o);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
        public final void OooO00o() throws IOException {
            o00O0O0 o00o0o0 = this.f13380OooO0OO;
            o00o0o0.f40516OooO0O0 = 0L;
            try {
                o00o0o0.OooO00o(this.f13379OooO0O0);
                int i = 0;
                while (i != -1) {
                    int i2 = (int) o00o0o0.f40516OooO0O0;
                    byte[] bArr = this.f13381OooO0Oo;
                    if (bArr == null) {
                        this.f13381OooO0Oo = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                    } else if (i2 == bArr.length) {
                        this.f13381OooO0Oo = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.f13381OooO0Oo;
                    i = o00o0o0.read(bArr2, i2, bArr2.length - i2);
                }
            } finally {
                o00O000.OooO00o(o00o0o0);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.OooO0o
        public final void OooO0O0() {
        }
    }

    public oo000o(DataSpec dataSpec, com.google.android.exoplayer2.upstream.OooO00o.InterfaceC0215OooO00o interfaceC0215OooO00o, @Nullable o00O0OO0 o00o0oo1, com.google.android.exoplayer2.OooOo oooOo, long j, LoadErrorHandlingPolicy loadErrorHandlingPolicy, OooOo00.OooO00o oooO00o, boolean z) {
        this.f13362OooO0Oo = dataSpec;
        this.f13364OooO0o0 = interfaceC0215OooO00o;
        this.f13363OooO0o = o00o0oo1;
        this.f13371OooOOO0 = oooOo;
        this.f13368OooOO0O = j;
        this.f13365OooO0oO = loadErrorHandlingPolicy;
        this.f13366OooO0oo = oooO00o;
        this.f13370OooOOO = z;
        this.f13361OooO = new o000O0(new o000O00O("", oooOo));
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO0OO(long j, o0O00OO o0o00oo2) {
        return j;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
    public final void OooO0Oo(Loader.OooO0o oooO0o, long j, long j2, boolean z) {
        o00O0O0 o00o0o0 = ((OooO0O0) oooO0o).f13380OooO0OO;
        Uri uri = o00o0o0.f40517OooO0OO;
        o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
        this.f13365OooO0oO.OooO0Oo();
        this.f13366OooO0oo.OooO0OO(o0000Var, 1, -1, null, 0, null, 0L, this.f13368OooOO0O);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
    public final void OooO0o(Loader.OooO0o oooO0o, long j, long j2) {
        OooO0O0 oooO0O0 = (OooO0O0) oooO0o;
        this.f13374OooOOo0 = (int) oooO0O0.f13380OooO0OO.f40516OooO0O0;
        byte[] bArr = oooO0O0.f13381OooO0Oo;
        bArr.getClass();
        this.f13373OooOOOo = bArr;
        this.f13372OooOOOO = true;
        o00O0O0 o00o0o0 = oooO0O0.f13380OooO0OO;
        Uri uri = o00o0o0.f40517OooO0OO;
        o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
        this.f13365OooO0oO.OooO0Oo();
        this.f13366OooO0oo.OooO0o0(o0000Var, 1, -1, this.f13371OooOOO0, 0, null, 0L, this.f13368OooOO0O);
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooO0o0() {
        return (this.f13372OooOOOO || this.f13369OooOO0o.OooO0O0()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO0oO(long j) {
        int i = 0;
        while (true) {
            ArrayList<OooO00o> arrayList = this.f13367OooOO0;
            if (i >= arrayList.size()) {
                return j;
            }
            OooO00o oooO00o = arrayList.get(i);
            if (oooO00o.f13375OooO0Oo == 2) {
                oooO00o.f13375OooO0Oo = 1;
            }
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooO0oo() {
        return this.f13369OooOO0o.OooO0O0();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOO0(OooOOO.OooO00o oooO00o, long j) {
        oooO00o.OooO0O0(this);
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooOO0O(com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        for (int i = 0; i < oooO0oArr.length; i++) {
            SampleStream sampleStream = sampleStreamArr[i];
            ArrayList<OooO00o> arrayList = this.f13367OooOO0;
            if (sampleStream != null && (oooO0oArr[i] == null || !zArr[i])) {
                arrayList.remove(sampleStream);
                sampleStreamArr[i] = null;
            }
            if (sampleStreamArr[i] == null && oooO0oArr[i] != null) {
                OooO00o oooO00o = new OooO00o();
                arrayList.add(oooO00o);
                sampleStreamArr[i] = oooO00o;
                zArr2[i] = true;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.OooO00o
    public final Loader.OooO0O0 OooOO0o(Loader.OooO0o oooO0o, long j, long j2, IOException iOException, int i) {
        Loader.OooO0O0 oooO0O0;
        o00O0O0 o00o0o0 = ((OooO0O0) oooO0o).f13380OooO0OO;
        Uri uri = o00o0o0.f40517OooO0OO;
        o0000 o0000Var = new o0000(o00o0o0.f40518OooO0Oo);
        o0O00.OoooOO0(this.f13368OooOO0O);
        LoadErrorHandlingPolicy.OooO0OO oooO0OO = new LoadErrorHandlingPolicy.OooO0OO(iOException, i);
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.f13365OooO0oO;
        long jOooO00o = loadErrorHandlingPolicy.OooO00o(oooO0OO);
        boolean z = jOooO00o == -9223372036854775807L || i >= loadErrorHandlingPolicy.OooO0O0(1);
        if (this.f13370OooOOO && z) {
            Log.OooO0oO("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f13372OooOOOO = true;
            oooO0O0 = Loader.f14192OooO0Oo;
        } else {
            oooO0O0 = jOooO00o != -9223372036854775807L ? new Loader.OooO0O0(0, jOooO00o) : Loader.f14193OooO0o0;
        }
        Loader.OooO0O0 oooO0O1 = oooO0O0;
        int i2 = oooO0O1.f14197OooO00o;
        boolean z2 = !(i2 == 0 || i2 == 1);
        this.f13366OooO0oo.OooO0oO(o0000Var, 1, -1, this.f13371OooOOO0, 0, null, 0L, this.f13368OooOO0O, iOException, z2);
        if (z2) {
            loadErrorHandlingPolicy.OooO0Oo();
        }
        return oooO0O1;
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOOOO() {
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final o000O0 OooOOo() {
        return this.f13361OooO;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooOOo0(long j) {
        if (!this.f13372OooOOOO) {
            Loader loader = this.f13369OooOO0o;
            if (!loader.OooO0O0()) {
                if (!(loader.f14196OooO0OO != null)) {
                    com.google.android.exoplayer2.upstream.OooO00o OooO00o2 = this.f13364OooO0o0.OooO00o();
                    o00O0OO0 o00o0oo1 = this.f13363OooO0o;
                    if (o00o0oo1 != null) {
                        OooO00o2.OooO0OO(o00o0oo1);
                    }
                    OooO0O0 oooO0O0 = new OooO0O0(OooO00o2, this.f13362OooO0Oo);
                    this.f13366OooO0oo.OooO(new o0000(oooO0O0.f13378OooO00o, this.f13362OooO0Oo, loader.OooO0Oo(oooO0O0, this, this.f13365OooO0oO.OooO0O0(1))), 1, -1, this.f13371OooOOO0, 0, null, 0L, this.f13368OooOO0O);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooOOoo() {
        return this.f13372OooOOOO ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final void OooOo0(long j) {
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOo00(long j, boolean z) {
    }
}
