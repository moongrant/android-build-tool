package com.yalla.yalla.ui.activity.store;

import android.os.Bundle;
import com.booking.rtlviewpager.RtlViewPager;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.ui.fragment.CoinDetailFragment;
import com.yalla.yalla.ui.fragment.CrystalDetailFragment;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import kotlin.jvm.internal.Intrinsics;
import p539o0o0OoOO.x1;
import p553o0oOOoo.o0oO0O0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public class CoinCrystalDetailActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final /* synthetic */ int f26982OooOOo = 0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f26983OooOOo0 = 0;

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_detail);
        this.f26983OooOOo0 = getIntent().getIntExtra("type", 1);
        OooOo00(o0000.OooO0OO(oO00OOo0.bill));
        RtlViewPager rtlViewPager = (RtlViewPager) findViewById(oO00O0oO.detail_view_pager);
        YlTableLayout ylTableLayout = (YlTableLayout) findViewById(oO00O0oO.detail_Indicator);
        CoinDetailFragment coinDetailFragment = new CoinDetailFragment();
        CrystalDetailFragment crystalDetailFragment = new CrystalDetailFragment();
        x1 x1Var = new x1(getSupportFragmentManager());
        x1Var.OooOOoo(coinDetailFragment, o0000.OooO0OO(oO00OOo0.Golds));
        x1Var.OooOOoo(crystalDetailFragment, o0000.OooO0OO(oO00OOo0.crystal));
        Intrinsics.checkNotNullParameter(this, "context");
        o0oO0O0o.OooO00o oooO00o = new o0oO0O0o.OooO00o(this);
        oooO00o.f56019OooO0OO = 16.0f;
        oooO00o.f56020OooO0Oo = 16.0f;
        oooO00o.OooO0O0(x1Var.f55744OooO);
        int i = oO00O0o.white_;
        oooO00o.f56022OooO0o0 = o0000.OooO00o(i);
        oooO00o.f56024OooO0oo = o0000.OooO00o(oO00O0o.color_white_70);
        oooO00o.OooO0Oo(rtlViewPager);
        oooO00o.f56016OooO = 5.0f;
        oooO00o.f56025OooOO0 = o0000.OooO00o(i);
        oooO00o.f56026OooOO0O = o0000O0.OooO00o(40);
        oooO00o.f56027OooOO0o = o0000O0.OooO00o(2);
        oooO00o.f56017OooO00o.setAdjustMode(true);
        oooO00o.OooO00o(ylTableLayout);
        rtlViewPager.setAdapter(x1Var);
        rtlViewPager.setOffscreenPageLimit(2);
        if (this.f26983OooOOo0 == 2) {
            rtlViewPager.setCurrentItem(1);
        }
    }
}
