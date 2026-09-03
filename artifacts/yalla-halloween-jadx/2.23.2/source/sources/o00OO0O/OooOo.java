package o00OO0O;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo<T> implements com.airbnb.lottie.o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<T> f37211OooO00o;

    public OooOo(CancellableContinuationImpl cancellableContinuationImpl) {
        this.f37211OooO00o = cancellableContinuationImpl;
    }

    @Override // com.airbnb.lottie.o0OoOo0
    public final void OooO00o(Object obj) {
        Throwable e = (Throwable) obj;
        CancellableContinuation<T> cancellableContinuation = this.f37211OooO00o;
        if (cancellableContinuation.isCompleted()) {
            return;
        }
        Intrinsics.checkNotNullExpressionValue(e, "e");
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m4215constructorimpl(ResultKt.createFailure(e)));
    }
}
