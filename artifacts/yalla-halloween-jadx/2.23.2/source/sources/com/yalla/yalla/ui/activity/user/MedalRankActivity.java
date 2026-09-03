package com.yalla.yalla.ui.activity.user;

import android.R;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.ui.adapter.MedalRankAdapter;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import p506o0o00oOo.oO000Oo;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class MedalRankActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f26646OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public SwipeRefreshLayout f26647OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26648OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public MedalRankAdapter f26649OooOOoo;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public final OooO00o f26651OooOo00 = new OooO00o();

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public final OooO0O0 f26650OooOo0 = new OooO0O0();

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
        setContentView(oo0o0Oo.activity_medal_rank);
        this.f22282OooOO0.setTitle(getResources().getString(o000000.medalrank));
        this.f26648OooOOo0 = (RecyclerView) findViewById(o0OO00O.rec_medalrank);
        this.f26647OooOOo = (SwipeRefreshLayout) findViewById(o0OO00O.srl_medalrank);
        this.f26648OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f26648OooOOo0.addItemDecoration(new p560o0oOo0.Oooo000(this, 1));
        this.f26649OooOOoo = new MedalRankAdapter();
        int intExtra = getIntent().getIntExtra("MyMedalStars", 0);
        MedalRankAdapter medalRankAdapter = this.f26649OooOOoo;
        medalRankAdapter.f26939OooO0OO = intExtra;
        medalRankAdapter.f26940OooO0Oo = this.f26650OooOo0;
        this.f26648OooOOo0.setAdapter(medalRankAdapter);
        this.f26647OooOOo.setOnRefreshListener(this.f26651OooOo00);
        this.f26647OooOOo.setColorSchemeResources(R.color.holo_blue_bright, R.color.holo_green_light, R.color.holo_orange_light, R.color.holo_red_light);
        SwipeRefreshLayout swipeRefreshLayout = this.f26647OooOOo;
        if (!swipeRefreshLayout.f11140OooO0o) {
            swipeRefreshLayout.setRefreshing(true);
        }
        oO000Oo oo000oo = new oO000Oo(this, this);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43385Ooooo0o, p426o0OoO0o0.OooOOOO.OooO00o(), oo000oo);
    }
}
