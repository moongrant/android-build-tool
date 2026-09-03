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
import p590o0oOooo0.oOOO00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/room/RoomMoraGameHistoryActivity;", "Lcom/yalla/yalla/base/activity/BaseFragmentActivity;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class RoomMoraGameHistoryActivity extends BaseFragmentActivity {

    /* JADX INFO: renamed from: OooOoOO, reason: collision with root package name */
    public static final /* synthetic */ int f26161OooOoOO = 0;

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public XRefreshLayout f26165OooOo;

    /* JADX INFO: renamed from: OooOoO, reason: collision with root package name */
    @Nullable
    public o0O0ooO f26170OooOoO;

    /* JADX INFO: renamed from: OooOoO0, reason: collision with root package name */
    public RecyclerView f26171OooOoO0;

    /* JADX INFO: renamed from: OooOOo0, reason: collision with root package name */
    @NotNull
    public final String f26163OooOOo0 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.valid);

    /* JADX INFO: renamed from: OooOOo, reason: collision with root package name */
    @NotNull
    public final String f26162OooOOo = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Expired);

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final String f26164OooOOoo = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Lost);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final String f26167OooOo00 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.Win);

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @NotNull
    public final String f26166OooOo0 = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.tie);

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f26168OooOo0O = new ArrayList();

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @NotNull
    public String f26169OooOo0o = "";

    public final void OooOo0(final boolean z) {
        String str = this.f26169OooOo0o;
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity$getHistoryMoreData$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(this.f26173OooO0o0);
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@Nullable String str2, @Nullable String str3) {
                super.OooO0O0(str2, str3);
                RoomMoraGameHistoryActivity roomMoraGameHistoryActivity = this.f26173OooO0o0;
                XRefreshLayout xRefreshLayout = roomMoraGameHistoryActivity.f26165OooOo;
                if (xRefreshLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
                    xRefreshLayout = null;
                }
                xRefreshLayout.OooOoo(z);
                o0O0ooO o0o0ooo = roomMoraGameHistoryActivity.f26170OooOoO;
                if (o0o0ooo != null) {
                    o0o0ooo.OooOoo();
                }
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@Nullable String str2) {
                MoraHistoryModelList moraHistoryModelList = (MoraHistoryModelList) oOOO00.OooO0O0(str2, new TypeToken<MoraHistoryModelList<MoraHistoryModel>>() { // from class: com.yalla.yalla.ui.activity.room.RoomMoraGameHistoryActivity$getHistoryMoreData$1$onFinish$results$1
                }.getType());
                XRefreshLayout xRefreshLayout = null;
                List data = moraHistoryModelList != null ? moraHistoryModelList.getData() : null;
                boolean z2 = data == null || data.isEmpty();
                boolean z3 = z;
                RoomMoraGameHistoryActivity roomMoraGameHistoryActivity = this.f26173OooO0o0;
                if (z2) {
                    XRefreshLayout xRefreshLayout2 = roomMoraGameHistoryActivity.f26165OooOo;
                    if (xRefreshLayout2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
                    } else {
                        xRefreshLayout = xRefreshLayout2;
                    }
                    xRefreshLayout.OooOooo(z3, true, true);
                    o0O0ooO o0o0ooo = roomMoraGameHistoryActivity.f26170OooOoO;
                    if (o0o0ooo != null) {
                        o0o0ooo.Oooo00o();
                        return;
                    }
                    return;
                }
                if (z3) {
                    o0O0ooO o0o0ooo2 = roomMoraGameHistoryActivity.f26170OooOoO;
                    if (o0o0ooo2 != null) {
                        o0o0ooo2.OooOoO0(moraHistoryModelList.getData());
                    }
                } else {
                    o0O0ooO o0o0ooo3 = roomMoraGameHistoryActivity.f26170OooOoO;
                    if (o0o0ooo3 != null) {
                        o0o0ooo3.OooO0O0(moraHistoryModelList.getData());
                    }
                }
                XRefreshLayout xRefreshLayout3 = roomMoraGameHistoryActivity.f26165OooOo;
                if (xRefreshLayout3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
                    xRefreshLayout3 = null;
                }
                xRefreshLayout3.OooOooo(z3, true, moraHistoryModelList.getData().size() < Integer.parseInt("15"));
                o0O0ooO o0o0ooo4 = roomMoraGameHistoryActivity.f26170OooOoO;
                if (o0o0ooo4 != null) {
                    o0o0ooo4.Oooo00o();
                }
                String createTime = ((MoraHistoryModel) moraHistoryModelList.getData().get(moraHistoryModelList.getData().size() - 1)).getCreateTime();
                Intrinsics.checkNotNullExpressionValue(createTime, "getCreateTime(...)");
                roomMoraGameHistoryActivity.f26169OooOo0o = createTime;
                p477o0o00.OooO0o oooO0oOooO00o = p269o00oooo0.o0O0oo0o.OooO00o();
                p475o0Ooooo0.o0O00oO0 o0o00oo1 = p475o0Ooooo0.o0O00oO0.f47936OooO00o;
                oooO0oOooO00o.OooO0o0(p475o0Ooooo0.o0O00oO0.OooOOo0().getValue() + "MORA_RED_POINT", null);
                LiveEventBus.get("MORA_RED_POINT").post(null);
            }
        };
        LinkedHashMap linkedHashMapOooO00o = p426o0OoO0o0.OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("pagesize", String.valueOf(15));
        linkedHashMapOooO00o.put("timestr", str);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, p384o0OOoo0O.Oooo0.f43359OooOoo, p384o0OOoo0O.Oooo0.f43400o00000OO, linkedHashMapOooO00o, oooO0O0);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(p562o0oOo000.oo0o0Oo.activity_room_mora_game_history);
        View viewFindViewById = findViewById(p562o0oOo000.o0OO00O.mora_history_pullToRefreshView);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById, "findViewById(...)");
        this.f26165OooOo = (XRefreshLayout) viewFindViewById;
        View viewFindViewById2 = findViewById(p562o0oOo000.o0OO00O.mora_history_coin_list_view);
        Intrinsics.checkNotNullExpressionValue(viewFindViewById2, "findViewById(...)");
        this.f26171OooOoO0 = (RecyclerView) viewFindViewById2;
        ArrayList arrayList = this.f26168OooOo0O;
        arrayList.add(this.f26163OooOOo0);
        arrayList.add(this.f26162OooOOo);
        arrayList.add(this.f26167OooOo00);
        arrayList.add(this.f26166OooOo0);
        arrayList.add(this.f26164OooOOoo);
        OooOo00(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.button_myleceived));
        XRefreshLayout xRefreshLayout = this.f26165OooOo;
        RecyclerView recyclerView = null;
        if (xRefreshLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
            xRefreshLayout = null;
        }
        xRefreshLayout.setOnRefreshListener(new androidx.compose.ui.graphics.colorspace.OooOOO(this));
        XRefreshLayout xRefreshLayout2 = this.f26165OooOo;
        if (xRefreshLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moraHistoryPullToRefreshView");
            xRefreshLayout2 = null;
        }
        xRefreshLayout2.setOnLoadMoreListener(new p045Oooooo.o0ooOOo(this));
        o0O0ooO o0o0ooo = new o0O0ooO(this, p562o0oOo000.oo0o0Oo.activity_mora_history_item);
        this.f26170OooOoO = o0o0ooo;
        o0o0ooo.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_delete);
        o0O0ooO o0o0ooo2 = this.f26170OooOoO;
        if (o0o0ooo2 != null) {
            o0o0ooo2.Oooo000(p562o0oOo000.o000000.no_mora_history);
        }
        o0O0ooO o0o0ooo3 = this.f26170OooOoO;
        if (o0o0ooo3 != null) {
            o0o0ooo3.Oooo0OO(new o00oOoo(this));
        }
        RecyclerView recyclerView2 = this.f26171OooOoO0;
        if (recyclerView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moraHistoryCoinListView");
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new FixLinearLayoutManager(this));
        RecyclerView recyclerView3 = this.f26171OooOoO0;
        if (recyclerView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("moraHistoryCoinListView");
        } else {
            recyclerView = recyclerView3;
        }
        recyclerView.setAdapter(this.f26170OooOoO);
        this.f26169OooOo0o = "";
        OooOo0(true);
    }
}
