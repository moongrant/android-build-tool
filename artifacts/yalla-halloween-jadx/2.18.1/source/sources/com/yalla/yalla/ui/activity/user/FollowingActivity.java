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
import p143o00OOooo.o00O;
import p153o00Oo0oO.o000000O;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.oo000o;
import p160o00OoOO0.o00OO0O0;
import p175o00OooOo.o0OO0;
import p524o0o0O0oO.o0O00OO;
import p566o0oOo00O.o000O00;
import p566o0oOo00O.o000O000;
import p566o0oOo00O.o000O00O;
import p566o0oOo00O.o000O0o;
import p566o0oOo00O.o000Oo0;

/* JADX INFO: loaded from: classes3.dex */
public class FollowingActivity extends BaseActivity {

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public static final /* synthetic */ int f23325OooooOO = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f23326OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public XRefreshLayout f23327OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public String f23328OoooOoo = "";

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public int f23329Ooooo00 = 1;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public int f23330Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<UserInfoModel> f23331OooooO0;

    public class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ boolean f23332OooO00o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, boolean z) {
            super(context);
            this.f23332OooO00o = z;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            FollowingActivity.this.f23327OoooOoO.Oooo0O0(this.f23332OooO00o);
            FollowingActivity.this.f23331OooooO0.loadError();
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            List<UserInfoModel> list;
            super.onFinish(str);
            FollowedModel followedModel = (FollowedModel) o0Oo0oo.OooO0O0(str, FollowedModel.class);
            if (followedModel == null || (list = followedModel.data) == null || list.isEmpty()) {
                FollowingActivity.this.f23327OoooOoO.Oooo0o0(this.f23332OooO00o, true, true);
                FollowingActivity.this.f23331OooooO0.setLoadComplete();
                return;
            }
            FollowingActivity followingActivity = FollowingActivity.this;
            followingActivity.f23328OoooOoo = followedModel.datesort;
            followingActivity.f23329Ooooo00 = followedModel.index + 1;
            if (this.f23332OooO00o) {
                followingActivity.f23331OooooO0.setNewData(followedModel.data);
            } else {
                followingActivity.f23331OooooO0.addData(followedModel.data);
            }
            FollowingActivity.this.f23331OooooO0.setLoadComplete();
            FollowingActivity.this.f23327OoooOoO.Oooo0o0(this.f23332OooO00o, true, followedModel.data.isEmpty());
        }
    }

    public static void OooOoO(FollowingActivity followingActivity, UserInfoModel userInfoModel) {
        Objects.requireNonNull(followingActivity);
        o000000O.OooO00o(userInfoModel.getUserId() + "", userInfoModel.getIsFollow() ? "1" : AppEventsConstants.EVENT_PARAM_VALUE_NO, new o000O00O(followingActivity, followingActivity, userInfoModel));
    }

    public final void OooOoOO(boolean z) {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo000o oo000oVar = o00000OO.f32208OooO0O0;
        String str = this.f23328OoooOoo;
        int i = this.f23330Ooooo0o;
        String strOooO00o = o0ooOOo.OooO00o(new StringBuilder(), this.f23329Ooooo00, "");
        OooO00o oooO00o = new OooO00o(this, z);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        if (str != null) {
            mapOooO0O0.put("dtsort", str);
        }
        mapOooO0O0.put("pageindex", strOooO00o);
        mapOooO0O0.put("num", String.valueOf(i));
        mapOooO0O0.put("type", FeedbackType.Suggestions);
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
        boolean booleanExtra = intent.getBooleanExtra("follow", true);
        if (this.f23331OooooO0 == null || !com.yalla.support.common.util.OooO0OO.OooO0O0(stringExtra) || booleanExtra) {
            return;
        }
        List<UserInfoModel> data = this.f23331OooooO0.getData();
        for (int i3 = 0; i3 < data.size(); i3++) {
            if (String.valueOf(data.get(i3).getUserId()).equals(stringExtra)) {
                this.f23331OooooO0.remove(i3);
                this.f23331OooooO0.setLoadComplete();
                return;
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_followed);
        this.f23330Ooooo0o = getIntent().getIntExtra("number", 0);
        OooOo(R.string.Following);
        this.f23326OoooOo0 = (RecyclerView) findViewById(R.id.rec_followed);
        this.f23327OoooOoO = (XRefreshLayout) findViewById(R.id.srl_followed);
        this.f23326OoooOo0.setLayoutManager(new FixLinearLayoutManager(this));
        o000O000 o000o001 = new o000O000(this, this);
        this.f23331OooooO0 = o000o001;
        o000o001.setEmptyImageRes(R.drawable.ic_empty_follow);
        this.f23331OooooO0.setEmptyText(R.string.blank_no_following);
        this.f23331OooooO0.setLoadErrorClickListener(new o000O0o(this));
        this.f23327OoooOoO.setOnRefreshListener(new o000Oo0(this));
        this.f23327OoooOoO.setOnLoadMoreListener(new o000O00(this));
        this.f23326OoooOo0.addItemDecoration(new o0OO0(this));
        this.f23326OoooOo0.setAdapter(this.f23331OooooO0);
        this.f23329Ooooo00 = 1;
        OooOoOO(true);
        LiveEventBus.get("USER_UN_FOLLOWING", Long.class).observe(this, new o00O(this, 3));
        LiveEventBus.get("USER_ADD_BLACKLISTED", Long.class).observe(this, new o0O00OO(this, 5));
    }
}
