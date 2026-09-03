package androidx.media3.session;

import android.os.Bundle;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o000O00O implements o000OoO.o00000O0.OooO00o, p287o0O0OOoo.o0OO00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f9308OooO0Oo;

    @Override // p287o0O0OOoo.o0OO00O
    public final void OooO00o(Bundle bundle) {
        ((p285o0O0OOo.OooOO0O) this.f9308OooO0Oo).f41423OooO00o.OooO00o(bundle);
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlayerError((PlaybackException) this.f9308OooO0Oo);
    }
}
