package com.yalla.yalla.ui.fragment.mainroom;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.gson.reflect.TypeToken;
import com.scwang.smartrefresh.layout.constant.RefreshState;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.CommonParseMultiListModel;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.repository.WebEventRepository;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p045Oooooo.o000oOoO;
import p045Oooooo.o0OO00O;
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p418o0OoO000.OooOo;
import p426o0OoOO.o0OOO0o;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p481o0o000o0.OooOo00;
import p579o0oOoo.oO0OOO00;
import p579o0oOoo.oOOOOo0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p640o0ooOOO0.oO00o000;
import p641o0ooOOOO.j4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b#\u0010$J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u001a\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u001a\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0014J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0016H\u0016J\u0014\u0010\u0019\u001a\u00020\u00032\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016J\b\u0010\u001a\u001a\u00020\u0003H\u0016R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomPopularFragment;", "Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomBaseFragment;", "Lo0ooOOOO/j4;", "", "initView", "moreLoad", "freshLoad", "", "isRefresh", "load", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onLazyInit", "onPause", "Lo0OoO000/OooOo;", "msg", "onEvent", "onEventMainThread", "scrollToTop", "", "pageIndex", "I", "Lcom/yalla/yalla/ui/adapter/room/OooO0O0;", "mAdapter", "Lcom/yalla/yalla/ui/adapter/room/OooO0O0;", "isFirstApiStatistical", "Z", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class MainRoomPopularFragment extends MainRoomBaseFragment<j4> {
    public static final int $stable = 8;
    private boolean isFirstApiStatistical;

    @Nullable
    private com.yalla.yalla.ui.adapter.room.OooO0O0 mAdapter;
    private int pageIndex = 1;

    public static final class OooO00o extends oo00o {
        public OooO00o() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MainRoomPopularFragment mainRoomPopularFragment = MainRoomPopularFragment.this;
            com.yalla.yalla.ui.adapter.room.OooO0O0 oooO0O0 = mainRoomPopularFragment.mAdapter;
            Intrinsics.checkNotNull(oooO0O0);
            oooO0O0.Oooo00O(true);
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
            Integer it = num;
            ImageView imageView = ((j4) MainRoomPopularFragment.this.getBinding()).f58163OooO0O0;
            oOOOOo0O oooooo0o = oOOOOo0O.f56683OooO00o;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            imageView.setImageResource(oOOOOo0O.OooO0OO(it.intValue()));
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28474OooO0Oo;

        public OooO0o(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28474OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28474OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28474OooO0Oo;
        }

        public final int hashCode() {
            return this.f28474OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28474OooO0Oo.invoke(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void freshLoad() {
        this.pageIndex = 1;
        load(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void initView() {
        ((j4) getBinding()).f58165OooO0Oo.setOnRefreshListener(new o0OO00O(this));
        ((j4) getBinding()).f58165OooO0Oo.f21343OoooO = true;
        com.yalla.yalla.ui.adapter.room.OooO0O0 oooO0O0 = new com.yalla.yalla.ui.adapter.room.OooO0O0(getContext());
        RoomBaseAdapter.PageSource pageSource = RoomBaseAdapter.PageSource.RoomAllPopularFragment;
        oooO0O0.f27703OooOooO = new o000oOoO(this);
        oooO0O0.f27701OooOoo = pageSource;
        oooO0O0.Oooo000(oO00OOo0.blank_ta_no_rooms);
        oooO0O0.OooOooo(oOo00OO0.ic_empty_room);
        oooO0O0.OooOo0o();
        oooO0O0.Oooo0OO(new OooO00o());
        oooO0O0.OooOoO(new p331o0OO0o0.o0OO00O(this), ((j4) getBinding()).f58164OooO0OO);
        this.mAdapter = oooO0O0;
        ((j4) getBinding()).f58164OooO0OO.setLayoutManager(new FixLinearLayoutManager(getContext()));
        ((j4) getBinding()).f58164OooO0OO.setAdapter(this.mAdapter);
        oO0OOO00 oo0ooo00 = oO0OOO00.f56606OooO00o;
        RecyclerView recyclerView = ((j4) getBinding()).f58164OooO0OO;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMainAll");
        oO0OOO00.OooO0O0(recyclerView);
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
        OooOo00.OooO00o oooO00oOooO0O0 = OooOo00.OooO0O0(((j4) this$0.getBinding()).f58164OooO0OO);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = oooO00oOooO0O0.f47694OooO00o;
        int i2 = oooO00oOooO0O0.f47695OooO0O0;
        if (i <= i2) {
            while (true) {
                com.yalla.yalla.ui.adapter.room.OooO0O0 oooO0O0 = this$0.mAdapter;
                Intrinsics.checkNotNull(oooO0O0);
                if (oooO0O0.f10111OooOOoo.size() > i) {
                    com.yalla.yalla.ui.adapter.room.OooO0O0 oooO0O1 = this$0.mAdapter;
                    Intrinsics.checkNotNull(oooO0O1);
                    Object obj = oooO0O1.f10111OooOOoo.get(i);
                    Intrinsics.checkNotNull(obj);
                    arrayList.add(((RoomIndexModel) obj).barid);
                    com.yalla.yalla.ui.adapter.room.OooO0O0 oooO0O2 = this$0.mAdapter;
                    Intrinsics.checkNotNull(oooO0O2);
                    Object obj2 = oooO0O2.f10111OooOOoo.get(i);
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
        String str = data.barid;
        Intrinsics.checkNotNullExpressionValue(str, "data.barid");
        if (str.length() > 0) {
            WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
            String str2 = data.barid;
            Intrinsics.checkNotNullExpressionValue(str2, "data.barid");
            EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.AII_Popular;
            webEventRepository.getClass();
            WebEventRepository.OooO0OO(this$0, arrayList, arrayList2, str2, enterRoomParentPage);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3$lambda$2(MainRoomPopularFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.moreLoad();
    }

    private final void load(final boolean isRefresh) {
        o000000O o000000o2 = o000000O.f46674OooO00o;
        CharSequence charSequence = (CharSequence) o000000O.OooOOOO().getValue();
        if (charSequence == null || StringsKt.isBlank(charSequence)) {
            return;
        }
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        String strOooO00o = o0OOO0o.OooO00o(this.pageIndex);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(getContext()) { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment.load.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@NotNull String code, @NotNull String message) {
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                super.OooO0O0(code, message);
                MainRoomPopularFragment mainRoomPopularFragment = this;
                XRefreshLayout xRefreshLayout = ((j4) mainRoomPopularFragment.getBinding()).f58165OooO0Oo;
                boolean z = isRefresh;
                xRefreshLayout.OooOooO(z, false);
                com.yalla.yalla.ui.adapter.room.OooO0O0 oooO0O1 = mainRoomPopularFragment.mAdapter;
                if (oooO0O1 != null) {
                    oooO0O1.Oooo0(Boolean.valueOf(z), Boolean.FALSE, Boolean.TRUE);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@NotNull String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                try {
                    Object objOooO0O0 = p579o0oOoo.oOo00OO0.OooO0O0(response, new TypeToken<CommonParseMultiListModel<RoomIndexModel>>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomPopularFragment$load$1$onFinish$result$1
                    }.getType());
                    Intrinsics.checkNotNullExpressionValue(objOooO0O0, "fromJson(response, objec…IndexModel?>?>() {}.type)");
                    final CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) objOooO0O0;
                    boolean z = isRefresh;
                    final MainRoomPopularFragment mainRoomPopularFragment = this;
                    if (z) {
                        com.yalla.yalla.ui.adapter.room.OooO0O0 oooO0O1 = mainRoomPopularFragment.mAdapter;
                        if (oooO0O1 != null) {
                            oooO0O1.OooOoO0(commonParseMultiListModel.data);
                        }
                    } else {
                        com.yalla.yalla.ui.adapter.room.OooO0O0 oooO0O2 = mainRoomPopularFragment.mAdapter;
                        if (oooO0O2 != null) {
                            oooO0O2.Oooo0oO(commonParseMultiListModel.data);
                        }
                        com.yalla.yalla.ui.adapter.room.OooO0O0 oooO0O3 = mainRoomPopularFragment.mAdapter;
                        if (oooO0O3 != null) {
                            oooO0O3.OooO0O0(commonParseMultiListModel.data);
                        }
                    }
                    boolean z2 = true;
                    mainRoomPopularFragment.pageIndex = commonParseMultiListModel.index + 1;
                    ((j4) mainRoomPopularFragment.getBinding()).f58165OooO0Oo.OooOooO(z, true);
                    com.yalla.yalla.ui.adapter.room.OooO0O0 oooO0O4 = mainRoomPopularFragment.mAdapter;
                    if (oooO0O4 != null) {
                        Boolean boolValueOf = Boolean.valueOf(z);
                        Boolean bool = Boolean.TRUE;
                        Collection collection = commonParseMultiListModel.data;
                        if (collection != null && !collection.isEmpty()) {
                            z2 = false;
                        }
                        oooO0O4.Oooo0(boolValueOf, bool, Boolean.valueOf(z2));
                    }
                    ((j4) mainRoomPopularFragment.getBinding()).f58164OooO0OO.postDelayed(new Runnable() { // from class: o0o0OoO0.o00OOO0
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.lang.Runnable
                        public final void run() {
                            MainRoomPopularFragment this$0 = mainRoomPopularFragment;
                            Intrinsics.checkNotNullParameter(this$0, "this$0");
                            CommonParseMultiListModel result = commonParseMultiListModel;
                            Intrinsics.checkNotNullParameter(result, "$result");
                            if (this$0.isFirstApiStatistical) {
                                return;
                            }
                            ArrayList arrayList = new ArrayList();
                            ArrayList arrayList2 = new ArrayList();
                            OooOo00.OooO00o oooO00oOooO0O0 = OooOo00.OooO0O0(((j4) this$0.getBinding()).f58164OooO0OO);
                            int i = oooO00oOooO0O0.f47694OooO00o;
                            if (i < 0) {
                                i = 0;
                            }
                            int size = result.data.size();
                            int i2 = oooO00oOooO0O0.f47696OooO0OO;
                            if (i2 < size) {
                                while (i < i2) {
                                    if (result.data.size() > i) {
                                        arrayList.add(((RoomIndexModel) result.data.get(i)).barid);
                                        arrayList2.add(((RoomIndexModel) result.data.get(i)).sessionId);
                                    }
                                    i++;
                                }
                            }
                            if (arrayList.isEmpty()) {
                                return;
                            }
                            this$0.isFirstApiStatistical = true;
                            WebEventRepository webEventRepository = WebEventRepository.f24891OooO00o;
                            EnterRoomParentPage enterRoomParentPage = EnterRoomParentPage.AII_Popular;
                            webEventRepository.getClass();
                            WebEventRepository.OooO0oO(this$0, arrayList, arrayList2, enterRoomParentPage);
                        }
                    }, 300L);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("pageindex", strOooO00o);
        if (!TextUtils.isEmpty(null)) {
            linkedHashMapOooO00o.put("labelId", null);
        }
        if (!TextUtils.isEmpty(null)) {
            linkedHashMapOooO00o.put("countryId", null);
        }
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44183o0ooOO0, linkedHashMapOooO00o, oooO0O0);
    }

    private final void moreLoad() {
        load(false);
    }

    @Override // p508o0o0O.OooOO0O, p418o0OoO000.Oooo000
    public void onEvent(@Nullable OooOo<?> msg) {
    }

    @Override // p508o0o0O.OooOO0O, p418o0OoO000.Oooo000
    public void onEventMainThread(@NotNull OooOo<?> msg) {
        com.yalla.yalla.ui.adapter.room.OooO0O0 oooO0O0;
        Intrinsics.checkNotNullParameter(msg, "msg");
        super.onEventMainThread(msg);
        if (getIsLazyInit()) {
            int i = msg.f45532OooO00o;
            if (i == 15 || i == 36 || i == 109) {
                freshLoad();
            } else {
                if (i != 575 || (oooO0O0 = this.mAdapter) == null || oooO0O0 == null) {
                    return;
                }
                oooO0O0.Oooo();
            }
        }
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initView();
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOo0O().observe(this, new OooO0o(new OooO0O0()));
    }

    @Override // p508o0o0O.OooOO0O, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        o0OO000.OooO0O0("401003", MapsKt.mapOf(new Pair("staytime", getTimeLengthStr())));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        MutableLiveData<Integer> mutableLiveData = p427o0OoOO00.OooOo.f45669OooO00o;
        p427o0OoOO00.OooOo.f45669OooO00o.observe(getViewLifecycleOwner(), new OooO0o(new OooO0OO()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.ui.fragment.mainroom.MainRoomBaseFragment
    public void scrollToTop() {
        super.scrollToTop();
        ((j4) getBinding()).f58164OooO0OO.scrollToPosition(0);
        if (((j4) getBinding()).f58165OooO0Oo.getState() == RefreshState.None) {
            ((j4) getBinding()).f58165OooO0Oo.OooO();
            ((j4) getBinding()).f58165OooO0Oo.OooO0oo();
        }
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public j4 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        j4 j4VarInflate = j4.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(j4VarInflate, "inflate(inflater, container, false)");
        return j4VarInflate;
    }
}
