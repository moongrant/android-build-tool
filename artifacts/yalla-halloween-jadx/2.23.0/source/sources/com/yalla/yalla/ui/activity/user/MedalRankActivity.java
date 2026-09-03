package com.yalla.yalla.ui.activity.user;

import android.R;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.ui.adapter.MedalRankAdapter;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import p377o0OOoOo.o0000O;
import p496o0o00o.o00O000;
import p555o0oOOooO.o0OOo000;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public class MedalRankActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f27113OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public SwipeRefreshLayout f27114OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f27115OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public MedalRankAdapter f27116OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final OooO00o f27118OooOo00 = new OooO00o();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final OooO0O0 f27117OooOo0 = new OooO0O0();

    public class OooO00o implements SwipeRefreshLayout.OooOO0 {
        public OooO00o() {
        }
    }

    public class OooO0O0 implements MedalRankAdapter.OooO0O0 {
        public OooO0O0() {
        }
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_medal_rank);
        this.f22755OooOO0.setTitle(getResources().getString(oO00OOo0.medalrank));
        this.f27115OooOOo0 = (RecyclerView) findViewById(oO00O0oO.rec_medalrank);
        this.f27114OooOOo = (SwipeRefreshLayout) findViewById(oO00O0oO.srl_medalrank);
        this.f27115OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f27115OooOOo0.addItemDecoration(new o0OOo000(this, 1));
        this.f27116OooOOoo = new MedalRankAdapter();
        int intExtra = getIntent().getIntExtra("MyMedalStars", 0);
        MedalRankAdapter medalRankAdapter = this.f27116OooOOoo;
        medalRankAdapter.f27404OooO0OO = intExtra;
        medalRankAdapter.f27405OooO0Oo = this.f27117OooOo0;
        this.f27115OooOOo0.setAdapter(medalRankAdapter);
        this.f27114OooOOo.setOnRefreshListener(this.f27118OooOo00);
        this.f27114OooOOo.setColorSchemeResources(R.color.holo_blue_bright, R.color.holo_green_light, R.color.holo_orange_light, R.color.holo_red_light);
        SwipeRefreshLayout swipeRefreshLayout = this.f27114OooOOo;
        if (!swipeRefreshLayout.f8046OooO0o) {
            swipeRefreshLayout.setRefreshing(true);
        }
        o00O000 o00o001 = new o00O000(this, this);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44126Ooooo0o, oO00o000.OooO00o(), o00o001);
    }
}
