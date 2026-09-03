package p542o0o0o00O;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.socket.IMSocketMessageHandler", f = "IMSocketMessageHandler.kt", i = {}, l = {147}, m = "confirmMessage", n = {}, s = {})
public final class o0OOO0o extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f55794OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f55795OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0Oo0oo f55796OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0OOO0o(o0Oo0oo o0oo0oo2, Continuation<? super o0OOO0o> continuation) {
        super(continuation);
        this.f55796OooO0o0 = o0oo0oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f55794OooO0Oo = obj;
        this.f55795OooO0o |= Integer.MIN_VALUE;
        return o0Oo0oo.OooO0O0(this.f55796OooO0o0, null, this);
    }
}
