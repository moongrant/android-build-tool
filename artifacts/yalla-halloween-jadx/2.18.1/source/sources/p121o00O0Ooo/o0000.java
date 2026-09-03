package p121o00O0Ooo;

import com.airbnb.lottie.Oooo000;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes.dex */
public final class o0000<T> implements Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<T> f30822OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public o0000(CancellableContinuation<? super T> cancellableContinuation) {
        this.f30822OooO00o = cancellableContinuation;
    }

    @Override // com.airbnb.lottie.Oooo000
    public final void OooO00o(Object obj) {
        Throwable e = (Throwable) obj;
        if (this.f30822OooO00o.isCompleted()) {
            return;
        }
        CancellableContinuation<T> cancellableContinuation = this.f30822OooO00o;
        Intrinsics.checkNotNullExpressionValue(e, "e");
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(e)));
    }
}
