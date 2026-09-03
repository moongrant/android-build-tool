package p520o0o0O0O0;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@DebugMetadata(c = "com.yalla.yalla.data.repository.UserInfoRepo", f = "UserInfoRepo.kt", i = {}, l = {80}, m = "getUserInfoByNet", n = {}, s = {})
public final class o00OOO0 extends ContinuationImpl {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public /* synthetic */ Object f42718Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ oo0O f42719Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public int f42720Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00OOO0(oo0O oo0o, Continuation<? super o00OOO0> continuation) {
        super(continuation);
        this.f42719Oooo0oO = oo0o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f42718Oooo0o = obj;
        this.f42720Oooo0oo |= Integer.MIN_VALUE;
        return oo0O.OooO0o0(this.f42719Oooo0oO, 0L, this);
    }
}
