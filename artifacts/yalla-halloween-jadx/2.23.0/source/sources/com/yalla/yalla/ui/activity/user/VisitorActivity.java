package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.VisitorModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p403o0Oo0OOo.oOo00ooO;
import p464o0Oooo.o000000O;
import p496o0o00o.oO;
import p496o0o00o.oO0oO000;
import p496o0o00o.oOO00000;
import p496o0o00o.oOo00o00;
import p579o0oOoo.oOo00OO0;
import p581o0oOoo00.o000OOo;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public class VisitorActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f27387OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public XRefreshLayout f27388OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f27389OooOOo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public oO0oO000 f27391OooOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public String f27390OooOOoo = "";

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f27392OooOo00 = 1;

    public class OooO00o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f27394OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, boolean z) {
            super(context);
            this.f27394OooO0o0 = z;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(String str, String str2) {
            super.OooO0O0(str, str2);
            VisitorActivity visitorActivity = VisitorActivity.this;
            visitorActivity.f27388OooOOo.OooOoo(this.f27394OooO0o0);
            visitorActivity.f27391OooOo0.OooOoo();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            List<VisitorModel.Visitor> list;
            VisitorModel visitorModel = (VisitorModel) oOo00OO0.OooO00o(str, VisitorModel.class);
            boolean z = this.f27394OooO0o0;
            VisitorActivity visitorActivity = VisitorActivity.this;
            if (visitorModel == null || (list = visitorModel.data) == null) {
                visitorActivity.f27388OooOOo.OooOooo(z, true, true);
                visitorActivity.f27391OooOo0.Oooo00o();
                return;
            }
            visitorActivity.f27390OooOOoo = visitorModel.datesort;
            visitorActivity.f27392OooOo00 = visitorModel.index + 1;
            if (z) {
                visitorActivity.f27391OooOo0.OooOoO0(list);
                oOo00ooO ooo00oooOooOooo = o000OOo.OooO00o().OooOooo();
                o000000O o000000o2 = o000000O.f46674OooO00o;
                ooo00oooOooOooo.OooO(((Long) o000000O.OooOOo0().getValue()).longValue());
            } else {
                visitorActivity.f27391OooOo0.OooO0O0(list);
            }
            visitorActivity.f27391OooOo0.Oooo00o();
            if (visitorActivity.f27391OooOo0.f10111OooOOoo.size() < 100) {
                visitorActivity.f27388OooOOo.OooOooo(z, true, visitorModel.data.size() < Integer.parseInt("15"));
            } else {
                visitorActivity.f27388OooOOo.OooOooo(z, true, true);
                visitorActivity.f27388OooOOo.setNoMoreDataText(oO00OOo0.Visitor_quantitative_restrictions);
            }
        }
    }

    public final void OooOo0(boolean z) {
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        int i = this.f27392OooOo00;
        String datesort = this.f27390OooOOoo;
        OooO00o oooO00o = new OooO00o(this, z);
        Intrinsics.checkNotNullParameter(datesort, "datesort");
        LinkedHashMap params = oO00o000.OooO00o();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        params.put("pageindex", sb.toString());
        params.put("pagesize", "20");
        if (!TextUtils.isEmpty(datesort)) {
            params.put("datesort", datesort);
        }
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44187oo0o0Oo, params, oooO00o);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_vistor);
        OooOOoo(oO00OOo0.Visitors);
        this.f27389OooOOo0 = (RecyclerView) findViewById(oO00O0oO.rec_visitor);
        this.f27388OooOOo = (XRefreshLayout) findViewById(oO00O0oO.srl_visitor);
        this.f27389OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        oO0oO000 oo0oo000 = new oO0oO000(this, this, oO00OO0O.item_visitor);
        this.f27391OooOo0 = oo0oo000;
        oo0oo000.OooOooo(p584o0oOooO0.oOo00OO0.ic_empty_follow);
        this.f27391OooOo0.Oooo000(oO00OOo0.blank_no_visitor);
        this.f27391OooOo0.Oooo0OO(new oOo00o00(this));
        this.f27388OooOOo.setOnRefreshListener(new oO(this));
        this.f27388OooOOo.setOnLoadMoreListener(new oOO00000(this));
        this.f27389OooOOo0.setAdapter(this.f27391OooOo0);
        OooOo0(true);
    }
}
