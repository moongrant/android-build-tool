package p119o00O0Oo0;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import org.jetbrains.annotations.NotNull;
import p660o0ooo0o0.o00OOOO0;
import p660o0ooo0o0.o00oOoo;
import p660o0ooo0o0.o0O0ooO;
import p663o0oooO0.o00O0OO;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOO0o implements o00oOoo, Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o0O0ooO f30754Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @NotNull
    public final CancellableContinuation<o00OOOO0> f30755Oooo0oO;

    /* JADX WARN: Multi-variable type inference failed */
    public o0OOO0o(@NotNull o0O0ooO call, @NotNull CancellableContinuation<? super o00OOOO0> continuation) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        this.f30754Oooo0o = call;
        this.f30755Oooo0oO = continuation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        try {
            this.f30754Oooo0o.cancel();
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    @Override // p660o0ooo0o0.o00oOoo
    public final void onFailure(@NotNull o0O0ooO call, @NotNull IOException e) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e, "e");
        if (((o00O0OO) call).f51737OoooOo0) {
            return;
        }
        CancellableContinuation<o00OOOO0> cancellableContinuation = this.f30755Oooo0oO;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m502constructorimpl(ResultKt.createFailure(e)));
    }

    @Override // p660o0ooo0o0.o00oOoo
    public final void onResponse(@NotNull o0O0ooO call, @NotNull o00OOOO0 response) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        CancellableContinuation<o00OOOO0> cancellableContinuation = this.f30755Oooo0oO;
        Result.Companion companion = Result.INSTANCE;
        cancellableContinuation.resumeWith(Result.m502constructorimpl(response));
    }
}
