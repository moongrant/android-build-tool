package p028Oooo0oO;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReference;
import p245o00oo0o.o00O;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO00 implements o00O000.OooO0OO, o00O.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1167OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Serializable f1168OooO0o0;

    public /* synthetic */ o00OOO00(Object obj, Serializable serializable) {
        this.f1167OooO0Oo = obj;
        this.f1168OooO0o0 = serializable;
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        AtomicReference atomicReference = (AtomicReference) this.f1167OooO0Oo;
        String str = (String) this.f1168OooO0o0;
        atomicReference.set(oooO00o);
        return str + "-status";
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).Ooooooo();
    }
}
