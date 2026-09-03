package p412o0Oo0o0O;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.YallaTeamMessageRepo", f = "YallaTeamMessageRepo.kt", i = {}, l = {20}, m = "sendYallaTeamMessage", n = {}, s = {})
public final class o0oO0Ooo extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f46339OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f46340OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0O00o00 f46341OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0oO0Ooo(o0O00o00 o0o00o01, Continuation<? super o0oO0Ooo> continuation) {
        super(continuation);
        this.f46341OooO0o0 = o0o00o01;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f46339OooO0Oo = obj;
        this.f46340OooO0o |= Integer.MIN_VALUE;
        return this.f46341OooO0o0.OooO00o(0, null, this);
    }
}
