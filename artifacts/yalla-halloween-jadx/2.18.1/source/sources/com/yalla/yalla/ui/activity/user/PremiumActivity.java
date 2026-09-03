package com.yalla.yalla.ui.activity.user;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.Window;
import android.widget.Button;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.model.VipCreateOrderResultModel;
import com.app.base.view.HeaderLayout;
import com.code.android.util.ToastUtil;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.common.db.table.PayOrder;
import com.yalla.yalla.common.manager.FixRechargeOrderManager;
import com.yalla.yalla.common.manager.GooglePaySubscriptionModel;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.common.manager.googlepay.GooglePaySkuDetail;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.RechargeMenuToPayModel;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.PremiumState;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.common.util.PaySupportChannels;
import com.yalla.yalla.common.vm.WalletCoinVM;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.model.PremiumTimeModel;
import com.yalla.yalla.model.RechargeBanType;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.vm.main.AristocracyVM;
import com.yalla.yalla.ui.vm.main.PremiumVM;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p130o00O0oo.o00oOoo;
import p139o00OOOo0.o000OOo0;
import p143o00OOooo.o00O0OOO;
import p143o00OOooo.o00OO;
import p143o00OOooo.o00OOO0O;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o00O000o;
import p255o00ooO0o.oo0oOO0;
import p478o0OooooO.oO0OoOO0;
import p515o0o0O00.o00O00;
import p524o0o0O0oO.o0O0O0O;
import p566o0oOo00O.o000O;
import p566o0oOo00O.o000OO00;
import p566o0oOo00O.o00O0;
import p566o0oOo00O.o00O0000;
import p566o0oOo00O.o00O00O;
import p566o0oOo00O.o00O00OO;
import p566o0oOo00O.o0O0ooO;
import p566o0oOo00O.oOO00O;
import p566o0oOo00O.oo00o;
import p579o0oOoOOo.x0;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.zh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/PremiumActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class PremiumActivity extends BaseActivityK {

    /* JADX INFO: renamed from: o0ooOOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23360o0ooOOo = new OooO00o();

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public PremiumTimeModel f23367Oooooo;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public int f23369OoooooO;

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f23370Ooooooo;

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public int f23371o00O0O;

    /* JADX INFO: renamed from: o00Oo0, reason: collision with root package name */
    public boolean f23372o00Oo0;

    /* JADX INFO: renamed from: o00Ooo, reason: collision with root package name */
    @Nullable
    public x0 f23373o00Ooo;

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public PayManager f23381ooOO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23361OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(zh.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23362Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PremiumVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.PremiumActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.PremiumActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.PremiumActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23401Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23401Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23363Ooooo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(WalletCoinVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.PremiumActivity$special$$inlined$viewModels$default$5
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.PremiumActivity$special$$inlined$viewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.PremiumActivity$special$$inlined$viewModels$default$6

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23405Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23405Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23364OooooO0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AristocracyVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.PremiumActivity$special$$inlined$viewModels$default$8
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.PremiumActivity$special$$inlined$viewModels$default$7
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.PremiumActivity$special$$inlined$viewModels$default$9

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23409Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23409Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final Lazy f23365OooooOO = LazyKt.lazy(o0OoOo0.f23398Oooo0o);

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final List<PremiumShopModel.PremiumInfo> f23366OooooOo = new ArrayList();

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final List<RechargeBanType> f23368Oooooo0 = new ArrayList();

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public PremiumLevel f23378o0OoOo0 = PremiumLevel.Premium0;

    /* JADX INFO: renamed from: o00o0O, reason: collision with root package name */
    @NotNull
    public final Lazy f23374o00o0O = LazyKt.lazy(OooO0OO.f23386Oooo0o);

    /* JADX INFO: renamed from: o00ooo, reason: collision with root package name */
    @NotNull
    public final Lazy f23377o00ooo = LazyKt.lazy(OooO0O0.f23385Oooo0o);

    /* JADX INFO: renamed from: oo000o, reason: collision with root package name */
    @NotNull
    public final Lazy f23380oo000o = LazyKt.lazy(OooO0o.f23387Oooo0o);

    /* JADX INFO: renamed from: o00oO0o, reason: collision with root package name */
    @NotNull
    public final Lazy f23376o00oO0o = LazyKt.lazy(Oooo0.f23395Oooo0o);

    /* JADX INFO: renamed from: o00oO0O, reason: collision with root package name */
    @NotNull
    public final Lazy f23375o00oO0O = LazyKt.lazy(o000oOoO.f23397Oooo0o);

    /* JADX INFO: renamed from: o0ooOO0, reason: collision with root package name */
    @NotNull
    public final Lazy f23379o0ooOO0 = LazyKt.lazy(Oooo000.f23396Oooo0o);

    public static final class OooO extends Lambda implements Function1<VipCreateOrderResultModel, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ PremiumShopModel.PremiumInfo f23383Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final /* synthetic */ GooglePaySubscriptionModel f23384Oooo0oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(PremiumShopModel.PremiumInfo premiumInfo, GooglePaySubscriptionModel googlePaySubscriptionModel) {
            super(1);
            this.f23383Oooo0oO = premiumInfo;
            this.f23384Oooo0oo = googlePaySubscriptionModel;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VipCreateOrderResultModel vipCreateOrderResultModel) {
            VipCreateOrderResultModel vipCreateOrderResultModel2 = vipCreateOrderResultModel;
            if (vipCreateOrderResultModel2 == null || StringsKt.isBlank(vipCreateOrderResultModel2.getOrderId())) {
                PremiumActivity.this.f23372o00Oo0 = false;
            } else if (!(vipCreateOrderResultModel2.isVIP() && StringsKt.isBlank(vipCreateOrderResultModel2.getAToken())) && (vipCreateOrderResultModel2.isVIP() || !(!StringsKt.isBlank(vipCreateOrderResultModel2.getAToken())))) {
                RechargeMenuToPayModel rechargeMenuToPayModel = new RechargeMenuToPayModel();
                rechargeMenuToPayModel.setType(PaySupportChannels.pay_type_googlePay.getNum());
                rechargeMenuToPayModel.setSku(this.f23383Oooo0oO.getSku());
                GooglePaySkuDetail googlePaySkuDetail = this.f23383Oooo0oO.getGooglePaySkuDetail();
                if (googlePaySkuDetail != null) {
                    rechargeMenuToPayModel.setSku(googlePaySkuDetail.getSku());
                    rechargeMenuToPayModel.setSkuDetails(googlePaySkuDetail.getDetail());
                    rechargeMenuToPayModel.setAmount(googlePaySkuDetail.getAmount());
                    rechargeMenuToPayModel.setUnit(googlePaySkuDetail.getUnit());
                }
                rechargeMenuToPayModel.setOrderid(vipCreateOrderResultModel2.getOrderId());
                this.f23384Oooo0oo.setOldPurchaseToken(vipCreateOrderResultModel2.getAToken());
                PremiumShopModel.ChannelSKU channelSKU = this.f23383Oooo0oO.getChannelSKU();
                if (channelSKU != null) {
                    p516o0o0O000.OooOo oooOo = p516o0o0O000.OooOo.f42064OooO00o;
                    if (oooOo.OooO0O0() && oooOo.OooO0OO(channelSKU.getSku())) {
                        rechargeMenuToPayModel.setType(PaySupportChannels.pay_type_huaWeiPay.getNum());
                        rechargeMenuToPayModel.setSku(channelSKU.getSku());
                        rechargeMenuToPayModel.setSkuDetails(null);
                        rechargeMenuToPayModel.setAmount(channelSKU.getAmount());
                        rechargeMenuToPayModel.setUnit(channelSKU.getUnit());
                    }
                }
                PremiumActivity premiumActivity = PremiumActivity.this;
                GooglePaySubscriptionModel googlePaySubscriptionModel = this.f23384Oooo0oo;
                OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
                Objects.requireNonNull(premiumActivity);
                if (StringsKt.isBlank(rechargeMenuToPayModel.getOrderid())) {
                    premiumActivity.f23372o00Oo0 = false;
                } else {
                    premiumActivity.f23372o00Oo0 = true;
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(premiumActivity), Dispatchers.getIO(), null, new o00O0(premiumActivity, rechargeMenuToPayModel, googlePaySubscriptionModel, null), 2, null);
                }
            } else {
                PremiumActivity.this.f23372o00Oo0 = false;
                ToastUtil.f12567OooO00o.OooO0O0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.subscribed_cannot_be_changed_before_expiration));
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        @JvmOverloads
        public final void OooO00o(@NotNull Context context, @NotNull PremiumLevel level) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(level, "level");
            Intent intent = new Intent(context, (Class<?>) PremiumActivity.class);
            intent.putExtra("VipLevel", level.getValue());
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f23385Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(o000O0O0.OooO00o(R.color.color_alpha_38_A3));
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0OO f23386Oooo0o = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(o000O0O0.OooO00o(R.color.color_alpha_87_A1));
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f23387Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(o000O0O0.OooO00o(R.color.rec_color_FE6C6C));
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiError, Unit> {
        public OooOO0(PremiumShopModel.PremiumInfo premiumInfo) {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError error = apiError;
            Intrinsics.checkNotNullParameter(error, "it");
            PremiumActivity.this.f23372o00Oo0 = false;
            if (error.getCode() == 3003) {
                PremiumActivity premiumActivity = PremiumActivity.this;
                Objects.requireNonNull(premiumActivity);
                o00O000 o00o001 = o00O000.f34346OooO00o;
                Activity activityOooO0O0 = o00O000.OooO0O0();
                if (activityOooO0O0 != null) {
                    oo0oOO0 oo0ooo0 = new oo0oOO0(activityOooO0O0);
                    oo0ooo0.OooOo0(R.string.Recharge_Page_CopyUnder_maintenance_Dialog);
                    oo0ooo0.OooOOOo(R.string.OK);
                    oo0ooo0.OooOo0o(new o00O0000(premiumActivity));
                    oo0ooo0.OooOOO0();
                }
            } else {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o0o0000.OooOOOO(error, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiResult<VipCreateOrderResultModel>, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<VipCreateOrderResultModel> apiResult) {
            ApiResult<VipCreateOrderResultModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            PremiumActivity premiumActivity = PremiumActivity.this;
            Objects.requireNonNull(premiumActivity);
            Intrinsics.checkNotNull(premiumActivity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            premiumActivity.OooOoO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<ApiResult<PremiumTimeModel>, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<PremiumTimeModel> apiResult) {
            ApiResult<PremiumTimeModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            PremiumActivity.this.OooOoO();
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<PremiumTimeModel, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PremiumTimeModel premiumTimeModel) {
            PremiumTimeModel premiumTimeModel2 = premiumTimeModel;
            PremiumActivity premiumActivity = PremiumActivity.this;
            premiumActivity.f23367Oooooo = premiumTimeModel2;
            if (premiumTimeModel2 != null) {
                int state = premiumTimeModel2.getState();
                if (state == PremiumState.Not.getValue()) {
                    premiumActivity.Oooo00o().f51113OooO0o.setVisibility(8);
                    premiumActivity.Oooo00o().f51119OooOO0o.setTextSize(15.0f);
                    premiumActivity.Oooo00o().f51119OooOO0o.setText(R.string.not_aristocracy_yet);
                } else if (state == PremiumState.Opened.getValue()) {
                    premiumActivity.Oooo00o().f51113OooO0o.setVisibility(0);
                    premiumActivity.Oooo00o().f51119OooOO0o.setTextSize(13.0f);
                    premiumActivity.Oooo00o().f51117OooOO0.setText(premiumActivity.Oooo0o().get(premiumActivity.f23378o0OoOo0.OooO0O0()));
                    SpannableStringBuilder spannableStringBuilderOooO00o = o0O0O00.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.valid_expire), premiumTimeModel2.getDaynum()), premiumTimeModel2.getTime()), premiumTimeModel2.getDaynum(), o000O0O0.OooO00o(R.color.rec_color_FE6C6C));
                    String time = premiumTimeModel2.getTime();
                    int iOooO00o = o000O0O0.OooO00o(R.color.rec_color_FE6C6C);
                    int iIndexOf = spannableStringBuilderOooO00o.toString().indexOf(time);
                    int length = time.length() + iIndexOf;
                    if (iIndexOf >= 0) {
                        spannableStringBuilderOooO00o.setSpan(new ForegroundColorSpan(iOooO00o), iIndexOf, length, 33);
                    }
                    premiumActivity.Oooo00o().f51119OooOO0o.setText(spannableStringBuilderOooO00o);
                } else if (state == PremiumState.Protection.getValue()) {
                    premiumActivity.Oooo00o().f51113OooO0o.setVisibility(0);
                    premiumActivity.Oooo00o().f51117OooOO0.setText(premiumActivity.Oooo0o().get(premiumActivity.f23378o0OoOo0.OooO0O0()) + ' ' + com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Expired));
                    premiumActivity.Oooo00o().f51119OooOO0o.setTextSize(13.0f);
                    premiumActivity.Oooo00o().f51119OooOO0o.setText(o0O0O00.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Enjoy_discount_renewal), premiumTimeModel2.getTime()), premiumTimeModel2.getTime(), o000O0O0.OooO00o(R.color.rec_color_FE6C6C)));
                } else {
                    premiumActivity.Oooo00o().f51113OooO0o.setVisibility(8);
                    premiumActivity.Oooo00o().f51119OooOO0o.setTextSize(15.0f);
                    premiumActivity.Oooo00o().f51119OooOO0o.setText(R.string.not_aristocracy_yet);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<PremiumShopModel, Unit> {
        public OooOOOO() {
            super(1);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PremiumShopModel premiumShopModel) {
            PremiumShopModel premiumShopModel2 = premiumShopModel;
            if (premiumShopModel2 != null) {
                PremiumActivity premiumActivity = PremiumActivity.this;
                OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
                premiumActivity.Oooo00o().f51116OooO0oo.OooO0Oo();
                List<PremiumShopModel.PremiumInfo> data = premiumShopModel2.getData();
                PremiumActivity premiumActivity2 = PremiumActivity.this;
                int i = 0;
                for (Object obj : data) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) obj;
                    premiumInfo.setIndex(i);
                    premiumInfo.setName(premiumActivity2.Oooo0o().get(i));
                    i = i2;
                }
                PremiumActivity.this.f23366OooooOo.clear();
                PremiumActivity.this.f23366OooooOo.addAll(premiumShopModel2.getData());
                PremiumActivity.this.f23368Oooooo0.clear();
                PremiumActivity.this.f23368Oooooo0.addAll(premiumShopModel2.getDataBan());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<ApiResult<PremiumShopModel>, Unit> {
        public OooOo() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<PremiumShopModel> apiResult) {
            String sku;
            ApiResult<PremiumShopModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            PremiumActivity.this.OooOoO();
            PremiumActivity premiumActivity = PremiumActivity.this;
            Objects.requireNonNull(premiumActivity);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = premiumActivity.f23366OooooOo.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(premiumActivity), Dispatchers.getIO(), null, new p566o0oOo00O.o00O000(arrayList, premiumActivity, null), 2, null);
                    return Unit.INSTANCE;
                }
                PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) it2.next();
                if (premiumInfo.getChannelSKU() != null) {
                    PremiumShopModel.ChannelSKU channelSKU = premiumInfo.getChannelSKU();
                    sku = p522o0o0O0o.o00O0.OooO0oO(channelSKU != null ? channelSKU.getSku() : null);
                } else {
                    sku = premiumInfo.getSku();
                }
                if (!StringsKt.isBlank(sku)) {
                    arrayList.add(sku);
                }
            }
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<ApiError, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            PremiumActivity premiumActivity = PremiumActivity.this;
            OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
            premiumActivity.Oooo00o().f51116OooO0oo.OooO0o();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Oooo0 f23395Oooo0o = new Oooo0();

        public Oooo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return com.yalla.support.common.util.OooOOO.OooO0OO(R.string.opem_month);
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Oooo000 f23396Oooo0o = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(p516o0o0O000.OooOo.f42064OooO00o.OooO0O0() ? PaySupportChannels.pay_type_huaWeiPay.getNum() : PaySupportChannels.pay_type_googlePay.getNum());
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o000oOoO f23397Oooo0o = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return com.yalla.support.common.util.OooOOO.OooO0OO(R.string.renew_month);
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<List<String>> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final o0OoOo0 f23398Oooo0o = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<String> invoke() {
            return CollectionsKt.mutableListOf(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Patrician), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Knight), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Baron), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Count), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Marquis));
        }
    }

    public static final void OooOoo(PremiumActivity premiumActivity, PayOrder payOrder) {
        premiumActivity.f23372o00Oo0 = true;
        if (payOrder.getType() != PaySupportChannels.pay_type_googlePay.getNum() || (payOrder.getSubscriptionState() != GooglePaySubscriptionModel.Action.Downgrade.getValue() && !StringsKt.isBlank(payOrder.getOrderId()) && !StringsKt.isBlank(payOrder.getSku()) && !StringsKt.isBlank(payOrder.getPurchaseToken()))) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            premiumActivity.Oooo0oO().confirmRechargeOrder(payOrder).observe(premiumActivity, new o0o0000.OooOo(new p566o0oOo00O.o000O0O0(premiumActivity, payOrder, booleanRef), new o000O(premiumActivity, payOrder, booleanRef), new o000OO00(premiumActivity, booleanRef), true));
            return;
        }
        premiumActivity.f23372o00Oo0 = false;
        Intrinsics.checkNotNull(premiumActivity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        premiumActivity.OooOoO();
        premiumActivity.Oooo0oO().deleteOrderToDB(payOrder.getOrderId());
        ToastUtil.f12567OooO00o.OooO0O0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Purchase_Successfully_subscribed_cannot_be_take_effect_before_expiration));
    }

    public static final void OooOooO(PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo) {
        String strOooO00o;
        Objects.requireNonNull(premiumActivity);
        if (premiumInfo == null) {
            return;
        }
        String strOooO0Oo = o0O0O00.OooO0Oo(premiumInfo.getPromotionprice() + "");
        String strOooO0Oo2 = o0O0O00.OooO0Oo(premiumInfo.getRenew() + "");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        PremiumTimeModel premiumTimeModel = premiumActivity.f23367Oooooo;
        Integer numValueOf = premiumTimeModel != null ? Integer.valueOf(premiumTimeModel.getState()) : null;
        int value = PremiumState.Not.getValue();
        if (numValueOf != null && numValueOf.intValue() == value) {
            spannableStringBuilder = o0O0O00.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0OO(), strOooO0Oo), strOooO0Oo, premiumActivity.Oooo0());
            strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0o0(), strOooO0Oo2);
            premiumActivity.f23369OoooooO = 0;
        } else {
            int value2 = PremiumState.Opened.getValue();
            if (numValueOf == null || numValueOf.intValue() != value2) {
                int value3 = PremiumState.Protection.getValue();
                if (numValueOf == null || numValueOf.intValue() != value3) {
                    strOooO00o = "";
                } else if (premiumInfo.getIndex() == premiumActivity.f23378o0OoOo0.OooO0O0()) {
                    spannableStringBuilder = o0O0O00.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0o0(), strOooO0Oo2), strOooO0Oo2, premiumActivity.Oooo0());
                    strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0OO(), strOooO0Oo);
                    premiumActivity.f23369OoooooO = 1;
                } else {
                    spannableStringBuilder = o0O0O00.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0OO(), strOooO0Oo), strOooO0Oo, premiumActivity.Oooo0());
                    strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0o0(), strOooO0Oo2);
                    premiumActivity.f23369OoooooO = 0;
                }
            } else if (premiumInfo.getIndex() == premiumActivity.f23378o0OoOo0.OooO0O0()) {
                spannableStringBuilder = o0O0O00.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0o0(), strOooO0Oo2), strOooO0Oo2, premiumActivity.Oooo0());
                strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0OO(), strOooO0Oo);
                premiumActivity.f23369OoooooO = 1;
            } else if (premiumInfo.getIndex() < premiumActivity.f23378o0OoOo0.OooO0O0()) {
                if (premiumInfo.getIndex() <= 2) {
                    SpannableStringBuilder spannableStringBuilderOooO00o = o0O0O00.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0o0(), strOooO0Oo2), strOooO0Oo2, premiumActivity.Oooo0());
                    strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0OO(), strOooO0Oo);
                    spannableStringBuilder = spannableStringBuilderOooO00o;
                } else {
                    spannableStringBuilder = o0O0O00.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0OO(), strOooO0Oo), strOooO0Oo, ((Number) premiumActivity.f23377o00ooo.getValue()).intValue());
                    strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0o0(), strOooO0Oo2);
                }
                premiumActivity.f23369OoooooO = 2;
            } else {
                spannableStringBuilder = o0O0O00.OooO00o(com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0OO(), strOooO0Oo), strOooO0Oo, premiumActivity.Oooo0());
                strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(premiumActivity.Oooo0o0(), strOooO0Oo2);
                premiumActivity.f23369OoooooO = 0;
            }
        }
        Button button = premiumActivity.Oooo00o().f51110OooO0O0;
        Intrinsics.checkNotNullExpressionValue(button, "binding.btEnOpen");
        o00O0O.OooO00o(button);
        Button button2 = premiumActivity.Oooo00o().f51111OooO0OO;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.btOpen");
        o00O0O.OooO00o(button2);
        Button button3 = premiumActivity.Oooo00o().f51112OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.btSubscription");
        o00O0O.OooO00o(button3);
        int i = premiumActivity.f23369OoooooO;
        if (i == 0) {
            premiumActivity.Oooo00o().f51111OooO0OO.setText(R.string.Activate);
            Button button4 = premiumActivity.Oooo00o().f51111OooO0OO;
            Intrinsics.checkNotNullExpressionValue(button4, "binding.btOpen");
            o00O0O.OooO(button4);
        } else if (i != 1) {
            Button button5 = premiumActivity.Oooo00o().f51110OooO0O0;
            Intrinsics.checkNotNullExpressionValue(button5, "binding.btEnOpen");
            o00O0O.OooO(button5);
        } else {
            premiumActivity.Oooo00o().f51111OooO0OO.setText(R.string.Renew);
            Button button6 = premiumActivity.Oooo00o().f51111OooO0OO;
            Intrinsics.checkNotNullExpressionValue(button6, "binding.btOpen");
            o00O0O.OooO(button6);
        }
        if (premiumInfo.getIndex() <= 2) {
            Button button7 = premiumActivity.Oooo00o().f51112OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(button7, "binding.btSubscription");
            o00O0O.OooO(button7);
            String strOooO0Oo3 = o0O0O00.OooO0Oo("" + premiumInfo.getReturnMoney());
            double amount = premiumInfo.getAmount();
            StringBuilder sb = new StringBuilder();
            sb.append(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.single_USD));
            sb.append(' ');
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(amount)}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            sb.append(str);
            String string = sb.toString();
            GooglePaySkuDetail googlePaySkuDetail = premiumInfo.getGooglePaySkuDetail();
            if (googlePaySkuDetail != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(googlePaySkuDetail.getUnit());
                sb2.append(' ');
                String str2 = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(googlePaySkuDetail.getAmount())}, 1));
                Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                sb2.append(str2);
                string = sb2.toString();
                googlePaySkuDetail.getAmount();
            }
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0(string);
            sbOooO0o0.append(com.yalla.support.common.util.OooOOO.OooO0OO(R.string._1_Month));
            spannableStringBuilder = o0O0O00.OooO00o(sbOooO0o0.toString(), string, premiumActivity.Oooo0());
            strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Subscribe_to_get_XXX_golds_every_month), strOooO0Oo3);
        }
        premiumActivity.Oooo00o().f51121OooOOO0.setTextColor(((Number) premiumActivity.f23374o00o0O.getValue()).intValue());
        premiumActivity.Oooo00o().f51121OooOOO0.setText(spannableStringBuilder);
        premiumActivity.Oooo00o().f51118OooOO0O.setText(strOooO00o);
    }

    public static final void OooOooo(PremiumActivity premiumActivity, PayOrder payOrder) {
        premiumActivity.f23372o00Oo0 = false;
        oo0oOO0 oo0ooo0 = new oo0oOO0(premiumActivity);
        if (premiumActivity.f23371o00O0O >= 3) {
            oo0ooo0.OooOooO(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Validation_Failed));
            oo0ooo0.OooOo0O(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Validation_Failed_content));
            oo0ooo0.OooOoO0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Validation_Failed_Contact_Us));
            oo0ooo0.OooOo(new o00O00O(premiumActivity));
            oo0ooo0.OooOOo0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Validate_Again));
            oo0ooo0.OooOo0o(new oOO00O(premiumActivity, payOrder));
        } else {
            oo0ooo0.OooOooO(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Purchase_Validation_Failed));
            oo0ooo0.OooOo0O(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Purchase_Validation_Failed_content));
            oo0ooo0.OooOOo0(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Validate_Again));
            oo0ooo0.OooOo0o(new o00O00OO(premiumActivity, payOrder));
        }
        oo0ooo0.OooOOO0();
    }

    public static final void Oooo000(PremiumActivity premiumActivity, PayOrder payOrder) {
        premiumActivity.f23372o00Oo0 = true;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(premiumActivity), Dispatchers.getIO(), null, new oo00o(premiumActivity, payOrder, null), 2, null);
    }

    public final void Oooo(boolean z) {
        Oooo0oo().loadVipTime().observe(this, new o0o0000.OooOo(new OooOOO0(), null, new OooOOO(), false, 10));
        if (z) {
            Oooo0o().clear();
            Oooo0o().addAll(CollectionsKt.mutableListOf(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Patrician), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Knight), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Baron), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Count), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.Marquis)));
            BaseActivityK.OooOoo0(this, null, 0L, 3, null);
            Oooo0oo().loadVipList(p516o0o0O000.OooOo.f42064OooO00o.OooO0O0()).observe(this, new o0o0000.OooOo(new OooOOOO(), new OooOo00(), new OooOo(), false, 8));
        }
    }

    public final int Oooo0() {
        return ((Number) this.f23380oo000o.getValue()).intValue();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.model.PremiumShopModel$PremiumInfo>] */
    public final void Oooo00O(PremiumShopModel.PremiumInfo premiumInfo) {
        GooglePaySubscriptionModel.Action action;
        if (this.f23372o00Oo0) {
            return;
        }
        this.f23372o00Oo0 = true;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        BaseActivityK.OooOoo0(this, null, 0L, 3, null);
        int index = premiumInfo.getIndex() + 1;
        GooglePaySubscriptionModel googlePaySubscriptionModel = new GooglePaySubscriptionModel();
        googlePaySubscriptionModel.setOldSku(((PremiumShopModel.PremiumInfo) this.f23366OooooOo.get(this.f23378o0OoOo0.OooO0O0())).getSku());
        if (this.f23378o0OoOo0.OooO0Oo() == PremiumLevel.Premium0.getValue()) {
            googlePaySubscriptionModel.setOldSku("");
            action = GooglePaySubscriptionModel.Action.ForFirst;
        } else {
            action = index > this.f23378o0OoOo0.OooO0O0() ? GooglePaySubscriptionModel.Action.Upgrade : GooglePaySubscriptionModel.Action.Downgrade;
        }
        googlePaySubscriptionModel.setAction(action);
        String sku = premiumInfo.getSku();
        PremiumShopModel.ChannelSKU channelSKU = premiumInfo.getChannelSKU();
        if (channelSKU != null) {
            sku = channelSKU.getSku();
        }
        String str = sku;
        WalletCoinVM walletCoinVMOooo0oO = Oooo0oO();
        boolean zIsSubscriptionForFirst = googlePaySubscriptionModel.isSubscriptionForFirst();
        String shopid = premiumInfo.getShopid();
        double amount = premiumInfo.getAmount();
        int iOooo0O0 = Oooo0O0();
        GooglePaySkuDetail googlePaySkuDetail = premiumInfo.getGooglePaySkuDetail();
        walletCoinVMOooo0oO.createOrderSubscribe(zIsSubscriptionForFirst, shopid, amount, iOooo0O0, str, String.valueOf(googlePaySkuDetail != null ? googlePaySkuDetail.getUnit() : null)).observe(this, new o0o0000.OooOo(new OooO(premiumInfo, googlePaySubscriptionModel), new OooOO0(premiumInfo), new OooOO0O(), true));
    }

    public final zh Oooo00o() {
        return (zh) this.f23361OoooOoo.getValue();
    }

    public final int Oooo0O0() {
        return ((Number) this.f23379o0ooOO0.getValue()).intValue();
    }

    public final String Oooo0OO() {
        return (String) this.f23376o00oO0o.getValue();
    }

    public final List<String> Oooo0o() {
        return (List) this.f23365OooooOO.getValue();
    }

    public final String Oooo0o0() {
        return (String) this.f23375o00oO0O.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WalletCoinVM Oooo0oO() {
        return (WalletCoinVM) this.f23363Ooooo0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final PremiumVM Oooo0oo() {
        return (PremiumVM) this.f23362Ooooo00.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OoooO0(final boolean z) {
        BaseActivityK.OooOoo0(this, null, 0L, 3, null);
        ((AristocracyVM) this.f23364OooooO0.getValue()).syncUserInfo().observe(this, new Observer() { // from class: o0oOo00O.o000O0
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                boolean z2 = z;
                PremiumActivity this$0 = this;
                PremiumActivity.OooO00o oooO00o = PremiumActivity.f23360o0ooOOo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (z2 && this$0.f23378o0OoOo0.getValue() > PremiumLevel.Premium0.getValue()) {
                    this$0.OoooO00();
                }
                this$0.Oooo(false);
            }
        });
    }

    public final void OoooO00() {
        String topInfo = com.yalla.support.common.util.OooOOO.OooO0OO(this.f23369OoooooO == 1 ? R.string.Renew_success : R.string.Activation_success);
        String bottomInfo = com.yalla.support.common.util.OooOOO.OooO0OO(this.f23369OoooooO == 1 ? R.string.Renew_success_tips : R.string.Activation_success_tips);
        StringBuilder sbOooO00o = o00oOoo.OooO00o("showSuccessDialog  \nname：", topInfo, " \ninfo：", bottomInfo, " \nvipLevel.value：");
        sbOooO00o.append(this.f23378o0OoOo0.getValue());
        o00O00.OooO0O0(sbOooO00o.toString());
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.app.base.base.activity.BaseFragmentActivity");
        int value = this.f23378o0OoOo0.getValue();
        Intrinsics.checkNotNullParameter(this, "activity");
        Intrinsics.checkNotNullParameter(topInfo, "topInfo");
        Intrinsics.checkNotNullParameter(bottomInfo, "bottomInfo");
        showDialog((String) null, p043OooooO0.o00O0000.OooO0O0(759393454, true, new o000OOo0(value, topInfo, bottomInfo)));
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        PayManager payManager = this.f23381ooOO;
        if (payManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payManager");
            payManager = null;
        }
        payManager.onActivityResult(i, i2, intent);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Oooo00o().f51109OooO00o);
        this.f23370Ooooooo = PremiumLevel.INSTANCE.OooO00o(Integer.valueOf(getIntent().getIntExtra("VipLevel", PremiumLevel.Premium0.getValue()))).OooO0O0();
        this.f23381ooOO = new PayManager(this);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0OoOO0.OooO0Oo(window, 0);
        HeaderLayout headerLayout = this.f11463OoooO;
        int i = 1;
        if (headerLayout != null) {
            oO0OoOO0.OooO0O0(headerLayout, true, 2);
        }
        OooOo(R.string.Yalla_Premium);
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.OooOoOO(R.drawable.icon_aristocracy_doubt, new o0O0ooO(this));
        }
        Oooo00o().f51112OooO0Oo.setOnClickListener(new p184o00o000o.OooOOOO(this, 1));
        Oooo00o().f51111OooO0OO.setOnClickListener(new p184o00o000o.OooOo00(this, i));
        Oooo00o().f51110OooO0O0.setOnClickListener(new o00OO(this, 1));
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO0o0());
        p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
        oooO00o.f48429OooO0OO = oooOOO.OooO0oo().getValue();
        oooO00o.f48427OooO00o = 0;
        oooO00o.OooO0o(Oooo00o().f51115OooO0oO);
        Oooo00o().f51114OooO0o0.setShowProtection(true);
        oooOOO.OooOOO0().observe(this, new o00OOO0O(this, 5));
        StateLayout stateLayout = Oooo00o().f51116OooO0oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new p566o0oOo00O.o00oOoo(this), 3);
        Oooo(true);
        new FixRechargeOrderManager(this, new PayManager(this)).start(Oooo0O0(), true);
        int i2 = 4;
        LiveEventBus.get("FixRechargeOrder_Success").observe(this, new o0O0O0O(this, i2));
        LiveEventBus.get("Subscription_OnSuccess_UpdateUserInfo").observe(this, new o00O0OOO(this, i2));
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        p497o0o00Oo.OooOOO0 oooOOO0 = p497o0o00Oo.OooOOO0.f41180OooO00o;
        p497o0o00Oo.OooOOO0.OooOO0O().OooOO0O();
    }
}
