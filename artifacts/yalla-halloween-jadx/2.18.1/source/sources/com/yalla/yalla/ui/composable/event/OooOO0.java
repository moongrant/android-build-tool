package com.yalla.yalla.ui.composable.event;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p100o000oOoO.o0O00OO;
import p498o0o00Oo0.OooOOO;
import p520o0o0O0O0.o0OoOo0;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.composable.event.EventKt$showAddToCalendarDialog$2$1$4$1", f = "Event.kt", i = {}, l = {504, 507}, m = "invokeSuspend", n = {}, s = {})
public final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f23724Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ o0O00OO<Boolean> f23725Oooo0oO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0(o0O00OO<Boolean> o0o00oo2, Continuation<? super OooOO0> continuation) {
        super(2, continuation);
        this.f23725Oooo0oO = o0o00oo2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOO0(this.f23725Oooo0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x007b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        o0OoOo0 o0oooo1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f23724Oooo0o;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            OooOOO oooOOO = OooOOO.f41216OooO00o;
            if (Intrinsics.areEqual(oooOOO.OooOoo0().getValue(), Boxing.boxBoolean(false))) {
                Boolean autoAddCalendar = this.f23725Oooo0oO.getValue();
                Intrinsics.checkNotNullExpressionValue(autoAddCalendar, "autoAddCalendar");
                if (autoAddCalendar.booleanValue()) {
                    o0OoOo0 o0oooo2 = o0OoOo0.f42829OooO00o;
                    this.f23724Oooo0o = 1;
                    if (o0oooo2.OooO0O0(1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (Intrinsics.areEqual(oooOOO.OooOoo0().getValue(), Boxing.boxBoolean(true)) && !this.f23725Oooo0oO.getValue().booleanValue()) {
                    o0oooo1 = o0OoOo0.f42829OooO00o;
                    this.f23724Oooo0o = 2;
                    if (o0oooo1.OooO0O0(0, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (Intrinsics.areEqual(oooOOO.OooOoo0().getValue(), Boxing.boxBoolean(true))) {
                o0oooo1 = o0OoOo0.f42829OooO00o;
                this.f23724Oooo0o = 2;
                if (o0oooo1.OooO0O0(0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
