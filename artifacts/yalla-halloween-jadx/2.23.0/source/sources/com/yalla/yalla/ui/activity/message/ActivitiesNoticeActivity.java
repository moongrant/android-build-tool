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
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
public class ActivitiesNoticeActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public static final /* synthetic */ int f25612OooOo0O = 0;

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    public XRefreshLayout f25613OooOOo;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    public RecyclerView f25614OooOOo0;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    public int f25615OooOOoo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public ActivityMessageVM f25616OooOo0;

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    public OooO0O0 f25617OooOo00;

    public class OooO00o implements Observer<Object> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            int i = ActivitiesNoticeActivity.f25612OooOo0O;
            ActivitiesNoticeActivity.this.OooOo0();
        }
    }

    public final void OooOo0() {
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(this) { // from class: com.yalla.yalla.ui.activity.message.ActivitiesNoticeActivity.6
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(String str, String str2) {
                super.OooO0O0(str, str2);
                ActivitiesNoticeActivity activitiesNoticeActivity = ActivitiesNoticeActivity.this;
                activitiesNoticeActivity.f25617OooOo00.OooOoo();
                activitiesNoticeActivity.f25613OooOOo.OooOoo(true);
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(String str) {
                Collection collection;
                CommonParseListModel commonParseListModel = (CommonParseListModel) oOo00OO0.OooO0O0(str, new TypeToken<CommonParseListModel<ActivitiesNoticesModel>>() { // from class: com.yalla.yalla.ui.activity.message.ActivitiesNoticeActivity.6.1
                }.getType());
                ActivitiesNoticeActivity activitiesNoticeActivity = ActivitiesNoticeActivity.this;
                if (commonParseListModel == null || (collection = commonParseListModel.data) == null) {
                    activitiesNoticeActivity.f25613OooOOo.OooOooo(true, true, true);
                    activitiesNoticeActivity.f25617OooOo00.Oooo00o();
                } else {
                    activitiesNoticeActivity.f25617OooOo00.OooOoO0(collection);
                    activitiesNoticeActivity.f25617OooOo00.Oooo00o();
                    activitiesNoticeActivity.f25613OooOOo.OooOooo(true, true, commonParseListModel.data.size() < Integer.parseInt("15"));
                }
            }
        };
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44179o0OO00O, oO00o000.OooO00o(), oooO0O0);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_activities_notice);
        this.f25616OooOo0 = (ActivityMessageVM) new ViewModelProvider(this).get(ActivityMessageVM.class);
        p587o0oOooo.o0OO000.OooO00o("204002");
        OooOOoo(oO00OOo0.subscription_activies_notice);
        this.f25614OooOOo0 = (RecyclerView) findViewById(oO00O0oO.activities_listview);
        XRefreshLayout xRefreshLayout = (XRefreshLayout) findViewById(oO00O0oO.pullToRefreshView);
        this.f25613OooOOo = xRefreshLayout;
        xRefreshLayout.setOnRefreshListener(new com.yalla.yalla.ui.activity.message.OooO00o(this));
        this.f25615OooOOoo = getWindowManager().getDefaultDisplay().getWidth();
        OooO0O0 oooO0O0 = new OooO0O0(this, this, oO00OO0O.item_activities_);
        this.f25617OooOo00 = oooO0O0;
        oooO0O0.Oooo000(oO00OOo0.no_activity_data);
        this.f25617OooOo00.OooOooo(p584o0oOooO0.oOo00OO0.ic_empty_message_system);
        this.f25617OooOo00.Oooo0OO(new OooO0OO(this));
        this.f25617OooOo00.f10098OooO0o = new OooO0o(this);
        this.f25614OooOOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f25614OooOOo0.setAdapter(this.f25617OooOo00);
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
        this.f25616OooOo0.updateReadState();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
