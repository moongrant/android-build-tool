package com.yalla.yalla.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.SkuDetails;
import com.app.base.model.CountryModel;
import com.code.android.util.ToastUtil;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.manager.FixRechargeOrderManager;
import com.yalla.yalla.common.manager.PackManager;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.common.manager.data.SharedUrlManager;
import com.yalla.yalla.common.manager.googlepay.GooglePayPrice;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.FaqTag;
import com.yalla.yalla.common.model.RechargeMenuBanType;
import com.yalla.yalla.common.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.common.model.RechargeMenuModel;
import com.yalla.yalla.common.model.RechargeMenuPayResultModel;
import com.yalla.yalla.common.model.RechargeMenuToPayModel;
import com.yalla.yalla.common.model.RechargeMenuType;
import com.yalla.yalla.common.model.WebFrom;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.common.util.PaySupportChannels;
import com.yalla.yalla.common.util.WebPageInfo;
import com.yalla.yalla.common.vm.WalletCoinVM;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.util.NetWork;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.conscrypt.NativeConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.oOO00O;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p515o0o0O00.o00O00;
import p538o0o0Oo0.ooo0Oo0;
import p582o0oOoOoO.j3;
import p649o0ooOOoo.ji;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bM\u0010NJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0014\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0016\u0010\r\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\u000e\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010\u0013\u001a\u00020\u0003H\u0002J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0014H\u0002J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0016H\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0002J\b\u0010\u001d\u001a\u00020\u0003H\u0002J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0016H\u0002J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J\b\u0010 \u001a\u00020\u0003H\u0002J\u0018\u0010\"\u001a\u00020\u00032\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0003J\u001a\u0010'\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016J\b\u0010(\u001a\u00020\u0003H\u0014J\"\u0010-\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020)2\b\u0010!\u001a\u0004\u0018\u00010,H\u0016R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0016\u0010=\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020A0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR?\u0010G\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\bE\u0012\b\bF\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0003\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010L¨\u0006O"}, d2 = {"Lcom/yalla/yalla/ui/fragment/WalletCoinFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/ji;", "", "initViewFirstChargeReward", "", "countryId", "loadShopList", "", "Lcom/yalla/yalla/common/model/RechargeMenuType;", "list", "toQuerySkuDetails", "deleteDataBan", "showPageInfo", "iniView", "Lcom/yalla/yalla/common/model/RechargeMenuCreateOrderModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "createOrder", "goodsUnderMaintenanceDialog", "reLoadData", "Lcom/yalla/yalla/common/model/RechargeMenuToPayModel;", "toPay", "Lcom/yalla/yalla/common/db/table/PayOrder;", "payOrder", "", "toConsumeOrder", "(Lcom/yalla/yalla/common/db/table/PayOrder;)Ljava/lang/Boolean;", "confirmRechargeOrder", "checkOrderStateGooglePay", "checkOrderStateHuaWeiPay", "showRechargeErrorDialog", "toWebRechargePage", "startHelperActivity", "data", "calculatedMaxWidthForItemView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "", "requestCode", "resultCode", "Landroid/content/Intent;", "onActivityResult", "Lcom/yalla/yalla/common/vm/WalletCoinVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/common/vm/WalletCoinVM;", "vm", "Lcom/yalla/yalla/common/manager/PayManager;", "payManager$delegate", "getPayManager", "()Lcom/yalla/yalla/common/manager/PayManager;", "payManager", "Lcom/yalla/yalla/common/manager/FixRechargeOrderManager;", "fixRechargeOrderManagerGooglePay", "Lcom/yalla/yalla/common/manager/FixRechargeOrderManager;", "fixRechargeOrderManagerHuaWeiPay", "recharging", "Z", "errorCount", "I", "Lcom/yalla/yalla/common/model/RechargeMenuBanType;", "rechargeBanList", "Ljava/util/List;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "selectItemListener", "Lkotlin/jvm/functions/Function1;", "getSelectItemListener", "()Lkotlin/jvm/functions/Function1;", "setSelectItemListener", "(Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class WalletCoinFragment extends p503o0o00o00.OooO<ji> {
    public static final int $stable = 8;

    @Nullable
    private p563o0oOo0.o000000O adapter;
    private int errorCount;

    @Nullable
    private FixRechargeOrderManager fixRechargeOrderManagerGooglePay;

    @Nullable
    private FixRechargeOrderManager fixRechargeOrderManagerHuaWeiPay;

    /* JADX INFO: renamed from: payManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy payManager;

    @NotNull
    private final List<RechargeMenuBanType> rechargeBanList;
    private boolean recharging;

    @Nullable
    private Function1<? super RechargeMenuCreateOrderModel, Unit> selectItemListener;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends Lambda implements Function1<RechargeMenuCreateOrderResultModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuCreateOrderModel f24320Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
            super(1);
            this.f24320Oooo0oO = rechargeMenuCreateOrderModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RechargeMenuCreateOrderResultModel rechargeMenuCreateOrderResultModel) {
            RechargeMenuCreateOrderResultModel rechargeMenuCreateOrderResultModel2 = rechargeMenuCreateOrderResultModel;
            if (rechargeMenuCreateOrderResultModel2 == null || StringsKt.isBlank(rechargeMenuCreateOrderResultModel2.getOrderid())) {
                WalletCoinFragment.this.recharging = false;
            } else {
                RechargeMenuToPayModel rechargeMenuToPayModel = new RechargeMenuToPayModel();
                rechargeMenuToPayModel.setSku(this.f24320Oooo0oO.getSku());
                rechargeMenuToPayModel.setType(this.f24320Oooo0oO.getType());
                rechargeMenuToPayModel.setSkuDetails(this.f24320Oooo0oO.getSkuDetails());
                rechargeMenuToPayModel.setUnit(this.f24320Oooo0oO.getUnit());
                rechargeMenuToPayModel.setPmId(this.f24320Oooo0oO.getPmId());
                rechargeMenuToPayModel.setOrderid(rechargeMenuCreateOrderResultModel2.getOrderid());
                rechargeMenuToPayModel.setCoin(this.f24320Oooo0oO.getCoin());
                rechargeMenuToPayModel.setAmount(this.f24320Oooo0oO.getAmount());
                WalletCoinFragment.this.toPay(rechargeMenuToPayModel);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            FragmentActivity activity = WalletCoinFragment.this.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            BaseActivityK baseActivityK = (BaseActivityK) activity;
            if (!baseActivityK.isDestroyed()) {
                baseActivityK.OooOoO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<RechargeMenuConfirmOrderResultModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PayOrder f24323Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(PayOrder payOrder) {
            super(1);
            this.f24323Oooo0oO = payOrder;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel) {
            Long balance;
            RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel2 = rechargeMenuConfirmOrderResultModel;
            if (rechargeMenuConfirmOrderResultModel2 != null && (balance = rechargeMenuConfirmOrderResultModel2.getBalance()) != null) {
                p498o0o00Oo0.OooOOO.f41216OooO00o.OooO0OO().setValue(Long.valueOf(balance.longValue()));
            }
            p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
            p497o0o00Oo.OooOOO0.OooO0OO().OooOO0O(true);
            WalletCoinFragment.this.initViewFirstChargeReward();
            WalletCoinFragment.this.getVm().deleteOrderToDB(this.f24323Oooo0oO.getOrderId());
            ToastUtil.f12567OooO00o.OooO0O0(WalletCoinFragment.this.getString(R.string.Purchase_successful));
            WalletCoinVM vm = WalletCoinFragment.this.getVm();
            Double amount = this.f24323Oooo0oO.getAmount();
            String sku = this.f24323Oooo0oO.getSku();
            p563o0oOo0.o000000O o000000o2 = WalletCoinFragment.this.adapter;
            vm.onConfirmOrderSuccessUploadLog(amount, sku, o000000o2 != null ? o000000o2.getData() : null);
            o0O00000.OooO0OO("Me_profile_recharge");
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ PayOrder f24324Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ WalletCoinFragment f24325Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(PayOrder payOrder, WalletCoinFragment walletCoinFragment) {
            super(1);
            this.f24324Oooo0o = payOrder;
            this.f24325Oooo0oO = walletCoinFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            this.f24324Oooo0o.setErrorCode(it.getCode());
            this.f24325Oooo0oO.getVm().onConfirmOrderErrorUploadLog(this.f24324Oooo0o);
            this.f24325Oooo0oO.errorCount++;
            this.f24325Oooo0oO.showRechargeErrorDialog(this.f24324Oooo0o);
            int code2 = it.getCode();
            if (code2 == 2000 || code2 == 2005) {
                p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
                p497o0o00Oo.OooOOO0.OooO0OO().OooOO0O(true);
                this.f24325Oooo0oO.initViewFirstChargeReward();
                this.f24325Oooo0oO.getVm().deleteOrderToDB(this.f24324Oooo0o.getOrderId());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<RechargeMenuConfirmOrderResultModel>, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RechargeMenuConfirmOrderResultModel> apiResult) {
            ApiResult<RechargeMenuConfirmOrderResultModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            WalletCoinFragment.this.recharging = false;
            FragmentActivity activity = WalletCoinFragment.this.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            ((BaseActivityK) activity).OooOoO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuCreateOrderModel f24328Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
            super(1);
            this.f24328Oooo0oO = rechargeMenuCreateOrderModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError error = apiError;
            Intrinsics.checkNotNullParameter(error, "it");
            WalletCoinFragment.this.recharging = false;
            if (error.getCode() == 3003) {
                WalletCoinFragment.this.goodsUnderMaintenanceDialog(this.f24328Oooo0oO);
            } else {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooOOOO(error, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiResult<RechargeMenuCreateOrderResultModel>, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RechargeMenuCreateOrderResultModel> apiResult) {
            ApiResult<RechargeMenuCreateOrderResultModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            FragmentActivity activity = WalletCoinFragment.this.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            ((BaseActivityK) activity).OooOoO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<RechargeMenuCreateOrderModel, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
            RechargeMenuCreateOrderModel it = rechargeMenuCreateOrderModel;
            Intrinsics.checkNotNullParameter(it, "it");
            Function1<RechargeMenuCreateOrderModel, Unit> selectItemListener = WalletCoinFragment.this.getSelectItemListener();
            if (selectItemListener != null) {
                selectItemListener.invoke(it);
            }
            WalletCoinFragment.this.createOrder(it);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            WalletCoinFragment.this.reLoadData();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<Unit> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            WalletCoinFragment.this.reLoadData();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<ApiError, Unit> {
        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            WalletCoinFragment.this.getBinding().f49805OooO0Oo.OooO0o();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<RechargeMenuModel, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RechargeMenuModel rechargeMenuModel) {
            RechargeMenuModel rechargeMenuModel2 = rechargeMenuModel;
            if (rechargeMenuModel2 == null || rechargeMenuModel2.getData().isEmpty()) {
                WalletCoinFragment.this.getBinding().f49805OooO0Oo.OooO0o0();
            } else {
                WalletCoinFragment.this.rechargeBanList.clear();
                WalletCoinFragment.this.rechargeBanList.addAll(rechargeMenuModel2.getDataBan());
                WalletCoinFragment.this.toQuerySkuDetails(rechargeMenuModel2.getData());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<PayManager> {
        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PayManager invoke() {
            FragmentActivity fragmentActivityRequireActivity = WalletCoinFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return new PayManager(fragmentActivityRequireActivity);
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<ApiResult<RechargeMenuModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ String f24336Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ WalletCoinFragment f24337Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(String str, WalletCoinFragment walletCoinFragment) {
            super(1);
            this.f24336Oooo0o = str;
            this.f24337Oooo0oO = walletCoinFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RechargeMenuModel> apiResult) {
            ApiResult<RechargeMenuModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            String str = this.f24336Oooo0o;
            if (!(str == null || StringsKt.isBlank(str))) {
                FragmentActivity activity = this.f24337Oooo0oO.getActivity();
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
                BaseActivityK baseActivityK = (BaseActivityK) activity;
                if (!baseActivityK.isDestroyed()) {
                    baseActivityK.OooOoO();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<Unit> {
        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            WalletCoinFragment.this.startHelperActivity();
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PayOrder f24340Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00O0O(PayOrder payOrder) {
            super(0);
            this.f24340Oooo0oO = payOrder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            FragmentActivity activity = WalletCoinFragment.this.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            BaseActivityK.OooOoo0((BaseActivityK) activity, WalletCoinFragment.this.getString(R.string.Validating_your_purchase), 0L, 2, null);
            if (this.f24340Oooo0oO.getIsConsume()) {
                WalletCoinFragment.this.confirmRechargeOrder(this.f24340Oooo0oO);
                return null;
            }
            WalletCoinFragment.this.toConsumeOrder(this.f24340Oooo0oO);
            return null;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.WalletCoinFragment$toConsumeOrder$1", f = "WalletCoinFragment.kt", i = {}, l = {514, NativeConstants.SSL_SIGN_ECDSA_SHA1}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Oo0 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f24341Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ PayOrder f24343Oooo0oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.fragment.WalletCoinFragment$toConsumeOrder$1$1", f = "WalletCoinFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Boolean f24344Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ PayOrder f24345Oooo0oO;

            /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
            public final /* synthetic */ WalletCoinFragment f24346Oooo0oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Boolean bool, PayOrder payOrder, WalletCoinFragment walletCoinFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f24344Oooo0o = bool;
                this.f24345Oooo0oO = payOrder;
                this.f24346Oooo0oo = walletCoinFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f24344Oooo0o, this.f24345Oooo0oO, this.f24346Oooo0oo, continuation);
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
                if (Intrinsics.areEqual(this.f24344Oooo0o, Boxing.boxBoolean(true))) {
                    this.f24345Oooo0oO.setConsume(true);
                    this.f24346Oooo0oo.getVm().updateOrderToDB(this.f24345Oooo0oO);
                    this.f24346Oooo0oo.errorCount = 0;
                    this.f24346Oooo0oo.confirmRechargeOrder(this.f24345Oooo0oO);
                } else {
                    this.f24346Oooo0oo.getVm().onConsumptionErrorUploadLog(this.f24345Oooo0oO);
                    FragmentActivity activity = this.f24346Oooo0oo.getActivity();
                    Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
                    ((BaseActivityK) activity).OooOoO();
                    this.f24346Oooo0oo.errorCount++;
                    this.f24346Oooo0oo.showRechargeErrorDialog(this.f24345Oooo0oO);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Oo0(PayOrder payOrder, Continuation<? super o00Oo0> continuation) {
            super(2, continuation);
            this.f24343Oooo0oo = payOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WalletCoinFragment.this.new o00Oo0(this.f24343Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00Oo0) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24341Oooo0o;
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
            PayManager payManager = WalletCoinFragment.this.getPayManager();
            PayOrder payOrder = this.f24343Oooo0oo;
            this.f24341Oooo0o = 1;
            obj = payManager.consumeOrder(payOrder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o((Boolean) obj, this.f24343Oooo0oo, WalletCoinFragment.this, null);
            this.f24341Oooo0o = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.WalletCoinFragment$toPay$1", f = "WalletCoinFragment.kt", i = {}, l = {402, 406}, m = "invokeSuspend", n = {}, s = {})
    public static final class o00Ooo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public int f24347Oooo0o;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuToPayModel f24349Oooo0oo;

        @DebugMetadata(c = "com.yalla.yalla.ui.fragment.WalletCoinFragment$toPay$1$1", f = "WalletCoinFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ RechargeMenuPayResultModel f24350Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ WalletCoinFragment f24351Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(RechargeMenuPayResultModel rechargeMenuPayResultModel, WalletCoinFragment walletCoinFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f24350Oooo0o = rechargeMenuPayResultModel;
                this.f24351Oooo0oO = walletCoinFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f24350Oooo0o, this.f24351Oooo0oO, continuation);
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
                if (this.f24350Oooo0o.getIsSuccess()) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("确认订单和消单 orderid:");
                    sbOooO0o0.append(this.f24350Oooo0o.getOrderid());
                    sbOooO0o0.append(" purchaseToken: ");
                    sbOooO0o0.append(this.f24350Oooo0o.getPurchasetoken());
                    o00O00.OooO0O0(sbOooO0o0.toString());
                    FragmentActivity activity = this.f24351Oooo0oO.getActivity();
                    Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
                    BaseActivityK.OooOoo0((BaseActivityK) activity, this.f24351Oooo0oO.getString(R.string.Validating_your_purchase), 0L, 2, null);
                    PayOrder payOrder = new PayOrder();
                    payOrder.setUserId(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue());
                    payOrder.setConsume(false);
                    payOrder.setNewOrder(true);
                    payOrder.setType(this.f24350Oooo0o.getType());
                    payOrder.setOrderId(this.f24350Oooo0o.getOrderid());
                    payOrder.setSku(this.f24350Oooo0o.getSku());
                    payOrder.setPurchaseToken(this.f24350Oooo0o.getPurchasetoken());
                    payOrder.setHuaWeiAccountFlag(this.f24350Oooo0o.getAccountFlag());
                    payOrder.setCreateTime(System.currentTimeMillis());
                    this.f24351Oooo0oO.getVm().saveOrderToDB(payOrder);
                    this.f24351Oooo0oO.toConsumeOrder(payOrder);
                } else {
                    this.f24351Oooo0oO.recharging = false;
                    o00O00.OooOO0O("支付失败 " + this.f24350Oooo0o.getErrorCode() + ' ' + this.f24350Oooo0o.getErrorMessage());
                    PayOrder payOrder2 = new PayOrder();
                    RechargeMenuPayResultModel rechargeMenuPayResultModel = this.f24350Oooo0o;
                    payOrder2.setOrderId(rechargeMenuPayResultModel.getOrderid());
                    payOrder2.setSku(rechargeMenuPayResultModel.getSku());
                    payOrder2.setType(rechargeMenuPayResultModel.getType());
                    this.f24351Oooo0oO.getVm().onBuyErrorUploadLog(payOrder2);
                    int type = this.f24350Oooo0o.getType();
                    if (type == PaySupportChannels.pay_type_googlePay.getNum()) {
                        int errorCode = this.f24350Oooo0o.getErrorCode();
                        if (errorCode == -103 || errorCode == -101) {
                            ToastUtil.f12567OooO00o.OooO0O0(this.f24351Oooo0oO.getString(R.string.google_play_useless));
                        } else {
                            if (this.f24350Oooo0o.getErrorMessage().length() > 0) {
                                ToastUtil.f12567OooO00o.OooO0O0(this.f24350Oooo0o.getErrorMessage());
                            }
                        }
                    } else if (type == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                        if (this.f24350Oooo0o.getErrorMessage().length() > 0) {
                            ToastUtil.f12567OooO00o.OooO0O0(this.f24350Oooo0o.getErrorMessage());
                        }
                    } else if (type != PaySupportChannels.pay_type_payssionPay.getNum() && type == PaySupportChannels.pay_type_tapPay.getNum()) {
                        String errorMessage = this.f24350Oooo0o.getErrorMessage();
                        RechargeMenuPayResultModel rechargeMenuPayResultModel2 = this.f24350Oooo0o;
                        if ((true ^ StringsKt.isBlank(errorMessage)) && rechargeMenuPayResultModel2.getErrorCode() != -106) {
                            ToastUtil.f12567OooO00o.OooO0O0(errorMessage);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(RechargeMenuToPayModel rechargeMenuToPayModel, Continuation<? super o00Ooo> continuation) {
            super(2, continuation);
            this.f24349Oooo0oo = rechargeMenuToPayModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WalletCoinFragment.this.new o00Ooo(this.f24349Oooo0oo, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o00Ooo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f24347Oooo0o;
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
            PayManager payManager = WalletCoinFragment.this.getPayManager();
            RechargeMenuToPayModel rechargeMenuToPayModel = this.f24349Oooo0oo;
            this.f24347Oooo0o = 1;
            obj = PayManager.pay$default(payManager, rechargeMenuToPayModel, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            RechargeMenuPayResultModel rechargeMenuPayResultModel = (RechargeMenuPayResultModel) obj;
            rechargeMenuPayResultModel.setType(this.f24349Oooo0oo.getType());
            rechargeMenuPayResultModel.setOrderid(this.f24349Oooo0oo.getOrderid());
            rechargeMenuPayResultModel.setSku(this.f24349Oooo0oo.getSku());
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(rechargeMenuPayResultModel, WalletCoinFragment.this, null);
            this.f24347Oooo0o = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PayOrder f24353Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OoOo0(PayOrder payOrder) {
            super(0);
            this.f24353Oooo0oO = payOrder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            FragmentActivity activity = WalletCoinFragment.this.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            BaseActivityK.OooOoo0((BaseActivityK) activity, WalletCoinFragment.this.getString(R.string.Validating_your_purchase), 0L, 2, null);
            if (this.f24353Oooo0oO.getIsConsume()) {
                WalletCoinFragment.this.confirmRechargeOrder(this.f24353Oooo0oO);
                return null;
            }
            WalletCoinFragment.this.toConsumeOrder(this.f24353Oooo0oO);
            return null;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.WalletCoinFragment$toQuerySkuDetails$6", f = "WalletCoinFragment.kt", i = {0}, l = {158, 179}, m = "invokeSuspend", n = {"itemMap"}, s = {"L$3"})
    public static final class oo000o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public Map.Entry f24354Oooo;

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public WalletCoinFragment f24355Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public List f24356Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public Iterator f24357Oooo0oo;

        /* JADX INFO: renamed from: OoooO, reason: collision with root package name */
        public final /* synthetic */ List<RechargeMenuType> f24358OoooO;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ Map<Integer, List<String>> f24359OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public int f24360OoooO00;

        /* JADX INFO: renamed from: OoooO0O, reason: collision with root package name */
        public final /* synthetic */ WalletCoinFragment f24361OoooO0O;

        @DebugMetadata(c = "com.yalla.yalla.ui.fragment.WalletCoinFragment$toQuerySkuDetails$6$2", f = "WalletCoinFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ WalletCoinFragment f24362Oooo0o;

            /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
            public final /* synthetic */ List<RechargeMenuType> f24363Oooo0oO;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(WalletCoinFragment walletCoinFragment, List<RechargeMenuType> list, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f24362Oooo0o = walletCoinFragment;
                this.f24363Oooo0oO = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f24362Oooo0o, this.f24363Oooo0oO, continuation);
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
                this.f24362Oooo0o.deleteDataBan(this.f24363Oooo0oO);
                this.f24362Oooo0o.showPageInfo(this.f24363Oooo0oO);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(Map<Integer, List<String>> map, WalletCoinFragment walletCoinFragment, List<RechargeMenuType> list, Continuation<? super oo000o> continuation) {
            super(2, continuation);
            this.f24359OoooO0 = map;
            this.f24361OoooO0O = walletCoinFragment;
            this.f24358OoooO = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new oo000o(this.f24359OoooO0, this.f24361OoooO0O, this.f24358OoooO, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((oo000o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0054  */
        /* JADX WARN: Code duplicated, block: B:17:0x007e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x007f  */
        /* JADX WARN: Code duplicated, block: B:21:0x0091  */
        /* JADX WARN: Code duplicated, block: B:24:0x009b  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:29:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:36:0x00d0  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:43:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:45:0x0116  */
        /* JADX WARN: Code duplicated, block: B:46:0x0118  */
        /* JADX WARN: Code duplicated, block: B:52:0x0121  */
        /* JADX WARN: Code duplicated, block: B:53:0x0126  */
        /* JADX WARN: Code duplicated, block: B:55:0x0129  */
        /* JADX WARN: Code duplicated, block: B:58:0x0133  */
        /* JADX WARN: Code duplicated, block: B:63:0x014b  */
        /* JADX WARN: Code duplicated, block: B:80:0x00cb A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x011c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x0141 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x0166 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x012d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x012d A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x0161 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007f -> B:19:0x0087). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 423
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yalla.yalla.ui.fragment.WalletCoinFragment.oo000o.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public WalletCoinFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.WalletCoinFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.WalletCoinFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(WalletCoinVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.WalletCoinFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.WalletCoinFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24367Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24367Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.WalletCoinFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory == null || (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) == null) {
                    defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
                }
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "(owner as? HasDefaultVie…tViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }
        });
        this.payManager = LazyKt.lazy(new Oooo0());
        this.rechargeBanList = new ArrayList();
    }

    @SuppressLint({"SetTextI18n", "NotifyDataSetChanged"})
    private final void calculatedMaxWidthForItemView(List<RechargeMenuType> data) {
        String string;
        int length;
        int length2;
        String string2;
        int length3;
        int length4;
        RechargeMenuType rechargeMenuType = null;
        int i = 1;
        if (p516o0o0O000.OooOo.f42064OooO00o.OooO0Oo()) {
            if (data == null || !(!data.isEmpty())) {
                return;
            }
            for (RechargeMenuType rechargeMenuType2 : data) {
                if (rechargeMenuType != null) {
                    if (rechargeMenuType.getSkuDetails() != null) {
                        GooglePayPrice googlePayPrice = GooglePayPrice.INSTANCE;
                        SkuDetails skuDetails = rechargeMenuType.getSkuDetails();
                        Intrinsics.checkNotNull(skuDetails);
                        length3 = googlePayPrice.getGooglePayPriceFormat(skuDetails).length();
                    } else {
                        length3 = (rechargeMenuType.getUnit() + "" + rechargeMenuType.getAmount()).length();
                    }
                    if (rechargeMenuType2.getSkuDetails() != null) {
                        GooglePayPrice googlePayPrice2 = GooglePayPrice.INSTANCE;
                        SkuDetails skuDetails2 = rechargeMenuType2.getSkuDetails();
                        Intrinsics.checkNotNull(skuDetails2);
                        length4 = googlePayPrice2.getGooglePayPriceFormat(skuDetails2).length();
                    } else {
                        length4 = (rechargeMenuType2.getUnit() + "" + rechargeMenuType2.getAmount()).length();
                    }
                    if (length3 < length4) {
                    }
                }
                rechargeMenuType = rechargeMenuType2;
            }
            if (rechargeMenuType != null) {
                TextView textView = getBinding().f49808OooO0oO;
                if (rechargeMenuType.getSkuDetails() != null) {
                    GooglePayPrice googlePayPrice3 = GooglePayPrice.INSTANCE;
                    SkuDetails skuDetails3 = rechargeMenuType.getSkuDetails();
                    Intrinsics.checkNotNull(skuDetails3);
                    string2 = googlePayPrice3.getGooglePayPriceFormat(skuDetails3);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(rechargeMenuType.getUnit());
                    sb.append(' ');
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(rechargeMenuType.getAmount())}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    sb.append(str);
                    string2 = sb.toString();
                }
                textView.setText(string2);
                textView.post(new OooO00o.OooOOO0(textView, this, i));
                return;
            }
            return;
        }
        if (data == null || !(!data.isEmpty())) {
            return;
        }
        Iterator<RechargeMenuType> it = data.iterator();
        while (it.hasNext()) {
            for (RechargeMenuType rechargeMenuType3 : it.next().getShoplist()) {
                if (rechargeMenuType != null) {
                    if (rechargeMenuType.getSkuDetails() != null) {
                        GooglePayPrice googlePayPrice4 = GooglePayPrice.INSTANCE;
                        SkuDetails skuDetails4 = rechargeMenuType.getSkuDetails();
                        Intrinsics.checkNotNull(skuDetails4);
                        length = googlePayPrice4.getGooglePayPriceFormat(skuDetails4).length();
                    } else {
                        length = (rechargeMenuType.getUnit() + "" + rechargeMenuType.getAmount()).length();
                    }
                    if (rechargeMenuType3.getSkuDetails() != null) {
                        GooglePayPrice googlePayPrice5 = GooglePayPrice.INSTANCE;
                        SkuDetails skuDetails5 = rechargeMenuType3.getSkuDetails();
                        Intrinsics.checkNotNull(skuDetails5);
                        length2 = googlePayPrice5.getGooglePayPriceFormat(skuDetails5).length();
                    } else {
                        length2 = (rechargeMenuType3.getUnit() + "" + rechargeMenuType3.getAmount()).length();
                    }
                    if (length < length2) {
                    }
                }
                rechargeMenuType = rechargeMenuType3;
            }
        }
        if (rechargeMenuType != null) {
            TextView textView2 = getBinding().f49808OooO0oO;
            if (rechargeMenuType.getSkuDetails() != null) {
                GooglePayPrice googlePayPrice6 = GooglePayPrice.INSTANCE;
                SkuDetails skuDetails6 = rechargeMenuType.getSkuDetails();
                Intrinsics.checkNotNull(skuDetails6);
                string = googlePayPrice6.getGooglePayPriceFormat(skuDetails6);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(rechargeMenuType.getUnit());
                sb2.append(' ');
                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(rechargeMenuType.getAmount())}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                sb2.append(str2);
                string = sb2.toString();
            }
            textView2.setText(string);
            textView2.post(new OooO0OO.OooO00o(textView2, this, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculatedMaxWidthForItemView$lambda-30$lambda-29$lambda-28$lambda-27, reason: not valid java name */
    public static final void m432x7785f978(TextView this_apply, WalletCoinFragment this$0) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int width = this_apply.getWidth();
        p563o0oOo0.o000000O o000000o2 = this$0.adapter;
        if (o000000o2 != null) {
            o000000o2.f44981OooO00o = width;
        }
        if (o000000o2 != null) {
            o000000o2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: calculatedMaxWidthForItemView$lambda-34$lambda-33$lambda-32$lambda-31, reason: not valid java name */
    public static final void m433x906e8907(TextView this_apply, WalletCoinFragment this$0) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int width = this_apply.getWidth();
        p563o0oOo0.o000000O o000000o2 = this$0.adapter;
        if (o000000o2 != null) {
            o000000o2.f44981OooO00o = width;
        }
        if (o000000o2 != null) {
            o000000o2.notifyDataSetChanged();
        }
    }

    private final void checkOrderStateGooglePay() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        this.fixRechargeOrderManagerGooglePay = new FixRechargeOrderManager(fragmentActivityRequireActivity, getPayManager());
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        BaseActivityK.OooOoo0((BaseActivityK) activity, null, 0L, 3, null);
        FixRechargeOrderManager fixRechargeOrderManager = this.fixRechargeOrderManagerGooglePay;
        if (fixRechargeOrderManager != null) {
            fixRechargeOrderManager.setListener(new OooO00o());
        }
        FixRechargeOrderManager fixRechargeOrderManager2 = this.fixRechargeOrderManagerGooglePay;
        if (fixRechargeOrderManager2 != null) {
            FixRechargeOrderManager.start$default(fixRechargeOrderManager2, PaySupportChannels.pay_type_googlePay.getNum(), false, 2, null);
        }
    }

    private final void checkOrderStateHuaWeiPay() {
        if (p516o0o0O000.OooOo.f42064OooO00o.OooO0Oo()) {
            return;
        }
        PackManager packManager = PackManager.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        if (packManager.isHaveHuaWeiPay(contextRequireContext)) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            FixRechargeOrderManager fixRechargeOrderManager = new FixRechargeOrderManager(fragmentActivityRequireActivity, getPayManager());
            this.fixRechargeOrderManagerHuaWeiPay = fixRechargeOrderManager;
            FixRechargeOrderManager.start$default(fixRechargeOrderManager, PaySupportChannels.pay_type_huaWeiPay.getNum(), false, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmRechargeOrder(PayOrder model) {
        this.recharging = true;
        getVm().confirmRechargeOrder(model).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO0O0(model), new OooO0OO(model, this), new OooO0o(), false, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createOrder(RechargeMenuCreateOrderModel model) {
        if (model.getType() == PaySupportChannels.pay_type_googlePay.getNum()) {
            PackManager packManager = PackManager.INSTANCE;
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            if (!packManager.isHaveGooglePlay(fragmentActivityRequireActivity)) {
                ToastUtil.f12567OooO00o.OooO0O0(p254o00ooO0O.o000O0O0.OooO0OO(R.string.google_play_useless));
                return;
            }
        }
        if (model.getType() == PaySupportChannels.pay_type_mintroute.getNum()) {
            toWebRechargePage(model);
            return;
        }
        if (this.recharging) {
            return;
        }
        this.recharging = true;
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        BaseActivityK.OooOoo0((BaseActivityK) activity, null, 0L, 3, null);
        getVm().createOrder(model).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO(model), new OooOO0(model), new OooOO0O(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteDataBan(List<RechargeMenuType> list) {
        for (RechargeMenuBanType rechargeMenuBanType : this.rechargeBanList) {
            if (p516o0o0O000.OooOo.f42064OooO00o.OooO0Oo()) {
                Iterator<RechargeMenuType> it = list.iterator();
                if (it != null) {
                    while (it.hasNext()) {
                        RechargeMenuType next = it.next();
                        if (Intrinsics.areEqual(rechargeMenuBanType.getCurrency(), next.getUnit()) && Intrinsics.areEqual(rechargeMenuBanType.getSku(), next.getSku())) {
                            it.remove();
                        }
                    }
                }
            } else {
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    RechargeMenuType rechargeMenuType = (RechargeMenuType) obj;
                    Iterator<RechargeMenuType> it2 = rechargeMenuType.getShoplist().iterator();
                    if (it2 != null) {
                        while (it2.hasNext()) {
                            RechargeMenuType next2 = it2.next();
                            if (Intrinsics.areEqual(rechargeMenuBanType.getCurrency(), next2.getUnit()) && Intrinsics.areEqual(rechargeMenuBanType.getSku(), next2.getSku())) {
                                it2.remove();
                                if (rechargeMenuType.getShoplist().isEmpty()) {
                                    arrayList.add(Integer.valueOf(i));
                                }
                            }
                        }
                    }
                    i = i2;
                }
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    list.remove(((Number) it3.next()).intValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PayManager getPayManager() {
        return (PayManager) this.payManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WalletCoinVM getVm() {
        return (WalletCoinVM) this.vm.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void goodsUnderMaintenanceDialog(RechargeMenuCreateOrderModel model) {
        o00O000 o00o001 = o00O000.f34346OooO00o;
        Activity activityOooO0O0 = o00O000.OooO0O0();
        if (activityOooO0O0 != null) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O0);
            oo0ooo0.OooOo0(R.string.Recharge_Page_CopyUnder_maintenance_Dialog);
            oo0ooo0.OooOOOo(R.string.OK);
            oo0ooo0.OooOo0o(new OooOOO0());
            oo0ooo0.OooOOO0();
        }
    }

    private final void iniView() {
        getBinding().f49807OooO0o0.setOnClickListener(new ooo0Oo0(this, 2));
        getBinding().f49803OooO0O0.setOnClickListener(new o00OO0O0.OooO00o(this, 3));
        getVm().getArea().observe(getViewLifecycleOwner(), new p142o00OOooO.o000O0o(this, 6));
        LiveEventBus.get("Recharge_Country_Temp").observe(this, new p142o00OOooO.o000Oo0(this, 10));
        int i = 0;
        p563o0oOo0.o000000O o0000o2 = null;
        if (p516o0o0O000.OooOo.f42064OooO00o.OooO0Oo()) {
            TextView textView = getBinding().f49809OooO0oo;
            Intrinsics.checkNotNullExpressionValue(textView, "binding.tvTag");
            oOO00O.OooO00o(textView);
            TextView textView2 = getBinding().f49807OooO0o0;
            Intrinsics.checkNotNullExpressionValue(textView2, "binding.tvArea");
            oOO00O.OooO00o(textView2);
            Context context = getContext();
            if (context != null) {
                o0000o2 = new p563o0oOo0.o000000O(context, 0, 2, null);
            }
        } else {
            TextView textView3 = getBinding().f49809OooO0oo;
            Intrinsics.checkNotNullExpressionValue(textView3, "binding.tvTag");
            oOO00O.OooO(textView3);
            TextView textView4 = getBinding().f49807OooO0o0;
            Intrinsics.checkNotNullExpressionValue(textView4, "binding.tvArea");
            oOO00O.OooO(textView4);
            Context context2 = getContext();
            if (context2 != null) {
                o0000o2 = new p563o0oOo0.o0000O(context2);
            }
        }
        this.adapter = o0000o2;
        if (o0000o2 != null) {
            o0000o2.f44982OooO0O0 = new OooOOO();
        }
        getBinding().f49804OooO0OO.setLayoutManager(new FixLinearLayoutManager(getActivity()));
        StateLayout stateLayout = getBinding().f49805OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new OooOOOO(), 3);
        getBinding().f49806OooO0o.setOnClickListener(new j3(this, i));
        getBinding().f49804OooO0OO.setAdapter(this.adapter);
        getBinding().f49805OooO0Oo.OooO0oo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: iniView$lambda-12, reason: not valid java name */
    public static final void m434iniView$lambda12(WalletCoinFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        UserCountrySelectActivity.OooOoO(this$0.getContext(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: iniView$lambda-14, reason: not valid java name */
    public static final void m435iniView$lambda14(WalletCoinFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0O00000.OooO0OO("Me_recharge_award");
        SharedUrlManager.INSTANCE.getFirstChargeRewardUrl().observe(this$0.requireActivity(), new p159o00OoOO.o00000O(this$0, 6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: iniView$lambda-14$lambda-13, reason: not valid java name */
    public static final void m436iniView$lambda14$lambda13(WalletCoinFragment this$0, String url) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (url == null || StringsKt.isBlank(url)) {
            return;
        }
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FirstChargeRewardUrlWallet);
        Intrinsics.checkNotNullExpressionValue(url, "url");
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f21217Oooo0oO = url;
        webPageInfo.f21220OoooO0 = true;
        WebActivity.OooO00o oooO00o = WebActivity.f22108OoooooO;
        FragmentActivity fragmentActivityRequireActivity = this$0.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        oooO00o.OooO00o(fragmentActivityRequireActivity, webPageInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: iniView$lambda-15, reason: not valid java name */
    public static final void m437iniView$lambda15(WalletCoinFragment this$0, CountryModel countryModel) {
        String string;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        TextView textView = this$0.getBinding().f49807OooO0o0;
        if (countryModel == null || (string = countryModel.getName()) == null) {
            string = this$0.getString(R.string.Space);
        }
        textView.setText(string);
        this$0.getBinding().f49805OooO0Oo.OooO0oo();
        this$0.loadShopList(countryModel != null ? countryModel.getCid() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: iniView$lambda-16, reason: not valid java name */
    public static final void m438iniView$lambda16(WalletCoinFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MutableLiveData<CountryModel> area = this$0.getVm().getArea();
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.app.base.model.CountryModel");
        area.postValue((CountryModel) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: iniView$lambda-19, reason: not valid java name */
    public static final void m439iniView$lambda19(WalletCoinFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p606o0oo0O.OooOo.OooO0O0("105009");
        this$0.startHelperActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initViewFirstChargeReward() {
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        if (p497o0o00Oo.OooOOO0.OooO00o().OooOO0O() == 0) {
            ImageView imageView = getBinding().f49803OooO0O0;
            Intrinsics.checkNotNullExpressionValue(imageView, "binding.firstChargeReward");
            oOO00O.OooO00o(imageView);
            return;
        }
        ImageView imageView2 = getBinding().f49803OooO0O0;
        Intrinsics.checkNotNullExpressionValue(imageView2, "binding.firstChargeReward");
        oOO00O.OooO(imageView2);
        getBinding().f49803OooO0O0.setImageResource(R.drawable.ic_first_charge_monthly);
        p499o0o00OoO.o00oO0o o00oo0oOooO0OO = p497o0o00Oo.OooOOO0.OooO0OO();
        Objects.requireNonNull(o00oo0oOooO0OO);
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("isFirstChargeShow");
        sbOooO0o0.append(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue());
        if (o00oo0oOooO0OO.OooO00o(sbOooO0o0.toString(), false)) {
            return;
        }
        getBinding().f49803OooO0O0.setImageResource(R.drawable.ic_first_charge);
    }

    private final void loadShopList(String countryId) {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        BaseActivityK.OooOoo0((BaseActivityK) activity, null, 0L, 3, null);
        getVm().loadRechargeMenu(countryId).observe(this, new o0o0000.OooOo(new OooOo00(), new OooOo(), new Oooo000(countryId, this), false, 8));
    }

    public static /* synthetic */ void loadShopList$default(WalletCoinFragment walletCoinFragment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        walletCoinFragment.loadShopList(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reLoadData() {
        getBinding().f49805OooO0Oo.OooO0oo();
        CountryModel value = getVm().getArea().getValue();
        loadShopList(value != null ? value.getCid() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPageInfo(List<RechargeMenuType> list) {
        if (!list.isEmpty()) {
            getBinding().f49805OooO0Oo.setEmptyText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.no_data));
            calculatedMaxWidthForItemView(list);
            p563o0oOo0.o000000O o000000o2 = this.adapter;
            if (o000000o2 != null) {
                o000000o2.setNewData(list);
            }
            getBinding().f49805OooO0Oo.OooO0Oo();
            return;
        }
        getBinding().f49805OooO0Oo.setEmptyText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Recharge_Page_CopyUnder_maintenance));
        getBinding().f49805OooO0Oo.OooO0o0();
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        BaseActivityK baseActivityK = (BaseActivityK) activity;
        if (baseActivityK.isDestroyed()) {
            return;
        }
        baseActivityK.OooOoO();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRechargeErrorDialog(PayOrder model) {
        this.recharging = false;
        Context context = getContext();
        if (context != null) {
            oo0oOO0 oo0ooo0 = new oo0oOO0(context);
            if (this.errorCount >= 3) {
                String string = getString(R.string.Validation_Failed);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.Validation_Failed)");
                oo0ooo0.OooOooO(string);
                String string2 = getString(R.string.Validation_Failed_content);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.Validation_Failed_content)");
                oo0ooo0.OooOo0O(string2);
                String string3 = getString(R.string.Validation_Failed_Contact_Us);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.Validation_Failed_Contact_Us)");
                oo0ooo0.OooOoO0(string3);
                oo0ooo0.OooOo(new o000oOoO());
                String string4 = getString(R.string.Validate_Again);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.Validate_Again)");
                oo0ooo0.OooOOo0(string4);
                oo0ooo0.OooOo0o(new o0OoOo0(model));
            } else {
                String string5 = getString(R.string.Purchase_Validation_Failed);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(R.string.Purchase_Validation_Failed)");
                oo0ooo0.OooOooO(string5);
                String string6 = getString(R.string.Purchase_Validation_Failed_content);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(R.string.Purch…alidation_Failed_content)");
                oo0ooo0.OooOo0O(string6);
                String string7 = getString(R.string.Validate_Again);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(R.string.Validate_Again)");
                oo0ooo0.OooOOo0(string7);
                oo0ooo0.OooOo0o(new o00O0O(model));
            }
            oo0ooo0.OooOOO0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startHelperActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            SharedUrlManager.INSTANCE.getFeedBackUrl().observe(this, new p501o0o00o.o0ooOOo(activity, 6));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: startHelperActivity$lambda-26$lambda-25, reason: not valid java name */
    public static final void m440startHelperActivity$lambda26$lambda25(FragmentActivity it, String url) {
        Intrinsics.checkNotNullParameter(it, "$it");
        if (url == null || StringsKt.isBlank(url)) {
            return;
        }
        WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FAQ);
        Intrinsics.checkNotNullExpressionValue(url, "url");
        Intrinsics.checkNotNullParameter(url, "url");
        webPageInfo.f21217Oooo0oO = url;
        webPageInfo.OooO00o("isReply", AppEventsConstants.EVENT_PARAM_VALUE_NO);
        webPageInfo.OooO00o("region", String.valueOf(p168o00Ooo0.oo000o.OooO0O0()));
        p487o0o000oO.o0OOO0o o0ooo0o2 = p487o0o000oO.o0OOO0o.f40936OooO00o;
        webPageInfo.OooO00o("appVersion", p487o0o000oO.o0OOO0o.OooO0O0());
        StringBuilder sb = new StringBuilder();
        p487o0o000oO.o0Oo0oo o0oo0oo2 = p487o0o000oO.o0Oo0oo.f40947OooO00o;
        sb.append(p487o0o000oO.o0Oo0oo.OooO0O0());
        sb.append(' ');
        sb.append(p487o0o000oO.o0Oo0oo.OooO0OO());
        webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, sb.toString());
        webPageInfo.OooO00o("sysVersion", p487o0o000oO.o0Oo0oo.OooO0Oo());
        webPageInfo.OooO00o("internet", NetWork.OooO00o().toString());
        webPageInfo.OooO00o("faqTag", String.valueOf(FaqTag.RechargeOrSubscription.getValue()));
        WebActivity.f22108OoooooO.OooO00o(it, webPageInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean toConsumeOrder(PayOrder payOrder) {
        this.recharging = true;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new o00Oo0(payOrder, null), 2, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toPay(RechargeMenuToPayModel model) {
        if (StringsKt.isBlank(model.getOrderid())) {
            this.recharging = false;
        } else {
            this.recharging = true;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new o00Ooo(model, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toQuerySkuDetails(List<RechargeMenuType> list) {
        Object next;
        Object next2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (p516o0o0O000.OooOo.f42064OooO00o.OooO0Oo()) {
            ArrayList arrayList = new ArrayList();
            int num = PaySupportChannels.pay_type_googlePay.getNum();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((RechargeMenuType) it.next()).getSku());
            }
            linkedHashMap.put(Integer.valueOf(num), arrayList);
        } else {
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            Iterator<T> it2 = list.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!(((RechargeMenuType) next).getType() == PaySupportChannels.pay_type_googlePay.getNum()));
            RechargeMenuType rechargeMenuType = (RechargeMenuType) next;
            if (rechargeMenuType != null) {
                Iterator<T> it3 = rechargeMenuType.getShoplist().iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((RechargeMenuType) it3.next()).getSku());
                }
                linkedHashMap.put(Integer.valueOf(rechargeMenuType.getType()), arrayList2);
            }
            Iterator<T> it4 = list.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!(((RechargeMenuType) next2).getType() == PaySupportChannels.pay_type_huaWeiPay.getNum()));
            RechargeMenuType rechargeMenuType2 = (RechargeMenuType) next2;
            if (rechargeMenuType2 != null) {
                Iterator<T> it5 = rechargeMenuType2.getShoplist().iterator();
                while (it5.hasNext()) {
                    arrayList3.add(((RechargeMenuType) it5.next()).getSku());
                }
                linkedHashMap.put(Integer.valueOf(rechargeMenuType2.getType()), arrayList3);
            }
        }
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new oo000o(linkedHashMap, this, list, null), 2, null);
    }

    private final void toWebRechargePage(RechargeMenuCreateOrderModel model) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Mintroute_Recharge);
            webPageInfo.OooO0Oo(model.getPayurl());
            webPageInfo.OooO00o("coin", String.valueOf(model.getCoin()));
            webPageInfo.OooO00o("amount", String.valueOf(model.getAmount()));
            webPageInfo.OooO00o("sku", model.getSku());
            p487o0o000oO.o0Oo0oo o0oo0oo2 = p487o0o000oO.o0Oo0oo.f40947OooO00o;
            webPageInfo.OooO00o("devicestr", p487o0o000oO.o0Oo0oo.OooO00o());
            webPageInfo.OooO00o("region", String.valueOf(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOOO().getValue()));
            WebActivity.f22108OoooooO.OooO00o(activity, webPageInfo);
        }
    }

    @Nullable
    public final Function1<RechargeMenuCreateOrderModel, Unit> getSelectItemListener() {
        return this.selectItemListener;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        getPayManager().onActivityResult(requestCode, resultCode, data);
        LiveEventBus.get("NOTIFICATION_UPDATE_REMINDER").post(null);
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        iniView();
        checkOrderStateGooglePay();
        checkOrderStateHuaWeiPay();
        initViewFirstChargeReward();
    }

    public final void setSelectItemListener(@Nullable Function1<? super RechargeMenuCreateOrderModel, Unit> function1) {
        this.selectItemListener = function1;
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public ji getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ji jiVarInflate = ji.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(jiVarInflate, "inflate(inflater, container, false)");
        return jiVarInflate;
    }
}
