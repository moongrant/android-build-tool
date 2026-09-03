package com.yalla.yalla.ui.activity.store;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o0000O0O;
import com.code.android.util.o000O0;
import com.code.android.util.o0OoOo0;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import com.yalla.yalla.ui.fragment.WalletCrystalFragment;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmOverloads;
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
import p405o0Oo0OOO.f2;
import p475o0Ooooo0.o0O00oO0;
import p492o0o00OO0.o0O0OOO0;
import p492o0o00OO0.o0oOo0O0;
import p505o0o00oOO.o;
import p505o0o00oOO.oO00000;
import p505o0o00oOO.ooo0Oo0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p563o0oOo00O.o0O0O00;
import p586o0oOooO0.oO0o0000;
import p605o0oo0O0O.o0O0O0Oo;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/store/WalletActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nWalletActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletActivity.kt\ncom/yalla/yalla/ui/activity/store/WalletActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,197:1\n22#2,2:198\n1855#3,2:200\n*S KotlinDebug\n*F\n+ 1 WalletActivity.kt\ncom/yalla/yalla/ui/activity/store/WalletActivity\n*L\n33#1:198,2\n172#1:200,2\n*E\n"})
public final class WalletActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f26588OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f26590OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final ArrayList f26591OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final Lazy f26593OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public double f26594OooOo0o;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @NotNull
    public String f26595OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    @NotNull
    public final Lazy f26596OooOoO0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26589OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(f2.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final List<String> f26592OooOo00 = CollectionsKt.mutableListOf(o0000.OooO0OO(o000000.coin), o0000.OooO0OO(o000000.crystal));

    public static final class OooO extends Lambda implements Function0<TransitionDrawable> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO f26597OooO0Oo = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TransitionDrawable invoke() {
            return new TransitionDrawable(new Drawable[]{o0000.OooO0O0(o0Oo0oo.icon_google_play_coins_header), o0000.OooO0O0(o0Oo0oo.icon_google_play_crystal_header)});
        }
    }

    public static final class OooO00o {
        @JvmOverloads
        public static void OooO00o(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) WalletActivity.class);
            if (z) {
                intent.putExtra("CoinType", true);
            }
            String strOooO0OO = com.code.android.util.OooO0O0.OooO0OO();
            LiveEventBus.get("RechargeFromUserInfo_OK").post(Boolean.TRUE);
            o0oo0000.OooO00o.OooO0OO("205001", MapsKt.mapOf(new Pair("url", strOooO0OO)));
            intent.putExtra("FromInfo", strOooO0OO);
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<oO0o0000> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oO0o0000 invoke() {
            WalletActivity walletActivity = WalletActivity.this;
            FragmentManager supportFragmentManager = walletActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
            return new oO0o0000(supportFragmentManager, walletActivity.f26591OooOo0);
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<RechargeMenuCreateOrderModel, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(RechargeMenuCreateOrderModel rechargeMenuCreateOrderModel) {
            RechargeMenuCreateOrderModel it = rechargeMenuCreateOrderModel;
            Intrinsics.checkNotNullParameter(it, "it");
            o0oo0000.OooO00o.OooO0OO("105006", MapsKt.mapOf(new Pair("url", WalletActivity.this.f26595OooOoO), new Pair("sku", it.getSku())));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26600OooO0Oo;

        public OooO0o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26600OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26600OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26600OooO0Oo;
        }

        public final int hashCode() {
            return this.f26600OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26600OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOO0 extends Lambda implements Function0<TransitionDrawable> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooOO0 f26601OooO0Oo = new OooOO0();

        public OooOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TransitionDrawable invoke() {
            return new TransitionDrawable(new Drawable[]{o0000.OooO0O0(o0Oo0oo.icon_recharge_coin1), o0000.OooO0O0(o0Oo0oo.icon_recharge_crystal1)});
        }
    }

    public WalletActivity() {
        ArrayList arrayList = new ArrayList();
        WalletCoinFragment walletCoinFragment = new WalletCoinFragment();
        walletCoinFragment.setSelectItemListener(new OooO0OO());
        arrayList.add(walletCoinFragment);
        arrayList.add(new WalletCrystalFragment());
        this.f26591OooOo0 = arrayList;
        this.f26593OooOo0O = LazyKt.lazy(new OooO0O0());
        this.f26590OooOo = LazyKt.lazy(OooO.f26597OooO0Oo);
        this.f26596OooOoO0 = LazyKt.lazy(OooOO0.f26601OooO0Oo);
        this.f26595OooOoO = "";
    }

    public final f2 OooOo() {
        return (f2) this.f26589OooOOoo.getValue();
    }

    public final void OooOoO0() {
        TextView textView = OooOo().f43852OooO0oO;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Object value = o0O00oO0.OooO0Oo().getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        textView.setText(o0O0O0Oo.OooO0Oo(sb.toString()));
        ((TransitionDrawable) this.f26590OooOo.getValue()).reverseTransition(300);
        ((TransitionDrawable) this.f26596OooOoO0.getValue()).reverseTransition(300);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.f26591OooOo0.iterator();
        while (it.hasNext()) {
            ((Fragment) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f43846OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        oOO00O.OooO0OO(window, 0);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.setBackgroundColor(0);
        }
        TextView textView = OooOo().f43852OooO0oO;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        Object value = o0O00oO0.OooO0O0().getValue();
        StringBuilder sb = new StringBuilder();
        sb.append(value);
        textView.setText(o0O0O0Oo.OooO0Oo(sb.toString()));
        o0O00oO0.OooO0O0().observe(this, new OooO0o(new ooo0Oo0(this)));
        o0O00oO0.OooO0Oo().observe(this, new OooO0o(new o(this)));
        FrameLayout flRechargeHeader = OooOo().f43847OooO0O0;
        Intrinsics.checkNotNullExpressionValue(flRechargeHeader, "flRechargeHeader");
        o0000O0O.OooO0O0(flRechargeHeader);
        ImageView headerBg = OooOo().f43848OooO0OO;
        Intrinsics.checkNotNullExpressionValue(headerBg, "headerBg");
        o0000O0O.OooO00o(headerBg);
        Intrinsics.checkNotNullParameter(this, "context");
        o0O0O00.OooO00o oooO00o = new o0O0O00.OooO00o(this);
        oooO00o.f56259OooO0OO = 16.0f;
        oooO00o.f56260OooO0Oo = 16.0f;
        oooO00o.OooO0O0(this.f26592OooOo00);
        int i = o0OOO0o.white_;
        oooO00o.f56262OooO0o0 = o0000.OooO00o(i);
        oooO00o.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_white_70);
        ViewPagerFixed viewPager = OooOo().f43853OooO0oo;
        Intrinsics.checkNotNullExpressionValue(viewPager, "viewPager");
        oooO00o.OooO0Oo(viewPager);
        oooO00o.f56256OooO = 5.0f;
        oooO00o.f56265OooOO0 = o0000.OooO00o(i);
        oooO00o.f56266OooOO0O = o0000O0.OooO00o(43);
        oooO00o.f56267OooOO0o = o0000O0.OooO00o(2);
        int i2 = 1;
        oooO00o.f56257OooO00o.setAdjustMode(true);
        YlTableLayout tabLayout = OooOo().f43850OooO0o;
        Intrinsics.checkNotNullExpressionValue(tabLayout, "tabLayout");
        oooO00o.OooO00o(tabLayout);
        OooOo().f43853OooO0oo.setAdapter((oO0o0000) this.f26593OooOo0O.getValue());
        OooOo().f43853OooO0oo.setOffscreenPageLimit(2);
        OooOo().f43853OooO0oo.OooO0O0(new oO00000(this));
        Lazy lazy = this.f26590OooOo;
        ((TransitionDrawable) lazy.getValue()).setCrossFadeEnabled(true);
        OooOo().f43848OooO0OO.setBackground((TransitionDrawable) lazy.getValue());
        OooOo().f43851OooO0o0.setImageDrawable((TransitionDrawable) this.f26596OooOoO0.getValue());
        OooOo().f43849OooO0Oo.setOnClickListener(new o0O0OOO0(this, i2));
        Intent intent = getIntent();
        this.f26595OooOoO = o0OoOo0.OooOOO(intent.getStringExtra("FromInfo"), "");
        if (intent.getBooleanExtra("CoinType", false)) {
            OooOo().f43853OooO0oo.setCurrentItem(1);
            this.f26594OooOo0o = 1.0d;
            OooOoO0();
        }
        LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY", Boolean.TYPE).observe(this, new o0oOo0O0(this, i2));
    }
}
