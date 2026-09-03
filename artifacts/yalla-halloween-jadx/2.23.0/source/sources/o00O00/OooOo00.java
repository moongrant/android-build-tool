package o00O00;

import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00<T> implements com.airbnb.lottie.o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<T> f36096OooO00o;

    public OooOo00(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f36096OooO00o = cancellableContinuationImpl;
    }

    @Override // com.airbnb.lottie.o0OoOo0
    public final void OooO00o(T t) {
        CancellableContinuation<T> cancellableContinuation = this.f36096OooO00o;
        if (cancellableContinuation.isCompleted()) {
            return;
        }
        cancellableContinuation.resumeWith(Result.m4213constructorimpl(t));
    }
}
