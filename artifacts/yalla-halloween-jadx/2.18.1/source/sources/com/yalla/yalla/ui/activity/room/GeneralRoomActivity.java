package com.yalla.yalla.ui.activity.room;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.adapter.room.RoomBaseAdapter;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.CommonParseListModel;
import com.app.base.model.RoomIndexModel;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.umeng.analytics.MobclickAgent;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.common.pageSource.GeneralRoomPageSource;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import o0O0O00.o0ooOOo;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p391o0OOooOo.o0O00000;
import p544o0o0OoOO.d4;
import p544o0o0OoOO.e4;
import p544o0o0OoOO.f4;

/* JADX INFO: loaded from: classes2.dex */
public class GeneralRoomActivity extends BaseActivity {

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    public static final /* synthetic */ int f22829Oooooo = 0;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    public RecyclerView f22830OoooOo0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public XRefreshLayout f22831OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    public String f22832OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public String f22833Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public String f22834Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public String f22835OooooO0;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public o00OO0.OooO0O0 f22837OooooOo;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public int f22836OooooOO = 1;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public GeneralRoomPageSource f22838Oooooo0 = null;

    public class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ boolean f22839OooO00o;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.room.GeneralRoomActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public class C0257OooO00o extends o00000O0<CommonParseListModel<RoomIndexModel>> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(Context context, boolean z) {
            super(context);
            this.f22839OooO00o = z;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(String str, String str2) {
            super.onError(str, str2);
            GeneralRoomActivity.this.f22831OoooOoO.Oooo0OO(this.f22839OooO00o, false);
            GeneralRoomActivity.this.f22837OooooOo.setLoadComplete(Boolean.valueOf(this.f22839OooO00o), Boolean.FALSE, Boolean.TRUE);
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(String str) {
            CommonParseListModel commonParseListModel = (CommonParseListModel) o0Oo0oo.OooO0OO(str, new C0257OooO00o().getType());
            GeneralRoomActivity generalRoomActivity = GeneralRoomActivity.this;
            generalRoomActivity.f22836OooooOO = commonParseListModel.index + 1;
            if (this.f22839OooO00o) {
                generalRoomActivity.f22837OooooOo.setNewData(commonParseListModel.data);
            } else {
                generalRoomActivity.f22837OooooOo.OooO0OO(commonParseListModel.data);
                GeneralRoomActivity.this.f22837OooooOo.addData(commonParseListModel.data);
            }
            GeneralRoomActivity.this.f22831OoooOoO.Oooo0OO(this.f22839OooO00o, true);
            GeneralRoomActivity.this.f22837OooooOo.setLoadComplete(Boolean.valueOf(this.f22839OooO00o), Boolean.TRUE, Boolean.valueOf(com.yalla.support.common.util.OooO0OO.OooO00o(commonParseListModel.data)));
        }
    }

    public static /* synthetic */ class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final /* synthetic */ int[] f22841OooO00o;

        static {
            int[] iArr = new int[GeneralRoomPageSource.values().length];
            f22841OooO00o = iArr;
            try {
                iArr[GeneralRoomPageSource.RoomCountry.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22841OooO00o[GeneralRoomPageSource.RoomTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOOoo() {
        MobclickAgent.onPageEnd(getClass().getName() + "-TAG");
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity
    public final void OooOo00() {
        MobclickAgent.onPageStart(getClass().getName() + "-Country");
    }

    public final void OooOoO(boolean z) {
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        o00000OO.f32210OooO0Oo.OooO0O0(o0ooOOo.OooO00o(new StringBuilder(), this.f22836OooooOO, ""), this.f22834Ooooo0o, this.f22832OoooOoo, new OooO00o(this, z));
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_generalroom);
        Intent intent = getIntent();
        this.f22834Ooooo0o = intent.getStringExtra("LABELID");
        this.f22835OooooO0 = intent.getStringExtra("LABELNAME");
        this.f22832OoooOoo = intent.getStringExtra("COUNTRYID");
        this.f22833Ooooo00 = intent.getStringExtra("COUNTRYNAME");
        if (intent.hasExtra("Type")) {
            this.f22838Oooooo0 = (GeneralRoomPageSource) intent.getSerializableExtra("Type");
        }
        GeneralRoomPageSource generalRoomPageSource = this.f22838Oooooo0;
        if (generalRoomPageSource != null) {
            int i = OooO0O0.f22841OooO00o[generalRoomPageSource.ordinal()];
            if (i == 1) {
                if (!TextUtils.isEmpty(this.f22832OoooOoo)) {
                    o0O00000.OooO0o0("Room_country", this.f22832OoooOoo);
                }
                if (!TextUtils.isEmpty(this.f22834Ooooo0o)) {
                    o0O00000.OooO0o0("Room_country", this.f22834Ooooo0o);
                }
            } else if (i == 2) {
                o0O00000.OooO0o0("Room_tag", this.f22832OoooOoo);
                if (!TextUtils.isEmpty(this.f22832OoooOoo)) {
                    o0O00000.OooO0o0("Room_tag", this.f22832OoooOoo);
                }
                if (!TextUtils.isEmpty(this.f22834Ooooo0o)) {
                    o0O00000.OooO0o0("Room_tag", this.f22834Ooooo0o);
                }
            }
        }
        this.f22830OoooOo0 = (RecyclerView) findViewById(R.id.rec_genrealroom);
        this.f22831OoooOoO = (XRefreshLayout) findViewById(R.id.xrl);
        String str = this.f22835OooooO0;
        if (str != null) {
            OooOoO0(str);
        } else {
            String str2 = this.f22833Ooooo00;
            if (str2 != null) {
                OooOoO0(str2);
            } else {
                OooOo(R.string.room);
            }
        }
        this.f22837OooooOo = new o00OO0.OooO0O0(this);
        GeneralRoomPageSource generalRoomPageSource2 = this.f22838Oooooo0;
        if (generalRoomPageSource2 != null) {
            int i2 = OooO0O0.f22841OooO00o[generalRoomPageSource2.ordinal()];
            if (i2 == 1) {
                o00OO0.OooO0O0 oooO0O0 = this.f22837OooooOo;
                oooO0O0.f11360OooO0O0 = RoomBaseAdapter.PageSource.GeneralRoomCountry;
                oooO0O0.f11362OooO0Oo = EnterRoomParentPage.Explore_Country;
            } else if (i2 == 2) {
                o00OO0.OooO0O0 oooO0O1 = this.f22837OooooOo;
                oooO0O1.f11360OooO0O0 = RoomBaseAdapter.PageSource.GeneralRoomTag;
                oooO0O1.f11362OooO0Oo = EnterRoomParentPage.Explore_Tag;
            }
        }
        this.f22837OooooOo.setFirstLoading(true);
        this.f22837OooooOo.setEmptyImageRes(R.drawable.ic_empty_room);
        this.f22837OooooOo.setEmptyText(R.string.blank_ta_no_rooms);
        this.f22837OooooOo.setLoadErrorClickListener(new d4(this));
        this.f22837OooooOo.setOnLoadMoreListener(new e4(this), this.f22830OoooOo0);
        this.f22837OooooOo.setOnItemChildClickListener(new com.yalla.yalla.ui.activity.room.OooO00o(this));
        this.f22831OoooOoO.setOnRefreshListener(new f4(this));
        this.f22830OoooOo0.setLayoutManager(new FixLinearLayoutManager(this));
        this.f22830OoooOo0.setAdapter(this.f22837OooooOo);
        this.f22836OooooOO = 1;
        OooOoO(true);
    }
}
