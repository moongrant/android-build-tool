package p101o000oo;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0}, l = {73}, m = "intercept", n = {"this", "chain"}, s = {"L$0", "L$1"})
public final class o00Oo0 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public Oooo0 f35555OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f35556OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00oO0o.OooO00o f35557OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ Oooo0 f35558OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f35559OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Oo0(Oooo0 oooo0, Continuation<? super o00Oo0> continuation) {
        super(continuation);
        this.f35558OooO0oO = oooo0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f35556OooO0o = obj;
        this.f35559OooO0oo |= Integer.MIN_VALUE;
        return this.f35558OooO0oO.OooO00o(null, this);
    }
}
