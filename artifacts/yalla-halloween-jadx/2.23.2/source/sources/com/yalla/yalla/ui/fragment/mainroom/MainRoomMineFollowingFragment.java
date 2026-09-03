package com.yalla.yalla.ui.fragment.mainroom;

import android.app.Activity;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o000Oo0;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.util.OooOo00;
import com.code.android.util.o0000;
import com.code.android.util.o000O00O;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.CommonParseMultiListModel;
import com.yalla.yalla.model.http.Error;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.room.RoomIndexFollowingModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.fragment.ContributionFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o0oOo0O0;
import p246o00oo0Oo.o000OO;
import p384o0OOoo0O.Oooo0;
import p384o0OOoo0O.o00oO0o;
import p384o0OOoo0O.o0OO00O;
import p384o0OOoo0O.oo000o;
import p405o0Oo0OOO.oO00OO0O;
import p424o0OoO0Oo.o00OO000;
import p426o0OoO0o0.OooOOOO;
import p473o0OoooOo.o0OOOO0o;
import p475o0Ooooo0.o0O00oO0;
import p492o0o00OO0.o00000;
import p492o0o00OO0.o000000O;
import p492o0o00OO0.o00000O0;
import p492o0o00OO0.oo0o0Oo;
import p507o0o00oo.o00Ooo;
import p527o0o0OO0o.o000O;
import p562o0oOo000.o000000;
import p579o0oOoOoO.oOO0;
import p579o0oOoOoO.oOO0O000;
import p579o0oOoOoO.ooooO000;
import p590o0oOooo0.oOOO00;
import p590o0oOooo0.oo000000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\u000b\u001a\u00020\u00032\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\tH\u0002J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u001a\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0006\u0010\u0019\u001a\u00020\u0003R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\"R\"\u0010(\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/oO00OO0O;", "", "initView", "", "barid", "followRoom", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "list", "followAllRoom", ContributionFragment.ARG_1, "changeFollowState", "", "isRefresh", "loadFollowingRoomList", "loadRecommendRoomList", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "scroolToTop", "Lo0oOoOoO/oOO0;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lo0oOoOoO/oOO0;", "vm", "Landroid/view/View;", "rootView", "Landroid/view/View;", "Lo0o00oo/o00Ooo;", "followingAdapter", "Lo0o00oo/o00Ooo;", "emptyHeaderView", "emptyFooterView", "needReInit", "Z", "getNeedReInit", "()Z", "setNeedReInit", "(Z)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMainRoomMineFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomMineFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n106#2,15:208\n1864#3,3:223\n*S KotlinDebug\n*F\n+ 1 MainRoomMineFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment\n*L\n38#1:208,15\n150#1:223,3\n*E\n"})
public final class MainRoomMineFollowingFragment extends o000O<oO00OO0O> {
    public static final int $stable = 8;

    @Nullable
    private View emptyFooterView;

    @Nullable
    private View emptyHeaderView;

    @Nullable
    private o00Ooo followingAdapter;
    private boolean needReInit;
    private View rootView;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27917OooO0Oo;

        public OooO(OooO0o function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27917OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27917OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27917OooO0Oo;
        }

        public final int hashCode() {
            return this.f27917OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27917OooO0Oo.invoke(obj);
        }
    }

    public static final class OooO00o extends o0OOOO0o {
        public OooO00o() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MainRoomMineFollowingFragment mainRoomMineFollowingFragment = MainRoomMineFollowingFragment.this;
            o00Ooo o00ooo2 = mainRoomMineFollowingFragment.followingAdapter;
            if (o00ooo2 != null) {
                o00ooo2.Oooo00O(true);
            }
            mainRoomMineFollowingFragment.loadFollowingRoomList(true);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f27920OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0O0(int i) {
            super(0);
            this.f27920OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<T> list;
            RoomIndexFollowingModel roomIndexFollowingModel;
            o0oo0000.OooO00o.OooO0O0("101030");
            MainRoomMineFollowingFragment mainRoomMineFollowingFragment = MainRoomMineFollowingFragment.this;
            o00Ooo o00ooo2 = mainRoomMineFollowingFragment.followingAdapter;
            if (o00ooo2 != null && (list = o00ooo2.f13189OooOOoo) != 0 && (roomIndexFollowingModel = (RoomIndexFollowingModel) list.get(this.f27920OooO0o0)) != null) {
                String barid = roomIndexFollowingModel.barid;
                Intrinsics.checkNotNullExpressionValue(barid, "barid");
                mainRoomMineFollowingFragment.followRoom(barid);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends o0OOOO0o {

        @SourceDebugExtension({"SMAP\nMainRoomMineFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomMineFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment$initView$5$onNoDoubleClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1855#2,2:208\n*S KotlinDebug\n*F\n+ 1 MainRoomMineFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment$initView$5$onNoDoubleClick$1\n*L\n113#1:208,2\n*E\n"})
        public static final class OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MainRoomMineFollowingFragment f27922OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MainRoomMineFollowingFragment mainRoomMineFollowingFragment) {
                super(0);
                this.f27922OooO0Oo = mainRoomMineFollowingFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Collection collection;
                ArrayList arrayList = new ArrayList();
                MainRoomMineFollowingFragment mainRoomMineFollowingFragment = this.f27922OooO0Oo;
                o00Ooo o00ooo2 = mainRoomMineFollowingFragment.followingAdapter;
                if (o00ooo2 != null && (collection = o00ooo2.f13189OooOOoo) != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((RoomIndexFollowingModel) it.next()).barid);
                    }
                }
                mainRoomMineFollowingFragment.followAllRoom(arrayList);
                return Unit.INSTANCE;
            }
        }

        public OooO0OO() {
        }

        @Override // p473o0OoooOo.o0OOOO0o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            OooO00o onLogin = new OooO00o(MainRoomMineFollowingFragment.this);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f24727OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    public static final class OooO0o extends Lambda implements Function1<Boolean, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            if (bool2.booleanValue()) {
                MainRoomMineFollowingFragment.this.loadFollowingRoomList(true);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$1] */
    public MainRoomMineFollowingFragment() {
        final ?? r0 = new Function0<Fragment>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final Fragment invoke() {
                return this;
            }
        };
        final Lazy lazy = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0) new Function0<ViewModelStoreOwner>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStoreOwner invoke() {
                return (ViewModelStoreOwner) r0.invoke();
            }
        });
        this.vm = o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(oOO0.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000Oo0.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f27927OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f27927OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                return hasDefaultViewModelProviderFactory != null ? hasDefaultViewModelProviderFactory.getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
            }
        }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelProvider.Factory invoke() {
                ViewModelProvider.Factory defaultViewModelProviderFactory;
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000Oo0.OooO00o(lazy);
                HasDefaultViewModelProviderFactory hasDefaultViewModelProviderFactory = viewModelStoreOwnerOooO00o instanceof HasDefaultViewModelProviderFactory ? (HasDefaultViewModelProviderFactory) viewModelStoreOwnerOooO00o : null;
                if (hasDefaultViewModelProviderFactory != null && (defaultViewModelProviderFactory = hasDefaultViewModelProviderFactory.getDefaultViewModelProviderFactory()) != null) {
                    return defaultViewModelProviderFactory;
                }
                ViewModelProvider.Factory defaultViewModelProviderFactory2 = this.getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory2, "defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory2;
            }
        });
    }

    private final void changeFollowState(String roomId) {
        o00Ooo o00ooo2;
        Collection collection;
        o00Ooo o00ooo3 = this.followingAdapter;
        if (OooOo00.OooO00o(o00ooo3 != null ? o00ooo3.f13189OooOOoo : null) || OooOo00.OooO00o(roomId) || (o00ooo2 = this.followingAdapter) == null || (collection = o00ooo2.f13189OooOOoo) == null) {
            return;
        }
        int i = 0;
        for (Object obj : collection) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            RoomIndexFollowingModel roomIndexFollowingModel = (RoomIndexFollowingModel) obj;
            if (Intrinsics.areEqual(roomId, roomIndexFollowingModel.barid)) {
                boolean z = true;
                roomIndexFollowingModel.localFollow = true;
                o00Ooo o00ooo4 = this.followingAdapter;
                if (o00ooo4 != null) {
                    Intrinsics.checkNotNull(o00ooo4);
                    o00ooo4.notifyItemChanged(o00ooo4.OooOOO0() + i);
                }
                String strOooO0OO = o0000.OooO0OO(o000000.post_list_follow_succeed);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
            }
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void followAllRoom(ArrayList<String> list) {
        if (OooOo00.OooO0O0(list)) {
            getVm().getClass();
            Intrinsics.checkNotNullParameter(list, "baridList");
            o00OO000 o00oo001 = new o00OO000();
            StringBuilder sb = new StringBuilder();
            for (String str : list) {
                sb.append(",");
                sb.append(str);
            }
            int i = 1;
            if (sb.length() > 1) {
                String strSubstring = sb.substring(1, sb.length());
                ooooO000 ooooo000 = new ooooO000(o00oo001);
                LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
                linkedHashMapOooO00o.put("barids", strSubstring);
                com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43363Oooo, linkedHashMapOooO00o, ooooo000);
            }
            o00oo001.observe(this, new oo0o0Oo(this, i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void followAllRoom$lambda$5(MainRoomMineFollowingFragment this$0, Response response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadFollowingRoomList(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void followRoom(String barid) {
        getVm().getClass();
        Intrinsics.checkNotNullParameter(barid, "barid");
        o00OO000 o00oo001 = new o00OO000();
        o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
        oo000o.OooO0O0(barid, false, new oOO0O000(o00oo001, barid));
        o00oo001.observe(this, new o00000(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void followRoom$lambda$4(MainRoomMineFollowingFragment this$0, Response response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (response.getIsSuccess()) {
            this$0.changeFollowState((String) response.getData());
        }
    }

    private final oOO0 getVm() {
        return (oOO0) this.vm.getValue();
    }

    private final void initView() {
        View viewFindViewById;
        getBinding().f44806OooO0OO.setOnRefreshListener(new o0oOo0O0(this));
        o00Ooo o00ooo2 = new o00Ooo(getActivity());
        this.followingAdapter = o00ooo2;
        o00ooo2.f27242OooOooo = EnterRoomParentPage.Related_Following;
        o00ooo2.f27239OooOoo = RoomBaseAdapter.PageSource.RoomRelatedFollowingFragment;
        o00ooo2.OooOo0o();
        o00Ooo o00ooo3 = this.followingAdapter;
        if (o00ooo3 != null) {
            o00ooo3.OooOoO(new OooO0O0.OooO(this), getBinding().f44805OooO0O0);
        }
        o00Ooo o00ooo4 = this.followingAdapter;
        if (o00ooo4 != null) {
            o00ooo4.Oooo0OO(new OooO00o());
        }
        o00Ooo o00ooo5 = this.followingAdapter;
        if (o00ooo5 != null) {
            o00ooo5.f13179OooO0oo = new o000OO(this);
        }
        getBinding().f44805OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f44805OooO0O0.setAdapter(this.followingAdapter);
        this.emptyHeaderView = View.inflate(getContext(), p562o0oOo000.oo0o0Oo.empty_main_related_follow, null);
        View viewInflate = View.inflate(getContext(), p562o0oOo000.oo0o0Oo.empty_main_related_follow_footer, null);
        this.emptyFooterView = viewInflate;
        if (viewInflate != null && (viewFindViewById = viewInflate.findViewById(p562o0oOo000.o0OO00O.bt_follow_all)) != null) {
            viewFindViewById.setOnClickListener(new OooO0OO());
        }
        oo000000 oo000000Var = oo000000.f57240OooO00o;
        RecyclerView rvMainRelated = getBinding().f44805OooO0O0;
        Intrinsics.checkNotNullExpressionValue(rvMainRelated, "rvMainRelated");
        oo000000.OooO0O0(rvMainRelated);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MainRoomMineFollowingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p545o0oO0O00.OooOo00.OooO0O0(158, null);
        this$0.loadFollowingRoomList(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(MainRoomMineFollowingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadFollowingRoomList(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$3(MainRoomMineFollowingFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view.getId() != p562o0oOo000.o0OO00O.ivFollow) {
            return;
        }
        OooO0O0 onLogin = this$0.new OooO0O0(i);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i2 = LoginActivity.f24727OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadFollowingRoomList(final boolean isRefresh) {
        final oOO0 vm = getVm();
        vm.getClass();
        final o00OO000 o00oo001 = new o00OO000();
        if (isRefresh) {
            vm.f56525OooO0OO = 1;
        }
        o00oO0o o00oo0o2 = o0OO00O.f43462OooO00o;
        String strValueOf = String.valueOf(vm.f56525OooO0OO);
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.vm.main.MainRoomRelatedViewModel$loadFollowingRoomList$1$1
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@Nullable String str, @Nullable String str2) {
                int i;
                super.OooO0O0(str, str2);
                if (str != null) {
                    try {
                        i = Integer.parseInt(str);
                    } catch (Exception unused) {
                        i = 1;
                    }
                } else {
                    i = 0;
                }
                o00oo001.postValue(new Response(true, null, false, new Error(Integer.valueOf(i), str2), 6, null));
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@Nullable String str) {
                CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) oOOO00.OooO0O0(str, new TypeToken<CommonParseMultiListModel<RoomIndexFollowingModel>>() { // from class: com.yalla.yalla.ui.vm.main.MainRoomRelatedViewModel$loadFollowingRoomList$1$1$onFinish$resultModel$1
                }.getType());
                boolean z = true;
                vm.f56525OooO0OO++;
                Object obj = commonParseMultiListModel != null ? commonParseMultiListModel.data : null;
                Collection collection = commonParseMultiListModel != null ? commonParseMultiListModel.data : null;
                if (collection != null && !collection.isEmpty()) {
                    z = false;
                }
                o00oo001.postValue(new Response(true, obj, z, null, 8, null));
            }
        };
        LinkedHashMap linkedHashMapOooO00o = OooOOOO.OooO00o();
        linkedHashMapOooO00o.put("pageindex", strValueOf);
        linkedHashMapOooO00o.put("pagesize", vm.f56523OooO00o + "");
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43372Oooo0oO, linkedHashMapOooO00o, oooO0O0);
        o00oo001.observe(this, new Observer(this) { // from class: o0o0OO.OooOOO0

            /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
            public final /* synthetic */ MainRoomMineFollowingFragment f53217OooO0o0;

            {
                this.f53217OooO0o0 = this;
            }

            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MainRoomMineFollowingFragment.loadFollowingRoomList$lambda$7(isRefresh, this.f53217OooO0o0, (Response) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadFollowingRoomList$lambda$7(boolean z, MainRoomMineFollowingFragment this$0, Response response) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (response.getIsSuccess()) {
            if (z) {
                Collection collection = (Collection) response.getData();
                if (collection == null || collection.isEmpty()) {
                    this$0.loadRecommendRoomList();
                    return;
                }
                o00Ooo o00ooo2 = this$0.followingAdapter;
                if (o00ooo2 != null) {
                    o00ooo2.f50616Oooo000 = false;
                }
                if (o00ooo2 != null) {
                    o00ooo2.OooOoO0((List) response.getData());
                }
                o00Ooo o00ooo3 = this$0.followingAdapter;
                if (o00ooo3 != null) {
                    o00ooo3.OooOOoo();
                }
                o00Ooo o00ooo4 = this$0.followingAdapter;
                if (o00ooo4 != null && o00ooo4.OooOO0O() != 0) {
                    o00ooo4.f13181OooOO0O.removeAllViews();
                    int iOooOO0o = o00ooo4.OooOO0o();
                    if (iOooOO0o != -1) {
                        o00ooo4.notifyItemRemoved(iOooOO0o);
                    }
                }
                this$0.getBinding().f44806OooO0OO.OooOO0o(true);
            } else if (response.getData() != null) {
                o00Ooo o00ooo5 = this$0.followingAdapter;
                if (o00ooo5 != null) {
                    o00ooo5.Oooo0oO((List) response.getData());
                }
                o00Ooo o00ooo6 = this$0.followingAdapter;
                if (o00ooo6 != null) {
                    Object data = response.getData();
                    Intrinsics.checkNotNull(data);
                    o00ooo6.OooO0O0((Collection) data);
                }
            }
        }
        this$0.getBinding().f44806OooO0OO.OooOooO(z, response.getIsSuccess());
        o00Ooo o00ooo7 = this$0.followingAdapter;
        if (o00ooo7 != null) {
            o00ooo7.Oooo0(Boolean.valueOf(z), Boolean.valueOf(response.getIsSuccess()), Boolean.valueOf(response.getNoMoreData()));
        }
    }

    private final void loadRecommendRoomList() {
        getVm().getClass();
        final o00OO000 o00oo001 = new o00OO000();
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0 oooO0O0 = new com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0() { // from class: com.yalla.yalla.ui.vm.main.MainRoomRelatedViewModel$loadRecommendRoom$1$1
            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0O0(@NotNull String code, @NotNull String message) {
                int i;
                Intrinsics.checkNotNullParameter(code, "code");
                Intrinsics.checkNotNullParameter(message, "message");
                super.OooO0O0(code, message);
                if (code != null) {
                    try {
                        i = Integer.parseInt(code);
                    } catch (Exception unused) {
                        i = 1;
                    }
                } else {
                    i = 0;
                }
                o00oo001.postValue(new Response(false, null, false, new Error(Integer.valueOf(i), message), 6, null));
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@NotNull String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) oOOO00.OooO0O0(response, new TypeToken<CommonParseMultiListModel<RoomIndexFollowingModel>>() { // from class: com.yalla.yalla.ui.vm.main.MainRoomRelatedViewModel$loadRecommendRoom$1$1$onFinish$type$1
                }.getType());
                o00oo001.postValue(new Response(true, commonParseMultiListModel != null ? commonParseMultiListModel.data : null, false, null, 12, null));
            }
        };
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, Oooo0.f43359OooOoo, Oooo0.f43435o00oO0o, OooOOOO.OooO00o(), oooO0O0);
        o00oo001.observe(this, new o000000O(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadRecommendRoomList$lambda$8(MainRoomMineFollowingFragment this$0, Response response) {
        o00Ooo o00ooo2;
        o00Ooo o00ooo3;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o00Ooo o00ooo4 = this$0.followingAdapter;
        if (o00ooo4 != null) {
            o00ooo4.f50616Oooo000 = true;
        }
        if (o00ooo4 != null) {
            o00ooo4.OooOoO0((List) response.getData());
        }
        View view = this$0.emptyHeaderView;
        if ((view != null ? view.getParent() : null) == null && (o00ooo3 = this$0.followingAdapter) != null) {
            o00ooo3.OooOo(this$0.emptyHeaderView);
        }
        View view2 = this$0.emptyFooterView;
        if ((view2 != null ? view2.getParent() : null) == null && (o00ooo2 = this$0.followingAdapter) != null) {
            o00ooo2.OooOo0O(this$0.emptyFooterView);
        }
        this$0.getBinding().f44806OooO0OO.OooOooO(true, response.getIsSuccess());
        o00Ooo o00ooo5 = this$0.followingAdapter;
        if (o00ooo5 != null) {
            Boolean bool = Boolean.TRUE;
            o00ooo5.Oooo0(bool, Boolean.valueOf(response.getIsSuccess()), bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onLazyInit$lambda$0(MainRoomMineFollowingFragment this$0, Object obj) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getIsLazyInit()) {
            this$0.getBinding().f44805OooO0O0.scrollToPosition(0);
            this$0.getBinding().f44806OooO0OO.OooO();
            this$0.loadFollowingRoomList(true);
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
        loadFollowingRoomList(true);
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooOo0O().observe(this, new OooO(new OooO0o()));
        LiveEventBus.get("JoinOrFollowRoom_Update").observe(this, new o00000O0(this, 1));
    }

    @Override // p527o0o0OO0o.o000O, p586o0oOooO0.oO0Oo0o0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0oo0000.OooO00o.OooO0O0("201002");
        if (this.needReInit && getIsLazyInit()) {
            this.needReInit = false;
            initView();
            loadFollowingRoomList(true);
        }
    }

    public final void scroolToTop() {
        getBinding().f44805OooO0O0.scrollToPosition(0);
        getBinding().f44806OooO0OO.OooOoOO();
    }

    public final void setNeedReInit(boolean z) {
        this.needReInit = z;
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oO00OO0O getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oO00OO0O oo00oo0oInflate = oO00OO0O.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(oo00oo0oInflate, "inflate(...)");
        return oo00oo0oInflate;
    }
}
