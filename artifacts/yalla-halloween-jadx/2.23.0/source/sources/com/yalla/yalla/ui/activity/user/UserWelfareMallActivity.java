package com.yalla.yalla.ui.activity.user;

import android.animation.ArgbEvaluator;
import android.os.Bundle;
import android.view.Window;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ComposeView;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O0O;
import com.code.android.util.o000O0Oo;
import com.code.android.util.o000OO00;
import com.google.android.material.appbar.AppBarLayout;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.UserWelfareMallActivity;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.vm.room.VipVm;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147o00Oo0Oo.o000OOo;
import p496o0o00o.oO0OO00;
import p496o0o00o.oO0OO0O;
import p496o0o00o.oOo0o0oO;
import p496o0o00o.ooo0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.gb;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/UserWelfareMallActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nUserWelfareMallActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UserWelfareMallActivity.kt\ncom/yalla/yalla/ui/activity/user/UserWelfareMallActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,130:1\n22#2,2:131\n75#3,13:133\n81#4:146\n107#4,2:147\n81#4:149\n107#4,2:150\n81#4:152\n107#4,2:153\n*S KotlinDebug\n*F\n+ 1 UserWelfareMallActivity.kt\ncom/yalla/yalla/ui/activity/user/UserWelfareMallActivity\n*L\n43#1:131,2\n45#1:133,13\n47#1:146\n47#1:147,2\n48#1:149\n48#1:150,2\n49#1:152\n49#1:153,2\n*E\n"})
public final class UserWelfareMallActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public static final /* synthetic */ int f27370OooOoO0 = 0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27371OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(gb.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ArgbEvaluator f27374OooOo00 = new ArgbEvaluator();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f27373OooOo0 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(VipVm.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.UserWelfareMallActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.UserWelfareMallActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.UserWelfareMallActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f27380OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27380OooO0Oo;
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
    public final MutableState f27375OooOo0O = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public final MutableState f27376OooOo0o = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0L, null, 2, null);

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final MutableState f27372OooOo = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);

    public static final class OooO00o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27377OooO0Oo;

        public OooO00o(oOo0o0oO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27377OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27377OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27377OooO0Oo;
        }

        public final int hashCode() {
            return this.f27377OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27377OooO0Oo.invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final VipVm OooOo(UserWelfareMallActivity userWelfareMallActivity) {
        return (VipVm) userWelfareMallActivity.f27373OooOo0.getValue();
    }

    public final gb OooOoO0() {
        return (gb) this.f27371OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f58006OooO00o);
        this.f27375OooOo0O.setValue(Long.valueOf(getIntent().getLongExtra("POINT_BALANCE", 0L)));
        this.f27376OooOo0o.setValue(Long.valueOf(getIntent().getLongExtra("EXPIRING_POINT", 0L)));
        this.f27372OooOo.setValue(Boolean.valueOf(getIntent().getBooleanExtra("POINT_FROZEN", false)));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type com.yalla.yalla.base.activity.IComposeDialog");
        showDialog((String) null, ComposableLambdaKt.composableLambdaInstance(816363398, true, new ooo0o(this)));
        OooOoO0().f58007OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: o0o00o.oOo0oooO
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i) {
                int i2 = UserWelfareMallActivity.f27370OooOoO0;
                UserWelfareMallActivity this$0 = this.f49189OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO0().f58010OooO0o.setTranslationY(i);
            }
        });
        ComposeView composeView = OooOoO0().f58009OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(composeView, "binding.composeViewTopHead");
        o000OOo.OooO0Oo(composeView, ComposableLambdaKt.composableLambdaInstance(953291860, true, new oO0OO00(this)));
        ComposeView composeView2 = OooOoO0().f58008OooO0OO;
        Intrinsics.checkNotNullExpressionValue(composeView2, "binding.composeViewContent");
        o000OOo.OooO0Oo(composeView2, ComposableLambdaKt.composableLambdaInstance(-1781868867, true, new oO0OO0O(this)));
        OooOo00(getString(oO00OOo0.welfare_benefit_points_mall));
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.OooOo0o();
        }
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        p370o0OOoO.OooOOO0.OooO0OO(window, 0);
        HeaderLayout headerLayout2 = OooOoO0().f58011OooO0o0.f58772OooO00o;
        Intrinsics.checkNotNullExpressionValue(headerLayout2, "binding.headerLayout.root");
        o0000O0O.OooO0OO(headerLayout2);
        ComposeView composeView3 = OooOoO0().f58009OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(composeView3, "binding.composeViewTopHead");
        o000OO00.OooOO0o(composeView3, OooOoO0().f58009OooO0Oo.getPaddingTop() + o0000O0O.OooO0Oo());
        OooOoO0().f58007OooO0O0.OooO00o(new AppBarLayout.OooO0O0() { // from class: o0o00o.oO0O0Oo0
            @Override // com.google.android.material.appbar.AppBarLayout.OooO0O0
            public final void OooO00o(AppBarLayout appBarLayout, int i) {
                int i2 = UserWelfareMallActivity.f27370OooOoO0;
                UserWelfareMallActivity this$0 = this.f49163OooO00o;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.getClass();
                int iOooO0O0 = o0000O0.OooO0O0(i) + 30;
                if (iOooO0O0 >= 0) {
                    HeaderLayout headerLayout3 = this$0.f22755OooOO0;
                    if (headerLayout3 != null) {
                        headerLayout3.setBackgroundColor(o0000.OooO00o(oO00O0o.transparent));
                        return;
                    }
                    return;
                }
                Object objEvaluate = this$0.f27374OooOo00.evaluate(RangesKt.coerceAtMost(Math.abs(iOooO0O0) / 70.0f, 1.0f), Integer.valueOf(o0000.OooO00o(oO00O0o.transparent)), Integer.valueOf(o0000.OooO00o(oO00O0o.color_101217)));
                Intrinsics.checkNotNull(objEvaluate, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) objEvaluate).intValue();
                HeaderLayout headerLayout4 = this$0.f22755OooOO0;
                if (headerLayout4 != null) {
                    headerLayout4.setBackgroundColor(iIntValue);
                }
            }
        });
        HeaderLayout headerLayout3 = this.f22755OooOO0;
        if (headerLayout3 != null) {
            headerLayout3.OooOo(oOo00OO0.ic_vip_help, new o00O0O(this));
        }
    }
}
