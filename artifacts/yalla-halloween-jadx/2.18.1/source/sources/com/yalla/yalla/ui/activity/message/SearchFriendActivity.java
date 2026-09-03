package com.yalla.yalla.ui.activity.message;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.CommonListResult;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.db.table.UserInfo;
import com.yalla.yalla.ui.activity.message.SearchFriendActivity;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p070o0000ooO.o00Ooo;
import p133o00OO00o.OooOOO;
import p142o00OOooO.o000O0Oo;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p172o00OooO.o00O0O0;
import p188o00o00o0.OooO0OO;
import p388o0OOooO.o00000O0;
import p516o0o0O000.o00000O;
import p516o0o0O000.o000oOoO;
import p534o0o0OOo0.o0OO000;
import p536o0o0OOoo.t0;
import p536o0o0OOoo.u0;
import p536o0o0OOoo.v0;
import p536o0o0OOoo.w0;
import p536o0o0OOoo.x0;

/* JADX INFO: loaded from: classes2.dex */
public class SearchFriendActivity extends BaseActivity {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final /* synthetic */ int f22198Oooooo0 = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public EditText f22199OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public XRefreshLayout f22200OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public LinearLayout f22201OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public ImageView f22202Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public OooOOO f22203Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public OooO0OO<UserInfo> f22204OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public o0OO000 f22205OooooOO = new o0OO000(this, 1);

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public int f22206OooooOo = 1;

    public class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ boolean f22207OooO00o;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.message.SearchFriendActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0253OooO00o extends o00000O0<CommonListResult<UserInfo>> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, boolean z) {
            super(context);
            this.f22207OooO00o = z;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            SearchFriendActivity.this.f22204OooooO0.loadError();
            SearchFriendActivity.this.f22200OoooOoO.Oooo0o0(this.f22207OooO00o, false, true);
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            List<T> list;
            CommonListResult commonListResult = (CommonListResult) o0Oo0oo.OooO0OO(str, new C0253OooO00o().getType());
            if (commonListResult != null) {
                if (this.f22207OooO00o) {
                    SearchFriendActivity.this.f22204OooooO0.setNewData(commonListResult.data);
                } else {
                    SearchFriendActivity.this.f22204OooooO0.addData(commonListResult.data);
                }
                SearchFriendActivity.this.f22204OooooO0.setLoadComplete();
                SearchFriendActivity.this.f22206OooooOo++;
            }
            SearchFriendActivity.this.f22200OoooOoO.Oooo0o0(this.f22207OooO00o, true, commonListResult == null || (list = commonListResult.data) == 0 || list.size() == 0);
        }
    }

    public final void OooOoO(boolean z) {
        if (z) {
            this.f22206OooooOo = 1;
        }
        String strTrim = this.f22199OoooOo0.getText().toString().trim();
        int i = this.f22206OooooOo;
        OooO00o oooO00o = new OooO00o(this, z);
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("search", o000oOoO.OooO0O0(strTrim));
        params.put("pageindex", String.valueOf(i));
        params.put("pagesize", "20");
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.o000Oo0, o0ooOOo.f32315o000O00, params, oooO00o);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_searchfriend);
        OooOo(R.string.Search_add_new_friends);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rec_search);
        this.f22199OoooOo0 = (EditText) findViewById(R.id.searchEdit);
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.rec_search_friend_result);
        this.f22201OoooOoo = (LinearLayout) findViewById(R.id.ll_search_friend_hot);
        this.f22200OoooOoO = (XRefreshLayout) findViewById(R.id.xrlSearch_friend);
        ImageView imageView = (ImageView) findViewById(R.id.iv_clear);
        this.f22202Ooooo00 = imageView;
        imageView.setOnClickListener(new o00OO0O0.OooO00o(this, 1));
        this.f22200OoooOoO.setOnLoadMoreListener(new t0(this, 0));
        recyclerView.setLayoutManager(new FixGridLayoutManager(this, 3));
        OooOOO oooOOO = new OooOOO();
        this.f22203Ooooo0o = oooOOO;
        oooOOO.f31208OooO0OO = this.f22205OooooOO;
        recyclerView.setAdapter(oooOOO);
        v0 v0Var = new v0(this, this);
        this.f22204OooooO0 = v0Var;
        v0Var.setOnItemClickListener(new o00Ooo(this));
        this.f22204OooooO0.setEmptyImageRes(R.drawable.ic_empty_search);
        this.f22204OooooO0.setEmptyText(R.string.No_search_results);
        this.f22204OooooO0.setFirstLoading(false);
        this.f22204OooooO0.setLoadErrorClickListener(new w0(this));
        recyclerView2.setLayoutManager(new FixLinearLayoutManager(this));
        recyclerView2.setAdapter(this.f22204OooooO0);
        recyclerView2.setOnTouchListener(new View.OnTouchListener() { // from class: o0o0OOoo.s0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                SearchFriendActivity searchFriendActivity = this.f43862Oooo0o;
                o00000O.OooO00o(searchFriendActivity.f22199OoooOo0, searchFriendActivity);
                return false;
            }
        });
        recyclerView2.setOnScrollListener(new x0());
        o00O0O0.OooO0O0().OooO0OO(this.f22199OoooOo0, new o000O0Oo(this));
        u0 u0Var = new u0(this, this);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32271OooooO0, mapOooO0O0, u0Var);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        o00O0O0.OooO0O0().OooO00o();
    }
}
