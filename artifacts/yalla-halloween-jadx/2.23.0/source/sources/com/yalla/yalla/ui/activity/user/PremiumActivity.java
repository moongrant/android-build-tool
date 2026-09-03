package com.yalla.yalla.ui.activity.user;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.common.manager.PayManager;
import com.yalla.yalla.data.db.table.PayOrder;
import com.yalla.yalla.manager.unBlur.GooglePaySubscriptionModel;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.PremiumShopModel;
import com.yalla.yalla.model.PremiumState;
import com.yalla.yalla.model.PremiumTimeModel;
import com.yalla.yalla.model.RechargeMenuToPayModel;
import com.yalla.yalla.model.VipCreateOrderResultModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.vm.WalletCoinVM;
import com.yalla.yalla.ui.vm.main.AristocracyVM;
import com.yalla.yalla.ui.vm.main.PremiumVM;
import com.yalla.yalla.util.PaySupportChannels;
import com.zego.zegoavkit2.ZegoConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O000;
import p157o00OoOO0.o0OO00O;
import p375o0OOoOO.o00000O0;
import p377o0OOoOo.o0000OO0;
import p409o0Oo0o0o.o00000OO;
import p426o0OoOO.o0OOO0o;
import p431o0OoOOOO.o00OO;
import p464o0Oooo.o000000O;
import p496o0o00o.o00O00OO;
import p496o0o00o.o00O00o0;
import p496o0o00o.o00O0O0;
import p496o0o00o.o00O0O0O;
import p496o0o00o.o00O0OO;
import p496o0o00o.o00O0OO0;
import p496o0o00o.o00O0OOO;
import p496o0o00o.o00OO00O;
import p496o0o00o.o00OO0O0;
import p496o0o00o.o00OO0OO;
import p496o0o00o.o00OOO0;
import p496o0o00o.o00OOO00;
import p496o0o00o.o0o0Oo;
import p496o0o00o.oo00o;
import p496o0o00o.oo0o0O0;
import p496o0o00o.oo0oOO0;
import p519o0o0O0oO.i;
import p519o0o0O0oO.p3;
import p579o0oOoo.oO000O0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.pa;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/PremiumActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPremiumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumActivity.kt\ncom/yalla/yalla/ui/activity/user/PremiumActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,990:1\n22#2,2:991\n75#3,13:993\n75#3,13:1006\n75#3,13:1019\n1855#4,2:1032\n1855#4,2:1034\n*S KotlinDebug\n*F\n+ 1 PremiumActivity.kt\ncom/yalla/yalla/ui/activity/user/PremiumActivity\n*L\n77#1:991,2\n79#1:993,13\n80#1:1006,13\n81#1:1019,13\n806#1:1032,2\n844#1:1034,2\n*E\n"})
public final class PremiumActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final /* synthetic */ int f27140Oooo0oO = 0;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public PremiumTimeModel f27147OooOoO;

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public int f27149OooOoOO;

    /* JADX INFO: renamed from: OooOoo0, reason: collision with root package name */
    public int f27151OooOoo0;

    /* JADX INFO: renamed from: OooOooO, reason: collision with root package name */
    public PayManager f27152OooOooO;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public int f27153OooOooo;

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public boolean f27155Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    @Nullable
    public p3 f27156Oooo00O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27141OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(pa.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27144OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(PremiumVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.PremiumActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f27182OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27182OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27143OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(WalletCoinVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.PremiumActivity$special$$inlined$viewModels$default$5
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f27186OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27186OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27145OooOo0O = new ViewModelLazy(Reflection.getOrCreateKotlinClass(AristocracyVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.PremiumActivity$special$$inlined$viewModels$default$8
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f27190OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27190OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f27146OooOo0o = LazyKt.lazy(o00O0O.f27178OooO0Oo);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final ArrayList f27142OooOo = new ArrayList();

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final ArrayList f27148OooOoO0 = new ArrayList();

    /* JADX INFO: renamed from: OooOoo, reason: collision with root package name */
    @NotNull
    public PremiumLevel f27150OooOoo = PremiumLevel.Premium0;

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NotNull
    public final Lazy f27157Oooo00o = LazyKt.lazy(OooO0OO.f27166OooO0Oo);

    /* JADX INFO: renamed from: Oooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f27154Oooo0 = LazyKt.lazy(OooO0O0.f27165OooO0Oo);

    /* JADX INFO: renamed from: Oooo0O0, reason: collision with root package name */
    @NotNull
    public final Lazy f27158Oooo0O0 = LazyKt.lazy(OooO0o.f27167OooO0Oo);

    /* JADX INFO: renamed from: Oooo0OO, reason: collision with root package name */
    @NotNull
    public final Lazy f27159Oooo0OO = LazyKt.lazy(o000oOoO.f27177OooO0Oo);

    /* JADX INFO: renamed from: Oooo0o0, reason: collision with root package name */
    @NotNull
    public final Lazy f27161Oooo0o0 = LazyKt.lazy(o0OoOo0.f27179OooO0Oo);

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Lazy f27160Oooo0o = LazyKt.lazy(Oooo000.f27176OooO0Oo);

    public static final class OooO extends Lambda implements Function1<VipCreateOrderResultModel, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ GooglePaySubscriptionModel f27163OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ PremiumShopModel.PremiumInfo f27164OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(PremiumShopModel.PremiumInfo premiumInfo, GooglePaySubscriptionModel googlePaySubscriptionModel) {
            super(1);
            this.f27164OooO0o0 = premiumInfo;
            this.f27163OooO0o = googlePaySubscriptionModel;
        }

        /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(VipCreateOrderResultModel vipCreateOrderResultModel) {
            boolean z;
            VipCreateOrderResultModel vipCreateOrderResultModel2 = vipCreateOrderResultModel;
            PremiumActivity premiumActivity = PremiumActivity.this;
            if (vipCreateOrderResultModel2 == null || StringsKt.isBlank(vipCreateOrderResultModel2.getOrderId())) {
                premiumActivity.f27155Oooo000 = false;
            } else if (!(vipCreateOrderResultModel2.isVIP() && StringsKt.isBlank(vipCreateOrderResultModel2.getAToken())) && (vipCreateOrderResultModel2.isVIP() || !(!StringsKt.isBlank(vipCreateOrderResultModel2.getAToken())))) {
                RechargeMenuToPayModel rechargeMenuToPayModel = new RechargeMenuToPayModel();
                rechargeMenuToPayModel.setType(PaySupportChannels.pay_type_googlePay.getNum());
                PremiumShopModel.PremiumInfo premiumInfo = this.f27164OooO0o0;
                rechargeMenuToPayModel.setSku(premiumInfo.getSku());
                o00OO googlePaySkuDetail = premiumInfo.getGooglePaySkuDetail();
                if (googlePaySkuDetail != null) {
                    rechargeMenuToPayModel.setSku(googlePaySkuDetail.f45870OooO00o);
                    rechargeMenuToPayModel.setSkuDetails(googlePaySkuDetail.f45873OooO0Oo);
                    rechargeMenuToPayModel.setProductDetails(googlePaySkuDetail.f45874OooO0o0);
                    rechargeMenuToPayModel.setAmount(googlePaySkuDetail.f45871OooO0O0);
                    rechargeMenuToPayModel.setUnit(googlePaySkuDetail.f45872OooO0OO);
                }
                rechargeMenuToPayModel.setOrderid(vipCreateOrderResultModel2.getOrderId());
                String aToken = vipCreateOrderResultModel2.getAToken();
                GooglePaySubscriptionModel googlePaySubscriptionModel = this.f27163OooO0o;
                googlePaySubscriptionModel.getClass();
                Intrinsics.checkNotNullParameter(aToken, "<set-?>");
                googlePaySubscriptionModel.f23408OooO0O0 = aToken;
                PremiumShopModel.ChannelSKU channelSKU = premiumInfo.getChannelSKU();
                if (channelSKU != null) {
                    oO000O0 oo000o0 = oO000O0.f56533OooO00o;
                    String sku = channelSKU.getSku();
                    if (oo000o0.OooO0O0()) {
                        if (sku == null || sku.length() == 0 ? false : StringsKt.OooO0o(sku, "com.yalla.huawei.premium.")) {
                            z = true;
                        } else {
                            z = false;
                        }
                    } else {
                        z = false;
                    }
                    if (z) {
                        rechargeMenuToPayModel.setType(PaySupportChannels.pay_type_huaWeiPay.getNum());
                        rechargeMenuToPayModel.setSku(channelSKU.getSku());
                        rechargeMenuToPayModel.setSkuDetails(null);
                        rechargeMenuToPayModel.setProductDetails(null);
                        rechargeMenuToPayModel.setAmount(channelSKU.getAmount());
                        rechargeMenuToPayModel.setUnit(channelSKU.getUnit());
                    }
                }
                int i = PremiumActivity.f27140Oooo0oO;
                premiumActivity.getClass();
                if (StringsKt.isBlank(rechargeMenuToPayModel.getOrderid())) {
                    premiumActivity.f27155Oooo000 = false;
                } else {
                    premiumActivity.f27155Oooo000 = true;
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(premiumActivity), Dispatchers.getIO(), null, new o00OOO0(premiumActivity, rechargeMenuToPayModel, googlePaySubscriptionModel, null), 2, null);
                }
            } else {
                premiumActivity.f27155Oooo000 = false;
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.subscribed_cannot_be_changed_before_expiration);
                if (!(strOooO0OO == null || StringsKt.isBlank(strOooO0OO))) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o {
        @JvmOverloads
        public static void OooO00o(@NotNull Context context, @NotNull PremiumLevel level) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(level, "level");
            Intent intent = new Intent(context, (Class<?>) PremiumActivity.class);
            intent.putExtra("VipLevel", level.getValue());
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f27165OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(o0000.OooO00o(oO00O0o.color_alpha_38_A3));
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0OO f27166OooO0Oo = new OooO0OO();

        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(o0000.OooO00o(oO00O0o.color_alpha_87_A1));
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f27167OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(o0000.OooO00o(oO00O0o.rec_color_FE6C6C));
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
            PremiumActivity premiumActivity = PremiumActivity.this;
            premiumActivity.f27155Oooo000 = false;
            if (error.getCode() == 3003) {
                Context context = o000O0.f10354OooO00o;
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    o0OO00O o0oo00o2 = new o0OO00O(activityOooO0O0);
                    o0oo00o2.OooOOoo(oO00OOo0.Recharge_Page_CopyUnder_maintenance_Dialog);
                    o0oo00o2.OooOOOO(oO00OOo0.OK);
                    o0oo00o2.OooOo0(new o00O0O0(premiumActivity));
                    o0oo00o2.OooOO0o();
                }
            } else {
                Intrinsics.checkNotNullParameter(error, "error");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.MainScope(), null, null, new o00000O0(error, null), 3, null);
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
            premiumActivity.getClass();
            Intrinsics.checkNotNull(premiumActivity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
            premiumActivity.OooOo0();
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
            PremiumActivity.this.OooOo0();
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
            premiumActivity.f27147OooOoO = premiumTimeModel2;
            if (premiumTimeModel2 != null) {
                int state = premiumTimeModel2.getState();
                if (state == PremiumState.Not.getValue()) {
                    premiumActivity.OooOooo().f58619OooO0o.setVisibility(8);
                    premiumActivity.OooOooo().f58625OooOO0o.setTextSize(15.0f);
                    premiumActivity.OooOooo().f58625OooOO0o.setText(oO00OOo0.not_aristocracy_yet);
                } else if (state == PremiumState.Opened.getValue()) {
                    premiumActivity.OooOooo().f58619OooO0o.setVisibility(0);
                    premiumActivity.OooOooo().f58625OooOO0o.setTextSize(13.0f);
                    premiumActivity.OooOooo().f58623OooOO0.setText(premiumActivity.Oooo0O0().get(premiumActivity.f27150OooOoo.index()));
                    String strOooO00o = o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.valid_expire), premiumTimeModel2.getDaynum()), premiumTimeModel2.getTime());
                    String daynum = premiumTimeModel2.getDaynum();
                    int i = oO00O0o.rec_color_FE6C6C;
                    SpannableStringBuilder spannableStringBuilderOooO00o = p590o0oo0.OooOOOO.OooO00o(o0000.OooO00o(i), strOooO00o, daynum);
                    String time = premiumTimeModel2.getTime();
                    int iOooO00o = o0000.OooO00o(i);
                    int iIndexOf = spannableStringBuilderOooO00o.toString().indexOf(time);
                    int length = time.length() + iIndexOf;
                    if (iIndexOf >= 0) {
                        spannableStringBuilderOooO00o.setSpan(new ForegroundColorSpan(iOooO00o), iIndexOf, length, 33);
                    }
                    premiumActivity.OooOooo().f58625OooOO0o.setText(spannableStringBuilderOooO00o);
                } else if (state == PremiumState.Protection.getValue()) {
                    premiumActivity.OooOooo().f58619OooO0o.setVisibility(0);
                    TextView textView = premiumActivity.OooOooo().f58623OooOO0;
                    String str = premiumActivity.Oooo0O0().get(premiumActivity.f27150OooOoo.index());
                    textView.setText(((Object) str) + ZegoConstants.ZegoVideoDataAuxPublishingStream + o0000.OooO0OO(oO00OOo0.Expired));
                    premiumActivity.OooOooo().f58625OooOO0o.setTextSize(13.0f);
                    premiumActivity.OooOooo().f58625OooOO0o.setText(p590o0oo0.OooOOOO.OooO00o(o0000.OooO00o(oO00O0o.rec_color_FE6C6C), o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Enjoy_discount_renewal), premiumTimeModel2.getTime()), premiumTimeModel2.getTime()));
                } else {
                    premiumActivity.OooOooo().f58619OooO0o.setVisibility(8);
                    premiumActivity.OooOooo().f58625OooOO0o.setTextSize(15.0f);
                    premiumActivity.OooOooo().f58625OooOO0o.setText(oO00OOo0.not_aristocracy_yet);
                }
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nPremiumActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PremiumActivity.kt\ncom/yalla/yalla/ui/activity/user/PremiumActivity$loadData$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,990:1\n1864#2,3:991\n*S KotlinDebug\n*F\n+ 1 PremiumActivity.kt\ncom/yalla/yalla/ui/activity/user/PremiumActivity$loadData$3\n*L\n284#1:991,3\n*E\n"})
    public static final class OooOOOO extends Lambda implements Function1<PremiumShopModel, Unit> {
        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PremiumShopModel premiumShopModel) {
            PremiumShopModel premiumShopModel2 = premiumShopModel;
            if (premiumShopModel2 != null) {
                int i = PremiumActivity.f27140Oooo0oO;
                PremiumActivity premiumActivity = PremiumActivity.this;
                premiumActivity.OooOooo().f58622OooO0oo.OooO0Oo();
                int i2 = 0;
                for (Object obj : premiumShopModel2.getData()) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) obj;
                    premiumInfo.setIndex(i2);
                    premiumInfo.setName(premiumActivity.Oooo0O0().get(i2));
                    i2 = i3;
                }
                ArrayList arrayList = premiumActivity.f27142OooOo;
                arrayList.clear();
                arrayList.addAll(premiumShopModel2.getData());
                ArrayList arrayList2 = premiumActivity.f27148OooOoO0;
                arrayList2.clear();
                arrayList2.addAll(premiumShopModel2.getDataBan());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo extends Lambda implements Function1<ApiResult<PremiumShopModel>, Unit> {
        public OooOo() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<PremiumShopModel> apiResult) {
            String sku;
            ApiResult<PremiumShopModel> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            PremiumActivity premiumActivity = PremiumActivity.this;
            premiumActivity.OooOo0();
            ArrayList arrayList = new ArrayList();
            Iterator it2 = premiumActivity.f27142OooOo.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(premiumActivity), Dispatchers.getIO(), null, new oo0oOO0(arrayList, premiumActivity, null), 2, null);
                    return Unit.INSTANCE;
                }
                PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) it2.next();
                if (premiumInfo.getChannelSKU() != null) {
                    PremiumShopModel.ChannelSKU channelSKU = premiumInfo.getChannelSKU();
                    sku = com.code.android.util.o0OoOo0.OooOOO(channelSKU != null ? channelSKU.getSku() : null, "");
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
            int i = PremiumActivity.f27140Oooo0oO;
            PremiumActivity.this.OooOooo().f58622OooO0oo.OooO0o();
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27175OooO0Oo;

        public Oooo0(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27175OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27175OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27175OooO0Oo;
        }

        public final int hashCode() {
            return this.f27175OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27175OooO0Oo.invoke(obj);
        }
    }

    public static final class Oooo000 extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final Oooo000 f27176OooO0Oo = new Oooo000();

        public Oooo000() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(oO000O0.f56533OooO00o.OooO0O0() ? PaySupportChannels.pay_type_huaWeiPay.getNum() : PaySupportChannels.pay_type_googlePay.getNum());
        }
    }

    public static final class o000oOoO extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o000oOoO f27177OooO0Oo = new o000oOoO();

        public o000oOoO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return o0000.OooO0OO(oO00OOo0.opem_month);
        }
    }

    public static final class o00O0O extends Lambda implements Function0<List<String>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o00O0O f27178OooO0Oo = new o00O0O();

        public o00O0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<String> invoke() {
            return CollectionsKt.mutableListOf(o0000.OooO0OO(oO00OOo0.Patrician), o0000.OooO0OO(oO00OOo0.Knight), o0000.OooO0OO(oO00OOo0.Baron), o0000.OooO0OO(oO00OOo0.Count), o0000.OooO0OO(oO00OOo0.Marquis));
        }
    }

    public static final class o0OoOo0 extends Lambda implements Function0<String> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final o0OoOo0 f27179OooO0Oo = new o0OoOo0();

        public o0OoOo0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return o0000.OooO0OO(oO00OOo0.renew_month);
        }
    }

    public static final void OooOo(PremiumActivity premiumActivity, PayOrder payOrder) {
        boolean z = true;
        premiumActivity.f27155Oooo000 = true;
        if (payOrder.getType() != PaySupportChannels.pay_type_googlePay.getNum() || (payOrder.getSubscriptionState() != GooglePaySubscriptionModel.Action.Downgrade.getValue() && !StringsKt.isBlank(payOrder.getOrderId()) && !StringsKt.isBlank(payOrder.getSku()) && !StringsKt.isBlank(payOrder.getPurchaseToken()))) {
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            premiumActivity.Oooo0OO().confirmRechargeOrder(payOrder).observe(premiumActivity, new o0000OO0(new o00O00OO(premiumActivity, payOrder, booleanRef), new o00O00o0(premiumActivity, payOrder, booleanRef), new oo00o(premiumActivity, booleanRef), true));
            return;
        }
        premiumActivity.f27155Oooo000 = false;
        Intrinsics.checkNotNull(premiumActivity, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        premiumActivity.OooOo0();
        premiumActivity.Oooo0OO().deleteOrderToDB(payOrder.getOrderId());
        String strOooO0OO = o0000.OooO0OO(oO00OOo0.Purchase_Successfully_subscribed_cannot_be_take_effect_before_expiration);
        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
            z = false;
        }
        if (z) {
            return;
        }
        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            o000oo0OooO00o.run();
        } else {
            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
        }
    }

    public static final void OooOoO(PremiumActivity premiumActivity, PayOrder payOrder) {
        premiumActivity.f27155Oooo000 = false;
        o0OO00O o0oo00o2 = new o0OO00O(premiumActivity);
        if (premiumActivity.f27153OooOooo >= 3) {
            o0oo00o2.OooOoO(o0000.OooO0OO(oO00OOo0.Validation_Failed));
            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.Validation_Failed_content));
            o0oo00o2.OooOo0o(o0000.OooO0OO(oO00OOo0.Validation_Failed_Contact_Us));
            o0oo00o2.OooOo0O(new o00OO00O(premiumActivity));
            o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.Validate_Again));
            o0oo00o2.OooOo0(new o00OO0O0(premiumActivity, payOrder));
        } else {
            o0oo00o2.OooOoO(o0000.OooO0OO(oO00OOo0.Purchase_Validation_Failed));
            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.Purchase_Validation_Failed_content));
            o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.Validate_Again));
            o0oo00o2.OooOo0(new o00OO0OO(premiumActivity, payOrder));
        }
        o0oo00o2.OooOO0o();
    }

    public static final void OooOoO0(PremiumActivity premiumActivity, PremiumShopModel.PremiumInfo premiumInfo) {
        String strOooO00o;
        premiumActivity.getClass();
        if (premiumInfo == null) {
            return;
        }
        int promotionprice = premiumInfo.getPromotionprice();
        StringBuilder sb = new StringBuilder();
        sb.append(promotionprice);
        String strOooO0Oo = p590o0oo0.OooOOOO.OooO0Oo(sb.toString());
        int renew = premiumInfo.getRenew();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(renew);
        String strOooO0Oo2 = p590o0oo0.OooOOOO.OooO0Oo(sb2.toString());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        PremiumTimeModel premiumTimeModel = premiumActivity.f27147OooOoO;
        Integer numValueOf = premiumTimeModel != null ? Integer.valueOf(premiumTimeModel.getState()) : null;
        int value = PremiumState.Not.getValue();
        if (numValueOf != null && numValueOf.intValue() == value) {
            spannableStringBuilder = p590o0oo0.OooOOOO.OooO00o(premiumActivity.Oooo000(), o0000O.OooO00o(premiumActivity.Oooo00o(), strOooO0Oo), strOooO0Oo);
            strOooO00o = o0000O.OooO00o(premiumActivity.Oooo0(), strOooO0Oo2);
            premiumActivity.f27149OooOoOO = 0;
        } else {
            int value2 = PremiumState.Opened.getValue();
            if (numValueOf == null || numValueOf.intValue() != value2) {
                int value3 = PremiumState.Protection.getValue();
                if (numValueOf == null || numValueOf.intValue() != value3) {
                    strOooO00o = "";
                } else if (premiumInfo.getIndex() == premiumActivity.f27150OooOoo.index()) {
                    spannableStringBuilder = p590o0oo0.OooOOOO.OooO00o(premiumActivity.Oooo000(), o0000O.OooO00o(premiumActivity.Oooo0(), strOooO0Oo2), strOooO0Oo2);
                    strOooO00o = o0000O.OooO00o(premiumActivity.Oooo00o(), strOooO0Oo);
                    premiumActivity.f27149OooOoOO = 1;
                } else {
                    spannableStringBuilder = p590o0oo0.OooOOOO.OooO00o(premiumActivity.Oooo000(), o0000O.OooO00o(premiumActivity.Oooo00o(), strOooO0Oo), strOooO0Oo);
                    strOooO00o = o0000O.OooO00o(premiumActivity.Oooo0(), strOooO0Oo2);
                    premiumActivity.f27149OooOoOO = 0;
                }
            } else if (premiumInfo.getIndex() == premiumActivity.f27150OooOoo.index()) {
                spannableStringBuilder = p590o0oo0.OooOOOO.OooO00o(premiumActivity.Oooo000(), o0000O.OooO00o(premiumActivity.Oooo0(), strOooO0Oo2), strOooO0Oo2);
                strOooO00o = o0000O.OooO00o(premiumActivity.Oooo00o(), strOooO0Oo);
                premiumActivity.f27149OooOoOO = 1;
            } else if (premiumInfo.getIndex() < premiumActivity.f27150OooOoo.index()) {
                if (premiumInfo.getIndex() <= 2) {
                    SpannableStringBuilder spannableStringBuilderOooO00o = p590o0oo0.OooOOOO.OooO00o(premiumActivity.Oooo000(), o0000O.OooO00o(premiumActivity.Oooo0(), strOooO0Oo2), strOooO0Oo2);
                    strOooO00o = o0000O.OooO00o(premiumActivity.Oooo00o(), strOooO0Oo);
                    spannableStringBuilder = spannableStringBuilderOooO00o;
                } else {
                    spannableStringBuilder = p590o0oo0.OooOOOO.OooO00o(((Number) premiumActivity.f27154Oooo0.getValue()).intValue(), o0000O.OooO00o(premiumActivity.Oooo00o(), strOooO0Oo), strOooO0Oo);
                    strOooO00o = o0000O.OooO00o(premiumActivity.Oooo0(), strOooO0Oo2);
                }
                premiumActivity.f27149OooOoOO = 2;
            } else {
                spannableStringBuilder = p590o0oo0.OooOOOO.OooO00o(premiumActivity.Oooo000(), o0000O.OooO00o(premiumActivity.Oooo00o(), strOooO0Oo), strOooO0Oo);
                strOooO00o = o0000O.OooO00o(premiumActivity.Oooo0(), strOooO0Oo2);
                premiumActivity.f27149OooOoOO = 0;
            }
        }
        Button button = premiumActivity.OooOooo().f58616OooO0O0;
        Intrinsics.checkNotNullExpressionValue(button, "binding.btEnOpen");
        o000OO00.OooO0O0(button);
        Button button2 = premiumActivity.OooOooo().f58617OooO0OO;
        Intrinsics.checkNotNullExpressionValue(button2, "binding.btOpen");
        o000OO00.OooO0O0(button2);
        Button button3 = premiumActivity.OooOooo().f58618OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(button3, "binding.btSubscription");
        o000OO00.OooO0O0(button3);
        int i = premiumActivity.f27149OooOoOO;
        if (i == 0) {
            premiumActivity.OooOooo().f58617OooO0OO.setText(oO00OOo0.Activate);
            Button button4 = premiumActivity.OooOooo().f58617OooO0OO;
            Intrinsics.checkNotNullExpressionValue(button4, "binding.btOpen");
            o000OO00.OooOOOO(button4);
        } else if (i != 1) {
            Button button5 = premiumActivity.OooOooo().f58616OooO0O0;
            Intrinsics.checkNotNullExpressionValue(button5, "binding.btEnOpen");
            o000OO00.OooOOOO(button5);
        } else {
            premiumActivity.OooOooo().f58617OooO0OO.setText(oO00OOo0.Renew);
            Button button6 = premiumActivity.OooOooo().f58617OooO0OO;
            Intrinsics.checkNotNullExpressionValue(button6, "binding.btOpen");
            o000OO00.OooOOOO(button6);
        }
        if (premiumInfo.getIndex() <= 2) {
            Button button7 = premiumActivity.OooOooo().f58618OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(button7, "binding.btSubscription");
            o000OO00.OooOOOO(button7);
            int returnMoney = premiumInfo.getReturnMoney();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(returnMoney);
            String strOooO0Oo3 = p590o0oo0.OooOOOO.OooO0Oo(sb3.toString());
            double amount = premiumInfo.getAmount();
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.single_USD);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String strOooO00o2 = p031OoooO0.o0OoOo0.OooO00o(strOooO0OO, ZegoConstants.ZegoVideoDataAuxPublishingStream, OooO0O0.OooO0O0.OooO00o(new Object[]{Double.valueOf(amount)}, 1, "%.2f", "format(format, *args)"));
            o00OO googlePaySkuDetail = premiumInfo.getGooglePaySkuDetail();
            if (googlePaySkuDetail != null) {
                strOooO00o2 = p031OoooO0.o0OoOo0.OooO00o(googlePaySkuDetail.f45872OooO0OO, ZegoConstants.ZegoVideoDataAuxPublishingStream, OooO0O0.OooO0O0.OooO00o(new Object[]{Double.valueOf(googlePaySkuDetail.f45871OooO0O0)}, 1, "%.2f", "format(format, *args)"));
            }
            spannableStringBuilder = p590o0oo0.OooOOOO.OooO00o(premiumActivity.Oooo000(), ((Object) strOooO00o2) + o0000.OooO0OO(oO00OOo0._1_Month), strOooO00o2);
            strOooO00o = o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Subscribe_to_get_XXX_golds_every_month), strOooO0Oo3);
        }
        premiumActivity.OooOooo().f58627OooOOO0.setTextColor(((Number) premiumActivity.f27157Oooo00o.getValue()).intValue());
        premiumActivity.OooOooo().f58627OooOOO0.setText(spannableStringBuilder);
        premiumActivity.OooOooo().f58624OooOO0O.setText(strOooO00o);
    }

    public static final void OooOoOO(PremiumActivity activity) {
        String topInfo = o0000.OooO0OO(activity.f27149OooOoOO == 1 ? oO00OOo0.Renew_success : oO00OOo0.Activation_success);
        String bottomInfo = o0000.OooO0OO(activity.f27149OooOoOO == 1 ? oO00OOo0.Renew_success_tips : oO00OOo0.Activation_success_tips);
        int value = activity.f27150OooOoo.getValue();
        StringBuilder sbOooO0OO = androidx.compose.compiler.plugins.kotlin.OooO0o.OooO0OO("showSuccessDialog  \nname：", topInfo, " \ninfo：", bottomInfo, " \nvipLevel.value：");
        sbOooO0OO.append(value);
        p592o0oo00O.OooOOO0.OooO0O0(sbOooO0OO.toString());
        Intrinsics.checkNotNull(activity, "null cannot be cast to non-null type com.yalla.yalla.base.activity.BaseFragmentActivity");
        int value2 = activity.f27150OooOoo.getValue();
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(topInfo, "topInfo");
        Intrinsics.checkNotNullParameter(bottomInfo, "bottomInfo");
        activity.showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(1363351607, true, new i(value2, topInfo, bottomInfo)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void OooOoo(PremiumActivity premiumActivity, boolean z) {
        premiumActivity.getClass();
        BaseActivityK.OooOo0o(premiumActivity, null, 0L, 3);
        ((AristocracyVM) premiumActivity.f27145OooOo0O.getValue()).syncUserInfo().observe(premiumActivity, new Oooo0(new o0o0Oo(premiumActivity, z)));
    }

    public static final void OooOoo0(PremiumActivity premiumActivity, PayOrder payOrder) {
        premiumActivity.f27155Oooo000 = true;
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(premiumActivity), Dispatchers.getIO(), null, new o00OOO00(premiumActivity, payOrder, null), 2, null);
    }

    public final void OooOooO(PremiumShopModel.PremiumInfo premiumInfo) {
        GooglePaySubscriptionModel.Action action;
        if (this.f27155Oooo000) {
            return;
        }
        this.f27155Oooo000 = true;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.BaseActivityK");
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        int index = premiumInfo.getIndex() + 1;
        GooglePaySubscriptionModel googlePaySubscriptionModel = new GooglePaySubscriptionModel();
        String sku = ((PremiumShopModel.PremiumInfo) this.f27142OooOo.get(this.f27150OooOoo.index())).getSku();
        Intrinsics.checkNotNullParameter(sku, "<set-?>");
        googlePaySubscriptionModel.f23407OooO00o = sku;
        if (this.f27150OooOoo.level() == PremiumLevel.Premium0.getValue()) {
            Intrinsics.checkNotNullParameter("", "<set-?>");
            googlePaySubscriptionModel.f23407OooO00o = "";
            action = GooglePaySubscriptionModel.Action.ForFirst;
        } else {
            action = index > this.f27150OooOoo.index() ? GooglePaySubscriptionModel.Action.Upgrade : GooglePaySubscriptionModel.Action.Downgrade;
        }
        Intrinsics.checkNotNullParameter(action, "<set-?>");
        googlePaySubscriptionModel.f23409OooO0OO = action;
        String sku2 = premiumInfo.getSku();
        PremiumShopModel.ChannelSKU channelSKU = premiumInfo.getChannelSKU();
        if (channelSKU != null) {
            sku2 = channelSKU.getSku();
        }
        String str = sku2;
        WalletCoinVM walletCoinVMOooo0OO = Oooo0OO();
        boolean z = googlePaySubscriptionModel.f23409OooO0OO == GooglePaySubscriptionModel.Action.ForFirst;
        String shopid = premiumInfo.getShopid();
        double amount = premiumInfo.getAmount();
        int iOooo00O = Oooo00O();
        o00OO googlePaySkuDetail = premiumInfo.getGooglePaySkuDetail();
        walletCoinVMOooo0OO.createOrderSubscribe(z, shopid, amount, iOooo00O, str, String.valueOf(googlePaySkuDetail != null ? googlePaySkuDetail.f45872OooO0OO : null)).observe(this, new o0000OO0(new OooO(premiumInfo, googlePaySubscriptionModel), new OooOO0(premiumInfo), new OooOO0O(), true));
    }

    public final pa OooOooo() {
        return (pa) this.f27141OooOOoo.getValue();
    }

    public final String Oooo0() {
        return (String) this.f27161Oooo0o0.getValue();
    }

    public final int Oooo000() {
        return ((Number) this.f27158Oooo0O0.getValue()).intValue();
    }

    public final int Oooo00O() {
        return ((Number) this.f27160Oooo0o.getValue()).intValue();
    }

    public final String Oooo00o() {
        return (String) this.f27159Oooo0OO.getValue();
    }

    public final List<String> Oooo0O0() {
        return (List) this.f27146OooOo0o.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final WalletCoinVM Oooo0OO() {
        return (WalletCoinVM) this.f27143OooOo0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Oooo0o0(boolean z) {
        ViewModelLazy viewModelLazy = this.f27144OooOo00;
        ((PremiumVM) viewModelLazy.getValue()).loadVipTime().observe(this, new o0000OO0(new OooOOO0(), null, new OooOOO(), false, 10));
        if (z) {
            Oooo0O0().clear();
            Oooo0O0().addAll(CollectionsKt.mutableListOf(o0000.OooO0OO(oO00OOo0.Patrician), o0000.OooO0OO(oO00OOo0.Knight), o0000.OooO0OO(oO00OOo0.Baron), o0000.OooO0OO(oO00OOo0.Count), o0000.OooO0OO(oO00OOo0.Marquis)));
            BaseActivityK.OooOo0o(this, null, 0L, 3);
            ((PremiumVM) viewModelLazy.getValue()).loadVipList(oO000O0.f56533OooO00o.OooO0O0()).observe(this, new o0000OO0(new OooOOOO(), new OooOo00(), new OooOo(), false, 8));
        }
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        PayManager payManager = this.f27152OooOooO;
        if (payManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("payManager");
            payManager = null;
        }
        payManager.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooo().f58615OooO00o);
        this.f27151OooOoo0 = PremiumLevel.INSTANCE.of(Integer.valueOf(getIntent().getIntExtra("VipLevel", PremiumLevel.Premium0.getValue()))).index();
        this.f27152OooOooO = new PayManager(this);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        p370o0OOoO.OooOOO0.OooO0OO(window, 0);
        HeaderLayout headerLayout = this.f22755OooOO0;
        int i = 1;
        if (headerLayout != null) {
            p370o0OOoO.OooOOO0.OooO00o(headerLayout, true, 2);
        }
        OooOOoo(oO00OOo0.Yalla_Premium);
        HeaderLayout headerLayout2 = this.f22755OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.OooOo(oOo00OO0.icon_aristocracy_doubt, new oo0o0O0(this));
        }
        OooOooo().f58618OooO0Oo.setOnClickListener(new p358o0OOOooO.o000O0Oo(this, i));
        OooOooo().f58617OooO0OO.setOnClickListener(new View.OnClickListener() { // from class: o0o00o.o00O000o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String strOooO00o;
                int i2 = PremiumActivity.f27140Oooo0oO;
                PremiumActivity this$0 = this.f49012OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                PremiumTimeModel premiumTimeModel = this$0.f27147OooOoO;
                boolean z = true;
                if (premiumTimeModel != null) {
                    if (premiumTimeModel.getSub()) {
                        String strOooO0OO = o0000.OooO0OO(oO00OOo0.vip3vip4_to_vip2vip1);
                        if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                            z = false;
                        }
                        if (z) {
                            return;
                        }
                        o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            o000oo0OooO00o.run();
                            return;
                        } else {
                            o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                            return;
                        }
                    }
                }
                PremiumShopModel.PremiumInfo premiumInfo = (PremiumShopModel.PremiumInfo) this$0.f27142OooOo.get(this$0.f27151OooOoo0);
                String str = this$0.Oooo0O0().get(this$0.f27151OooOoo0);
                int i3 = this$0.f27149OooOoOO;
                if (i3 == 0) {
                    int promotionprice = premiumInfo.getPromotionprice();
                    PremiumTimeModel premiumTimeModel2 = this$0.f27147OooOoO;
                    strOooO00o = premiumTimeModel2 != null && premiumTimeModel2.getState() == PremiumState.Opened.getValue() ? o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_pay_activate_previous), o0OOO0o.OooO00o(promotionprice), str, this$0.Oooo0O0().get(this$0.f27150OooOoo.index())) : o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_pay_activate), o0OOO0o.OooO00o(promotionprice), str);
                } else {
                    strOooO00o = i3 == 1 ? o0000O.OooO00o(o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.Confirm_to_pay_renew), o0OOO0o.OooO00o(premiumInfo.getRenew())), str) : "";
                }
                o0OO00O o0oo00o2 = new o0OO00O(this$0);
                o0oo00o2.OooOo00(strOooO00o);
                o0oo00o2.OooOo(true);
                o0oo00o2.OooOo0(new o00OO(this$0, premiumInfo));
                o0oo00o2.OooOO0o();
            }
        });
        OooOooo().f58616OooO0O0.setOnClickListener(new View.OnClickListener() { // from class: o0o00o.o00O00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = PremiumActivity.f27140Oooo0oO;
                PremiumActivity this$0 = this.f49009OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                o0OO00O o0oo00o2 = new o0OO00O(this$0);
                o0oo00o2.OooOOoo(oO00OOo0.vip3vip4_to_vip2vip1);
                o0oo00o2.OooOO0o();
            }
        });
        o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this);
        oooO00o.OooO00o(p543o0oO0O00.OooO.OooO0OO());
        o000000O o000000o2 = o000000O.f46674OooO00o;
        oooO00o.f43911OooO0OO = (String) o000000O.OooO().getValue();
        oooO00o.f43909OooO00o = 0;
        oooO00o.OooO0Oo(OooOooo().f58621OooO0oO);
        OooOooo().f58620OooO0o0.setShowProtection(true);
        o000000O.OooOO0o().observe(this, new Oooo0(new o00O0OO(this)));
        StateLayout stateLayout = OooOooo().f58622OooO0oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new o00O0OOO(this), 3);
        Oooo0o0(true);
        new p427o0OoOO00.Oooo0(this, new PayManager(this)).OooO0OO(Oooo00O(), true);
        LiveEventBus.get("FixRechargeOrder_Success").observe(this, new o00O0O0O(this));
        LiveEventBus.get("Subscription_OnSuccess_UpdateUserInfo").observe(this, new o00O0OO0(this));
    }

    @Override // com.yalla.yalla.ui.activity.BaseActivityK, com.yalla.yalla.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        o00000OO o00000ooOooOO0O = p408o0Oo0o0O.o00Oo0.OooOO0O();
        o00000ooOooOO0O.getClass();
        o00O000.OooO0O0("premiumRedDot_MomentEdit_Hide4Fragment", o000000O.OooOOo0().getValue(), o00000ooOooOO0O, true);
    }
}
