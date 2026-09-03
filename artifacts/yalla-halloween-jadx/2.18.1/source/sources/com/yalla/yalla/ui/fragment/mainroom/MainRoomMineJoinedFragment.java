package com.yalla.yalla.ui.fragment.mainroom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.adapter.room.RoomBaseAdapter;
import com.app.base.model.CommonParseMultiListModel;
import com.app.base.model.RoomIndexModel;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o0O0O00.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.oo0o0O0;
import p143o00OOooo.oo0oOO0;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.oo0o0Oo;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p617o0oo0o.o00000OO;
import p649o0ooOOoo.fb;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\"\u0010#J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\u0006\u0010\u0011\u001a\u00020\u0003R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\"\u0010\u001c\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineJoinedFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/fb;", "", "initView", "moreLoad", "freshLoad", "", "isRefresh", "load", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "scroolToTop", "Landroid/view/View;", "rootView", "Landroid/view/View;", "Lcom/app/base/adapter/room/RoomBaseAdapter;", "Lcom/app/base/model/RoomIndexModel;", "baseAdapter", "Lcom/app/base/adapter/room/RoomBaseAdapter;", "", "pageIndex", "I", "needReInit", "Z", "getNeedReInit", "()Z", "setNeedReInit", "(Z)V", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainRoomMineJoinedFragment extends p503o0o00o00.OooO<fb> {
    public static final int $stable = 8;

    @Nullable
    private RoomBaseAdapter<RoomIndexModel> baseAdapter;
    private boolean needReInit;
    private int pageIndex = 1;
    private View rootView;

    public static final class OooO00o extends o00Oo0 {
        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o0O00000.OooO0OO("Room_joined_gofindrooms");
            LiveEventBus.get("MAIN_ROOM_PAGE").post(1);
        }
    }

    public static final class OooO0O0 extends o00Oo0 {
        public OooO0O0() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            RoomBaseAdapter roomBaseAdapter = MainRoomMineJoinedFragment.this.baseAdapter;
            Intrinsics.checkNotNull(roomBaseAdapter);
            roomBaseAdapter.setFirstLoading(true);
            MainRoomMineJoinedFragment.this.freshLoad();
        }
    }

    public static final class OooO0OO extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ boolean f24445OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ MainRoomMineJoinedFragment f24446OooO0O0;

        public static final class OooO00o extends o00000O0<CommonParseMultiListModel<RoomIndexModel>> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0OO(boolean z, MainRoomMineJoinedFragment mainRoomMineJoinedFragment, Context context) {
            super(context);
            this.f24445OooO00o = z;
            this.f24446OooO0O0 = mainRoomMineJoinedFragment;
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.onError(code2, message);
            this.f24446OooO0O0.getBinding().f49360OooO0OO.Oooo0OO(this.f24445OooO00o, false);
            RoomBaseAdapter roomBaseAdapter = this.f24446OooO0O0.baseAdapter;
            if (roomBaseAdapter != null) {
                roomBaseAdapter.setLoadComplete(Boolean.valueOf(this.f24445OooO00o), Boolean.FALSE, Boolean.TRUE);
            }
        }

        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Object objOooO0OO = o0Oo0oo.OooO0OO(response, new OooO00o().getType());
            Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(response, objec…IndexModel?>?>() {}.type)");
            CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) objOooO0OO;
            if (this.f24445OooO00o) {
                RoomBaseAdapter roomBaseAdapter = this.f24446OooO0O0.baseAdapter;
                if (roomBaseAdapter != null) {
                    roomBaseAdapter.setNewData(commonParseMultiListModel.data);
                }
            } else {
                RoomBaseAdapter roomBaseAdapter2 = this.f24446OooO0O0.baseAdapter;
                if (roomBaseAdapter2 != null) {
                    roomBaseAdapter2.OooO0OO(commonParseMultiListModel.data);
                }
                RoomBaseAdapter roomBaseAdapter3 = this.f24446OooO0O0.baseAdapter;
                if (roomBaseAdapter3 != null) {
                    roomBaseAdapter3.addData(commonParseMultiListModel.data);
                }
            }
            MainRoomMineJoinedFragment mainRoomMineJoinedFragment = this.f24446OooO0O0;
            boolean z = true;
            int i = commonParseMultiListModel.index + 1;
            commonParseMultiListModel.index = i;
            mainRoomMineJoinedFragment.pageIndex = i;
            this.f24446OooO0O0.getBinding().f49360OooO0OO.Oooo0OO(this.f24445OooO00o, true);
            RoomBaseAdapter roomBaseAdapter4 = this.f24446OooO0O0.baseAdapter;
            if (roomBaseAdapter4 != null) {
                Boolean boolValueOf = Boolean.valueOf(this.f24445OooO00o);
                Boolean bool = Boolean.TRUE;
                Collection collection = commonParseMultiListModel.data;
                if (collection != null && !collection.isEmpty()) {
                    z = false;
                }
                roomBaseAdapter4.setLoadComplete(boolValueOf, bool, Boolean.valueOf(z));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void freshLoad() {
        this.pageIndex = 1;
        load(true);
    }

    private final void initView() {
        getBinding().f49360OooO0OO.setOnRefreshListener(new com.facebook.OooOO0(this, 5));
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter = new RoomBaseAdapter<>(getActivity(), R.layout.item_room_related);
        this.baseAdapter = roomBaseAdapter;
        roomBaseAdapter.f11362OooO0Oo = EnterRoomParentPage.Related_joined;
        roomBaseAdapter.f11360OooO0O0 = RoomBaseAdapter.PageSource.RoomRelatedJoinedFragment;
        roomBaseAdapter.setEmptyImageRes(R.drawable.ic_empty_room);
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter2 = this.baseAdapter;
        if (roomBaseAdapter2 != null) {
            roomBaseAdapter2.setEmptyText(R.string.nodata_join_room);
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter3 = this.baseAdapter;
        if (roomBaseAdapter3 != null) {
            roomBaseAdapter3.setEmptyButtonText(R.string.find_rooms);
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter4 = this.baseAdapter;
        if (roomBaseAdapter4 != null) {
            roomBaseAdapter4.setHeaderAndEmpty(true);
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter5 = this.baseAdapter;
        if (roomBaseAdapter5 != null) {
            roomBaseAdapter5.setOnLoadMoreListener(new o0O0O0o0.OooO0OO(this, 8), getBinding().f49359OooO0O0);
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter6 = this.baseAdapter;
        if (roomBaseAdapter6 != null) {
            roomBaseAdapter6.setOnEmptyClickListener(new OooO00o());
        }
        RoomBaseAdapter<RoomIndexModel> roomBaseAdapter7 = this.baseAdapter;
        if (roomBaseAdapter7 != null) {
            roomBaseAdapter7.setLoadErrorClickListener(new OooO0O0());
        }
        getBinding().f49359OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f49359OooO0O0.setAdapter(this.baseAdapter);
        o00000OO o00000oo2 = o00000OO.f48476OooO00o;
        RecyclerView recyclerView = getBinding().f49359OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMainRelated");
        o00000OO.OooO00o(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m471initView$lambda2(MainRoomMineJoinedFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p034OoooO0O.o0Oo0oo.OooO0o0(158, null);
        this$0.freshLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m472initView$lambda3(MainRoomMineJoinedFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.moreLoad();
    }

    private final void load(boolean isRefresh) {
        o00oO0o o00oo0o2 = p153o00Oo0oO.o00000OO.f32207OooO00o;
        oo0o0Oo oo0o0oo = p153o00Oo0oO.o00000OO.f32210OooO0Oo;
        String strOooO00o = o0ooOOo.OooO00o(new StringBuilder(), this.pageIndex, "");
        OooO0OO oooO0OO = new OooO0OO(isRefresh, this, getContext());
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("pageindex", strOooO00o);
        mapOooO0O0.put("pagesize", "15");
        p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, p153o00Oo0oO.o0ooOOo.f32244OooOoo, p153o00Oo0oO.o0ooOOo.f32246OooOooO, mapOooO0O0, oooO0OO);
    }

    private final void moreLoad() {
        load(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLazyInit$lambda-0, reason: not valid java name */
    public static final void m473onLazyInit$lambda0(MainRoomMineJoinedFragment this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            this$0.freshLoad();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLazyInit$lambda-1, reason: not valid java name */
    public static final void m474onLazyInit$lambda1(MainRoomMineJoinedFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getIsLazyInit()) {
            this$0.getBinding().f49359OooO0O0.scrollToPosition(0);
            this$0.getBinding().f49360OooO0OO.OooO();
            this$0.freshLoad();
        }
    }

    public final boolean getNeedReInit() {
        return this.needReInit;
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        this.needReInit = false;
        initView();
        freshLoad();
        OooOOO.f41216OooO00o.OooOooO().observe(this, new oo0oOO0(this, 9));
        LiveEventBus.get("JoinOrFollowRoom_Update").observe(this, new oo0o0O0(this, 4));
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0O00000.OooO0OO("Room_related_joined");
        if (this.needReInit && getIsLazyInit()) {
            this.needReInit = false;
            initView();
            freshLoad();
        }
    }

    public final void scroolToTop() {
        getBinding().f49359OooO0O0.scrollToPosition(0);
        getBinding().f49360OooO0OO.Oooo00o();
    }

    public final void setNeedReInit(boolean z) {
        this.needReInit = z;
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public fb getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        fb fbVarInflate = fb.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(fbVarInflate, "inflate(inflater, container, false)");
        return fbVarInflate;
    }
}
