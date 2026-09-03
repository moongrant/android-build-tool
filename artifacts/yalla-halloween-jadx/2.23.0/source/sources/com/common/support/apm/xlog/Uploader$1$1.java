package com.common.support.apm.xlog;

import android.content.Context;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.common.support.networkstate.NetworkState;
import com.common.support.networkstate.NetworkStateUtil;
import kotlin.Metadata;
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

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.common.support.apm.xlog.Uploader$1$1", f = "Uploader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class Uploader$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Context $it;
    int label;
    final /* synthetic */ Uploader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Uploader$1$1(Context context, Uploader uploader, Continuation<? super Uploader$1$1> continuation) {
        super(2, continuation);
        this.$it = context;
        this.this$0 = uploader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: invokeSuspend$lambda-0, reason: not valid java name */
    public static final void m4017invokeSuspend$lambda0(Uploader uploader, NetworkState it) {
        Intrinsics.checkNotNullExpressionValue(it, "it");
        uploader.onNetworkStateChanged(it);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new Uploader$1$1(this.$it, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        NetworkStateUtil networkStateUtil = NetworkStateUtil.INSTANCE;
        Context it = this.$it;
        Intrinsics.checkNotNullExpressionValue(it, "it");
        MutableLiveData<NetworkState> mutableLiveDataNetworkStateLiveData = networkStateUtil.networkStateLiveData(it);
        final Uploader uploader = this.this$0;
        mutableLiveDataNetworkStateLiveData.observeForever(new Observer() { // from class: com.common.support.apm.xlog.OooO00o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj2) {
                Uploader$1$1.m4017invokeSuspend$lambda0(uploader, (NetworkState) obj2);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((Uploader$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
