package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.MedalRankModel;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Map;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p603o0oo00o0.o00000OO;

/* JADX INFO: loaded from: classes3.dex */
public class MedalRankActivity extends BaseActivity {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f23334OooooO0 = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f23335OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public SwipeRefreshLayout f23336OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public p133o00OO00o.OooOO0O f23337OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public OooO00o f23338Ooooo00 = new OooO00o();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public OooO0O0 f23339Ooooo0o = new OooO0O0();

    public class OooO00o implements SwipeRefreshLayout.OooOOO0 {
        public OooO00o() {
        }
    }

    public class OooO0O0 implements o00OO00o.OooOO0O.OooO0O0 {
        public OooO0O0() {
        }
    }

    public class OooO0OO extends o00OO0O0.OooO0O0 {
        public OooO0OO(Context context) {
            super(context);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            MedalRankActivity.this.f23336OoooOoO.setRefreshing(false);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            MedalRankActivity.this.f23336OoooOoO.setRefreshing(false);
            MedalRankModel medalRankModel = (MedalRankModel) o0Oo0oo.OooO0O0(str, MedalRankModel.class);
            if ("1000".equals(medalRankModel.f11871code)) {
                p133o00OO00o.OooOO0O oooOO0O = MedalRankActivity.this.f23337OoooOoo;
                oooOO0O.f31190OooO0O0 = medalRankModel;
                oooOO0O.notifyDataSetChanged();
            }
        }
    }

    public final void OooOoO() {
        SwipeRefreshLayout swipeRefreshLayout = this.f23336OoooOoO;
        if (!swipeRefreshLayout.f9392Oooo0oo) {
            swipeRefreshLayout.setRefreshing(true);
        }
        OooO0OO oooO0OO = new OooO0OO(this);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32270Ooooo0o, mapOooO0O0, oooO0OO);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_medal_rank);
        this.f11463OoooO.setTitle(getResources().getString(R.string.medalrank));
        this.f23335OoooOo0 = (RecyclerView) findViewById(R.id.rec_medalrank);
        this.f23336OoooOoO = (SwipeRefreshLayout) findViewById(R.id.srl_medalrank);
        this.f23335OoooOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f23335OoooOo0.addItemDecoration(new o00000OO(this, 1));
        this.f23337OoooOoo = new p133o00OO00o.OooOO0O();
        int intExtra = getIntent().getIntExtra("MyMedalStars", 0);
        p133o00OO00o.OooOO0O oooOO0O = this.f23337OoooOoo;
        oooOO0O.f31191OooO0OO = intExtra;
        oooOO0O.f31192OooO0Oo = this.f23339Ooooo0o;
        this.f23335OoooOo0.setAdapter(oooOO0O);
        this.f23336OoooOoO.setOnRefreshListener(this.f23338Ooooo00);
        this.f23336OoooOoO.setColorSchemeResources(android.R.color.holo_blue_bright, android.R.color.holo_green_light, android.R.color.holo_orange_light, android.R.color.holo_red_light);
        OooOoO();
    }
}
