package p406o0Oo0Ooo;

import com.yalla.yalla.data.db.model.NewFriendsOld;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0, 0}, l = {699}, m = "applyFriendRequest1", n = {NewFriendsOld.State_Agree, "targetId"}, s = {"Z$0", "J$0"})
public final class oOO extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f44912OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public /* synthetic */ Object f44913OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public long f44914OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ oOOO00Oo f44915OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public int f44916OooO0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOO(oOOO00Oo oooo00oo, Continuation<? super oOO> continuation) {
        super(continuation);
        this.f44915OooO0oO = oooo00oo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f44913OooO0o = obj;
        this.f44916OooO0oo |= Integer.MIN_VALUE;
        return this.f44915OooO0oO.OooO0o0(0L, false, this);
    }
}
