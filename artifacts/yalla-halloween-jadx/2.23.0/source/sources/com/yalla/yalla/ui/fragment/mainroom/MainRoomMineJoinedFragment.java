package com.yalla.yalla.ui.fragment.mainroom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.squareup.okhttp.OooOo;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.CommonParseMultiListModel;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p426o0OoOO.o0OOO0o;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p486o0o00O00.o00Ooo;
import p508o0o0O.OooOO0O;
import p579o0oOoo.oO0OOO00;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p640o0ooOOO0.oO00o000;
import p641o0ooOOOO.m4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0006\u0010\u0011\u001a\u00020\u0003R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineJoinedFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/m4;", "", "initView", "moreLoad", "freshLoad", "", "isRefresh", "load", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "scroolToTop", "Landroid/view/View;", "rootView", "Landroid/view/View;", "Lcom/yalla/yalla/ui/adapter/room/RoomBaseAdapter;", "Lcom/yalla/yalla/model/room/RoomIndexModel;", "baseAdapter", "Lcom/yalla/yalla/ui/adapter/room/RoomBaseAdapter;", "", "pageIndex", "I", "needReInit", "Z", "getNeedReInit", "()Z", "setNeedReInit", "(Z)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class MainRoomMineJoinedFragment extends OooOO0O<m4> {
    public static final int $stable = 8;

    @Nullable
    private RoomBaseAdapter<RoomIndexModel> baseAdapter;
    private boolean needReInit;
    private int pageIndex = 1;
    private View rootView;

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28465OooO0Oo;

        public OooO(OooO0OO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28465OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28465OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28465OooO0Oo;
        }

        public final int hashCode() {
            return this.f28465OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28465OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO00o extends oo00o {
        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0OO000.OooO00o("101029");
            LiveEventBus.get("MAIN_ROOM_PAGE").post(1);
        }
    }

    public static final class OooO0O0 extends oo00o {
        public OooO0O0() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MainRoomMineJoinedFragment mainRoomMineJoinedFragment = MainRoomMineJoinedFragment.this;
            RoomBaseAdapter roomBaseAdapter = mainRoomMineJoinedFragment.baseAdapter;
            Intrinsics.checkNotNull(roomBaseAdapter);
            roomBaseAdapter.Oooo00O(true);
            mainRoomMineJoinedFragment.freshLoad();
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Boolean, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.booleanValue()) {
                MainRoomMineJoinedFragment.this.freshLoad();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements Observer<Object> {
        public OooO0o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            MainRoomMineJoinedFragment mainRoomMineJoinedFragment = MainRoomMineJoinedFragment.this;
            if (mainRoomMineJoinedFragment.getIsLazyInit()) {
                mainRoomMineJoinedFragment.getBinding().f58404OooO0O0.scrollToPosition(0);
                mainRoomMineJoinedFragment.getBinding().f58405OooO0OO.OooO();
                mainRoomMineJoinedFragment.freshLoad();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void freshLoad() {
        this.pageIndex = 1;
        load(true);
    }

    private final void initView() {
        getBinding().f58405OooO0OO.setOnRefreshListener(new o00Ooo(this, 1));
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter = new RoomBaseAdapter<>(getActivity(), oO00OO0O.item_room_related);
        this.baseAdapter = roomBaseAdapter;
        roomBaseAdapter.f27704OooOooo = EnterRoomParentPage.Related_joined;
        roomBaseAdapter.f27701OooOoo = RoomBaseAdapter.PageSource.RoomRelatedJoinedFragment;
        roomBaseAdapter.OooOooo(oOo00OO0.ic_empty_room);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter2 = this.baseAdapter;
        if (roomBaseAdapter2 != null) {
            roomBaseAdapter2.Oooo000(oO00OOo0.nodata_join_room);
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter3 = this.baseAdapter;
        if (roomBaseAdapter3 != null) {
            roomBaseAdapter3.f56197OooOoO.setEmptyButtonText(oO00OOo0.find_rooms);
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter4 = this.baseAdapter;
        if (roomBaseAdapter4 != null) {
            roomBaseAdapter4.OooOo0o();
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter5 = this.baseAdapter;
        if (roomBaseAdapter5 != null) {
            roomBaseAdapter5.OooOoO(new o0000OO.OooO(this), getBinding().f58404OooO0O0);
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter6 = this.baseAdapter;
        if (roomBaseAdapter6 != null) {
            roomBaseAdapter6.f56197OooOoO.setOnEmptyClickListener(new OooO00o());
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter7 = this.baseAdapter;
        if (roomBaseAdapter7 != null) {
            roomBaseAdapter7.Oooo0OO(new OooO0O0());
        }
        getBinding().f58404OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f58404OooO0O0.setAdapter(this.baseAdapter);
        oO0OOO00 oo0ooo00 = oO0OOO00.f56606OooO00o;
        RecyclerView recyclerView = getBinding().f58404OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMainRelated");
        oO0OOO00.OooO0O0(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MainRoomMineJoinedFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OooOo.OooO0OO(158, null);
        this$0.freshLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MainRoomMineJoinedFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.moreLoad();
    }

    private final void load(final boolean isRefresh) {
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        String strOooO00o = o0OOO0o.OooO00o(this.pageIndex);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(getContext()) { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment.load.1
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@NotNull String code, @NotNull String message) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                super.OooO0O0(code, message);
                MainRoomMineJoinedFragment mainRoomMineJoinedFragment = this;
                XRefreshLayout xRefreshLayout = mainRoomMineJoinedFragment.getBinding().f58405OooO0OO;
                boolean z = isRefresh;
                xRefreshLayout.OooOooO(z, false);
                RoomBaseAdapter roomBaseAdapter = mainRoomMineJoinedFragment.baseAdapter;
                if (roomBaseAdapter != null) {
                    roomBaseAdapter.Oooo0(Boolean.valueOf(z), Boolean.FALSE, Boolean.TRUE);
                }
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@NotNull String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                Object objOooO0O0 = p579o0oOoo.oOo00OO0.OooO0O0(response, new TypeToken<CommonParseMultiListModel<RoomIndexModel>>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment$load$1$onFinish$result$1
                }.getType());
                Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(response, objec…IndexModel?>?>() {}.type)");
                CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) objOooO0O0;
                MainRoomMineJoinedFragment mainRoomMineJoinedFragment = this;
                boolean z = isRefresh;
                if (z) {
                    RoomBaseAdapter roomBaseAdapter = mainRoomMineJoinedFragment.baseAdapter;
                    if (roomBaseAdapter != null) {
                        roomBaseAdapter.OooOoO0(commonParseMultiListModel.data);
                    }
                } else {
                    RoomBaseAdapter roomBaseAdapter2 = mainRoomMineJoinedFragment.baseAdapter;
                    if (roomBaseAdapter2 != null) {
                        roomBaseAdapter2.Oooo0oO(commonParseMultiListModel.data);
                    }
                    RoomBaseAdapter roomBaseAdapter3 = mainRoomMineJoinedFragment.baseAdapter;
                    if (roomBaseAdapter3 != null) {
                        roomBaseAdapter3.OooO0O0(commonParseMultiListModel.data);
                    }
                }
                boolean z2 = true;
                int i = commonParseMultiListModel.index + 1;
                commonParseMultiListModel.index = i;
                mainRoomMineJoinedFragment.pageIndex = i;
                mainRoomMineJoinedFragment.getBinding().f58405OooO0OO.OooOooO(z, true);
                RoomBaseAdapter roomBaseAdapter4 = mainRoomMineJoinedFragment.baseAdapter;
                if (roomBaseAdapter4 != null) {
                    Boolean boolValueOf = Boolean.valueOf(z);
                    Boolean bool = Boolean.TRUE;
                    Collection collection = commonParseMultiListModel.data;
                    if (collection != null && !collection.isEmpty()) {
                        z2 = false;
                    }
                    roomBaseAdapter4.Oooo0(boolValueOf, bool, Boolean.valueOf(z2));
                }
            }
        };
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("pageindex", strOooO00o);
        linkedHashMapOooO00o.put("pagesize", "15");
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44102OooOooO, linkedHashMapOooO00o, oooO0O0);
    }

    private final void moreLoad() {
        load(false);
    }

    public final boolean getNeedReInit() {
        return this.needReInit;
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        this.needReInit = false;
        initView();
        freshLoad();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOo0O().observe(this, new OooO(new OooO0OO()));
        LiveEventBus.get("JoinOrFollowRoom_Update").observe(this, new OooO0o());
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0OO000.OooO00o("201001");
        if (this.needReInit && getIsLazyInit()) {
            this.needReInit = false;
            initView();
            freshLoad();
        }
    }

    public final void scroolToTop() {
        getBinding().f58404OooO0O0.scrollToPosition(0);
        getBinding().f58405OooO0OO.OooOoOO();
    }

    public final void setNeedReInit(boolean z) {
        this.needReInit = z;
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public m4 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m4 m4VarInflate = m4.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(m4VarInflate, "inflate(inflater, container, false)");
        return m4VarInflate;
    }
}
