package com.yalla.yalla.ui.activity.message;

import com.facebook.internal.FacebookRequestErrorClassification;
import com.yalla.yalla.data.db.table.SystemMessage;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.message.SystemMessageActivity$initData$2$1", f = "SystemMessageActivity.kt", i = {}, l = {FacebookRequestErrorClassification.EC_TOO_MANY_USER_ACTION_CALLS}, m = "invokeSuspend", n = {}, s = {})
public final class o0O000Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f25487OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.o0OOO0o<SystemMessage> f25488OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ SystemMessageActivity f25489OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O000Oo(SystemMessageActivity systemMessageActivity, androidx.paging.o0OOO0o<SystemMessage> o0ooo0o2, Continuation<? super o0O000Oo> continuation) {
        super(2, continuation);
        this.f25489OooO0o0 = systemMessageActivity;
        this.f25488OooO0o = o0ooo0o2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O000Oo(this.f25489OooO0o0, this.f25488OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O000Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f25487OooO0Oo;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            com.yalla.yalla.ui.adapter.o00O0000 o00o0001 = this.f25489OooO0o0.f25312OooOo00;
            if (o00o0001 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00o0001 = null;
            }
            androidx.paging.o0OOO0o<SystemMessage> it = this.f25488OooO0o;
            Intrinsics.checkNotNullExpressionValue(it, "$it");
            this.f25487OooO0Oo = 1;
            if (o00o0001.OooO0OO(it, this) == coroutine_suspended) {
                return coroutine_suspended;
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
