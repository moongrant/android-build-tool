package com.yalla.yalla.ui.activity.moment;

import com.yalla.yalla.ui.composable.common.LoadMoreState;
import com.yalla.yalla.ui.vm.moment.MomentRecordEditVM;
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
@DebugMetadata(c = "com.yalla.yalla.ui.activity.moment.MomentEditRecordScreen$ListContent$3$2$1$2$1$1", f = "MomentEditRecordScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OooOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ MomentRecordEditVM f26229OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ long f26230OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OooOo(MomentRecordEditVM momentRecordEditVM, long j, Continuation<? super OooOo> continuation) {
        super(2, continuation);
        this.f26229OooO0Oo = momentRecordEditVM;
        this.f26230OooO0o0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new OooOo(this.f26229OooO0Oo, this.f26230OooO0o0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((OooOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        MomentRecordEditVM momentRecordEditVM = this.f26229OooO0Oo;
        if (momentRecordEditVM.getLoadMoreState().getValue() == LoadMoreState.Loading) {
            momentRecordEditVM.loadData(this.f26230OooO0o0, false);
        }
        return Unit.INSTANCE;
    }
}
