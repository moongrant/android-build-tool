package p321o0O0ooO;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import p634o0ooO0oO.o00O00o0;
import p634o0ooO0oO.o0oOOo;
import p634o0ooO0oO.oo00o;
import p646o0ooOoo.oO0Oo0oo;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O implements oo00o, Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00O00o0 f42839OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final CancellableContinuation<o0oOOo> f42840OooO0o0;

    public o000O(@NotNull o00O00o0 o00o00o1, @NotNull CancellableContinuationImpl cancellableContinuationImpl) {
        this.f42839OooO0Oo = o00o00o1;
        this.f42840OooO0o0 = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        try {
            this.f42839OooO0Oo.cancel();
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    @Override // p634o0ooO0oO.oo00o
    public final void onFailure(@NotNull o00O00o0 o00o00o1, @NotNull IOException iOException) {
        if (((oO0Oo0oo) o00o00o1).f59667OooOOoo) {
            return;
        }
        Result.Companion companion = Result.INSTANCE;
        this.f42840OooO0o0.resumeWith(Result.m4213constructorimpl(ResultKt.createFailure(iOException)));
    }

    @Override // p634o0ooO0oO.oo00o
    public final void onResponse(@NotNull o00O00o0 o00o00o1, @NotNull o0oOOo o0oooo) {
        this.f42840OooO0o0.resumeWith(Result.m4213constructorimpl(o0oooo));
    }
}
