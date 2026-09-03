package com.yalla.yalla.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Looper;
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
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.android.billingclient.api.SkuDetails;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.google.firebase.remoteconfig.RemoteConfigConstants$RequestFieldKey;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.model.CountryModel;
import com.yalla.yalla.model.FaqTag;
import com.yalla.yalla.model.RechargeMenuBanType;
import com.yalla.yalla.model.RechargeMenuConfirmOrderResultModel;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.model.RechargeMenuCreateOrderResultModel;
import com.yalla.yalla.model.RechargeMenuModel;
import com.yalla.yalla.model.RechargeMenuPayResultModel;
import com.yalla.yalla.model.RechargeMenuToPayModel;
import com.yalla.yalla.model.RechargeMenuType;
import com.yalla.yalla.model.WebFrom;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.main.WebActivity;
import com.yalla.yalla.ui.activity.user.UserCountrySelectActivity;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.WalletCoinVM;
import com.yalla.yalla.util.PaySupportChannels;
import com.yalla.yalla.util.WebPageInfo;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Function;
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
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.o2;
import p414o0Oo0oO.oO0OoOO0;
import p475o0Ooooo0.o0O00oO0;
import p497o0o00OoO.o00O0O0O;
import p590o0oOooo0.a0;
import p590o0oOooo0.oOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bP\u0010QJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\t\u001a\u00020\bH\u0014J\"\u0010\u000f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\b\u0010\u0010\u001a\u00020\bH\u0002J\u0014\u0010\u0013\u001a\u00020\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002J\u0016\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0016\u0010\u0018\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\u0016\u0010\u0019\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010\u001a\u001a\u00020\bH\u0002J\u0010\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010\u001f\u001a\u00020\bH\u0002J\u0010\u0010!\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020 H\u0002J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\"H\u0002J\b\u0010(\u001a\u00020\bH\u0002J\b\u0010)\u001a\u00020\bH\u0002J\u0010\u0010*\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\"H\u0002J\u0010\u0010+\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\b\u0010,\u001a\u00020\bH\u0002J\u0018\u0010-\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014H\u0003R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001b\u00108\u001a\u0002048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010<\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010;R\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020D0\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR?\u0010J\u001a\u001f\u0012\u0013\u0012\u00110\u001b¢\u0006\f\bH\u0012\b\bI\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\b\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010O¨\u0006R"}, d2 = {"Lcom/yalla/yalla/ui/fragment/WalletCoinFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/o2;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "", "onLazyInit", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "initViewFirstChargeReward", "", "countryId", "loadShopList", "", "Lcom/yalla/yalla/model/RechargeMenuType;", "list", "toQuerySkuDetails", "deleteDataBan", "showPageInfo", "iniView", "Lcom/yalla/yalla/model/RechargeMenuCreateOrderModel;", DeviceRequestsHelper.DEVICE_INFO_MODEL, "createOrder", "goodsUnderMaintenanceDialog", "reLoadData", "Lcom/yalla/yalla/model/RechargeMenuToPayModel;", "toPay", "Lcom/yalla/yalla/data/db/table/PayOrder;", "payOrder", "", "toConsumeOrder", "(Lcom/yalla/yalla/data/db/table/PayOrder;)Ljava/lang/Boolean;", "confirmRechargeOrder", "checkOrderStateGooglePay", "checkOrderStateHuaWeiPay", "showRechargeErrorDialog", "toWebRechargePage", "startHelperActivity", "calculatedMaxWidthForItemView", "Lcom/yalla/yalla/ui/vm/WalletCoinVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/WalletCoinVM;", "vm", "Lcom/yalla/yalla/common/manager/PayManager;", "payManager$delegate", "getPayManager", "()Lcom/yalla/yalla/common/manager/PayManager;", "payManager", "Lo0OoOO/Oooo000;", "fixRechargeOrderManagerGooglePay", "Lo0OoOO/Oooo000;", "fixRechargeOrderManagerHuaWeiPay", "Lcom/yalla/yalla/ui/adapter/o00Ooo;", "adapter", "Lcom/yalla/yalla/ui/adapter/o00Ooo;", "recharging", "Z", "errorCount", "I", "Lcom/yalla/yalla/model/RechargeMenuBanType;", "rechargeBanList", "Ljava/util/List;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "selectItemListener", "Lkotlin/jvm/functions/Function1;", "getSelectItemListener", "()Lkotlin/jvm/functions/Function1;", "setSelectItemListener", "(Lkotlin/jvm/functions/Function1;)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWalletCoinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletCoinFragment.kt\ncom/yalla/yalla/ui/fragment/WalletCoinFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,764:1\n106#2,15:765\n1855#3,2:780\n1855#3,2:783\n1855#3,2:785\n1855#3:787\n1864#3,3:788\n1855#3,2:791\n1856#3:793\n1#4:782\n*S KotlinDebug\n*F\n+ 1 WalletCoinFragment.kt\ncom/yalla/yalla/ui/fragment/WalletCoinFragment\n*L\n63#1:765,15\n138#1:780,2\n146#1:783,2\n152#1:785,2\n195#1:787\n212#1:788,3\n230#1:791,2\n195#1:793\n*E\n"})
public final class WalletCoinFragment extends p527o0o0OO0o.o000O<o2> {
    public static final int $stable = 8;

    @Nullable
    private com.yalla.yalla.ui.adapter.o00Ooo adapter;
    private int errorCount;

    @Nullable
    private p429o0OoOO.Oooo000 fixRechargeOrderManagerGooglePay;

    @Nullable
    private p429o0OoOO.Oooo000 fixRechargeOrderManagerHuaWeiPay;

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

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuCreateOrderModel f27839OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
            super(1);
            this.f27839OooO0o0 = rechargeMenuCreateOrderModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RechargeMenuCreateOrderResultModel rechargeMenuCreateOrderResultModel) {
            RechargeMenuCreateOrderResultModel rechargeMenuCreateOrderResultModel2 = rechargeMenuCreateOrderResultModel;
            WalletCoinFragment walletCoinFragment = WalletCoinFragment.this;
            if (rechargeMenuCreateOrderResultModel2 == null || StringsKt.isBlank(rechargeMenuCreateOrderResultModel2.getOrderid())) {
                walletCoinFragment.recharging = false;
            } else {
                RechargeMenuToPayModel rechargeMenuToPayModel = new RechargeMenuToPayModel();
                RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel = this.f27839OooO0o0;
                rechargeMenuToPayModel.setSku(rechargeMenuCreateOrderModel.getSku());
                rechargeMenuToPayModel.setType(rechargeMenuCreateOrderModel.getType());
                rechargeMenuToPayModel.setSkuDetails(rechargeMenuCreateOrderModel.getSkuDetails());
                rechargeMenuToPayModel.setProductDetails(rechargeMenuCreateOrderModel.getProductDetails());
                rechargeMenuToPayModel.setUnit(rechargeMenuCreateOrderModel.getUnit());
                rechargeMenuToPayModel.setPmId(rechargeMenuCreateOrderModel.getPmId());
                rechargeMenuToPayModel.setOrderid(rechargeMenuCreateOrderResultModel2.getOrderid());
                rechargeMenuToPayModel.setCoin(rechargeMenuCreateOrderModel.getCoin());
                rechargeMenuToPayModel.setAmount(rechargeMenuCreateOrderModel.getAmount());
                walletCoinFragment.toPay(rechargeMenuToPayModel);
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
                baseActivityK.OooOo0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<RechargeMenuConfirmOrderResultModel, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f27842OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(PayOrder payOrder) {
            super(1);
            this.f27842OooO0o0 = payOrder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel) {
            Long balance;
            RechargeMenuConfirmOrderResultModel rechargeMenuConfirmOrderResultModel2 = rechargeMenuConfirmOrderResultModel;
            LiveEventBus.get("ConfirmRechargeOrder_Success").post(Boolean.TRUE);
            if (rechargeMenuConfirmOrderResultModel2 != null && (balance = rechargeMenuConfirmOrderResultModel2.getBalance()) != null) {
                long jLongValue = balance.longValue();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0O00oO0.OooO0O0().setValue(Long.valueOf(jLongValue));
            }
            boolean z = true;
            p415o0Oo0oO0.o00Ooo.OooO0OO().OooOO0O(true);
            WalletCoinFragment walletCoinFragment = WalletCoinFragment.this;
            walletCoinFragment.initViewFirstChargeReward();
            WalletCoinVM vm = walletCoinFragment.getVm();
            PayOrder payOrder = this.f27842OooO0o0;
            vm.deleteOrderToDB(payOrder.getOrderId());
            String string = walletCoinFragment.getString(p562o0oOo000.o000000.Purchase_successful);
            if (string != null && !StringsKt.isBlank(string)) {
                z = false;
            }
            if (!z) {
                com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(string, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                } else {
                    com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                }
            }
            WalletCoinVM vm2 = walletCoinFragment.getVm();
            Double amount = payOrder.getAmount();
            String sku = payOrder.getSku();
            com.yalla.yalla.ui.adapter.o00Ooo o00ooo2 = walletCoinFragment.adapter;
            vm2.onConfirmOrderSuccessUploadLog(amount, sku, o00ooo2 != null ? o00ooo2.f13189OooOOoo : null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ PayOrder f27843OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ WalletCoinFragment f27844OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(WalletCoinFragment walletCoinFragment, PayOrder payOrder) {
            super(1);
            this.f27843OooO0Oo = payOrder;
            this.f27844OooO0o0 = walletCoinFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            int code = it.getCode();
            PayOrder payOrder = this.f27843OooO0Oo;
            payOrder.setErrorCode(code);
            WalletCoinFragment walletCoinFragment = this.f27844OooO0o0;
            walletCoinFragment.getVm().onConfirmOrderErrorUploadLog(payOrder);
            walletCoinFragment.errorCount++;
            walletCoinFragment.showRechargeErrorDialog(payOrder);
            int code2 = it.getCode();
            if (code2 == 2000 || code2 == 2005) {
                p415o0Oo0oO0.o00Ooo.OooO0OO().OooOO0O(true);
                walletCoinFragment.initViewFirstChargeReward();
                walletCoinFragment.getVm().deleteOrderToDB(payOrder.getOrderId());
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
            WalletCoinFragment walletCoinFragment = WalletCoinFragment.this;
            walletCoinFragment.recharging = false;
            FragmentActivity activity = walletCoinFragment.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            ((BaseActivityK) activity).OooOo0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuCreateOrderModel f27847OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
            super(1);
            this.f27847OooO0o0 = rechargeMenuCreateOrderModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError error = apiError;
            Intrinsics.checkNotNullParameter(error, "it");
            WalletCoinFragment walletCoinFragment = WalletCoinFragment.this;
            walletCoinFragment.recharging = false;
            if (error.getCode() == 3003) {
                walletCoinFragment.goodsUnderMaintenanceDialog(this.f27847OooO0o0);
            } else {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new p381o0OOoOo0.Oooo000(error, null), 3, null);
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
            ((BaseActivityK) activity).OooOo0();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<String, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String url = str;
            if (!(url == null || StringsKt.isBlank(url))) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FirstChargeRewardUrlWallet);
                Intrinsics.checkNotNull(url);
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f32283OooO0o0 = url;
                webPageInfo.f32280OooO = true;
                int i = WebActivity.f25130OooOoO0;
                FragmentActivity fragmentActivityRequireActivity = WalletCoinFragment.this.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                WebActivity.OooO00o.OooO00o(fragmentActivityRequireActivity, webPageInfo);
            }
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

    public static final class OooOOOO extends Lambda implements Function1<CountryModel, Unit> {
        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(CountryModel countryModel) {
            String string;
            CountryModel countryModel2 = countryModel;
            WalletCoinFragment walletCoinFragment = WalletCoinFragment.this;
            TextView textView = walletCoinFragment.getBinding().f44705OooO0o0;
            if (countryModel2 == null || (string = countryModel2.getName()) == null) {
                string = walletCoinFragment.getString(p562o0oOo000.o000000.Space);
            }
            textView.setText(string);
            walletCoinFragment.getBinding().f44703OooO0Oo.OooO0oo();
            walletCoinFragment.loadShopList(countryModel2 != null ? countryModel2.getCid() : null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function0<Unit> {
        public OooOo() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            WalletCoinFragment.this.reLoadData();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<RechargeMenuCreateOrderModel, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
            RechargeMenuCreateOrderModel it = rechargeMenuCreateOrderModel;
            Intrinsics.checkNotNullParameter(it, "it");
            WalletCoinFragment walletCoinFragment = WalletCoinFragment.this;
            Function1<RechargeMenuCreateOrderModel, Unit> selectItemListener = walletCoinFragment.getSelectItemListener();
            if (selectItemListener != null) {
                selectItemListener.invoke(it);
            }
            walletCoinFragment.createOrder(it);
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<ApiError, Unit> {
        public Oooo0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            WalletCoinFragment.this.getBinding().f44703OooO0Oo.OooO0o();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<RechargeMenuModel, Unit> {
        public Oooo000() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RechargeMenuModel rechargeMenuModel) {
            RechargeMenuModel rechargeMenuModel2 = rechargeMenuModel;
            WalletCoinFragment walletCoinFragment = WalletCoinFragment.this;
            if (rechargeMenuModel2 == null || rechargeMenuModel2.getData().isEmpty()) {
                walletCoinFragment.getBinding().f44703OooO0Oo.OooO0o0();
            } else {
                walletCoinFragment.rechargeBanList.clear();
                walletCoinFragment.rechargeBanList.addAll(rechargeMenuModel2.getDataBan());
                walletCoinFragment.toQuerySkuDetails(rechargeMenuModel2.getData());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function1<ApiResult<RechargeMenuModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ String f27856OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ WalletCoinFragment f27857OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(WalletCoinFragment walletCoinFragment, String str) {
            super(1);
            this.f27856OooO0Oo = str;
            this.f27857OooO0o0 = walletCoinFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<RechargeMenuModel> apiResult) {
            ApiResult<RechargeMenuModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            String str = this.f27856OooO0Oo;
            if (!(str == null || StringsKt.isBlank(str))) {
                FragmentActivity activity = this.f27857OooO0o0.getActivity();
                Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
                BaseActivityK baseActivityK = (BaseActivityK) activity;
                if (!baseActivityK.isDestroyed()) {
                    baseActivityK.OooOo0();
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o00O0O implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27858OooO0Oo;

        public o00O0O(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27858OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27858OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27858OooO0Oo;
        }

        public final int hashCode() {
            return this.f27858OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27858OooO0Oo.invoke(obj);
        }
    }

    public static final class o00Oo0 extends Lambda implements Function0<Unit> {
        public o00Oo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            WalletCoinFragment.this.startHelperActivity();
            return Unit.INSTANCE;
        }
    }

    public static final class o00Ooo extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f27861OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00Ooo(PayOrder payOrder) {
            super(0);
            this.f27861OooO0o0 = payOrder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            WalletCoinFragment walletCoinFragment = WalletCoinFragment.this;
            FragmentActivity activity = walletCoinFragment.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            BaseActivityK.OooOo0o((BaseActivityK) activity, walletCoinFragment.getString(p562o0oOo000.o000000.Validating_your_purchase), 0L, 2);
            PayOrder payOrder = this.f27861OooO0o0;
            if (payOrder.getIsConsume()) {
                walletCoinFragment.confirmRechargeOrder(payOrder);
                return null;
            }
            walletCoinFragment.toConsumeOrder(payOrder);
            return null;
        }
    }

    public static final class o00oO0o extends Lambda implements Function1<String, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ FragmentActivity f27862OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o00oO0o(FragmentActivity fragmentActivity) {
            super(1);
            this.f27862OooO0Oo = fragmentActivity;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String url = str;
            if (!(url == null || StringsKt.isBlank(url))) {
                WebPageInfo webPageInfo = new WebPageInfo(WebFrom.FAQ);
                Intrinsics.checkNotNull(url);
                Intrinsics.checkNotNullParameter(url, "url");
                webPageInfo.f32283OooO0o0 = url;
                webPageInfo.OooO00o("isReply", AppEventsConstants.EVENT_PARAM_VALUE_NO);
                webPageInfo.OooO00o("region", String.valueOf(p595o0oo00O.OooOo00.OooO0OO()));
                webPageInfo.OooO00o(RemoteConfigConstants$RequestFieldKey.APP_VERSION, p386o0OOooO.oo0o0Oo.OooO0Oo());
                webPageInfo.OooO00o(DeviceRequestsHelper.DEVICE_INFO_MODEL, p386o0OOooO.o000000.OooO0O0() + ZegoConstants.ZegoVideoDataAuxPublishingStream + p386o0OOooO.o000000.OooO0OO());
                webPageInfo.OooO00o("sysVersion", p386o0OOooO.o000000.OooO0Oo());
                webPageInfo.OooO00o("internet", a0.OooO00o().toString());
                webPageInfo.OooO00o("faqTag", String.valueOf(FaqTag.RechargeOrSubscription.getValue()));
                int i = WebActivity.f25130OooOoO0;
                FragmentActivity it = this.f27862OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(it, "$it");
                WebActivity.OooO00o.OooO00o(it, webPageInfo);
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.WalletCoinFragment$toPay$1", f = "WalletCoinFragment.kt", i = {}, l = {409, 413}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0OOO0o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f27863OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ RechargeMenuToPayModel f27864OooO0o;

        @DebugMetadata(c = "com.yalla.yalla.ui.fragment.WalletCoinFragment$toPay$1$1", f = "WalletCoinFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ RechargeMenuPayResultModel f27866OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ WalletCoinFragment f27867OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(RechargeMenuPayResultModel rechargeMenuPayResultModel, WalletCoinFragment walletCoinFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f27866OooO0Oo = rechargeMenuPayResultModel;
                this.f27867OooO0o0 = walletCoinFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f27866OooO0Oo, this.f27867OooO0o0, continuation);
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
                RechargeMenuPayResultModel rechargeMenuPayResultModel = this.f27866OooO0Oo;
                boolean zIsSuccess = rechargeMenuPayResultModel.getIsSuccess();
                WalletCoinFragment walletCoinFragment = this.f27867OooO0o0;
                boolean z = true;
                if (zIsSuccess) {
                    p598o0oo00Oo.o0000O00.OooO0O0("确认订单和消单 orderid:" + rechargeMenuPayResultModel.getOrderid() + " purchaseToken: " + rechargeMenuPayResultModel.getPurchasetoken());
                    FragmentActivity activity = walletCoinFragment.getActivity();
                    Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
                    BaseActivityK.OooOo0o((BaseActivityK) activity, walletCoinFragment.getString(p562o0oOo000.o000000.Validating_your_purchase), 0L, 2);
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
                    walletCoinFragment.getVm().saveOrderToDB(payOrder);
                    walletCoinFragment.toConsumeOrder(payOrder);
                } else {
                    walletCoinFragment.recharging = false;
                    p598o0oo00Oo.o0000O00.OooO("支付失败 " + rechargeMenuPayResultModel.getErrorCode() + ZegoConstants.ZegoVideoDataAuxPublishingStream + rechargeMenuPayResultModel.getErrorMessage());
                    PayOrder payOrder2 = new PayOrder();
                    payOrder2.setOrderId(rechargeMenuPayResultModel.getOrderid());
                    payOrder2.setSku(rechargeMenuPayResultModel.getSku());
                    payOrder2.setType(rechargeMenuPayResultModel.getType());
                    walletCoinFragment.getVm().onBuyErrorUploadLog(payOrder2);
                    int type = rechargeMenuPayResultModel.getType();
                    if (type == PaySupportChannels.pay_type_googlePay.getNum()) {
                        int errorCode = rechargeMenuPayResultModel.getErrorCode();
                        if (errorCode == -103) {
                            String string = walletCoinFragment.getString(p562o0oOo000.o000000.google_play_useless);
                            if (string != null && !StringsKt.isBlank(string)) {
                                z = false;
                            }
                            if (!z) {
                                com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(string, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o000oo0OooO00o.run();
                                } else {
                                    com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                                }
                            }
                        } else if (errorCode != -101) {
                            if (rechargeMenuPayResultModel.getErrorMessage().length() > 0) {
                                String errorMessage = rechargeMenuPayResultModel.getErrorMessage();
                                if (errorMessage != null && !StringsKt.isBlank(errorMessage)) {
                                    z = false;
                                }
                                if (!z) {
                                    com.code.android.util.o000Oo0 o000oo0OooO00o2 = androidx.activity.OooOo00.OooO00o(errorMessage, "runnable");
                                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                        o000oo0OooO00o2.run();
                                    } else {
                                        com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o2);
                                    }
                                }
                            }
                        } else {
                            String string2 = walletCoinFragment.getString(p562o0oOo000.o000000.google_play_useless);
                            if (string2 != null && !StringsKt.isBlank(string2)) {
                                z = false;
                            }
                            if (!z) {
                                com.code.android.util.o000Oo0 o000oo0OooO00o3 = androidx.activity.OooOo00.OooO00o(string2, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o000oo0OooO00o3.run();
                                } else {
                                    com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o3);
                                }
                            }
                        }
                    } else if (type == PaySupportChannels.pay_type_huaWeiPay.getNum()) {
                        if (rechargeMenuPayResultModel.getErrorMessage().length() > 0) {
                            String errorMessage2 = rechargeMenuPayResultModel.getErrorMessage();
                            if (errorMessage2 != null && !StringsKt.isBlank(errorMessage2)) {
                                z = false;
                            }
                            if (!z) {
                                com.code.android.util.o000Oo0 o000oo0OooO00o4 = androidx.activity.OooOo00.OooO00o(errorMessage2, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o000oo0OooO00o4.run();
                                } else {
                                    com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o4);
                                }
                            }
                        }
                    } else if (type != PaySupportChannels.pay_type_payssionPay.getNum() && type == PaySupportChannels.pay_type_tapPay.getNum()) {
                        String errorMessage3 = rechargeMenuPayResultModel.getErrorMessage();
                        if ((!StringsKt.isBlank(errorMessage3)) && rechargeMenuPayResultModel.getErrorCode() != -106) {
                            if (errorMessage3 != null && !StringsKt.isBlank(errorMessage3)) {
                                z = false;
                            }
                            if (!z) {
                                com.code.android.util.o000Oo0 o000oo0OooO00o5 = androidx.activity.OooOo00.OooO00o(errorMessage3, "runnable");
                                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                                    o000oo0OooO00o5.run();
                                } else {
                                    com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o5);
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0OOO0o(RechargeMenuToPayModel rechargeMenuToPayModel, Continuation<? super o0OOO0o> continuation) {
            super(2, continuation);
            this.f27864OooO0o = rechargeMenuToPayModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WalletCoinFragment.this.new o0OOO0o(this.f27864OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0OOO0o) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f27863OooO0Oo;
            WalletCoinFragment walletCoinFragment = WalletCoinFragment.this;
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
            PayManager payManager = walletCoinFragment.getPayManager();
            RechargeMenuToPayModel rechargeMenuToPayModel = this.f27864OooO0o;
            this.f27863OooO0Oo = 1;
            obj = PayManager.pay$default(payManager, rechargeMenuToPayModel, null, this, 2, null);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            RechargeMenuPayResultModel rechargeMenuPayResultModel = (RechargeMenuPayResultModel) obj;
            RechargeMenuToPayModel rechargeMenuToPayModel2 = this.f27864OooO0o;
            rechargeMenuPayResultModel.setType(rechargeMenuToPayModel2.getType());
            rechargeMenuPayResultModel.setOrderid(rechargeMenuToPayModel2.getOrderid());
            rechargeMenuPayResultModel.setSku(rechargeMenuToPayModel2.getSku());
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o(rechargeMenuPayResultModel, walletCoinFragment, null);
            this.f27863OooO0Oo = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.WalletCoinFragment$toQuerySkuDetails$6", f = "WalletCoinFragment.kt", i = {0}, l = {162, 185}, m = "invokeSuspend", n = {"itemMap"}, s = {"L$3"})
    @SourceDebugExtension({"SMAP\nWalletCoinFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletCoinFragment.kt\ncom/yalla/yalla/ui/fragment/WalletCoinFragment$toQuerySkuDetails$6\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,764:1\n215#2:765\n216#2:771\n1855#3:766\n1856#3:768\n1855#3,2:769\n1#4:767\n*S KotlinDebug\n*F\n+ 1 WalletCoinFragment.kt\ncom/yalla/yalla/ui/fragment/WalletCoinFragment$toQuerySkuDetails$6\n*L\n161#1:765\n161#1:771\n164#1:766\n164#1:768\n174#1:769,2\n*E\n"})
    public static final class o0Oo0oo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO, reason: collision with root package name */
        public final /* synthetic */ Map<Integer, List<String>> f27868OooO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public WalletCoinFragment f27869OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public Iterator f27870OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public List f27871OooO0o0;

        /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
        public Map.Entry f27872OooO0oO;

        /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
        public int f27873OooO0oo;

        /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
        public final /* synthetic */ WalletCoinFragment f27874OooOO0;

        /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
        public final /* synthetic */ List<RechargeMenuType> f27875OooOO0O;

        @DebugMetadata(c = "com.yalla.yalla.ui.fragment.WalletCoinFragment$toQuerySkuDetails$6$2", f = "WalletCoinFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ WalletCoinFragment f27876OooO0Oo;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ List<RechargeMenuType> f27877OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(WalletCoinFragment walletCoinFragment, List<RechargeMenuType> list, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f27876OooO0Oo = walletCoinFragment;
                this.f27877OooO0o0 = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f27876OooO0Oo, this.f27877OooO0o0, continuation);
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
                WalletCoinFragment walletCoinFragment = this.f27876OooO0Oo;
                List<RechargeMenuType> list = this.f27877OooO0o0;
                walletCoinFragment.deleteDataBan(list);
                walletCoinFragment.showPageInfo(list);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0Oo0oo(Map<Integer, List<String>> map, WalletCoinFragment walletCoinFragment, List<RechargeMenuType> list, Continuation<? super o0Oo0oo> continuation) {
            super(2, continuation);
            this.f27868OooO = map;
            this.f27874OooOO0 = walletCoinFragment;
            this.f27875OooOO0O = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new o0Oo0oo(this.f27868OooO, this.f27874OooOO0, this.f27875OooOO0O, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0Oo0oo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0052  */
        /* JADX WARN: Code duplicated, block: B:17:0x007c A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:18:0x007d  */
        /* JADX WARN: Code duplicated, block: B:21:0x008f  */
        /* JADX WARN: Code duplicated, block: B:24:0x0099  */
        /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
        /* JADX WARN: Code duplicated, block: B:29:0x00af  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:40:0x00ec  */
        /* JADX WARN: Code duplicated, block: B:43:0x00f8  */
        /* JADX WARN: Code duplicated, block: B:45:0x010f  */
        /* JADX WARN: Code duplicated, block: B:46:0x0111  */
        /* JADX WARN: Code duplicated, block: B:52:0x011a  */
        /* JADX WARN: Code duplicated, block: B:53:0x011f  */
        /* JADX WARN: Code duplicated, block: B:55:0x0122  */
        /* JADX WARN: Code duplicated, block: B:58:0x012c  */
        /* JADX WARN: Code duplicated, block: B:63:0x0142  */
        /* JADX WARN: Code duplicated, block: B:80:0x00c5 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:82:0x0115 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:88:0x0138 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:89:0x015b A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:91:0x0126 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:92:0x0126 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:95:0x0156 A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007d -> B:19:0x0085). Please report as a decompilation issue!!! */
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
                Method dump skipped, instruction units count: 411
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yalla.yalla.ui.fragment.WalletCoinFragment.o0Oo0oo.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<PayManager> {
        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final PayManager invoke() {
            FragmentActivity fragmentActivityRequireActivity = WalletCoinFragment.this.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            return new PayManager(fragmentActivityRequireActivity);
        }
    }

    @DebugMetadata(c = "com.yalla.yalla.ui.fragment.WalletCoinFragment$toConsumeOrder$1", f = "WalletCoinFragment.kt", i = {}, l = {521, 522}, m = "invokeSuspend", n = {}, s = {})
    public static final class o0ooOOo extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public int f27879OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ PayOrder f27880OooO0o;

        @DebugMetadata(c = "com.yalla.yalla.ui.fragment.WalletCoinFragment$toConsumeOrder$1$1", f = "WalletCoinFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class OooO00o extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Boolean f27882OooO0Oo;

            /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
            public final /* synthetic */ WalletCoinFragment f27883OooO0o;

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ PayOrder f27884OooO0o0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(Boolean bool, PayOrder payOrder, WalletCoinFragment walletCoinFragment, Continuation<? super OooO00o> continuation) {
                super(2, continuation);
                this.f27882OooO0Oo = bool;
                this.f27884OooO0o0 = payOrder;
                this.f27883OooO0o = walletCoinFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new OooO00o(this.f27882OooO0Oo, this.f27884OooO0o0, this.f27883OooO0o, continuation);
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
                boolean zAreEqual = Intrinsics.areEqual(this.f27882OooO0Oo, Boxing.boxBoolean(true));
                PayOrder payOrder = this.f27884OooO0o0;
                WalletCoinFragment walletCoinFragment = this.f27883OooO0o;
                if (zAreEqual) {
                    payOrder.setConsume(true);
                    walletCoinFragment.getVm().updateOrderToDB(payOrder);
                    walletCoinFragment.errorCount = 0;
                    walletCoinFragment.confirmRechargeOrder(payOrder);
                } else {
                    walletCoinFragment.getVm().onConsumptionErrorUploadLog(payOrder);
                    FragmentActivity activity = walletCoinFragment.getActivity();
                    Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
                    ((BaseActivityK) activity).OooOo0();
                    walletCoinFragment.errorCount++;
                    walletCoinFragment.showRechargeErrorDialog(payOrder);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o0ooOOo(PayOrder payOrder, Continuation<? super o0ooOOo> continuation) {
            super(2, continuation);
            this.f27880OooO0o = payOrder;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return WalletCoinFragment.this.new o0ooOOo(this.f27880OooO0o, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((o0ooOOo) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f27879OooO0Oo;
            PayOrder payOrder = this.f27880OooO0o;
            WalletCoinFragment walletCoinFragment = WalletCoinFragment.this;
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
            PayManager payManager = walletCoinFragment.getPayManager();
            this.f27879OooO0Oo = 1;
            obj = payManager.consumeOrder(payOrder, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            MainCoroutineDispatcher main = Dispatchers.getMain();
            OooO00o oooO00o = new OooO00o((Boolean) obj, payOrder, walletCoinFragment, null);
            this.f27879OooO0Oo = 2;
            if (BuildersKt.withContext(main, oooO00o, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    public static final class oo000o extends Lambda implements Function0<Object> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PayOrder f27886OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public oo000o(PayOrder payOrder) {
            super(0);
            this.f27886OooO0o0 = payOrder;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final Object invoke() {
            WalletCoinFragment walletCoinFragment = WalletCoinFragment.this;
            FragmentActivity activity = walletCoinFragment.getActivity();
            Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            BaseActivityK.OooOo0o((BaseActivityK) activity, walletCoinFragment.getString(p562o0oOo000.o000000.Validating_your_purchase), 0L, 2);
            PayOrder payOrder = this.f27886OooO0o0;
            if (payOrder.getIsConsume()) {
                walletCoinFragment.confirmRechargeOrder(payOrder);
                return null;
            }
            walletCoinFragment.toConsumeOrder(payOrder);
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.WalletCoinFragment$special$$inlined$viewModels$default$1] */
    public WalletCoinFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.WalletCoinFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.WalletCoinFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(WalletCoinVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.WalletCoinFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return androidx.fragment.app.o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.WalletCoinFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27890OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27890OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.WalletCoinFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
        this.payManager = LazyKt.lazy(new o0OoOo0());
        this.rechargeBanList = new ArrayList();
    }

    @SuppressLint({"SetTextI18n", "NotifyDataSetChanged"})
    private final void calculatedMaxWidthForItemView(List<RechargeMenuType> data) {
        RechargeMenuType rechargeMenuType = null;
        int i = 1;
        if (oOO0.f57167OooO00o.OooO0OO()) {
            if (data == null || !(!data.isEmpty())) {
                return;
            }
            for (RechargeMenuType rechargeMenuType2 : data) {
                if (rechargeMenuType != null) {
                    int length = (rechargeMenuType.getUnit() + rechargeMenuType.getAmount()).length();
                    SkuDetails skuDetails = rechargeMenuType.getSkuDetails();
                    if (skuDetails != null) {
                        String strOooO0O0 = skuDetails.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(strOooO0O0, "getPriceCurrencyCode(...)");
                        length = p437o0OoOOo0.o000O0O0.OooO00o(skuDetails.OooO00o(), strOooO0O0).length();
                    }
                    int length2 = (rechargeMenuType2.getUnit() + rechargeMenuType2.getAmount()).length();
                    SkuDetails skuDetails2 = rechargeMenuType2.getSkuDetails();
                    if (skuDetails2 != null) {
                        String strOooO0O1 = skuDetails2.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(strOooO0O1, "getPriceCurrencyCode(...)");
                        length2 = p437o0OoOOo0.o000O0O0.OooO00o(skuDetails2.OooO00o(), strOooO0O1).length();
                    }
                    if (length < length2) {
                    }
                }
                rechargeMenuType = rechargeMenuType2;
            }
            if (rechargeMenuType != null) {
                final TextView textView = getBinding().f44706OooO0oO;
                String unit = rechargeMenuType.getUnit();
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                textView.setText(unit + ZegoConstants.ZegoVideoDataAuxPublishingStream + OooO0O0.OooO0O0.OooO00o(new Object[]{Double.valueOf(rechargeMenuType.getAmount())}, 1, "%.2f", "format(format, *args)"));
                SkuDetails skuDetails3 = rechargeMenuType.getSkuDetails();
                if (skuDetails3 != null) {
                    String strOooO0O2 = skuDetails3.OooO0O0();
                    Intrinsics.checkNotNullExpressionValue(strOooO0O2, "getPriceCurrencyCode(...)");
                    textView.setText(p437o0OoOOo0.o000O0O0.OooO00o(skuDetails3.OooO00o(), strOooO0O2));
                }
                textView.post(new Runnable() { // from class: com.yalla.yalla.ui.fragment.o000O
                    @Override // java.lang.Runnable
                    public final void run() {
                        WalletCoinFragment.calculatedMaxWidthForItemView$lambda$30$lambda$29$lambda$28$lambda$27(textView, this);
                    }
                });
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
                    int length3 = (rechargeMenuType.getUnit() + rechargeMenuType.getAmount()).length();
                    SkuDetails skuDetails4 = rechargeMenuType.getSkuDetails();
                    if (skuDetails4 != null) {
                        String strOooO0O3 = skuDetails4.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(strOooO0O3, "getPriceCurrencyCode(...)");
                        length3 = p437o0OoOOo0.o000O0O0.OooO00o(skuDetails4.OooO00o(), strOooO0O3).length();
                    }
                    int length4 = (rechargeMenuType3.getUnit() + rechargeMenuType3.getAmount()).length();
                    SkuDetails skuDetails5 = rechargeMenuType3.getSkuDetails();
                    if (skuDetails5 != null) {
                        String strOooO0O4 = skuDetails5.OooO0O0();
                        Intrinsics.checkNotNullExpressionValue(strOooO0O4, "getPriceCurrencyCode(...)");
                        length4 = p437o0OoOOo0.o000O0O0.OooO00o(skuDetails5.OooO00o(), strOooO0O4).length();
                    }
                    if (length3 < length4) {
                    }
                }
                rechargeMenuType = rechargeMenuType3;
            }
        }
        if (rechargeMenuType != null) {
            TextView textView2 = getBinding().f44706OooO0oO;
            String unit2 = rechargeMenuType.getUnit();
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            textView2.setText(unit2 + ZegoConstants.ZegoVideoDataAuxPublishingStream + OooO0O0.OooO0O0.OooO00o(new Object[]{Double.valueOf(rechargeMenuType.getAmount())}, 1, "%.2f", "format(format, *args)"));
            SkuDetails skuDetails6 = rechargeMenuType.getSkuDetails();
            if (skuDetails6 != null) {
                String strOooO0O5 = skuDetails6.OooO0O0();
                Intrinsics.checkNotNullExpressionValue(strOooO0O5, "getPriceCurrencyCode(...)");
                textView2.setText(p437o0OoOOo0.o000O0O0.OooO00o(skuDetails6.OooO00o(), strOooO0O5));
            }
            textView2.post(new p110o000ooo0.o0000Ooo(i, textView2, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculatedMaxWidthForItemView$lambda$30$lambda$29$lambda$28$lambda$27(TextView this_apply, WalletCoinFragment this$0) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int width = this_apply.getWidth();
        com.yalla.yalla.ui.adapter.o00Ooo o00ooo2 = this$0.adapter;
        if (o00ooo2 != null) {
            o00ooo2.f27155OooOoo0 = width;
        }
        if (o00ooo2 != null) {
            o00ooo2.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void calculatedMaxWidthForItemView$lambda$37$lambda$36$lambda$35$lambda$34(TextView this_apply, WalletCoinFragment this$0) {
        Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int width = this_apply.getWidth();
        com.yalla.yalla.ui.adapter.o00Ooo o00ooo2 = this$0.adapter;
        if (o00ooo2 != null) {
            o00ooo2.f27155OooOoo0 = width;
        }
        if (o00ooo2 != null) {
            o00ooo2.notifyDataSetChanged();
        }
    }

    private final void checkOrderStateGooglePay() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        this.fixRechargeOrderManagerGooglePay = new p429o0OoOO.Oooo000(fragmentActivityRequireActivity, getPayManager());
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        BaseActivityK.OooOo0o((BaseActivityK) activity, null, 0L, 3);
        p429o0OoOO.Oooo000 oooo000 = this.fixRechargeOrderManagerGooglePay;
        if (oooo000 != null) {
            oooo000.f46783OooO0OO = new OooO00o();
        }
        p429o0OoOO.Oooo000 oooo001 = this.fixRechargeOrderManagerGooglePay;
        if (oooo001 != null) {
            oooo001.OooO0OO(PaySupportChannels.pay_type_googlePay.getNum(), false);
        }
    }

    private final void checkOrderStateHuaWeiPay() {
        boolean z;
        if (oOO0.f57167OooO00o.OooO0OO()) {
            return;
        }
        Context context = requireContext();
        Intrinsics.checkNotNullExpressionValue(context, "requireContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            List<PackageInfo> installedPackages = context.getPackageManager().getInstalledPackages(0);
            Intrinsics.checkNotNullExpressionValue(installedPackages, "getInstalledPackages(...)");
            Iterator<T> it = installedPackages.iterator();
            z = false;
            while (it.hasNext()) {
                try {
                    String packageName = ((PackageInfo) it.next()).packageName;
                    Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
                    if (StringsKt__StringsKt.contains(packageName, "com.huawei.hwid", true)) {
                        z = true;
                    }
                } catch (Exception e) {
                    e = e;
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e = e2;
            z = false;
        }
        if (z) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            p429o0OoOO.Oooo000 oooo000 = new p429o0OoOO.Oooo000(fragmentActivityRequireActivity, getPayManager());
            this.fixRechargeOrderManagerHuaWeiPay = oooo000;
            oooo000.OooO0OO(PaySupportChannels.pay_type_huaWeiPay.getNum(), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void confirmRechargeOrder(PayOrder model) {
        this.recharging = true;
        getVm().confirmRechargeOrder(model).observe(getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new OooO0O0(model), new OooO0OO(this, model), new OooO0o(), false, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void createOrder(RechargeMenuCreateOrderModel model) {
        boolean z = true;
        if (model.getType() == PaySupportChannels.pay_type_googlePay.getNum()) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            if (!p429o0OoOO.o00Ooo.OooO0O0(fragmentActivityRequireActivity)) {
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.google_play_useless);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (z) {
                    return;
                }
                com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                    o000oo0OooO00o.run();
                    return;
                } else {
                    com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    return;
                }
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
        BaseActivityK.OooOo0o((BaseActivityK) activity, null, 0L, 3);
        getVm().createOrder(model).observe(getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new OooO(model), new OooOO0(model), new OooOO0O(), true));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteDataBan(List<RechargeMenuType> list) {
        for (RechargeMenuBanType rechargeMenuBanType : this.rechargeBanList) {
            if (oOO0.f57167OooO00o.OooO0OO()) {
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
        Context context = com.code.android.util.o000O00O.f13421OooO00o;
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(activityOooO0O0);
            o000o.OooOOoo(p562o0oOo000.o000000.Recharge_Page_CopyUnder_maintenance_Dialog);
            o000o.OooOOOO(p562o0oOo000.o000000.OK);
            o000o.OooOo0(new OooOOO0());
            o000o.OooOO0o();
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x00a5  */
    private final void iniView() {
        com.yalla.yalla.ui.adapter.o00Ooo o000ooo2;
        getBinding().f44705OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.o000OO00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WalletCoinFragment.iniView$lambda$12(this.f28393OooO0Oo, view);
            }
        });
        int i = 0;
        getBinding().f44701OooO0O0.setOnClickListener(new o000OOo0(this, i));
        getVm().getArea().observe(getViewLifecycleOwner(), new o00O0O(new OooOOOO()));
        LiveEventBus.get("Recharge_Country_Temp").observe(this, new o00O0O0O(this, 1));
        if (oOO0.f57167OooO00o.OooO0OO()) {
            TextView tvTag = getBinding().f44707OooO0oo;
            Intrinsics.checkNotNullExpressionValue(tvTag, "tvTag");
            com.code.android.util.o000O.OooO0O0(tvTag);
            TextView tvArea = getBinding().f44705OooO0o0;
            Intrinsics.checkNotNullExpressionValue(tvArea, "tvArea");
            com.code.android.util.o000O.OooO0O0(tvArea);
            Context context = getContext();
            if (context != null) {
                o000ooo2 = new com.yalla.yalla.ui.adapter.o00Ooo(context);
            } else {
                o000ooo2 = null;
            }
        } else {
            TextView tvTag2 = getBinding().f44707OooO0oo;
            Intrinsics.checkNotNullExpressionValue(tvTag2, "tvTag");
            com.code.android.util.o000O.OooOOOO(tvTag2);
            TextView tvArea2 = getBinding().f44705OooO0o0;
            Intrinsics.checkNotNullExpressionValue(tvArea2, "tvArea");
            com.code.android.util.o000O.OooOOOO(tvArea2);
            Context context2 = getContext();
            if (context2 != null) {
                o000ooo2 = new com.yalla.yalla.ui.adapter.o000OOo(context2);
            } else {
                o000ooo2 = null;
            }
        }
        this.adapter = o000ooo2;
        if (o000ooo2 != null) {
            o000ooo2.f27154OooOoo = new OooOo00();
        }
        getBinding().f44702OooO0OO.setLayoutManager(new FixLinearLayoutManager(getActivity()));
        StateLayout stateLayout = getBinding().f44703OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new OooOo(), 3);
        getBinding().f44704OooO0o.setOnClickListener(new o00(this, i));
        getBinding().f44702OooO0OO.setAdapter(this.adapter);
        getBinding().f44703OooO0Oo.OooO0oo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniView$lambda$12(WalletCoinFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        int i = UserCountrySelectActivity.f26735OooOoOO;
        UserCountrySelectActivity.OooO00o.OooO00o(this$0.getContext(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniView$lambda$13(WalletCoinFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0oo0000.OooO00o.OooO0O0("105026");
        p583o0oOoo00.o00000OO.f56673OooOOOo.observe(this$0.requireActivity(), new o00O0O(this$0.new OooOOO()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniView$lambda$14(WalletCoinFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        MutableLiveData<CountryModel> area = this$0.getVm().getArea();
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.CountryModel");
        area.postValue((CountryModel) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iniView$lambda$17(WalletCoinFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0oo0000.OooO00o.OooO0O0("105009");
        this$0.startHelperActivity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void initViewFirstChargeReward() {
        if (com.code.android.util.o000000.OooO00o(Integer.valueOf(p415o0Oo0oO0.o00Ooo.OooO00o().OooO0OO("firstRecharge", 0)))) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (!com.code.android.util.o0OoOo0.OooO00o((Boolean) ((MutableLiveData) o0O00oO0.f47974Oooo0o0.getValue()).getValue())) {
                ImageView firstChargeReward = getBinding().f44701OooO0O0;
                Intrinsics.checkNotNullExpressionValue(firstChargeReward, "firstChargeReward");
                com.code.android.util.o000O.OooOOOO(firstChargeReward);
                getBinding().f44701OooO0O0.setImageResource(p562o0oOo000.o0Oo0oo.ic_first_charge_monthly);
                oO0OoOO0 oo0oooo0OooO0OO = p415o0Oo0oO0.o00Ooo.OooO0OO();
                oo0oooo0OooO0OO.getClass();
                if (oo0oooo0OooO0OO.OooO0O0("isFirstChargeShow" + o0O00oO0.OooOOo0().getValue(), false)) {
                    return;
                }
                getBinding().f44701OooO0O0.setImageResource(p562o0oOo000.o0Oo0oo.ic_first_charge);
                return;
            }
        }
        ImageView firstChargeReward2 = getBinding().f44701OooO0O0;
        Intrinsics.checkNotNullExpressionValue(firstChargeReward2, "firstChargeReward");
        com.code.android.util.o000O.OooO0O0(firstChargeReward2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadShopList(String countryId) {
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        BaseActivityK.OooOo0o((BaseActivityK) activity, null, 0L, 3);
        getVm().loadRechargeMenu(countryId).observe(this, new p384o0OOoo0O.o000oOoO(new Oooo000(), new Oooo0(), new o000oOoO(this, countryId), false, 8));
    }

    public static /* synthetic */ void loadShopList$default(WalletCoinFragment walletCoinFragment, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        walletCoinFragment.loadShopList(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reLoadData() {
        getBinding().f44703OooO0Oo.OooO0oo();
        CountryModel value = getVm().getArea().getValue();
        loadShopList(value != null ? value.getCid() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showPageInfo(List<RechargeMenuType> list) {
        if (!list.isEmpty()) {
            getBinding().f44703OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.no_data));
            calculatedMaxWidthForItemView(list);
            com.yalla.yalla.ui.adapter.o00Ooo o00ooo2 = this.adapter;
            if (o00ooo2 != null) {
                o00ooo2.OooOoO0(list);
            }
            getBinding().f44703OooO0Oo.OooO0Oo();
            return;
        }
        getBinding().f44703OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Recharge_Page_CopyUnder_maintenance));
        getBinding().f44703OooO0Oo.OooO0o0();
        FragmentActivity activity = getActivity();
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        BaseActivityK baseActivityK = (BaseActivityK) activity;
        if (baseActivityK.isDestroyed()) {
            return;
        }
        baseActivityK.OooOo0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRechargeErrorDialog(PayOrder model) {
        this.recharging = false;
        Context context = getContext();
        if (context != null) {
            p205o00o0o0o.o000O o000o = new p205o00o0o0o.o000O(context);
            if (this.errorCount >= 3) {
                String string = getString(p562o0oOo000.o000000.Validation_Failed);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                o000o.OooOoO(string);
                String string2 = getString(p562o0oOo000.o000000.Validation_Failed_content);
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                o000o.OooOo00(string2);
                String string3 = getString(p562o0oOo000.o000000.Validation_Failed_Contact_Us);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                o000o.OooOo0o(string3);
                o000o.OooOo0O(new o00Oo0());
                String string4 = getString(p562o0oOo000.o000000.Validate_Again);
                Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                o000o.OooOOOo(string4);
                o000o.OooOo0(new o00Ooo(model));
            } else {
                String string5 = getString(p562o0oOo000.o000000.Purchase_Validation_Failed);
                Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
                o000o.OooOoO(string5);
                String string6 = getString(p562o0oOo000.o000000.Purchase_Validation_Failed_content);
                Intrinsics.checkNotNullExpressionValue(string6, "getString(...)");
                o000o.OooOo00(string6);
                String string7 = getString(p562o0oOo000.o000000.Validate_Again);
                Intrinsics.checkNotNullExpressionValue(string7, "getString(...)");
                o000o.OooOOOo(string7);
                o000o.OooOo0(new oo000o(model));
            }
            o000o.OooOO0o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startHelperActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            p583o0oOoo00.o00000OO.f56664OooO0o0.observe(this, new o00O0O(new o00oO0o(activity)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Boolean toConsumeOrder(PayOrder payOrder) {
        this.recharging = true;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new o0ooOOo(payOrder, null), 2, null);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toPay(RechargeMenuToPayModel model) {
        if (StringsKt.isBlank(model.getOrderid())) {
            this.recharging = false;
        } else {
            this.recharging = true;
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new o0OOO0o(model, null), 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void toQuerySkuDetails(List<RechargeMenuType> list) {
        Object next;
        Object next2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (oOO0.f57167OooO00o.OooO0OO()) {
            ArrayList arrayList = new ArrayList();
            int iOooO00o = PaySupportChannels.pay_type_googlePay.getNum();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((RechargeMenuType) it.next()).getSku());
            }
            linkedHashMap.put(Integer.valueOf(iOooO00o), arrayList);
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
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new o0Oo0oo(linkedHashMap, this, list, null), 2, null);
    }

    private final void toWebRechargePage(RechargeMenuCreateOrderModel model) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            WebPageInfo webPageInfo = new WebPageInfo(WebFrom.Mintroute_Recharge);
            webPageInfo.OooO0o0(model.getPayurl());
            webPageInfo.OooO00o("coin", String.valueOf(model.getCoin()));
            webPageInfo.OooO00o("amount", String.valueOf(model.getAmount()));
            webPageInfo.OooO00o("sku", model.getSku());
            webPageInfo.OooO00o("devicestr", p386o0OOooO.o000000.OooO00o());
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            webPageInfo.OooO00o("region", String.valueOf(o0O00oO0.OooOOO0().getValue()));
            int i = WebActivity.f25130OooOoO0;
            WebActivity.OooO00o.OooO00o(activity, webPageInfo);
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

    @Override // p586o0oOooO0.oO0Oo0o0
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

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public o2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o2 o2VarInflate = o2.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(o2VarInflate, "inflate(...)");
        return o2VarInflate;
    }
}
