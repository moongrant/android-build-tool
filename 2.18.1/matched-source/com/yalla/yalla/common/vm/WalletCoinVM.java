package com.yalla.yalla.common.vm;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.app.base.app.appConfig.apiDataModela.ApiCountryUtils;
import com.app.base.model.CountryModel;
import com.app.base.model.GoldModel;
import com.app.base.model.VipCreateOrderResultModel;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.manager.googlepay.PayLogUpload;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.common.model.RechargeMenuModel;
import com.yalla.yalla.common.model.RechargeMenuType;
import com.yalla.yalla.common.repository.WalletRepo;
import com.yalla.yalla.common.repository.WalletRepo$loadShopListGoogle$$inlined$call$1;
import com.yalla.yalla.common.repository.WalletRepo$userBill$$inlined$call$1;
import com.yalla.yalla.common.util.PaySupportChannels;
import java.util.List;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o0000O0;
import p254o00ooO0O.o0000O0O;
import p486o0o000o0.o00000;
import p547o0o0o00O.o00O000o;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b7\u00108J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006J\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\n0\t2\u0006\u0010\u000e\u001a\u00020\rJ\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\n0\t2\u0006\u0010\u000e\u001a\u00020\u0011J\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u0011J\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0006J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0011J\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0011J\u000e\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u0011J1\u0010%\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010!\u001a\u0004\u0018\u00010\u00062\u000e\u0010$\u001a\n\u0012\u0004\u0012\u00020#\u0018\u00010\"¢\u0006\u0004\b%\u0010&JD\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0\n0\t2\b\b\u0002\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006J(\u0010/\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\"0\n0\t2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006R\u001f\u00100\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00158\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/yalla/yalla/common/vm/WalletCoinVM;", "Lo00OO/OooO00o;", "Lcom/app/base/model/CountryModel;", "getUserCountry", "", "type", "", "getPayTypeName", "countryId", "Landroidx/lifecycle/LiveData;", "Lcom/yalla/yalla/common/model/ApiResult;", "Lcom/yalla/yalla/common/model/RechargeMenuModel;", "loadRechargeMenu", "Lcom/yalla/yalla/common/model/RechargeMenuCreateOrderModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/yalla/yalla/common/model/RechargeMenuCreateOrderResultModel;", "createOrder", "Lcom/yalla/yalla/common/db/table/PayOrder;", "Lcom/yalla/yalla/common/model/RechargeMenuConfirmOrderResultModel;", "confirmRechargeOrder", "payOrder", "Landroidx/lifecycle/MutableLiveData;", "", "saveOrderToDB", "", "updateOrderToDB", "orderId", "deleteOrderToDB", "onBuyErrorUploadLog", "onConsumptionErrorUploadLog", "onConfirmOrderErrorUploadLog", "", "amount", "sku", "", "Lcom/yalla/yalla/common/model/RechargeMenuType;", "list", "onConfirmOrderSuccessUploadLog", "(Ljava/lang/Double;Ljava/lang/String;Ljava/util/List;)V", "isSubscriptionForFirst", "shopId", "payModelType", "currency", "Lcom/app/base/model/VipCreateOrderResultModel;", "createOrderSubscribe", "pageIndex", "Lcom/app/base/model/GoldModel;", "userBill", "area", "Landroidx/lifecycle/MutableLiveData;", "getArea", "()Landroidx/lifecycle/MutableLiveData;", "Lcom/yalla/yalla/common/manager/googlepay/PayLogUpload;", "payLogUpload", "Lcom/yalla/yalla/common/manager/googlepay/PayLogUpload;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class WalletCoinVM extends o00OO.OooO00o {
    public static final int $stable = 8;

    @NotNull
    private final MutableLiveData<CountryModel> area = new MutableLiveData<>(getUserCountry());

    @NotNull
    private final PayLogUpload payLogUpload = new PayLogUpload();

    @DebugMetadata(c = "com.yalla.yalla.common.vm.WalletCoinVM$loadRechargeMenu$1", f = "WalletCoinVM.kt", i = {0, 1}, l = {37, 39, 41}, m = "invokeSuspend", n = {"$this$liveDataAsync", "$this$liveDataAsync"}, s = {"L$0", "L$0"})
    public static final class OooO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RechargeMenuModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21356Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21357Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f21358Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(String str, Continuation<? super OooO> continuation) {
            super(2, continuation);
            this.f21358Oooo0oo = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO oooO = new OooO(this.f21358Oooo0oo, continuation);
            oooO.f21357Oooo0oO = obj;
            return oooO;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RechargeMenuModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0088 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21356Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                liveDataScope = (LiveDataScope) this.f21357Oooo0oO;
                if (p516o0o0O000.OooOo.f42064OooO00o.OooO0Oo()) {
                    this.f21357Oooo0oO = liveDataScope;
                    this.f21356Oooo0o = 1;
                    o00000 o00000Var = o00000.f40902OooO00o;
                    String url = o00000.f40904OooO0OO;
                    Intrinsics.checkNotNullParameter(url, "url");
                    o00O000o o00o000o2 = new o00O000o(url, 0);
                    o00o000o2.OooO00o();
                    o00o000o2.OooO0O0("sources", Boxing.boxInt(2));
                    obj = o0000O0.OooO0OO(new WalletRepo$loadShopListGoogle$$inlined$call$1(o00o000o2, null), this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) obj;
                    this.f21357Oooo0oO = null;
                    this.f21356Oooo0o = 3;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    WalletRepo walletRepo = WalletRepo.f20785OooO00o;
                    String str = this.f21358Oooo0oo;
                    this.f21357Oooo0oO = liveDataScope;
                    this.f21356Oooo0o = 2;
                    obj = walletRepo.OooOO0o(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) obj;
                    this.f21357Oooo0oO = null;
                    this.f21356Oooo0o = 3;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else if (i == 1) {
                liveDataScope = (LiveDataScope) this.f21357Oooo0oO;
                ResultKt.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                this.f21357Oooo0oO = null;
                this.f21356Oooo0o = 3;
                if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (i == 2) {
                liveDataScope = (LiveDataScope) this.f21357Oooo0oO;
                ResultKt.throwOnFailure(obj);
                apiResult = (ApiResult) obj;
                this.f21357Oooo0oO = null;
                this.f21356Oooo0o = 3;
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

    @DebugMetadata(c = "com.yalla.yalla.common.vm.WalletCoinVM$confirmRechargeOrder$1", f = "WalletCoinVM.kt", i = {}, l = {73, 73}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO00o extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RechargeMenuConfirmOrderResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21359Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21360Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ PayOrder f21361Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(PayOrder payOrder, Continuation<? super OooO00o> continuation) {
            super(2, continuation);
            this.f21361Oooo0oo = payOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO00o oooO00o = new OooO00o(this.f21361Oooo0oo, continuation);
            oooO00o.f21360Oooo0oO = obj;
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
            int i = this.f21359Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21360Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21360Oooo0oO;
            WalletRepo walletRepo = WalletRepo.f20785OooO00o;
            PayOrder payOrder = this.f21361Oooo0oo;
            this.f21360Oooo0oO = liveDataScope;
            this.f21359Oooo0o = 1;
            obj = walletRepo.OooO00o(payOrder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21360Oooo0oO = null;
            this.f21359Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.WalletCoinVM$createOrder$1", f = "WalletCoinVM.kt", i = {}, l = {51, 54, 57, 60, 63, 48}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0O0 extends SuspendLambda implements Function2<LiveDataScope<ApiResult<RechargeMenuCreateOrderResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21362Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21363Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuCreateOrderModel f21364Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel, Continuation<? super OooO0O0> continuation) {
            super(2, continuation);
            this.f21364Oooo0oo = rechargeMenuCreateOrderModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0O0 oooO0O0 = new OooO0O0(this.f21364Oooo0oo, continuation);
            oooO0O0.f21363Oooo0oO = obj;
            return oooO0O0;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<ApiResult<RechargeMenuCreateOrderResultModel>> liveDataScope, Continuation<? super Unit> continuation) {
            return ((OooO0O0) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:42:0x00d8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            LiveDataScope liveDataScope;
            ApiResult apiResult;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f21362Oooo0o) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    liveDataScope = (LiveDataScope) this.f21363Oooo0oO;
                    int type = this.f21364Oooo0oo.getType();
                    if (type == PaySupportChannels.pay_type_googlePay.getNum()) {
                        WalletRepo walletRepo = WalletRepo.f20785OooO00o;
                        RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = this.f21364Oooo0oo;
                        this.f21363Oooo0oO = liveDataScope;
                        this.f21362Oooo0o = 1;
                        obj = walletRepo.OooO0oo(rechargeMenuCreateOrderModel, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) obj;
                        this.f21363Oooo0oO = null;
                        this.f21362Oooo0o = 6;
                        if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (type == PaySupportChannels.pay_type_payssionPay.getNum()) {
                        WalletRepo walletRepo2 = WalletRepo.f20785OooO00o;
                        RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel2 = this.f21364Oooo0oo;
                        this.f21363Oooo0oO = liveDataScope;
                        this.f21362Oooo0o = 2;
                        obj = walletRepo2.OooOO0(rechargeMenuCreateOrderModel2, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) obj;
                        this.f21363Oooo0oO = null;
                        this.f21362Oooo0o = 6;
                        if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (type == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                        WalletRepo walletRepo3 = WalletRepo.f20785OooO00o;
                        RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel3 = this.f21364Oooo0oo;
                        this.f21363Oooo0oO = liveDataScope;
                        this.f21362Oooo0o = 3;
                        obj = walletRepo3.OooO(rechargeMenuCreateOrderModel3, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) obj;
                        this.f21363Oooo0oO = null;
                        this.f21362Oooo0o = 6;
                        if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    if (type == PaySupportChannels.pay_type_tapPay.getNum()) {
                        WalletRepo walletRepo4 = WalletRepo.f20785OooO00o;
                        RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel4 = this.f21364Oooo0oo;
                        this.f21363Oooo0oO = liveDataScope;
                        this.f21362Oooo0o = 4;
                        obj = walletRepo4.OooOO0O(rechargeMenuCreateOrderModel4, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiResult = (ApiResult) obj;
                        this.f21363Oooo0oO = null;
                        this.f21362Oooo0o = 6;
                        if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    }
                    WalletRepo walletRepo5 = WalletRepo.f20785OooO00o;
                    RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel5 = this.f21364Oooo0oo;
                    this.f21363Oooo0oO = liveDataScope;
                    this.f21362Oooo0o = 5;
                    obj = walletRepo5.OooO0oo(rechargeMenuCreateOrderModel5, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    apiResult = (ApiResult) obj;
                    this.f21363Oooo0oO = null;
                    this.f21362Oooo0o = 6;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    liveDataScope = (LiveDataScope) this.f21363Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    this.f21363Oooo0oO = null;
                    this.f21362Oooo0o = 6;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    liveDataScope = (LiveDataScope) this.f21363Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    this.f21363Oooo0oO = null;
                    this.f21362Oooo0o = 6;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 3:
                    liveDataScope = (LiveDataScope) this.f21363Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    this.f21363Oooo0oO = null;
                    this.f21362Oooo0o = 6;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 4:
                    liveDataScope = (LiveDataScope) this.f21363Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    this.f21363Oooo0oO = null;
                    this.f21362Oooo0o = 6;
                    if (liveDataScope.emit(apiResult, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 5:
                    liveDataScope = (LiveDataScope) this.f21363Oooo0oO;
                    ResultKt.throwOnFailure(obj);
                    apiResult = (ApiResult) obj;
                    this.f21363Oooo0oO = null;
                    this.f21362Oooo0o = 6;
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

    @DebugMetadata(c = "com.yalla.yalla.common.vm.WalletCoinVM$createOrderSubscribe$1", f = "WalletCoinVM.kt", i = {}, l = {191, 191}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0OO extends SuspendLambda implements Function2<LiveDataScope<ApiResult<VipCreateOrderResultModel>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f21365Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21366Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21367Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ boolean f21368Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ String f21369OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ int f21370OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ double f21371OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ String f21372OoooO0O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, String str, double d, int i, String str2, String str3, Continuation<? super OooO0OO> continuation) {
            super(2, continuation);
            this.f21368Oooo0oo = z;
            this.f21365Oooo = str;
            this.f21371OoooO00 = d;
            this.f21370OoooO0 = i;
            this.f21372OoooO0O = str2;
            this.f21369OoooO = str3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooO0OO oooO0OO = new OooO0OO(this.f21368Oooo0oo, this.f21365Oooo, this.f21371OoooO00, this.f21370OoooO0, this.f21372OoooO0O, this.f21369OoooO, continuation);
            oooO0OO.f21367Oooo0oO = obj;
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
            int i = this.f21366Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21367Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21367Oooo0oO;
            int i2 = !this.f21368Oooo0oo ? 1 : 0;
            WalletRepo walletRepo = WalletRepo.f20785OooO00o;
            String str = this.f21365Oooo;
            double d = this.f21371OoooO00;
            int i3 = this.f21370OoooO0;
            String str2 = this.f21372OoooO0O;
            String str3 = this.f21369OoooO;
            this.f21367Oooo0oO = liveDataScope;
            this.f21366Oooo0o = 1;
            obj = walletRepo.OooO0oO(i2, str, d, i3, str2, str3, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21367Oooo0oO = null;
            this.f21366Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.WalletCoinVM$deleteOrderToDB$1", f = "WalletCoinVM.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21373Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ String f21374Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(String str, Continuation<? super OooO0o> continuation) {
            super(2, continuation);
            this.f21374Oooo0oO = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooO0o(this.f21374Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21373Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.f21374Oooo0oO;
                this.f21373Oooo0o = 1;
                Object objOooO0OO = p491o0o00O00.OooO0OO.OooO00o().OooOoOO().OooO0OO(str, this);
                if (objOooO0OO != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objOooO0OO = Unit.INSTANCE;
                }
                if (objOooO0OO == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.common.vm.WalletCoinVM$onBuyErrorUploadLog$1", f = "WalletCoinVM.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21375Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PayOrder f21376Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ WalletCoinVM f21377Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(PayOrder payOrder, WalletCoinVM walletCoinVM, Continuation<? super OooOO0> continuation) {
            super(2, continuation);
            this.f21376Oooo0oO = payOrder;
            this.f21377Oooo0oo = walletCoinVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0(this.f21376Oooo0oO, this.f21377Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21375Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WalletRepo walletRepo = WalletRepo.f20785OooO00o;
                String orderId = this.f21376Oooo0oO.getOrderId();
                String sku = this.f21376Oooo0oO.getSku();
                String payTypeName = this.f21377Oooo0oo.getPayTypeName(this.f21376Oooo0oO.getType());
                this.f21375Oooo0o = 1;
                if (walletRepo.OooOOO0(orderId, sku, payTypeName, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.common.vm.WalletCoinVM$onConfirmOrderErrorUploadLog$1", f = "WalletCoinVM.kt", i = {}, l = {137}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOO0O extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21378Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PayOrder f21379Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ WalletCoinVM f21380Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(PayOrder payOrder, WalletCoinVM walletCoinVM, Continuation<? super OooOO0O> continuation) {
            super(2, continuation);
            this.f21379Oooo0oO = payOrder;
            this.f21380Oooo0oo = walletCoinVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOO0O(this.f21379Oooo0oO, this.f21380Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOO0O) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21378Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WalletRepo walletRepo = WalletRepo.f20785OooO00o;
                String orderId = this.f21379Oooo0oO.getOrderId();
                String sku = this.f21379Oooo0oO.getSku();
                String payTypeName = this.f21380Oooo0oo.getPayTypeName(this.f21379Oooo0oO.getType());
                int errorCode = this.f21379Oooo0oO.getErrorCode();
                this.f21378Oooo0o = 1;
                if (walletRepo.OooOOO(orderId, sku, payTypeName, errorCode, this) == coroutine_suspended) {
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

    @DebugMetadata(c = "com.yalla.yalla.common.vm.WalletCoinVM$onConsumptionErrorUploadLog$1", f = "WalletCoinVM.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21381Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PayOrder f21382Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ WalletCoinVM f21383Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO(PayOrder payOrder, WalletCoinVM walletCoinVM, Continuation<? super OooOOO> continuation) {
            super(2, continuation);
            this.f21382Oooo0oO = payOrder;
            this.f21383Oooo0oo = walletCoinVM;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOO(this.f21382Oooo0oO, this.f21383Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21381Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                WalletRepo walletRepo = WalletRepo.f20785OooO00o;
                String orderId = this.f21382Oooo0oO.getOrderId();
                String sku = this.f21382Oooo0oO.getSku();
                String payTypeName = this.f21383Oooo0oo.getPayTypeName(this.f21382Oooo0oO.getType());
                this.f21381Oooo0o = 1;
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

    @DebugMetadata(c = "com.yalla.yalla.common.vm.WalletCoinVM$onConfirmOrderSuccessUploadLog$1", f = "WalletCoinVM.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOO0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ List<RechargeMenuType> f21384Oooo;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ Double f21386Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f21387Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(Double d, String str, List<RechargeMenuType> list, Continuation<? super OooOOO0> continuation) {
            super(2, continuation);
            this.f21386Oooo0oO = d;
            this.f21387Oooo0oo = str;
            this.f21384Oooo = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WalletCoinVM.this.new OooOOO0(this.f21386Oooo0oO, this.f21387Oooo0oo, this.f21384Oooo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOO0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            WalletCoinVM.this.payLogUpload.onAppEventsLogger(this.f21386Oooo0oO, this.f21387Oooo0oo, this.f21384Oooo);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.WalletCoinVM$saveOrderToDB$1", f = "WalletCoinVM.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOOOO extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21388Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PayOrder f21389Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ MutableLiveData<Boolean> f21390Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOOO(PayOrder payOrder, MutableLiveData<Boolean> mutableLiveData, Continuation<? super OooOOOO> continuation) {
            super(2, continuation);
            this.f21389Oooo0oO = payOrder;
            this.f21390Oooo0oo = mutableLiveData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOOOO(this.f21389Oooo0oO, this.f21390Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOOOO) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21388Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f21389Oooo0oO.getType() == PaySupportChannels.pay_type_googlePay.getNum() || this.f21389Oooo0oO.getType() == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                    PayOrder payOrder = this.f21389Oooo0oO;
                    this.f21388Oooo0o = 1;
                    Object objOooO00o = p491o0o00O00.OooO0OO.OooO00o().OooOoOO().OooO00o(payOrder, this);
                    if (objOooO00o != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objOooO00o = Unit.INSTANCE;
                    }
                    if (objOooO00o == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f21390Oooo0oo.postValue(Boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.WalletCoinVM$userBill$1", f = "WalletCoinVM.kt", i = {}, l = {198, 198}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo extends SuspendLambda implements Function2<LiveDataScope<ApiResult<List<GoldModel>>>, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ String f21391Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21392Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public /* synthetic */ Object f21393Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ String f21394Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(String str, String str2, Continuation<? super OooOo> continuation) {
            super(2, continuation);
            this.f21394Oooo0oo = str;
            this.f21391Oooo = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            OooOo oooOo = new OooOo(this.f21394Oooo0oo, this.f21391Oooo, continuation);
            oooOo.f21393Oooo0oO = obj;
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
            int i = this.f21392Oooo0o;
            if (i != 0) {
                if (i == 1) {
                    liveDataScope = (LiveDataScope) this.f21393Oooo0oO;
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
            liveDataScope = (LiveDataScope) this.f21393Oooo0oO;
            String str = this.f21394Oooo0oo;
            String str2 = this.f21391Oooo;
            this.f21393Oooo0oO = liveDataScope;
            this.f21392Oooo0o = 1;
            o00000 o00000Var = o00000.f40902OooO00o;
            String url = o00000.f40905OooO0Oo;
            Intrinsics.checkNotNullParameter(url, "url");
            o00O000o o00o000o2 = new o00O000o(url, 0);
            o00o000o2.OooO0O0("pageindex", str);
            o00o000o2.OooO0O0("type", str2);
            obj = o0000O0.OooO0OO(new WalletRepo$userBill$$inlined$call$1(o00o000o2, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            this.f21393Oooo0oO = null;
            this.f21392Oooo0o = 2;
            if (liveDataScope.emit(obj, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.common.vm.WalletCoinVM$updateOrderToDB$1", f = "WalletCoinVM.kt", i = {}, l = {100}, m = "invokeSuspend", n = {}, s = {})
    public static final class OooOo00 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f21395Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PayOrder f21396Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(PayOrder payOrder, Continuation<? super OooOo00> continuation) {
            super(2, continuation);
            this.f21396Oooo0oO = payOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new OooOo00(this.f21396Oooo0oO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((OooOo00) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f21395Oooo0o;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f21396Oooo0oO.getType() == PaySupportChannels.pay_type_googlePay.getNum() || this.f21396Oooo0oO.getType() == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                    PayOrder payOrder = this.f21396Oooo0oO;
                    this.f21395Oooo0o = 1;
                    Object objOooO0o0 = p491o0o00O00.OooO0OO.OooO00o().OooOoOO().OooO0o0(payOrder.getOrderId(), payOrder.getIsConsume(), this);
                    if (objOooO0o0 != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        objOooO0o0 = Unit.INSTANCE;
                    }
                    if (objOooO0o0 == coroutine_suspended) {
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
        return ApiCountryUtils.INSTANCE.getModelForId(String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0Oo().getValue()));
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
        return o0000O0O.OooO00o(new OooO00o(model, null));
    }

    @NotNull
    public final LiveData<ApiResult<RechargeMenuCreateOrderResultModel>> createOrder(@NotNull RechargeMenuCreateOrderModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        return o0000O0O.OooO00o(new OooO0O0(model, null));
    }

    @NotNull
    public final LiveData<ApiResult<VipCreateOrderResultModel>> createOrderSubscribe(boolean isSubscriptionForFirst, @NotNull String shopId, double amount, int payModelType, @NotNull String sku, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(shopId, "shopId");
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return o0000O0O.OooO00o(new OooO0OO(isSubscriptionForFirst, shopId, amount, payModelType, sku, currency, null));
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
        return o0000O0O.OooO00o(new OooO(countryId, null));
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
        return o0000O0O.OooO00o(new OooOo(pageIndex, type, null));
    }
}
