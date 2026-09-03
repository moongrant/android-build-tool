package p130o00O0oo;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO00 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f36773OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f36774OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o000O0O0<View> f36775OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<o000O0Oo> f36776OooO0oO;

    public o000OO00(o000O0O0 o000o0o1, ViewTreeObserver viewTreeObserver, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f36775OooO0o0 = o000o0o1;
        this.f36774OooO0o = viewTreeObserver;
        this.f36776OooO0oO = cancellableContinuationImpl;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        o000O0O0<View> o000o0o1 = this.f36775OooO0o0;
        o000O0Oo o000o0ooOooO00o = o000O0O0.OooO00o.OooO00o(o000o0o1);
        if (o000o0ooOooO00o != null) {
            ViewTreeObserver viewTreeObserver = this.f36774OooO0o;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                o000o0o1.getView().getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f36773OooO0Oo) {
                this.f36773OooO0Oo = true;
                this.f36776OooO0oO.resumeWith(Result.m4215constructorimpl(o000o0ooOooO00o));
            }
        }
        return true;
    }
}
