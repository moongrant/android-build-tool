package com.yalla.yalla.ui.activity.store;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.TopCardPersentationModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import p564o0oOo00.o000000O;

/* JADX INFO: loaded from: classes3.dex */
public class TopCardPresentationActivity extends BaseActivity {

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f23247OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public List<TopCardPersentationModel> f23248OoooOoO;

    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList, java.util.List<com.app.base.model.TopCardPersentationModel>] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList, java.util.List<com.app.base.model.TopCardPersentationModel>] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.ArrayList, java.util.List<com.app.base.model.TopCardPersentationModel>] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.ArrayList, java.util.List<com.app.base.model.TopCardPersentationModel>] */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_topcard_presentation);
        ArrayList arrayList = new ArrayList();
        this.f23248OoooOoO = arrayList;
        arrayList.add(new TopCardPersentationModel(R.string.Store_top_Card_Presentation_title1, R.string.Store_top_Card_Presentation_desc1));
        this.f23248OoooOoO.add(new TopCardPersentationModel(R.string.Store_top_Card_Presentation_title2, R.string.Store_top_Card_Presentation_desc2));
        this.f23248OoooOoO.add(new TopCardPersentationModel(R.string.Store_top_Card_Presentation_title3, R.string.Store_top_Card_Presentation_desc3));
        this.f23248OoooOoO.add(new TopCardPersentationModel(R.string.Store_top_Card_Presentation_title4, R.string.Store_top_Card_Presentation_desc4));
        this.f23248OoooOoO.add(new TopCardPersentationModel(R.string.Store_top_Card_Presentation_title5, R.string.Store_top_Card_Presentation_desc5));
        this.f11463OoooO.setTitle(R.string.Store_Top_Card_Instructions_Title);
        this.f23247OoooOo0 = (RecyclerView) findViewById(R.id.rv);
        ((XRefreshLayout) findViewById(R.id.xrl)).f19541o00O0O = false;
        this.f23247OoooOo0.setLayoutManager(new FixLinearLayoutManager(this));
        o000000O o000000o2 = new o000000O(this, this.f23248OoooOoO);
        o000000o2.setLoadComplete();
        this.f23247OoooOo0.setAdapter(o000000o2);
    }
}
