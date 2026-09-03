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
@DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$2$1", f = "Focusable.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
public final class o0000O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ p026Oooo0OO.o000 f553Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public o0O00OO f554Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f555Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<p026Oooo0OO.o0000> f556Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0000O0(o0O00OO<p026Oooo0OO.o0000> o0o00oo2, p026Oooo0OO.o000 o000Var, Continuation<? super o0000O0> continuation) {
        super(2, continuation);
        this.f556Oooo0oo = o0o00oo2;
        this.f553Oooo = o000Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0000O0(this.f556Oooo0oo, this.f553Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0000O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o0O00OO<p026Oooo0OO.o0000> o0o00oo2;
        o0O00OO<p026Oooo0OO.o0000> o0o00oo3;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f555Oooo0oO;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            p026Oooo0OO.o0000 value = this.f556Oooo0oo.getValue();
            if (value != null) {
                p026Oooo0OO.o000 o000Var = this.f553Oooo;
                o0o00oo2 = this.f556Oooo0oo;
                p026Oooo0OO.o0000O00 o0000o00 = new p026Oooo0OO.o0000O00(value);
                if (o000Var != null) {
                    this.f554Oooo0o = o0o00oo2;
                    this.f555Oooo0oO = 1;
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
        o0o00oo3 = this.f554Oooo0o;
        ResultKt.throwOnFailure(obj);
        o0o00oo2 = o0o00oo3;
        o0o00oo2.setValue(null);
        return Unit.INSTANCE;
    }
}
