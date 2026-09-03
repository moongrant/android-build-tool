package androidx.compose.foundation;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p026Oooo0OO.o000;
import p026Oooo0OO.o0000O0;
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2", f = "Hoverable.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {})
public final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ o000 f5630Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f5631Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ boolean f5632Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<o0000O0> f5633Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(boolean z, o0O00OO<o0000O0> o0o00oo2, o000 o000Var, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f5632Oooo0oO = z;
        this.f5633Oooo0oo = o0o00oo2;
        this.f5630Oooo = o000Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOO0(this.f5632Oooo0oO, this.f5633Oooo0oo, this.f5630Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f5631Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.f5632Oooo0oO) {
                o0O00OO<o0000O0> o0o00oo2 = this.f5633Oooo0oo;
                o000 o000Var = this.f5630Oooo;
                this.f5631Oooo0o = 1;
                if (HoverableKt.OooO00o.OooO0O0(o0o00oo2, o000Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
