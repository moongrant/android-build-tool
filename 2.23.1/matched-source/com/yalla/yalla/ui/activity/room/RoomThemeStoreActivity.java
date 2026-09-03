package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.viewpager2.widget.ViewPager2;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.ThemeListModel;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.room.RoomThemeStoreFragment;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import com.yalla.yalla.ui.vm.store.ThemeStoreVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import net.lucode.hackware.magicindicator.buildins.commonnavigator.CommonNavigator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p407o0Oo0OOO.O0O0;
import p561o0oOOooo.a;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomThemeStoreActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRoomThemeStoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeStoreActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomThemeStoreActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,150:1\n22#2,2:151\n75#3,13:153\n*S KotlinDebug\n*F\n+ 1 RoomThemeStoreActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomThemeStoreActivity\n*L\n40#1:151,2\n41#1:153,13\n*E\n"})
public final class RoomThemeStoreActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final /* synthetic */ int f26227OooOo0o = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final boolean f26229OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public boolean f26231OooOo0O;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final com.code.android.util.o000O0 f26228OooOOoo = new com.code.android.util.o000O0(Reflection.getOrCreateKotlinClass(O0O0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26230OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(ThemeStoreVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.room.RoomThemeStoreActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26242OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26242OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public static final class OooO00o {
    }

    @SourceDebugExtension({"SMAP\nRoomThemeStoreActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomThemeStoreActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomThemeStoreActivity$initData$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1855#2,2:151\n*S KotlinDebug\n*F\n+ 1 RoomThemeStoreActivity.kt\ncom/yalla/yalla/ui/activity/room/RoomThemeStoreActivity$initData$1\n*L\n98#1:151,2\n*E\n"})
    public static final class OooO0O0 extends Lambda implements Function1<List<ThemeListModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ List<String> f26232OooO0Oo;

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<Fragment> f26233OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ RoomThemeStoreActivity f26234OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(RoomThemeStoreActivity roomThemeStoreActivity, ArrayList arrayList, ArrayList arrayList2) {
            super(1);
            this.f26232OooO0Oo = arrayList;
            this.f26234OooO0o0 = roomThemeStoreActivity;
            this.f26233OooO0o = arrayList2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<ThemeListModel> list) {
            List<ThemeListModel> list2 = list;
            List<String> list3 = this.f26232OooO0Oo;
            if (list2 != null) {
                for (ThemeListModel themeListModel : list2) {
                    list3.add(themeListModel.getThemTypeName());
                    RoomThemeStoreFragment.Companion companion = RoomThemeStoreFragment.INSTANCE;
                    int themTypeId = themeListModel.getThemTypeId();
                    companion.getClass();
                    RoomThemeStoreFragment roomThemeStoreFragment = new RoomThemeStoreFragment();
                    Bundle bundle = new Bundle();
                    bundle.putInt("THEME_TYPE_ID", themTypeId);
                    roomThemeStoreFragment.setArguments(bundle);
                    this.f26233OooO0o.add(roomThemeStoreFragment);
                }
            }
            if (list3.size() != 0) {
                int i = RoomThemeStoreActivity.f26227OooOo0o;
                YlTableLayout ylThemeTable = this.f26234OooO0o0.OooOo().f43676OooO0o0;
                Intrinsics.checkNotNullExpressionValue(ylThemeTable, "ylThemeTable");
                com.code.android.util.o000O.OooOOOO(ylThemeTable);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<Fragment> f26236OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(ArrayList arrayList) {
            super(1);
            this.f26236OooO0o0 = arrayList;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = RoomThemeStoreActivity.f26227OooOo0o;
            YlTableLayout ylThemeTable = RoomThemeStoreActivity.this.OooOo().f43676OooO0o0;
            Intrinsics.checkNotNullExpressionValue(ylThemeTable, "ylThemeTable");
            com.code.android.util.o000O.OooO0O0(ylThemeTable);
            RoomThemeStoreFragment.INSTANCE.getClass();
            RoomThemeStoreFragment roomThemeStoreFragment = new RoomThemeStoreFragment();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_TYPE_ID", Integer.MAX_VALUE);
            roomThemeStoreFragment.setArguments(bundle);
            this.f26236OooO0o0.add(roomThemeStoreFragment);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<ApiResult<List<ThemeListModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
        public final /* synthetic */ List<Fragment> f26238OooO0o;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ List<String> f26239OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(ArrayList arrayList, ArrayList arrayList2) {
            super(1);
            this.f26239OooO0o0 = arrayList;
            this.f26238OooO0o = arrayList2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<ThemeListModel>> apiResult) {
            ApiResult<List<ThemeListModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            int i = RoomThemeStoreActivity.f26227OooOo0o;
            RoomThemeStoreActivity roomThemeStoreActivity = RoomThemeStoreActivity.this;
            Context context = roomThemeStoreActivity.OooOo().f43675OooO0Oo.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "context");
            a.OooO00o oooO00o = new a.OooO00o(context);
            oooO00o.OooO0O0(this.f26239OooO0o0);
            oooO00o.f56182OooO0o0 = com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_333333);
            oooO00o.f56184OooO0oo = com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_999999);
            float f = 11;
            oooO00o.f56197OooOo0O = com.code.android.util.o0000O0.OooO00o(f);
            oooO00o.f56180OooO0Oo = 14.0f;
            oooO00o.f56179OooO0OO = 14.0f;
            int iOooO00o = com.code.android.util.o0000O0.OooO00o(f);
            CommonNavigator commonNavigator = oooO00o.f56177OooO00o;
            commonNavigator.setRightPadding(iOooO00o);
            oooO00o.f56184OooO0oo = com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_alpha_38_A3);
            ViewPager2 vpThemePager = roomThemeStoreActivity.OooOo().f43675OooO0Oo;
            Intrinsics.checkNotNullExpressionValue(vpThemePager, "vpThemePager");
            oooO00o.OooO0OO(vpThemePager);
            oooO00o.f56176OooO = 5.0f;
            oooO00o.f56185OooOO0 = com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_00d8c9);
            oooO00o.f56186OooOO0O = com.code.android.util.o0000O0.OooO00o(f);
            oooO00o.f56187OooOO0o = com.code.android.util.o0000O0.OooO00o(3);
            commonNavigator.setAdjustMode(false);
            YlTableLayout ylThemeTable = roomThemeStoreActivity.OooOo().f43676OooO0o0;
            Intrinsics.checkNotNullExpressionValue(ylThemeTable, "ylThemeTable");
            oooO00o.OooO00o(ylThemeTable);
            ViewPager2 viewPager2 = roomThemeStoreActivity.OooOo().f43675OooO0Oo;
            List<Fragment> list = this.f26238OooO0o;
            viewPager2.setOffscreenPageLimit(list.size());
            roomThemeStoreActivity.OooOo().f43675OooO0Oo.setAdapter(new o0oOO(roomThemeStoreActivity, list));
            roomThemeStoreActivity.OooOo0();
            return Unit.INSTANCE;
        }
    }

    static {
        new OooO00o();
    }

    public RoomThemeStoreActivity() {
        this.f26229OooOo0 = p474o0OoooOO.oo0oO0.f48017OoooOoo.getValue() != null;
    }

    public final O0O0 OooOo() {
        return (O0O0) this.f26228OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void OooOoO0() {
        BaseActivityK.OooOo0o(this, null, 0L, 3);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ((ThemeStoreVM) this.f26230OooOo00.getValue()).getThemeStyleListData().observe(this, new p386o0OOoo0O.o0OoOo0(new OooO0O0(this, arrayList, arrayList2), new OooO0OO(arrayList2), new OooO0o(arrayList, arrayList2), false, 8));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f43672OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        p381o0OOoOOO.o00O00o0.OooO0OO(window, 0);
        OooOOoo(p565o0oOo000.o000OOo.Room_themes);
        HeaderLayout headerLayout = this.f22289OooOO0;
        if (headerLayout != null) {
            p381o0OOoOOO.o00O00o0.OooO00o(headerLayout, true, 2);
        }
        HeaderLayout headerLayout2 = this.f22289OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.setBackgroundColor(0);
        }
        if (this.f26229OooOo0) {
            HeaderLayout headerLayout3 = this.f22289OooOO0;
            if (headerLayout3 != null) {
                headerLayout3.OooOoO0(p565o0oOo000.o000OOo.Mine, new o0O00o0(this));
            }
        } else {
            ConstraintLayout clThemeHead = OooOo().f43674OooO0OO.f43723OooO0O0;
            Intrinsics.checkNotNullExpressionValue(clThemeHead, "clThemeHead");
            com.code.android.util.o000O.OooOOOO(clThemeHead);
            OooOo().f43674OooO0OO.f43724OooO0OO.setOnClickListener(new oo00oO(this));
        }
        boolean booleanExtra = getIntent().getBooleanExtra("IS_SHOW_RECHARGE", false);
        this.f26231OooOo0O = getIntent().getBooleanExtra("IsFromMyOutfit", false);
        if (booleanExtra) {
            ConstraintLayout clThemeFoot = OooOo().f43673OooO0O0.f43703OooO0O0;
            Intrinsics.checkNotNullExpressionValue(clThemeFoot, "clThemeFoot");
            com.code.android.util.o000O.OooOOOO(clThemeFoot);
            TextView textView = OooOo().f43673OooO0O0.f43704OooO0OO;
            p474o0OoooOO.oo0oO0 oo0oo0 = p474o0OoooOO.oo0oO0.f47967OooO00o;
            textView.setText(p595o0oo0.OooOo00.OooO0Oo(String.valueOf(p474o0OoooOO.oo0oO0.OooO0O0().getValue())));
            OooOo().f43673OooO0O0.f43705OooO0Oo.setOnClickListener(new o0oOOo(this));
        }
        OooOoO0();
        LiveEventBus.get("ROOM_THEME_REQUEST_FAILED").observe(this, new o00Oo00(this, 0));
    }
}
