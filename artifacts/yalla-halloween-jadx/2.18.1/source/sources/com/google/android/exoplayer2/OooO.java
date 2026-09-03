package com.google.android.exoplayer2;

import androidx.annotation.Nullable;
import java.util.Objects;
import p318o0O0oOo.o00000O;
import p318o0O0oOo.o0000O0O;
import p318o0O0oOo.o000O00O;
import p466o0OooO0.o000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO implements o0000O0O {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    @Nullable
    public o0000O0O f13183Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final o000O00O f13184Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final OooO00o f13185Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    @Nullable
    public Renderer f13186Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public boolean f13187OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public boolean f13188OoooO00 = true;

    public interface OooO00o {
    }

    public OooO(OooO00o oooO00o, o00000O o00000o) {
        this.f13185Oooo0oO = oooO00o;
        this.f13184Oooo0o = new o000O00O(o00000o);
    }

    @Override // p318o0O0oOo.o0000O0O
    public final void OooO0o0(o000O00 o000o01) {
        o0000O0O o0000o0o2 = this.f13183Oooo;
        if (o0000o0o2 != null) {
            o0000o0o2.OooO0o0(o000o01);
            o000o01 = this.f13183Oooo.OooO0oO();
        }
        this.f13184Oooo0o.OooO0o0(o000o01);
    }

    @Override // p318o0O0oOo.o0000O0O
    public final o000O00 OooO0oO() {
        o0000O0O o0000o0o2 = this.f13183Oooo;
        return o0000o0o2 != null ? o0000o0o2.OooO0oO() : this.f13184Oooo0o.f36724OoooO00;
    }

    @Override // p318o0O0oOo.o0000O0O
    public final long OooOOO0() {
        if (this.f13188OoooO00) {
            return this.f13184Oooo0o.OooOOO0();
        }
        o0000O0O o0000o0o2 = this.f13183Oooo;
        Objects.requireNonNull(o0000o0o2);
        return o0000o0o2.OooOOO0();
    }
}
