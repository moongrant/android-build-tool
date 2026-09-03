package p412o0Oo0o0O;

import com.yalla.yalla.data.db.table.ChatMessage;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.ImMessageRepo", f = "ImMessageRepo.kt", i = {0}, l = {259}, m = "sendGiftBlind", n = {"msg"}, s = {"L$0"})
public final class o00O000o extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public ChatMessage f46068OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ o000OO00 f46069OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public /* synthetic */ Object f46070OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public int f46071OooO0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O000o(o000OO00 o000oo01, Continuation<? super o00O000o> continuation) {
        super(continuation);
        this.f46069OooO0o = o000oo01;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f46070OooO0o0 = obj;
        this.f46071OooO0oO |= Integer.MIN_VALUE;
        return o000OO00.OooO0OO(this.f46069OooO0o, null, this);
    }
}
