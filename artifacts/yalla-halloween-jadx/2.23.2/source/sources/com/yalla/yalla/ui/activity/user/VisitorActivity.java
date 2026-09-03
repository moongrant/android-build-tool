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
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p407o0Oo0Oo.o0O;
import p475o0Ooooo0.o0O00oO0;
import p506o0o00oOo.h1;
import p506o0o00oOo.i1;
import p506o0o00oOo.j1;
import p506o0o00oOo.k1;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public class VisitorActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f26922OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public XRefreshLayout f26923OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f26924OooOOo0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public h1 f26926OooOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public String f26925OooOOoo = "";

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public int f26927OooOo00 = 1;

    public class OooO00o extends com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f26929OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, boolean z) {
            super(context);
            this.f26929OooO0o0 = z;
        }

        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0O0(String str, String str2) {
            super.OooO0O0(str, str2);
            VisitorActivity visitorActivity = VisitorActivity.this;
            visitorActivity.f26923OooOOo.OooOoo(this.f26929OooO0o0);
            visitorActivity.f26926OooOo0.OooOoo();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
        public final void OooO0o0(String str) {
            List<VisitorModel.Visitor> list;
            VisitorModel visitorModel = (VisitorModel) oOOO00.OooO00o(str, VisitorModel.class);
            boolean z = this.f26929OooO0o0;
            VisitorActivity visitorActivity = VisitorActivity.this;
            if (visitorModel == null || (list = visitorModel.data) == null) {
                visitorActivity.f26923OooOOo.OooOooo(z, true, true);
                visitorActivity.f26926OooOo0.Oooo00o();
                return;
            }
            visitorActivity.f26925OooOOoo = visitorModel.datesort;
            visitorActivity.f26927OooOo00 = visitorModel.index + 1;
            if (z) {
                visitorActivity.f26926OooOo0.OooOoO0(list);
                o0O o0oOooo000 = p408o0Oo0Oo0.o00Oo0.OooO00o().Oooo000();
                o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
                o0oOooo000.OooO(((Long) o0O00oO0.OooOOo0().getValue()).longValue());
            } else {
                visitorActivity.f26926OooOo0.OooO0O0(list);
            }
            visitorActivity.f26926OooOo0.Oooo00o();
            if (visitorActivity.f26926OooOo0.f13189OooOOoo.size() < 100) {
                visitorActivity.f26923OooOOo.OooOooo(z, true, visitorModel.data.size() < Integer.parseInt("15"));
            } else {
                visitorActivity.f26923OooOOo.OooOooo(z, true, true);
                visitorActivity.f26923OooOOo.setNoMoreDataText(o000000.Visitor_quantitative_restrictions);
            }
        }
    }

    public final void OooOo0(boolean z) {
        o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
        int i = this.f26927OooOo00;
        String datesort = this.f26925OooOOoo;
        OooO00o oooO00o = new OooO00o(this, z);
        Intrinsics.checkNotNullParameter(datesort, "datesort");
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        Intrinsics.checkNotNull(linkedHashMapOooO00o);
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        linkedHashMapOooO00o.put("pageindex", sb.toString());
        linkedHashMapOooO00o.put("pagesize", "20");
        if (!TextUtils.isEmpty(datesort)) {
            linkedHashMapOooO00o.put("datesort", datesort);
        }
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43446oo0o0Oo, linkedHashMapOooO00o, oooO00o);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oo0o0Oo.activity_vistor);
        OooOOoo(o000000.Visitors);
        this.f26924OooOOo0 = (RecyclerView) findViewById(p562o0oOo000.o0OO00O.rec_visitor);
        this.f26923OooOOo = (XRefreshLayout) findViewById(p562o0oOo000.o0OO00O.srl_visitor);
        this.f26924OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        h1 h1Var = new h1(this, this, oo0o0Oo.item_visitor);
        this.f26926OooOo0 = h1Var;
        h1Var.OooOooo(o0Oo0oo.ic_empty_follow);
        this.f26926OooOo0.Oooo000(o000000.blank_no_visitor);
        this.f26926OooOo0.Oooo0OO(new i1(this));
        this.f26923OooOOo.setOnRefreshListener(new j1(this));
        this.f26923OooOOo.setOnLoadMoreListener(new k1(this));
        this.f26924OooOOo0.setAdapter(this.f26926OooOo0);
        OooOo0(true);
    }
}
