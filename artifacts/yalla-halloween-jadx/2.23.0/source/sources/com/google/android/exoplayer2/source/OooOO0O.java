package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import java.io.IOException;
import p203o00o0o0o.o0O00OO;
import p226o00oOo00.o000O0;
import p244o00oo0Oo.o000OO0O;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOO0O implements OooOOO, OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooOOO.OooO00o f13023OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOOO.OooO0O0 f13024OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o000OO0O f13025OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f13026OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOOOO f13027OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOO f13028OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f13029OooOO0 = -9223372036854775807L;

    public OooOO0O(OooOOOO.OooO0O0 oooO0O0, o000OO0O o000oo0o2, long j) {
        this.f13024OooO0Oo = oooO0O0;
        this.f13025OooO0o = o000oo0o2;
        this.f13026OooO0o0 = j;
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO() {
        OooOOO oooOOO = this.f13028OooO0oo;
        int i = o0O00.f40595OooO00o;
        return oooOOO.OooO();
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0.OooO00o
    public final void OooO00o(o00Oo0 o00oo1) {
        OooOOO.OooO00o oooO00o = this.f13023OooO;
        int i = o0O00.f40595OooO00o;
        oooO00o.OooO00o(this);
    }

    @Override // com.google.android.exoplayer2.source.OooOOO.OooO00o
    public final void OooO0O0(OooOOO oooOOO) {
        OooOOO.OooO00o oooO00o = this.f13023OooO;
        int i = o0O00.f40595OooO00o;
        oooO00o.OooO0O0(this);
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO0OO(long j, o0O00OO o0o00oo2) {
        OooOOO oooOOO = this.f13028OooO0oo;
        int i = o0O00.f40595OooO00o;
        return oooOOO.OooO0OO(j, o0o00oo2);
    }

    public final void OooO0Oo(OooOOOO.OooO0O0 oooO0O0) {
        long j = this.f13029OooOO0;
        if (j == -9223372036854775807L) {
            j = this.f13026OooO0o0;
        }
        OooOOOO oooOOOO = this.f13027OooO0oO;
        oooOOOO.getClass();
        OooOOO oooOOOOooO0oo = oooOOOO.OooO0oo(oooO0O0, this.f13025OooO0o, j);
        this.f13028OooO0oo = oooOOOOooO0oo;
        if (this.f13023OooO != null) {
            oooOOOOooO0oo.OooOO0(this, j);
        }
    }

    public final void OooO0o() {
        if (this.f13028OooO0oo != null) {
            OooOOOO oooOOOO = this.f13027OooO0oO;
            oooOOOO.getClass();
            oooOOOO.OooO0o0(this.f13028OooO0oo);
        }
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooO0o0() {
        OooOOO oooOOO = this.f13028OooO0oo;
        int i = o0O00.f40595OooO00o;
        return oooOOO.OooO0o0();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooO0oO(long j) {
        OooOOO oooOOO = this.f13028OooO0oo;
        int i = o0O00.f40595OooO00o;
        return oooOOO.OooO0oO(j);
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooO0oo() {
        OooOOO oooOOO = this.f13028OooO0oo;
        return oooOOO != null && oooOOO.OooO0oo();
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOO0(OooOOO.OooO00o oooO00o, long j) {
        this.f13023OooO = oooO00o;
        OooOOO oooOOO = this.f13028OooO0oo;
        if (oooOOO != null) {
            long j2 = this.f13029OooOO0;
            if (j2 == -9223372036854775807L) {
                j2 = this.f13026OooO0o0;
            }
            oooOOO.OooOO0(this, j2);
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final long OooOO0O(com.google.android.exoplayer2.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f13029OooOO0;
        if (j3 == -9223372036854775807L || j != this.f13026OooO0o0) {
            j2 = j;
        } else {
            this.f13029OooOO0 = -9223372036854775807L;
            j2 = j3;
        }
        OooOOO oooOOO = this.f13028OooO0oo;
        int i = o0O00.f40595OooO00o;
        return oooOOO.OooOO0O(oooO0oArr, zArr, sampleStreamArr, zArr2, j2);
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOOOO() throws IOException {
        OooOOO oooOOO = this.f13028OooO0oo;
        if (oooOOO != null) {
            oooOOO.OooOOOO();
            return;
        }
        OooOOOO oooOOOO = this.f13027OooO0oO;
        if (oooOOOO != null) {
            oooOOOO.OooOO0o();
        }
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final o000O0 OooOOo() {
        OooOOO oooOOO = this.f13028OooO0oo;
        int i = o0O00.f40595OooO00o;
        return oooOOO.OooOOo();
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final boolean OooOOo0(long j) {
        OooOOO oooOOO = this.f13028OooO0oo;
        return oooOOO != null && oooOOO.OooOOo0(j);
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final long OooOOoo() {
        OooOOO oooOOO = this.f13028OooO0oo;
        int i = o0O00.f40595OooO00o;
        return oooOOO.OooOOoo();
    }

    @Override // com.google.android.exoplayer2.source.o00Oo0
    public final void OooOo0(long j) {
        OooOOO oooOOO = this.f13028OooO0oo;
        int i = o0O00.f40595OooO00o;
        oooOOO.OooOo0(j);
    }

    @Override // com.google.android.exoplayer2.source.OooOOO
    public final void OooOo00(long j, boolean z) {
        OooOOO oooOOO = this.f13028OooO0oo;
        int i = o0O00.f40595OooO00o;
        oooOOO.OooOo00(j, z);
    }
}
