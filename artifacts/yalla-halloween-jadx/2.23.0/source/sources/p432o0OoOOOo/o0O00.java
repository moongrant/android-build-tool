package p432o0OoOOOo;

import android.os.Looper;
import androidx.compose.ui.graphics.colorspace.OooO0OO;
import androidx.fragment.app.FragmentActivity;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
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
import p464o0Oooo.o000000O;
import p584o0oOooO0.oO00OOo0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickUI$toPay$1", f = "GooglePayQuickUI.kt", i = {}, l = {260, 264}, m = "invokeSuspend", n = {}, s = {})
public final class o0O00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public int f45941OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ RechargeMenuToPayModel f45942OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ o00OOOOo f45943OooO0o0;

    @DebugMetadata(c = "com.yalla.yalla.manager.unBlur.googlepay.quick.GooglePayQuickUI$toPay$1$1", f = "GooglePayQuickUI.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuPayResultModel f45944OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ o00OOOOo f45945OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(RechargeMenuPayResultModel rechargeMenuPayResultModel, o00OOOOo o00ooooo2, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f45944OooO0Oo = rechargeMenuPayResultModel;
            this.f45945OooO0o0 = o00ooooo2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO00o(this.f45944OooO0Oo, this.f45945OooO0o0, continuation);
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
            RechargeMenuPayResultModel rechargeMenuPayResultModel = this.f45944OooO0Oo;
            boolean isSuccess = rechargeMenuPayResultModel.getIsSuccess();
            boolean z = true;
            o00OOOOo o00ooooo2 = this.f45945OooO0o0;
            if (isSuccess) {
                OooOOO0.OooO0O0("确认订单和消单 orderid:" + rechargeMenuPayResultModel.getOrderid() + " purchaseToken: " + rechargeMenuPayResultModel.getPurchasetoken());
                o00OOOOo.OooO0oO(o00ooooo2, o00ooooo2.f45920OooO00o.getString(oO00OOo0.Validating_your_purchase), 2);
                PayOrder payOrder = new PayOrder();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                payOrder.setUserId(((Number) OooO0OO.OooO0O0()).longValue());
                payOrder.setConsume(false);
                payOrder.setNewOrder(true);
                payOrder.setType(rechargeMenuPayResultModel.getType());
                payOrder.setOrderId(rechargeMenuPayResultModel.getOrderid());
                payOrder.setSku(rechargeMenuPayResultModel.getSku());
                payOrder.setPurchaseToken(rechargeMenuPayResultModel.getPurchasetoken());
                payOrder.setHuaWeiAccountFlag(rechargeMenuPayResultModel.getAccountFlag());
                payOrder.setCreateTime(System.currentTimeMillis());
                o00ooooo2.OooO0o0().saveOrderToDB(payOrder);
                o00OOOOo.OooO0OO(payOrder, o00ooooo2);
            } else {
                o00ooooo2.f45930OooOO0o = false;
                OooOOO0.OooO("支付失败 " + rechargeMenuPayResultModel.getErrorCode() + ZegoConstants.ZegoVideoDataAuxPublishingStream + rechargeMenuPayResultModel.getErrorMessage());
                PayOrder payOrder2 = new PayOrder();
                payOrder2.setOrderId(rechargeMenuPayResultModel.getOrderid());
                payOrder2.setSku(rechargeMenuPayResultModel.getSku());
                payOrder2.setType(rechargeMenuPayResultModel.getType());
                ((WalletCoinVM) o00ooooo2.f45927OooO0oo.getValue()).onBuyErrorUploadLog(payOrder2);
                if (rechargeMenuPayResultModel.getType() == PaySupportChannels.pay_type_googlePay.getNum()) {
                    int errorCode = rechargeMenuPayResultModel.getErrorCode();
                    FragmentActivity fragmentActivity = o00ooooo2.f45920OooO00o;
                    if (errorCode == -103) {
                        String string = fragmentActivity.getString(oO00OOo0.google_play_useless);
                        if (string != null && !StringsKt.isBlank(string)) {
                            z = false;
                        }
                        if (!z) {
                            o000Oo0 o000oo0OooO00o = o000O00.OooO00o(string, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o.run();
                            } else {
                                o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                            }
                        }
                    } else if (errorCode == -101) {
                        String string2 = fragmentActivity.getString(oO00OOo0.google_play_useless);
                        if (string2 != null && !StringsKt.isBlank(string2)) {
                            z = false;
                        }
                        if (!z) {
                            o000Oo0 o000oo0OooO00o2 = o000O00.OooO00o(string2, "runnable");
                            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                o000oo0OooO00o2.run();
                            } else {
                                o000O0.f10355OooO0O0.post(o000oo0OooO00o2);
                            }
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0O00(o00OOOOo o00ooooo2, RechargeMenuToPayModel rechargeMenuToPayModel, Continuation<? super o0O00> continuation) {
        super(2, continuation);
        this.f45943OooO0o0 = o00ooooo2;
        this.f45942OooO0o = rechargeMenuToPayModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new o0O00(this.f45943OooO0o0, this.f45942OooO0o, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((o0O00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.f45941OooO0Oo;
        o00OOOOo o00ooooo2 = this.f45943OooO0o0;
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
        PayManager payManager = (PayManager) o00ooooo2.f45919OooO.getValue();
        RechargeMenuToPayModel rechargeMenuToPayModel = this.f45942OooO0o;
        this.f45941OooO0Oo = 1;
        obj = PayManager.pay$default(payManager, rechargeMenuToPayModel, null, this, 2, null);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        RechargeMenuPayResultModel rechargeMenuPayResultModel = (RechargeMenuPayResultModel) obj;
        RechargeMenuToPayModel rechargeMenuToPayModel2 = this.f45942OooO0o;
        rechargeMenuPayResultModel.setType(rechargeMenuToPayModel2.getType());
        rechargeMenuPayResultModel.setOrderid(rechargeMenuToPayModel2.getOrderid());
        rechargeMenuPayResultModel.setSku(rechargeMenuToPayModel2.getSku());
        MainCoroutineDispatcher main = Dispatchers.getMain();
        OooO00o oooO00o = new OooO00o(rechargeMenuPayResultModel, o00ooooo2, null);
        this.f45941OooO0Oo = 2;
        if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
