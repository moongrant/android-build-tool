package p472o0Ooooo0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.FriendListSynchronizer", f = "FriendListSynchronizer.kt", i = {}, l = {49}, m = "loadFriendList", n = {}, s = {})
public final class o extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f47189OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f47190OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ oO00000o f47191OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(oO00000o oo00000o, Continuation<? super o> continuation) {
        super(continuation);
        this.f47191OooO0o0 = oo00000o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f47189OooO0Oo = obj;
        this.f47190OooO0o |= Integer.MIN_VALUE;
        return oO00000o.OooO00o(this.f47191OooO0o0, this);
    }
}
