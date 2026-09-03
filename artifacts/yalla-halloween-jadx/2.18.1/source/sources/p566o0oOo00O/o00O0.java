package p566o0oOo00O;

import android.os.Looper;
import com.code.android.util.ToastUtil;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.manager.GooglePaySubscriptionModel;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.common.model.RechargeMenuPayResultModel;
import com.yalla.yalla.common.model.RechargeMenuToPayModel;
import com.yalla.yalla.common.util.PaySupportChannels;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import java.util.Objects;
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
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p515o0o0O00.o00O00;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$toPay$1", f = "PremiumActivity.kt", i = {}, l = {599, 600}, m = "invokeSuspend", n = {}, s = {})
public final class o00O0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ GooglePaySubscriptionModel f45237Oooo;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public int f45238Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ PremiumActivity f45239Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ RechargeMenuToPayModel f45240Oooo0oo;

    @DebugMetadata(c = "com.yalla.yalla.ui.activity.user.PremiumActivity$toPay$1$1", f = "PremiumActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuPayResultModel f45241Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PremiumActivity f45242Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ GooglePaySubscriptionModel f45243Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RechargeMenuPayResultModel rechargeMenuPayResultModel, PremiumActivity premiumActivity, GooglePaySubscriptionModel googlePaySubscriptionModel, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45241Oooo0o = rechargeMenuPayResultModel;
            this.f45242Oooo0oO = premiumActivity;
            this.f45243Oooo0oo = googlePaySubscriptionModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45241Oooo0o, this.f45242Oooo0oO, this.f45243Oooo0oo, continuation);
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
            boolean z = true;
            if (this.f45241Oooo0o.getIsSuccess()) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("确认订单和消单 orderId:");
                sbOooO0o0.append(this.f45241Oooo0o.getOrderid());
                sbOooO0o0.append(" purchaseToken: ");
                sbOooO0o0.append(this.f45241Oooo0o.getPurchasetoken());
                o00O00.OooO0O0(sbOooO0o0.toString());
                PremiumActivity premiumActivity = this.f45242Oooo0oO;
                Objects.requireNonNull(premiumActivity);
                Intrinsics.checkNotNull(premiumActivity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
                BaseActivityK.OooOoo0(premiumActivity, OooOOO.OooO0OO(R.string.Validating_your_purchase), 0L, 2, null);
                PayOrder payOrder = new PayOrder();
                payOrder.setUserId(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue());
                payOrder.setConsume(false);
                payOrder.setNewOrder(true);
                payOrder.setType(this.f45241Oooo0o.getType());
                payOrder.setOrderId(this.f45241Oooo0o.getOrderid());
                payOrder.setSku(this.f45241Oooo0o.getSku());
                payOrder.setPurchaseToken(this.f45241Oooo0o.getPurchasetoken());
                payOrder.setPurchaseState(this.f45241Oooo0o.getPurchaseState());
                payOrder.setAcknowledged(this.f45241Oooo0o.getIsAcknowledged());
                payOrder.setHuaWeiAccountFlag(this.f45241Oooo0o.getAccountFlag());
                payOrder.setCreateTime(System.currentTimeMillis());
                payOrder.setSubscriptionState(this.f45243Oooo0oo.getAction().getValue());
                payOrder.setSubscription(this.f45241Oooo0o.getIsSubscription());
                payOrder.setSubscriptionId(this.f45241Oooo0o.getSubscriptionId());
                payOrder.setSubscriptionOrderId(this.f45241Oooo0o.getSubscriptionOrderId());
                this.f45242Oooo0oO.Oooo0oO().saveOrderToDB(payOrder);
                PremiumActivity.Oooo000(this.f45242Oooo0oO, payOrder);
            } else {
                this.f45242Oooo0oO.f23372o00Oo0 = false;
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("支付失败 ");
                sbOooO0o1.append(this.f45241Oooo0o.getErrorCode());
                sbOooO0o1.append(' ');
                sbOooO0o1.append(this.f45241Oooo0o.getErrorMessage());
                o00O00.OooOO0O(sbOooO0o1.toString());
                PayOrder payOrder2 = new PayOrder();
                RechargeMenuPayResultModel rechargeMenuPayResultModel = this.f45241Oooo0o;
                payOrder2.setOrderId(rechargeMenuPayResultModel.getOrderid());
                payOrder2.setSku(rechargeMenuPayResultModel.getSku());
                payOrder2.setType(rechargeMenuPayResultModel.getType());
                this.f45242Oooo0oO.Oooo0oO().onBuyErrorUploadLog(payOrder2);
                int errorCode = this.f45241Oooo0o.getErrorCode();
                if (errorCode != -103 && errorCode != -101) {
                    String errorMessage = this.f45241Oooo0o.getErrorMessage();
                    ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
                    if (errorMessage != null && !StringsKt.isBlank(errorMessage)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, errorMessage, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O0.run();
                        } else {
                            o00O000 o00o001 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                        }
                    }
                } else if (this.f45241Oooo0o.getType() == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                    String strOooO0OO = OooOOO.OooO0OO(R.string.huawei_play_useless);
                    ToastUtil toastUtil2 = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O1 = p074o000O0oo.OooOOO.OooO0O0(toastUtil2, strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O1.run();
                        } else {
                            o00O000 o00o002 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O1);
                        }
                    }
                } else {
                    String strOooO0OO2 = OooOOO.OooO0OO(R.string.google_play_useless);
                    ToastUtil toastUtil3 = ToastUtil.f12568OooO0O0;
                    if (strOooO0OO2 != null && !StringsKt.isBlank(strOooO0OO2)) {
                        z = false;
                    }
                    if (!z) {
                        o0O0ooO o0o0oooOooO0O2 = p074o000O0oo.OooOOO.OooO0O0(toastUtil3, strOooO0OO2, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o0o0oooOooO0O2.run();
                        } else {
                            o00O000 o00o003 = o00O000.f34346OooO00o;
                            o00O000.f34348OooO0OO.post(o0o0oooOooO0O2);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o00O0(PremiumActivity premiumActivity, RechargeMenuToPayModel rechargeMenuToPayModel, GooglePaySubscriptionModel googlePaySubscriptionModel, Continuation<? super o00O0> continuation) {
        super(2, continuation);
        this.f45239Oooo0oO = premiumActivity;
        this.f45240Oooo0oo = rechargeMenuToPayModel;
        this.f45237Oooo = googlePaySubscriptionModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o00O0(this.f45239Oooo0oO, this.f45240Oooo0oo, this.f45237Oooo, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o00O0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45238Oooo0o;
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
        PayManager payManager = this.f45239Oooo0oO.f23381ooOO;
        if (payManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payManager");
            payManager = null;
        }
        RechargeMenuToPayModel rechargeMenuToPayModel = this.f45240Oooo0oo;
        GooglePaySubscriptionModel googlePaySubscriptionModel = this.f45237Oooo;
        this.f45238Oooo0o = 1;
        obj = payManager.pay(rechargeMenuToPayModel, googlePaySubscriptionModel, this);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o((RechargeMenuPayResultModel) obj, this.f45239Oooo0oO, this.f45237Oooo, null);
        this.f45238Oooo0o = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
