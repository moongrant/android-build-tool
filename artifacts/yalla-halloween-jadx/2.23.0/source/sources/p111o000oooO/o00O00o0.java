package p111o000oooO;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class o00O00o0 implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f35932OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver f35933OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oOO00O<View> f35934OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<o00O00> f35935OooO0oO;

    public o00O00o0(oOO00O ooo00o, ViewTreeObserver viewTreeObserver, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f35934OooO0o0 = ooo00o;
        this.f35933OooO0o = viewTreeObserver;
        this.f35935OooO0oO = cancellableContinuationImpl;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        oOO00O<View> ooo00o = this.f35934OooO0o0;
        o00O00 o00o00OooO00o = oOO00O.OooO00o.OooO00o(ooo00o);
        if (o00o00OooO00o != null) {
            ViewTreeObserver viewTreeObserver = this.f35933OooO0o;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                ooo00o.getView().getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.f35932OooO0Oo) {
                this.f35932OooO0Oo = true;
                this.f35935OooO0oO.resumeWith(Result.m4213constructorimpl(o00o00OooO00o));
            }
        }
        return true;
    }
}
