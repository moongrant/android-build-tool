package p531o0o0OOO0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketMessageHandler", f = "IMSocketMessageHandler.kt", i = {}, l = {103}, m = "confirmMessage", n = {}, s = {})
public final class o00O00o0 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public /* synthetic */ Object f43409Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo00o f43410Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f43411Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O00o0(oo00o oo00oVar, Continuation<? super o00O00o0> continuation) {
        super(continuation);
        this.f43410Oooo0oO = oo00oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f43409Oooo0o = obj;
        this.f43411Oooo0oo |= Integer.MIN_VALUE;
        return oo00o.OooO0Oo(this.f43410Oooo0oO, null, this);
    }
}
