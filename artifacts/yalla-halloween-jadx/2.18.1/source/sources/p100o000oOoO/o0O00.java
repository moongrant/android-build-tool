package p100o000oOoO;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00 {
    @NotNull
    public static final o0O000o0 OooO00o(@NotNull CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(coroutineContext, "<this>");
        int i = o0O000o0.f29527OooO0o;
        o0O000o0 o0o000o1 = (o0O000o0) coroutineContext.get(o0O000o0.OooO00o.f29528Oooo0o);
        if (o0o000o1 != null) {
            return o0o000o1;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    @Nullable
    public static final <R> Object OooO0O0(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation) {
        return OooO00o(continuation.getContext()).OooO0o(function1, continuation);
    }
}
