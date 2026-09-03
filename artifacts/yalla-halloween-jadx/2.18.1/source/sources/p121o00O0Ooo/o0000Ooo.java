package p121o00O0Ooo;

import com.airbnb.lottie.Oooo000;
import kotlin.Result;
import kotlinx.coroutines.CancellableContinuation;

/* JADX INFO: loaded from: classes.dex */
public final class o0000Ooo<T> implements Oooo000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CancellableContinuation<T> f30894OooO00o;

    /* JADX WARN: Multi-variable type inference failed */
    public o0000Ooo(CancellableContinuation<? super T> cancellableContinuation) {
        this.f30894OooO00o = cancellableContinuation;
    }

    @Override // com.airbnb.lottie.Oooo000
    public final void OooO00o(T t) {
        if (this.f30894OooO00o.isCompleted()) {
            return;
        }
        CancellableContinuation<T> cancellableContinuation = this.f30894OooO00o;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m502constructorimpl(t));
    }
}
