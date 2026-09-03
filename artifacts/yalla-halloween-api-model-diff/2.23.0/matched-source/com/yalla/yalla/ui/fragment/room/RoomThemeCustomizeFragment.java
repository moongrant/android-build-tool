package com.yalla.yalla.ui.fragment.room;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o000O0o;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.GridLayoutManager;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.code.android.uikit.TextButtonStyle;
import com.code.android.util.o0000;
import com.code.android.util.o0000O;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.CustomizeThemeModel;
import com.yalla.yalla.model.PremiumLevel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.room.RoomThemeMineActivity;
import com.yalla.yalla.ui.activity.user.PremiumActivity;
import com.yalla.yalla.ui.screen.store.RoomThemeCustomCreateScreen;
import com.yalla.yalla.ui.screen.user.vip.VipScreen;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import com.yalla.yalla.ui.vm.store.RoomThemeCustomCreateVM;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p157o00OoOO0.o0OO00O;
import p377o0OOoOo.o0000OO0;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p526o0o0OOO0.oo0oOO0;
import p564o0oOo0OO.o000O;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.t8;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0014R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/fragment/room/RoomThemeCustomizeFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/t8;", "", "initView", "loadData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm$delegate", "Lkotlin/Lazy;", "getStoreVm", "()Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm", "Lo0oOo0OO/o000O;", "Lcom/yalla/yalla/model/CustomizeThemeModel;", "mAdapter", "Lo0oOo0OO/o000O;", "Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "getActivity", "()Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "activity", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRoomThemeCustomizeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeCustomizeFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomThemeCustomizeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,217:1\n106#2,15:218\n*S KotlinDebug\n*F\n+ 1 RoomThemeCustomizeFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomThemeCustomizeFragment\n*L\n49#1:218,15\n*E\n"})
public final class RoomThemeCustomizeFragment extends p508o0o0O.OooOO0O<t8> {
    public static final int $stable = 8;

    @Nullable
    private o000O<CustomizeThemeModel> mAdapter;

    /* JADX INFO: renamed from: storeVm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy storeVm;

    public static final class OooO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f29064OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipScreen.navigate$default(VipScreen.INSTANCE, null, false, 3, null);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o implements Observer<Boolean> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Boolean bool) {
            RoomThemeCustomizeFragment.this.loadData();
        }
    }

    public static final class OooO0O0 extends o000O<CustomizeThemeModel> {
        public OooO0O0(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            String strOooO0OO;
            RoomThemeMineActivity activity;
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            CustomizeThemeModel customizeThemeModel = (CustomizeThemeModel) obj;
            if (viewHolder == null || customizeThemeModel == null) {
                return;
            }
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f56196OooOo);
            oooO00o.f43911OooO0OO = p139o00OOooO.OooO0o.OooO0oo(o0000O0.OooO00o(165), o0000O0.OooO00o(260), customizeThemeModel.getPic());
            oooO00o.f43909OooO00o = 0;
            oooO00o.f43936OooOoo0 = 2;
            oooO00o.f43926OooOOoo = 3;
            oooO00o.f43923OooOOOo = oOo00OO0.icon_room_theme_placeholder;
            oooO00o.OooO0o0(8);
            int i = oO00O0oO.ivTheme;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(i));
            int i2 = oO00O0oO.tvRenewals;
            if (customizeThemeModel.getIsFrozen()) {
                strOooO0OO = o0000.OooO0OO(oO00OOo0.room_theme_customize_frozen_unfreeze);
            } else {
                strOooO0OO = customizeThemeModel.getIsExpired() ? o0000.OooO0OO(oO00OOo0.room_theme_customize_purchase_again) : o0000.OooO0OO(oO00OOo0.room_theme_customize_renewals);
            }
            viewHolder.setText(i2, strOooO0OO);
            viewHolder.setGone(oO00O0oO.flSelectCustomize, customizeThemeModel.getIsSelected());
            int i3 = oO00O0oO.llFrozen;
            viewHolder.setGone(i3, customizeThemeModel.getIsFrozen());
            if (customizeThemeModel.getIsExpired()) {
                viewHolder.setGone(i2, true);
                viewHolder.setText(oO00O0oO.tvRemain, o0000O.OooO00o(o0000.OooO0OO(oO00OOo0.room_theme_customize_invalid_days), String.valueOf(customizeThemeModel.getInvalidDay())));
            } else {
                if (customizeThemeModel.isStateUnderReview()) {
                    viewHolder.setGone(i2, false);
                    viewHolder.setText(oO00O0oO.tvRemain, o0000.OooO0OO(oO00OOo0.room_theme_customize_under_review));
                } else {
                    viewHolder.setGone(i2, true);
                    int i4 = oO00O0oO.tvRemain;
                    String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.days_remained);
                    String[] strArr = new String[1];
                    strArr[0] = String.valueOf(customizeThemeModel.getIsFrozen() ? customizeThemeModel.getFroznday() : customizeThemeModel.getDayNum());
                    viewHolder.setText(i4, o0000O.OooO00o(strOooO0OO2, strArr));
                }
                if (customizeThemeModel.getIsSelected() && (activity = RoomThemeCustomizeFragment.this.getActivity()) != null) {
                    activity.f26674OooOo = RoomThemeMineActivity.ThemeType.Customize;
                }
            }
            viewHolder.addOnClickListener(i);
            viewHolder.addOnClickListener(i2);
            viewHolder.addOnClickListener(i3);
        }
    }

    public static final class OooO0OO extends oo00o {
        public OooO0OO() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@Nullable View view) {
            RoomThemeCustomizeFragment.this.loadData();
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o0OO00O f29068OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(o0OO00O o0oo00o2) {
            super(0);
            this.f29068OooO0Oo = o0oo00o2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = PremiumActivity.f27140Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(this.f29068OooO0Oo.f10133OooO00o, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<String, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            RoomThemeCustomizeFragment roomThemeCustomizeFragment = RoomThemeCustomizeFragment.this;
            RoomThemeMineActivity activity = roomThemeCustomizeFragment.getActivity();
            if ((activity != null ? activity.f26674OooOo : null) == RoomThemeMineActivity.ThemeType.Customize) {
                roomThemeCustomizeFragment.loadData();
            } else {
                LiveEventBus.get("ROOM_THEME_UPDATE").post(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiError, Unit> {
        public OooOO0O() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomThemeMineActivity activity = RoomThemeCustomizeFragment.this.getActivity();
            if (activity != null) {
                activity.OooOo0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO extends Lambda implements Function1<List<CustomizeThemeModel>, Unit> {
        public OooOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<CustomizeThemeModel> list) {
            List<CustomizeThemeModel> list2 = list;
            RoomThemeCustomizeFragment roomThemeCustomizeFragment = RoomThemeCustomizeFragment.this;
            o000O o000o = roomThemeCustomizeFragment.mAdapter;
            if (o000o != null) {
                o000o.OooOoO0(list2);
            }
            o000O o000o2 = roomThemeCustomizeFragment.mAdapter;
            if (o000o2 != null) {
                o000o2.Oooo00o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CustomizeThemeModel f29073OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOOO0(CustomizeThemeModel customizeThemeModel) {
            super(0);
            this.f29073OooO0o0 = customizeThemeModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomThemeCustomizeFragment roomThemeCustomizeFragment = RoomThemeCustomizeFragment.this;
            ThemeStoreVM storeVm = roomThemeCustomizeFragment.getStoreVm();
            CustomizeThemeModel customizeThemeModel = this.f29073OooO0o0;
            storeVm.renewCustomTheme(customizeThemeModel.getId(), customizeThemeModel.getThemeType()).observe(roomThemeCustomizeFragment, new o0000OO0(new o000oOoO(roomThemeCustomizeFragment), null, null, false, 14));
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO extends Lambda implements Function1<ApiError, Unit> {
        public OooOOOO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            o000O o000o = RoomThemeCustomizeFragment.this.mAdapter;
            if (o000o != null) {
                o000o.OooOoo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<ApiResult<List<CustomizeThemeModel>>, Unit> {
        public OooOo00() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<CustomizeThemeModel>> apiResult) {
            ApiResult<List<CustomizeThemeModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomThemeMineActivity activity = RoomThemeCustomizeFragment.this.getActivity();
            if (activity != null) {
                activity.OooOo0();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.room.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$1] */
    public RoomThemeCustomizeFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.storeVm = o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(ThemeStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f29079OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f29079OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
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
        LiveEventBus.get("ROOM_THEME_UPDATE", Boolean.TYPE).observe(this, new OooO00o());
        OooO0O0 oooO0O0 = new OooO0O0(getContext(), oO00OO0O.room_item_theme_customize);
        this.mAdapter = oooO0O0;
        oooO0O0.Oooo0OO(new OooO0OO());
        o000O<CustomizeThemeModel> o000o = this.mAdapter;
        if (o000o != null) {
            o000o.f10101OooO0oo = new p229o00oOoO.o00Ooo(this);
        }
        if (o000o != null) {
            o000o.OooOooo(oOo00OO0.ic_empty_message_system);
        }
        o000O<CustomizeThemeModel> o000o2 = this.mAdapter;
        if (o000o2 != null) {
            o000o2.Oooo000(oO00OOo0.room_theme_customize_no_data);
        }
        getBinding().f58875OooO0O0.setLayoutManager(new GridLayoutManager(getContext(), 2));
        getBinding().f58875OooO0O0.setAdapter(this.mAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(RoomThemeCustomizeFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.f10111OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.CustomizeThemeModel");
        CustomizeThemeModel customizeThemeModel = (CustomizeThemeModel) obj;
        boolean z = true;
        if (customizeThemeModel.getIsFrozen()) {
            Context context = this$0.getBinding().f58875OooO0O0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "binding.rvThemeLayout.context");
            o0OO00O o0oo00o2 = new o0OO00O(context);
            o0oo00o2.OooOo00(o0000.OooO0OO(oO00OOo0.room_theme_customize_new_unfrozen_content));
            o0oo00o2.OooOoOO();
            o0oo00o2.OooOoO(o0000.OooO0OO(oO00OOo0.title_RoomMember_Tips));
            o0oo00o2.OooOo(true);
            o0oo00o2.OooOOOo(o0000.OooO0OO(oO00OOo0.Get_Yalla_Premium));
            o0oo00o2.OooOo0o(o0000.OooO0OO(oO00OOo0.Get_Vip));
            TextButtonStyle buttonStyle = TextButtonStyle.GreenOutLined;
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            TextView textView = o0oo00o2.OooOOO0().f38474OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(textView, "dialogBinding.tvConfirm");
            o0OO00O.OooOOO(textView, buttonStyle);
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            TextView textView2 = o0oo00o2.OooOOO0().f38475OooO0o;
            Intrinsics.checkNotNullExpressionValue(textView2, "dialogBinding.tvRefuse");
            o0OO00O.OooOOO(textView2, buttonStyle);
            o0oo00o2.OooOo0(new OooO0o(o0oo00o2));
            o0oo00o2.OooOo0O(OooO.f29064OooO0Oo);
            o0oo00o2.OooOO0o();
            return;
        }
        if (customizeThemeModel.isStateUnderReview()) {
            String strOooO0OO = o0000.OooO0OO(oO00OOo0.room_theme_customize_toast_under_review);
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
        if (view.getId() == oO00O0oO.ivTheme) {
            if (customizeThemeModel.getIsSelected() || customizeThemeModel.getIsExpired()) {
                return;
            }
            RoomThemeMineActivity activity = this$0.getActivity();
            if (activity != null) {
                BaseActivityK.OooOo0o(activity, null, 0L, 3);
            }
            RoomIndexModel value = o000000O.f46724OoooOoo.getValue();
            String str = value != null ? value.barid : null;
            if (str == null) {
                str = "";
            }
            this$0.getStoreVm().setRoomTheme(customizeThemeModel.getId(), com.code.android.util.o0OoOo0.OooO(0L, str)).observe(this$0, new o0000OO0(this$0.new OooOO0(), this$0.new OooOO0O(), null, false, 12));
            return;
        }
        if (view.getId() == oO00O0oO.tvRenewals) {
            if (customizeThemeModel.getIsExpired()) {
                oo0oOO0.OooO0o0(RoomThemeCustomCreateScreen.INSTANCE, p063o0000oO.o00Ooo.OooO0O0(TuplesKt.to(RoomThemeCustomCreateScreen.PRE_THEME_THEME_ID, Long.valueOf(customizeThemeModel.getId())), TuplesKt.to(RoomThemeCustomCreateScreen.PRE_THEME_PIC_URL, customizeThemeModel.getPic()), TuplesKt.to(RoomThemeCustomCreateScreen.PRE_THEME_THEME_TYPE, Integer.valueOf(customizeThemeModel.getThemeType()))), false, null, 12);
                return;
            }
            o0OO000.OooO00o("105039");
            Context context2 = this$0.getBinding().f58875OooO0O0.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "binding.rvThemeLayout.context");
            o0OO00O o0oo00o3 = new o0OO00O(context2);
            String strOooO0OO2 = o0000.OooO0OO(oO00OOo0.room_theme_customize_new_renewals_content);
            String strValueOf = String.valueOf(customizeThemeModel.getRenewPrice());
            RoomThemeCustomCreateVM.Companion oooO00o = RoomThemeCustomCreateVM.INSTANCE;
            int themeType = customizeThemeModel.getThemeType();
            oooO00o.getClass();
            o0oo00o3.OooOo00(o0000O.OooO00o(strOooO0OO2, strValueOf, themeType == 2 ? "7" : "30"));
            o0oo00o3.OooOo(true);
            o0oo00o3.OooOOOo(o0000.OooO0OO(oO00OOo0.room_dialog_theme_customize_renewals));
            o0oo00o3.OooOo0(this$0.new OooOOO0(customizeThemeModel));
            o0oo00o3.OooOO0o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        getStoreVm().getCustomizeThemeListData().observe(this, new o0000OO0(new OooOOO(), new OooOOOO(), new OooOo00(), false, 8));
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        loadData();
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public t8 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        t8 t8VarInflate = t8.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(t8VarInflate, "inflate(inflater, container, false)");
        return t8VarInflate;
    }
}
