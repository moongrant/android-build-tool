package p030OoooO;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import com.google.common.util.concurrent.OooOO0O;
import p033OoooO0O.o00oO0o;
import p080o000OoO.o00000O0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOOOO implements o000Oo0.OooO0OO, o00000O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1337OooO0Oo;

    public /* synthetic */ OooOOOO(Object obj) {
        this.f1337OooO0Oo = obj;
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        OooOO0O oooOO0O = (OooOO0O) this.f1337OooO0Oo;
        OooOo.OooO0o(false, oooOO0O, oooO00o, o00oO0o.OooO00o());
        return "nonCancellationPropagating[" + oooOO0O + "]";
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlayerErrorChanged((PlaybackException) this.f1337OooO0Oo);
    }
}
