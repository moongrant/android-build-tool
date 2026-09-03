package p527o0o0OO0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.service.im.FriendListSynchronizer", f = "FriendListSynchronizer.kt", i = {}, l = {49}, m = "loadFriendList", n = {}, s = {})
public final class OooOOO extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public /* synthetic */ Object f43114Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ OooOo00 f43115Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f43116Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOOO(OooOo00 oooOo00, Continuation<? super OooOOO> continuation) {
        super(continuation);
        this.f43115Oooo0oO = oooOo00;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f43114Oooo0o = obj;
        this.f43116Oooo0oo |= Integer.MIN_VALUE;
        return OooOo00.OooO00o(this.f43115Oooo0oO, this);
    }
}
