package com.yalla.yalla.common.manager;

import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import com.android.billingclient.api.SkuDetails;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.manager.googlepay.GooglePayManager;
import com.yalla.yalla.common.manager.googlepay.GooglePaySkuDetail;
import com.yalla.yalla.common.manager.googlepay.PayError;
import com.yalla.yalla.common.manager.googlepay.PayResult;
import com.yalla.yalla.common.model.RechargeMenuPayBuyResultModel;
import com.yalla.yalla.common.model.RechargeMenuPayResultModel;
import com.yalla.yalla.common.model.RechargeMenuToPayModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p498o0o00Oo0.OooOOO;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0011J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001eJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010 2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\"J)\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0$2\u0006\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010!\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\"J;\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0$0 2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0$2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010)J%\u0010*\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010+\u001a\u0004\u0018\u00010(H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010,R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Lcom/yalla/yalla/common/manager/PayManager;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "(Landroidx/fragment/app/FragmentActivity;)V", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "googlePayManager", "Lcom/yalla/yalla/common/manager/googlepay/GooglePayManager;", "consumeOrder", "", "payOrder", "Lcom/yalla/yalla/common/db/table/PayOrder;", "(Lcom/yalla/yalla/common/db/table/PayOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isHasSubscription", "type", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "pay", "Lcom/yalla/yalla/common/model/RechargeMenuPayResultModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/yalla/yalla/common/model/RechargeMenuToPayModel;", "subscription", "Lcom/yalla/yalla/common/manager/GooglePaySubscriptionModel;", "(Lcom/yalla/yalla/common/model/RechargeMenuToPayModel;Lcom/yalla/yalla/common/manager/GooglePaySubscriptionModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "purchaseHistory", "Lcom/yalla/yalla/common/manager/googlepay/PayResult;", "isSubscription", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchases", "", "querySkuDetails", "Lcom/yalla/yalla/common/manager/googlepay/GooglePaySkuDetail;", "skuList", "", "(Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toSubscriptionManagerPage", "sku", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_YallaRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PayManager {
    public static final int $stable = 8;

    @NotNull
    private final FragmentActivity activity;

    @NotNull
    private final GooglePayManager googlePayManager;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.PayManager$consumeOrder$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.PayManager", f = "PayManager.kt", i = {0, 0, 1, 1}, l = {94, 95, 96}, m = "consumeOrder", n = {"this", "payOrder", "this", "payOrder"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PayManager.this.consumeOrder(null, this);
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.PayManager$pay$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.PayManager", f = "PayManager.kt", i = {0, 0}, l = {52}, m = "pay", n = {"subscription", "rechargeMenuPayResultModel"}, s = {"L$0", "L$1"})
    public static final class C04641 extends ContinuationImpl {
        public Object L$0;
        public Object L$1;
        public int label;
        public /* synthetic */ Object result;

        public C04641(Continuation<? super C04641> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return PayManager.this.pay(null, null, this);
        }
    }

    public PayManager(@NotNull FragmentActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.activity = activity;
        this.googlePayManager = new GooglePayManager(activity, ((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(OooOOO.f41216OooO00o)).longValue());
    }

    public static /* synthetic */ Object pay$default(PayManager payManager, RechargeMenuToPayModel rechargeMenuToPayModel, GooglePaySubscriptionModel googlePaySubscriptionModel, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            googlePaySubscriptionModel = null;
        }
        return payManager.pay(rechargeMenuToPayModel, googlePaySubscriptionModel, continuation);
    }

    public static /* synthetic */ Object purchaseHistory$default(PayManager payManager, int i, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return payManager.purchaseHistory(i, z, continuation);
    }

    public static /* synthetic */ Object queryPurchases$default(PayManager payManager, int i, boolean z, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return payManager.queryPurchases(i, z, continuation);
    }

    public static /* synthetic */ Object toSubscriptionManagerPage$default(PayManager payManager, int i, String str, Continuation continuation, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        return payManager.toSubscriptionManagerPage(i, str, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0079  */
    /* JADX WARN: Code duplicated, block: B:31:0x0088 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object consumeOrder(@NotNull PayOrder payOrder, @NotNull Continuation<? super Boolean> continuation) {
        AnonymousClass1 anonymousClass1;
        PayManager payManager;
        Boolean bool;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objConsumeOrder = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                payOrder = (PayOrder) anonymousClass1.L$1;
                payManager = (PayManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objConsumeOrder);
            } else if (i2 == 2) {
                payOrder = (PayOrder) anonymousClass1.L$1;
                payManager = (PayManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objConsumeOrder);
                bool = (Boolean) objConsumeOrder;
                if (bool == null) {
                    return bool;
                }
                GooglePayManager googlePayManager = payManager.googlePayManager;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                objConsumeOrder = googlePayManager.consumeOrder(payOrder, anonymousClass1);
                if (objConsumeOrder == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objConsumeOrder);
            }
            return (Boolean) objConsumeOrder;
        }
        ResultKt.throwOnFailure(objConsumeOrder);
        GooglePayManager googlePayManager2 = this.googlePayManager;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = payOrder;
        anonymousClass1.label = 1;
        objConsumeOrder = googlePayManager2.consumeOrder(payOrder, anonymousClass1);
        if (objConsumeOrder == coroutine_suspended) {
            return coroutine_suspended;
        }
        payManager = this;
        bool = (Boolean) objConsumeOrder;
        if (bool == null) {
            GooglePayManager googlePayManager3 = payManager.googlePayManager;
            anonymousClass1.L$0 = payManager;
            anonymousClass1.L$1 = payOrder;
            anonymousClass1.label = 2;
            objConsumeOrder = googlePayManager3.consumeOrder(payOrder, anonymousClass1);
            if (objConsumeOrder == coroutine_suspended) {
                return coroutine_suspended;
            }
            bool = (Boolean) objConsumeOrder;
        }
        if (bool == null) {
            return bool;
        }
        GooglePayManager googlePayManager4 = payManager.googlePayManager;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 3;
        objConsumeOrder = googlePayManager4.consumeOrder(payOrder, anonymousClass1);
        if (objConsumeOrder == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (Boolean) objConsumeOrder;
    }

    @NotNull
    public final FragmentActivity getActivity() {
        return this.activity;
    }

    @Nullable
    public final Object isHasSubscription(int i, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(false);
    }

    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object pay(@NotNull RechargeMenuToPayModel rechargeMenuToPayModel, @Nullable GooglePaySubscriptionModel googlePaySubscriptionModel, @NotNull Continuation<? super RechargeMenuPayResultModel> continuation) {
        C04641 c04641;
        RechargeMenuPayResultModel rechargeMenuPayResultModel;
        String strErrorUnknownMessage;
        if (continuation instanceof C04641) {
            c04641 = (C04641) continuation;
            int i = c04641.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c04641.label = i - Integer.MIN_VALUE;
            } else {
                c04641 = new C04641(continuation);
            }
        } else {
            c04641 = new C04641(continuation);
        }
        Object obj = c04641.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c04641.label;
        int code2 = PayError.ERROR_UNKNOWN;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            RechargeMenuPayResultModel rechargeMenuPayResultModel2 = new RechargeMenuPayResultModel();
            rechargeMenuPayResultModel2.setType(rechargeMenuToPayModel.getType());
            rechargeMenuPayResultModel2.setOrderid(rechargeMenuToPayModel.getOrderid());
            rechargeMenuPayResultModel2.setSku(rechargeMenuToPayModel.getSku());
            rechargeMenuPayResultModel2.setSubscription(googlePaySubscriptionModel != null);
            rechargeMenuPayResultModel2.setPurchasetoken("");
            rechargeMenuPayResultModel2.setPurchaseState(0);
            rechargeMenuPayResultModel2.setAccountFlag(0);
            rechargeMenuPayResultModel2.setErrorMessage("");
            rechargeMenuPayResultModel2.setErrorCode(PayError.ERROR_UNKNOWN);
            rechargeMenuPayResultModel2.setSuccess(false);
            rechargeMenuPayResultModel2.setAcknowledged(false);
            rechargeMenuPayResultModel2.setSubscriptionId("");
            rechargeMenuPayResultModel2.setSubscriptionOrderId("");
            if (rechargeMenuToPayModel.getSkuDetails() == null) {
                rechargeMenuPayResultModel2.setSuccess(false);
                rechargeMenuPayResultModel2.setErrorMessage(PayError.INSTANCE.errorParamsIsNullMessage());
                rechargeMenuPayResultModel2.setErrorCode(PayError.ERROR_PARAMS_IS_NULL);
                rechargeMenuPayResultModel2.setPurchasetoken("");
                rechargeMenuPayResultModel2.setAccountFlag(0);
                return rechargeMenuPayResultModel2;
            }
            GooglePayManager googlePayManager = this.googlePayManager;
            String orderid = rechargeMenuToPayModel.getOrderid();
            SkuDetails skuDetails = rechargeMenuToPayModel.getSkuDetails();
            Intrinsics.checkNotNull(skuDetails);
            c04641.L$0 = googlePaySubscriptionModel;
            c04641.L$1 = rechargeMenuPayResultModel2;
            c04641.label = 1;
            Object objBuy = googlePayManager.buy(orderid, skuDetails, googlePaySubscriptionModel, c04641);
            if (objBuy == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objBuy;
            rechargeMenuPayResultModel = rechargeMenuPayResultModel2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rechargeMenuPayResultModel = (RechargeMenuPayResultModel) c04641.L$1;
            googlePaySubscriptionModel = (GooglePaySubscriptionModel) c04641.L$0;
            ResultKt.throwOnFailure(obj);
        }
        PayResult payResult = (PayResult) obj;
        if (payResult.getData() != null && googlePaySubscriptionModel != null && googlePaySubscriptionModel.getAction() == GooglePaySubscriptionModel.Action.Downgrade) {
            rechargeMenuPayResultModel.setSuccess(true);
            Object data = payResult.getData();
            Intrinsics.checkNotNull(data);
            rechargeMenuPayResultModel.setPurchasetoken(((RechargeMenuPayBuyResultModel) data).getPurchaseToken());
            Object data2 = payResult.getData();
            Intrinsics.checkNotNull(data2);
            rechargeMenuPayResultModel.setPurchaseState(((RechargeMenuPayBuyResultModel) data2).getPurchaseState());
            Object data3 = payResult.getData();
            Intrinsics.checkNotNull(data3);
            rechargeMenuPayResultModel.setAcknowledged(((RechargeMenuPayBuyResultModel) data3).getIsAcknowledged());
            return rechargeMenuPayResultModel;
        }
        RechargeMenuPayBuyResultModel rechargeMenuPayBuyResultModel = (RechargeMenuPayBuyResultModel) payResult.getData();
        String purchaseToken = rechargeMenuPayBuyResultModel != null ? rechargeMenuPayBuyResultModel.getPurchaseToken() : null;
        if (purchaseToken == null || StringsKt.isBlank(purchaseToken)) {
            rechargeMenuPayResultModel.setSuccess(false);
            PayError error = payResult.getError();
            if (error == null || (strErrorUnknownMessage = error.getMessage()) == null) {
                strErrorUnknownMessage = PayError.INSTANCE.errorUnknownMessage();
            }
            rechargeMenuPayResultModel.setErrorMessage(strErrorUnknownMessage);
            PayError error2 = payResult.getError();
            if (error2 != null) {
                code2 = error2.getCode();
            }
            rechargeMenuPayResultModel.setErrorCode(code2);
            return rechargeMenuPayResultModel;
        }
        rechargeMenuPayResultModel.setSuccess(true);
        Object data4 = payResult.getData();
        Intrinsics.checkNotNull(data4);
        rechargeMenuPayResultModel.setPurchasetoken(((RechargeMenuPayBuyResultModel) data4).getPurchaseToken());
        Object data5 = payResult.getData();
        Intrinsics.checkNotNull(data5);
        rechargeMenuPayResultModel.setPurchaseState(((RechargeMenuPayBuyResultModel) data5).getPurchaseState());
        Object data6 = payResult.getData();
        Intrinsics.checkNotNull(data6);
        rechargeMenuPayResultModel.setAcknowledged(((RechargeMenuPayBuyResultModel) data6).getIsAcknowledged());
        return rechargeMenuPayResultModel;
    }

    @Nullable
    public final Object purchaseHistory(int i, boolean z, @NotNull Continuation<? super PayResult<Object>> continuation) {
        return new PayResult(null, null);
    }

    @Nullable
    public final Object queryPurchases(int i, boolean z, @NotNull Continuation<? super List<PayOrder>> continuation) {
        return this.googlePayManager.queryPurchases(z, continuation);
    }

    @Nullable
    public final Object querySkuDetails(@NotNull List<String> list, int i, boolean z, @NotNull Continuation<? super PayResult<List<GooglePaySkuDetail>>> continuation) {
        return this.googlePayManager.querySkuDetails(list, z, continuation);
    }

    @Nullable
    public final Object toSubscriptionManagerPage(int i, @Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(false);
    }
}
