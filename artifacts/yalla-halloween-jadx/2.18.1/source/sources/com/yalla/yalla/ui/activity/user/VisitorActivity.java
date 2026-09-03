package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.VisitorModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import java.util.Map;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p153o00Oo0oO.oo000o;
import p160o00OoOO0.o00OO0O0;
import p566o0oOo00O.oO000o00;
import p566o0oOo00O.oO00O0o;
import p566o0oOo00O.oO00O0o0;
import p566o0oOo00O.oO0O0OoO;

/* JADX INFO: loaded from: classes3.dex */
public class VisitorActivity extends BaseActivity {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f23629OooooO0 = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f23630OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public XRefreshLayout f23631OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public String f23632OoooOoo = "";

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f23633Ooooo00 = 1;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<VisitorModel.Visitor> f23634Ooooo0o;

    public class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ boolean f23635OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, boolean z) {
            super(context);
            this.f23635OooO00o = z;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            VisitorActivity.this.f23631OoooOoO.Oooo0O0(this.f23635OooO00o);
            VisitorActivity.this.f23634Ooooo0o.loadError();
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            List<VisitorModel.Visitor> list;
            super.onFinish(str);
            VisitorModel visitorModel = (VisitorModel) o0Oo0oo.OooO0O0(str, VisitorModel.class);
            if (visitorModel == null || (list = visitorModel.data) == null) {
                VisitorActivity.this.f23631OoooOoO.Oooo0o0(this.f23635OooO00o, true, true);
                VisitorActivity.this.f23634Ooooo0o.setLoadComplete();
                return;
            }
            VisitorActivity visitorActivity = VisitorActivity.this;
            visitorActivity.f23632OoooOoo = visitorModel.datesort;
            visitorActivity.f23633Ooooo00 = visitorModel.index + 1;
            if (this.f23635OooO00o) {
                visitorActivity.f23634Ooooo0o.setNewData(list);
                p491o0o00O00.OooO0OO.OooO00o().Oooo00O().OooO0Oo(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue().longValue());
            } else {
                visitorActivity.f23634Ooooo0o.addData(list);
            }
            VisitorActivity.this.f23634Ooooo0o.setLoadComplete();
            if (VisitorActivity.this.f23634Ooooo0o.getData().size() < 100) {
                VisitorActivity.this.f23631OoooOoO.Oooo0o0(this.f23635OooO00o, true, visitorModel.data.size() < Integer.parseInt("15"));
            } else {
                VisitorActivity.this.f23631OoooOoO.Oooo0o0(this.f23635OooO00o, true, true);
                VisitorActivity.this.f23631OoooOoO.setNoMoreDataText(R.string.Visitor_quantitative_restrictions);
            }
        }
    }

    public final void OooOoO(boolean z) {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo000o oo000oVar = o00000OO.f32208OooO0O0;
        int i = this.f23633Ooooo00;
        String str = this.f23632OoooOoo;
        OooO00o oooO00o = new OooO00o(this, z);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("pageindex", i + "");
        mapOooO0O0.put("pagesize", "20");
        if (!TextUtils.isEmpty(str)) {
            mapOooO0O0.put("datesort", str);
        }
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32282o000000O, mapOooO0O0, oooO00o);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_vistor);
        OooOo(R.string.Visitors);
        this.f23630OoooOo0 = (RecyclerView) findViewById(R.id.rec_visitor);
        this.f23631OoooOoO = (XRefreshLayout) findViewById(R.id.srl_visitor);
        this.f23630OoooOo0.setLayoutManager(new FixLinearLayoutManager(this));
        oO000o00 oo000o00 = new oO000o00(this, this);
        this.f23634Ooooo0o = oo000o00;
        oo000o00.setEmptyImageRes(R.drawable.ic_empty_follow);
        this.f23634Ooooo0o.setEmptyText(R.string.blank_no_visitor);
        this.f23634Ooooo0o.setLoadErrorClickListener(new oO0O0OoO(this));
        this.f23631OoooOoO.setOnRefreshListener(new oO00O0o0(this));
        this.f23631OoooOoO.setOnLoadMoreListener(new oO00O0o(this));
        this.f23630OoooOo0.setAdapter(this.f23634Ooooo0o);
        OooOoO(true);
    }
}
