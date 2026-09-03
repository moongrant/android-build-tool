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
import com.code.android.util.o000O0;
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
import p379o0OOoOOO.oOO00O;
import p405o0Oo0OOO.o00O0OO0;
import p475o0Ooooo0.o0O00oO0;
import p505o0o00oOO.o0O;
import p505o0o00oOO.o0O0oo00;
import p562o0oOo000.o000000;
import p562o0oOo000.o000000O;
import p562o0oOo000.o0OOO0o;
import p563o0oOo00O.o0O0O00;
import p586o0oOooO0.oO0o0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/store/RechargeActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nRechargeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RechargeActivity.kt\ncom/yalla/yalla/ui/activity/store/RechargeActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,104:1\n22#2,2:105\n*S KotlinDebug\n*F\n+ 1 RechargeActivity.kt\ncom/yalla/yalla/ui/activity/store/RechargeActivity\n*L\n24#1:105,2\n*E\n"})
public final class RechargeActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f26548OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList f26550OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f26552OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public int f26553OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26549OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o00O0OO0.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final List<String> f26551OooOo00 = CollectionsKt.mutableListOf(o0000.OooO0OO(o000000.coin));

    public static final class OooO00o extends Lambda implements Function0<oO0o0000> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0o0000 invoke() {
            RechargeActivity rechargeActivity = RechargeActivity.this;
            FragmentManager supportFragmentManager = rechargeActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            return new oO0o0000(supportFragmentManager, rechargeActivity.f26550OooOo0);
        }
    }

    public static final class OooO0O0 implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26555OooO0Oo;

        public OooO0O0(o0O0oo00 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26555OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26555OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26555OooO0Oo;
        }

        public final int hashCode() {
            return this.f26555OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26555OooO0Oo.invoke(obj);
        }
    }

    public RechargeActivity() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new WalletCoinFragment());
        this.f26550OooOo0 = arrayList;
        this.f26552OooOo0O = LazyKt.lazy(new OooO00o());
    }

    public final o00O0OO0 OooOo() {
        return (o00O0OO0) this.f26549OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44327OooO00o);
        setTheme(o000000O.AppTheme_translucent);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        oOO00O.OooO0OO(window, 0);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setBackgroundColor(0);
        }
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooO0O0().observe(this, new OooO0O0(o0O0oo00.f50346OooO0Oo));
        View topView = OooOo().f44329OooO0OO;
        Intrinsics.checkNotNullExpressionValue(topView, "topView");
        o0000O0O.OooO00o(topView);
        Intrinsics.checkNotNullParameter(this, "context");
        o0O0O00.OooO00o oooO00o = new o0O0O00.OooO00o(this);
        oooO00o.f56259OooO0OO = 16.0f;
        oooO00o.f56260OooO0Oo = 16.0f;
        List<String> list = this.f26551OooOo00;
        oooO00o.OooO0O0(list);
        int i = o0OOO0o.white_;
        oooO00o.f56262OooO0o0 = o0000.OooO00o(i);
        oooO00o.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_white_70);
        ViewPagerFixed viewPager = OooOo().f44330OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        oooO00o.OooO0Oo(viewPager);
        oooO00o.f56256OooO = 5.0f;
        oooO00o.f56265OooOO0 = o0000.OooO00o(i);
        oooO00o.f56266OooOO0O = o0000O0.OooO00o(43.0f);
        oooO00o.f56267OooOO0o = o0000O0.OooO00o(2.0f);
        oooO00o.f56257OooO00o.setAdjustMode(true);
        YlTableLayout tabLayout = OooOo().f44328OooO0O0;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        oooO00o.OooO00o(tabLayout);
        OooOo().f44330OooO0Oo.setAdapter((oO0o0000) this.f26552OooOo0O.getValue());
        OooOo().f44330OooO0Oo.setOffscreenPageLimit(list.size());
        OooOo().f44330OooO0Oo.OooO0O0(new o0O(this));
    }
}
