package p053o00000oO;

import androidx.compose.ui.text.ExperimentalTextApi;
import kotlin.coroutines.AbstractCoroutineContextElement;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@ExperimentalTextApi
public final class o00000OO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f27122OooO0O0 = new OooO00o(CoroutineExceptionHandler.INSTANCE);

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public CoroutineScope f27123OooO00o;

    public static final class OooO00o extends AbstractCoroutineContextElement implements CoroutineExceptionHandler {
        public OooO00o(CoroutineExceptionHandler.Companion companion) {
            super(companion);
        }

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(@NotNull CoroutineContext coroutineContext, @NotNull Throwable th) {
        }
    }

    public o00000OO(o0OO00O asyncTypefaceCache) {
        EmptyCoroutineContext injectedContext = EmptyCoroutineContext.INSTANCE;
        Intrinsics.checkNotNullParameter(asyncTypefaceCache, "asyncTypefaceCache");
        Intrinsics.checkNotNullParameter(injectedContext, "injectedContext");
        this.f27123OooO00o = CoroutineScopeKt.CoroutineScope(f27122OooO0O0.plus(injectedContext).plus(SupervisorKt.SupervisorJob((Job) injectedContext.get(Job.INSTANCE))));
    }
}
