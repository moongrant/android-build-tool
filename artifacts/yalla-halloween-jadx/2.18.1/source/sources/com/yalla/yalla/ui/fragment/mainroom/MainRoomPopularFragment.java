package com.yalla.yalla.ui.fragment.mainroom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.adapter.room.RoomBaseAdapter;
import com.app.base.model.CommonParseMultiListModel;
import com.app.base.model.RoomIndexModel;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.ui.view.MainRoomPopularTopView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o0O0O00.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.OooOOO0;
import p142o00OOooO.OooOOOO;
import p142o00OOooO.OooOo00;
import p153o00Oo0oO.o00oO0o;
import p160o00OoOO0.o00OO0O0;
import p381o0OOoOOO.o00O0;
import p388o0OOooO.o00000O0;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p498o0o00Oo0.o00O0O0O;
import p500o0o00Ooo.o0000Ooo;
import p524o0o0O0oO.o0O0O0O;
import p606o0oo0O.OooOo;
import p617o0oo0o.o00000OO;
import p649o0ooOOoo.cb;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\u0016\u0010\u0014\u001a\u00020\u00032\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012H\u0016J\u0014\u0010\u0015\u001a\u00020\u00032\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0012H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006!"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomPopularFragment;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomBaseFragment;", "Lo0ooOOoo/cb;", "", "initView", "moreLoad", "freshLoad", "", "isRefresh", "load", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "onPause", "Lo00OOOoO/OooO0OO;", "msg", "onEvent", "onEventMainThread", "scrollToTop", "", "pageIndex", "I", "Lcom/yalla/yalla/ui/view/MainRoomPopularTopView;", "mMainRoomPopularTopView", "Lcom/yalla/yalla/ui/view/MainRoomPopularTopView;", "isFirstApiStatistical", "Z", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainRoomPopularFragment extends MainRoomBaseFragment<cb> {
    public static final int $stable = 8;
    private boolean isFirstApiStatistical;

    @Nullable
    private o00OO0.OooO00o mAdapter;

    @Nullable
    private MainRoomPopularTopView mMainRoomPopularTopView;
    private int pageIndex = 1;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o00OO0.OooO00o oooO00o = MainRoomPopularFragment.this.mAdapter;
            Intrinsics.checkNotNull(oooO00o);
            oooO00o.setFirstLoading(true);
            MainRoomPopularFragment.this.freshLoad();
        }
    }

    public static final class OooO0O0 extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ boolean f24448OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ MainRoomPopularFragment f24449OooO0O0;

        public static final class OooO00o extends o00000O0<CommonParseMultiListModel<RoomIndexModel>> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, MainRoomPopularFragment mainRoomPopularFragment, Context context) {
            super(context);
            this.f24448OooO00o = z;
            this.f24449OooO0O0 = mainRoomPopularFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.onError(code2, message);
            ((cb) this.f24449OooO0O0.getBinding()).f49090OooO0OO.Oooo0OO(this.f24448OooO00o, false);
            o00OO0.OooO00o oooO00o = this.f24449OooO0O0.mAdapter;
            if (oooO00o != null) {
                oooO00o.setLoadComplete(Boolean.valueOf(this.f24448OooO00o), Boolean.FALSE, Boolean.TRUE);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                Object objOooO0OO = o0Oo0oo.OooO0OO(response, new OooO00o().getType());
                Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(response, objec…IndexModel?>?>() {}.type)");
                CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) objOooO0OO;
                if (this.f24448OooO00o) {
                    o00OO0.OooO00o oooO00o = this.f24449OooO0O0.mAdapter;
                    if (oooO00o != null) {
                        oooO00o.setNewData(commonParseMultiListModel.data);
                    }
                } else {
                    o00OO0.OooO00o oooO00o2 = this.f24449OooO0O0.mAdapter;
                    if (oooO00o2 != null) {
                        oooO00o2.OooO0OO(commonParseMultiListModel.data);
                    }
                    o00OO0.OooO00o oooO00o3 = this.f24449OooO0O0.mAdapter;
                    if (oooO00o3 != null) {
                        oooO00o3.addData(commonParseMultiListModel.data);
                    }
                }
                int i = 1;
                this.f24449OooO0O0.pageIndex = commonParseMultiListModel.index + 1;
                ((cb) this.f24449OooO0O0.getBinding()).f49090OooO0OO.Oooo0OO(this.f24448OooO00o, true);
                o00OO0.OooO00o oooO00o4 = this.f24449OooO0O0.mAdapter;
                if (oooO00o4 != null) {
                    Boolean boolValueOf = Boolean.valueOf(this.f24448OooO00o);
                    Boolean bool = Boolean.TRUE;
                    Collection collection = commonParseMultiListModel.data;
                    oooO00o4.setLoadComplete(boolValueOf, bool, Boolean.valueOf(collection == null || collection.isEmpty()));
                }
                ((cb) this.f24449OooO0O0.getBinding()).f49089OooO0O0.postDelayed(new o00O0(this.f24449OooO0O0, commonParseMultiListModel, i), 300L);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void freshLoad() {
        this.pageIndex = 1;
        load(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((cb) getBinding()).f49090OooO0OO.setOnRefreshListener(new OooOOO0(this, 4));
        ((cb) getBinding()).f49090OooO0OO.f19537o000OOo = true;
        o00OO0.OooO00o oooO00o = new o00OO0.OooO00o(getContext());
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        MainRoomPopularTopView mainRoomPopularTopView = new MainRoomPopularTopView(fragmentActivityRequireActivity);
        oooO00o.setHeaderView(mainRoomPopularTopView);
        this.mMainRoomPopularTopView = mainRoomPopularTopView;
        RoomBaseAdapter.PageSource pageSource = RoomBaseAdapter.PageSource.RoomAllPopularFragment;
        int i = 5;
        oooO00o.f11361OooO0OO = new OooOOOO(this, i);
        oooO00o.f11360OooO0O0 = pageSource;
        oooO00o.setEmptyText(R.string.blank_ta_no_rooms);
        oooO00o.setEmptyImageRes(R.drawable.ic_empty_room);
        oooO00o.setHeaderAndEmpty(true);
        oooO00o.setLoadErrorClickListener(new OooO00o());
        oooO00o.setOnLoadMoreListener(new OooOo00(this, i), ((cb) getBinding()).f49089OooO0O0);
        this.mAdapter = oooO00o;
        ((cb) getBinding()).f49089OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        ((cb) getBinding()).f49089OooO0O0.setAdapter(this.mAdapter);
        o00000OO o00000oo2 = o00000OO.f48476OooO00o;
        RecyclerView recyclerView = ((cb) getBinding()).f49089OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMainAll");
        o00000OO.OooO00o(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m476initView$lambda1(MainRoomPopularFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.freshLoad();
        MainRoomPopularTopView mainRoomPopularTopView = this$0.mMainRoomPopularTopView;
        if (mainRoomPopularTopView != null) {
            mainRoomPopularTopView.OooO0O0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: initView$lambda-5$lambda-3, reason: not valid java name */
    public static final void m477initView$lambda5$lambda3(MainRoomPopularFragment fragment, RoomIndexModel data) {
        Intrinsics.checkNotNullParameter(fragment, "this$0");
        Intrinsics.checkNotNullParameter(data, "data");
        o0000Ooo.OooO00o oooO00oOooO0O0 = o0000Ooo.f41382OooO00o.OooO0O0(((cb) fragment.getBinding()).f49089OooO0O0);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = oooO00oOooO0O0.f41385OooO00o;
        int i2 = oooO00oOooO0O0.f41386OooO0O0;
        if (i <= i2) {
            while (true) {
                o00OO0.OooO00o oooO00o = fragment.mAdapter;
                Intrinsics.checkNotNull(oooO00o);
                if (oooO00o.getData().size() > i) {
                    o00OO0.OooO00o oooO00o2 = fragment.mAdapter;
                    Intrinsics.checkNotNull(oooO00o2);
                    arrayList.add(((RoomIndexModel) oooO00o2.getData().get(i)).barid);
                    o00OO0.OooO00o oooO00o3 = fragment.mAdapter;
                    Intrinsics.checkNotNull(oooO00o3);
                    arrayList2.add(((RoomIndexModel) oooO00o3.getData().get(i)).sessionId);
                }
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        String str = data.barid;
        Intrinsics.checkNotNullExpressionValue(str, "data.barid");
        if (str.length() > 0) {
            String roomId = data.barid;
            Intrinsics.checkNotNullExpressionValue(roomId, "data.barid");
            EnterRoomParentPage sourcePage = EnterRoomParentPage.AII_Popular;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new o00O0O0O(arrayList, arrayList2, roomId, sourcePage, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-5$lambda-4, reason: not valid java name */
    public static final void m478initView$lambda5$lambda4(MainRoomPopularFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.moreLoad();
    }

    private final void load(boolean isRefresh) {
        String value = OooOOO.f41216OooO00o.OooOo00().getValue();
        if (value == null || StringsKt.isBlank(value)) {
            return;
        }
        o00oO0o o00oo0o2 = p153o00Oo0oO.o00000OO.f32207OooO00o;
        p153o00Oo0oO.o00000OO.f32210OooO0Oo.OooO0O0(o0ooOOo.OooO00o(new StringBuilder(), this.pageIndex, ""), null, null, new OooO0O0(isRefresh, this, getContext()));
    }

    private final void moreLoad() {
        load(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLazyInit$lambda-0, reason: not valid java name */
    public static final void m479onLazyInit$lambda0(MainRoomPopularFragment this$0, Boolean bool) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.freshLoad();
    }

    @Override // p503o0o00o00.OooO, p140o00OOOoO.OooO0o
    public void onEvent(@Nullable p140o00OOOoO.OooO0OO<?> msg) {
    }

    @Override // p503o0o00o00.OooO, p140o00OOOoO.OooO0o
    public void onEventMainThread(@NotNull p140o00OOOoO.OooO0OO<?> msg) {
        o00OO0.OooO00o oooO00o;
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        if (getIsLazyInit()) {
            int i = msg.f31885OooO00o;
            if (i == 15 || i == 36 || i == 109) {
                freshLoad();
            } else {
                if (i != 575 || (oooO00o = this.mAdapter) == null || oooO00o == null) {
                    return;
                }
                oooO00o.OooO0o0();
            }
        }
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        OooOOO.f41216OooO00o.OooOooO().observe(this, new o0O0O0O(this, 7));
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MainRoomPopularTopView mainRoomPopularTopView = this.mMainRoomPopularTopView;
        if (mainRoomPopularTopView != null) {
            mainRoomPopularTopView.f24844Oooo0oO = false;
            mainRoomPopularTopView.f24851OoooOOO.f50354OooO0Oo.removeCallbacks(mainRoomPopularTopView.f24852OoooOOo);
        }
        o0O00000.OooO0o0("Room_popular_stay", getTimeLengthStr());
        OooOo.OooO0OO("401003", MapsKt.mapOf(new Pair("staytime", getTimeLengthStr())));
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MainRoomPopularTopView mainRoomPopularTopView = this.mMainRoomPopularTopView;
        if (mainRoomPopularTopView != null) {
            mainRoomPopularTopView.f24844Oooo0oO = true;
            if (mainRoomPopularTopView.f24842Oooo) {
                mainRoomPopularTopView.f24851OoooOOO.f50354OooO0Oo.removeCallbacks(mainRoomPopularTopView.f24852OoooOOo);
                mainRoomPopularTopView.f24851OoooOOO.f50354OooO0Oo.postDelayed(mainRoomPopularTopView.f24852OoooOOo, mainRoomPopularTopView.f24853o000oOoO);
            }
        }
        o0O00000.OooO0OO("Room_popular");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment
    public void scrollToTop() {
        super.scrollToTop();
        ((cb) getBinding()).f49089OooO0O0.scrollToPosition(0);
        if (((cb) getBinding()).f49090OooO0OO.getState() == RefreshState.None) {
            ((cb) getBinding()).f49090OooO0OO.OooO();
            ((cb) getBinding()).f49090OooO0OO.OooO0oo();
        }
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public cb getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        cb cbVarInflate = cb.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(cbVarInflate, "inflate(inflater, container, false)");
        return cbVarInflate;
    }
}
