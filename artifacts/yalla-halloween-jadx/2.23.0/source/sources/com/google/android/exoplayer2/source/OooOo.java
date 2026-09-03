package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import p203o00o0o0o.o0O00OO;
import p226o00oOo00.o000O0;
import p226o00oOo00.o000O00O;
import p226o00oOo00.o000OOo;
import p226o00oOo00.o0O0O00;
import p235o00oOooO.o00OO000;
import p235o00oOooO.o00OOO0;
import p235o00oOooO.o00OOO0O;
import p245o00oo0o.o00O000o;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOo implements OooOOO, OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooOOO.OooO00o f13042OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOO[] f13043OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000OOo f13044OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final IdentityHashMap<SampleStream, Integer> f13045OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList<OooOOO> f13046OooO0oO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final HashMap<o000O00O, o000O00O> f13047OooO0oo = new HashMap<>();

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public o000O0 f13048OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public OooOOO[] f13049OooOO0O;

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    public o0O0O00 f13050OooOO0o;

    public static final class OooO00o implements com.google.android.exoplayer2.trackselection.OooO0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final com.google.android.exoplayer2.trackselection.OooO0o f13051OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final o000O00O f13052OooO0O0;

        public OooO00o(com.google.android.exoplayer2.trackselection.OooO0o oooO0o, o000O00O o000o00o2) {
            this.f13051OooO00o = oooO0o;
            this.f13052OooO0O0 = o000o00o2;
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public final int OooO(int i) {
            return this.f13051OooO00o.OooO(i);
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        public final int OooO00o() {
            return this.f13051OooO00o.OooO00o();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public final com.google.android.exoplayer2.OooOo OooO0O0(int i) {
            return this.f13051OooO00o.OooO0O0(i);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public final int OooO0OO(int i) {
            return this.f13051OooO00o.OooO0OO(i);
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        public final boolean OooO0Oo(long j, o00OO000 o00oo001, List<? extends o00OOO0> list) {
            return this.f13051OooO00o.OooO0Oo(j, o00oo001, list);
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        public final void OooO0o() {
            this.f13051OooO00o.OooO0o();
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        public final void OooO0o0(float f) {
            this.f13051OooO00o.OooO0o0(f);
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        @Nullable
        public final Object OooO0oO() {
            return this.f13051OooO00o.OooO0oO();
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        public final void OooO0oo() {
            this.f13051OooO00o.OooO0oo();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public final o000O00O OooOO0() {
            return this.f13052OooO0O0;
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        public final void OooOO0O(boolean z) {
            this.f13051OooO00o.OooOO0O(z);
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        public final void OooOO0o() {
            this.f13051OooO00o.OooOO0o();
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public final int OooOOO(com.google.android.exoplayer2.OooOo oooOo) {
            return this.f13051OooO00o.OooOOO(oooOo);
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        public final int OooOOO0(long j, List<? extends o00OOO0> list) {
            return this.f13051OooO00o.OooOOO0(j, list);
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        public final void OooOOOO(long j, long j2, long j3, List<? extends o00OOO0> list, o00OOO0O[] o00ooo0oArr) {
            this.f13051OooO00o.OooOOOO(j, j2, j3, list, o00ooo0oArr);
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        public final com.google.android.exoplayer2.OooOo OooOOOo() {
            return this.f13051OooO00o.OooOOOo();
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        public final void OooOOo() {
            this.f13051OooO00o.OooOOo();
        }

        @Override // com.google.android.exoplayer2.trackselection.OooO0o
        public final int OooOOo0() {
            return this.f13051OooO00o.OooOOo0();
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f13051OooO00o.equals(oooO00o.f13051OooO00o) && this.f13052OooO0O0.equals(oooO00o.f13052OooO0O0);
        }

        public final int hashCode() {
            return this.f13051OooO00o.hashCode() + ((this.f13052OooO0O0.hashCode() + 527) * 31);
        }

        @Override // com.google.android.exoplayer2.trackselection.TrackSelection
        public final int length() {
            return this.f13051OooO00o.length();
        }
    }

    public static final class OooO0O0 implements OooOOO, OooOOO.OooO00o {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final OooOOO f13053OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public OooOOO.OooO00o f13054OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f13055OooO0o0;

        public OooO0O0(OooOOO oooOOO, long j) {
            this.f13053OooO0Oo = oooOOO;
            this.f13055OooO0o0 = j;
        }

        @Override // com.google.android.exoplayer2.source.OooOOO
        public final long OooO() {
            long jOooO = this.f13053OooO0Oo.OooO();
            if (jOooO == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f13055OooO0o0 + jOooO;
        }

        @Override // com.google.android.exoplayer2.source.o00Oo0.OooO00o
        public final void OooO00o(o00Oo0 o00oo1) {
            OooOOO.OooO00o oooO00o = this.f13054OooO0o;
            oooO00o.getClass();
            oooO00o.OooO00o(this);
        }

        @Override // com.google.android.exoplayer2.source.OooOOO.OooO00o
        public final void OooO0O0(OooOOO oooOOO) {
            OooOOO.OooO00o oooO00o = this.f13054OooO0o;
            oooO00o.getClass();
            oooO00o.OooO0O0(this);
        }

        @Override // com.google.android.exoplayer2.source.OooOOO
        public final long OooO0OO(long j, o0O00OO o0o00oo2) {
            long j2 = this.f13055OooO0o0;
            return this.f13053OooO0Oo.OooO0OO(j - j2, o0o00oo2) + j2;
        }

        @Override // com.google.android.exoplayer2.source.o00Oo0
        public final long OooO0o0() {
            long jOooO0o0 = this.f13053OooO0Oo.OooO0o0();
            if (jOooO0o0 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f13055OooO0o0 + jOooO0o0;
        }

        @Override // com.google.android.exoplayer2.source.OooOOO
        public final long OooO0oO(long j) {
            long j2 = this.f13055OooO0o0;
            return this.f13053OooO0Oo.OooO0oO(j - j2) + j2;
        }

        @Override // com.google.android.exoplayer2.source.o00Oo0
        public final boolean OooO0oo() {
            return this.f13053OooO0Oo.OooO0oo();
        }

        @Override // com.google.android.exoplayer2.source.OooOOO
        public final void OooOO0(OooOOO.OooO00o oooO00o, long j) {
            this.f13054OooO0o = oooO00o;
            this.f13053OooO0Oo.OooOO0(this, j - this.f13055OooO0o0);
        }

        @Override // com.google.android.exoplayer2.source.OooOOO
        public final long OooOO0O(com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            SampleStream[] sampleStreamArr2 = new SampleStream[sampleStreamArr.length];
            int i = 0;
            while (true) {
                SampleStream sampleStream = null;
                if (i >= sampleStreamArr.length) {
                    break;
                }
                OooO0OO oooO0OO = (OooO0OO) sampleStreamArr[i];
                if (oooO0OO != null) {
                    sampleStream = oooO0OO.f13056OooO0Oo;
                }
                sampleStreamArr2[i] = sampleStream;
                i++;
            }
            OooOOO oooOOO = this.f13053OooO0Oo;
            long j2 = this.f13055OooO0o0;
            long jOooOO0O = oooOOO.OooOO0O(oooO0oArr, zArr, sampleStreamArr2, zArr2, j - j2);
            for (int i2 = 0; i2 < sampleStreamArr.length; i2++) {
                SampleStream sampleStream2 = sampleStreamArr2[i2];
                if (sampleStream2 == null) {
                    sampleStreamArr[i2] = null;
                } else {
                    SampleStream sampleStream3 = sampleStreamArr[i2];
                    if (sampleStream3 == null || ((OooO0OO) sampleStream3).f13056OooO0Oo != sampleStream2) {
                        sampleStreamArr[i2] = new OooO0OO(sampleStream2, j2);
                    }
                }
            }
            return jOooOO0O + j2;
        }

        @Override // com.google.android.exoplayer2.source.OooOOO
        public final void OooOOOO() throws IOException {
            this.f13053OooO0Oo.OooOOOO();
        }

        @Override // com.google.android.exoplayer2.source.OooOOO
        public final o000O0 OooOOo() {
            return this.f13053OooO0Oo.OooOOo();
        }

        @Override // com.google.android.exoplayer2.source.o00Oo0
        public final boolean OooOOo0(long j) {
            return this.f13053OooO0Oo.OooOOo0(j - this.f13055OooO0o0);
        }

        @Override // com.google.android.exoplayer2.source.o00Oo0
        public final long OooOOoo() {
            long jOooOOoo = this.f13053OooO0Oo.OooOOoo();
            if (jOooOOoo == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f13055OooO0o0 + jOooOOoo;
        }

        @Override // com.google.android.exoplayer2.source.o00Oo0
        public final void OooOo0(long j) {
            this.f13053OooO0Oo.OooOo0(j - this.f13055OooO0o0);
        }

        @Override // com.google.android.exoplayer2.source.OooOOO
        public final void OooOo00(long j, boolean z) {
            this.f13053OooO0Oo.OooOo00(j - this.f13055OooO0o0, z);
        }
    }

    public static final class OooO0OO implements SampleStream {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final SampleStream f13056OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final long f13057OooO0o0;

        public OooO0OO(SampleStream sampleStream, long j) {
            this.f13056OooO0Oo = sampleStream;
            this.f13057OooO0o0 = j;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final void OooO00o() throws IOException {
            this.f13056OooO0Oo.OooO00o();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final boolean OooO0O0() {
            return this.f13056OooO0Oo.OooO0O0();
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooOOO(p203o00o0o0o.o00OOO0O o00ooo0o, DecoderInputBuffer decoderInputBuffer, int i) {
            int iOooOOO = this.f13056OooO0Oo.OooOOO(o00ooo0o, decoderInputBuffer, i);
            if (iOooOOO == -4) {
                decoderInputBuffer.f11677OooO0oo = Math.max(0L, decoderInputBuffer.f11677OooO0oo + this.f13057OooO0o0);
            }
            return iOooOOO;
        }

        @Override // com.google.android.exoplayer2.source.SampleStream
        public final int OooOOOo(long j) {
            return this.f13056OooO0Oo.OooOOOo(j - this.f13057OooO0o0);
        }
    }

    public OooOo(o000OOo o000ooo2, long[] jArr, OooOOO... oooOOOArr) {
        this.f13044OooO0o = o000ooo2;
        this.f13043OooO0Oo = oooOOOArr;
        o000ooo2.getClass();
        this.f13050OooOO0o = new o0O0O00(new o00Oo0[0]);
        this.f13045OooO0o0 = new IdentityHashMap<>();
        this.f13049OooOO0O = new OooOOO[0];
        for (int i = 0; i < oooOOOArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f13043OooO0Oo[i] = new OooO0O0(oooOOOArr[i], j);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO() {
        long j = -9223372036854775807L;
        for (OooOOO oooOOO : this.f13049OooOO0O) {
            long jOooO = oooOOO.OooO();
            if (jOooO == -9223372036854775807L) {
                if (j != -9223372036854775807L && oooOOO.OooO0oO(j) != j) {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else if (j == -9223372036854775807L) {
                for (OooOOO oooOOO2 : this.f13049OooOO0O) {
                    if (oooOOO2 == oooOOO) {
                        break;
                    }
                    if (oooOOO2.OooO0oO(jOooO) != jOooO) {
                        throw new IllegalStateException("Unexpected child seekToUs result.");
                    }
                }
                j = jOooO;
            } else if (jOooO != j) {
                throw new IllegalStateException("Conflicting discontinuities.");
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0.OooO00o
    public final void OooO00o(o00Oo0 o00oo1) {
        OooOOO.OooO00o oooO00o = this.f13042OooO;
        oooO00o.getClass();
        oooO00o.OooO00o(this);
    }

    @Override // com.google.android.exoplayer2.source.OooOOO.OooO00o
    public final void OooO0O0(OooOOO oooOOO) {
        ArrayList<OooOOO> arrayList = this.f13046OooO0oO;
        arrayList.remove(oooOOO);
        if (arrayList.isEmpty()) {
            OooOOO[] oooOOOArr = this.f13043OooO0Oo;
            int i = 0;
            for (OooOOO oooOOO2 : oooOOOArr) {
                i += oooOOO2.OooOOo().f39866OooO0Oo;
            }
            o000O00O[] o000o00oArr = new o000O00O[i];
            int i2 = 0;
            for (int i3 = 0; i3 < oooOOOArr.length; i3++) {
                o000O0 o000o0OooOOo = oooOOOArr[i3].OooOOo();
                int i4 = o000o0OooOOo.f39866OooO0Oo;
                int i5 = 0;
                while (i5 < i4) {
                    o000O00O o000o00oOooO00o = o000o0OooOOo.OooO00o(i5);
                    o000O00O o000o00o2 = new o000O00O(i3 + CertificateUtil.DELIMITER + o000o00oOooO00o.f39875OooO0o0, o000o00oOooO00o.f39876OooO0oO);
                    this.f13047OooO0oo.put(o000o00o2, o000o00oOooO00o);
                    o000o00oArr[i2] = o000o00o2;
                    i5++;
                    i2++;
                }
            }
            this.f13048OooOO0 = new o000O0(o000o00oArr);
            OooOOO.OooO00o oooO00o = this.f13042OooO;
            oooO00o.getClass();
            oooO00o.OooO0O0(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO0OO(long j, o0O00OO o0o00oo2) {
        OooOOO[] oooOOOArr = this.f13049OooOO0O;
        return (oooOOOArr.length > 0 ? oooOOOArr[0] : this.f13043OooO0Oo[0]).OooO0OO(j, o0o00oo2);
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooO0o0() {
        return this.f13050OooOO0o.OooO0o0();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO0oO(long j) {
        long jOooO0oO = this.f13049OooOO0O[0].OooO0oO(j);
        int i = 1;
        while (true) {
            OooOOO[] oooOOOArr = this.f13049OooOO0O;
            if (i >= oooOOOArr.length) {
                return jOooO0oO;
            }
            if (oooOOOArr[i].OooO0oO(jOooO0oO) != jOooO0oO) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooO0oo() {
        return this.f13050OooOO0o.OooO0oo();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOO0(OooOOO.OooO00o oooO00o, long j) {
        this.f13042OooO = oooO00o;
        ArrayList<OooOOO> arrayList = this.f13046OooO0oO;
        OooOOO[] oooOOOArr = this.f13043OooO0Oo;
        Collections.addAll(arrayList, oooOOOArr);
        for (OooOOO oooOOO : oooOOOArr) {
            oooOOO.OooOO0(this, j);
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooOO0O(com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        IdentityHashMap<SampleStream, Integer> identityHashMap;
        int[] iArr = new int[oooO0oArr.length];
        int[] iArr2 = new int[oooO0oArr.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            int length = oooO0oArr.length;
            identityHashMap = this.f13045OooO0o0;
            if (i2 >= length) {
                break;
            }
            SampleStream sampleStream = sampleStreamArr[i2];
            Integer num = sampleStream == null ? null : identityHashMap.get(sampleStream);
            iArr[i2] = num == null ? -1 : num.intValue();
            com.google.android.exoplayer2.trackselection.OooO0o oooO0o = oooO0oArr[i2];
            if (oooO0o != null) {
                String str = oooO0o.OooOO0().f39875OooO0o0;
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
        com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr2 = new com.google.android.exoplayer2.trackselection.OooO0o[oooO0oArr.length];
        OooOOO[] oooOOOArr = this.f13043OooO0Oo;
        ArrayList arrayList = new ArrayList(oooOOOArr.length);
        long j2 = j;
        int i3 = 0;
        while (i3 < oooOOOArr.length) {
            int i4 = i;
            while (i4 < oooO0oArr.length) {
                sampleStreamArr3[i4] = iArr[i4] == i3 ? sampleStreamArr[i4] : null;
                if (iArr2[i4] == i3) {
                    com.google.android.exoplayer2.trackselection.OooO0o oooO0o2 = oooO0oArr[i4];
                    oooO0o2.getClass();
                    o000O00O o000o00o2 = this.f13047OooO0oo.get(oooO0o2.OooOO0());
                    o000o00o2.getClass();
                    oooO0oArr2[i4] = new OooO00o(oooO0o2, o000o00o2);
                } else {
                    oooO0oArr2[i4] = null;
                }
                i4++;
                arrayList = arrayList;
            }
            ArrayList arrayList2 = arrayList;
            int i5 = i3;
            OooOOO[] oooOOOArr2 = oooOOOArr;
            com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr3 = oooO0oArr2;
            long jOooOO0O = oooOOOArr[i3].OooOO0O(oooO0oArr2, zArr, sampleStreamArr3, zArr2, j2);
            if (i5 == 0) {
                j2 = jOooOO0O;
            } else if (jOooOO0O != j2) {
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
                    o00O000o.OooO0Oo(sampleStreamArr3[i6] == null);
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
        this.f13049OooOO0O = oooOOOArr3;
        this.f13044OooO0o.getClass();
        this.f13050OooOO0o = new o0O0O00(oooOOOArr3);
        return j2;
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOOOO() throws IOException {
        for (OooOOO oooOOO : this.f13043OooO0Oo) {
            oooOOO.OooOOOO();
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final o000O0 OooOOo() {
        o000O0 o000o0 = this.f13048OooOO0;
        o000o0.getClass();
        return o000o0;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooOOo0(long j) {
        ArrayList<OooOOO> arrayList = this.f13046OooO0oO;
        if (arrayList.isEmpty()) {
            return this.f13050OooOO0o.OooOOo0(j);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).OooOOo0(j);
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooOOoo() {
        return this.f13050OooOO0o.OooOOoo();
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final void OooOo0(long j) {
        this.f13050OooOO0o.OooOo0(j);
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOo00(long j, boolean z) {
        for (OooOOO oooOOO : this.f13049OooOO0O) {
            oooOOO.OooOo00(j, z);
        }
    }
}
