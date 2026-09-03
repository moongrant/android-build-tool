package p406o0Oo0Ooo;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.YallaTeamMessageRepo", f = "YallaTeamMessageRepo.kt", i = {}, l = {20}, m = "sendYallaTeamMessage", n = {}, s = {})
public final class q0 extends ContinuationImpl {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public /* synthetic */ Object f45101OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f45102OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ r0 f45103OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, Continuation<? super q0> continuation) {
        super(continuation);
        this.f45103OooO0o0 = r0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f45101OooO0Oo = obj;
        this.f45102OooO0o |= Integer.MIN_VALUE;
        return this.f45103OooO0o0.OooO00o(0, null, this);
    }
}
