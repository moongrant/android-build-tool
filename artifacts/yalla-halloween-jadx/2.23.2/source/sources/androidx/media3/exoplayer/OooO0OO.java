package androidx.media3.exoplayer;

import androidx.annotation.Nullable;
import androidx.media3.common.OooOOOO;
import o000O00O.o00O000;
import o000O00O.o00OO0OO;
import p080o000OoO.o000O00;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0OO implements o00O000 {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public boolean f7209OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o00OO0OO f7210OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @Nullable
    public Renderer f7211OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final OooO00o f7212OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public o00O000 f7213OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public boolean f7214OooO0oo = true;

    public interface OooO00o {
    }

    public OooO0OO(OooO00o oooO00o, o000O00 o000o01) {
        this.f7212OooO0o0 = oooO00o;
        this.f7210OooO0Oo = new o00OO0OO(o000o01);
    }

    @Override // o000O00O.o00O000
    public final void OooO00o(OooOOOO oooOOOO) {
        o00O000 o00o001 = this.f7213OooO0oO;
        if (o00o001 != null) {
            o00o001.OooO00o(oooOOOO);
            oooOOOO = this.f7213OooO0oO.OooO0O0();
        }
        this.f7210OooO0Oo.OooO00o(oooOOOO);
    }

    @Override // o000O00O.o00O000
    public final OooOOOO OooO0O0() {
        o00O000 o00o001 = this.f7213OooO0oO;
        return o00o001 != null ? o00o001.OooO0O0() : this.f7210OooO0Oo.f34136OooO0oo;
    }

    @Override // o000O00O.o00O000
    public final long OooOOo0() {
        if (this.f7214OooO0oo) {
            return this.f7210OooO0Oo.OooOOo0();
        }
        o00O000 o00o001 = this.f7213OooO0oO;
        o00o001.getClass();
        return o00o001.OooOOo0();
    }
}
