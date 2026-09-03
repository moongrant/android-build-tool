package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import p080o000OoO.o00;

/* JADX INFO: loaded from: classes2.dex */
@UnstableApi
public abstract class o0ooOOo extends OooO0OO<Void> {

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public final OooOOOO f8099OooOO0O;

    public o0ooOOo(OooOOOO oooOOOO) {
        this.f8099OooOO0O = oooOOOO;
    }

    @Override // androidx.media3.exoplayer.source.OooOOOO
    public final androidx.media3.common.OooOOO0 OooO0Oo() {
        return this.f8099OooOO0O.OooO0Oo();
    }

    @Override // androidx.media3.exoplayer.source.OooO00o, androidx.media3.exoplayer.source.OooOOOO
    @Nullable
    public androidx.media3.common.Oooo0 OooOOO() {
        return this.f8099OooOO0O.OooOOO();
    }

    @Override // androidx.media3.exoplayer.source.OooO00o, androidx.media3.exoplayer.source.OooOOOO
    public boolean OooOOO0() {
        return this.f8099OooOO0O.OooOOO0();
    }

    @Override // androidx.media3.exoplayer.source.OooO00o
    public final void OooOOo0(@Nullable o000O0O.OooOo oooOo) {
        this.f7891OooOO0 = oooOo;
        this.f7889OooO = o00.OooOO0o(null);
        OooOoOO();
    }

    @Override // androidx.media3.exoplayer.source.OooO0OO
    public final long OooOo0(long j, Object obj) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.OooO0OO
    @Nullable
    public final OooOOOO.OooO0O0 OooOo00(Void r1, OooOOOO.OooO0O0 oooO0O0) {
        return OooOoO0(oooO0O0);
    }

    @Override // androidx.media3.exoplayer.source.OooO0OO
    public final int OooOo0O(int i, Object obj) {
        return i;
    }

    @Override // androidx.media3.exoplayer.source.OooO0OO
    public final void OooOo0o(Void r1, OooOOOO oooOOOO, androidx.media3.common.Oooo0 oooo0) {
        OooOoO(oooo0);
    }

    public abstract void OooOoO(androidx.media3.common.Oooo0 oooo0);

    @Nullable
    public OooOOOO.OooO0O0 OooOoO0(OooOOOO.OooO0O0 oooO0O0) {
        return oooO0O0;
    }

    public void OooOoOO() {
        OooOo(null, this.f8099OooOO0O);
    }
}
