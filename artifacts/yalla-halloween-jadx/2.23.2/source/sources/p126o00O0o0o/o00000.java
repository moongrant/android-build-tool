package p126o00O0o0o;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "coil.intercept.EngineInterceptor", f = "EngineInterceptor.kt", i = {0, 0}, l = {73}, m = "intercept", n = {"this", "chain"}, s = {"L$0", "L$1"})
public final class o00000 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o0O0O00 f36635OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f36636OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public o00000OO.OooO00o f36637OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o0O0O00 f36638OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f36639OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00000(o0O0O00 o0o0o00, Continuation<? super o00000> continuation) {
        super(continuation);
        this.f36638OooO0oO = o0o0o00;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f36636OooO0o = obj;
        this.f36639OooO0oo |= Integer.MIN_VALUE;
        return this.f36638OooO0oO.OooO00o(null, this);
    }
}
