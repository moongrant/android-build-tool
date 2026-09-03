package Oooo0;

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
import p100o000oOoO.o0O00OO;

/* JADX INFO: loaded from: classes.dex */
@DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$3", f = "Focusable.kt", i = {}, l = {163}, m = "invokeSuspend", n = {}, s = {})
public final class o000Oo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ p026Oooo0OO.o000 f602Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o0O00OO f603Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f604Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<p026Oooo0OO.o0000> f605Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000Oo0(o0O00OO<p026Oooo0OO.o0000> o0o00oo2, p026Oooo0OO.o000 o000Var, Continuation<? super o000Oo0> continuation) {
        super(2, continuation);
        this.f605Oooo0oo = o0o00oo2;
        this.f602Oooo = o000Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000Oo0(this.f605Oooo0oo, this.f602Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000Oo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o0O00OO<p026Oooo0OO.o0000> o0o00oo2;
        o0O00OO<p026Oooo0OO.o0000> o0o00oo3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f604Oooo0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            p026Oooo0OO.o0000 value = this.f605Oooo0oo.getValue();
            if (value != null) {
                p026Oooo0OO.o000 o000Var = this.f602Oooo;
                o0o00oo2 = this.f605Oooo0oo;
                p026Oooo0OO.o0000O00 o0000o00 = new p026Oooo0OO.o0000O00(value);
                if (o000Var != null) {
                    this.f603Oooo0o = o0o00oo2;
                    this.f604Oooo0oO = 1;
                    if (o000Var.OooO0OO(o0000o00, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    o0o00oo3 = o0o00oo2;
                }
                o0o00oo2.setValue(null);
            }
            return Unit.INSTANCE;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        o0o00oo3 = this.f603Oooo0o;
        ResultKt.throwOnFailure(obj);
        o0o00oo2 = o0o00oo3;
        o0o00oo2.setValue(null);
        return Unit.INSTANCE;
    }
}
