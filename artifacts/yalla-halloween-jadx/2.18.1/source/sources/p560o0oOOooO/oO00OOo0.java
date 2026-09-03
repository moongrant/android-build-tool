package p560o0oOOooO;

import kotlin.Result;
import kotlin.Unit;
import kotlinx.coroutines.CancellableContinuation;
import p405o0Oo0OO0.OooO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class oO00OOo0 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<Unit> f44887OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public oO00OOo0(CancellableContinuation<? super Unit> cancellableContinuation) {
        this.f44887OooO00o = cancellableContinuation;
    }

    @Override // p405o0Oo0OO0.OooO0o
    public final void onFinished() {
        CancellableContinuation<Unit> cancellableContinuation = this.f44887OooO00o;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m502constructorimpl(Unit.INSTANCE));
    }

    @Override // p405o0Oo0OO0.OooO0o
    public final void onPause() {
    }

    @Override // p405o0Oo0OO0.OooO0o
    public final void onRepeat() {
    }

    @Override // p405o0Oo0OO0.OooO0o
    public final void onStep(int i, double d) {
    }
}
