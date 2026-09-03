package androidx.camera.core.impl;

import android.os.SystemClock;
import androidx.media3.common.Player;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o000OOo0 implements o0ooOO0.o000Oo0.OooO0OO, androidx.media3.exoplayer.source.Oooo000.OooO00o, o000OoO.o00000O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f3706OooO0Oo;

    public /* synthetic */ o000OOo0(Object obj) {
        this.f3706OooO0Oo = obj;
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o0ooOO0.o000Oo0.OooO00o oooO00o) {
        o00O000o o00o000o2 = (o00O000o) this.f3706OooO0Oo;
        o00o000o2.getClass();
        p033OoooO0O.o00oO0o.OooO0OO().execute(new o0O0ooO(0, o00o000o2, oooO00o));
        return o00o000o2 + " [fetch@" + SystemClock.uptimeMillis() + "]";
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onVolumeChanged(((androidx.media3.session.o00O00O) this.f3706OooO0Oo).f9380OooOOo0);
    }
}
