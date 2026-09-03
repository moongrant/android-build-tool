package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.decoder.DecoderInputBuffer;
import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import o000O.oo0o0Oo;
import o000O00O.o00O0000;
import o000O00O.o00OO0O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements OooOOO, OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooOOO.OooO00o f7941OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO[] f7942OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000O.OooO0o f7943OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final IdentityHashMap<SampleStream, Integer> f7944OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList<OooOOO> f7945OooO0oO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap<androidx.media3.common.o000oOoO, androidx.media3.common.o000oOoO> f7946OooO0oo = new HashMap<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public oo0o0Oo f7947OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooOOO[] f7948OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o000O.OooO0OO f7949OooOO0o;

    public static final class OooO00o implements androidx.media3.exoplayer.trackselection.OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final androidx.media3.exoplayer.trackselection.OooO0o f7950OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final androidx.media3.common.o000oOoO f7951OooO0O0;

        public OooO00o(androidx.media3.exoplayer.trackselection.OooO0o oooO0o, androidx.media3.common.o000oOoO o000oooo2) {
            this.f7950OooO00o = oooO0o;
            this.f7951OooO0O0 = o000oooo2;
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0o
        public final void OooO(boolean z) {
            this.f7950OooO00o.OooO(z);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final androidx.media3.common.OooOO0 OooO0O0(int i) {
            return this.f7950OooO00o.OooO0O0(i);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final int OooO0OO(int i) {
            return this.f7950OooO00o.OooO0OO(i);
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0o
        public final void OooO0Oo(float f) {
            this.f7950OooO00o.OooO0Oo(f);
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0o
        public final void OooO0o() {
            this.f7950OooO00o.OooO0o();
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0o
        public final void OooO0o0() {
            this.f7950OooO00o.OooO0o0();
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final int OooO0oO(int i) {
            return this.f7950OooO00o.OooO0oO(i);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final androidx.media3.common.o000oOoO OooO0oo() {
            return this.f7951OooO0O0;
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0o
        public final void OooOO0() {
            this.f7950OooO00o.OooOO0();
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0o
        public final androidx.media3.common.OooOO0 OooOO0O() {
            return this.f7950OooO00o.OooOO0O();
        }

        @Override // androidx.media3.exoplayer.trackselection.OooO0o
        public final void OooOO0o() {
            this.f7950OooO00o.OooOO0o();
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f7950OooO00o.equals(oooO00o.f7950OooO00o) && this.f7951OooO0O0.equals(oooO00o.f7951OooO0O0);
        }

        public final int hashCode() {
            return this.f7950OooO00o.hashCode() + ((this.f7951OooO0O0.hashCode() + 527) * 31);
        }

        @Override // androidx.media3.exoplayer.trackselection.TrackSelection
        public final int length() {
            return this.f7950OooO00o.length();
        }
    }

    public static final class OooO0O0 implements OooOOO, OooOOO.OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOOO f7952OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooOOO.OooO00o f7953OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f7954OooO0o0;

        public OooO0O0(OooOOO oooOOO, long j) {
            this.f7952OooO0Oo = oooOOO;
            this.f7954OooO0o0 = j;
        }

        @Override // androidx.media3.exoplayer.source.o00Oo0.OooO00o
        public final void OooO(o00Oo0 o00oo1) {
            OooOOO.OooO00o oooO00o = this.f7953OooO0o;
            oooO00o.getClass();
            oooO00o.OooO(this);
        }

        @Override // androidx.media3.exoplayer.source.OooOOO.OooO00o
        public final void OooO00o(OooOOO oooOOO) {
            OooOOO.OooO00o oooO00o = this.f7953OooO0o;
            oooO00o.getClass();
            oooO00o.OooO00o(this);
        }

        @Override // androidx.media3.exoplayer.source.o00Oo0
        public final long OooO0O0() {
            long jOooO0O0 = this.f7952OooO0Oo.OooO0O0();
            if (jOooO0O0 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f7954OooO0o0 + jOooO0O0;
        }

        @Override // androidx.media3.exoplayer.source.OooOOO
        public final long OooO0OO(long j) {
            long j2 = this.f7954OooO0o0;
            return this.f7952OooO0Oo.OooO0OO(j - j2) + j2;
        }

        @Override // androidx.media3.exoplayer.source.OooOOO
        public final long OooO0Oo(androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
            int i = 0;
            while (true) {
                SampleStream sampleStream = null;
                if (i >= sampleStreamArr.length) {
                    break;
                }
                OooO0OO oooO0OO = (OooO0OO) sampleStreamArr[i];
                if (oooO0OO != null) {
                    sampleStream = oooO0OO.f7955OooO00o;
                }
                sampleStreamArr2[i] = sampleStream;
                i++;
            }
            OooOOO oooOOO = this.f7952OooO0Oo;
            long j2 = this.f7954OooO0o0;
            long jOooO0Oo = oooOOO.OooO0Oo(oooO0oArr, zArr, sampleStreamArr2, zArr2, j - j2);
            for (int i2 = 0; i2 < sampleStreamArr.length; i2++) {
                SampleStream sampleStream2 = sampleStreamArr2[i2];
                if (sampleStream2 == null) {
                    sampleStreamArr[i2] = null;
                } else {
                    SampleStream sampleStream3 = sampleStreamArr[i2];
                    if (sampleStream3 == null || ((OooO0OO) sampleStream3).f7955OooO00o != sampleStream2) {
                        sampleStreamArr[i2] = new OooO0OO(sampleStream2, j2);
                    }
                }
            }
            return jOooO0Oo + j2;
        }

        @Override // androidx.media3.exoplayer.source.OooOOO
        public final long OooO0o() {
            long jOooO0o = this.f7952OooO0Oo.OooO0o();
            if (jOooO0o == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f7954OooO0o0 + jOooO0o;
        }

        @Override // androidx.media3.exoplayer.source.o00Oo0
        public final boolean OooO0o0() {
            return this.f7952OooO0Oo.OooO0o0();
        }

        @Override // androidx.media3.exoplayer.source.OooOOO
        public final void OooO0oO() throws IOException {
            this.f7952OooO0Oo.OooO0oO();
        }

        @Override // androidx.media3.exoplayer.source.o00Oo0
        public final boolean OooO0oo(long j) {
            return this.f7952OooO0Oo.OooO0oo(j - this.f7954OooO0o0);
        }

        @Override // androidx.media3.exoplayer.source.OooOOO
        public final long OooOO0(long j, o00OO0O0 o00oo0o1) {
            long j2 = this.f7954OooO0o0;
            return this.f7952OooO0Oo.OooOO0(j - j2, o00oo0o1) + j2;
        }

        @Override // androidx.media3.exoplayer.source.OooOOO
        public final void OooOO0o(OooOOO.OooO00o oooO00o, long j) {
            this.f7953OooO0o = oooO00o;
            this.f7952OooO0Oo.OooOO0o(this, j - this.f7954OooO0o0);
        }

        @Override // androidx.media3.exoplayer.source.OooOOO
        public final oo0o0Oo OooOOO0() {
            return this.f7952OooO0Oo.OooOOO0();
        }

        @Override // androidx.media3.exoplayer.source.o00Oo0
        public final long OooOOOo() {
            long jOooOOOo = this.f7952OooO0Oo.OooOOOo();
            if (jOooOOOo == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f7954OooO0o0 + jOooOOOo;
        }

        @Override // androidx.media3.exoplayer.source.o00Oo0
        public final void OooOOo(long j) {
            this.f7952OooO0Oo.OooOOo(j - this.f7954OooO0o0);
        }

        @Override // androidx.media3.exoplayer.source.OooOOO
        public final void OooOOo0(long j, boolean z) {
            this.f7952OooO0Oo.OooOOo0(j - this.f7954OooO0o0, z);
        }
    }

    public static final class OooO0OO implements SampleStream {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final SampleStream f7955OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final long f7956OooO0O0;

        public OooO0OO(SampleStream sampleStream, long j) {
            this.f7955OooO00o = sampleStream;
            this.f7956OooO0O0 = j;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void OooO00o() throws IOException {
            this.f7955OooO00o.OooO00o();
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int OooO0O0(o00O0000 o00o0001, DecoderInputBuffer decoderInputBuffer, int i) {
            int iOooO0O0 = this.f7955OooO00o.OooO0O0(o00o0001, decoderInputBuffer, i);
            if (iOooO0O0 == -4) {
                decoderInputBuffer.f7087OooO0oo = Math.max(0L, decoderInputBuffer.f7087OooO0oo + this.f7956OooO0O0);
            }
            return iOooO0O0;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int OooO0OO(long j) {
            return this.f7955OooO00o.OooO0OO(j - this.f7956OooO0O0);
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean OooO0Oo() {
            return this.f7955OooO00o.OooO0Oo();
        }
    }

    public OooOo(o000O.OooO0o oooO0o, long[] jArr, OooOOO... oooOOOArr) {
        this.f7943OooO0o = oooO0o;
        this.f7942OooO0Oo = oooOOOArr;
        oooO0o.getClass();
        this.f7949OooOO0o = new o000O.OooO0OO(new o00Oo0[0]);
        this.f7944OooO0o0 = new IdentityHashMap<>();
        this.f7948OooOO0O = new OooOOO[0];
        for (int i = 0; i < oooOOOArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f7942OooO0Oo[i] = new OooO0O0(oooOOOArr[i], j);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0.OooO00o
    public final void OooO(o00Oo0 o00oo1) {
        OooOOO.OooO00o oooO00o = this.f7941OooO;
        oooO00o.getClass();
        oooO00o.OooO(this);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO.OooO00o
    public final void OooO00o(OooOOO oooOOO) {
        ArrayList<OooOOO> arrayList = this.f7945OooO0oO;
        arrayList.remove(oooOOO);
        if (arrayList.isEmpty()) {
            OooOOO[] oooOOOArr = this.f7942OooO0Oo;
            int i = 0;
            for (OooOOO oooOOO2 : oooOOOArr) {
                i += oooOOO2.OooOOO0().f33893OooO0Oo;
            }
            androidx.media3.common.o000oOoO[] o000ooooArr = new androidx.media3.common.o000oOoO[i];
            int i2 = 0;
            for (int i3 = 0; i3 < oooOOOArr.length; i3++) {
                oo0o0Oo oo0o0ooOooOOO0 = oooOOOArr[i3].OooOOO0();
                int i4 = oo0o0ooOooOOO0.f33893OooO0Oo;
                int i5 = 0;
                while (i5 < i4) {
                    androidx.media3.common.o000oOoO o000ooooOooO0OO = oo0o0ooOooOOO0.OooO0OO(i5);
                    androidx.media3.common.o000oOoO o000oooo2 = new androidx.media3.common.o000oOoO(i3 + CertificateUtil.DELIMITER + o000ooooOooO0OO.f6767OooO0o0, o000ooooOooO0OO.f6768OooO0oO);
                    this.f7946OooO0oo.put(o000oooo2, o000ooooOooO0OO);
                    o000ooooArr[i2] = o000oooo2;
                    i5++;
                    i2++;
                }
            }
            this.f7947OooOO0 = new oo0o0Oo(o000ooooArr);
            OooOOO.OooO00o oooO00o = this.f7941OooO;
            oooO00o.getClass();
            oooO00o.OooO00o(this);
        }
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final long OooO0O0() {
        return this.f7949OooOO0o.OooO0O0();
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0OO(long j) {
        long jOooO0OO = this.f7948OooOO0O[0].OooO0OO(j);
        int i = 1;
        while (true) {
            OooOOO[] oooOOOArr = this.f7948OooOO0O;
            if (i >= oooOOOArr.length) {
                return jOooO0OO;
            }
            if (oooOOOArr[i].OooO0OO(jOooO0OO) != jOooO0OO) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0Oo(androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        IdentityHashMap<SampleStream, Integer> identityHashMap;
        int[] iArr = new int[oooO0oArr.length];
        int[] iArr2 = new int[oooO0oArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = oooO0oArr.length;
            identityHashMap = this.f7944OooO0o0;
            if (i2 >= length) {
                break;
            }
            SampleStream sampleStream = sampleStreamArr[i2];
            Integer num = sampleStream == null ? null : identityHashMap.get(sampleStream);
            iArr[i2] = num == null ? -1 : num.intValue();
            androidx.media3.exoplayer.trackselection.OooO0o oooO0o = oooO0oArr[i2];
            if (oooO0o != null) {
                String str = oooO0o.OooO0oo().f6767OooO0o0;
                iArr2[i2] = Integer.parseInt(str.substring(0, str.indexOf(CertificateUtil.DELIMITER)));
            } else {
                iArr2[i2] = -1;
            }
            i2++;
        }
        identityHashMap.clear();
        int length2 = oooO0oArr.length;
        SampleStream[] sampleStreamArr2 = new SampleStream[length2];
        SampleStream[] sampleStreamArr3 = new SampleStream[oooO0oArr.length];
        androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr2 = new androidx.media3.exoplayer.trackselection.OooO0o[oooO0oArr.length];
        OooOOO[] oooOOOArr = this.f7942OooO0Oo;
        ArrayList arrayList = new ArrayList(oooOOOArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < oooOOOArr.length) {
            int i4 = i;
            while (i4 < oooO0oArr.length) {
                sampleStreamArr3[i4] = iArr[i4] == i3 ? sampleStreamArr[i4] : null;
                if (iArr2[i4] == i3) {
                    androidx.media3.exoplayer.trackselection.OooO0o oooO0o2 = oooO0oArr[i4];
                    oooO0o2.getClass();
                    androidx.media3.common.o000oOoO o000oooo2 = this.f7946OooO0oo.get(oooO0o2.OooO0oo());
                    o000oooo2.getClass();
                    oooO0oArr2[i4] = new OooO00o(oooO0o2, o000oooo2);
                } else {
                    oooO0oArr2[i4] = null;
                }
                i4++;
                arrayList = arrayList;
            }
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            OooOOO[] oooOOOArr2 = oooOOOArr;
            androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr3 = oooO0oArr2;
            long jOooO0Oo = oooOOOArr[i3].OooO0Oo(oooO0oArr2, zArr, sampleStreamArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jOooO0Oo;
            } else if (jOooO0Oo != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i6 = 0; i6 < oooO0oArr.length; i6++) {
                if (iArr2[i6] == i5) {
                    SampleStream sampleStream2 = sampleStreamArr3[i6];
                    sampleStream2.getClass();
                    sampleStreamArr2[i6] = sampleStreamArr3[i6];
                    identityHashMap.put(sampleStream2, Integer.valueOf(i5));
                    z = true;
                } else if (iArr[i6] == i5) {
                    p080o000OoO.o00Oo0.OooO0Oo(sampleStreamArr3[i6] == null);
                }
            }
            if (z) {
                arrayList2.add(oooOOOArr2[i5]);
            }
            i3 = i5 + 1;
            arrayList = arrayList2;
            oooOOOArr = oooOOOArr2;
            oooO0oArr2 = oooO0oArr3;
            i = 0;
        }
        int i7 = i;
        System.arraycopy(sampleStreamArr2, i7, sampleStreamArr, i7, length2);
        OooOOO[] oooOOOArr3 = (OooOOO[]) arrayList.toArray(new OooOOO[i7]);
        this.f7948OooOO0O = oooOOOArr3;
        this.f7943OooO0o.getClass();
        this.f7949OooOO0o = new o000O.OooO0OO(oooOOOArr3);
        return j2;
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0o() {
        long j = -9223372036854775807L;
        for (OooOOO oooOOO : this.f7948OooOO0O) {
            long jOooO0o = oooOOO.OooO0o();
            if (jOooO0o == -9223372036854775807L) {
                if (j != -9223372036854775807L && oooOOO.OooO0OO(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (OooOOO oooOOO2 : this.f7948OooOO0O) {
                    if (oooOOO2 == oooOOO) {
                        break;
                    }
                    if (oooOOO2.OooO0OO(jOooO0o) != jOooO0o) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jOooO0o;
            } else if (jOooO0o != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final boolean OooO0o0() {
        return this.f7949OooOO0o.OooO0o0();
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooO0oO() throws IOException {
        for (OooOOO oooOOO : this.f7942OooO0Oo) {
            oooOOO.OooO0oO();
        }
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final boolean OooO0oo(long j) {
        ArrayList<OooOOO> arrayList = this.f7945OooO0oO;
        if (arrayList.isEmpty()) {
            return this.f7949OooOO0o.OooO0oo(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).OooO0oo(j);
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooOO0(long j, o00OO0O0 o00oo0o1) {
        OooOOO[] oooOOOArr = this.f7948OooOO0O;
        return (oooOOOArr.length > 0 ? oooOOOArr[0] : this.f7942OooO0Oo[0]).OooOO0(j, o00oo0o1);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooOO0o(OooOOO.OooO00o oooO00o, long j) {
        this.f7941OooO = oooO00o;
        ArrayList<OooOOO> arrayList = this.f7945OooO0oO;
        OooOOO[] oooOOOArr = this.f7942OooO0Oo;
        Collections.addAll(arrayList, oooOOOArr);
        for (OooOOO oooOOO : oooOOOArr) {
            oooOOO.OooOO0o(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final oo0o0Oo OooOOO0() {
        oo0o0Oo oo0o0oo = this.f7947OooOO0;
        oo0o0oo.getClass();
        return oo0o0oo;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final long OooOOOo() {
        return this.f7949OooOO0o.OooOOOo();
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final void OooOOo(long j) {
        this.f7949OooOO0o.OooOOo(j);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooOOo0(long j, boolean z) {
        for (OooOOO oooOOO : this.f7948OooOO0O) {
            oooOOO.OooOOo0(j, z);
        }
    }
}
