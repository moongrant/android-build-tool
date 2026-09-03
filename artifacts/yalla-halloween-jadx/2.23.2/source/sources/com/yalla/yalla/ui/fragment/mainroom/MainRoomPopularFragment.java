package com.yalla.yalla.ui.fragment.mainroom;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.foundation.layout.oo000o;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.media3.session.o000;
import androidx.media3.session.o0000O;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.reflect.TypeToken;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.CommonParseMultiListModel;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.pullrefresh.XRefreshLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import o000OOO.OooOOO0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p405o0Oo0OOO.oOo00OO0;
import p426o0OoO0o0.OooOOOO;
import p429o0OoOO.OooOo00;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p507o0o00oo.o0OOO0o;
import p545o0oO0O00.OooOOO;
import p562o0oOo000.o000000;
import p562o0oOo000.o0Oo0oo;
import p590o0oOooo0.oOOO00;
import p590o0oOooo0.oo000000;
import p590o0oOooo0.z0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0016J\u0014\u0010\u0019\u001a\u00020\u00032\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomPopularFragment;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomBaseFragment;", "Lo0Oo0OOO/oOo00OO0;", "", "initView", "moreLoad", "freshLoad", "", "isRefresh", "load", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onLazyInit", "onPause", "Lo0oO0O00/OooOOO;", "msg", "onEvent", "onEventMainThread", "scrollToTop", "", "pageIndex", "I", "Lo0o00oo/o0OOO0o;", "mAdapter", "Lo0o00oo/o0OOO0o;", "isFirstApiStatistical", "Z", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class MainRoomPopularFragment extends MainRoomBaseFragment<oOo00OO0> {
    public static final int $stable = 8;
    private boolean isFirstApiStatistical;

    @Nullable
    private o0OOO0o mAdapter;
    private int pageIndex = 1;

    public static final class OooO00o extends o0OOOO0o {
        public OooO00o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MainRoomPopularFragment mainRoomPopularFragment = MainRoomPopularFragment.this;
            o0OOO0o o0ooo0o2 = mainRoomPopularFragment.mAdapter;
            Intrinsics.checkNotNull(o0ooo0o2);
            o0ooo0o2.Oooo00O(true);
            mainRoomPopularFragment.freshLoad();
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<Boolean, Unit> {
        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            MainRoomPopularFragment.this.freshLoad();
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<Integer, Unit> {
        public OooO0OO() {
            super(1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            ImageView imageView = ((oOo00OO0) MainRoomPopularFragment.this.getBinding()).f45211OooO0O0;
            z0 z0Var = z0.f57313OooO00o;
            Intrinsics.checkNotNull(num2);
            imageView.setImageResource(z0.OooO0OO(num2.intValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27969OooO0Oo;

        public OooO0o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27969OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27969OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27969OooO0Oo;
        }

        public final int hashCode() {
            return this.f27969OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27969OooO0Oo.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void freshLoad() {
        this.pageIndex = 1;
        load(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((oOo00OO0) getBinding()).f45213OooO0Oo.setOnRefreshListener(new o0000O(this, 2));
        ((oOo00OO0) getBinding()).f45213OooO0Oo.f20870OoooO = true;
        o0OOO0o o0ooo0o2 = new o0OOO0o(getContext());
        RoomBaseAdapter.PageSource pageSource = RoomBaseAdapter.PageSource.RoomAllPopularFragment;
        o0ooo0o2.f27241OooOooO = new OooOOO0(this);
        o0ooo0o2.f27239OooOoo = pageSource;
        o0ooo0o2.Oooo000(o000000.blank_ta_no_rooms);
        o0ooo0o2.OooOooo(o0Oo0oo.ic_empty_room);
        o0ooo0o2.OooOo0o();
        o0ooo0o2.Oooo0OO(new OooO00o());
        o0ooo0o2.OooOoO(new o000(this), ((oOo00OO0) getBinding()).f45212OooO0OO);
        this.mAdapter = o0ooo0o2;
        ((oOo00OO0) getBinding()).f45212OooO0OO.setLayoutManager(new FixLinearLayoutManager(getContext()));
        ((oOo00OO0) getBinding()).f45212OooO0OO.setAdapter(this.mAdapter);
        oo000000 oo000000Var = oo000000.f57240OooO00o;
        RecyclerView rvMainAll = ((oOo00OO0) getBinding()).f45212OooO0OO;
        Intrinsics.checkNotNullExpressionValue(rvMainAll, "rvMainAll");
        oo000000.OooO0O0(rvMainAll);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MainRoomPopularFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.freshLoad();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initView$lambda$3$lambda$1(MainRoomPopularFragment this$0, RoomIndexModel data) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(data, "data");
        o0o00O00.OooO0OO.OooO00o oooO00oOooO0O0 = p489o0o00O00.OooO0OO.OooO0O0(((oOo00OO0) this$0.getBinding()).f45212OooO0OO);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = oooO00oOooO0O0.f48921OooO00o;
        int i2 = oooO00oOooO0O0.f48922OooO0O0;
        if (i <= i2) {
            while (true) {
                o0OOO0o o0ooo0o2 = this$0.mAdapter;
                Intrinsics.checkNotNull(o0ooo0o2);
                if (o0ooo0o2.f13189OooOOoo.size() > i) {
                    o0OOO0o o0ooo0o3 = this$0.mAdapter;
                    Intrinsics.checkNotNull(o0ooo0o3);
                    Object obj = o0ooo0o3.f13189OooOOoo.get(i);
                    Intrinsics.checkNotNull(obj);
                    arrayList.add(((RoomIndexModel) obj).barid);
                    o0OOO0o o0ooo0o4 = this$0.mAdapter;
                    Intrinsics.checkNotNull(o0ooo0o4);
                    Object obj2 = o0ooo0o4.f13189OooOOoo.get(i);
                    Intrinsics.checkNotNull(obj2);
                    arrayList2.add(((RoomIndexModel) obj2).sessionId);
                }
                if (i == i2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        String barid = data.barid;
        Intrinsics.checkNotNullExpressionValue(barid, "barid");
        if (barid.length() > 0) {
            WebEventRepository webEventRepository = WebEventRepository.f24430OooO00o;
            String barid2 = data.barid;
            Intrinsics.checkNotNullExpressionValue(barid2, "barid");
            EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.AII_Popular;
            webEventRepository.getClass();
            WebEventRepository.OooO0OO(this$0, arrayList, arrayList2, barid2, enterRoomParentPage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3$lambda$2(MainRoomPopularFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.moreLoad();
    }

    private final void load(final boolean isRefresh) {
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        CharSequence charSequence = (CharSequence) o0O00oO0.OooOOOO().getValue();
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            return;
        }
        o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
        String strOooO00o = oo000o.OooO00o(this.pageIndex);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(getContext()) { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment.load.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@NotNull String code, @NotNull String message) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                super.OooO0O0(code, message);
                MainRoomPopularFragment mainRoomPopularFragment = this;
                XRefreshLayout xRefreshLayout = ((oOo00OO0) mainRoomPopularFragment.getBinding()).f45213OooO0Oo;
                boolean z = isRefresh;
                xRefreshLayout.OooOooO(z, false);
                o0OOO0o o0ooo0o2 = mainRoomPopularFragment.mAdapter;
                if (o0ooo0o2 != null) {
                    o0ooo0o2.Oooo0(Boolean.valueOf(z), Boolean.FALSE, Boolean.TRUE);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@NotNull String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    Object objOooO0O0 = oOOO00.OooO0O0(response, new TypeToken<CommonParseMultiListModel<RoomIndexModel>>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment$load$1$onFinish$result$1
                    }.getType());
                    Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(...)");
                    CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) objOooO0O0;
                    boolean z = isRefresh;
                    MainRoomPopularFragment mainRoomPopularFragment = this;
                    if (z) {
                        o0OOO0o o0ooo0o2 = mainRoomPopularFragment.mAdapter;
                        if (o0ooo0o2 != null) {
                            o0ooo0o2.OooOoO0(commonParseMultiListModel.data);
                        }
                    } else {
                        o0OOO0o o0ooo0o3 = mainRoomPopularFragment.mAdapter;
                        if (o0ooo0o3 != null) {
                            o0ooo0o3.Oooo0oO(commonParseMultiListModel.data);
                        }
                        o0OOO0o o0ooo0o4 = mainRoomPopularFragment.mAdapter;
                        if (o0ooo0o4 != null) {
                            o0ooo0o4.OooO0O0(commonParseMultiListModel.data);
                        }
                    }
                    int i = 1;
                    mainRoomPopularFragment.pageIndex = commonParseMultiListModel.index + 1;
                    ((oOo00OO0) mainRoomPopularFragment.getBinding()).f45213OooO0Oo.OooOooO(z, true);
                    o0OOO0o o0ooo0o5 = mainRoomPopularFragment.mAdapter;
                    if (o0ooo0o5 != null) {
                        Boolean boolValueOf = Boolean.valueOf(z);
                        Boolean bool = Boolean.TRUE;
                        Collection collection = commonParseMultiListModel.data;
                        o0ooo0o5.Oooo0(boolValueOf, bool, Boolean.valueOf(collection == null || collection.isEmpty()));
                    }
                    ((oOo00OO0) mainRoomPopularFragment.getBinding()).f45212OooO0OO.postDelayed(new com.facebook.appevents.codeless.OooO00o(i, mainRoomPopularFragment, commonParseMultiListModel), 300L);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("pageindex", strOooO00o);
        if (!TextUtils.isEmpty(null)) {
            linkedHashMapOooO00o.put("labelId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            linkedHashMapOooO00o.put("countryId", null);
        }
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43442o0ooOO0, linkedHashMapOooO00o, oooO0O0);
    }

    private final void moreLoad() {
        load(false);
    }

    @Override // p527o0o0OO0o.o000O, p545o0oO0O00.OooOOOO
    public void onEvent(@Nullable OooOOO<?> msg) {
    }

    @Override // p527o0o0OO0o.o000O, p545o0oO0O00.OooOOOO
    public void onEventMainThread(@NotNull OooOOO<?> msg) {
        o0OOO0o o0ooo0o2;
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        if (getIsLazyInit()) {
            int i = msg.f55758OooO00o;
            if (i == 15 || i == 36 || i == 109) {
                freshLoad();
            } else {
                if (i != 575 || (o0ooo0o2 = this.mAdapter) == null || o0ooo0o2 == null) {
                    return;
                }
                o0ooo0o2.Oooo();
            }
        }
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooOo0O().observe(this, new OooO0o(new OooO0O0()));
    }

    @Override // p527o0o0OO0o.o000O, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        o0oo0000.OooO00o.OooO0OO("401003", MapsKt.mapOf(new Pair("staytime", getTimeLengthStr())));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MutableLiveData<Integer> mutableLiveData = OooOo00.f46776OooO00o;
        OooOo00.f46776OooO00o.observe(getViewLifecycleOwner(), new OooO0o(new OooO0OO()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment
    public void scrollToTop() {
        super.scrollToTop();
        ((oOo00OO0) getBinding()).f45212OooO0OO.scrollToPosition(0);
        if (((oOo00OO0) getBinding()).f45213OooO0Oo.getState() == RefreshState.None) {
            ((oOo00OO0) getBinding()).f45213OooO0Oo.OooO();
            ((oOo00OO0) getBinding()).f45213OooO0Oo.OooO0oo();
        }
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oOo00OO0 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oOo00OO0 ooo00oo0Inflate = oOo00OO0.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(ooo00oo0Inflate, "inflate(...)");
        return ooo00oo0Inflate;
    }
}
