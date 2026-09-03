package com.yalla.yalla.ui.activity.store;

import android.os.Bundle;
import androidx.viewpager.widget.ViewPager;
import com.app.base.base.activity.BaseActivity;
import com.app.base.fragment.CoinDetailFragment;
import com.app.base.fragment.CrystalDetailFragment;
import com.app.base.view.indicator.YlTableLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.OooOOO;
import com.yalla.support.common.util.OooOo00;
import kotlin.jvm.internal.Intrinsics;
import p175o00OooOo.o0OOooO0;
import p254o00ooO0O.o000O0O0;

/* JADX INFO: loaded from: classes3.dex */
public class CoinCrystalDetailActivity extends BaseActivity {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f23208OoooOo0 = 0;

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_detail);
        this.f23208OoooOo0 = getIntent().getIntExtra("type", 1);
        OooOoO0(o000O0O0.OooO0OO(R.string.bill));
        ViewPager viewPager = (RtlViewPager) findViewById(R.id.detail_view_pager);
        YlTableLayout ylTableLayout = (YlTableLayout) findViewById(R.id.detail_Indicator);
        CoinDetailFragment coinDetailFragment = new CoinDetailFragment();
        CrystalDetailFragment crystalDetailFragment = new CrystalDetailFragment();
        o0OOooO0 o0ooooo1 = new o0OOooO0(getSupportFragmentManager());
        o0ooooo1.OooOOoo(coinDetailFragment, o000O0O0.OooO0OO(R.string.Golds));
        o0ooooo1.OooOOoo(crystalDetailFragment, o000O0O0.OooO0OO(R.string.crystal));
        Intrinsics.checkNotNullParameter(this, "context");
        o00o000O.OooO0O0.OooO00o oooO00o = new o00o000O.OooO0O0.OooO00o(this);
        oooO00o.f32980OooO0Oo = 16.0f;
        oooO00o.f32982OooO0o0 = 16.0f;
        oooO00o.OooO0O0(o0ooooo1.f32754OooO);
        oooO00o.f32981OooO0o = OooOOO.OooO00o(R.color.white_);
        oooO00o.f32983OooO0oO = OooOOO.OooO00o(R.color.color_white_70);
        oooO00o.OooO0OO(viewPager);
        oooO00o.f32984OooO0oo = 5.0f;
        oooO00o.f32976OooO = OooOOO.OooO00o(R.color.white_);
        oooO00o.f32985OooOO0 = OooOo00.OooO00o(40.0f);
        oooO00o.f32986OooOO0O = OooOo00.OooO00o(2.0f);
        oooO00o.f32978OooO0O0.setAdjustMode(true);
        oooO00o.OooO00o(ylTableLayout);
        viewPager.setAdapter(o0ooooo1);
        viewPager.setOffscreenPageLimit(2);
        if (this.f23208OoooOo0 == 2) {
            viewPager.setCurrentItem(1);
        }
    }
}
