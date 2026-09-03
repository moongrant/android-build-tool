package com.yalla.yalla.ui.activity.store;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O0O;
import com.code.android.util.o000O0Oo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p370o0OOoO.OooOOO0;
import p401o0Oo0OO0.o00Oo0;
import p464o0Oooo.o000000O;
import p499o0o00o0O.o00O00;
import p499o0o00o0O.o00O00O;
import p553o0oOOoo.o0oO0O0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oO00Oo00;
import p641o0ooOOOO.m0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/store/RechargeActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nRechargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RechargeActivity.kt\ncom/yalla/yalla/ui/activity/store/RechargeActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,104:1\n22#2,2:105\n*S KotlinDebug\n*F\n+ 1 RechargeActivity.kt\ncom/yalla/yalla/ui/activity/store/RechargeActivity\n*L\n24#1:105,2\n*E\n"})
public final class RechargeActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f27013OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList f27015OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f27017OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f27018OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27014OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(m0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final List<String> f27016OooOo00 = CollectionsKt.mutableListOf(o0000.OooO0OO(oO00OOo0.coin));

    public static final class OooO00o extends Lambda implements Function0<o00Oo0> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00Oo0 invoke() {
            RechargeActivity rechargeActivity = RechargeActivity.this;
            FragmentManager supportFragmentManager = rechargeActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            return new o00Oo0(supportFragmentManager, rechargeActivity.f27015OooOo0);
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27020OooO0Oo;

        public OooO0O0(o00O00 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27020OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27020OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27020OooO0Oo;
        }

        public final int hashCode() {
            return this.f27020OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27020OooO0Oo.invoke(obj);
        }
    }

    public RechargeActivity() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WalletCoinFragment());
        this.f27015OooOo0 = arrayList;
        this.f27017OooOo0O = LazyKt.lazy(new OooO00o());
    }

    public final m0 OooOo() {
        return (m0) this.f27014OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f58387OooO00o);
        setTheme(oO00Oo00.AppTheme_translucent);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        OooOOO0.OooO0OO(window, 0);
        HeaderLayout headerLayout = this.f22755OooOO0;
        if (headerLayout != null) {
            headerLayout.setBackgroundColor(0);
        }
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooO0O0().observe(this, new OooO0O0(o00O00.f49380OooO0Oo));
        View view = OooOo().f58389OooO0OO;
        Intrinsics.checkNotNullExpressionValue(view, "binding.topView");
        o0000O0O.OooO00o(view);
        Intrinsics.checkNotNullParameter(this, "context");
        o0oO0O0o.OooO00o oooO00o = new o0oO0O0o.OooO00o(this);
        oooO00o.f56019OooO0OO = 16.0f;
        oooO00o.f56020OooO0Oo = 16.0f;
        List<String> list = this.f27016OooOo00;
        oooO00o.OooO0O0(list);
        int i = oO00O0o.white_;
        oooO00o.f56022OooO0o0 = o0000.OooO00o(i);
        oooO00o.f56024OooO0oo = o0000.OooO00o(oO00O0o.color_white_70);
        ViewPagerFixed viewPagerFixed = OooOo().f58390OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(viewPagerFixed, "binding.viewPager");
        oooO00o.OooO0Oo(viewPagerFixed);
        oooO00o.f56016OooO = 5.0f;
        oooO00o.f56025OooOO0 = o0000.OooO00o(i);
        oooO00o.f56026OooOO0O = o0000O0.OooO00o(43.0f);
        oooO00o.f56027OooOO0o = o0000O0.OooO00o(2.0f);
        oooO00o.f56017OooO00o.setAdjustMode(true);
        YlTableLayout ylTableLayout = OooOo().f58388OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tabLayout");
        oooO00o.OooO00o(ylTableLayout);
        OooOo().f58390OooO0Oo.setAdapter((o00Oo0) this.f27017OooOo0O.getValue());
        OooOo().f58390OooO0Oo.setOffscreenPageLimit(list.size());
        OooOo().f58390OooO0Oo.OooO0O0(new o00O00O(this));
    }
}
