package com.yalla.yalla.ui.fragment.mainroom;

import android.app.Activity;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o000O0o;
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
import com.code.android.util.o000O0;
import com.code.android.util.o000O00;
import com.code.android.util.o000Oo0;
import com.google.gson.reflect.TypeToken;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.squareup.okhttp.OooOo;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.model.CommonParseMultiListModel;
import com.yalla.yalla.model.http.Error;
import com.yalla.yalla.model.http.Response;
import com.yalla.yalla.model.room.RoomIndexFollowingModel;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.fragment.ContributionFragment;
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
import p377o0OOoOo.o0000O;
import p377o0OOoOo.o000O00O;
import p377o0OOoOo.o000O0O0;
import p420o0OoO0OO.o0OOO0o;
import p464o0Oooo.o000000O;
import p466o0Oooo0o.oo00o;
import p474o0o00.o0O0000O;
import p496o0o00o.oO0O0O00;
import p500o0o00oO.o000000;
import p573o0oOoOOO.oO0O0Oo0;
import p573o0oOoOOO.oOo0o0oO;
import p573o0oOoOOO.ooOOO0Oo;
import p579o0oOoo.oO0OOO00;
import p579o0oOoo.oOo00OO0;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p587o0oOooo.o0OO000;
import p640o0ooOOO0.oO00o000;
import p641o0ooOOOO.l4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b.\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\u000b\u001a\u00020\u00032\u0016\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\tH\u0002J\u0012\u0010\r\u001a\u00020\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u0002J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0003H\u0002J\u001a\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0014J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u0006\u0010\u0019\u001a\u00020\u0003R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010$\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\"R\"\u0010(\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u00060"}, d2 = {"Lcom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/l4;", "", "initView", "", "barid", "followRoom", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "list", "followAllRoom", ContributionFragment.ARG_1, "changeFollowState", "", "isRefresh", "loadFollowingRoomList", "loadRecommendRoomList", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "onLazyInit", "onResume", "scroolToTop", "Lo0oOoOOO/oOo0o0oO;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lo0oOoOOO/oOo0o0oO;", "vm", "Landroid/view/View;", "rootView", "Landroid/view/View;", "Lo0o00oO/o000000;", "followingAdapter", "Lo0o00oO/o000000;", "emptyHeaderView", "emptyFooterView", "needReInit", "Z", "getNeedReInit", "()Z", "setNeedReInit", "(Z)V", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMainRoomMineFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomMineFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n106#2,15:208\n1864#3,3:223\n*S KotlinDebug\n*F\n+ 1 MainRoomMineFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment\n*L\n38#1:208,15\n150#1:223,3\n*E\n"})
public final class MainRoomMineFollowingFragment extends p508o0o0O.OooOO0O<l4> {
    public static final int $stable = 8;

    @Nullable
    private View emptyFooterView;

    @Nullable
    private View emptyHeaderView;

    @Nullable
    private o000000 followingAdapter;
    private boolean needReInit;
    private View rootView;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm;

    public static final class OooO extends oo00o {

        @SourceDebugExtension({"SMAP\nMainRoomMineFollowingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainRoomMineFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment$initView$5$onNoDoubleClick$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1855#2,2:208\n*S KotlinDebug\n*F\n+ 1 MainRoomMineFollowingFragment.kt\ncom/yalla/yalla/ui/fragment/mainroom/MainRoomMineFollowingFragment$initView$5$onNoDoubleClick$1\n*L\n113#1:208,2\n*E\n"})
        public static final class OooO00o extends Lambda implements Function0<Unit> {

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ MainRoomMineFollowingFragment f28415OooO0Oo;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public OooO00o(MainRoomMineFollowingFragment mainRoomMineFollowingFragment) {
                super(0);
                this.f28415OooO0Oo = mainRoomMineFollowingFragment;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Unit invoke() {
                Collection collection;
                ArrayList arrayList = new ArrayList();
                MainRoomMineFollowingFragment mainRoomMineFollowingFragment = this.f28415OooO0Oo;
                o000000 o000000Var = mainRoomMineFollowingFragment.followingAdapter;
                if (o000000Var != null && (collection = o000000Var.f10111OooOOoo) != null) {
                    Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((RoomIndexFollowingModel) it.next()).barid);
                    }
                }
                mainRoomMineFollowingFragment.followAllRoom(arrayList);
                return Unit.INSTANCE;
            }
        }

        public OooO() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            OooO00o onLogin = new OooO00o(MainRoomMineFollowingFragment.this);
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
                return;
            }
            Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
            if (activityOooO0O0 != null) {
                int i = LoginActivity.f25186OooOo0O;
                LoginActivity.OooO00o.OooO00o(activityOooO0O0);
            }
        }
    }

    public static final class OooO00o implements Observer<Response<List<? extends RoomIndexFollowingModel>>> {
        public OooO00o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Response<List<? extends RoomIndexFollowingModel>> response) {
            MainRoomMineFollowingFragment.this.loadFollowingRoomList(true);
        }
    }

    public static final class OooO0O0 implements Observer<Response<String>> {
        public OooO0O0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Response<String> response) {
            Response<String> response2 = response;
            if (response2.getIsSuccess()) {
                MainRoomMineFollowingFragment.this.changeFollowState(response2.getData());
            }
        }
    }

    public static final class OooO0OO extends oo00o {
        public OooO0OO() {
        }

        @Override // p466o0Oooo0o.oo00o
        public final void OooO00o(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            MainRoomMineFollowingFragment mainRoomMineFollowingFragment = MainRoomMineFollowingFragment.this;
            o000000 o000000Var = mainRoomMineFollowingFragment.followingAdapter;
            if (o000000Var != null) {
                o000000Var.Oooo00O(true);
            }
            mainRoomMineFollowingFragment.loadFollowingRoomList(true);
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ int f28420OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO0o(int i) {
            super(0);
            this.f28420OooO0o0 = i;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            List<T> list;
            RoomIndexFollowingModel roomIndexFollowingModel;
            o0OO000.OooO00o("101030");
            MainRoomMineFollowingFragment mainRoomMineFollowingFragment = MainRoomMineFollowingFragment.this;
            o000000 o000000Var = mainRoomMineFollowingFragment.followingAdapter;
            if (o000000Var != null && (list = o000000Var.f10111OooOOoo) != 0 && (roomIndexFollowingModel = (RoomIndexFollowingModel) list.get(this.f28420OooO0o0)) != null) {
                String str = roomIndexFollowingModel.barid;
                Intrinsics.checkNotNullExpressionValue(str, "it.barid");
                mainRoomMineFollowingFragment.followRoom(str);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 implements Observer<Response<List<? extends RoomIndexFollowingModel>>> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28421OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainRoomMineFollowingFragment f28422OooO0o0;

        public OooOO0(MainRoomMineFollowingFragment mainRoomMineFollowingFragment, boolean z) {
            this.f28421OooO0Oo = z;
            this.f28422OooO0o0 = mainRoomMineFollowingFragment;
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Response<List<? extends RoomIndexFollowingModel>> response) {
            Response<List<? extends RoomIndexFollowingModel>> response2 = response;
            boolean isSuccess = response2.getIsSuccess();
            boolean z = this.f28421OooO0Oo;
            MainRoomMineFollowingFragment mainRoomMineFollowingFragment = this.f28422OooO0o0;
            if (isSuccess) {
                if (z) {
                    List<? extends RoomIndexFollowingModel> data = response2.getData();
                    if (data == null || data.isEmpty()) {
                        mainRoomMineFollowingFragment.loadRecommendRoomList();
                        return;
                    }
                    o000000 o000000Var = mainRoomMineFollowingFragment.followingAdapter;
                    if (o000000Var != null) {
                        o000000Var.f49422Oooo000 = false;
                    }
                    o000000 o000000Var2 = mainRoomMineFollowingFragment.followingAdapter;
                    if (o000000Var2 != null) {
                        o000000Var2.OooOoO0(response2.getData());
                    }
                    o000000 o000000Var3 = mainRoomMineFollowingFragment.followingAdapter;
                    if (o000000Var3 != null) {
                        o000000Var3.OooOOoo();
                    }
                    o000000 o000000Var4 = mainRoomMineFollowingFragment.followingAdapter;
                    if (o000000Var4 != null && o000000Var4.OooOO0O() != 0) {
                        o000000Var4.f10103OooOO0O.removeAllViews();
                        int iOooOO0o = o000000Var4.OooOO0o();
                        if (iOooOO0o != -1) {
                            o000000Var4.notifyItemRemoved(iOooOO0o);
                        }
                    }
                    mainRoomMineFollowingFragment.getBinding().f58332OooO0OO.OooOO0o(true);
                } else if (response2.getData() != null) {
                    o000000 o000000Var5 = mainRoomMineFollowingFragment.followingAdapter;
                    if (o000000Var5 != null) {
                        o000000Var5.Oooo0oO(response2.getData());
                    }
                    o000000 o000000Var6 = mainRoomMineFollowingFragment.followingAdapter;
                    if (o000000Var6 != null) {
                        List<? extends RoomIndexFollowingModel> data2 = response2.getData();
                        Intrinsics.checkNotNull(data2);
                        o000000Var6.OooO0O0(data2);
                    }
                }
            }
            mainRoomMineFollowingFragment.getBinding().f58332OooO0OO.OooOooO(z, response2.getIsSuccess());
            o000000 o000000Var7 = mainRoomMineFollowingFragment.followingAdapter;
            if (o000000Var7 != null) {
                o000000Var7.Oooo0(Boolean.valueOf(z), Boolean.valueOf(response2.getIsSuccess()), Boolean.valueOf(response2.getNoMoreData()));
            }
        }
    }

    public static final class OooOO0O implements Observer<Response<List<? extends RoomIndexFollowingModel>>> {
        public OooOO0O() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Response<List<? extends RoomIndexFollowingModel>> response) {
            o000000 o000000Var;
            o000000 o000000Var2;
            Response<List<? extends RoomIndexFollowingModel>> response2 = response;
            MainRoomMineFollowingFragment mainRoomMineFollowingFragment = MainRoomMineFollowingFragment.this;
            o000000 o000000Var3 = mainRoomMineFollowingFragment.followingAdapter;
            if (o000000Var3 != null) {
                o000000Var3.f49422Oooo000 = true;
            }
            o000000 o000000Var4 = mainRoomMineFollowingFragment.followingAdapter;
            if (o000000Var4 != null) {
                o000000Var4.OooOoO0(response2.getData());
            }
            View view = mainRoomMineFollowingFragment.emptyHeaderView;
            if ((view != null ? view.getParent() : null) == null && (o000000Var2 = mainRoomMineFollowingFragment.followingAdapter) != null) {
                o000000Var2.OooOo(mainRoomMineFollowingFragment.emptyHeaderView);
            }
            View view2 = mainRoomMineFollowingFragment.emptyFooterView;
            if ((view2 != null ? view2.getParent() : null) == null && (o000000Var = mainRoomMineFollowingFragment.followingAdapter) != null) {
                o000000Var.OooOo0O(mainRoomMineFollowingFragment.emptyFooterView);
            }
            mainRoomMineFollowingFragment.getBinding().f58332OooO0OO.OooOooO(true, response2.getIsSuccess());
            o000000 o000000Var5 = mainRoomMineFollowingFragment.followingAdapter;
            if (o000000Var5 != null) {
                Boolean bool = Boolean.TRUE;
                o000000Var5.Oooo0(bool, Boolean.valueOf(response2.getIsSuccess()), bool);
            }
        }
    }

    public static final class OooOOO implements Observer<Object> {
        public OooOOO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Object obj) {
            MainRoomMineFollowingFragment mainRoomMineFollowingFragment = MainRoomMineFollowingFragment.this;
            if (mainRoomMineFollowingFragment.getIsLazyInit()) {
                mainRoomMineFollowingFragment.getBinding().f58331OooO0O0.scrollToPosition(0);
                mainRoomMineFollowingFragment.getBinding().f58332OooO0OO.OooO();
                mainRoomMineFollowingFragment.loadFollowingRoomList(true);
            }
        }
    }

    public static final class OooOOO0 extends Lambda implements Function1<Boolean, Unit> {
        public OooOOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean it = bool;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            if (it.booleanValue()) {
                MainRoomMineFollowingFragment.this.loadFollowingRoomList(true);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28426OooO0Oo;

        public OooOOOO(OooOOO0 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28426OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28426OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28426OooO0Oo;
        }

        public final int hashCode() {
            return this.f28426OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28426OooO0Oo.invoke(obj);
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
        this.vm = o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(oOo0o0oO.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$3
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final ViewModelStore invoke() {
                return o000O0o.OooO00o(lazy).getViewModelStore();
            }
        }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.mainroom.MainRoomMineFollowingFragment$special$$inlined$viewModels$default$4

            /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
            public final /* synthetic */ Function0 f28430OooO0Oo = null;

            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public final CreationExtras invoke() {
                CreationExtras creationExtras;
                Function0 function0 = this.f28430OooO0Oo;
                if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                    return creationExtras;
                }
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
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
                ViewModelStoreOwner viewModelStoreOwnerOooO00o = o000O0o.OooO00o(lazy);
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

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeFollowState(String roomId) {
        o000000 o000000Var;
        Collection collection;
        o000000 o000000Var2 = this.followingAdapter;
        if (OooOo00.OooO00o(o000000Var2 != null ? o000000Var2.f10111OooOOoo : null) || OooOo00.OooO00o(roomId) || (o000000Var = this.followingAdapter) == null || (collection = o000000Var.f10111OooOOoo) == null) {
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
                o000000 o000000Var3 = this.followingAdapter;
                if (o000000Var3 != null) {
                    Intrinsics.checkNotNull(o000000Var3);
                    o000000Var3.notifyItemChanged(o000000Var3.OooOOO0() + i);
                }
                String strOooO0OO = o0000.OooO0OO(oO00OOo0.post_list_follow_succeed);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    o000Oo0 o000oo0OooO00o = o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        o000O0.f10355OooO0O0.post(o000oo0OooO00o);
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
            o0OOO0o o0ooo0o2 = new o0OOO0o();
            StringBuilder sb = new StringBuilder();
            for (String str : list) {
                sb.append(",");
                sb.append(str);
            }
            if (sb.length() > 1) {
                String strSubstring = sb.substring(1, sb.length());
                oO0O0Oo0 oo0o0oo0 = new oO0O0Oo0(o0ooo0o2);
                LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
                linkedHashMapOooO00o.put("barids", strSubstring);
                com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44104Oooo, linkedHashMapOooO00o, oo0o0oo0);
            }
            o0ooo0o2.observe(this, new OooO00o());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void followRoom(String barid) {
        getVm().getClass();
        Intrinsics.checkNotNullParameter(barid, "barid");
        o0OOO0o o0ooo0o2 = new o0OOO0o();
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        p377o0OOoOo.o000O00.OooO0O0(barid, false, new ooOOO0Oo(o0ooo0o2, barid));
        o0ooo0o2.observe(this, new OooO0O0());
    }

    private final oOo0o0oO getVm() {
        return (oOo0o0oO) this.vm.getValue();
    }

    private final void initView() {
        View viewFindViewById;
        getBinding().f58332OooO0OO.setOnRefreshListener(new p200o00o0o.o000000(this, 2));
        o000000 o000000Var = new o000000(getActivity());
        this.followingAdapter = o000000Var;
        o000000Var.f27704OooOooo = EnterRoomParentPage.Related_Following;
        o000000Var.f27701OooOoo = RoomBaseAdapter.PageSource.RoomRelatedFollowingFragment;
        o000000Var.OooOo0o();
        o000000 o000000Var2 = this.followingAdapter;
        if (o000000Var2 != null) {
            o000000Var2.OooOoO(new oO0O0O00(this, 1), getBinding().f58331OooO0O0);
        }
        o000000 o000000Var3 = this.followingAdapter;
        if (o000000Var3 != null) {
            o000000Var3.Oooo0OO(new OooO0OO());
        }
        o000000 o000000Var4 = this.followingAdapter;
        if (o000000Var4 != null) {
            o000000Var4.f10101OooO0oo = new o0O0000O(this);
        }
        getBinding().f58331OooO0O0.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f58331OooO0O0.setAdapter(this.followingAdapter);
        this.emptyHeaderView = View.inflate(getContext(), oO00OO0O.empty_main_related_follow, null);
        View viewInflate = View.inflate(getContext(), oO00OO0O.empty_main_related_follow_footer, null);
        this.emptyFooterView = viewInflate;
        if (viewInflate != null && (viewFindViewById = viewInflate.findViewById(oO00O0oO.bt_follow_all)) != null) {
            viewFindViewById.setOnClickListener(new OooO());
        }
        oO0OOO00 oo0ooo00 = oO0OOO00.f56606OooO00o;
        RecyclerView recyclerView = getBinding().f58331OooO0O0;
        Intrinsics.checkNotNullExpressionValue(recyclerView, "binding.rvMainRelated");
        oO0OOO00.OooO0O0(recyclerView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MainRoomMineFollowingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        OooOo.OooO0OO(158, null);
        this$0.loadFollowingRoomList(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MainRoomMineFollowingFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.loadFollowingRoomList(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(MainRoomMineFollowingFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view.getId() != oO00O0oO.ivFollow) {
            return;
        }
        OooO0o onLogin = this$0.new OooO0o(i);
        Intrinsics.checkNotNullParameter(onLogin, "onLogin");
        o000000O o000000o2 = o000000O.f46674OooO00o;
        if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
            onLogin.invoke();
            return;
        }
        Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
        if (activityOooO0O0 != null) {
            int i2 = LoginActivity.f25186OooOo0O;
            LoginActivity.OooO00o.OooO00o(activityOooO0O0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadFollowingRoomList(boolean isRefresh) {
        final oOo0o0oO vm = getVm();
        vm.getClass();
        final o0OOO0o o0ooo0o2 = new o0OOO0o();
        if (isRefresh) {
            vm.f56307OooO0OO = 1;
        }
        o000O00O o000o00o2 = o000O0O0.f44226OooO00o;
        String strValueOf = String.valueOf(vm.f56307OooO0OO);
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
                o0ooo0o2.postValue(new Response(true, null, false, new Error(Integer.valueOf(i), str2), 6, null));
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@Nullable String str) {
                CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) oOo00OO0.OooO0O0(str, new TypeToken<CommonParseMultiListModel<RoomIndexFollowingModel>>() { // from class: com.yalla.yalla.ui.vm.main.MainRoomRelatedViewModel$loadFollowingRoomList$1$1$onFinish$resultModel$1
                }.getType());
                boolean z = true;
                vm.f56307OooO0OO++;
                Object obj = commonParseMultiListModel != null ? commonParseMultiListModel.data : null;
                Collection collection = commonParseMultiListModel != null ? commonParseMultiListModel.data : null;
                if (collection != null && !collection.isEmpty()) {
                    z = false;
                }
                o0ooo0o2.postValue(new Response(true, obj, z, null, 8, null));
            }
        };
        LinkedHashMap linkedHashMapOooO00o = oO00o000.OooO00o();
        linkedHashMapOooO00o.put("pageindex", strValueOf);
        linkedHashMapOooO00o.put("pagesize", vm.f56305OooO00o + "");
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44113Oooo0oO, linkedHashMapOooO00o, oooO0O0);
        o0ooo0o2.observe(this, new OooOO0(this, isRefresh));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadRecommendRoomList() {
        getVm().getClass();
        final o0OOO0o o0ooo0o2 = new o0OOO0o();
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
                o0ooo0o2.postValue(new Response(false, null, false, new Error(Integer.valueOf(i), message), 6, null));
            }

            @Override // com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0, com.yalla.yalla.http.iteratehttp.OooO0OO.OooO00o
            public final void OooO0o0(@NotNull String response) {
                Intrinsics.checkNotNullParameter(response, "response");
                CommonParseMultiListModel commonParseMultiListModel = (CommonParseMultiListModel) oOo00OO0.OooO0O0(response, new TypeToken<CommonParseMultiListModel<RoomIndexFollowingModel>>() { // from class: com.yalla.yalla.ui.vm.main.MainRoomRelatedViewModel$loadRecommendRoom$1$1$onFinish$type$1
                }.getType());
                o0ooo0o2.postValue(new Response(true, commonParseMultiListModel != null ? commonParseMultiListModel.data : null, false, null, 12, null));
            }
        };
        com.yalla.yalla.http.iteratehttp.OooO0OO.OooO0O0(null, o0000O.f44100OooOoo, o0000O.f44176o00oO0o, oO00o000.OooO00o(), oooO0O0);
        o0ooo0o2.observe(this, new OooOO0O());
    }

    public final boolean getNeedReInit() {
        return this.needReInit;
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        this.needReInit = false;
        initView();
        loadFollowingRoomList(true);
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOo0O().observe(this, new OooOOOO(new OooOOO0()));
        LiveEventBus.get("JoinOrFollowRoom_Update").observe(this, new OooOOO());
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o0OO000.OooO00o("201002");
        if (this.needReInit && getIsLazyInit()) {
            this.needReInit = false;
            initView();
            loadFollowingRoomList(true);
        }
    }

    public final void scroolToTop() {
        getBinding().f58331OooO0O0.scrollToPosition(0);
        getBinding().f58332OooO0OO.OooOoOO();
    }

    public final void setNeedReInit(boolean z) {
        this.needReInit = z;
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public l4 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        l4 l4VarInflate = l4.inflate(inflater, container, false);
        Intrinsics.checkNotNullExpressionValue(l4VarInflate, "inflate(inflater, container, false)");
        return l4VarInflate;
    }
}
