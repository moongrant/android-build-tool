package com.yalla.yalla.common.manager;

import android.content.Intent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o0000;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.manager.unBlur.GooglePaySubscriptionModel;
import com.yalla.yalla.model.RechargeMenuPayBuyResultModel;
import com.yalla.yalla.model.RechargeMenuPayResultModel;
import com.yalla.yalla.model.RechargeMenuToPayModel;
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
import p140o00OOooo.OooOO0;
import p431o0OoOOOO.o00OO;
import p431o0OoOOOO.o00OO00O;
import p431o0OoOOOO.o00OOO00;
import p431o0OoOOOO.o00OOO0O;
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b.\u0010/J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ=\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\u00102\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00140\t2\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\"\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016J'\u0010!\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\nH\u0086@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J+\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0019J\u001b\u0010$\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0017\u0010'\u001a\u00020&8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/yalla/yalla/common/manager/PayManager;", "", "Lcom/yalla/yalla/model/RechargeMenuToPayModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/yalla/yalla/manager/unBlur/GooglePaySubscriptionModel;", "subscription", "Lcom/yalla/yalla/model/RechargeMenuPayResultModel;", "pay", "(Lcom/yalla/yalla/model/RechargeMenuToPayModel;Lcom/yalla/yalla/manager/unBlur/GooglePaySubscriptionModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "skuList", "", "type", "", "isSubscription", "Lo0OoOOOO/o00OOO0O;", "Lo0OoOOOO/o00OO;", "queryDetails", "(Ljava/util/List;IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/yalla/yalla/data/db/table/PayOrder;", "payOrder", "consumeOrder", "(Lcom/yalla/yalla/data/db/table/PayOrder;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "queryPurchases", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "", "onActivityResult", "sku", "toSubscriptionManagerPage", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "purchaseHistory", "isHasSubscription", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/fragment/app/FragmentActivity;", "activity", "Landroidx/fragment/app/FragmentActivity;", "getActivity", "()Landroidx/fragment/app/FragmentActivity;", "Lo0OoOOOO/o00OO00O;", "googlePayManager", "Lo0OoOOOO/o00OO00O;", "<init>", "(Landroidx/fragment/app/FragmentActivity;)V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class PayManager {
    public static final int $stable = 8;

    @NotNull
    private final FragmentActivity activity;

    @NotNull
    private final o00OO00O googlePayManager;

    /* JADX INFO: renamed from: com.yalla.yalla.common.manager.PayManager$consumeOrder$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.PayManager", f = "PayManager.kt", i = {0, 0, 1, 1}, l = {99, 100, 101}, m = "consumeOrder", n = {"this", "payOrder", "this", "payOrder"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

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
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.yalla.yalla.common.manager.PayManager", f = "PayManager.kt", i = {0, 0}, l = {51}, m = "pay", n = {"subscription", "rechargeMenuPayResultModel"}, s = {"L$0", "L$1"})
    public static final class C09351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C09351(Continuation<? super C09351> continuation) {
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
        o000000O o000000o2 = o000000O.f46674OooO00o;
        this.googlePayManager = new o00OO00O(activity, ((Number) OooO0OO.OooO0O0()).longValue());
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
        Object objOooO0oO = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                payOrder = (PayOrder) anonymousClass1.L$1;
                payManager = (PayManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objOooO0oO);
            } else if (i2 == 2) {
                payOrder = (PayOrder) anonymousClass1.L$1;
                payManager = (PayManager) anonymousClass1.L$0;
                ResultKt.throwOnFailure(objOooO0oO);
                bool = (Boolean) objOooO0oO;
                if (bool == null) {
                    return bool;
                }
                o00OO00O o00oo00o = payManager.googlePayManager;
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 3;
                objOooO0oO = o00oo00o.OooO0oO(payOrder, anonymousClass1);
                if (objOooO0oO == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objOooO0oO);
            }
            return (Boolean) objOooO0oO;
        }
        ResultKt.throwOnFailure(objOooO0oO);
        o00OO00O o00oo00o2 = this.googlePayManager;
        anonymousClass1.L$0 = this;
        anonymousClass1.L$1 = payOrder;
        anonymousClass1.label = 1;
        objOooO0oO = o00oo00o2.OooO0oO(payOrder, anonymousClass1);
        if (objOooO0oO == coroutine_suspended) {
            return coroutine_suspended;
        }
        payManager = this;
        bool = (Boolean) objOooO0oO;
        if (bool == null) {
            o00OO00O o00oo00o3 = payManager.googlePayManager;
            anonymousClass1.L$0 = payManager;
            anonymousClass1.L$1 = payOrder;
            anonymousClass1.label = 2;
            objOooO0oO = o00oo00o3.OooO0oO(payOrder, anonymousClass1);
            if (objOooO0oO == coroutine_suspended) {
                return coroutine_suspended;
            }
            bool = (Boolean) objOooO0oO;
        }
        if (bool == null) {
            return bool;
        }
        o00OO00O o00oo00o4 = payManager.googlePayManager;
        anonymousClass1.L$0 = null;
        anonymousClass1.L$1 = null;
        anonymousClass1.label = 3;
        objOooO0oO = o00oo00o4.OooO0oO(payOrder, anonymousClass1);
        if (objOooO0oO == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (Boolean) objOooO0oO;
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
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final Object pay(@NotNull RechargeMenuToPayModel rechargeMenuToPayModel, @Nullable GooglePaySubscriptionModel googlePaySubscriptionModel, @NotNull Continuation<? super RechargeMenuPayResultModel> continuation) {
        C09351 c09351;
        RechargeMenuPayResultModel rechargeMenuPayResultModel;
        String strOooO0OO;
        String strOooO0OO2;
        if (continuation instanceof C09351) {
            c09351 = (C09351) continuation;
            int i = c09351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c09351.label = i - Integer.MIN_VALUE;
            } else {
                c09351 = new C09351(continuation);
            }
        } else {
            c09351 = new C09351(continuation);
        }
        Object obj = c09351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c09351.label;
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
            rechargeMenuPayResultModel2.setErrorCode(-103);
            rechargeMenuPayResultModel2.setSuccess(false);
            rechargeMenuPayResultModel2.setAcknowledged(false);
            rechargeMenuPayResultModel2.setSubscriptionId("");
            rechargeMenuPayResultModel2.setSubscriptionOrderId("");
            o00OO00O o00oo00o = this.googlePayManager;
            String orderid = rechargeMenuToPayModel.getOrderid();
            c09351.L$0 = googlePaySubscriptionModel;
            c09351.L$1 = rechargeMenuPayResultModel2;
            c09351.label = 1;
            Object objOooO0o = o00oo00o.OooO0o(orderid, rechargeMenuToPayModel, googlePaySubscriptionModel, c09351);
            if (objOooO0o == coroutine_suspended) {
                return coroutine_suspended;
            }
            obj = objOooO0o;
            rechargeMenuPayResultModel = rechargeMenuPayResultModel2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rechargeMenuPayResultModel = (RechargeMenuPayResultModel) c09351.L$1;
            googlePaySubscriptionModel = (GooglePaySubscriptionModel) c09351.L$0;
            ResultKt.throwOnFailure(obj);
        }
        o00OOO0O o00ooo0o = (o00OOO0O) obj;
        OooOOO0.OooO0O0("WRM Pay BuyResult = ".concat(OooOO0.OooO00o(o00ooo0o)));
        T t = o00ooo0o.f45913OooO00o;
        if (((RechargeMenuPayBuyResultModel) t) == null) {
            rechargeMenuPayResultModel.setSuccess(false);
            o00OOO00 o00ooo01 = o00ooo0o.f45914OooO0O0;
            if (o00ooo01 == null || (strOooO0OO2 = o00ooo01.f45912OooO0O0) == null) {
                strOooO0OO2 = o0000.OooO0OO(oO00OOo0.Pay_Params_Is_Null);
            }
            rechargeMenuPayResultModel.setErrorMessage(strOooO0OO2);
            o00OOO00 o00ooo02 = o00ooo0o.f45914OooO0O0;
            rechargeMenuPayResultModel.setErrorCode(o00ooo02 != null ? o00ooo02.f45911OooO00o : -113);
            rechargeMenuPayResultModel.setPurchasetoken("");
            rechargeMenuPayResultModel.setAccountFlag(0);
            return rechargeMenuPayResultModel;
        }
        if (googlePaySubscriptionModel == null || googlePaySubscriptionModel.f23409OooO0OO != GooglePaySubscriptionModel.Action.Downgrade) {
            RechargeMenuPayBuyResultModel rechargeMenuPayBuyResultModel = (RechargeMenuPayBuyResultModel) t;
            String purchaseToken = rechargeMenuPayBuyResultModel != null ? rechargeMenuPayBuyResultModel.getPurchaseToken() : null;
            if (purchaseToken == null || StringsKt.isBlank(purchaseToken)) {
                rechargeMenuPayResultModel.setSuccess(false);
                o00OOO00 o00ooo03 = o00ooo0o.f45914OooO0O0;
                if (o00ooo03 == null || (strOooO0OO = o00ooo03.f45912OooO0O0) == null) {
                    strOooO0OO = o0000.OooO0OO(oO00OOo0.Pay_Unknown_Error);
                }
                rechargeMenuPayResultModel.setErrorMessage(strOooO0OO);
                o00OOO00 o00ooo04 = o00ooo0o.f45914OooO0O0;
                rechargeMenuPayResultModel.setErrorCode(o00ooo04 != null ? o00ooo04.f45911OooO00o : -103);
            } else {
                rechargeMenuPayResultModel.setSuccess(true);
                T t2 = o00ooo0o.f45913OooO00o;
                Intrinsics.checkNotNull(t2);
                rechargeMenuPayResultModel.setPurchasetoken(((RechargeMenuPayBuyResultModel) t2).getPurchaseToken());
                T t3 = o00ooo0o.f45913OooO00o;
                Intrinsics.checkNotNull(t3);
                rechargeMenuPayResultModel.setPurchaseState(((RechargeMenuPayBuyResultModel) t3).getPurchaseState());
                T t4 = o00ooo0o.f45913OooO00o;
                Intrinsics.checkNotNull(t4);
                rechargeMenuPayResultModel.setAcknowledged(((RechargeMenuPayBuyResultModel) t4).getIsAcknowledged());
            }
        } else {
            rechargeMenuPayResultModel.setSuccess(true);
            T t5 = o00ooo0o.f45913OooO00o;
            Intrinsics.checkNotNull(t5);
            rechargeMenuPayResultModel.setPurchasetoken(((RechargeMenuPayBuyResultModel) t5).getPurchaseToken());
            T t6 = o00ooo0o.f45913OooO00o;
            Intrinsics.checkNotNull(t6);
            rechargeMenuPayResultModel.setPurchaseState(((RechargeMenuPayBuyResultModel) t6).getPurchaseState());
            T t7 = o00ooo0o.f45913OooO00o;
            Intrinsics.checkNotNull(t7);
            rechargeMenuPayResultModel.setAcknowledged(((RechargeMenuPayBuyResultModel) t7).getIsAcknowledged());
        }
        return rechargeMenuPayResultModel;
    }

    @Nullable
    public final Object purchaseHistory(int i, boolean z, @NotNull Continuation<? super o00OOO0O<Object>> continuation) {
        return new o00OOO0O(null, null);
    }

    @Nullable
    public final Object queryDetails(@NotNull List<String> list, int i, boolean z, @NotNull Continuation<? super o00OOO0O<List<o00OO>>> continuation) {
        return this.googlePayManager.OooO(list, z, continuation);
    }

    @Nullable
    public final Object queryPurchases(int i, boolean z, @NotNull Continuation<? super List<PayOrder>> continuation) {
        return this.googlePayManager.OooOO0(z, continuation);
    }

    @Nullable
    public final Object toSubscriptionManagerPage(int i, @Nullable String str, @NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(false);
    }
}
