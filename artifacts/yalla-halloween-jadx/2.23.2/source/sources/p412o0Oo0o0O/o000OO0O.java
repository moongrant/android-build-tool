package p412o0Oo0o0O;

import com.yalla.yalla.data.db.model.NewFriendsOld;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0, 0}, l = {699}, m = "applyFriendRequest1", n = {NewFriendsOld.State_Agree, "targetId"}, s = {"Z$0", "J$0"})
public final class o000OO0O extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f46039OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f46040OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f46041OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f46042OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f46043OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000OO0O(o000OO00 o000oo01, Continuation<? super o000OO0O> continuation) {
        super(continuation);
        this.f46042OooO0oO = o000oo01;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f46040OooO0o = obj;
        this.f46043OooO0oo |= Integer.MIN_VALUE;
        return this.f46042OooO0oO.OooO0o0(0L, false, this);
    }
}
