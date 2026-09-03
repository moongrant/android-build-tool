package com.yalla.yalla.ui.activity.main;

import android.R;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.view.o0;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.MainSearchRoomFragment;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import com.yalla.yalla.ui.vm.main.SearchVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p193o00o0O0O.o0000oo;
import p379o0OOoOOO.oOO00O;
import p405o0Oo0OOO.oO000;
import p443o0OoOo0o.o000O00;
import p487o0o00O.o000O;
import p487o0o00O.o00oOoo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p563o0oOo00O.o0O0O00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/main/MainSearchActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMainSearchActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSearchActivity.kt\ncom/yalla/yalla/ui/activity/main/MainSearchActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,156:1\n22#2,2:157\n75#3,13:159\n*S KotlinDebug\n*F\n+ 1 MainSearchActivity.kt\ncom/yalla/yalla/ui/activity/main/MainSearchActivity\n*L\n48#1:157,2\n60#1:159,13\n*E\n"})
public final class MainSearchActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    public static final /* synthetic */ int f24960OooOoO = 0;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @Nullable
    public Function1<? super String, Unit> f24967OooOoO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f24961OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(oO000.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final Lazy f24964OooOo00 = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final Lazy f24963OooOo0 = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f24965OooOo0O = new ArrayList();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f24966OooOo0o = new ViewModelLazy(Reflection.getOrCreateKotlinClass(SearchVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.main.MainSearchActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.main.MainSearchActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.main.MainSearchActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f24972OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24972OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final List<String> f24962OooOo = CollectionsKt.mutableListOf(o0000.OooO0OO(o000000.Rooms), o0000.OooO0OO(o000000.Users));

    public static final class OooO00o extends Lambda implements Function0<MainSearchRoomFragment> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainSearchRoomFragment invoke() {
            MainSearchRoomFragment mainSearchRoomFragment = new MainSearchRoomFragment();
            mainSearchRoomFragment.setOnScrollListener(new OooO(MainSearchActivity.this));
            return mainSearchRoomFragment;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<MainSearchUserFragment> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final MainSearchUserFragment invoke() {
            MainSearchUserFragment mainSearchUserFragment = new MainSearchUserFragment();
            mainSearchUserFragment.setOnScrollListener(new OooOO0(MainSearchActivity.this));
            return mainSearchUserFragment;
        }
    }

    public final oO000 OooOo() {
        return (oO000) this.f24961OooOOoo.getValue();
    }

    public final void OooOoO(String str) {
        if (str.length() == 0) {
            return;
        }
        Intrinsics.checkNotNullParameter(this, "activity");
        Object systemService = getSystemService("input_method");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(findViewById(R.id.content).getWindowToken(), 0);
        OooOoO0().saveNewSearchText(str);
        LiveEventBus.get("MainSearch").post(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final SearchVM OooOoO0() {
        return (SearchVM) this.f24966OooOo0o.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44724OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        oOO00O.OooO0OO(window, 0);
        getWindow().setStatusBarColor(o0000.OooO00o(o0OOO0o.tr_00));
        o0 o0Var = new o0(getWindow().getDecorView(), getWindow());
        Intrinsics.checkNotNullExpressionValue(o0Var, "getInsetsController(...)");
        o0Var.OooO00o(true);
        ArrayList arrayList = this.f24965OooOo0O;
        arrayList.add((MainSearchRoomFragment) this.f24964OooOo00.getValue());
        arrayList.add((MainSearchUserFragment) this.f24963OooOo0.getValue());
        OooOo().f44727OooO0Oo.setAdapter(new o000O(this, getSupportFragmentManager(), arrayList));
        ComposeView composeHead = OooOo().f44725OooO0O0;
        Intrinsics.checkNotNullExpressionValue(composeHead, "composeHead");
        o0000oo.OooO0Oo(composeHead, ComposableLambdaKt.composableLambdaInstance(-1621142074, true, new o00oOoo(this)));
        Intrinsics.checkNotNullParameter(this, "context");
        o0O0O00.OooO00o oooO00o = new o0O0O00.OooO00o(this);
        oooO00o.f56259OooO0OO = 16.0f;
        oooO00o.f56260OooO0Oo = 16.0f;
        oooO00o.OooO0O0(this.f24962OooOo);
        oooO00o.f56262OooO0o0 = o0000.OooO00o(o0OOO0o.color_333333);
        Typeface typeface = Typeface.DEFAULT;
        Intrinsics.checkNotNullExpressionValue(typeface, "DEFAULT");
        Typeface typefaceSelect = Typeface.DEFAULT_BOLD;
        Intrinsics.checkNotNullExpressionValue(typefaceSelect, "DEFAULT_BOLD");
        Intrinsics.checkNotNullParameter(typeface, "typeface");
        Intrinsics.checkNotNullParameter(typefaceSelect, "typefaceSelect");
        oooO00o.f56261OooO0o = typeface;
        oooO00o.f56263OooO0oO = typefaceSelect;
        oooO00o.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_333333_45);
        oooO00o.f56265OooOO0 = o0000.OooO00o(o0OOO0o.color_00d8c9);
        oooO00o.f56256OooO = o0000O0.OooO00o(1.5f);
        oooO00o.f56267OooOO0o = o0000O0.OooO00o(3.0f);
        oooO00o.f56266OooOO0O = o0000O0.OooO00o(16.0f);
        oooO00o.f56257OooO00o.setAdjustMode(true);
        ViewPagerFixed viewPager = OooOo().f44727OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        oooO00o.OooO0Oo(viewPager);
        YlTableLayout tabLayout = OooOo().f44726OooO0OO;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        oooO00o.OooO00o(tabLayout);
        LiveEventBus.get("MainSearchSetText", String.class).observe(this, new o000O00(this, 1));
    }
}
