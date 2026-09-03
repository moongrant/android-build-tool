package com.yalla.yalla.common.manager;

import com.android.billingclient.api.o0Oo0oo;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.model.RechargeMenuConfirmOrderResultModel;
import kotlin.Metadata;
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
import p498o0o00Oo0.OooOOO;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@DebugMetadata(c = "com.yalla.yalla.common.manager.FixRechargeOrderManager$confirmRechargeOrder$1$1$1", f = "FixRechargeOrderManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FixRechargeOrderManager$confirmRechargeOrder$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public final /* synthetic */ RechargeMenuConfirmOrderResultModel $data;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixRechargeOrderManager$confirmRechargeOrder$1$1$1(RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel, Continuation<? super FixRechargeOrderManager$confirmRechargeOrder$1$1$1> continuation) {
        super(2, continuation);
        this.$data = rechargeMenuConfirmOrderResultModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FixRechargeOrderManager$confirmRechargeOrder$1$1$1(this.$data, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FixRechargeOrderManager$confirmRechargeOrder$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String strOooO0Oo;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Long balance = this.$data.getBalance();
        if (balance != null) {
            OooOOO.f41216OooO00o.OooO0OO().postValue(Boxing.boxLong(balance.longValue()));
        }
        LiveEventBus.get("FixRechargeOrder_Success").post(Boxing.boxBoolean(true));
        StringBuilder sb = new StringBuilder();
        sb.append("Google补单 App确认 成功 data:");
        RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel = this.$data;
        if (rechargeMenuConfirmOrderResultModel != null) {
            strOooO0Oo = o0Oo0oo.OooO0Oo(rechargeMenuConfirmOrderResultModel);
            Intrinsics.checkNotNullExpressionValue(strOooO0Oo, "{\n                GsonCo…toJson(obj)\n            }");
        } else {
            strOooO0Oo = "";
        }
        sb.append(strOooO0Oo);
        o00O00.OooO0O0(sb.toString());
        return Unit.INSTANCE;
    }
}
