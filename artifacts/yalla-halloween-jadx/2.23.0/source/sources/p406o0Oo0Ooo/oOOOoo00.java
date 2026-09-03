package p406o0Oo0Ooo;

import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0}, l = {196}, m = "sendGift", n = {"msg"}, s = {"L$0"})
public final class oOOOoo00 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ChatMessage f45027OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ oOOO00Oo f45028OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f45029OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f45030OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOOOoo00(oOOO00Oo oooo00oo, Continuation<? super oOOOoo00> continuation) {
        super(continuation);
        this.f45028OooO0o = oooo00oo;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f45029OooO0o0 = obj;
        this.f45030OooO0oO |= Integer.MIN_VALUE;
        return oOOO00Oo.OooO00o(this.f45028OooO0o, null, this);
    }
}
