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
import androidx.fragment.app.o000Oo0;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
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
import com.code.android.util.o000O00O;
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
import p022Oooo00O.o0O0o000;
import p205o00o0o0o.o000O;
import p407o0Oo0OOO.i0;
import p472o0OoooO.oo0OOoo;
import p474o0OoooOO.oo0oO0;
import p490o0o00O0.o0O0o0;
import p527o0o0OO0.o00OO0O0;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OO00O;
import p570o0oOo0o.o000O0;
import p593o0oOoooO.h0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u001a\u0010\n\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\u000b\u001a\u00020\u0003H\u0014R\u001b\u0010\u0011\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/yalla/yalla/ui/fragment/room/RoomThemeCustomizeFragment;", "Lo0o0OO0/o00OO0O0;", "Lo0Oo0OOO/i0;", "", "initView", "loadData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm$delegate", "Lkotlin/Lazy;", "getStoreVm", "()Lcom/yalla/yalla/ui/vm/store/ThemeStoreVM;", "storeVm", "Lo0oOo0o/o000O0;", "Lcom/yalla/yalla/model/CustomizeThemeModel;", "mAdapter", "Lo0oOo0o/o000O0;", "Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "getActivity", "()Lcom/yalla/yalla/ui/activity/room/RoomThemeMineActivity;", "activity", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomThemeCustomizeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeCustomizeFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomThemeCustomizeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,217:1\n106#2,15:218\n*S KotlinDebug\n*F\n+ 1 RoomThemeCustomizeFragment.kt\ncom/yalla/yalla/ui/fragment/room/RoomThemeCustomizeFragment\n*L\n49#1:218,15\n*E\n"})
public final class RoomThemeCustomizeFragment extends o00OO0O0<i0> {
    public static final int $stable = 8;

    @Nullable
    private o000O0<CustomizeThemeModel> mAdapter;

    /* JADX INFO: renamed from: storeVm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy storeVm;

    public static final class OooO extends Lambda implements Function1<String, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            RoomThemeCustomizeFragment roomThemeCustomizeFragment = RoomThemeCustomizeFragment.this;
            RoomThemeMineActivity activity = roomThemeCustomizeFragment.getActivity();
            if ((activity != null ? activity.f26222OooOo : null) == RoomThemeMineActivity.ThemeType.Customize) {
                roomThemeCustomizeFragment.loadData();
            } else {
                LiveEventBus.get("ROOM_THEME_UPDATE").post(Boolean.TRUE);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends o000O0<CustomizeThemeModel> {
        public OooO00o(Context context, int i) {
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
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f56318OooOo);
            oooO00o.f43127OooO0OO = p184o00o00O0.OooO0OO.OooO0oo(o0000O0.OooO00o(165), o0000O0.OooO00o(260), customizeThemeModel.getPic());
            oooO00o.f43125OooO00o = 0;
            oooO00o.f43152OooOoo0 = 2;
            oooO00o.f43142OooOOoo = 3;
            oooO00o.f43139OooOOOo = p565o0oOo000.o0OOO0o.icon_room_theme_placeholder;
            oooO00o.OooO0o0(8);
            int i = p565o0oOo000.o0Oo0oo.ivTheme;
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(i));
            int i2 = p565o0oOo000.o0Oo0oo.tvRenewals;
            if (customizeThemeModel.getIsFrozen()) {
                strOooO0OO = o0000.OooO0OO(o000OOo.room_theme_customize_frozen_unfreeze);
            } else {
                strOooO0OO = customizeThemeModel.getIsExpired() ? o0000.OooO0OO(o000OOo.room_theme_customize_purchase_again) : o0000.OooO0OO(o000OOo.room_theme_customize_renewals);
            }
            viewHolder.setText(i2, strOooO0OO);
            viewHolder.setGone(p565o0oOo000.o0Oo0oo.flSelectCustomize, customizeThemeModel.getIsSelected());
            int i3 = p565o0oOo000.o0Oo0oo.llFrozen;
            viewHolder.setGone(i3, customizeThemeModel.getIsFrozen());
            if (customizeThemeModel.getIsExpired()) {
                viewHolder.setGone(i2, true);
                viewHolder.setText(p565o0oOo000.o0Oo0oo.tvRemain, o0000O.OooO00o(o0000.OooO0OO(o000OOo.room_theme_customize_invalid_days), String.valueOf(customizeThemeModel.getInvalidDay())));
            } else {
                if (customizeThemeModel.isStateUnderReview()) {
                    viewHolder.setGone(i2, false);
                    viewHolder.setText(p565o0oOo000.o0Oo0oo.tvRemain, o0000.OooO0OO(o000OOo.room_theme_customize_under_review));
                } else {
                    viewHolder.setGone(i2, true);
                    int i4 = p565o0oOo000.o0Oo0oo.tvRemain;
                    String strOooO0OO2 = o0000.OooO0OO(o000OOo.days_remained);
                    String[] strArr = new String[1];
                    strArr[0] = String.valueOf(customizeThemeModel.getIsFrozen() ? customizeThemeModel.getFroznday() : customizeThemeModel.getDayNum());
                    viewHolder.setText(i4, o0000O.OooO00o(strOooO0OO2, strArr));
                }
                if (customizeThemeModel.getIsSelected() && (activity = RoomThemeCustomizeFragment.this.getActivity()) != null) {
                    activity.f26222OooOo = RoomThemeMineActivity.ThemeType.Customize;
                }
            }
            viewHolder.addOnClickListener(i);
            viewHolder.addOnClickListener(i2);
            viewHolder.addOnClickListener(i3);
        }
    }

    public static final class OooO0O0 extends oo0OOoo {
        public OooO0O0() {
        }

        @Override // p472o0OoooO.oo0OOoo
        public final void OooO00o(@Nullable View view) {
            RoomThemeCustomizeFragment.this.loadData();
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ o000O f28542OooO0Oo;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(o000O o000o) {
            super(0);
            this.f28542OooO0Oo = o000o;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            int i = PremiumActivity.f26674Oooo0oO;
            PremiumActivity.OooO00o.OooO00o(this.f28542OooO0Oo.f38482OooO00o, PremiumLevel.Premium1);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0o f28543OooO0Oo = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            VipScreen.navigate$default(VipScreen.INSTANCE, null, false, 3, null);
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
                activity.OooOo0();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ CustomizeThemeModel f28546OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(CustomizeThemeModel customizeThemeModel) {
            super(0);
            this.f28546OooO0o0 = customizeThemeModel;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            RoomThemeCustomizeFragment roomThemeCustomizeFragment = RoomThemeCustomizeFragment.this;
            ThemeStoreVM storeVm = roomThemeCustomizeFragment.getStoreVm();
            CustomizeThemeModel customizeThemeModel = this.f28546OooO0o0;
            storeVm.renewCustomTheme(customizeThemeModel.getId(), customizeThemeModel.getThemeType()).observe(roomThemeCustomizeFragment, new p386o0OOoo0O.o0OoOo0(new o000oOoO(roomThemeCustomizeFragment), null, null, false, 14));
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
            o000O0 o000o0 = RoomThemeCustomizeFragment.this.mAdapter;
            if (o000o0 != null) {
                o000o0.OooOoo();
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
            RoomThemeCustomizeFragment roomThemeCustomizeFragment = RoomThemeCustomizeFragment.this;
            o000O0 o000o0 = roomThemeCustomizeFragment.mAdapter;
            if (o000o0 != null) {
                o000o0.OooOoO0(list2);
            }
            o000O0 o000o1 = roomThemeCustomizeFragment.mAdapter;
            if (o000o1 != null) {
                o000o1.Oooo00o();
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
        this.storeVm = o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(ThemeStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.room.RoomThemeCustomizeFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28553OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28553OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000Oo0.OooO00o(lazy);
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
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000Oo0.OooO00o(lazy);
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
        LiveEventBus.get("ROOM_THEME_UPDATE", Boolean.TYPE).observe(this, new o0O0o0(this, 1));
        OooO00o oooO00o = new OooO00o(getContext(), o0OO00O.room_item_theme_customize);
        this.mAdapter = oooO00o;
        oooO00o.Oooo0OO(new OooO0O0());
        o000O0<CustomizeThemeModel> o000o0 = this.mAdapter;
        if (o000o0 != null) {
            o000o0.f13190OooO0oo = new o0O0o000(this);
        }
        if (o000o0 != null) {
            o000o0.OooOooo(p565o0oOo000.o0OOO0o.ic_empty_message_system);
        }
        o000O0<CustomizeThemeModel> o000o1 = this.mAdapter;
        if (o000o1 != null) {
            o000o1.Oooo000(o000OOo.room_theme_customize_no_data);
        }
        getBinding().f43919OooO0O0.setLayoutManager(new GridLayoutManager(getContext(), 2));
        getBinding().f43919OooO0O0.setAdapter(this.mAdapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(RoomThemeCustomizeFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(RoomThemeCustomizeFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.f13200OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.CustomizeThemeModel");
        CustomizeThemeModel customizeThemeModel = (CustomizeThemeModel) obj;
        boolean z = true;
        if (customizeThemeModel.getIsFrozen()) {
            Context context = this$0.getBinding().f43919OooO0O0.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            o000O o000o = new o000O(context);
            o000o.OooOo00(o0000.OooO0OO(o000OOo.room_theme_customize_new_unfrozen_content));
            o000o.OooOoOO();
            o000o.OooOoO(o0000.OooO0OO(o000OOo.title_RoomMember_Tips));
            o000o.OooOo(true);
            o000o.OooOOOo(o0000.OooO0OO(o000OOo.Get_Yalla_Premium));
            o000o.OooOo0o(o0000.OooO0OO(o000OOo.Get_Vip));
            TextButtonStyle buttonStyle = TextButtonStyle.GreenOutLined;
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            TextView tvConfirm = o000o.OooOOO0().f39386OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(tvConfirm, "tvConfirm");
            o000O.OooOOO(tvConfirm, buttonStyle);
            Intrinsics.checkNotNullParameter(buttonStyle, "buttonStyle");
            TextView tvRefuse = o000o.OooOOO0().f39387OooO0o;
            Intrinsics.checkNotNullExpressionValue(tvRefuse, "tvRefuse");
            o000O.OooOOO(tvRefuse, buttonStyle);
            o000o.OooOo0(new OooO0OO(o000o));
            o000o.OooOo0O(OooO0o.f28543OooO0Oo);
            o000o.OooOO0o();
            return;
        }
        if (customizeThemeModel.isStateUnderReview()) {
            String strOooO0OO = o0000.OooO0OO(o000OOo.room_theme_customize_toast_under_review);
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
                o000O00O.f13431OooO0O0.post(o000oo0OooO00o);
                return;
            }
        }
        if (view.getId() == p565o0oOo000.o0Oo0oo.ivTheme) {
            if (customizeThemeModel.getIsSelected() || customizeThemeModel.getIsExpired()) {
                return;
            }
            RoomThemeMineActivity activity = this$0.getActivity();
            if (activity != null) {
                BaseActivityK.OooOo0o(activity, null, 0L, 3);
            }
            RoomIndexModel value = oo0oO0.f48017OoooOoo.getValue();
            String str = value != null ? value.barid : null;
            if (str == null) {
                str = "";
            }
            this$0.getStoreVm().setRoomTheme(customizeThemeModel.getId(), com.code.android.util.o0OoOo0.OooO(0L, str)).observe(this$0, new p386o0OOoo0O.o0OoOo0(this$0.new OooO(), this$0.new OooOO0(), null, false, 12));
            return;
        }
        if (view.getId() == p565o0oOo000.o0Oo0oo.tvRenewals) {
            if (customizeThemeModel.getIsExpired()) {
                p532o0o0OOOO.o0O0o000.OooO0o0(RoomThemeCustomCreateScreen.INSTANCE, p063o0000oO.o000oOoO.OooO0O0(TuplesKt.to(RoomThemeCustomCreateScreen.PRE_THEME_THEME_ID, Long.valueOf(customizeThemeModel.getId())), TuplesKt.to(RoomThemeCustomCreateScreen.PRE_THEME_PIC_URL, customizeThemeModel.getPic()), TuplesKt.to(RoomThemeCustomCreateScreen.PRE_THEME_THEME_TYPE, Integer.valueOf(customizeThemeModel.getThemeType()))), false, null, 12);
                return;
            }
            h0.OooO0O0("105039");
            Context context2 = this$0.getBinding().f43919OooO0O0.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            o000O o000o2 = new o000O(context2);
            String strOooO0OO2 = o0000.OooO0OO(o000OOo.room_theme_customize_new_renewals_content);
            String strValueOf = String.valueOf(customizeThemeModel.getRenewPrice());
            RoomThemeCustomCreateVM.Companion oooO00o = RoomThemeCustomCreateVM.INSTANCE;
            int themeType = customizeThemeModel.getThemeType();
            oooO00o.getClass();
            o000o2.OooOo00(o0000O.OooO00o(strOooO0OO2, strValueOf, themeType == 2 ? "7" : "30"));
            o000o2.OooOo(true);
            o000o2.OooOOOo(o0000.OooO0OO(o000OOo.room_dialog_theme_customize_renewals));
            o000o2.OooOo0(this$0.new OooOO0O(customizeThemeModel));
            o000o2.OooOO0o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadData() {
        getStoreVm().getCustomizeThemeListData().observe(this, new p386o0OOoo0O.o0OoOo0(new OooOOO0(), new OooOOO(), new OooOOOO(), false, 8));
    }

    @Override // p588o0oOooO0.o0O0O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        loadData();
    }

    @Override // p527o0o0OO0.o00OO0O0
    @NotNull
    public i0 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        i0 i0VarInflate = i0.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(i0VarInflate, "inflate(...)");
        return i0VarInflate;
    }
}
