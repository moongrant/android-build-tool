package com.yalla.yalla.ui.activity.message;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.ActivitiesNoticesModel;
import com.yalla.yalla.model.CommonParseListModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import com.yalla.yalla.ui.vm.ActivityMessageVM;
import java.util.Collection;
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
public class ActivitiesNoticeActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f25157OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public XRefreshLayout f25158OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f25159OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f25160OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ActivityMessageVM f25161OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooO0O0 f25162OooOo00;

    public class OooO00o implements Observer<Object> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            int i = ActivitiesNoticeActivity.f25157OooOo0O;
            ActivitiesNoticeActivity.this.OooOo0();
        }
    }

    public final void OooOo0() {
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(this) { // from class: com.yalla.yalla.ui.activity.message.ActivitiesNoticeActivity.6
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(String str, String str2) {
                super.OooO0O0(str, str2);
                ActivitiesNoticeActivity activitiesNoticeActivity = ActivitiesNoticeActivity.this;
                activitiesNoticeActivity.f25162OooOo00.OooOoo();
                activitiesNoticeActivity.f25158OooOOo.OooOoo(true);
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(String str) {
                Collection collection;
                CommonParseListModel commonParseListModel = (CommonParseListModel) oOOO00.OooO0O0(str, new TypeToken<CommonParseListModel<ActivitiesNoticesModel>>() { // from class: com.yalla.yalla.ui.activity.message.ActivitiesNoticeActivity.6.1
                }.getType());
                ActivitiesNoticeActivity activitiesNoticeActivity = ActivitiesNoticeActivity.this;
                if (commonParseListModel == null || (collection = commonParseListModel.data) == null) {
                    activitiesNoticeActivity.f25158OooOOo.OooOooo(true, true, true);
                    activitiesNoticeActivity.f25162OooOo00.Oooo00o();
                } else {
                    activitiesNoticeActivity.f25162OooOo00.OooOoO0(collection);
                    activitiesNoticeActivity.f25162OooOo00.Oooo00o();
                    activitiesNoticeActivity.f25158OooOOo.OooOooo(true, true, commonParseListModel.data.size() < Integer.parseInt("15"));
                }
            }
        };
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43438o0OO00O, p426o0OoO0o0.OooOOOO.OooO00o(), oooO0O0);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_activities_notice);
        this.f25161OooOo0 = (ActivityMessageVM) new ViewModelProvider(this).get(ActivityMessageVM.class);
        o0oo0000.OooO00o.OooO0O0("204002");
        OooOOoo(p562o0oOo000.o000000.subscription_activies_notice);
        this.f25159OooOOo0 = (RecyclerView) findViewById(p562o0oOo000.o0OO00O.activities_listview);
        XRefreshLayout xRefreshLayout = (XRefreshLayout) findViewById(p562o0oOo000.o0OO00O.pullToRefreshView);
        this.f25158OooOOo = xRefreshLayout;
        xRefreshLayout.setOnRefreshListener(new com.yalla.yalla.ui.activity.message.OooO00o(this));
        this.f25160OooOOoo = getWindowManager().getDefaultDisplay().getWidth();
        OooO0O0 oooO0O0 = new OooO0O0(this, this, p562o0oOo000.oo0o0Oo.item_activities_);
        this.f25162OooOo00 = oooO0O0;
        oooO0O0.Oooo000(p562o0oOo000.o000000.no_activity_data);
        this.f25162OooOo00.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_message_system);
        this.f25162OooOo00.Oooo0OO(new OooO0OO(this));
        this.f25162OooOo00.f13176OooO0o = new OooO0o(this);
        this.f25159OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f25159OooOOo0.setAdapter(this.f25162OooOo00);
        OooOo0();
        LiveEventBus.get("New_Message_Activity").observe(this, new OooO00o());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        OooOo0();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f25161OooOo0.updateReadState();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
