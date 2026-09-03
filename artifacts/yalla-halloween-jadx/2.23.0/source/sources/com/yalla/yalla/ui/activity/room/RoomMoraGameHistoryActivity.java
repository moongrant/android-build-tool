package com.yalla.yalla.ui.activity.room;

import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.base.activity.BaseFragmentActivity;
import com.yalla.yalla.model.MoraHistoryModel;
import com.yalla.yalla.model.MoraHistoryModelList;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p640o0ooOOO0.oO00o000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomMoraGameHistoryActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class RoomMoraGameHistoryActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f26615OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public XRefreshLayout f26619OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public o00O000o f26624OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public RecyclerView f26625OooOoO0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final String f26617OooOOo0 = com.code.android.util.o0000.OooO0OO(oO00OOo0.valid);

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final String f26616OooOOo = com.code.android.util.o0000.OooO0OO(oO00OOo0.Expired);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final String f26618OooOOoo = com.code.android.util.o0000.OooO0OO(oO00OOo0.Lost);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final String f26621OooOo00 = com.code.android.util.o0000.OooO0OO(oO00OOo0.Win);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final String f26620OooOo0 = com.code.android.util.o0000.OooO0OO(oO00OOo0.tie);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f26622OooOo0O = new ArrayList();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public String f26623OooOo0o = "";

    public final void OooOo0(final boolean z) {
        String str = this.f26623OooOo0o;
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity$getHistoryMoreData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.f26627OooO0o0);
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@Nullable String str2, @Nullable String str3) {
                super.OooO0O0(str2, str3);
                RoomMoraGameHistoryActivity roomMoraGameHistoryActivity = this.f26627OooO0o0;
                XRefreshLayout xRefreshLayout = roomMoraGameHistoryActivity.f26619OooOo;
                if (xRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
                    xRefreshLayout = null;
                }
                xRefreshLayout.OooOoo(z);
                o00O000o o00o000o2 = roomMoraGameHistoryActivity.f26624OooOoO;
                if (o00o000o2 != null) {
                    o00o000o2.OooOoo();
                }
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@Nullable String str2) {
                MoraHistoryModelList moraHistoryModelList = (MoraHistoryModelList) oOo00OO0.OooO0O0(str2, new TypeToken<MoraHistoryModelList<MoraHistoryModel>>() { // from class: com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity$getHistoryMoreData$1$onFinish$results$1
                }.getType());
                XRefreshLayout xRefreshLayout = null;
                List data = moraHistoryModelList != null ? moraHistoryModelList.getData() : null;
                boolean z2 = data == null || data.isEmpty();
                boolean z3 = z;
                RoomMoraGameHistoryActivity roomMoraGameHistoryActivity = this.f26627OooO0o0;
                if (z2) {
                    XRefreshLayout xRefreshLayout2 = roomMoraGameHistoryActivity.f26619OooOo;
                    if (xRefreshLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
                    } else {
                        xRefreshLayout = xRefreshLayout2;
                    }
                    xRefreshLayout.OooOooo(z3, true, true);
                    o00O000o o00o000o2 = roomMoraGameHistoryActivity.f26624OooOoO;
                    if (o00o000o2 != null) {
                        o00o000o2.Oooo00o();
                        return;
                    }
                    return;
                }
                if (z3) {
                    o00O000o o00o000o3 = roomMoraGameHistoryActivity.f26624OooOoO;
                    if (o00o000o3 != null) {
                        o00o000o3.OooOoO0(moraHistoryModelList.getData());
                    }
                } else {
                    o00O000o o00o000o4 = roomMoraGameHistoryActivity.f26624OooOoO;
                    if (o00o000o4 != null) {
                        o00o000o4.OooO0O0(moraHistoryModelList.getData());
                    }
                }
                XRefreshLayout xRefreshLayout3 = roomMoraGameHistoryActivity.f26619OooOo;
                if (xRefreshLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
                    xRefreshLayout3 = null;
                }
                xRefreshLayout3.OooOooo(z3, true, moraHistoryModelList.getData().size() < Integer.parseInt("15"));
                o00O000o o00o000o5 = roomMoraGameHistoryActivity.f26624OooOoO;
                if (o00o000o5 != null) {
                    o00o000o5.Oooo00o();
                }
                String createTime = ((MoraHistoryModel) moraHistoryModelList.getData().get(moraHistoryModelList.getData().size() - 1)).getCreateTime();
                Intrinsics.checkNotNullExpressionValue(createTime, "results.data[results.data.size - 1].createTime");
                roomMoraGameHistoryActivity.f26623OooOo0o = createTime;
                p480o0o000Oo.o0OOO0o o0ooo0oOooO0O0 = com.android.billingclient.api.o0000OO0.OooO0O0();
                p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
                o0ooo0oOooO0O0.OooO0o0(p464o0Oooo.o000000O.OooOOo0().getValue() + "MORA_RED_POINT", null);
                LiveEventBus.get("MORA_RED_POINT").post(null);
            }
        };
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("pagesize", String.valueOf(15));
        linkedHashMapOooO00o.put("timestr", str);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p377o0OOoOo.o0000O.f44100OooOoo, p377o0OOoOo.o0000O.f44141o00000OO, linkedHashMapOooO00o, oooO0O0);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(oO00OO0O.activity_room_mora_game_history);
        View viewFindViewById = findViewById(oO00O0oO.mora_history_pullToRefreshView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(R.id.mora_history_pullToRefreshView)");
        this.f26619OooOo = (XRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(oO00O0oO.mora_history_coin_list_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(R.id.mora_history_coin_list_view)");
        this.f26625OooOoO0 = (RecyclerView) viewFindViewById2;
        ArrayList arrayList = this.f26622OooOo0O;
        arrayList.add(this.f26617OooOOo0);
        arrayList.add(this.f26616OooOOo);
        arrayList.add(this.f26621OooOo00);
        arrayList.add(this.f26620OooOo0);
        arrayList.add(this.f26618OooOOoo);
        OooOo00(com.code.android.util.o0000.OooO0OO(oO00OOo0.button_myleceived));
        XRefreshLayout xRefreshLayout = this.f26619OooOo;
        RecyclerView recyclerView = null;
        if (xRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
            xRefreshLayout = null;
        }
        xRefreshLayout.setOnRefreshListener(new p203o00o0o0o.o00OO0O0(this));
        XRefreshLayout xRefreshLayout2 = this.f26619OooOo;
        if (xRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
            xRefreshLayout2 = null;
        }
        xRefreshLayout2.setOnLoadMoreListener(new p562o0oOo0O.o000oOoO() { // from class: com.yalla.yalla.ui.activity.room.o00O000
            @Override // p562o0oOo0O.o000oOoO
            public final void OooO0O0() {
                int i = RoomMoraGameHistoryActivity.f26615OooOoOO;
                RoomMoraGameHistoryActivity this$0 = this.f26859OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.OooOo0(false);
            }
        });
        o00O000o o00o000o2 = new o00O000o(this, oO00OO0O.activity_mora_history_item);
        this.f26624OooOoO = o00o000o2;
        o00o000o2.OooOooo(p584o0oOooO0.oOo00OO0.ic_empty_delete);
        o00O000o o00o000o3 = this.f26624OooOoO;
        if (o00o000o3 != null) {
            o00o000o3.Oooo000(oO00OOo0.no_mora_history);
        }
        o00O000o o00o000o4 = this.f26624OooOoO;
        if (o00o000o4 != null) {
            o00o000o4.Oooo0OO(new o00O00(this));
        }
        RecyclerView recyclerView2 = this.f26625OooOoO0;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moraHistoryCoinListView");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView3 = this.f26625OooOoO0;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moraHistoryCoinListView");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.setAdapter(this.f26624OooOoO);
        this.f26623OooOo0o = "";
        OooOo0(true);
    }
}
