package com.yalla.yalla.ui.fragment.moment;

import com.yalla.yalla.ui.composable.common.LoadMoreState;
import com.yalla.yalla.ui.vm.moment.MomentFollowingVM;
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

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.fragment.moment.MainMomentFollowingFragment$initView$3$1$5$2$1$3$1", f = "MainMomentFollowingFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentFollowingVM f28275OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOO0O(MomentFollowingVM momentFollowingVM, Continuation<? super OooOO0O> continuation) {
        super(2, continuation);
        this.f28275OooO0Oo = momentFollowingVM;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOO0O(this.f28275OooO0Oo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MomentFollowingVM momentFollowingVM = this.f28275OooO0Oo;
        if (momentFollowingVM.getLoadMoreState().getValue() == LoadMoreState.Loading) {
            momentFollowingVM.loadFollowingMoreData();
        }
        return Unit.INSTANCE;
    }
}
