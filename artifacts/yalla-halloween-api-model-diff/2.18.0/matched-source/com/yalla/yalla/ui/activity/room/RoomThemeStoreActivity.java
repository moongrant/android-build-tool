package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.app.base.view.HeaderLayout;
import com.app.base.view.indicator.YlTableLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.model.ThemeListModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.RoomThemeStoreFragment;
import com.yalla.yalla.ui.vm.store.ThemeStoreVM;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p169o00Ooo0.o0O0O00;
import p255o00ooO0O.o000O0O0;
import p255o00ooO0O.o00O000o;
import p255o00ooO0O.oOO00O;
import p480o0OooooO.oO0o0o;
import p503o0o00o.o0000OO0;
import p546o0o0OoOO.k6;
import p546o0o0OoOO.l6;
import p546o0o0OoOO.m6;
import p651o0ooOOoo.se;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomThemeStoreActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomThemeStoreActivity extends BaseActivityK {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23019Oooooo0 = new OooO00o();

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final o00O000o f23020OooooO0 = new o00O000o(Reflection.getOrCreateKotlinClass(se.class), this, null);

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23021OooooOO = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ThemeStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f23033Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23033Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public final boolean f23022OooooOo;

    public static final class OooO00o {
        public final void OooO00o(@Nullable Context context, boolean z) {
            Intent intent = new Intent(context, (Class<?>) RoomThemeStoreActivity.class);
            intent.putExtra("IS_SHOW_RECHARGE", z);
            if (context != null) {
                context.startActivity(intent);
            }
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<List<ThemeListModel>, Unit> {

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ List<String> f23023Oooo;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ List<Fragment> f23024OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ RoomThemeStoreActivity f23025OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(List<String> list, RoomThemeStoreActivity roomThemeStoreActivity, List<Fragment> list2) {
            super(1);
            this.f23023Oooo = list;
            this.f23025OoooO00 = roomThemeStoreActivity;
            this.f23024OoooO0 = list2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<ThemeListModel> list) {
            List<ThemeListModel> list2 = list;
            if (list2 != null) {
                List<String> list3 = this.f23023Oooo;
                List<Fragment> list4 = this.f23024OoooO0;
                for (ThemeListModel themeListModel : list2) {
                    list3.add(themeListModel.getThemTypeName());
                    RoomThemeStoreFragment.Companion companion = RoomThemeStoreFragment.INSTANCE;
                    int themTypeId = themeListModel.getThemTypeId();
                    Objects.requireNonNull(companion);
                    RoomThemeStoreFragment roomThemeStoreFragment = new RoomThemeStoreFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("THEME_TYPE_ID", themTypeId);
                    roomThemeStoreFragment.setArguments(bundle);
                    list4.add(roomThemeStoreFragment);
                }
            }
            if (this.f23023Oooo.size() != 0) {
                RoomThemeStoreActivity roomThemeStoreActivity = this.f23025OoooO00;
                OooO00o oooO00o = RoomThemeStoreActivity.f23019Oooooo0;
                YlTableLayout ylTableLayout = roomThemeStoreActivity.OooOoo().f50598OooO0o0;
                Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.ylThemeTable");
                oOO00O.OooO(ylTableLayout);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ List<Fragment> f23027OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(List<Fragment> list) {
            super(1);
            this.f23027OoooO00 = list;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomThemeStoreActivity roomThemeStoreActivity = RoomThemeStoreActivity.this;
            OooO00o oooO00o = RoomThemeStoreActivity.f23019Oooooo0;
            YlTableLayout ylTableLayout = roomThemeStoreActivity.OooOoo().f50598OooO0o0;
            Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.ylThemeTable");
            oOO00O.OooO00o(ylTableLayout);
            List<Fragment> list = this.f23027OoooO00;
            Objects.requireNonNull(RoomThemeStoreFragment.INSTANCE);
            RoomThemeStoreFragment roomThemeStoreFragment = new RoomThemeStoreFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_TYPE_ID", Integer.MAX_VALUE);
            roomThemeStoreFragment.setArguments(bundle);
            list.add(roomThemeStoreFragment);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<List<ThemeListModel>>, Unit> {

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public final /* synthetic */ List<Fragment> f23029OoooO0;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public final /* synthetic */ List<String> f23030OoooO00;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(List<String> list, List<Fragment> list2) {
            super(1);
            this.f23030OoooO00 = list;
            this.f23029OoooO0 = list2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<ThemeListModel>> apiResult) {
            ApiResult<List<ThemeListModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RoomThemeStoreActivity roomThemeStoreActivity = RoomThemeStoreActivity.this;
            OooO00o oooO00o = RoomThemeStoreActivity.f23019Oooooo0;
            Context context = roomThemeStoreActivity.OooOoo().f50597OooO0Oo.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "binding.vpThemePager.context");
            Intrinsics.checkNotNullParameter(context, "context");
            o00o000O.OooO0O0.OooO00o oooO00o2 = new o00o000O.OooO0O0.OooO00o(context);
            oooO00o2.OooO0O0(this.f23030OoooO00);
            oooO00o2.f33004OooO0o = o000O0O0.OooO00o(R.color.color_333333);
            oooO00o2.f33006OooO0oO = o000O0O0.OooO00o(R.color.color_999999);
            float f = 11;
            oooO00o2.f33018OooOo0 = com.yalla.support.common.util.OooOo00.OooO00o(f);
            oooO00o2.f33005OooO0o0 = 14.0f;
            oooO00o2.f33003OooO0Oo = 14.0f;
            oooO00o2.f33001OooO0O0.setRightPadding(com.yalla.support.common.util.OooOo00.OooO00o(f));
            oooO00o2.f33006OooO0oO = o000O0O0.OooO00o(R.color.color_alpha_38_A3);
            ViewPager2 viewPager2 = RoomThemeStoreActivity.this.OooOoo().f50597OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(viewPager2, "binding.vpThemePager");
            oooO00o2.OooO0Oo(viewPager2);
            oooO00o2.f33007OooO0oo = 5.0f;
            oooO00o2.f32999OooO = o000O0O0.OooO00o(R.color.color_00d8c9);
            oooO00o2.f33008OooOO0 = com.yalla.support.common.util.OooOo00.OooO00o(f);
            oooO00o2.f33009OooOO0O = com.yalla.support.common.util.OooOo00.OooO00o(3);
            oooO00o2.f33001OooO0O0.setAdjustMode(false);
            YlTableLayout ylTableLayout = RoomThemeStoreActivity.this.OooOoo().f50598OooO0o0;
            Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.ylThemeTable");
            oooO00o2.OooO00o(ylTableLayout);
            RoomThemeStoreActivity.this.OooOoo().f50597OooO0Oo.setOffscreenPageLimit(this.f23029OoooO0.size());
            RoomThemeStoreActivity.this.OooOoo().f50597OooO0Oo.setAdapter(new OooOo(RoomThemeStoreActivity.this, this.f23029OoooO0));
            RoomThemeStoreActivity.this.OooOoO();
            return Unit.INSTANCE;
        }
    }

    public RoomThemeStoreActivity() {
        p500o0o00Oo0.OooOOO oooOOO = p500o0o00Oo0.OooOOO.f41235OooO00o;
        this.f23022OooooOo = p500o0o00Oo0.OooOOO.f41270Oooo0OO.getValue() != null;
    }

    public final se OooOoo() {
        return (se) this.f23020OooooO0.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOooO() {
        BaseActivityK.OooOoo0(this, null, 0L, 3, null);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ((ThemeStoreVM) this.f23021OooooOO.getValue()).getThemeStyleListData().observe(this, new o0o0000.OooOo(new OooO0O0(arrayList, this, arrayList2), new OooO0OO(arrayList2), new OooO0o(arrayList, arrayList2), false, 8));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f50594OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0o0o.OooO0Oo(window, 0);
        OooOo(R.string.Room_themes);
        HeaderLayout headerLayout = this.f11480OoooOOO;
        if (headerLayout != null) {
            oO0o0o.OooO0O0(headerLayout, true, 2);
        }
        HeaderLayout headerLayout2 = this.f11480OoooOOO;
        if (headerLayout2 != null) {
            headerLayout2.setBackgroundColor(0);
        }
        if (this.f23022OooooOo) {
            HeaderLayout headerLayout3 = this.f11480OoooOOO;
            if (headerLayout3 != null) {
                headerLayout3.OooOoo0(R.string.Mine, new k6());
            }
        } else {
            ConstraintLayout constraintLayout = OooOoo().f50596OooO0OO.f50914OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.themeHeadLayout.clThemeHead");
            oOO00O.OooO(constraintLayout);
            OooOoo().f50596OooO0OO.f50915OooO0OO.setOnClickListener(new l6(this));
        }
        if (getIntent().getBooleanExtra("IS_SHOW_RECHARGE", false)) {
            ConstraintLayout constraintLayout2 = OooOoo().f50595OooO0O0.f50830OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "binding.themeFootLayout.clThemeFoot");
            oOO00O.OooO(constraintLayout2);
            OooOoo().f50595OooO0O0.f50831OooO0OO.setText(o0O0O00.OooO0Oo(String.valueOf(p500o0o00Oo0.OooOOO.f41235OooO00o.OooO0OO().getValue())));
            OooOoo().f50595OooO0O0.f50832OooO0Oo.setOnClickListener(new m6(this));
        }
        OooOooO();
        LiveEventBus.get("ROOM_THEME_REQUEST_FAILED").observe(this, new o0000OO0(this, 5));
    }
}
