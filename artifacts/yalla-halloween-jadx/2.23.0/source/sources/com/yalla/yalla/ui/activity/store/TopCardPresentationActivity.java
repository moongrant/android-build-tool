package com.yalla.yalla.ui.activity.store;

import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.TopCardPersentationModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.ArrayList;
import p499o0o00o0O.o00O0O0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;

/* JADX INFO: loaded from: classes4.dex */
public class TopCardPresentationActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public ArrayList f27031OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f27032OooOOo0;

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_topcard_presentation);
        ArrayList arrayList = new ArrayList();
        this.f27031OooOOo = arrayList;
        arrayList.add(new TopCardPersentationModel(oO00OOo0.Store_top_Card_Presentation_title1, oO00OOo0.Store_top_Card_Presentation_desc1));
        this.f27031OooOOo.add(new TopCardPersentationModel(oO00OOo0.Store_top_Card_Presentation_title2, oO00OOo0.Store_top_Card_Presentation_desc2));
        this.f27031OooOOo.add(new TopCardPersentationModel(oO00OOo0.Store_top_Card_Presentation_title3, oO00OOo0.Store_top_Card_Presentation_desc3));
        this.f27031OooOOo.add(new TopCardPersentationModel(oO00OOo0.Store_top_Card_Presentation_title4, oO00OOo0.Store_top_Card_Presentation_desc4));
        this.f27031OooOOo.add(new TopCardPersentationModel(oO00OOo0.Store_top_Card_Presentation_title5, oO00OOo0.Store_top_Card_Presentation_desc5));
        this.f22755OooOO0.setTitle(oO00OOo0.Store_Top_Card_Instructions_Title);
        this.f27032OooOOo0 = (RecyclerView) findViewById(oO00O0oO.rv);
        ((XRefreshLayout) findViewById(oO00O0oO.xrl)).f21330OooOooO = false;
        this.f27032OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        o00O0O0 o00o0o0 = new o00O0O0(this, oO00OO0O.item_topcard_persentation, this.f27031OooOOo);
        o00o0o0.Oooo00o();
        this.f27032OooOOo0.setAdapter(o00o0o0);
    }
}
