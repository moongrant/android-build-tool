package com.yalla.yalla.ui.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.BlackUserModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.vm.UserBlackVM;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import java.util.Map;
import o0O0O00.o0ooOOo;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.oo000o;
import p160o00OoOO0.o00OO0O0;
import p535o0o0OOoO.oO00o0;
import p535o0o0OOoO.oO00o00O;
import p535o0o0OOoO.oO0OOO00;
import p535o0o0OOoO.oOOoOOO0;
import p535o0o0OOoO.oOo00o0o;

/* JADX INFO: loaded from: classes2.dex */
public class BlackListActivity extends BaseActivity {

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public static final /* synthetic */ int f21921Oooooo0 = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public int f21922OoooOo0 = 1;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f21923OoooOoO = false;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public TextView f21924OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public RecyclerView f21925Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public XRefreshLayout f21926Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<BlackUserModel.DataBean> f21927OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public boolean f21928OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public UserBlackVM f21929OooooOo;

    public class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ boolean f21930OooO00o;

        public OooO00o(boolean z) {
            this.f21930OooO00o = z;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            BlackListActivity.this.f21927OooooO0.loadError();
            BlackListActivity.this.f21926Ooooo0o.Oooo0O0(this.f21930OooO00o);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            List<BlackUserModel.DataBean> list;
            super.onFinish(str);
            try {
                BlackUserModel blackUserModel = (BlackUserModel) o0Oo0oo.OooO0O0(str, BlackUserModel.class);
                if (blackUserModel != null && (list = blackUserModel.data) != null && !list.isEmpty()) {
                    if (this.f21930OooO00o) {
                        BlackListActivity.this.f21927OooooO0.setNewData(blackUserModel.data);
                    } else {
                        BlackListActivity.this.f21927OooooO0.addData(blackUserModel.data);
                    }
                    BlackListActivity blackListActivity = BlackListActivity.this;
                    blackListActivity.f21922OoooOo0 = blackUserModel.index + 1;
                    blackListActivity.f21927OooooO0.setLoadComplete();
                    BlackListActivity.this.f21926Ooooo0o.Oooo0o0(this.f21930OooO00o, true, blackUserModel.data.isEmpty());
                    BlackListActivity.OooOoO(BlackListActivity.this);
                    return;
                }
                BlackListActivity.this.f21927OooooO0.setLoadComplete();
                BlackListActivity.this.f21926Ooooo0o.Oooo0o0(this.f21930OooO00o, true, true);
                BlackListActivity.OooOoO(BlackListActivity.this);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean OooOoO(BlackListActivity blackListActivity) {
        p188o00o00o0.OooO0OO<BlackUserModel.DataBean> oooO0OO = blackListActivity.f21927OooooO0;
        if (oooO0OO != null && !com.yalla.support.common.util.OooO0OO.OooO00o(oooO0OO.getData())) {
            blackListActivity.f21924OoooOoo.setVisibility(0);
            return false;
        }
        blackListActivity.f21924OoooOoo.setText(blackListActivity.getString(R.string.Edit));
        blackListActivity.f21924OoooOoo.setVisibility(8);
        return true;
    }

    public final void OooOoOO(boolean z) {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo000o oo000oVar = o00000OO.f32208OooO0O0;
        String strOooO00o = o0ooOOo.OooO00o(new StringBuilder(), this.f21922OoooOo0, "");
        OooO00o oooO00o = new OooO00o(z);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("pageindex", strOooO00o);
        mapOooO0O0.put("type", "4");
        p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, p153o00Oo0oO.o0ooOOo.f32244OooOoo, p153o00Oo0oO.o0ooOOo.f32330o00oO0o, mapOooO0O0, oooO00o);
    }

    public final void OooOoo0() {
        this.f21922OoooOo0 = 1;
        OooOoOO(true);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1022 || intent == null) {
            return;
        }
        OooOoo0();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(View view) {
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_black_list);
        this.f21929OooooOo = (UserBlackVM) new ViewModelProvider(this).get(UserBlackVM.class);
        OooOo(R.string.Blocked_List);
        OooOo0O(1);
        this.f21924OoooOoo = this.f11463OoooO.OooOoo(getString(R.string.Edit), new oOOoOOO0(this));
        this.f21925Ooooo00 = (RecyclerView) findViewById(R.id.rv_black);
        this.f21926Ooooo0o = (XRefreshLayout) findViewById(R.id.xrl_black);
        oO0OOO00 oo0ooo00 = new oO0OOO00(this, this);
        this.f21927OooooO0 = oo0ooo00;
        oo0ooo00.setEmptyText(R.string.oops_No_one_in_Blocked_list);
        this.f21927OooooO0.setEmptyImageRes(R.drawable.ic_empty_delete);
        this.f21927OooooO0.setLoadErrorClickListener(new oO00o00O(this));
        this.f21926Ooooo0o.setOnRefreshListener(new oO00o0(this));
        this.f21926Ooooo0o.setOnLoadMoreListener(new oOo00o0o(this));
        this.f21925Ooooo00.setLayoutManager(new FixLinearLayoutManager(this));
        this.f21925Ooooo00.addItemDecoration(new p603o0oo00o0.o00000OO(this));
        this.f21925Ooooo00.setAdapter(this.f21927OooooO0);
        OooOoo0();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f21928OooooOO = false;
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        this.f21928OooooOO = true;
    }
}
