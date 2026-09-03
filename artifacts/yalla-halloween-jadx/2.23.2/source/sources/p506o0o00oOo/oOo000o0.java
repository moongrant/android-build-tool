package p506o0o00oOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.manager.unBlur.GooglePaySubscriptionModel;
import com.yalla.yalla.model.RechargeMenuPayResultModel;
import com.yalla.yalla.model.RechargeMenuToPayModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.util.PaySupportChannels;
import com.zego.zegoavkit2.ZegoConstants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o000000;
import p598o0oo00Oo.o0000O00;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$toPay$1", f = "PremiumActivity.kt", i = {}, l = {599, 600}, m = "invokeSuspend", n = {}, s = {})
public final class oOo000o0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f50556OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RechargeMenuToPayModel f50557OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f50558OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final /* synthetic */ GooglePaySubscriptionModel f50559OooO0oO;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$toPay$1$1", f = "PremiumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuPayResultModel f50560OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ GooglePaySubscriptionModel f50561OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PremiumActivity f50562OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RechargeMenuPayResultModel rechargeMenuPayResultModel, PremiumActivity premiumActivity, GooglePaySubscriptionModel googlePaySubscriptionModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f50560OooO0Oo = rechargeMenuPayResultModel;
            this.f50562OooO0o0 = premiumActivity;
            this.f50561OooO0o = googlePaySubscriptionModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f50560OooO0Oo, this.f50562OooO0o0, this.f50561OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            RechargeMenuPayResultModel rechargeMenuPayResultModel = this.f50560OooO0Oo;
            boolean isSuccess = rechargeMenuPayResultModel.getIsSuccess();
            boolean z = true;
            PremiumActivity premiumActivity = this.f50562OooO0o0;
            if (isSuccess) {
                o0000O00.OooO0O0("确认订单和消单 orderId:" + rechargeMenuPayResultModel.getOrderid() + " purchaseToken: " + rechargeMenuPayResultModel.getPurchasetoken());
                premiumActivity.getClass();
                Intrinsics.checkNotNull(premiumActivity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
                BaseActivityK.OooOo0o(premiumActivity, o0000.OooO0OO(o000000.Validating_your_purchase), 0L, 2);
                PayOrder payOrder = new PayOrder();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                payOrder.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                payOrder.setConsume(false);
                payOrder.setNewOrder(true);
                payOrder.setType(rechargeMenuPayResultModel.getType());
                payOrder.setOrderId(rechargeMenuPayResultModel.getOrderid());
                payOrder.setSku(rechargeMenuPayResultModel.getSku());
                payOrder.setPurchaseToken(rechargeMenuPayResultModel.getPurchasetoken());
                payOrder.setPurchaseState(rechargeMenuPayResultModel.getPurchaseState());
                payOrder.setAcknowledged(rechargeMenuPayResultModel.getIsAcknowledged());
                payOrder.setHuaWeiAccountFlag(rechargeMenuPayResultModel.getAccountFlag());
                payOrder.setCreateTime(System.currentTimeMillis());
                payOrder.setSubscriptionState(this.f50561OooO0o.f22940OooO0OO.getValue());
                payOrder.setSubscription(rechargeMenuPayResultModel.getIsSubscription());
                payOrder.setSubscriptionId(rechargeMenuPayResultModel.getSubscriptionId());
                payOrder.setSubscriptionOrderId(rechargeMenuPayResultModel.getSubscriptionOrderId());
                premiumActivity.Oooo0O0().saveOrderToDB(payOrder);
                PremiumActivity.OooOoo0(premiumActivity, payOrder);
            } else {
                premiumActivity.f26688Oooo000 = false;
                o0000O00.OooO("支付失败 " + rechargeMenuPayResultModel.getErrorCode() + ZegoConstants.ZegoVideoDataAuxPublishingStream + rechargeMenuPayResultModel.getErrorMessage());
                PayOrder payOrder2 = new PayOrder();
                payOrder2.setOrderId(rechargeMenuPayResultModel.getOrderid());
                payOrder2.setSku(rechargeMenuPayResultModel.getSku());
                payOrder2.setType(rechargeMenuPayResultModel.getType());
                premiumActivity.Oooo0O0().onBuyErrorUploadLog(payOrder2);
                int errorCode = rechargeMenuPayResultModel.getErrorCode();
                if (errorCode != -103 && errorCode != -101) {
                    String errorMessage = rechargeMenuPayResultModel.getErrorMessage();
                    if (errorMessage != null && !StringsKt.isBlank(errorMessage)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(errorMessage, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                        }
                    }
                } else if (rechargeMenuPayResultModel.getType() == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                    String strOooO0OO = o0000.OooO0OO(o000000.huawei_play_useless);
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o2.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                        }
                    }
                } else {
                    String strOooO0OO2 = o0000.OooO0OO(o000000.google_play_useless);
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (!z) {
                        o000Oo0 o000oo0OooO00o3 = OooOo00.OooO00o(strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o3.run();
                        } else {
                            o000O00O.f13422OooO0O0.post(o000oo0OooO00o3);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oOo000o0(PremiumActivity premiumActivity, RechargeMenuToPayModel rechargeMenuToPayModel, GooglePaySubscriptionModel googlePaySubscriptionModel, Continuation<? super oOo000o0> continuation) {
        super(2, continuation);
        this.f50558OooO0o0 = premiumActivity;
        this.f50557OooO0o = rechargeMenuToPayModel;
        this.f50559OooO0oO = googlePaySubscriptionModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new oOo000o0(this.f50558OooO0o0, this.f50557OooO0o, this.f50559OooO0oO, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((oOo000o0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f50556OooO0Oo;
        GooglePaySubscriptionModel googlePaySubscriptionModel = this.f50559OooO0oO;
        PremiumActivity premiumActivity = this.f50558OooO0o0;
        if (i != 0) {
            if (i == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        PayManager payManager = premiumActivity.f26685OooOooO;
        if (payManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payManager");
            payManager = null;
        }
        this.f50556OooO0Oo = 1;
        obj = payManager.pay(this.f50557OooO0o, googlePaySubscriptionModel, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o((RechargeMenuPayResultModel) obj, premiumActivity, googlePaySubscriptionModel, null);
        this.f50556OooO0Oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
