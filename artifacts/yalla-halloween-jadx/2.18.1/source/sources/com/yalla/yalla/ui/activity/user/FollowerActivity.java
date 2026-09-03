package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.base.activity.BaseActivity;
import com.app.base.interfaceType.FeedbackType;
import com.app.base.model.FollowedModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.facebook.appevents.AppEventsConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import o0O0O00.o0ooOOo;
import p143o00OOooo.oo0oOO0;
import p153o00Oo0oO.o000000O;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.oo000o;
import p160o00OoOO0.o00OO0O0;
import p175o00OooOo.o0OO0;
import p566o0oOo00O.o0000O;
import p566o0oOo00O.o0000O0;
import p566o0oOo00O.o0000O0O;
import p566o0oOo00O.o0000oo;
import p566o0oOo00O.o000OO;

/* JADX INFO: loaded from: classes3.dex */
public class FollowerActivity extends BaseActivity {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final /* synthetic */ int f23316OooooOO = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f23317OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public XRefreshLayout f23318OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public String f23319OoooOoo = "";

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f23320Ooooo00 = 1;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<UserInfoModel> f23321Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public int f23322OooooO0;

    public class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ boolean f23323OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, boolean z) {
            super(context);
            this.f23323OooO00o = z;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            FollowerActivity.this.f23318OoooOoO.Oooo0O0(this.f23323OooO00o);
            FollowerActivity.this.f23321Ooooo0o.loadError();
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            List<UserInfoModel> list;
            super.onFinish(str);
            FollowedModel followedModel = (FollowedModel) o0Oo0oo.OooO0O0(str, FollowedModel.class);
            if (followedModel == null || (list = followedModel.data) == null || list.isEmpty()) {
                FollowerActivity.this.f23318OoooOoO.Oooo0o0(this.f23323OooO00o, true, true);
                FollowerActivity.this.f23321Ooooo0o.setLoadComplete();
                return;
            }
            FollowerActivity followerActivity = FollowerActivity.this;
            followerActivity.f23319OoooOoo = followedModel.datesort;
            followerActivity.f23320Ooooo00 = followedModel.index + 1;
            if (this.f23323OooO00o) {
                followerActivity.f23321Ooooo0o.setNewData(followedModel.data);
            } else {
                followerActivity.f23321Ooooo0o.addData(followedModel.data);
            }
            FollowerActivity.this.f23321Ooooo0o.setLoadComplete();
            FollowerActivity.this.f23318OoooOoO.Oooo0o0(this.f23323OooO00o, true, followedModel.data.isEmpty());
        }
    }

    public static void OooOoO(FollowerActivity followerActivity, UserInfoModel userInfoModel) {
        Objects.requireNonNull(followerActivity);
        o000000O.OooO00o(userInfoModel.getUserId() + "", userInfoModel.getIsFollow() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO, new o0000O(followerActivity, followerActivity, userInfoModel));
    }

    public final void OooOoOO() {
        p491o0o00O00.OooO0OO.OooO00o().Oooo00O().OooO00o(((Number) kotlin.reflect.jvm.internal.impl.types.OooO00o.OooO00o(p498o0o00Oo0.OooOOO.f41216OooO00o)).longValue());
        this.f23320Ooooo00 = 1;
        OooOoo0(true);
    }

    public final void OooOoo0(boolean z) {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo000o oo000oVar = o00000OO.f32208OooO0O0;
        String str = this.f23319OoooOoo;
        int i = this.f23322OooooO0;
        String strOooO00o = o0ooOOo.OooO00o(new StringBuilder(), this.f23320Ooooo00, "");
        OooO00o oooO00o = new OooO00o(this, z);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        if (str != null) {
            mapOooO0O0.put("dtsort", str);
        }
        mapOooO0O0.put("pageindex", strOooO00o);
        mapOooO0O0.put("num", String.valueOf(i));
        mapOooO0O0.put("type", FeedbackType.Recharge);
        p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, p153o00Oo0oO.o0ooOOo.f32244OooOoo, p153o00Oo0oO.o0ooOOo.f32330o00oO0o, mapOooO0O0, oooO00o);
    }

    @Override // com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1022 || intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("userid");
        boolean booleanExtra = intent.getBooleanExtra("follow", false);
        if (this.f23321Ooooo0o == null || !com.yalla.support.common.util.OooO0OO.OooO0O0(stringExtra)) {
            return;
        }
        List<UserInfoModel> data = this.f23321Ooooo0o.getData();
        for (int i3 = 0; i3 < this.f23321Ooooo0o.getData().size(); i3++) {
            if (String.valueOf(data.get(i3).getUserId()).equals(stringExtra)) {
                data.get(i3).setFollow(booleanExtra);
                this.f23321Ooooo0o.notifyItemChanged(i3);
                return;
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_fans);
        this.f23322OooooO0 = getIntent().getIntExtra("fans", 0);
        OooOo(R.string.Followers);
        this.f23317OoooOo0 = (RecyclerView) findViewById(R.id.rec_fans);
        this.f23318OoooOoO = (XRefreshLayout) findViewById(R.id.srl_fans);
        this.f23317OoooOo0.addItemDecoration(new o0OO0(this));
        this.f23317OoooOo0.setLayoutManager(new FixLinearLayoutManager(this));
        o0000oo o0000ooVar = new o0000oo(this, this);
        this.f23321Ooooo0o = o0000ooVar;
        this.f23317OoooOo0.setAdapter(o0000ooVar);
        this.f23321Ooooo0o.setEmptyImageRes(R.drawable.ic_empty_fans);
        this.f23321Ooooo0o.setEmptyText(R.string.blank_no_fans);
        this.f23321Ooooo0o.setLoadErrorClickListener(new o0000O0(this));
        this.f23318OoooOoO.setOnRefreshListener(new o0000O0O(this));
        this.f23318OoooOoO.setOnLoadMoreListener(new o000OO(this));
        this.f23317OoooOo0.setAdapter(this.f23321Ooooo0o);
        OooOoOO();
        LiveEventBus.get("USER_ADD_BLACKLISTED", Long.class).observe(this, new oo0oOO0(this, 5));
    }
}
