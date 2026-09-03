package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import com.app.base.model.RoomIndexModel;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.ToastUtil;
import com.code.android.yltheme.TextButtonStyle;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.cloudfilemanager.util.CloudImageUtilKt;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.ui.view.PremiumLevel;
import com.yalla.yalla.common.ui.view.VipLevel;
import com.yalla.yalla.model.CustomizeThemeModel;
import com.yalla.yalla.model.RenewCustomizeTheme;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.activity.user.VipActivity;
import com.yalla.yalla.ui.fragment.RoomThemeCustomizeFragment;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomizeVM;
import com.yalla.yalla.ui.vm.store.ThemeStoreVM;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00O000;
import p254o00ooO0O.o0O0ooO;
import p255o00ooO0o.oo0oOO0;
import p391o0OOooOo.o0O00000;
import p566o0oOo00O.oO000;
import p584o0oOoo.o000O;
import p598o0oo00O.oO00000o;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.dg;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0014R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/yalla/yalla/ui/fragment/RoomThemeCustomizeFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/dg;", "", "initView", "loadData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm$delegate", "Lkotlin/Lazy;", "getStoreVm", "()Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm", "Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "getActivity", "()Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "activity", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomThemeCustomizeFragment extends p503o0o00o00.OooO<dg> {
    public static final int $stable = 8;

    @Nullable
    private p188o00o00o0.OooO0OO<CustomizeThemeModel> mAdapter;

    /* JADX INFO: renamed from: storeVm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy storeVm;

    public static final class OooO extends Lambda implements Function1<String, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            RoomThemeMineActivity activity = RoomThemeCustomizeFragment.this.getActivity();
            if ((activity != null ? activity.f22999OooooOo : null) == RoomThemeMineActivity.ThemeType.Customize) {
                RoomThemeCustomizeFragment.this.loadData();
            } else {
                LiveEventBus.get("ROOM_THEME_UPDATE").post(null);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends p188o00o00o0.OooO0OO<CustomizeThemeModel> {
        public OooO00o(Context context) {
            super(context, R.layout.room_item_theme_customize);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            String strOooO0OO;
            RoomThemeMineActivity activity;
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            CustomizeThemeModel customizeThemeModel = (CustomizeThemeModel) obj;
            if (oooO0o == null || customizeThemeModel == null) {
                return;
            }
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.f48429OooO0OO = CloudImageUtilKt.imgSize(customizeThemeModel.getPic(), com.yalla.support.common.util.OooOo00.OooO00o(165), com.yalla.support.common.util.OooOo00.OooO00o(260));
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.f48454OooOoo0 = 2;
            oooO00o2.f48444OooOOoo = 3;
            oooO00o2.f48441OooOOOo = R.drawable.icon_room_theme_placeholder;
            oooO00o2.OooO0oO(8);
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivTheme));
            if (customizeThemeModel.getIsFrozen()) {
                strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_frozen_unfreeze);
            } else {
                strOooO0OO = customizeThemeModel.getIsExpired() ? p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_purchase_again) : p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_renewals);
            }
            oooO0o.OooOO0(R.id.tvRenewals, strOooO0OO);
            oooO0o.OooO0oO(R.id.flSelectCustomize, customizeThemeModel.getIsSelected());
            oooO0o.OooO0oO(R.id.llFrozen, customizeThemeModel.getIsFrozen());
            if (customizeThemeModel.getIsExpired()) {
                oooO0o.OooO0oO(R.id.tvRenewals, true);
                oooO0o.OooOO0(R.id.tvRemain, com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_invalid_days), String.valueOf(customizeThemeModel.getInvalidDay())));
            } else {
                if (customizeThemeModel.getCurrState() == 0) {
                    oooO0o.OooO0oO(R.id.tvRenewals, false);
                    oooO0o.OooOO0(R.id.tvRemain, p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_under_review));
                } else {
                    oooO0o.OooO0oO(R.id.tvRenewals, true);
                    String strOooO0OO2 = p254o00ooO0O.o000O0O0.OooO0OO(R.string.days_remained);
                    String[] strArr = new String[1];
                    strArr[0] = String.valueOf(customizeThemeModel.getIsFrozen() ? customizeThemeModel.getFroznday() : customizeThemeModel.getDayNum());
                    oooO0o.OooOO0(R.id.tvRemain, com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO2, strArr));
                }
                if (customizeThemeModel.getIsSelected() && (activity = RoomThemeCustomizeFragment.this.getActivity()) != null) {
                    activity.f22999OooooOo = RoomThemeMineActivity.ThemeType.Customize;
                }
            }
            oooO0o.OooO0O0(R.id.ivTheme);
            oooO0o.OooO0O0(R.id.tvRenewals);
            oooO0o.OooO0O0(R.id.llFrozen);
        }
    }

    public static final class OooO0O0 extends p654o0ooo.o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@Nullable View view) {
            RoomThemeCustomizeFragment.this.loadData();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oo0oOO0 f24197Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(oo0oOO0 oo0ooo0) {
            super(0);
            this.f24197Oooo0o = oo0ooo0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            PremiumActivity.f23360o0ooOOo.OooO00o(this.f24197Oooo0o.f34199OooO00o, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ oo0oOO0 f24198Oooo0o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(oo0oOO0 oo0ooo0) {
            super(0);
            this.f24198Oooo0o = oo0ooo0;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipActivity.OooO0O0 oooO0O0 = VipActivity.f23570OoooOOo;
            VipActivity.f23570OoooOOo.OooO00o(this.f24198Oooo0o.f34199OooO00o, VipLevel.Vip0);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiError, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomThemeMineActivity activity = RoomThemeCustomizeFragment.this.getActivity();
            if (activity != null) {
                activity.OooOoO();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ CustomizeThemeModel f24201Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(CustomizeThemeModel customizeThemeModel) {
            super(0);
            this.f24201Oooo0oO = customizeThemeModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            LiveData<ApiResult<RenewCustomizeTheme>> liveDataRenewCustomTheme = RoomThemeCustomizeFragment.this.getStoreVm().renewCustomTheme(this.f24201Oooo0oO.getId(), this.f24201Oooo0oO.getThemeType());
            RoomThemeCustomizeFragment roomThemeCustomizeFragment = RoomThemeCustomizeFragment.this;
            liveDataRenewCustomTheme.observe(roomThemeCustomizeFragment, new o0o0000.OooOo(new o000(roomThemeCustomizeFragment), null, null, false, 14));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<ApiError, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            p188o00o00o0.OooO0OO oooO0OO = RoomThemeCustomizeFragment.this.mAdapter;
            if (oooO0OO != null) {
                oooO0OO.loadError();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<List<CustomizeThemeModel>, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<CustomizeThemeModel> list) {
            List<CustomizeThemeModel> list2 = list;
            p188o00o00o0.OooO0OO oooO0OO = RoomThemeCustomizeFragment.this.mAdapter;
            if (oooO0OO != null) {
                oooO0OO.setNewData(list2);
            }
            p188o00o00o0.OooO0OO oooO0OO2 = RoomThemeCustomizeFragment.this.mAdapter;
            if (oooO0OO2 != null) {
                oooO0OO2.setLoadComplete();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<ApiResult<List<CustomizeThemeModel>>, Unit> {
        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<CustomizeThemeModel>> apiResult) {
            ApiResult<List<CustomizeThemeModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomThemeMineActivity activity = RoomThemeCustomizeFragment.this.getActivity();
            if (activity != null) {
                activity.OooOoO();
            }
            return Unit.INSTANCE;
        }
    }

    public RoomThemeCustomizeFragment() {
        final Function0<Fragment> function0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) function0.invoke();
            }
        });
        this.storeVm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(ThemeStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o00OO0O.OooOO0.OooO00o(lazy, "owner.viewModelStore");
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
            public final /* synthetic */ Function0 f24208Oooo0o = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function1 = this.f24208Oooo0o;
                if (function1 != null && (creationExtras = (CreationExtras) function1.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = androidx.fragment.app.o0000O.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                CreationExtras defaultViewModelCreationExtras = hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : null;
                return defaultViewModelCreationExtras == null ? CreationExtras.Empty.INSTANCE : defaultViewModelCreationExtras;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$5
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoomThemeMineActivity getActivity() {
        if (!(getContext() instanceof RoomThemeMineActivity)) {
            return null;
        }
        Context context = getContext();
        Intrinsics.checkNotNull(context, "null cannot be cast to non-null type com.yalla.yalla.ui.activity.room.RoomThemeMineActivity");
        return (RoomThemeMineActivity) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ThemeStoreVM getStoreVm() {
        return (ThemeStoreVM) this.storeVm.getValue();
    }

    private final void initView() {
        LiveEventBus.get("ROOM_THEME_UPDATE").observe(this, new oO000(this, 3));
        OooO00o oooO00o = new OooO00o(getContext());
        this.mAdapter = oooO00o;
        oooO00o.setLoadErrorClickListener(new OooO0O0());
        p188o00o00o0.OooO0OO<CustomizeThemeModel> oooO0OO = this.mAdapter;
        if (oooO0OO != null) {
            oooO0OO.setOnItemChildClickListener(new BaseQuickAdapter.OooOOO0() { // from class: o0oOoOoO.d3
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooOOO0
                public final void OooO0oo(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    RoomThemeCustomizeFragment.m396initView$lambda3(this.f46848OooO0Oo, baseQuickAdapter, view, i);
                }
            });
        }
        p188o00o00o0.OooO0OO<CustomizeThemeModel> oooO0OO2 = this.mAdapter;
        if (oooO0OO2 != null) {
            oooO0OO2.setEmptyImageRes(R.drawable.ic_empty_message_system);
        }
        p188o00o00o0.OooO0OO<CustomizeThemeModel> oooO0OO3 = this.mAdapter;
        if (oooO0OO3 != null) {
            oooO0OO3.setEmptyText(R.string.room_theme_customize_no_data);
        }
        getBinding().f49195OooO0O0.setLayoutManager(new GridLayoutManager(getContext(), 2));
        getBinding().f49195OooO0O0.setAdapter(this.mAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-0, reason: not valid java name */
    public static final void m395initView$lambda0(RoomThemeCustomizeFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m396initView$lambda3(RoomThemeCustomizeFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.CustomizeThemeModel");
        CustomizeThemeModel customizeThemeModel = (CustomizeThemeModel) obj;
        boolean z = true;
        if (customizeThemeModel.getIsFrozen()) {
            Context context = this$0.getBinding().f49195OooO0O0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "binding.rvThemeLayout.context");
            oo0oOO0 oo0ooo0 = new oo0oOO0(context);
            oo0ooo0.OooOo0O(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_new_unfrozen_content));
            oo0ooo0.OooOooo();
            oo0ooo0.OooOooO(p254o00ooO0O.o000O0O0.OooO0OO(R.string.title_RoomMember_Tips));
            oo0ooo0.OooOoOO(true);
            oo0ooo0.OooOOo0(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Get_Yalla_Premium));
            oo0ooo0.OooOoO0(p254o00ooO0O.o000O0O0.OooO0OO(R.string.Get_Vip));
            TextButtonStyle buttonStyle = TextButtonStyle.OutLined;
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            TextView textView = oo0ooo0.OooOOO().f34398OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvConfirm");
            oo0ooo0.OooOOOO(textView, buttonStyle);
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            TextView textView2 = oo0ooo0.OooOOO().f34399OooO0o;
            Intrinsics.checkNotNullExpressionValue(textView2, "dialogBinding.tvRefuse");
            oo0ooo0.OooOOOO(textView2, buttonStyle);
            oo0ooo0.OooOo0o(new OooO0OO(oo0ooo0));
            oo0ooo0.OooOo(new OooO0o(oo0ooo0));
            oo0ooo0.OooOOO0();
            return;
        }
        if (customizeThemeModel.getCurrState() == 0) {
            String strOooO0OO = p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_toast_under_review);
            ToastUtil toastUtil = ToastUtil.f12568OooO0O0;
            if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                z = false;
            }
            if (z) {
                return;
            }
            o0O0ooO o0o0oooOooO0O0 = p074o000O0oo.OooOOO.OooO0O0(toastUtil, strOooO0OO, "runnable");
            if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                o0o0oooOooO0O0.run();
                return;
            } else {
                o00O000 o00o001 = o00O000.f34346OooO00o;
                o00O000.f34348OooO0OO.post(o0o0oooOooO0O0);
                return;
            }
        }
        if (view.getId() == R.id.ivTheme) {
            if (customizeThemeModel.getIsSelected() || customizeThemeModel.getIsExpired()) {
                return;
            }
            RoomThemeMineActivity activity = this$0.getActivity();
            if (activity != null) {
                BaseActivityK.OooOoo0(activity, null, 0L, 3, null);
            }
            p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
            RoomIndexModel value = p498o0o00Oo0.OooOOO.f41251Oooo0OO.getValue();
            String str = value != null ? value.barid : null;
            if (str == null) {
                str = "";
            }
            this$0.getStoreVm().setRoomTheme(customizeThemeModel.getId(), com.yalla.support.common.util.OooO.OooO0oO(str)).observe(this$0, new o0o0000.OooOo(this$0.new OooO(), this$0.new OooOO0(), null, false, 12));
            return;
        }
        if (view.getId() == R.id.tvRenewals) {
            if (customizeThemeModel.getIsExpired()) {
                o000O.OooO00o(oO00000o.f47706OooO00o, o000O00O.OooO0OO.OooO0O0(TuplesKt.to("preThemeThemeId", Long.valueOf(customizeThemeModel.getId())), TuplesKt.to("preThemePicUrl", customizeThemeModel.getPic()), TuplesKt.to("preThemeThemeType", Integer.valueOf(customizeThemeModel.getThemeType()))));
                return;
            }
            o0O00000.OooO0OO("Me_store_CreateTheme_renew");
            Context context2 = this$0.getBinding().f49195OooO0O0.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "binding.rvThemeLayout.context");
            oo0oOO0 oo0ooo1 = new oo0oOO0(context2);
            oo0ooo1.OooOo0O(com.yalla.support.common.util.OooOo.OooO00o(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_theme_customize_new_renewals_content), String.valueOf(customizeThemeModel.getRenewPrice()), RoomThemeCustomizeVM.INSTANCE.OooO00o(customizeThemeModel.getThemeType())));
            oo0ooo1.OooOoOO(true);
            oo0ooo1.OooOOo0(p254o00ooO0O.o000O0O0.OooO0OO(R.string.room_dialog_theme_customize_renewals));
            oo0ooo1.OooOo0o(this$0.new OooOO0O(customizeThemeModel));
            oo0ooo1.OooOOO0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        getStoreVm().getCustomizeThemeListData().observe(this, new o0o0000.OooOo(new OooOOO0(), new OooOOO(), new OooOOOO(), false, 8));
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        loadData();
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public dg getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        dg dgVarInflate = dg.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(dgVarInflate, "inflate(inflater, container, false)");
        return dgVarInflate;
    }
}
