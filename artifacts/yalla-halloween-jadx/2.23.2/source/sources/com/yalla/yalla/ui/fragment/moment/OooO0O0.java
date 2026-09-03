package com.yalla.yalla.ui.fragment.moment;

import androidx.compose.runtime.State;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
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
@DebugMetadata(c = "com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$initView$3$1$2", f = "MainMomentFollowingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooO0O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingVM f28269OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ State<Long> f28270OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooO0O0(MomentFollowingVM momentFollowingVM, State<Long> state, Continuation<? super OooO0O0> continuation) {
        super(2, continuation);
        this.f28269OooO0Oo = momentFollowingVM;
        this.f28270OooO0o0 = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooO0O0(this.f28269OooO0Oo, this.f28270OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooO0O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        Long value = this.f28270OooO0o0.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "access$invoke$lambda$7$lambda$5(...)");
        if (value.longValue() > 0) {
            MomentFollowingVM.loadFollowingMomentList$default(this.f28269OooO0Oo, false, 1, null);
        }
        return Unit.INSTANCE;
    }
}
