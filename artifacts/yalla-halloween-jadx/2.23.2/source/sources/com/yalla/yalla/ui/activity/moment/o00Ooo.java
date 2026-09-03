package com.yalla.yalla.ui.activity.moment;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentReplyActivity$replyItemComment$1$2", f = "MomentReplyActivity.kt", i = {}, l = {395}, m = "invokeSuspend", n = {}, s = {})
public final class o00Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f25985OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ MomentReplyActivity f25986OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f25987OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00Ooo(long j, MomentReplyActivity momentReplyActivity, Continuation<? super o00Ooo> continuation) {
        super(2, continuation);
        this.f25987OooO0o0 = j;
        this.f25986OooO0o = momentReplyActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00Ooo(this.f25987OooO0o0, this.f25986OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00Ooo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Function1<Boolean, Unit> function1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f25985OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.f25985OooO0Oo = 1;
            if (DelayKt.delay(this.f25987OooO0o0, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        p518o0o0O0O0.OooO0OO oooO0OO = (p518o0o0O0O0.OooO0OO) this.f25986OooO0o.f25702OooOo.getValue();
        if (oooO0OO != null && (function1 = oooO0OO.f51833OooO00o) != null) {
            function1.invoke(Boxing.boxBoolean(true));
        }
        return Unit.INSTANCE;
    }
}
