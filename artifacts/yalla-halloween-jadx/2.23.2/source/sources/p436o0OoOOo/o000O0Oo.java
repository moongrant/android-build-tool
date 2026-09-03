package p436o0OoOOo;

import android.os.Looper;
import androidx.activity.OooOo00;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o000O00O;
import com.code.android.util.o000Oo0;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.model.RechargeMenuPayResultModel;
import com.yalla.yalla.model.RechargeMenuToPayModel;
import com.yalla.yalla.ui.vm.WalletCoinVM;
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
@DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickUI$toPay$1", f = "GooglePayQuickUI.kt", i = {}, l = {260, 264}, m = "invokeSuspend", n = {}, s = {})
public final class o000O0Oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f47067OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RechargeMenuToPayModel f47068OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o0000 f47069OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickUI$toPay$1$1", f = "GooglePayQuickUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuPayResultModel f47070OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o0000 f47071OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RechargeMenuPayResultModel rechargeMenuPayResultModel, o0000 o0000Var, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f47070OooO0Oo = rechargeMenuPayResultModel;
            this.f47071OooO0o0 = o0000Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f47070OooO0Oo, this.f47071OooO0o0, continuation);
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
            RechargeMenuPayResultModel rechargeMenuPayResultModel = this.f47070OooO0Oo;
            boolean isSuccess = rechargeMenuPayResultModel.getIsSuccess();
            boolean z = true;
            o0000 o0000Var = this.f47071OooO0o0;
            if (isSuccess) {
                o0000O00.OooO0O0("确认订单和消单 orderid:" + rechargeMenuPayResultModel.getOrderid() + " purchaseToken: " + rechargeMenuPayResultModel.getPurchasetoken());
                o0000.OooO0oO(o0000Var, o0000Var.f47023OooO00o.getString(o000000.Validating_your_purchase), 2);
                PayOrder payOrder = new PayOrder();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                payOrder.setUserId(((Number) com.yalla.yalla.common.manager.OooO00o.OooO00o()).longValue());
                payOrder.setConsume(false);
                payOrder.setNewOrder(true);
                payOrder.setType(rechargeMenuPayResultModel.getType());
                payOrder.setOrderId(rechargeMenuPayResultModel.getOrderid());
                payOrder.setSku(rechargeMenuPayResultModel.getSku());
                payOrder.setPurchaseToken(rechargeMenuPayResultModel.getPurchasetoken());
                payOrder.setHuaWeiAccountFlag(rechargeMenuPayResultModel.getAccountFlag());
                payOrder.setCreateTime(System.currentTimeMillis());
                o0000Var.OooO0o0().saveOrderToDB(payOrder);
                o0000.OooO0OO(payOrder, o0000Var);
            } else {
                o0000Var.f47033OooOO0o = false;
                o0000O00.OooO("支付失败 " + rechargeMenuPayResultModel.getErrorCode() + ZegoConstants.ZegoVideoDataAuxPublishingStream + rechargeMenuPayResultModel.getErrorMessage());
                PayOrder payOrder2 = new PayOrder();
                payOrder2.setOrderId(rechargeMenuPayResultModel.getOrderid());
                payOrder2.setSku(rechargeMenuPayResultModel.getSku());
                payOrder2.setType(rechargeMenuPayResultModel.getType());
                ((WalletCoinVM) o0000Var.f47030OooO0oo.getValue()).onBuyErrorUploadLog(payOrder2);
                if (rechargeMenuPayResultModel.getType() == PaySupportChannels.pay_type_googlePay.getNum()) {
                    int errorCode = rechargeMenuPayResultModel.getErrorCode();
                    FragmentActivity fragmentActivity = o0000Var.f47023OooO00o;
                    if (errorCode == -103) {
                        String string = fragmentActivity.getString(o000000.google_play_useless);
                        if (string != null && !StringsKt.isBlank(string)) {
                            z = false;
                        }
                        if (!z) {
                            o000Oo0 o000oo0OooO00o = OooOo00.OooO00o(string, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                    } else if (errorCode == -101) {
                        String string2 = fragmentActivity.getString(o000000.google_play_useless);
                        if (string2 != null && !StringsKt.isBlank(string2)) {
                            z = false;
                        }
                        if (!z) {
                            o000Oo0 o000oo0OooO00o2 = OooOo00.OooO00o(string2, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o2.run();
                            } else {
                                o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o000O0Oo(o0000 o0000Var, RechargeMenuToPayModel rechargeMenuToPayModel, Continuation<? super o000O0Oo> continuation) {
        super(2, continuation);
        this.f47069OooO0o0 = o0000Var;
        this.f47068OooO0o = rechargeMenuToPayModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o000O0Oo(this.f47069OooO0o0, this.f47068OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o000O0Oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f47067OooO0Oo;
        o0000 o0000Var = this.f47069OooO0o0;
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
        PayManager payManager = (PayManager) o0000Var.f47022OooO.getValue();
        RechargeMenuToPayModel rechargeMenuToPayModel = this.f47068OooO0o;
        this.f47067OooO0Oo = 1;
        obj = PayManager.pay$default(payManager, rechargeMenuToPayModel, null, this, 2, null);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        RechargeMenuPayResultModel rechargeMenuPayResultModel = (RechargeMenuPayResultModel) obj;
        RechargeMenuToPayModel rechargeMenuToPayModel2 = this.f47068OooO0o;
        rechargeMenuPayResultModel.setType(rechargeMenuToPayModel2.getType());
        rechargeMenuPayResultModel.setOrderid(rechargeMenuToPayModel2.getOrderid());
        rechargeMenuPayResultModel.setSku(rechargeMenuToPayModel2.getSku());
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o(rechargeMenuPayResultModel, o0000Var, null);
        this.f47067OooO0Oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
