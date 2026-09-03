package p520o0o0O0O0;

import com.yalla.yalla.common.db.table.ChatMessage;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0}, l = {244}, m = "sendGiftBlind", n = {"msg"}, s = {"L$0"})
public final class o000000 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public int f42342Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public ChatMessage f42343Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public /* synthetic */ Object f42344Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0OOO0o f42345Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000000(o0OOO0o o0ooo0o2, Continuation<? super o000000> continuation) {
        super(continuation);
        this.f42345Oooo0oo = o0ooo0o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f42344Oooo0oO = obj;
        this.f42342Oooo |= Integer.MIN_VALUE;
        return o0OOO0o.OooO0O0(this.f42345Oooo0oo, null, this);
    }
}
