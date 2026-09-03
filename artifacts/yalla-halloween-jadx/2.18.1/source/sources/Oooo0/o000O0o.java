package Oooo0;

import io.agora.rtc.Constants;
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
@DebugMetadata(c = "androidx.compose.foundation.FocusableKt$focusable$2$5$2", f = "Focusable.kt", i = {1}, l = {Constants.ERR_PUBLISH_STREAM_NUM_REACH_LIMIT, Constants.ERR_PUBLISH_STREAM_FORMAT_NOT_SUPPORTED}, m = "invokeSuspend", n = {"interaction"}, s = {"L$0"})
public final class o000O0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ p026Oooo0OO.o000 f581Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Object f582Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public int f583Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<p026Oooo0OO.o0000> f584Oooo0oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0o(o0O00OO<p026Oooo0OO.o0000> o0o00oo2, p026Oooo0OO.o000 o000Var, Continuation<? super o000O0o> continuation) {
        super(2, continuation);
        this.f584Oooo0oo = o0o00oo2;
        this.f581Oooo = o000Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O0o(this.f584Oooo0oo, this.f581Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code duplicated, block: B:24:0x0062 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o0O00OO<p026Oooo0OO.o0000> o0o00oo2;
        o0O00OO<p026Oooo0OO.o0000> o0o00oo3;
        p026Oooo0OO.o0000 o0000Var;
        p026Oooo0OO.o000 o000Var;
        p026Oooo0OO.o0000 o0000Var2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f583Oooo0oO;
        if (i != 0) {
            if (i == 1) {
                o0o00oo3 = (o0O00OO) this.f582Oooo0o;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0000Var2 = (p026Oooo0OO.o0000) this.f582Oooo0o;
                ResultKt.throwOnFailure(obj);
            }
            o0000Var = o0000Var2;
            this.f584Oooo0oo.setValue(o0000Var);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        p026Oooo0OO.o0000 value = this.f584Oooo0oo.getValue();
        if (value != null) {
            p026Oooo0OO.o000 o000Var2 = this.f581Oooo;
            o0o00oo2 = this.f584Oooo0oo;
            p026Oooo0OO.o0000O00 o0000o00 = new p026Oooo0OO.o0000O00(value);
            if (o000Var2 != null) {
                this.f582Oooo0o = o0o00oo2;
                this.f583Oooo0oO = 1;
                if (o000Var2.OooO0OO(o0000o00, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0o00oo3 = o0o00oo2;
            }
            o0o00oo2.setValue(null);
            o0000Var = new p026Oooo0OO.o0000();
            o000Var = this.f581Oooo;
            if (o000Var != null) {
                this.f582Oooo0o = o0000Var;
                this.f583Oooo0oO = 2;
                if (o000Var.OooO0OO(o0000Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0000Var2 = o0000Var;
                o0000Var = o0000Var2;
            }
        } else {
            o0000Var = new p026Oooo0OO.o0000();
            o000Var = this.f581Oooo;
            if (o000Var != null) {
                this.f582Oooo0o = o0000Var;
                this.f583Oooo0oO = 2;
                if (o000Var.OooO0OO(o0000Var, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                o0000Var2 = o0000Var;
                o0000Var = o0000Var2;
            }
        }
        this.f584Oooo0oo.setValue(o0000Var);
        return Unit.INSTANCE;
        o0o00oo2 = o0o00oo3;
        o0o00oo2.setValue(null);
        o0000Var = new p026Oooo0OO.o0000();
        o000Var = this.f581Oooo;
        if (o000Var != null) {
            this.f582Oooo0o = o0000Var;
            this.f583Oooo0oO = 2;
            if (o000Var.OooO0OO(o0000Var, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            o0000Var2 = o0000Var;
            o0000Var = o0000Var2;
        }
        this.f584Oooo0oo.setValue(o0000Var);
        return Unit.INSTANCE;
    }
}
