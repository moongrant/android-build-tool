package androidx.media3.session;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000O00 implements o000OoO.o00000O0.OooO00o, p464o0OooO0.o0000Ooo {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9305OooO0Oo;

    @Override // p464o0OooO0.o0000Ooo
    public final void OooO00o(p464o0OooO0.o00000OO o00000oo2) {
        p285o0O0OOo.OooOO0O oooOO0O = (p285o0O0OOo.OooOO0O) this.f9305OooO0Oo;
        synchronized (oooOO0O) {
            if (oooOO0O.f41424OooO0O0 instanceof p464o0OooO0.o0000) {
                oooOO0O.f41425OooO0OO.add(o00000oo2);
            }
            oooOO0O.f41424OooO0O0.OooO00o(o00000oo2);
        }
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlayerErrorChanged((PlaybackException) this.f9305OooO0Oo);
    }
}
