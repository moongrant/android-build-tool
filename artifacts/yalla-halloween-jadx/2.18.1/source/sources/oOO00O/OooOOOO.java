package oOO00O;

import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import p119o00O0Oo0.o00oO0o;
import p119o00O0Oo0.o0OO00O;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ OooOOO0 f53021Oooo0o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOOO(CoroutineExceptionHandler.Companion companion, OooOOO0 oooOOO0) {
        super(companion);
        this.f53021Oooo0o = oooOOO0;
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        o0OO00O o0oo00o2 = this.f53021Oooo0o.f53009OooO0oO;
        if (o0oo00o2 == null) {
            return;
        }
        o00oO0o.OooO00o(o0oo00o2, "RealImageLoader", th);
    }
}
