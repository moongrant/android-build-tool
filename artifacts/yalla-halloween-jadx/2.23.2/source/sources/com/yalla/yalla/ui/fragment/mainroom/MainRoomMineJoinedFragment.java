package com.yalla.yalla.ui.fragment.mainroom;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.oo000o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.media3.session.o0000O0;
import androidx.media3.session.o0000O0O;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
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
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p405o0Oo0OOO.oO00OOO;
import p426o0OoO0o0.OooOOOO;
import p448o0OoOoo.o0O0ooO;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p527o0o0OO0o.o000O;
import p545o0oO0O00.OooOo00;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p590o0oOooo0.oOOO00;
import p590o0oOooo0.oo000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0006\u0010\u0011\u001a\u00020\u0003R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineJoinedFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/oO00OOO;", "", "initView", "moreLoad", "freshLoad", "", "isRefresh", "load", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "scroolToTop", "Landroid/view/View;", "rootView", "Landroid/view/View;", "Lcom/yalla/yalla/ui/adapter/room/RoomBaseAdapter;", "Lcom/yalla/yalla/model/room/RoomIndexModel;", "baseAdapter", "Lcom/yalla/yalla/ui/adapter/room/RoomBaseAdapter;", "", "pageIndex", "I", "needReInit", "Z", "getNeedReInit", "()Z", "setNeedReInit", "(Z)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MainRoomMineJoinedFragment extends o000O<oO00OOO> {
    public static final int $stable = 8;

    @Nullable
    private RoomBaseAdapter<RoomIndexModel> baseAdapter;
    private boolean needReInit;
    private int pageIndex = 1;
    private View rootView;

    public static final class OooO00o extends o0OOOO0o {
        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0oo0000.OooO00o.OooO0O0("101029");
            LiveEventBus.get("MAIN_ROOM_PAGE").post(1);
        }
    }

    public static final class OooO0O0 extends o0OOOO0o {
        public OooO0O0() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
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
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            if (bool2.booleanValue()) {
                MainRoomMineJoinedFragment.this.freshLoad();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27963OooO0Oo;

        public OooO0o(OooO0OO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27963OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27963OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27963OooO0Oo;
        }

        public final int hashCode() {
            return this.f27963OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27963OooO0Oo.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void freshLoad() {
        this.pageIndex = 1;
        load(true);
    }

    private final void initView() {
        getBinding().f44809OooO0OO.setOnRefreshListener(new o0000O0(this, 2));
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter = new RoomBaseAdapter<>(getActivity(), oo0o0Oo.item_room_related);
        this.baseAdapter = roomBaseAdapter;
        roomBaseAdapter.f27242OooOooo = EnterRoomParentPage.Related_joined;
        roomBaseAdapter.f27239OooOoo = RoomBaseAdapter.PageSource.RoomRelatedJoinedFragment;
        roomBaseAdapter.OooOooo(o0Oo0oo.ic_empty_room);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter2 = this.baseAdapter;
        if (roomBaseAdapter2 != null) {
            roomBaseAdapter2.Oooo000(o000000.nodata_join_room);
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter3 = this.baseAdapter;
        if (roomBaseAdapter3 != null) {
            roomBaseAdapter3.f56424OooOoO.setEmptyButtonText(o000000.find_rooms);
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter4 = this.baseAdapter;
        if (roomBaseAdapter4 != null) {
            roomBaseAdapter4.OooOo0o();
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter5 = this.baseAdapter;
        if (roomBaseAdapter5 != null) {
            roomBaseAdapter5.OooOoO(new o0000O0O(this), getBinding().f44808OooO0O0);
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter6 = this.baseAdapter;
        if (roomBaseAdapter6 != null) {
            roomBaseAdapter6.f56424OooOoO.setOnEmptyClickListener(new OooO00o());
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter7 = this.baseAdapter;
        if (roomBaseAdapter7 != null) {
            roomBaseAdapter7.Oooo0OO(new OooO0O0());
        }
        getBinding().f44808OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f44808OooO0O0.setAdapter(this.baseAdapter);
        oo000000 oo000000Var = oo000000.f57240OooO00o;
        RecyclerView rvMainRelated = getBinding().f44808OooO0O0;
        Intrinsics.checkNotNullExpressionValue(rvMainRelated, "rvMainRelated");
        oo000000.OooO0O0(rvMainRelated);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MainRoomMineJoinedFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OooOo00.OooO0O0(158, null);
        this$0.freshLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(MainRoomMineJoinedFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.moreLoad();
    }

    private final void load(final boolean isRefresh) {
        o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
        String strOooO00o = oo000o.OooO00o(this.pageIndex);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(getContext()) { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment.load.1
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@NotNull String code, @NotNull String message) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                super.OooO0O0(code, message);
                MainRoomMineJoinedFragment mainRoomMineJoinedFragment = this;
                XRefreshLayout xRefreshLayout = mainRoomMineJoinedFragment.getBinding().f44809OooO0OO;
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
                Object objOooO0O0 = oOOO00.OooO0O0(response, new TypeToken<CommonParseMultiListModel<RoomIndexModel>>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineJoinedFragment$load$1$onFinish$result$1
                }.getType());
                Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(...)");
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
                mainRoomMineJoinedFragment.getBinding().f44809OooO0OO.OooOooO(z, true);
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
        LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("pageindex", strOooO00o);
        linkedHashMapOooO00o.put("pagesize", "15");
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43361OooOooO, linkedHashMapOooO00o, oooO0O0);
    }

    private final void moreLoad() {
        load(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLazyInit$lambda$0(MainRoomMineJoinedFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getIsLazyInit()) {
            this$0.getBinding().f44808OooO0O0.scrollToPosition(0);
            this$0.getBinding().f44809OooO0OO.OooO();
            this$0.freshLoad();
        }
    }

    public final boolean getNeedReInit() {
        return this.needReInit;
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        this.needReInit = false;
        initView();
        freshLoad();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooOo0O().observe(this, new OooO0o(new OooO0OO()));
        LiveEventBus.get("JoinOrFollowRoom_Update").observe(this, new o0O0ooO(this, 1));
    }

    @Override // p527o0o0OO0o.o000O, p586o0oOooO0.oO0Oo0o0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0oo0000.OooO00o.OooO0O0("201001");
        if (this.needReInit && getIsLazyInit()) {
            this.needReInit = false;
            initView();
            freshLoad();
        }
    }

    public final void scroolToTop() {
        getBinding().f44808OooO0O0.scrollToPosition(0);
        getBinding().f44809OooO0OO.OooOoOO();
    }

    public final void setNeedReInit(boolean z) {
        this.needReInit = z;
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oO00OOO getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oO00OOO oo00oooInflate = oO00OOO.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(oo00oooInflate, "inflate(...)");
        return oo00oooInflate;
    }
}
