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
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.oo0o0Oo;
import p563o0oOo00O.o0O0O00;
import p587o0oOooOO.u0;

/* JADX INFO: loaded from: classes4.dex */
public class CoinCrystalDetailActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public static final /* synthetic */ int f26517OooOOo = 0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public int f26518OooOOo0 = 0;

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oo0o0Oo.activity_detail);
        this.f26518OooOOo0 = getIntent().getIntExtra("type", 1);
        OooOo00(o0000.OooO0OO(o000000.bill));
        RtlViewPager rtlViewPager = (RtlViewPager) findViewById(o0OO00O.detail_view_pager);
        YlTableLayout ylTableLayout = (YlTableLayout) findViewById(o0OO00O.detail_Indicator);
        CoinDetailFragment coinDetailFragment = new CoinDetailFragment();
        CrystalDetailFragment crystalDetailFragment = new CrystalDetailFragment();
        u0 u0Var = new u0(getSupportFragmentManager());
        u0Var.OooOOoo(coinDetailFragment, o0000.OooO0OO(o000000.Golds));
        u0Var.OooOOoo(crystalDetailFragment, o0000.OooO0OO(o000000.crystal));
        Intrinsics.checkNotNullParameter(this, "context");
        o0O0O00.OooO00o oooO00o = new o0O0O00.OooO00o(this);
        oooO00o.f56259OooO0OO = 16.0f;
        oooO00o.f56260OooO0Oo = 16.0f;
        oooO00o.OooO0O0(u0Var.f56991OooO);
        int i = o0OOO0o.white_;
        oooO00o.f56262OooO0o0 = o0000.OooO00o(i);
        oooO00o.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_white_70);
        oooO00o.OooO0Oo(rtlViewPager);
        oooO00o.f56256OooO = 5.0f;
        oooO00o.f56265OooOO0 = o0000.OooO00o(i);
        oooO00o.f56266OooOO0O = o0000O0.OooO00o(40);
        oooO00o.f56267OooOO0o = o0000O0.OooO00o(2);
        oooO00o.f56257OooO00o.setAdjustMode(true);
        oooO00o.OooO00o(ylTableLayout);
        rtlViewPager.setAdapter(u0Var);
        rtlViewPager.setOffscreenPageLimit(2);
        if (this.f26518OooOOo0 == 2) {
            rtlViewPager.setCurrentItem(1);
        }
    }
}
