package p028Oooo0oO;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.concurrent.atomic.AtomicReference;
import p245o00oo0o.o00O;
import p637o0ooOO0.o00O000;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OO implements o00O000.OooO0OO, o00O.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1155OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1156OooO0o0;

    public /* synthetic */ o00OO(Object obj, Object obj2) {
        this.f1155OooO0Oo = obj;
        this.f1156OooO0o0 = obj2;
    }

    @Override // o0ooOO0.o00O000.OooO0OO
    public final Object OooO0o0(o00O000.OooO00o oooO00o) {
        AtomicReference atomicReference = (AtomicReference) this.f1155OooO0Oo;
        String str = (String) this.f1156OooO0o0;
        atomicReference.set(oooO00o);
        return str + "-cancellation";
    }

    @Override // o00oo0o.o00O.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).oo0o0Oo();
    }
}
