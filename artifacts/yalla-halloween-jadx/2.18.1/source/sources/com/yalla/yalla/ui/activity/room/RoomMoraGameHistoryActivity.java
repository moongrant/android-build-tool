package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o00000O;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.base.activity.BaseActivity;
import com.app.base.model.MoraHistoryModel;
import com.app.base.model.MoraHistoryModelList;
import com.app.base.view.pullrefresh.XRefreshLayout;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153o00Oo0oO.o0ooOOo;
import p160o00OoOO0.o00OO0O0;
import p254o00ooO0O.o000O0O0;
import p388o0OOooO.o00000O0;
import p544o0o0OoOO.o5;
import p544o0o0OoOO.p5;
import p544o0o0OoOO.q5;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomMoraGameHistoryActivity;", "Lcom/app/base/base/activity/BaseActivity;", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class RoomMoraGameHistoryActivity extends BaseActivity {

    /* JADX INFO: renamed from: OoooooO, reason: collision with root package name */
    @NotNull
    public static final OooO00o f22938OoooooO = new OooO00o();

    /* JADX INFO: renamed from: OoooOo0, reason: collision with root package name */
    @NotNull
    public final String f22939OoooOo0 = o000O0O0.OooO0OO(R.string.valid);

    /* JADX INFO: renamed from: OoooOoO, reason: collision with root package name */
    @NotNull
    public final String f22940OoooOoO = o000O0O0.OooO0OO(R.string.Expired);

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final String f22941OoooOoo = o000O0O0.OooO0OO(R.string.Lost);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final String f22942Ooooo00 = o000O0O0.OooO0OO(R.string.Win);

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @NotNull
    public final String f22943Ooooo0o = o000O0O0.OooO0OO(R.string.tie);

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final List<String> f22944OooooO0 = new ArrayList();

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @NotNull
    public String f22945OooooOO = "";

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public XRefreshLayout f22946OooooOo;

    /* JADX INFO: renamed from: Oooooo, reason: collision with root package name */
    @Nullable
    public p188o00o00o0.OooO0OO<MoraHistoryModel> f22947Oooooo;

    /* JADX INFO: renamed from: Oooooo0, reason: collision with root package name */
    public RecyclerView f22948Oooooo0;

    public static final class OooO00o {
    }

    public static final class OooO0O0 extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ boolean f22950OooO0O0;

        public static final class OooO00o extends o00000O0<MoraHistoryModelList<MoraHistoryModel>> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z) {
            super(RoomMoraGameHistoryActivity.this);
            this.f22950OooO0O0 = z;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@Nullable String str, @Nullable String str2) {
            super.onError(str, str2);
            XRefreshLayout xRefreshLayout = RoomMoraGameHistoryActivity.this.f22946OooooOo;
            if (xRefreshLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
                xRefreshLayout = null;
            }
            xRefreshLayout.Oooo0O0(this.f22950OooO0O0);
            p188o00o00o0.OooO0OO<MoraHistoryModel> oooO0OO = RoomMoraGameHistoryActivity.this.f22947Oooooo;
            if (oooO0OO != null) {
                oooO0OO.loadError();
            }
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@Nullable String str) {
            super.onFinish(str);
            MoraHistoryModelList moraHistoryModelList = (MoraHistoryModelList) o0Oo0oo.OooO0OO(str, new OooO00o().getType());
            XRefreshLayout xRefreshLayout = null;
            List data = moraHistoryModelList != null ? moraHistoryModelList.getData() : null;
            if (data == null || data.isEmpty()) {
                XRefreshLayout xRefreshLayout2 = RoomMoraGameHistoryActivity.this.f22946OooooOo;
                if (xRefreshLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
                } else {
                    xRefreshLayout = xRefreshLayout2;
                }
                xRefreshLayout.Oooo0o0(this.f22950OooO0O0, true, true);
                p188o00o00o0.OooO0OO<MoraHistoryModel> oooO0OO = RoomMoraGameHistoryActivity.this.f22947Oooooo;
                if (oooO0OO != null) {
                    oooO0OO.setLoadComplete();
                    return;
                }
                return;
            }
            if (this.f22950OooO0O0) {
                p188o00o00o0.OooO0OO<MoraHistoryModel> oooO0OO2 = RoomMoraGameHistoryActivity.this.f22947Oooooo;
                if (oooO0OO2 != null) {
                    oooO0OO2.setNewData(moraHistoryModelList.getData());
                }
            } else {
                p188o00o00o0.OooO0OO<MoraHistoryModel> oooO0OO3 = RoomMoraGameHistoryActivity.this.f22947Oooooo;
                if (oooO0OO3 != null) {
                    oooO0OO3.addData(moraHistoryModelList.getData());
                }
            }
            XRefreshLayout xRefreshLayout3 = RoomMoraGameHistoryActivity.this.f22946OooooOo;
            if (xRefreshLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
                xRefreshLayout3 = null;
            }
            xRefreshLayout3.Oooo0o0(this.f22950OooO0O0, true, moraHistoryModelList.getData().size() < Integer.parseInt("15"));
            p188o00o00o0.OooO0OO<MoraHistoryModel> oooO0OO4 = RoomMoraGameHistoryActivity.this.f22947Oooooo;
            if (oooO0OO4 != null) {
                oooO0OO4.setLoadComplete();
            }
            RoomMoraGameHistoryActivity roomMoraGameHistoryActivity = RoomMoraGameHistoryActivity.this;
            String createTime = ((MoraHistoryModel) moraHistoryModelList.getData().get(moraHistoryModelList.getData().size() - 1)).getCreateTime();
            Intrinsics.checkNotNullExpressionValue(createTime, "results.data[results.data.size - 1].createTime");
            roomMoraGameHistoryActivity.f22945OooooOO = createTime;
            o00000O.OooO0O0().OooO0oO(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOo().getValue() + "MORA_RED_POINT", null);
            LiveEventBus.get("MORA_RED_POINT").post(null);
        }
    }

    public final void OooOoO(boolean z) {
        String str = this.f22945OooooOO;
        OooO0O0 oooO0O0 = new OooO0O0(z);
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("pagesize", String.valueOf(15));
        mapOooO0O0.put("timestr", str);
        o0ooOOo o0ooooo2 = o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, o0ooOOo.f32244OooOoo, o0ooOOo.f32289o00000oO, mapOooO0O0, oooO0O0);
    }

    public final void OooOoOO() {
        this.f22945OooooOO = "";
        OooOoO(true);
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.util.ArrayList, java.util.List<java.lang.String>] */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_room_mora_game_history);
        View viewFindViewById = findViewById(R.id.mora_history_pullToRefreshView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.mora_history_pullToRefreshView)");
        this.f22946OooooOo = (XRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.mora_history_coin_list_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.mora_history_coin_list_view)");
        this.f22948Oooooo0 = (RecyclerView) viewFindViewById2;
        this.f22944OooooO0.add(this.f22939OoooOo0);
        this.f22944OooooO0.add(this.f22940OoooOoO);
        this.f22944OooooO0.add(this.f22942Ooooo00);
        this.f22944OooooO0.add(this.f22943Ooooo0o);
        this.f22944OooooO0.add(this.f22941OoooOoo);
        OooOoO0(o000O0O0.OooO0OO(R.string.button_myleceived));
        XRefreshLayout xRefreshLayout = this.f22946OooooOo;
        RecyclerView recyclerView = null;
        if (xRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
            xRefreshLayout = null;
        }
        xRefreshLayout.setOnRefreshListener(new o5(this));
        XRefreshLayout xRefreshLayout2 = this.f22946OooooOo;
        if (xRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
            xRefreshLayout2 = null;
        }
        xRefreshLayout2.setOnLoadMoreListener(new p186o00o00Oo.o0ooOOo() { // from class: o0o0OoOO.n5
            @Override // p186o00o00Oo.o0ooOOo
            public final void OooO0oO() {
                RoomMoraGameHistoryActivity this$0 = this.f44276OooO0Oo;
                RoomMoraGameHistoryActivity.OooO00o oooO00o = RoomMoraGameHistoryActivity.f22938OoooooO;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOoO(false);
            }
        });
        p5 p5Var = new p5(this);
        this.f22947Oooooo = p5Var;
        p5Var.setEmptyImageRes(R.drawable.ic_empty_delete);
        p188o00o00o0.OooO0OO<MoraHistoryModel> oooO0OO = this.f22947Oooooo;
        if (oooO0OO != null) {
            oooO0OO.setEmptyText(R.string.no_mora_history);
        }
        p188o00o00o0.OooO0OO<MoraHistoryModel> oooO0OO2 = this.f22947Oooooo;
        if (oooO0OO2 != null) {
            oooO0OO2.setLoadErrorClickListener(new q5(this));
        }
        RecyclerView recyclerView2 = this.f22948Oooooo0;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moraHistoryCoinListView");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView3 = this.f22948Oooooo0;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moraHistoryCoinListView");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.setAdapter(this.f22947Oooooo);
        OooOoOO();
    }
}
