package com.yalla.yalla.ui.activity.store;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.TopCardPersentationModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.ArrayList;
import p505o0o00oOO.o0OO0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OO00O;
import p562o0oOo000.oo0o0Oo;

/* JADX INFO: loaded from: classes4.dex */
public class TopCardPresentationActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ArrayList f26566OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26567OooOOo0;

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oo0o0Oo.activity_topcard_presentation);
        ArrayList arrayList = new ArrayList();
        this.f26566OooOOo = arrayList;
        arrayList.add(new TopCardPersentationModel(o000000.Store_top_Card_Presentation_title1, o000000.Store_top_Card_Presentation_desc1));
        this.f26566OooOOo.add(new TopCardPersentationModel(o000000.Store_top_Card_Presentation_title2, o000000.Store_top_Card_Presentation_desc2));
        this.f26566OooOOo.add(new TopCardPersentationModel(o000000.Store_top_Card_Presentation_title3, o000000.Store_top_Card_Presentation_desc3));
        this.f26566OooOOo.add(new TopCardPersentationModel(o000000.Store_top_Card_Presentation_title4, o000000.Store_top_Card_Presentation_desc4));
        this.f26566OooOOo.add(new TopCardPersentationModel(o000000.Store_top_Card_Presentation_title5, o000000.Store_top_Card_Presentation_desc5));
        this.f22282OooOO0.setTitle(o000000.Store_Top_Card_Instructions_Title);
        this.f26567OooOOo0 = (RecyclerView) findViewById(o0OO00O.rv);
        ((XRefreshLayout) findViewById(o0OO00O.xrl)).f20857OooOooO = false;
        this.f26567OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        o0OO0 o0oo1 = new o0OO0(this, oo0o0Oo.item_topcard_persentation, this.f26566OooOOo);
        o0oo1.Oooo00o();
        this.f26567OooOOo0.setAdapter(o0oo1);
    }
}
