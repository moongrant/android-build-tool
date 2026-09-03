package p310o0O0o0oo;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.TrackGroupArray;
import java.io.IOException;
import p318o0O0oOo.o000OOo0;
import p466o0OooO0.o000O0O0;
import p709oo0oOOo.OooO0OO;

/* JADX INFO: loaded from: classes2.dex */
public final class o00oOoo implements o00O00, o00O00.OooO00o {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public o00O00 f36465Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o00O00O f36466Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final o00O00O.OooO00o f36467Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final OooO0OO f36468Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public long f36469OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    @Nullable
    public o00O00.OooO00o f36470OoooO00;

    /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
    public long f36471OoooO0O = -9223372036854775807L;

    public o00oOoo(o00O00O o00o00o2, o00O00O.OooO00o oooO00o, OooO0OO oooO0OO, long j) {
        this.f36467Oooo0oO = oooO00o;
        this.f36468Oooo0oo = oooO0OO;
        this.f36466Oooo0o = o00o00o2;
        this.f36469OoooO0 = j;
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooO(long j) {
        o00O00 o00o01 = this.f36465Oooo;
        int i = o000OOo0.f36740OooO00o;
        return o00o01.OooO(j);
    }

    @Override // o0O0o0oo.o00O00.OooO00o
    public final void OooO00o(o00O00 o00o01) {
        o00O00.OooO00o oooO00o = this.f36470OoooO00;
        int i = o000OOo0.f36740OooO00o;
        oooO00o.OooO00o(this);
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooO0O0(long j, o000O0O0 o000o0o1) {
        o00O00 o00o01 = this.f36465Oooo;
        int i = o000OOo0.f36740OooO00o;
        return o00o01.OooO0O0(j, o000o0o1);
    }

    @Override // p310o0O0o0oo.o00O00
    public final void OooO0OO(o00O00.OooO00o oooO00o, long j) {
        this.f36470OoooO00 = oooO00o;
        o00O00 o00o01 = this.f36465Oooo;
        if (o00o01 != null) {
            long j2 = this.f36469OoooO0;
            long j3 = this.f36471OoooO0O;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            o00o01.OooO0OO(this, j2);
        }
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooO0Oo(com.google.android.exoplayer2.trackselection.OooO0OO[] oooO0OOArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f36471OoooO0O;
        if (j3 == -9223372036854775807L || j != this.f36469OoooO0) {
            j2 = j;
        } else {
            this.f36471OoooO0O = -9223372036854775807L;
            j2 = j3;
        }
        o00O00 o00o01 = this.f36465Oooo;
        int i = o000OOo0.f36740OooO00o;
        return o00o01.OooO0Oo(oooO0OOArr, zArr, sampleStreamArr, zArr2, j2);
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooO0o() {
        o00O00 o00o01 = this.f36465Oooo;
        int i = o000OOo0.f36740OooO00o;
        return o00o01.OooO0o();
    }

    @Override // o0O0o0oo.oo0oOO0.OooO00o
    public final void OooO0o0(oo0oOO0 oo0ooo0) {
        o00O00.OooO00o oooO00o = this.f36470OoooO00;
        int i = o000OOo0.f36740OooO00o;
        oooO00o.OooO0o0(this);
    }

    public final void OooO0oO(o00O00O.OooO00o oooO00o) {
        long j = this.f36469OoooO0;
        long j2 = this.f36471OoooO0O;
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        o00O00 o00o00OooO0Oo = this.f36466Oooo0o.OooO0Oo(oooO00o, this.f36468Oooo0oo, j);
        this.f36465Oooo = o00o00OooO0Oo;
        if (this.f36470OoooO00 != null) {
            o00o00OooO0Oo.OooO0OO(this, j);
        }
    }

    @Override // p310o0O0o0oo.o00O00
    public final void OooO0oo() throws IOException {
        try {
            o00O00 o00o01 = this.f36465Oooo;
            if (o00o01 != null) {
                o00o01.OooO0oo();
            } else {
                this.f36466Oooo0o.OooO0oo();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // p310o0O0o0oo.o00O00
    public final boolean OooOO0(long j) {
        o00O00 o00o01 = this.f36465Oooo;
        return o00o01 != null && o00o01.OooOO0(j);
    }

    @Override // p310o0O0o0oo.o00O00
    public final boolean OooOO0o() {
        o00O00 o00o01 = this.f36465Oooo;
        return o00o01 != null && o00o01.OooOO0o();
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooOOO() {
        o00O00 o00o01 = this.f36465Oooo;
        int i = o000OOo0.f36740OooO00o;
        return o00o01.OooOOO();
    }

    @Override // p310o0O0o0oo.o00O00
    public final TrackGroupArray OooOOOO() {
        o00O00 o00o01 = this.f36465Oooo;
        int i = o000OOo0.f36740OooO00o;
        return o00o01.OooOOOO();
    }

    @Override // p310o0O0o0oo.o00O00
    public final void OooOOo(long j, boolean z) {
        o00O00 o00o01 = this.f36465Oooo;
        int i = o000OOo0.f36740OooO00o;
        o00o01.OooOOo(j, z);
    }

    @Override // p310o0O0o0oo.o00O00
    public final long OooOOo0() {
        o00O00 o00o01 = this.f36465Oooo;
        int i = o000OOo0.f36740OooO00o;
        return o00o01.OooOOo0();
    }

    @Override // p310o0O0o0oo.o00O00
    public final void OooOOoo(long j) {
        o00O00 o00o01 = this.f36465Oooo;
        int i = o000OOo0.f36740OooO00o;
        o00o01.OooOOoo(j);
    }
}
