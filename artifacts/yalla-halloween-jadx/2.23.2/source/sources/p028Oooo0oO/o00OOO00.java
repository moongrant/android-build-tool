package p028Oooo0oO;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import p080o000OoO.o00000O0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO00 implements o000Oo0.OooO0OO, o00000O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1148OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Serializable f1149OooO0o0;

    public /* synthetic */ o00OOO00(Object obj, Serializable serializable) {
        this.f1148OooO0Oo = obj;
        this.f1149OooO0o0 = serializable;
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        AtomicReference atomicReference = (AtomicReference) this.f1148OooO0Oo;
        String str = (String) this.f1149OooO0o0;
        atomicReference.set(oooO00o);
        return str + "-Surface";
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).o00oO0o();
    }
}
