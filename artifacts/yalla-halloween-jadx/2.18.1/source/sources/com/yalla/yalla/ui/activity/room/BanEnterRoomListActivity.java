package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.MoraHistoryModelList;
import com.app.base.view.HeaderLayout;
import com.app.base.view.SearchView;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.support.keyboardpanel.KeyBoardUtil$hideKeyboard$1;
import com.yalla.yalla.common.model.RoomBanEnterUser;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p025Oooo0O0.o000O0Oo;
import p143o00OOooo.oo0O;
import p153o00Oo0oO.o00000OO;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.o0ooOOo;
import p153o00Oo0oO.oo0o0Oo;
import p159o00OoOO.o000O00O;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p516o0o0O000.o00000;
import p516o0o0O000.o000oOoO;
import p544o0o0OoOO.a3;
import p544o0o0OoOO.b3;
import p544o0o0OoOO.v2;
import p544o0o0OoOO.w2;
import p544o0o0OoOO.x2;
import p544o0o0OoOO.y2;
import p544o0o0OoOO.z2;
import p649o0ooOOoo.jg;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/BanEnterRoomListActivity;", "Lcom/app/base/base/activity/BaseActivity;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class BanEnterRoomListActivity extends BaseActivity {

    /* JADX INFO: renamed from: o00O0O, reason: collision with root package name */
    public static final /* synthetic */ int f22745o00O0O = 0;

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    public boolean f22747OoooOoO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @Nullable
    public TextView f22748OoooOoo;

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    public XRefreshLayout f22749Ooooo00;

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public RecyclerView f22750Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<RoomBanEnterUser> f22751OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public SearchView f22752OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public jg f22753OooooOo;

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    public boolean f22756OoooooO;

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public String f22746OoooOo0 = "";

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    @NotNull
    public ArrayList<RoomBanEnterUser> f22755Oooooo0 = new ArrayList<>();

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @NotNull
    public ArrayList<RoomBanEnterUser> f22754Oooooo = new ArrayList<>();

    /* JADX INFO: renamed from: Ooooooo, reason: collision with root package name */
    public int f22757Ooooooo = 1;

    /* JADX INFO: renamed from: o0OoOo0, reason: collision with root package name */
    @NotNull
    public String f22758o0OoOo0 = "";

    /* JADX INFO: renamed from: ooOO, reason: collision with root package name */
    public int f22759ooOO = 1;

    public static final class OooO00o extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ boolean f22761OooO0O0;

        /* JADX INFO: renamed from: com.yalla.yalla.ui.activity.room.BanEnterRoomListActivity$OooO00o$OooO00o, reason: collision with other inner class name */
        public static final class C0256OooO00o extends o00000O0<MoraHistoryModelList<RoomBanEnterUser>> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO00o(boolean z) {
            super(BanEnterRoomListActivity.this);
            this.f22761OooO0O0 = z;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            super.onError(str, str2);
            XRefreshLayout xRefreshLayout = BanEnterRoomListActivity.this.f22749Ooooo00;
            p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO = null;
            if (xRefreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                xRefreshLayout = null;
            }
            xRefreshLayout.Oooo0O0(this.f22761OooO0O0);
            p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO2 = BanEnterRoomListActivity.this.f22751OooooO0;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0OO = oooO0OO2;
            }
            oooO0OO.loadError();
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@Nullable String str) {
            String str2;
            super.onFinish(str);
            TextView textView = BanEnterRoomListActivity.this.f22748OoooOoo;
            if (textView != null) {
                textView.setVisibility(0);
            }
            MoraHistoryModelList moraHistoryModelList = (MoraHistoryModelList) o0Oo0oo.OooO0OO(str, new C0256OooO00o().getType());
            p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO = null;
            jg jgVar = null;
            BanEnterRoomListActivity.this.f22759ooOO = (moraHistoryModelList == null || (str2 = moraHistoryModelList.pageindex) == null) ? 0 : com.yalla.support.common.util.OooO.OooO0o0(str2);
            List data = moraHistoryModelList != null ? moraHistoryModelList.getData() : null;
            if (data == null || data.isEmpty()) {
                XRefreshLayout xRefreshLayout = BanEnterRoomListActivity.this.f22749Ooooo00;
                if (xRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                    xRefreshLayout = null;
                }
                xRefreshLayout.Oooo0o0(this.f22761OooO0O0, true, true);
                p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO2 = BanEnterRoomListActivity.this.f22751OooooO0;
                if (oooO0OO2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO2 = null;
                }
                oooO0OO2.setNewData(null);
                p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO3 = BanEnterRoomListActivity.this.f22751OooooO0;
                if (oooO0OO3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    oooO0OO3 = null;
                }
                oooO0OO3.setLoadComplete();
                TextView textView2 = BanEnterRoomListActivity.this.f22748OoooOoo;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                }
                jg jgVar2 = BanEnterRoomListActivity.this.f22753OooooOo;
                if (jgVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("header");
                } else {
                    jgVar = jgVar2;
                }
                SearchView searchView = jgVar.f49797OooO0O0;
                Intrinsics.checkNotNullExpressionValue(searchView, "header.search");
                o00O0O.OooO00o(searchView);
                return;
            }
            if (this.f22761OooO0O0) {
                jg jgVar3 = BanEnterRoomListActivity.this.f22753OooooOo;
                if (jgVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("header");
                    jgVar3 = null;
                }
                SearchView searchView2 = jgVar3.f49797OooO0O0;
                Intrinsics.checkNotNullExpressionValue(searchView2, "header.search");
                o00O0O.OooO(searchView2);
                jg jgVar4 = BanEnterRoomListActivity.this.f22753OooooOo;
                if (jgVar4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("header");
                    jgVar4 = null;
                }
                jgVar4.f49797OooO0O0.OooO0O0();
                BanEnterRoomListActivity.this.f22755Oooooo0.clear();
            }
            BanEnterRoomListActivity.this.f22755Oooooo0.addAll(moraHistoryModelList.getData());
            p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO4 = BanEnterRoomListActivity.this.f22751OooooO0;
            if (oooO0OO4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO4 = null;
            }
            oooO0OO4.setNewData(BanEnterRoomListActivity.this.f22755Oooooo0);
            XRefreshLayout xRefreshLayout2 = BanEnterRoomListActivity.this.f22749Ooooo00;
            if (xRefreshLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                xRefreshLayout2 = null;
            }
            xRefreshLayout2.Oooo0o0(this.f22761OooO0O0, true, moraHistoryModelList.getData().size() < Integer.parseInt("15"));
            p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO5 = BanEnterRoomListActivity.this.f22751OooooO0;
            if (oooO0OO5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0OO = oooO0OO5;
            }
            oooO0OO.setLoadComplete();
            BanEnterRoomListActivity.this.f22746OoooOo0 = String.valueOf(((RoomBanEnterUser) moraHistoryModelList.getData().get(moraHistoryModelList.getData().size() - 1)).getExTime());
        }
    }

    public static final class OooO0O0 extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ boolean f22763OooO0O0;

        public static final class OooO00o extends o00000O0<MoraHistoryModelList<RoomBanEnterUser>> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(BanEnterRoomListActivity.this);
            this.f22763OooO0O0 = z;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            super.onError(str, str2);
            XRefreshLayout xRefreshLayout = BanEnterRoomListActivity.this.f22749Ooooo00;
            p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO = null;
            if (xRefreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                xRefreshLayout = null;
            }
            xRefreshLayout.Oooo0O0(this.f22763OooO0O0);
            p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO2 = BanEnterRoomListActivity.this.f22751OooooO0;
            if (oooO0OO2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0OO = oooO0OO2;
            }
            oooO0OO.loadError();
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@Nullable String str) {
            super.onFinish(str);
            TextView textView = BanEnterRoomListActivity.this.f22748OoooOoo;
            boolean z = false;
            if (textView != null) {
                textView.setVisibility(0);
            }
            MoraHistoryModelList moraHistoryModelList = (MoraHistoryModelList) o0Oo0oo.OooO0OO(str, new OooO00o().getType());
            BanEnterRoomListActivity banEnterRoomListActivity = BanEnterRoomListActivity.this;
            banEnterRoomListActivity.f22757Ooooooo++;
            if (this.f22763OooO0O0) {
                banEnterRoomListActivity.f22754Oooooo.clear();
            }
            p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO = null;
            if (!(moraHistoryModelList == null)) {
                List data = moraHistoryModelList != null ? moraHistoryModelList.getData() : null;
                if (!(data == null || data.isEmpty())) {
                    BanEnterRoomListActivity.this.f22754Oooooo.addAll(moraHistoryModelList.getData());
                    p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO2 = BanEnterRoomListActivity.this.f22751OooooO0;
                    if (oooO0OO2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                        oooO0OO2 = null;
                    }
                    oooO0OO2.setNewData(BanEnterRoomListActivity.this.f22754Oooooo);
                    XRefreshLayout xRefreshLayout = BanEnterRoomListActivity.this.f22749Ooooo00;
                    if (xRefreshLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                        xRefreshLayout = null;
                    }
                    boolean z2 = this.f22763OooO0O0;
                    List data2 = moraHistoryModelList.getData();
                    if (data2 != null && data2.size() == 0) {
                        z = true;
                    }
                    xRefreshLayout.Oooo0o0(z2, true, z);
                    p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO3 = BanEnterRoomListActivity.this.f22751OooooO0;
                    if (oooO0OO3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("adapter");
                    } else {
                        oooO0OO = oooO0OO3;
                    }
                    oooO0OO.setLoadComplete();
                    BanEnterRoomListActivity.this.f22746OoooOo0 = String.valueOf(((RoomBanEnterUser) moraHistoryModelList.getData().get(moraHistoryModelList.getData().size() - 1)).getExTime());
                    return;
                }
            }
            XRefreshLayout xRefreshLayout2 = BanEnterRoomListActivity.this.f22749Ooooo00;
            if (xRefreshLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
                xRefreshLayout2 = null;
            }
            xRefreshLayout2.Oooo0o0(this.f22763OooO0O0, true, true);
            p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO4 = BanEnterRoomListActivity.this.f22751OooooO0;
            if (oooO0OO4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO4 = null;
            }
            oooO0OO4.setNewData(BanEnterRoomListActivity.this.f22754Oooooo);
            p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO5 = BanEnterRoomListActivity.this.f22751OooooO0;
            if (oooO0OO5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                oooO0OO = oooO0OO5;
            }
            oooO0OO.setLoadComplete();
            TextView textView2 = BanEnterRoomListActivity.this.f22748OoooOoo;
            if (textView2 == null) {
                return;
            }
            textView2.setVisibility(8);
        }
    }

    public static final void OooOoO(BanEnterRoomListActivity banEnterRoomListActivity, String str) {
        Objects.requireNonNull(banEnterRoomListActivity);
        ArrayList arrayList = new ArrayList();
        if (!(str.length() == 0)) {
            banEnterRoomListActivity.OooOoo(str, true);
            return;
        }
        arrayList.addAll(banEnterRoomListActivity.f22755Oooooo0);
        p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO = banEnterRoomListActivity.f22751OooooO0;
        p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setNewData(arrayList);
        p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO3 = banEnterRoomListActivity.f22751OooooO0;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO2 = oooO0OO3;
        }
        oooO0OO2.setLoadComplete(true);
    }

    public final void OooOoOO(boolean z) {
        this.f22756OoooooO = false;
        String barid = o000O00O.OooO().f32427Oooo.getBarid();
        if (z) {
            this.f22759ooOO = 1;
        }
        o00oO0o o00oo0o2 = o00000OO.f32207OooO00o;
        oo0o0Oo oo0o0oo = o00000OO.f32210OooO0Oo;
        String str = this.f22746OoooOo0;
        int i = this.f22759ooOO;
        OooO00o oooO00o = new OooO00o(z);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("barid", barid);
        mapOooO0O0.put("pagesize", String.valueOf(15));
        mapOooO0O0.put("pageindex", String.valueOf(i));
        mapOooO0O0.put("timestr", str);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32279o0000, mapOooO0O0, oooO00o);
    }

    public final void OooOoo(String str, boolean z) {
        this.f22758o0OoOo0 = str;
        this.f22756OoooooO = true;
        String barid = o000O00O.OooO().f32427Oooo.getBarid();
        if (z) {
            this.f22757Ooooooo = 1;
        }
        Intrinsics.checkNotNullExpressionValue(barid, "barId");
        int i = this.f22757Ooooooo;
        OooO0O0 oooO0O0 = new OooO0O0(z);
        Intrinsics.checkNotNullParameter(barid, "barid");
        Map<String, String> params = o00OO0O0.OooO0O0();
        Intrinsics.checkNotNullExpressionValue(params, "params");
        params.put("barid", barid);
        params.put("pageindex", String.valueOf(i));
        params.put("search", o000oOoO.OooO0O0(str));
        params.put("pagesize", "20");
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.o000Oo0, o0ooOOo.f32328o00o0O, params, oooO0O0);
    }

    public final void OooOoo0() {
        this.f22746OoooOo0 = "";
        OooOoOO(true);
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ban_enter_room_list);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.setTitle(R.string.room_ban_enter_room_title);
        }
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.setNavigationOnClickListener(new a3(this));
        }
        HeaderLayout headerLayout3 = this.f11463OoooO;
        jg jgVar = null;
        this.f22748OoooOoo = headerLayout3 != null ? headerLayout3.OooOoo(getString(R.string.Edit), new b3(this)) : null;
        jg jgVarInflate = jg.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(jgVarInflate, "inflate(layoutInflater)");
        this.f22753OooooOo = jgVarInflate;
        TextView textView = this.f22748OoooOoo;
        if (textView != null) {
            textView.setVisibility(8);
        }
        View viewFindViewById = findViewById(R.id.move_room_pullToRefreshView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.move_room_pullToRefreshView)");
        this.f22749Ooooo00 = (XRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.rv_ban_enter_room_list);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.rv_ban_enter_room_list)");
        this.f22750Ooooo0o = (RecyclerView) viewFindViewById2;
        XRefreshLayout xRefreshLayout = this.f22749Ooooo00;
        if (xRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
            xRefreshLayout = null;
        }
        xRefreshLayout.setOnRefreshListener(new o0O0O0o0.OooO0OO(this, 6));
        XRefreshLayout xRefreshLayout2 = this.f22749Ooooo00;
        if (xRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomPullToRefreshView");
            xRefreshLayout2 = null;
        }
        xRefreshLayout2.setOnLoadMoreListener(new oo0O(this, 3));
        v2 v2Var = new v2(this);
        this.f22751OooooO0 = v2Var;
        v2Var.setEmptyImageRes(R.drawable.ic_empty_delete);
        p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO = this.f22751OooooO0;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setEmptyText(R.string.no_ban_room_user);
        p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO2 = this.f22751OooooO0;
        if (oooO0OO2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO2 = null;
        }
        oooO0OO2.setLoadErrorClickListener(new w2(this));
        RecyclerView recyclerView = this.f22750Ooooo0o;
        if (recyclerView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomListView");
            recyclerView = null;
        }
        recyclerView.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView2 = this.f22750Ooooo0o;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomListView");
            recyclerView2 = null;
        }
        o00000.OooO00o(recyclerView2);
        RecyclerView recyclerView3 = this.f22750Ooooo0o;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("banRoomListView");
            recyclerView3 = null;
        }
        p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO3 = this.f22751OooooO0;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        recyclerView3.setAdapter(oooO0OO3);
        jg jgVar2 = this.f22753OooooOo;
        if (jgVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
            jgVar2 = null;
        }
        SearchView searchView = jgVar2.f49797OooO0O0;
        Intrinsics.checkNotNullExpressionValue(searchView, "header.search");
        this.f22752OooooOO = searchView;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView = null;
        }
        searchView.getEditSearch().setHint(getString(R.string.Search_user_name_or_id));
        SearchView searchView2 = this.f22752OooooOO;
        if (searchView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView2 = null;
        }
        searchView2.setEditFocusListener(x2.f44339Oooo0o);
        SearchView searchView3 = this.f22752OooooOO;
        if (searchView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView3 = null;
        }
        searchView3.setSearchTextChangedListener(new y2(this));
        SearchView searchView4 = this.f22752OooooOO;
        if (searchView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView4 = null;
        }
        searchView4.setSearchClickListener(new z2(this));
        p188o00o00o0.OooO0OO<RoomBanEnterUser> oooO0OO4 = this.f22751OooooO0;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO4 = null;
        }
        jg jgVar3 = this.f22753OooooOo;
        if (jgVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("header");
        } else {
            jgVar = jgVar3;
        }
        oooO0OO4.setHeaderView(jgVar.f49796OooO00o);
        OooOoo0();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, p140o00OOOoO.OooO0o
    public final void onEventMainThread(@Nullable p140o00OOOoO.OooO0OO<?> oooO0OO) {
        super.onEventMainThread(oooO0OO);
        if (oooO0OO != null && oooO0OO.f31885OooO00o == 10068) {
            OooOoo0();
        }
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.f22752OooooOO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
        }
        SearchView searchView = this.f22752OooooOO;
        SearchView searchView2 = null;
        if (searchView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            searchView = null;
        }
        if (searchView.getEditSearch() != null) {
            SearchView searchView3 = this.f22752OooooOO;
            if (searchView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSearchView");
            } else {
                searchView2 = searchView3;
            }
            EditText editSearch = searchView2.getEditSearch();
            Oooo000.o00O0O.OooO00o(editSearch, ViewHierarchyConstants.VIEW_KEY, "view.context").hideSoftInputFromWindow(editSearch.getWindowToken(), 0, new KeyBoardUtil$hideKeyboard$1(o000O0Oo.OooO00o(editSearch, "view.context"), new Handler()));
        }
    }
}
