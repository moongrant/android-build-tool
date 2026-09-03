package p100o000oOoO;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface o0O000o0 extends CoroutineContext.Element {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final /* synthetic */ int f29527OooO0o = 0;

    public static final class OooO00o implements CoroutineContext.Key<o0O000o0> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final /* synthetic */ OooO00o f29528Oooo0o = new OooO00o();
    }

    @Nullable
    <R> Object OooO0o(@NotNull Function1<? super Long, ? extends R> function1, @NotNull Continuation<? super R> continuation);
}
