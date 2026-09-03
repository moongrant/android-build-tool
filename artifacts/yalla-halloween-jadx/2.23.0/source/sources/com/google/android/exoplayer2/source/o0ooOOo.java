package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.oo0o0Oo;
import p244o00oo0Oo.o00O0OO0;
import p245o00oo0o.o0O00;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class o0ooOOo extends OooO0OO<Void> {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOOOO f13360OooOO0O;

    public o0ooOOo(OooOOOO oooOOOO) {
        this.f13360OooOO0O = oooOOOO;
    }

    @Override // com.google.android.exoplayer2.source.OooOOOO
    public final com.google.android.exoplayer2.o000oOoO OooO0Oo() {
        return this.f13360OooOO0O.OooO0Oo();
    }

    @Override // com.google.android.exoplayer2.source.OooO00o, com.google.android.exoplayer2.source.OooOOOO
    @Nullable
    public oo0o0Oo OooOOO() {
        return this.f13360OooOO0O.OooOOO();
    }

    @Override // com.google.android.exoplayer2.source.OooO00o, com.google.android.exoplayer2.source.OooOOOO
    public boolean OooOOO0() {
        return this.f13360OooOO0O.OooOOO0();
    }

    @Override // com.google.android.exoplayer2.source.OooO00o
    public final void OooOOo0(@Nullable o00O0OO0 o00o0oo1) {
        this.f12992OooOO0 = o00o0oo1;
        this.f12990OooO = o0O00.OooOO0O(null);
        OooOoOO();
    }

    @Override // com.google.android.exoplayer2.source.OooO0OO
    public final long OooOo0(long j, Object obj) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.OooO0OO
    @Nullable
    public final OooOOOO.OooO0O0 OooOo00(Void r1, OooOOOO.OooO0O0 oooO0O0) {
        return OooOoO0(oooO0O0);
    }

    @Override // com.google.android.exoplayer2.source.OooO0OO
    public final int OooOo0O(int i, Object obj) {
        return i;
    }

    @Override // com.google.android.exoplayer2.source.OooO0OO
    public final void OooOo0o(Void r1, OooOOOO oooOOOO, oo0o0Oo oo0o0oo) {
        OooOoO(oo0o0oo);
    }

    public abstract void OooOoO(oo0o0Oo oo0o0oo);

    @Nullable
    public OooOOOO.OooO0O0 OooOoO0(OooOOOO.OooO0O0 oooO0O0) {
        return oooO0O0;
    }

    public void OooOoOO() {
        OooOo(null, this.f13360OooOO0O);
    }
}
