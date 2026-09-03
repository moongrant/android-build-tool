package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import p245o00oo0o.o00O00OO;
import p245o00oo0o.o00OO00O;
import p245o00oo0o.o0oOOo;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class OooOO0O implements o00OO00O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f11070OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0oOOo f11071OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Renderer f11072OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f11073OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o00OO00O f11074OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f11075OooO0oo = true;

    public interface OooO00o {
    }

    public OooOO0O(OooO00o oooO00o, o00O00OO o00o00oo2) {
        this.f11073OooO0o0 = oooO00o;
        this.f11071OooO0Oo = new o0oOOo(o00o00oo2);
    }

    @Override // p245o00oo0o.o00OO00O
    public final o00Ooo OooO00o() {
        o00OO00O o00oo00o = this.f11074OooO0oO;
        return o00oo00o != null ? o00oo00o.OooO00o() : this.f11071OooO0Oo.f40630OooO0oo;
    }

    @Override // p245o00oo0o.o00OO00O
    public final void OooO0o0(o00Ooo o00ooo2) {
        o00OO00O o00oo00o = this.f11074OooO0oO;
        if (o00oo00o != null) {
            o00oo00o.OooO0o0(o00ooo2);
            o00ooo2 = this.f11074OooO0oO.OooO00o();
        }
        this.f11071OooO0Oo.OooO0o0(o00ooo2);
    }

    @Override // p245o00oo0o.o00OO00O
    public final long OooOOo0() {
        if (this.f11075OooO0oo) {
            return this.f11071OooO0Oo.OooOOo0();
        }
        o00OO00O o00oo00o = this.f11074OooO0oO;
        o00oo00o.getClass();
        return o00oo00o.OooOOo0();
    }
}
