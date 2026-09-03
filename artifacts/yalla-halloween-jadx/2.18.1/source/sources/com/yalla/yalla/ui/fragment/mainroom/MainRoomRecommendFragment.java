package com.yalla.yalla.ui.fragment.mainroom;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.recyclerview.widget.RecyclerView;
import com.android.billingclient.api.o0Oo0oo;
import com.app.base.adapter.room.RoomBaseAdapter;
import com.app.base.model.CommonParseMultiListModel;
import com.app.base.model.RoomIndexModel;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.event.webEvent.EnterRoomParentPage;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomRecommendFragment;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.youth.banner.Banner;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import o000O0O0.o00000O;
import o0O0O00.o0ooOOo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o000oOoO;
import p142o00OOooO.o00O0O;
import p142o00OOooO.o0OoOo0;
import p153o00Oo0oO.o00oO0o;
import p153o00Oo0oO.oo0o0Oo;
import p160o00OoOO0.o00OO0O0;
import p388o0OOooO.o00000O0;
import p391o0OOooOo.o0O00000;
import p466o0OooO0.o0000;
import p498o0o00Oo0.OooOOO;
import p498o0o00Oo0.o00O0O0O;
import p498o0o00Oo0.oo0oOO0;
import p500o0o00Ooo.o0000Ooo;
import p535o0o0OOoO.oO0o0000;
import p601o0oo00Oo.o00O0;
import p606o0oo0O.OooOo;
import p617o0oo0o.o00000OO;
import p649o0ooOOoo.bb;
import p654o0ooo.o00Oo0;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\u000f\u001a\u00020\u0003H\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0011\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\u0014\u0010\u0015\u001a\u00020\u00032\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013H\u0016R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomRecommendFragment;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomBaseFragment;", "Lo0ooOOoo/bb;", "", "initView", "moreLoad", "freshLoad", "", "isRefresh", "loadNewRoomData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "onPause", "scrollToTop", "Lo00OOOoO/OooO0OO;", "msg", "onEventMainThread", "", "pageIndex", "I", "isFirstApiStatistical", "Z", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainRoomRecommendFragment extends MainRoomBaseFragment<bb> {
    public static final int $stable = 8;
    private boolean isFirstApiStatistical;

    @Nullable
    private o00OO0.OooO00o mAdapter;

    @Nullable
    private o00O0 mRecommendTopView;
    private int pageIndex = 1;

    public static final class OooO00o extends o00Oo0 {
        public OooO00o() {
        }

        @Override // p654o0ooo.o00Oo0
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            o00OO0.OooO00o oooO00o = MainRoomRecommendFragment.this.mAdapter;
            Intrinsics.checkNotNull(oooO00o);
            oooO00o.setFirstLoading(true);
            MainRoomRecommendFragment.this.freshLoad();
        }
    }

    public static final class OooO0O0 extends o00OO0O0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ boolean f24451OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ MainRoomRecommendFragment f24452OooO0O0;

        public static final class OooO00o extends o00000O0<CommonParseMultiListModel<RoomIndexModel>> {
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(boolean z, MainRoomRecommendFragment mainRoomRecommendFragment, Context context) {
            super(context);
            this.f24451OooO00o = z;
            this.f24452OooO0O0 = mainRoomRecommendFragment;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onError(@NotNull String code2, @NotNull String message) {
            Intrinsics.checkNotNullParameter(code2, "code");
            Intrinsics.checkNotNullParameter(message, "message");
            super.onError(code2, message);
            ((bb) this.f24452OooO0O0.getBinding()).f49019OooO0o0.Oooo0OO(this.f24451OooO00o, false);
            o00OO0.OooO00o oooO00o = this.f24452OooO0O0.mAdapter;
            if (oooO00o != null) {
                oooO00o.setLoadComplete(Boolean.valueOf(this.f24451OooO00o), Boolean.FALSE, Boolean.TRUE);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o00OoOO0.o00OO0O0.OooO0O0, o00OoOO0.o00OO0O0.OooO00o
        public final void onFinish(@NotNull String response) {
            Intrinsics.checkNotNullParameter(response, "response");
            Object objOooO0OO = o0Oo0oo.OooO0OO(response, new OooO00o().getType());
            Intrinsics.checkNotNullExpressionValue(objOooO0OO, "fromJson(response, objec…IndexModel?>?>() {}.type)");
            final CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) objOooO0OO;
            if (this.f24451OooO00o) {
                o00OO0.OooO00o oooO00o = this.f24452OooO0O0.mAdapter;
                if (oooO00o != null) {
                    oooO00o.setNewData(commonParseMultiListModel.data);
                }
            } else {
                o00OO0.OooO00o oooO00o2 = this.f24452OooO0O0.mAdapter;
                if (oooO00o2 != null) {
                    oooO00o2.OooO0OO(commonParseMultiListModel.data);
                }
                o00OO0.OooO00o oooO00o3 = this.f24452OooO0O0.mAdapter;
                if (oooO00o3 != null) {
                    oooO00o3.addData(commonParseMultiListModel.data);
                }
            }
            boolean z = true;
            this.f24452OooO0O0.pageIndex = commonParseMultiListModel.index + 1;
            ((bb) this.f24452OooO0O0.getBinding()).f49019OooO0o0.Oooo0OO(this.f24451OooO00o, true);
            o00OO0.OooO00o oooO00o4 = this.f24452OooO0O0.mAdapter;
            if (oooO00o4 != null) {
                Boolean boolValueOf = Boolean.valueOf(this.f24451OooO00o);
                Boolean bool = Boolean.TRUE;
                Collection collection = commonParseMultiListModel.data;
                if (collection != null && !collection.isEmpty()) {
                    z = false;
                }
                oooO00o4.setLoadComplete(boolValueOf, bool, Boolean.valueOf(z));
            }
            RecyclerView recyclerView = ((bb) this.f24452OooO0O0.getBinding()).f49018OooO0Oo;
            final MainRoomRecommendFragment mainRoomRecommendFragment = this.f24452OooO0O0;
            recyclerView.postDelayed(new Runnable() { // from class: o0oOoo0.o00O00o0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    MainRoomRecommendFragment fragment = mainRoomRecommendFragment;
                    CommonParseMultiListModel model = commonParseMultiListModel;
                    Intrinsics.checkNotNullParameter(fragment, "this$0");
                    Intrinsics.checkNotNullParameter(model, "$model");
                    try {
                        if (fragment.isFirstApiStatistical) {
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        o0000Ooo.OooO00o oooO00oOooO0O0 = o0000Ooo.f41382OooO00o.OooO0O0(((bb) fragment.getBinding()).f49018OooO0Oo);
                        int i = oooO00oOooO0O0.f41387OooO0OO;
                        for (int i2 = oooO00oOooO0O0.f41385OooO00o; i2 < i; i2++) {
                            if (model.data.size() > i2) {
                                arrayList.add(((RoomIndexModel) model.data.get(i2)).barid);
                                arrayList2.add(((RoomIndexModel) model.data.get(i2)).sessionId);
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        fragment.isFirstApiStatistical = true;
                        EnterRoomParentPage expoSource = EnterRoomParentPage.AII_New;
                        Intrinsics.checkNotNullParameter(fragment, "fragment");
                        Intrinsics.checkNotNullParameter(expoSource, "expoSource");
                        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new oo0oOO0(arrayList, arrayList2, expoSource, null), 3, null);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }, 300L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void freshLoad() {
        this.pageIndex = 1;
        loadNewRoomData(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        int i = 3;
        ((bb) getBinding()).f49019OooO0o0.setOnRefreshListener(new oO0o0000(this, i));
        ((bb) getBinding()).f49019OooO0o0.setOnLoadMoreListener(new o0000(this));
        ((bb) getBinding()).f49019OooO0o0.f19555o0ooOoO = true;
        ((bb) getBinding()).f49019OooO0o0.f19537o000OOo = true;
        ((bb) getBinding()).f49019OooO0o0.f19500o000000 = true;
        o00OO0.OooO00o oooO00o = new o00OO0.OooO00o(getContext());
        this.mAdapter = oooO00o;
        oooO00o.f11360OooO0O0 = RoomBaseAdapter.PageSource.RoomAllNewFragment;
        oooO00o.f11361OooO0OO = new o0OoOo0(this);
        oooO00o.f11360OooO0O0 = RoomBaseAdapter.PageSource.RoomAllNewFragment;
        oooO00o.setEmptyText(R.string.blank_ta_no_rooms);
        o00OO0.OooO00o oooO00o2 = this.mAdapter;
        if (oooO00o2 != null) {
            oooO00o2.setEmptyImageRes(R.drawable.ic_empty_room);
        }
        o00OO0.OooO00o oooO00o3 = this.mAdapter;
        if (oooO00o3 != null) {
            oooO00o3.setHeaderAndEmpty(true);
        }
        o00OO0.OooO00o oooO00o4 = this.mAdapter;
        if (oooO00o4 != null) {
            oooO00o4.setOnLoadMoreListener(new o000oOoO(this, i), ((bb) getBinding()).f49018OooO0Oo);
        }
        o00OO0.OooO00o oooO00o5 = this.mAdapter;
        if (oooO00o5 != null) {
            oooO00o5.setLoadErrorClickListener(new OooO00o());
        }
        Banner banner = ((bb) getBinding()).f49016OooO0O0;
        Intrinsics.checkNotNullExpressionValue(banner, "binding.banner");
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
        this.mRecommendTopView = new o00O0(banner, fragmentActivityRequireActivity);
        ((bb) getBinding()).f49018OooO0Oo.setLayoutManager(new FixLinearLayoutManager(getContext()));
        ((bb) getBinding()).f49018OooO0Oo.setAdapter(this.mAdapter);
        o00000OO o00000oo2 = o00000OO.f48476OooO00o;
        RecyclerView recyclerView = ((bb) getBinding()).f49018OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMainNew");
        o00000OO.OooO00o(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m480initView$lambda2(MainRoomRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00O0 o00o1 = this$0.mRecommendTopView;
        if (o00o1 != null) {
            o00o1.OooO00o();
        }
        this$0.freshLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-3, reason: not valid java name */
    public static final void m481initView$lambda3(MainRoomRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.moreLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: initView$lambda-4, reason: not valid java name */
    public static final void m482initView$lambda4(MainRoomRecommendFragment fragment, RoomIndexModel data) {
        Intrinsics.checkNotNullParameter(fragment, "this$0");
        Intrinsics.checkNotNullParameter(data, "data");
        o0000Ooo.OooO00o oooO00oOooO0O0 = o0000Ooo.f41382OooO00o.OooO0O0(((bb) fragment.getBinding()).f49018OooO0Oo);
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
            EnterRoomParentPage sourcePage = EnterRoomParentPage.AII_New;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            Intrinsics.checkNotNullParameter(roomId, "roomId");
            Intrinsics.checkNotNullParameter(sourcePage, "sourcePage");
            BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new o00O0O0O(arrayList, arrayList2, roomId, sourcePage, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-5, reason: not valid java name */
    public static final void m483initView$lambda5(MainRoomRecommendFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.moreLoad();
    }

    private final void loadNewRoomData(boolean isRefresh) {
        o00oO0o o00oo0o2 = p153o00Oo0oO.o00000OO.f32207OooO00o;
        oo0o0Oo oo0o0oo = p153o00Oo0oO.o00000OO.f32210OooO0Oo;
        String strOooO00o = o0ooOOo.OooO00o(new StringBuilder(), this.pageIndex, "");
        OooO0O0 oooO0O0 = new OooO0O0(isRefresh, this, getContext());
        Map<String, String> mapOooO0O0 = o00OO0O0.OooO0O0();
        mapOooO0O0.put("pageindex", strOooO00o);
        p153o00Oo0oO.o0ooOOo o0ooooo2 = p153o00Oo0oO.o0ooOOo.f32218OooO00o;
        o00OO0O0.OooO0OO(null, p153o00Oo0oO.o0ooOOo.f32244OooOoo, p153o00Oo0oO.o0ooOOo.f32341oo0o0Oo, mapOooO0O0, oooO0O0);
    }

    private final void moreLoad() {
        loadNewRoomData(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onLazyInit$lambda-1, reason: not valid java name */
    public static final void m484onLazyInit$lambda1(MainRoomRecommendFragment this$0, Boolean it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullExpressionValue(it, "it");
        if (it.booleanValue()) {
            this$0.freshLoad();
        }
    }

    @Override // p503o0o00o00.OooO, p140o00OOOoO.OooO0o
    public void onEventMainThread(@NotNull p140o00OOOoO.OooO0OO<?> msg) {
        o00OO0.OooO00o oooO00o;
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        if (getIsLazyInit()) {
            int i = msg.f31885OooO00o;
            if (i == 15 || i == 31 || i == 36 || i == 109) {
                freshLoad();
            } else if (i == 575 && (oooO00o = this.mAdapter) != null) {
                oooO00o.OooO0o0();
            }
        }
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        OooOOO oooOOO = OooOOO.f41216OooO00o;
        if (Intrinsics.areEqual(oooOOO.OooOooO().getValue(), Boolean.FALSE)) {
            freshLoad();
        }
        oooOOO.OooOooO().observe(this, new o00O0O(this, 9));
    }

    @Override // p503o0o00o00.OooO, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        o0O00000.OooO0o0("Room_new_stay", getTimeLengthStr());
        OooOo.OooO0OO("401002", MapsKt.mapOf(new Pair("staytime", getTimeLengthStr())));
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0O00000.OooO0OO("Room_new");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment
    public void scrollToTop() {
        super.scrollToTop();
        ((bb) getBinding()).f49018OooO0Oo.scrollToPosition(0);
        if (((bb) getBinding()).f49019OooO0o0.getState() == RefreshState.None) {
            ((bb) getBinding()).f49019OooO0o0.OooO();
            ((bb) getBinding()).f49019OooO0o0.OooO0oo();
        }
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public bb getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        bb bbVarInflate = bb.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(bbVarInflate, "inflate(inflater, container, false)");
        CollapsingToolbarLayout collapsingToolbarLayout = bbVarInflate.f49017OooO0OO;
        WeakHashMap<View, o00000O> weakHashMap = ViewCompat.f7870OooO00o;
        ViewCompat.OooOOO.OooOo0(collapsingToolbarLayout, null);
        return bbVarInflate;
    }
}
