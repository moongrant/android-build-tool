package p028Oooo0oO;

import androidx.media3.exoplayer.analytics.AnalyticsListener;
import java.util.concurrent.atomic.AtomicReference;
import o000O.Oooo000;
import p080o000OoO.o00000O0;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oo0O implements o000Oo0.OooO0OO, o00000O0.OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f1196OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1197OooO0o0;

    public /* synthetic */ oo0O(Object obj, Object obj2) {
        this.f1196OooO0Oo = obj;
        this.f1197OooO0o0 = obj2;
    }

    @Override // o0ooOO0.o000Oo0.OooO0OO
    public final Object OooO0o0(o000Oo0.OooO00o oooO00o) {
        AtomicReference atomicReference = (AtomicReference) this.f1196OooO0Oo;
        String str = (String) this.f1197OooO0o0;
        atomicReference.set(oooO00o);
        return str + "-cancellation";
    }

    @Override // o000OoO.o00000O0.OooO00o
    public final void invoke(Object obj) {
        ((AnalyticsListener) obj).OooooOO((AnalyticsListener.OooO00o) this.f1196OooO0Oo, (Oooo000) this.f1197OooO0o0);
    }
}
