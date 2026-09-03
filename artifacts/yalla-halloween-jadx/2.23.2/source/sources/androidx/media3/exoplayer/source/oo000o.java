package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.datasource.DataSpec;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import o000O.oo0o0Oo;
import o000O00O.o00O0000;
import o000O00O.o00OO0O0;
import p069o0000ooO.o0000oo;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
public final class oo000o implements OooOOO, Loader.OooO00o<OooO0O0> {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final oo0o0Oo f8100OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final DataSpec f8101OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public final o000O0O.OooOo f8102OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o f8103OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final LoadErrorHandlingPolicy f8104OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooOo00.OooO00o f8105OooO0oo;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final long f8107OooOO0O;

    /* JADX INFO: renamed from: OooOOO, reason: collision with root package name */
    public final boolean f8109OooOOO;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public final androidx.media3.common.OooOO0 f8110OooOOO0;

    /* JADX INFO: renamed from: OooOOOO, reason: collision with root package name */
    public boolean f8111OooOOOO;

    /* JADX INFO: renamed from: OooOOOo, reason: collision with root package name */
    public byte[] f8112OooOOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f8113OooOOo0;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final ArrayList<OooO00o> f8106OooOO0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public final Loader f8108OooOO0o = new Loader("SingleSampleMediaPeriod");

    public final class OooO00o implements SampleStream {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public int f8114OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public boolean f8115OooO0O0;

        public OooO00o() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void OooO00o() throws IOException {
            IOException iOException;
            oo000o oo000oVar = oo000o.this;
            if (oo000oVar.f8109OooOOO) {
                return;
            }
            Loader loader = oo000oVar.f8108OooOO0o;
            IOException iOException2 = loader.f8257OooO0OO;
            if (iOException2 != null) {
                throw iOException2;
            }
            Loader.OooO0OO<? extends Loader.OooO0o> oooO0OO = loader.f8256OooO0O0;
            if (oooO0OO != null && (iOException = oooO0OO.f8265OooO0oo) != null && oooO0OO.f8260OooO > oooO0OO.f8261OooO0Oo) {
                throw iOException;
            }
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int OooO0O0(o00O0000 o00o0001, DecoderInputBuffer decoderInputBuffer, int i) {
            OooO0o0();
            oo000o oo000oVar = oo000o.this;
            boolean z = oo000oVar.f8111OooOOOO;
            if (z && oo000oVar.f8112OooOOOo == null) {
                this.f8114OooO00o = 2;
            }
            int i2 = this.f8114OooO00o;
            if (i2 == 2) {
                decoderInputBuffer.OooO0o0(4);
                return -4;
            }
            if ((i & 2) != 0 || i2 == 0) {
                o00o0001.f34055OooO0O0 = oo000oVar.f8110OooOOO0;
                this.f8114OooO00o = 1;
                return -5;
            }
            if (!z) {
                return -3;
            }
            oo000oVar.f8112OooOOOo.getClass();
            decoderInputBuffer.OooO0o0(1);
            decoderInputBuffer.f7087OooO0oo = 0L;
            if ((i & 4) == 0) {
                decoderInputBuffer.OooOO0(oo000oVar.f8113OooOOo0);
                decoderInputBuffer.f7084OooO0o.put(oo000oVar.f8112OooOOOo, 0, oo000oVar.f8113OooOOo0);
            }
            if ((i & 1) == 0) {
                this.f8114OooO00o = 2;
            }
            return -4;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int OooO0OO(long j) {
            OooO0o0();
            if (j <= 0 || this.f8114OooO00o == 2) {
                return 0;
            }
            this.f8114OooO00o = 2;
            return 1;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean OooO0Oo() {
            return oo000o.this.f8111OooOOOO;
        }

        public final void OooO0o0() {
            if (this.f8115OooO0O0) {
                return;
            }
            oo000o oo000oVar = oo000o.this;
            OooOo00.OooO00o oooO00o = oo000oVar.f8105OooO0oo;
            int iOooO0oO = o0000oo.OooO0oO(oo000oVar.f8110OooOOO0.f6412OooOOOO);
            androidx.media3.common.OooOO0 oooOO1 = oo000oVar.f8110OooOOO0;
            oooO00o.getClass();
            oooO00o.OooO00o(new o000O.Oooo000(1, iOooO0oO, oooOO1, 0, null, o00.o000oOoO(0L), -9223372036854775807L));
            this.f8115OooO0O0 = true;
        }
    }

    public static final class OooO0O0 implements Loader.OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final long f8117OooO00o = o000O.OooOo.f33842OooO0O0.getAndIncrement();

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final DataSpec f8118OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final o000O0O.OooOOOO f8119OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @Nullable
        public byte[] f8120OooO0Oo;

        public OooO0O0(androidx.media3.datasource.OooO00o oooO00o, DataSpec dataSpec) {
            this.f8118OooO0O0 = dataSpec;
            this.f8119OooO0OO = new o000O0O.OooOOOO(oooO00o);
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.OooO0o
        public final void OooO00o() throws IOException {
            o000O0O.OooOOOO oooOOOO = this.f8119OooO0OO;
            oooOOOO.f34182OooO0O0 = 0L;
            try {
                oooOOOO.OooO00o(this.f8118OooO0O0);
                int i = 0;
                while (i != -1) {
                    int i2 = (int) oooOOOO.f34182OooO0O0;
                    byte[] bArr = this.f8120OooO0Oo;
                    if (bArr == null) {
                        this.f8120OooO0Oo = new byte[LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY];
                    } else if (i2 == bArr.length) {
                        this.f8120OooO0Oo = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    byte[] bArr2 = this.f8120OooO0Oo;
                    i = oooOOOO.read(bArr2, i2, bArr2.length - i2);
                }
            } finally {
                o000O0O.OooO.OooO00o(oooOOOO);
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.OooO0o
        public final void OooO0O0() {
        }
    }

    public oo000o(DataSpec dataSpec, androidx.media3.datasource.OooO00o.InterfaceC0142OooO00o interfaceC0142OooO00o, @Nullable o000O0O.OooOo oooOo, androidx.media3.common.OooOO0 oooOO1, long j, LoadErrorHandlingPolicy loadErrorHandlingPolicy, OooOo00.OooO00o oooO00o, boolean z) {
        this.f8101OooO0Oo = dataSpec;
        this.f8103OooO0o0 = interfaceC0142OooO00o;
        this.f8102OooO0o = oooOo;
        this.f8110OooOOO0 = oooOO1;
        this.f8107OooOO0O = j;
        this.f8104OooO0oO = loadErrorHandlingPolicy;
        this.f8105OooO0oo = oooO00o;
        this.f8109OooOOO = z;
        this.f8100OooO = new oo0o0Oo(new androidx.media3.common.o000oOoO("", oooOO1));
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.OooO00o
    public final Loader.OooO0O0 OooO00o(Loader.OooO0o oooO0o, long j, long j2, IOException iOException, int i) {
        Loader.OooO0O0 oooO0O0;
        o000O0O.OooOOOO oooOOOO = ((OooO0O0) oooO0o).f8119OooO0OO;
        Uri uri = oooOOOO.f34183OooO0OO;
        o000O.OooOo oooOo = new o000O.OooOo(oooOOOO.f34184OooO0Oo);
        o00.o000oOoO(this.f8107OooOO0O);
        LoadErrorHandlingPolicy.OooO00o oooO00o = new LoadErrorHandlingPolicy.OooO00o(iOException, i);
        LoadErrorHandlingPolicy loadErrorHandlingPolicy = this.f8104OooO0oO;
        long jOooO00o = loadErrorHandlingPolicy.OooO00o(oooO00o);
        boolean z = jOooO00o == -9223372036854775807L || i >= loadErrorHandlingPolicy.OooO0O0(1);
        if (this.f8109OooOOO && z) {
            Log.OooO0oO("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f8111OooOOOO = true;
            oooO0O0 = Loader.f8253OooO0Oo;
        } else {
            oooO0O0 = jOooO00o != -9223372036854775807L ? new Loader.OooO0O0(0, jOooO00o) : Loader.f8254OooO0o0;
        }
        Loader.OooO0O0 oooO0O1 = oooO0O0;
        int i2 = oooO0O1.f8258OooO00o;
        boolean z2 = !(i2 == 0 || i2 == 1);
        this.f8105OooO0oo.OooO0Oo(oooOo, this.f8110OooOOO0, 0L, this.f8107OooOO0O, iOException, z2);
        if (z2) {
            loadErrorHandlingPolicy.OooO0OO();
        }
        return oooO0O1;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final long OooO0O0() {
        return (this.f8111OooOOOO || this.f8108OooOO0o.OooO00o()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0OO(long j) {
        int i = 0;
        while (true) {
            ArrayList<OooO00o> arrayList = this.f8106OooOO0;
            if (i >= arrayList.size()) {
                return j;
            }
            OooO00o oooO00o = arrayList.get(i);
            if (oooO00o.f8114OooO00o == 2) {
                oooO00o.f8114OooO00o = 1;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0Oo(androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        for (int i = 0; i < oooO0oArr.length; i++) {
            SampleStream sampleStream = sampleStreamArr[i];
            ArrayList<OooO00o> arrayList = this.f8106OooOO0;
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

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0o() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final boolean OooO0o0() {
        return this.f8108OooOO0o.OooO00o();
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooO0oO() {
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final boolean OooO0oo(long j) {
        if (!this.f8111OooOOOO) {
            Loader loader = this.f8108OooOO0o;
            if (!loader.OooO00o()) {
                if (!(loader.f8257OooO0OO != null)) {
                    androidx.media3.datasource.OooO00o OooO00o2 = this.f8103OooO0o0.OooO00o();
                    o000O0O.OooOo oooOo = this.f8102OooO0o;
                    if (oooOo != null) {
                        OooO00o2.OooO0oO(oooOo);
                    }
                    OooO0O0 oooO0O0 = new OooO0O0(OooO00o2, this.f8101OooO0Oo);
                    o000O.OooOo oooOo2 = new o000O.OooOo(oooO0O0.f8117OooO00o, this.f8101OooO0Oo, loader.OooO0O0(oooO0O0, this, this.f8104OooO0oO.OooO0O0(1)));
                    androidx.media3.common.OooOO0 oooOO1 = this.f8110OooOOO0;
                    OooOo00.OooO00o oooO00o = this.f8105OooO0oo;
                    oooO00o.getClass();
                    oooO00o.OooO0o(oooOo2, new o000O.Oooo000(1, -1, oooOO1, 0, null, o00.o000oOoO(0L), o00.o000oOoO(this.f8107OooOO0O)));
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooOO0(long j, o00OO0O0 o00oo0o1) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooOO0o(OooOOO.OooO00o oooO00o, long j) {
        oooO00o.OooO00o(this);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.OooO00o
    public final void OooOOO(Loader.OooO0o oooO0o, long j, long j2) {
        OooO0O0 oooO0O0 = (OooO0O0) oooO0o;
        this.f8113OooOOo0 = (int) oooO0O0.f8119OooO0OO.f34182OooO0O0;
        byte[] bArr = oooO0O0.f8120OooO0Oo;
        bArr.getClass();
        this.f8112OooOOOo = bArr;
        this.f8111OooOOOO = true;
        o000O0O.OooOOOO oooOOOO = oooO0O0.f8119OooO0OO;
        Uri uri = oooOOOO.f34183OooO0OO;
        o000O.OooOo oooOo = new o000O.OooOo(oooOOOO.f34184OooO0Oo);
        this.f8104OooO0oO.OooO0OO();
        androidx.media3.common.OooOO0 oooOO1 = this.f8110OooOOO0;
        OooOo00.OooO00o oooO00o = this.f8105OooO0oo;
        oooO00o.getClass();
        oooO00o.OooO0OO(oooOo, new o000O.Oooo000(1, -1, oooOO1, 0, null, o00.o000oOoO(0L), o00.o000oOoO(this.f8107OooOO0O)));
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final oo0o0Oo OooOOO0() {
        return this.f8100OooO;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final long OooOOOo() {
        return this.f8111OooOOOO ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final void OooOOo(long j) {
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooOOo0(long j, boolean z) {
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.OooO00o
    public final void OooOOoo(Loader.OooO0o oooO0o, long j, long j2, boolean z) {
        o000O0O.OooOOOO oooOOOO = ((OooO0O0) oooO0o).f8119OooO0OO;
        Uri uri = oooOOOO.f34183OooO0OO;
        o000O.OooOo oooOo = new o000O.OooOo(oooOOOO.f34184OooO0Oo);
        this.f8104OooO0oO.OooO0OO();
        OooOo00.OooO00o oooO00o = this.f8105OooO0oo;
        oooO00o.getClass();
        oooO00o.OooO0O0(oooOo, new o000O.Oooo000(1, -1, null, 0, null, o00.o000oOoO(0L), o00.o000oOoO(this.f8107OooOO0O)));
    }
}
