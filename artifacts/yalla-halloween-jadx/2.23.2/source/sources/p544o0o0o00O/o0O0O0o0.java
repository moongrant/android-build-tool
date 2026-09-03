package p544o0o0o00O;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.FriendListSynchronizer", f = "FriendListSynchronizer.kt", i = {}, l = {49}, m = "loadFriendList", n = {}, s = {})
public final class o0O0O0o0 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f55739OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f55740OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O0OOO0 f55741OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O0O0o0(o0O0OOO0 o0o0ooo0, Continuation<? super o0O0O0o0> continuation) {
        super(continuation);
        this.f55741OooO0o0 = o0o0ooo0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f55739OooO0Oo = obj;
        this.f55740OooO0o |= Integer.MIN_VALUE;
        return o0O0OOO0.OooO00o(this.f55741OooO0o0, this);
    }
}
