package p045Oooooo;

import androidx.media3.common.OooOOOO;
import androidx.media3.common.Player;
import java.util.concurrent.atomic.AtomicReference;
import p080o000OoO.o00000O0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooOo implements o000Oo0.OooO0OO, o00000O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1842OooO0Oo;

    public /* synthetic */ OooOo(Object obj) {
        this.f1842OooO0Oo = obj;
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        ((AtomicReference) this.f1842OooO0Oo).set(oooO00o);
        return "Data closed";
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((Player.OooO0OO) obj).onPlaybackParametersChanged((OooOOOO) this.f1842OooO0Oo);
    }
}
