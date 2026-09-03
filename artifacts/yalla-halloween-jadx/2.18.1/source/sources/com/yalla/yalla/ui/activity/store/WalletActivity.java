package com.yalla.yalla.ui.activity.store;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.app.base.view.HeaderLayout;
import com.app.base.view.ViewPagerFixed;
import com.app.base.view.indicator.YlTableLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOo00;
import com.yalla.yalla.common.model.RechargeMenuCreateOrderModel;
import com.yalla.yalla.common.model.ShopVehicleListModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.WalletCoinFragment;
import com.yalla.yalla.ui.fragment.WalletCrystalFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00O0O0;
import p143o00OOooo.o00O0O0O;
import p143o00OOooo.o00oOoo;
import p168o00Ooo0.o0O0O00;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o000OOo0;
import p254o00ooO0O.o00O000o;
import p462o0Ooo0o.o0000O00;
import p478o0OooooO.oO0OoOO0;
import p498o0o00Oo0.OooOOO;
import p522o0o0O0o.o00O0;
import p564o0oOo00.o000O00;
import p564o0oOo00.o000O00O;
import p606o0oo0O.OooOo;
import p649o0ooOOoo.ai;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/store/WalletActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class WalletActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23268OoooooO = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23269OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ai.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final List<String> f23270Ooooo00 = CollectionsKt.mutableListOf(o000O0O0.OooO0OO(R.string.coin), o000O0O0.OooO0OO(R.string.crystal));

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final List<Fragment> f23271Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final Lazy f23272OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public double f23273OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public final Lazy f23274OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public String f23275Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public final Lazy f23276Oooooo0;

    public static final class OooO extends Lambda implements Function0<TransitionDrawable> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO f23277Oooo0o = new OooO();

        public OooO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TransitionDrawable invoke() {
            return new TransitionDrawable(new Drawable[]{o000O0O0.OooO0O0(R.drawable.icon_recharge_coin1), o000O0O0.OooO0O0(R.drawable.icon_recharge_crystal1)});
        }
    }

    public static final class OooO00o {
        @JvmOverloads
        public final void OooO00o(@NotNull Context context, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intent intent = new Intent(context, (Class<?>) WalletActivity.class);
            if (z) {
                intent.putExtra("CoinType", true);
            }
            String simpleName = context.getClass().getSimpleName();
            OooOo.OooO0OO("205001", MapsKt.mapOf(new Pair("url", simpleName)));
            intent.putExtra("FromInfo", simpleName);
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o0000O00> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000O00 invoke() {
            FragmentManager supportFragmentManager = WalletActivity.this.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            return new o0000O00(supportFragmentManager, WalletActivity.this.f23271Ooooo0o);
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
            OooOo.OooO0OO("105006", MapsKt.mapOf(new Pair("url", WalletActivity.this.f23275Oooooo), new Pair("sku", it.getSku())));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<TransitionDrawable> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0o f23280Oooo0o = new OooO0o();

        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final TransitionDrawable invoke() {
            return new TransitionDrawable(new Drawable[]{o000O0O0.OooO0O0(R.drawable.icon_google_play_coins_header), o000O0O0.OooO0O0(R.drawable.icon_google_play_crystal_header)});
        }
    }

    public WalletActivity() {
        ArrayList arrayList = new ArrayList();
        WalletCoinFragment walletCoinFragment = new WalletCoinFragment();
        walletCoinFragment.setSelectItemListener(new OooO0OO());
        arrayList.add(walletCoinFragment);
        arrayList.add(new WalletCrystalFragment());
        this.f23271Ooooo0o = arrayList;
        this.f23272OooooO0 = LazyKt.lazy(new OooO0O0());
        this.f23274OooooOo = LazyKt.lazy(OooO0o.f23280Oooo0o);
        this.f23276Oooooo0 = LazyKt.lazy(OooO.f23277Oooo0o);
        this.f23275Oooooo = "";
    }

    public final ai OooOoo() {
        return (ai) this.f23269OoooOoo.getValue();
    }

    public final TransitionDrawable OooOooO() {
        return (TransitionDrawable) this.f23274OooooOo.getValue();
    }

    public final TransitionDrawable OooOooo() {
        return (TransitionDrawable) this.f23276Oooooo0.getValue();
    }

    public final void Oooo000() {
        OooOoo().f48971OooO0oO.setText(o0O0O00.OooO0Oo(OooOOO.f41216OooO00o.OooO0o().getValue() + ""));
        OooOooO().reverseTransition(ShopVehicleListModel.VehicleTagType_Vip300);
        OooOooo().reverseTransition(ShopVehicleListModel.VehicleTagType_Vip300);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.fragment.app.Fragment>] */
    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        Iterator it = this.f23271Ooooo0o.iterator();
        while (it.hasNext()) {
            ((Fragment) it.next()).onActivityResult(i, i2, intent);
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f48965OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        int i = 0;
        oO0OoOO0.OooO0Oo(window, 0);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setBackgroundColor(0);
        }
        TextView textView = OooOoo().f48971OooO0oO;
        StringBuilder sb = new StringBuilder();
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        sb.append(oooOOO.OooO0OO().getValue());
        sb.append("");
        textView.setText(o0O0O00.OooO0Oo(sb.toString()));
        int i2 = 3;
        oooOOO.OooO0OO().observe(this, new o00oOoo(this, i2));
        oooOOO.OooO0o().observe(this, new o00O0O0O(this, 6));
        FrameLayout frameLayout = OooOoo().f48966OooO0O0;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "binding.flRechargeHeader");
        o000OOo0.OooO00o(frameLayout);
        ImageView addHeightView = OooOoo().f48967OooO0OO;
        Intrinsics.checkNotNullExpressionValue(addHeightView, "binding.headerBg");
        Intrinsics.checkNotNullParameter(addHeightView, "addHeightView");
        ViewGroup.LayoutParams layoutParams = addHeightView.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.height = o000OOo0.OooO0OO() + marginLayoutParams.height;
        addHeightView.requestLayout();
        Intrinsics.checkNotNullParameter(this, "context");
        o00o000O.OooO0O0.OooO00o oooO00o = new o00o000O.OooO0O0.OooO00o(this);
        oooO00o.f32980OooO0Oo = 16.0f;
        oooO00o.f32982OooO0o0 = 16.0f;
        oooO00o.OooO0O0(this.f23270Ooooo00);
        oooO00o.f32981OooO0o = o000O0O0.OooO00o(R.color.white_);
        oooO00o.f32983OooO0oO = o000O0O0.OooO00o(R.color.color_white_70);
        ViewPagerFixed viewPagerFixed = OooOoo().f48972OooO0oo;
        Intrinsics.checkNotNullExpressionValue(viewPagerFixed, "binding.viewPager");
        oooO00o.OooO0OO(viewPagerFixed);
        oooO00o.f32984OooO0oo = 5.0f;
        oooO00o.f32976OooO = o000O0O0.OooO00o(R.color.white_);
        oooO00o.f32985OooOO0 = OooOo00.OooO00o(43.0f);
        oooO00o.f32986OooOO0O = OooOo00.OooO00o(2.0f);
        oooO00o.f32978OooO0O0.setAdjustMode(true);
        YlTableLayout ylTableLayout = OooOoo().f48969OooO0o;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tabLayout");
        oooO00o.OooO00o(ylTableLayout);
        OooOoo().f48972OooO0oo.setAdapter((o0000O00) this.f23272OooooO0.getValue());
        OooOoo().f48972OooO0oo.setOffscreenPageLimit(2);
        OooOoo().f48972OooO0oo.OooO0O0(new o000O00O(this));
        OooOooO().setCrossFadeEnabled(true);
        OooOoo().f48967OooO0OO.setBackground(OooOooO());
        OooOoo().f48970OooO0o0.setImageDrawable(OooOooo());
        OooOoo().f48968OooO0Oo.setOnClickListener(new o000O00(this, i));
        Intent intent = getIntent();
        this.f23275Oooooo = o00O0.OooO0oO(intent.getStringExtra("FromInfo"));
        if (intent.getBooleanExtra("CoinType", false)) {
            OooOoo().f48972OooO0oo.setCurrentItem(1);
            this.f23273OooooOO = 1.0d;
            Oooo000();
        }
        LiveEventBus.get("EVENTMSG_DESTORY_WALLET_ACTIVITY", Boolean.TYPE).observe(this, new o00O0O0(this, i2));
    }
}
