package o00OO00O;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import org.jetbrains.annotations.NotNull;
import p641o0ooOO0o.o00OO;
import p641o0ooOO0o.o00OOO00;
import p641o0ooOO0o.o0O00o00;
import p653o0ooo00O.o0000O0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo implements o00OOO00, Function1<Throwable, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final o00OO f37079OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final CancellableContinuation<o0O00o00> f37080OooO0o0;

    public OooOo(@NotNull o00OO o00oo2, @NotNull CancellableContinuationImpl cancellableContinuationImpl) {
        this.f37079OooO0Oo = o00oo2;
        this.f37080OooO0o0 = cancellableContinuationImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Throwable th) {
        try {
            this.f37079OooO0Oo.cancel();
        } catch (Throwable unused) {
        }
        return Unit.INSTANCE;
    }

    @Override // p641o0ooOO0o.o00OOO00
    public final void onFailure(@NotNull o00OO o00oo2, @NotNull IOException iOException) {
        if (((o0000O0) o00oo2).f59319OooOOoo) {
            return;
        }
        Result.Companion companion = Result.INSTANCE;
        this.f37080OooO0o0.resumeWith(Result.m4215constructorimpl(ResultKt.createFailure(iOException)));
    }

    @Override // p641o0ooOO0o.o00OOO00
    public final void onResponse(@NotNull o00OO o00oo2, @NotNull o0O00o00 o0o00o01) {
        this.f37080OooO0o0.resumeWith(Result.m4215constructorimpl(o0o00o01));
    }
}
