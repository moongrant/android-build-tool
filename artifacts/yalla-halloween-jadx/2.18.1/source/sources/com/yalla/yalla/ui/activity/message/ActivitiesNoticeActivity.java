package com.yalla.yalla.ui.activity.message;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.ActivitiesNoticesModel;
import com.app.base.model.CommonParseListModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.vm.ActivityMessageVM;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Collection;
import java.util.Map;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p188o00o00o0.OooO0OO;
import p388o0OOooO.o00000O0;
import p391o0OOooOo.o0O00000;
import p536o0o0OOoo.O0000000;
import p536o0o0OOoo.O0O0;
import p536o0o0OOoo.O0OO00;
import p536o0o0OOoo.oo00;

/* JADX INFO: loaded from: classes2.dex */
public class ActivitiesNoticeActivity extends BaseActivity {

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public static final /* synthetic */ int f22120OooooO0 = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f22121OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public XRefreshLayout f22122OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public int f22123OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public OooO0OO<ActivitiesNoticesModel> f22124Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public ActivityMessageVM f22125Ooooo0o;

    public class OooO00o implements Observer<Object> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            ActivitiesNoticeActivity activitiesNoticeActivity = ActivitiesNoticeActivity.this;
            int i = ActivitiesNoticeActivity.f22120OooooO0;
            activitiesNoticeActivity.OooOoO();
        }
    }

    public class OooO0O0 extends o00OO0O0.OooO0O0 {

        public class OooO00o extends o00000O0<CommonParseListModel<ActivitiesNoticesModel>> {
        }

        public OooO0O0(Context context) {
            super(context);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            ActivitiesNoticeActivity.this.f22124Ooooo00.loadError();
            ActivitiesNoticeActivity.this.f22122OoooOoO.Oooo0O0(true);
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
            Collection collection;
            CommonParseListModel commonParseListModel = (CommonParseListModel) o0Oo0oo.OooO0OO(str, new OooO00o().getType());
            if (commonParseListModel == null || (collection = commonParseListModel.data) == null) {
                ActivitiesNoticeActivity.this.f22122OoooOoO.Oooo0o0(true, true, true);
                ActivitiesNoticeActivity.this.f22124Ooooo00.setLoadComplete();
            } else {
                ActivitiesNoticeActivity.this.f22124Ooooo00.setNewData(collection);
                ActivitiesNoticeActivity.this.f22124Ooooo00.setLoadComplete();
                ActivitiesNoticeActivity.this.f22122OoooOoO.Oooo0o0(true, true, commonParseListModel.data.size() < Integer.parseInt("15"));
            }
        }
    }

    public final void OooOoO() {
        OooO0O0 oooO0O0 = new OooO0O0(this);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32281o000000, mapOooO0O0, oooO0O0);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_activities_notice);
        this.f22125Ooooo0o = (ActivityMessageVM) new ViewModelProvider(this).get(ActivityMessageVM.class);
        o0O00000.OooO0OO("Message_activity");
        OooOo(R.string.subscription_activies_notice);
        this.f22121OoooOo0 = (RecyclerView) findViewById(R.id.activities_listview);
        XRefreshLayout xRefreshLayout = (XRefreshLayout) findViewById(R.id.pullToRefreshView);
        this.f22122OoooOoO = xRefreshLayout;
        xRefreshLayout.setOnRefreshListener(new oo00(this));
        this.f22123OoooOoo = getWindowManager().getDefaultDisplay().getWidth();
        O0000000 o0000000 = new O0000000(this, this);
        this.f22124Ooooo00 = o0000000;
        o0000000.setEmptyText(R.string.no_activity_data);
        this.f22124Ooooo00.setEmptyImageRes(R.drawable.ic_empty_message_system);
        this.f22124Ooooo00.setLoadErrorClickListener(new O0O0(this));
        this.f22124Ooooo00.setOnItemClickListener(new O0OO00(this));
        this.f22121OoooOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f22121OoooOo0.setAdapter(this.f22124Ooooo00);
        OooOoO();
        LiveEventBus.get("New_Message_Activity").observe(this, new OooO00o());
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        OooOoO();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        super.onStart();
        this.f22125Ooooo0o.updateReadState();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStop() {
        super.onStop();
    }
}
