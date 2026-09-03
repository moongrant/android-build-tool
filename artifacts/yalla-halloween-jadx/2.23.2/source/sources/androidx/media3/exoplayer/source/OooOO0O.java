package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import java.io.IOException;
import o000O.oo0o0Oo;
import o000O00O.o00OO0O0;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public final class OooOO0O implements OooOOO, OooOOO.OooO00o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooOOO.OooO00o f7922OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOOO.OooO0O0 f7923OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final p074o000OO0o.o00Oo0 f7924OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final long f7925OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public OooOOOO f7926OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public OooOOO f7927OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public long f7928OooOO0 = -9223372036854775807L;

    public OooOO0O(OooOOOO.OooO0O0 oooO0O0, p074o000OO0o.o00Oo0 o00oo1, long j) {
        this.f7923OooO0Oo = oooO0O0;
        this.f7924OooO0o = o00oo1;
        this.f7925OooO0o0 = j;
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0.OooO00o
    public final void OooO(o00Oo0 o00oo1) {
        OooOOO.OooO00o oooO00o = this.f7922OooO;
        int i = o00.f34910OooO00o;
        oooO00o.OooO(this);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO.OooO00o
    public final void OooO00o(OooOOO oooOOO) {
        OooOOO.OooO00o oooO00o = this.f7922OooO;
        int i = o00.f34910OooO00o;
        oooO00o.OooO00o(this);
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final long OooO0O0() {
        OooOOO oooOOO = this.f7927OooO0oo;
        int i = o00.f34910OooO00o;
        return oooOOO.OooO0O0();
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0OO(long j) {
        OooOOO oooOOO = this.f7927OooO0oo;
        int i = o00.f34910OooO00o;
        return oooOOO.OooO0OO(j);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0Oo(androidx.media3.exoplayer.trackselection.OooO0o[] oooO0oArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f7928OooOO0;
        if (j3 == -9223372036854775807L || j != this.f7925OooO0o0) {
            j2 = j;
        } else {
            this.f7928OooOO0 = -9223372036854775807L;
            j2 = j3;
        }
        OooOOO oooOOO = this.f7927OooO0oo;
        int i = o00.f34910OooO00o;
        return oooOOO.OooO0Oo(oooO0oArr, zArr, sampleStreamArr, zArr2, j2);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooO0o() {
        OooOOO oooOOO = this.f7927OooO0oo;
        int i = o00.f34910OooO00o;
        return oooOOO.OooO0o();
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final boolean OooO0o0() {
        OooOOO oooOOO = this.f7927OooO0oo;
        return oooOOO != null && oooOOO.OooO0o0();
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooO0oO() throws IOException {
        OooOOO oooOOO = this.f7927OooO0oo;
        if (oooOOO != null) {
            oooOOO.OooO0oO();
            return;
        }
        OooOOOO oooOOOO = this.f7926OooO0oO;
        if (oooOOOO != null) {
            oooOOOO.OooOO0o();
        }
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final boolean OooO0oo(long j) {
        OooOOO oooOOO = this.f7927OooO0oo;
        return oooOOO != null && oooOOO.OooO0oo(j);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final long OooOO0(long j, o00OO0O0 o00oo0o1) {
        OooOOO oooOOO = this.f7927OooO0oo;
        int i = o00.f34910OooO00o;
        return oooOOO.OooOO0(j, o00oo0o1);
    }

    public final void OooOO0O(OooOOOO.OooO0O0 oooO0O0) {
        long j = this.f7928OooOO0;
        if (j == -9223372036854775807L) {
            j = this.f7925OooO0o0;
        }
        OooOOOO oooOOOO = this.f7926OooO0oO;
        oooOOOO.getClass();
        OooOOO oooOOOOooO0OO = oooOOOO.OooO0OO(oooO0O0, this.f7924OooO0o, j);
        this.f7927OooO0oo = oooOOOOooO0OO;
        if (this.f7922OooO != null) {
            oooOOOOooO0OO.OooOO0o(this, j);
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooOO0o(OooOOO.OooO00o oooO00o, long j) {
        this.f7922OooO = oooO00o;
        OooOOO oooOOO = this.f7927OooO0oo;
        if (oooOOO != null) {
            long j2 = this.f7928OooOO0;
            if (j2 == -9223372036854775807L) {
                j2 = this.f7925OooO0o0;
            }
            oooOOO.OooOO0o(this, j2);
        }
    }

    public final void OooOOO() {
        if (this.f7927OooO0oo != null) {
            OooOOOO oooOOOO = this.f7926OooO0oO;
            oooOOOO.getClass();
            oooOOOO.OooO0oO(this.f7927OooO0oo);
        }
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final oo0o0Oo OooOOO0() {
        OooOOO oooOOO = this.f7927OooO0oo;
        int i = o00.f34910OooO00o;
        return oooOOO.OooOOO0();
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final long OooOOOo() {
        OooOOO oooOOO = this.f7927OooO0oo;
        int i = o00.f34910OooO00o;
        return oooOOO.OooOOOo();
    }

    @Override // androidx.media3.exoplayer.source.o00Oo0
    public final void OooOOo(long j) {
        OooOOO oooOOO = this.f7927OooO0oo;
        int i = o00.f34910OooO00o;
        oooOOO.OooOOo(j);
    }

    @Override // androidx.media3.exoplayer.source.OooOOO
    public final void OooOOo0(long j, boolean z) {
        OooOOO oooOOO = this.f7927OooO0oo;
        int i = o00.f34910OooO00o;
        oooOOO.OooOOo0(j, z);
    }
}
