package p449o0OoOoOo;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "com.common.support.longlink.connection.ConnectionMonitor", f = "ConnectionMonitor.kt", i = {0, 0, 0, 1, 1}, l = {134, 104}, m = "reconnectIfNeeded", n = {"this", "connection", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"})
public final class ooo0Oo0 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public /* synthetic */ Object f40322Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public oO0Oo f40323Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public Object f40324Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public Mutex f40325Oooo0oo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public int f40326OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ oO0Oo<Object> f40327OoooO00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ooo0Oo0(oO0Oo<Object> oo0oo, Continuation<? super ooo0Oo0> continuation) {
        super(continuation);
        this.f40327OoooO00 = oo0oo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f40322Oooo = obj;
        this.f40326OoooO0 |= Integer.MIN_VALUE;
        return oO0Oo.OooO00o(this.f40327OoooO00, null, this);
    }
}
