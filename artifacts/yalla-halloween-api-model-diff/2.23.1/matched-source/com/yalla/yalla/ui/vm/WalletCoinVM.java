package com.yalla.yalla.ui.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AFInAppEventType;
import com.code.android.util.o00oO0o;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.data.db.model.NewFriendsOld;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.GoldModel;
import com.yalla.yalla.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.model.RechargeMenuModel;
import com.yalla.yalla.model.RechargeMenuType;
import com.yalla.yalla.model.VipCreateOrderResultModel;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.repository.WalletRepo;
import com.yalla.yalla.repository.WalletRepo$userBill$$inlined$call$1;
import com.yalla.yalla.util.PaySupportChannels;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p382o0OOoOo.o0ooOOo;
import p382o0OOoOo.oo000o;
import p392o0OOooo.o00000;
import p410o0Oo0Oo0.o00O0O;
import p439o0OoOOo0.o00;
import p474o0OoooOO.oo0oO0;
import p587o0oOooO.oO000OOo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\t2\u0006\u0010\u000e\u001a\u00020\rJ\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\t2\u0006\u0010\u000e\u001a\u00020\u0011J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0011J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0011J1\u0010%\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u00062\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"¢\u0006\u0004\b%\u0010&JD\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\n0\t2\b\b\u0002\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006J(\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\"0\n0\t2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006R\u001f\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00158\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/yalla/yalla/ui/vm/WalletCoinVM;", "Lo0Oo0/OooOO0;", "Lcom/yalla/yalla/model/CountryModel;", "getUserCountry", "", "type", "", "getPayTypeName", "countryId", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/model/http/ApiResult;", "Lcom/yalla/yalla/model/RechargeMenuModel;", "loadRechargeMenu", "Lcom/yalla/yalla/model/RechargeMenuCreateOrderModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/yalla/yalla/model/RechargeMenuCreateOrderResultModel;", "createOrder", "Lcom/yalla/yalla/data/db/table/PayOrder;", "Lcom/yalla/yalla/model/RechargeMenuConfirmOrderResultModel;", "confirmRechargeOrder", "payOrder", "Landroidx/lifecycle/MutableLiveData;", "", "saveOrderToDB", "", "updateOrderToDB", "orderId", "deleteOrderToDB", "onBuyErrorUploadLog", "onConsumptionErrorUploadLog", "onConfirmOrderErrorUploadLog", "", "amount", "sku", "", "Lcom/yalla/yalla/model/RechargeMenuType;", "list", "onConfirmOrderSuccessUploadLog", "(Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V", "isSubscriptionForFirst", "shopId", "payModelType", "currency", "Lcom/yalla/yalla/model/VipCreateOrderResultModel;", "createOrderSubscribe", "pageIndex", "Lcom/yalla/yalla/model/GoldModel;", "userBill", "area", "Landroidx/lifecycle/MutableLiveData;", "getArea", "()Landroidx/lifecycle/MutableLiveData;", "Lo0OoOOo0/o00;", "payLogUpload", "Lo0OoOOo0/o00;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class WalletCoinVM extends p396o0Oo0.OooOO0 {
    public static final int $stable = 8;

    @NotNull
    private final MutableLiveData<CountryModel> area = new MutableLiveData<>(getUserCountry());

    @NotNull
    private final o00 payLogUpload = new o00();

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.WalletCoinVM$loadRechargeMenu$1", f = "WalletCoinVM.kt", i = {0, 1}, l = {37, 39, 41}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync"}, s = {"L$0", "L$0"})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RechargeMenuModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30985OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f30986OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30987OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f30986OooO0o = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f30986OooO0o, continuation);
            oooO.f30987OooO0o0 = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RechargeMenuModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x006c A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30985OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.f30987OooO0o0;
                if (oO000OOo.f56671OooO00o.OooO0OO()) {
                    WalletRepo walletRepo = WalletRepo.f24384OooO00o;
                    this.f30987OooO0o0 = liveDataScope;
                    this.f30985OooO0Oo = 1;
                    walletRepo.getClass();
                    obj = WalletRepo.OooOOO(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) obj;
                    this.f30987OooO0o0 = null;
                    this.f30985OooO0Oo = 3;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    WalletRepo walletRepo2 = WalletRepo.f24384OooO00o;
                    this.f30987OooO0o0 = liveDataScope;
                    this.f30985OooO0Oo = 2;
                    obj = walletRepo2.OooOOO0(this.f30986OooO0o, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) obj;
                    this.f30987OooO0o0 = null;
                    this.f30985OooO0Oo = 3;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                liveDataScope = (LiveDataScope) this.f30987OooO0o0;
                ResultKt.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                this.f30987OooO0o0 = null;
                this.f30985OooO0Oo = 3;
                if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 2) {
                liveDataScope = (LiveDataScope) this.f30987OooO0o0;
                ResultKt.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                this.f30987OooO0o0 = null;
                this.f30985OooO0Oo = 3;
                if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.WalletCoinVM$confirmRechargeOrder$1", f = "WalletCoinVM.kt", i = {}, l = {73, 73}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RechargeMenuConfirmOrderResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30988OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PayOrder f30989OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30990OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PayOrder payOrder, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f30989OooO0o = payOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f30989OooO0o, continuation);
            oooO00o.f30990OooO0o0 = obj;
            return oooO00o;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RechargeMenuConfirmOrderResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO00o) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30988OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f30990OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f30990OooO0o0;
            WalletRepo walletRepo = WalletRepo.f24384OooO00o;
            this.f30990OooO0o0 = liveDataScope;
            this.f30988OooO0Oo = 1;
            obj = walletRepo.OooO00o(this.f30989OooO0o, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f30990OooO0o0 = null;
            this.f30988OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.WalletCoinVM$createOrder$1", f = "WalletCoinVM.kt", i = {}, l = {51, 54, 57, 60, 63, 48}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RechargeMenuCreateOrderResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30991OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuCreateOrderModel f30992OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30993OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f30992OooO0o = rechargeMenuCreateOrderModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f30992OooO0o, continuation);
            oooO0O0.f30993OooO0o0 = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RechargeMenuCreateOrderResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00ce A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f30991OooO0Oo) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    liveDataScope = (LiveDataScope) this.f30993OooO0o0;
                    RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = this.f30992OooO0o;
                    int type = rechargeMenuCreateOrderModel.getType();
                    if (type == PaySupportChannels.pay_type_googlePay.getNum()) {
                        WalletRepo walletRepo = WalletRepo.f24384OooO00o;
                        this.f30993OooO0o0 = liveDataScope;
                        this.f30991OooO0Oo = 1;
                        obj = walletRepo.OooO0oo(rechargeMenuCreateOrderModel, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) obj;
                        this.f30993OooO0o0 = null;
                        this.f30991OooO0Oo = 6;
                        if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (type == PaySupportChannels.pay_type_payssionPay.getNum()) {
                        WalletRepo walletRepo2 = WalletRepo.f24384OooO00o;
                        this.f30993OooO0o0 = liveDataScope;
                        this.f30991OooO0Oo = 2;
                        obj = walletRepo2.OooOO0(rechargeMenuCreateOrderModel, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) obj;
                        this.f30993OooO0o0 = null;
                        this.f30991OooO0Oo = 6;
                        if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (type == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                        WalletRepo walletRepo3 = WalletRepo.f24384OooO00o;
                        this.f30993OooO0o0 = liveDataScope;
                        this.f30991OooO0Oo = 3;
                        obj = walletRepo3.OooO(rechargeMenuCreateOrderModel, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) obj;
                        this.f30993OooO0o0 = null;
                        this.f30991OooO0Oo = 6;
                        if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (type == PaySupportChannels.pay_type_tapPay.getNum()) {
                        WalletRepo walletRepo4 = WalletRepo.f24384OooO00o;
                        this.f30993OooO0o0 = liveDataScope;
                        this.f30991OooO0Oo = 4;
                        obj = walletRepo4.OooOO0O(rechargeMenuCreateOrderModel, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) obj;
                        this.f30993OooO0o0 = null;
                        this.f30991OooO0Oo = 6;
                        if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WalletRepo walletRepo5 = WalletRepo.f24384OooO00o;
                    this.f30993OooO0o0 = liveDataScope;
                    this.f30991OooO0Oo = 5;
                    obj = walletRepo5.OooO0oo(rechargeMenuCreateOrderModel, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) obj;
                    this.f30993OooO0o0 = null;
                    this.f30991OooO0Oo = 6;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    liveDataScope = (LiveDataScope) this.f30993OooO0o0;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    this.f30993OooO0o0 = null;
                    this.f30991OooO0Oo = 6;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    liveDataScope = (LiveDataScope) this.f30993OooO0o0;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    this.f30993OooO0o0 = null;
                    this.f30991OooO0Oo = 6;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 3:
                    liveDataScope = (LiveDataScope) this.f30993OooO0o0;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    this.f30993OooO0o0 = null;
                    this.f30991OooO0Oo = 6;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 4:
                    liveDataScope = (LiveDataScope) this.f30993OooO0o0;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    this.f30993OooO0o0 = null;
                    this.f30991OooO0Oo = 6;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 5:
                    liveDataScope = (LiveDataScope) this.f30993OooO0o0;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    this.f30993OooO0o0 = null;
                    this.f30991OooO0Oo = 6;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.WalletCoinVM$createOrderSubscribe$1", f = "WalletCoinVM.kt", i = {}, l = {191, 191}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<VipCreateOrderResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ int f30994OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f30995OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ boolean f30996OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f30997OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f30998OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public final /* synthetic */ double f30999OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ String f31000OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ String f31001OooOO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, String str, double d, int i, String str2, String str3, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f30996OooO0o = z;
            this.f30998OooO0oO = str;
            this.f30999OooO0oo = d;
            this.f30994OooO = i;
            this.f31000OooOO0 = str2;
            this.f31001OooOO0O = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f30996OooO0o, this.f30998OooO0oO, this.f30999OooO0oo, this.f30994OooO, this.f31000OooOO0, this.f31001OooOO0O, continuation);
            oooO0OO.f30997OooO0o0 = obj;
            return oooO0OO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<VipCreateOrderResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0OO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f30995OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f30997OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f30997OooO0o0;
            int i2 = !this.f30996OooO0o ? 1 : 0;
            WalletRepo walletRepo = WalletRepo.f24384OooO00o;
            String str = this.f30998OooO0oO;
            double d = this.f30999OooO0oo;
            int i3 = this.f30994OooO;
            String str2 = this.f31000OooOO0;
            String str3 = this.f31001OooOO0O;
            this.f30997OooO0o0 = liveDataScope;
            this.f30995OooO0Oo = 1;
            obj = walletRepo.OooO0oO(i2, str, d, i3, str2, str3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f30997OooO0o0 = null;
            this.f30995OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.WalletCoinVM$deleteOrderToDB$1", f = "WalletCoinVM.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31002OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ String f31003OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f31003OooO0o0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f31003OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31002OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WalletRepo walletRepo = WalletRepo.f24384OooO00o;
                this.f31002OooO0Oo = 1;
                walletRepo.getClass();
                if (WalletRepo.OooOO0o(this.f31003OooO0o0) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.WalletCoinVM$onBuyErrorUploadLog$1", f = "WalletCoinVM.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31004OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ WalletCoinVM f31005OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f31006OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(PayOrder payOrder, WalletCoinVM walletCoinVM, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f31006OooO0o0 = payOrder;
            this.f31005OooO0o = walletCoinVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f31006OooO0o0, this.f31005OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31004OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WalletRepo walletRepo = WalletRepo.f24384OooO00o;
                PayOrder payOrder = this.f31006OooO0o0;
                String orderId = payOrder.getOrderId();
                String sku = payOrder.getSku();
                String payTypeName = this.f31005OooO0o.getPayTypeName(payOrder.getType());
                this.f31004OooO0Oo = 1;
                if (walletRepo.OooOOOO(orderId, sku, payTypeName, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.WalletCoinVM$onConfirmOrderErrorUploadLog$1", f = "WalletCoinVM.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31007OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ WalletCoinVM f31008OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f31009OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(PayOrder payOrder, WalletCoinVM walletCoinVM, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f31009OooO0o0 = payOrder;
            this.f31008OooO0o = walletCoinVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f31009OooO0o0, this.f31008OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31007OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WalletRepo walletRepo = WalletRepo.f24384OooO00o;
                PayOrder payOrder = this.f31009OooO0o0;
                String orderId = payOrder.getOrderId();
                String sku = payOrder.getSku();
                String payTypeName = this.f31008OooO0o.getPayTypeName(payOrder.getType());
                int errorCode = payOrder.getErrorCode();
                this.f31007OooO0Oo = 1;
                if (walletRepo.OooOOOo(orderId, sku, payTypeName, errorCode, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.WalletCoinVM$onConsumptionErrorUploadLog$1", f = "WalletCoinVM.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31010OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ WalletCoinVM f31011OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f31012OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(PayOrder payOrder, WalletCoinVM walletCoinVM, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f31012OooO0o0 = payOrder;
            this.f31011OooO0o = walletCoinVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f31012OooO0o0, this.f31011OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31010OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WalletRepo walletRepo = WalletRepo.f24384OooO00o;
                PayOrder payOrder = this.f31012OooO0o0;
                String orderId = payOrder.getOrderId();
                String sku = payOrder.getSku();
                String payTypeName = this.f31011OooO0o.getPayTypeName(payOrder.getType());
                this.f31010OooO0Oo = 1;
                if (walletRepo.OooOOo0(orderId, sku, payTypeName, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.WalletCoinVM$onConfirmOrderSuccessUploadLog$1", f = "WalletCoinVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31014OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ Double f31015OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ List<RechargeMenuType> f31016OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Double d, String str, List<RechargeMenuType> list, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f31015OooO0o0 = d;
            this.f31014OooO0o = str;
            this.f31016OooO0oO = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WalletCoinVM.this.new OooOOO0(this.f31015OooO0o0, this.f31014OooO0o, this.f31016OooO0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x003a  */
        /* JADX WARN: Code duplicated, block: B:20:0x003f A[Catch: Exception -> 0x0055, TRY_ENTER, TryCatch #1 {Exception -> 0x0055, blocks: (B:13:0x0031, B:20:0x003f, B:24:0x0059, B:25:0x005d, B:27:0x0063, B:29:0x006f), top: B:66:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:23:0x0057 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:24:0x0059 A[Catch: Exception -> 0x0055, TryCatch #1 {Exception -> 0x0055, blocks: (B:13:0x0031, B:20:0x003f, B:24:0x0059, B:25:0x005d, B:27:0x0063, B:29:0x006f), top: B:66:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0063 A[Catch: Exception -> 0x0055, TryCatch #1 {Exception -> 0x0055, blocks: (B:13:0x0031, B:20:0x003f, B:24:0x0059, B:25:0x005d, B:27:0x0063, B:29:0x006f), top: B:66:0x0031 }] */
        /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
        /* JADX WARN: Code duplicated, block: B:48:0x00b5 A[Catch: Exception -> 0x00f1, TRY_ENTER, TryCatch #2 {Exception -> 0x00f1, blocks: (B:43:0x00a0, B:48:0x00b5, B:52:0x00f5, B:53:0x00f9, B:55:0x00ff, B:57:0x010b), top: B:67:0x00a0 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x00f3 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:52:0x00f5 A[Catch: Exception -> 0x00f1, TryCatch #2 {Exception -> 0x00f1, blocks: (B:43:0x00a0, B:48:0x00b5, B:52:0x00f5, B:53:0x00f9, B:55:0x00ff, B:57:0x010b), top: B:67:0x00a0 }] */
        /* JADX WARN: Code duplicated, block: B:55:0x00ff A[Catch: Exception -> 0x00f1, TryCatch #2 {Exception -> 0x00f1, blocks: (B:43:0x00a0, B:48:0x00b5, B:52:0x00f5, B:53:0x00f9, B:55:0x00ff, B:57:0x010b), top: B:67:0x00a0 }] */
        /* JADX WARN: Code duplicated, block: B:71:0x006f A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:73:0x005d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:76:0x010b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:78:0x00f9 A[SYNTHETIC] */
        /* JADX WARN: Instruction removed from duplicated block: B:48:0x00b5, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String string;
            boolean z;
            boolean z2;
            Lazy lazy;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            o00 o00Var = WalletCoinVM.this.payLogUpload;
            o00Var.getClass();
            String str = "";
            Double d = this.f31015OooO0o0;
            String str2 = null;
            if (d != null) {
                Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
                try {
                    string = d.toString();
                    if (string == null) {
                        string = "";
                    }
                } catch (Exception unused) {
                }
            } else {
                string = null;
            }
            String str3 = this.f31014OooO0o;
            List<RechargeMenuType> list = this.f31016OooO0oO;
            if (str3 != null) {
                if (string != null) {
                    try {
                        if (StringsKt.isBlank(string)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        lazy = o00Var.f47082OooO00o;
                        if (!z2) {
                            ((AppEventsLogger) lazy.getValue()).logPurchase(BigDecimal.valueOf(p595o0oo0.OooOo00.OooOO0(string)), Currency.getInstance("USD"));
                        } else if (list != null) {
                            for (RechargeMenuType rechargeMenuType : list) {
                                if (str3 == rechargeMenuType.getSku()) {
                                    ((AppEventsLogger) lazy.getValue()).logPurchase(BigDecimal.valueOf(rechargeMenuType.getAmount()), Currency.getInstance("USD"));
                                }
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                } else {
                    z2 = true;
                    lazy = o00Var.f47082OooO00o;
                    if (!z2) {
                        ((AppEventsLogger) lazy.getValue()).logPurchase(BigDecimal.valueOf(p595o0oo0.OooOo00.OooOO0(string)), Currency.getInstance("USD"));
                    } else if (list != null) {
                        while (r4.hasNext()) {
                            if (str3 == rechargeMenuType.getSku()) {
                                ((AppEventsLogger) lazy.getValue()).logPurchase(BigDecimal.valueOf(rechargeMenuType.getAmount()), Currency.getInstance("USD"));
                            }
                        }
                    }
                }
            }
            if (d != null) {
                Intrinsics.checkNotNullParameter("", NewFriendsOld.State_Default);
                try {
                    String string2 = d.toString();
                    if (string2 != null) {
                        str = string2;
                    }
                } catch (Exception unused2) {
                }
                str2 = str;
            }
            if (str3 != null) {
                if (str2 != null) {
                    try {
                        z = StringsKt.isBlank(str2);
                        if (!z) {
                            p597o0oo00O.OooOOOO.OooO0O0("GooglePlayPay amount =" + str2 + "===" + p595o0oo0.OooOo00.OooOO0(str2) + "===" + str3);
                            HashMap map = new HashMap();
                            map.put(AFInAppEventParameterName.REVENUE, Double.valueOf(p595o0oo0.OooOo00.OooOO0(str2)));
                            map.put(AFInAppEventParameterName.CONTENT_TYPE, "category_a");
                            map.put(AFInAppEventParameterName.CONTENT_ID, str3);
                            map.put(AFInAppEventParameterName.CURRENCY, "USD");
                            o00000.OooO00o(AFInAppEventType.PURCHASE, map);
                        } else if (list != null) {
                            for (RechargeMenuType rechargeMenuType2 : list) {
                                if (str3 == rechargeMenuType2.getSku()) {
                                    HashMap map2 = new HashMap();
                                    map2.put(AFInAppEventParameterName.REVENUE, Double.valueOf(rechargeMenuType2.getAmount()));
                                    map2.put(AFInAppEventParameterName.CONTENT_TYPE, "category_a");
                                    map2.put(AFInAppEventParameterName.CONTENT_ID, rechargeMenuType2.getSku());
                                    map2.put(AFInAppEventParameterName.CURRENCY, "USD");
                                    o00000.OooO00o(AFInAppEventType.PURCHASE, map2);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                } else if (!z) {
                    p597o0oo00O.OooOOOO.OooO0O0("GooglePlayPay amount =" + str2 + "===" + p595o0oo0.OooOo00.OooOO0(str2) + "===" + str3);
                    HashMap map3 = new HashMap();
                    map3.put(AFInAppEventParameterName.REVENUE, Double.valueOf(p595o0oo0.OooOo00.OooOO0(str2)));
                    map3.put(AFInAppEventParameterName.CONTENT_TYPE, "category_a");
                    map3.put(AFInAppEventParameterName.CONTENT_ID, str3);
                    map3.put(AFInAppEventParameterName.CURRENCY, "USD");
                    o00000.OooO00o(AFInAppEventType.PURCHASE, map3);
                } else if (list != null) {
                    while (r15.hasNext()) {
                        if (str3 == rechargeMenuType2.getSku()) {
                            HashMap map4 = new HashMap();
                            map4.put(AFInAppEventParameterName.REVENUE, Double.valueOf(rechargeMenuType2.getAmount()));
                            map4.put(AFInAppEventParameterName.CONTENT_TYPE, "category_a");
                            map4.put(AFInAppEventParameterName.CONTENT_ID, rechargeMenuType2.getSku());
                            map4.put(AFInAppEventParameterName.CURRENCY, "USD");
                            o00000.OooO00o(AFInAppEventType.PURCHASE, map4);
                        }
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.WalletCoinVM$saveOrderToDB$1", f = "WalletCoinVM.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31017OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Boolean> f31018OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f31019OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(PayOrder payOrder, MutableLiveData<Boolean> mutableLiveData, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f31019OooO0o0 = payOrder;
            this.f31018OooO0o = mutableLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f31019OooO0o0, this.f31018OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31017OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PayOrder payOrder = this.f31019OooO0o0;
                if (payOrder.getType() == PaySupportChannels.pay_type_googlePay.getNum() || payOrder.getType() == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                    WalletRepo walletRepo = WalletRepo.f24384OooO00o;
                    this.f31017OooO0Oo = 1;
                    walletRepo.getClass();
                    o00O0O.OooO00o().OooOoO().OooO0O0(payOrder);
                    if (Unit.INSTANCE == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f31018OooO0o.postValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.WalletCoinVM$userBill$1", f = "WalletCoinVM.kt", i = {}, l = {198, 198}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<GoldModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31020OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ String f31021OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public /* synthetic */ Object f31022OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public final /* synthetic */ String f31023OooO0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(String str, String str2, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f31021OooO0o = str;
            this.f31023OooO0oO = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOo oooOo = new OooOo(this.f31021OooO0o, this.f31023OooO0oO, continuation);
            oooOo.f31022OooO0o0 = obj;
            return oooOo;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<List<GoldModel>>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooOo) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31020OooO0Oo;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f31022OooO0o0;
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
            liveDataScope = (LiveDataScope) this.f31022OooO0o0;
            WalletRepo walletRepo = WalletRepo.f24384OooO00o;
            this.f31022OooO0o0 = liveDataScope;
            this.f31020OooO0Oo = 1;
            walletRepo.getClass();
            Intrinsics.checkNotNullParameter("/Webservers/Recharge/TransactionDetails", "<this>");
            String url = oo000o.OooO0o0(4, "/Webservers/Recharge/TransactionDetails");
            Intrinsics.checkNotNullParameter(url, "url");
            o0ooOOo o0ooooo = new o0ooOOo(url, 0);
            o0ooooo.OooO0O0(this.f31021OooO0o, "pageindex");
            o0ooooo.OooO0O0(this.f31023OooO0oO, "type");
            obj = com.code.android.util.OooOOO.OooO0Oo(new WalletRepo$userBill$$inlined$call$1(o0ooooo, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f31022OooO0o0 = null;
            this.f31020OooO0Oo = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.vm.WalletCoinVM$updateOrderToDB$1", f = "WalletCoinVM.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f31024OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f31025OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(PayOrder payOrder, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f31025OooO0o0 = payOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f31025OooO0o0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f31024OooO0Oo;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                PayOrder payOrder = this.f31025OooO0o0;
                if (payOrder.getType() == PaySupportChannels.pay_type_googlePay.getNum() || payOrder.getType() == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                    WalletRepo walletRepo = WalletRepo.f24384OooO00o;
                    this.f31024OooO0Oo = 1;
                    walletRepo.getClass();
                    if (WalletRepo.OooOOo(payOrder) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPayTypeName(int type) {
        if (type == PaySupportChannels.pay_type_googlePay.getNum()) {
            return "googlePay";
        }
        if (type == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
            return "huaWeiPay";
        }
        if (type == PaySupportChannels.pay_type_payssionPay.getNum()) {
            return "payssionPay";
        }
        return type == PaySupportChannels.pay_type_tapPay.getNum() ? "tapPay" : "googlePay";
    }

    private final CountryModel getUserCountry() {
        oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
        return com.yalla.yalla.app.golbalData.OooO00o.OooO00o(String.valueOf(oo0oO0.OooO0OO().getValue()));
    }

    public static /* synthetic */ LiveData loadRechargeMenu$default(WalletCoinVM walletCoinVM, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return walletCoinVM.loadRechargeMenu(str);
    }

    @NotNull
    public final LiveData<ApiResult<RechargeMenuConfirmOrderResultModel>> confirmRechargeOrder(@NotNull PayOrder model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return o00oO0o.OooO00o(new OooO00o(model, null));
    }

    @NotNull
    public final LiveData<ApiResult<RechargeMenuCreateOrderResultModel>> createOrder(@NotNull RechargeMenuCreateOrderModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return o00oO0o.OooO00o(new OooO0O0(model, null));
    }

    @NotNull
    public final LiveData<ApiResult<VipCreateOrderResultModel>> createOrderSubscribe(boolean isSubscriptionForFirst, @NotNull String shopId, double amount, int payModelType, @NotNull String sku, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(shopId, "shopId");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return o00oO0o.OooO00o(new OooO0OO(isSubscriptionForFirst, shopId, amount, payModelType, sku, currency, null));
    }

    public final void deleteOrderToDB(@NotNull String orderId) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooO0o(orderId, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<CountryModel> getArea() {
        return this.area;
    }

    @NotNull
    public final LiveData<ApiResult<RechargeMenuModel>> loadRechargeMenu(@Nullable String countryId) {
        return o00oO0o.OooO00o(new OooO(countryId, null));
    }

    public final void onBuyErrorUploadLog(@NotNull PayOrder model) {
        Intrinsics.checkNotNullParameter(model, "model");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new OooOO0(model, this, null), 3, null);
    }

    public final void onConfirmOrderErrorUploadLog(@NotNull PayOrder model) {
        Intrinsics.checkNotNullParameter(model, "model");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOO0O(model, this, null), 2, null);
    }

    public final void onConfirmOrderSuccessUploadLog(@Nullable Double amount, @Nullable String sku, @Nullable List<RechargeMenuType> list) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOOO0(amount, sku, list, null), 2, null);
    }

    public final void onConsumptionErrorUploadLog(@NotNull PayOrder model) {
        Intrinsics.checkNotNullParameter(model, "model");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOOO(model, this, null), 2, null);
    }

    @NotNull
    public final MutableLiveData<Boolean> saveOrderToDB(@NotNull PayOrder payOrder) {
        Intrinsics.checkNotNullParameter(payOrder, "payOrder");
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOOOO(payOrder, mutableLiveData, null), 2, null);
        return mutableLiveData;
    }

    public final void updateOrderToDB(@NotNull PayOrder payOrder) {
        Intrinsics.checkNotNullParameter(payOrder, "payOrder");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new OooOo00(payOrder, null), 2, null);
    }

    @NotNull
    public final LiveData<ApiResult<List<GoldModel>>> userBill(@NotNull String pageIndex, @NotNull String type) {
        Intrinsics.checkNotNullParameter(pageIndex, "pageIndex");
        Intrinsics.checkNotNullParameter(type, "type");
        return o00oO0o.OooO00o(new OooOo(pageIndex, type, null));
    }
}
