package com.yalla.yalla.ui.fragment;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.constant.EnterRoomParentPage;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.room.RoomIndexModel;
import com.yalla.yalla.ui.adapter.room.RoomBaseAdapter;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import com.yalla.yalla.ui.vm.main.SearchVM;
import java.util.List;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
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
import p405o0Oo0OOO.oO00OOo0;
import p405o0Oo0OOO.oO00o000;
import p405o0Oo0OOO.oOOoOOO0;
import p643o0ooOOOO.k3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bD\u0010EJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0003J\b\u0010\u0011\u001a\u00020\fH\u0002J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R!\u00101\u001a\b\u0012\u0004\u0012\u00020-0,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010 \u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010 \u001a\u0004\b=\u0010:R!\u0010C\u001a\b\u0012\u0004\u0012\u00020-0?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010 \u001a\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MainSearchRoomFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/oO00OOo0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "loadRecommendRoom", "observerSearchText", "initView", "initSearchHistory", "", ViewHierarchyConstants.TEXT_KEY, "", "isRefresh", "searchRoom", "Lkotlin/Function0;", "onScrollListener", "Lkotlin/jvm/functions/Function0;", "getOnScrollListener", "()Lkotlin/jvm/functions/Function0;", "setOnScrollListener", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/yalla/yalla/ui/vm/main/SearchVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/SearchVM;", "vm", "searchText", "Ljava/lang/String;", "", "pageIndex", "I", "Landroidx/recyclerview/widget/ConcatAdapter;", "adapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "Lo0oOoO0/o0000oo;", "Lcom/yalla/yalla/model/room/RoomIndexModel;", "searchAdapter$delegate", "getSearchAdapter", "()Lo0oOoO0/o0000oo;", "searchAdapter", "Lo0Oo0OOO/oOOoOOO0;", "historyInflate$delegate", "getHistoryInflate", "()Lo0Oo0OOO/oOOoOOO0;", "historyInflate", "Lo0ooOOOO/k3;", "historyAdapter$delegate", "getHistoryAdapter", "()Lo0ooOOOO/k3;", "historyAdapter", "recommendTitleAdapter$delegate", "getRecommendTitleAdapter", "recommendTitleAdapter", "Lcom/yalla/yalla/ui/adapter/room/RoomBaseAdapter;", "recommendAdapter$delegate", "getRecommendAdapter", "()Lcom/yalla/yalla/ui/adapter/room/RoomBaseAdapter;", "recommendAdapter", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"NotifyDataSetChanged"})
@SourceDebugExtension({"SMAP\nMainSearchRoomFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSearchRoomFragment.kt\ncom/yalla/yalla/ui/fragment/MainSearchRoomFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,301:1\n172#2,9:302\n*S KotlinDebug\n*F\n+ 1 MainSearchRoomFragment.kt\ncom/yalla/yalla/ui/fragment/MainSearchRoomFragment\n*L\n53#1:302,9\n*E\n"})
public final class MainSearchRoomFragment extends p527o0o0OO0o.o000O<oO00OOo0> {
    public static final int $stable = 8;

    @Nullable
    private Function0<Unit> onScrollListener;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(SearchVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MainSearchRoomFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.MainSearchRoomFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f27710OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27710OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.MainSearchRoomFragment$special$$inlined$activityViewModels$default$3
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.requireActivity().getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "requireActivity().defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    });

    @NotNull
    private String searchText = "";
    private int pageIndex = 1;

    @NotNull
    private final ConcatAdapter adapter = new ConcatAdapter(new RecyclerView.Adapter[0]);

    /* JADX INFO: renamed from: searchAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy searchAdapter = LazyKt.lazy(new OooOOOO());

    /* JADX INFO: renamed from: historyInflate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy historyInflate = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: historyAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy historyAdapter = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: recommendTitleAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recommendTitleAdapter = LazyKt.lazy(new OooOOO0());

    /* JADX INFO: renamed from: recommendAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recommendAdapter = LazyKt.lazy(new OooOO0O());

    public static final class OooO extends Lambda implements Function1<List<? extends RoomIndexModel>, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends RoomIndexModel> list) {
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            mainSearchRoomFragment.getRecommendAdapter().OooOoO0(list);
            if (mainSearchRoomFragment.getRecommendAdapter().f13189OooOOoo.isEmpty() && mainSearchRoomFragment.getHistoryInflate().f45192OooO0Oo.getChildCount() == 0) {
                mainSearchRoomFragment.getBinding().f44816OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.no_data));
                mainSearchRoomFragment.getBinding().f44816OooO0Oo.OooO0o0();
            } else {
                mainSearchRoomFragment.getBinding().f44816OooO0Oo.OooO0Oo();
            }
            mainSearchRoomFragment.getBinding().f44814OooO0O0.OooOoOO(true, true, true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<k3> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final k3 invoke() {
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            FrameLayout frameLayout = mainSearchRoomFragment.getHistoryInflate().f45189OooO00o;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
            k3 k3Var = new k3(frameLayout);
            mainSearchRoomFragment.adapter.OooO0O0(k3Var);
            return k3Var;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<oOOoOOO0> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oOOoOOO0 invoke() {
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            oOOoOOO0 ooooooo0Inflate = oOOoOOO0.inflate(mainSearchRoomFragment.getLayoutInflater());
            ooooooo0Inflate.f45191OooO0OO.setOnClickListener(new com.google.android.material.textfield.OooOOOO(mainSearchRoomFragment, 2));
            return ooooooo0Inflate;
        }
    }

    public static final class OooO0OO extends Lambda implements Function1<List<? extends SearchHistoryTable>, Unit> {
        public OooO0OO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends SearchHistoryTable> list) {
            List<? extends SearchHistoryTable> list2 = list;
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            mainSearchRoomFragment.getHistoryInflate().f45192OooO0Oo.removeAllViews();
            for (SearchHistoryTable searchHistoryTable : list2) {
                View viewInflate = View.inflate(mainSearchRoomFragment.getContext(), p562o0oOo000.oo0o0Oo.tv_search_history, null);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(p562o0oOo000.o0OO00O.tag_item_relative);
                final TextView textView = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tag_item);
                textView.setText(searchHistoryTable.getTag());
                textView.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_round_bg_white_r16);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.o0O0O00
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LiveEventBus.get("MainSearchSetText").post(textView.getText().toString());
                    }
                });
                mainSearchRoomFragment.getHistoryInflate().f45192OooO0Oo.addView(relativeLayout);
            }
            if (list2.isEmpty()) {
                mainSearchRoomFragment.adapter.OooO0Oo(mainSearchRoomFragment.getHistoryAdapter());
                mainSearchRoomFragment.adapter.notifyDataSetChanged();
            } else if (StringsKt.isBlank(mainSearchRoomFragment.searchText)) {
                mainSearchRoomFragment.adapter.OooO00o(0, mainSearchRoomFragment.getHistoryAdapter());
                mainSearchRoomFragment.adapter.notifyDataSetChanged();
            }
            if (mainSearchRoomFragment.getRecommendAdapter().f13189OooOOoo.isEmpty() && mainSearchRoomFragment.getHistoryInflate().f45192OooO0Oo.getChildCount() == 0) {
                mainSearchRoomFragment.getBinding().f44816OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.no_data));
                mainSearchRoomFragment.getBinding().f44816OooO0Oo.OooO0o0();
            } else {
                mainSearchRoomFragment.getBinding().f44816OooO0Oo.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<Unit> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            String str = mainSearchRoomFragment.searchText;
            mainSearchRoomFragment.getBinding().f44816OooO0Oo.OooO0oo();
            mainSearchRoomFragment.searchRoom(str, true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiError, Unit> {
        public OooOO0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            mainSearchRoomFragment.getBinding().f44816OooO0Oo.OooO0o();
            mainSearchRoomFragment.getBinding().f44814OooO0O0.OooOoOO(true, true, true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function0<RoomBaseAdapter<RoomIndexModel>> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomBaseAdapter<RoomIndexModel> invoke() {
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            RoomBaseAdapter<RoomIndexModel> roomBaseAdapter = new RoomBaseAdapter<>(mainSearchRoomFragment.getContext());
            roomBaseAdapter.f13184OooOOO0 = false;
            roomBaseAdapter.f27242OooOooo = EnterRoomParentPage.Search_RecommendRoom;
            mainSearchRoomFragment.adapter.OooO0O0(mainSearchRoomFragment.getRecommendTitleAdapter());
            mainSearchRoomFragment.adapter.OooO0O0(roomBaseAdapter);
            return roomBaseAdapter;
        }
    }

    public static final class OooOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27700OooO0Oo;

        public OooOOO(OooO0OO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27700OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27700OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27700OooO0Oo;
        }

        public final int hashCode() {
            return this.f27700OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27700OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<k3> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final k3 invoke() {
            FrameLayout frameLayout = oO00o000.inflate(MainSearchRoomFragment.this.getLayoutInflater()).f44832OooO00o;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
            return new k3(frameLayout);
        }
    }

    public static final class OooOOOO extends Lambda implements Function0<o000000> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000000 invoke() {
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            return new o000000(mainSearchRoomFragment, mainSearchRoomFragment.getContext(), p562o0oOo000.oo0o0Oo.item_search_room_search);
        }
    }

    public static final class OooOo extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f27703OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainSearchRoomFragment f27704OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MainSearchRoomFragment mainSearchRoomFragment, boolean z) {
            super(1);
            this.f27703OooO0Oo = z;
            this.f27704OooO0o0 = mainSearchRoomFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f27703OooO0Oo) {
                this.f27704OooO0o0.getBinding().f44816OooO0Oo.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<List<? extends RoomIndexModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f27706OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(boolean z) {
            super(1);
            this.f27706OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends RoomIndexModel> list) {
            List<? extends RoomIndexModel> list2 = list;
            boolean z = this.f27706OooO0o0;
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            if (list2 != null) {
                if (z) {
                    mainSearchRoomFragment.getSearchAdapter().OooOoO0(list2);
                } else {
                    mainSearchRoomFragment.getSearchAdapter().OooO0O0(list2);
                }
            }
            mainSearchRoomFragment.adapter.notifyDataSetChanged();
            if (mainSearchRoomFragment.getSearchAdapter().f13189OooOOoo.isEmpty()) {
                mainSearchRoomFragment.getBinding().f44816OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.No_search_results));
                mainSearchRoomFragment.getBinding().f44816OooO0Oo.OooO0o0();
            } else {
                if (z) {
                    mainSearchRoomFragment.getBinding().f44815OooO0OO.scrollToPosition(0);
                }
                mainSearchRoomFragment.getBinding().f44816OooO0Oo.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<ApiResult<List<? extends RoomIndexModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f27708OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(boolean z) {
            super(1);
            this.f27708OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<? extends RoomIndexModel>> apiResult) {
            ApiResult<List<? extends RoomIndexModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            RefreshLayout refreshLayout = mainSearchRoomFragment.getBinding().f44814OooO0O0;
            boolean zIsSuccess = it.isSuccess();
            List<? extends RoomIndexModel> data = it.getData();
            refreshLayout.OooOoOO(this.f27708OooO0o0, zIsSuccess, data == null || data.isEmpty());
            if (it.isSuccess()) {
                mainSearchRoomFragment.pageIndex++;
                List<T> list = mainSearchRoomFragment.getSearchAdapter().f13189OooOOoo;
                Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
                p423o0OoO0OO.o0000OO0.OooO0OO(list, o000000O.f28361OooO0Oo);
                mainSearchRoomFragment.getSearchAdapter().notifyDataSetChanged();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k3 getHistoryAdapter() {
        return (k3) this.historyAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oOOoOOO0 getHistoryInflate() {
        return (oOOoOOO0) this.historyInflate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoomBaseAdapter<RoomIndexModel> getRecommendAdapter() {
        return (RoomBaseAdapter) this.recommendAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k3 getRecommendTitleAdapter() {
        return (k3) this.recommendTitleAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p571o0oOoO0.o0000oo<RoomIndexModel> getSearchAdapter() {
        return (p571o0oOoO0.o0000oo) this.searchAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchVM getVm() {
        return (SearchVM) this.vm.getValue();
    }

    private final void initSearchHistory() {
        getVm().getSearchHistoryList().observe(getViewLifecycleOwner(), new OooOOO(new OooO0OO()));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initView() {
        getBinding().f44814OooO0O0.OooOoo0(new androidx.compose.ui.graphics.colorspace.OooO0O0(this));
        initSearchHistory();
        getBinding().f44815OooO0OO.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f44815OooO0OO.setAdapter(this.adapter);
        getBinding().f44815OooO0OO.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.fragment.oo0o0Oo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MainSearchRoomFragment.initView$lambda$2(this.f28425OooO0Oo, view, motionEvent);
            }
        });
        getBinding().f44816OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.No_search_results));
        getBinding().f44816OooO0Oo.setEmptyImage(p562o0oOo000.o0Oo0oo.ic_empty_search);
        StateLayout stateLayout = getBinding().f44816OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new OooO0o(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MainSearchRoomFragment this$0, o0OO0oO0.OooOOO0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!StringsKt.isBlank(this$0.searchText)) {
            this$0.searchRoom(this$0.searchText, false);
        } else {
            this$0.getBinding().f44814OooO0O0.OooOO0O(true);
            this$0.getBinding().f44814OooO0O0.setLoadSuccess(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$2(MainSearchRoomFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onScrollListener;
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return false;
    }

    private final void loadRecommendRoom() {
        getVm().loadRecommendRoom().observe(getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new OooO(), new OooOO0(), null, false, 12));
    }

    private final void observerSearchText() {
        LiveEventBus.get("MainSearch", String.class).observe(getViewLifecycleOwner(), new o0OO00O(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observerSearchText$lambda$0(MainSearchRoomFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str == null || StringsKt.isBlank(str)) {
            this$0.getBinding().f44816OooO0Oo.OooO0Oo();
            this$0.adapter.OooO0Oo(this$0.getSearchAdapter());
            this$0.getSearchAdapter().OooOoO0(null);
            this$0.adapter.OooO0O0(this$0.getHistoryAdapter());
            this$0.adapter.OooO0O0(this$0.getRecommendTitleAdapter());
            this$0.adapter.OooO0O0(this$0.getRecommendAdapter());
            this$0.adapter.notifyDataSetChanged();
            this$0.getBinding().f44814OooO0O0.OooOo00(false);
        } else {
            this$0.adapter.OooO0Oo(this$0.getHistoryAdapter());
            this$0.adapter.OooO0Oo(this$0.getRecommendTitleAdapter());
            this$0.adapter.OooO0Oo(this$0.getRecommendAdapter());
            this$0.adapter.OooO0O0(this$0.getSearchAdapter());
            if (StringsKt.isBlank(this$0.searchText)) {
                this$0.getBinding().f44816OooO0Oo.OooO0oo();
            }
            Intrinsics.checkNotNull(str);
            this$0.searchRoom(str, true);
        }
        this$0.searchText = com.code.android.util.o0OoOo0.OooOOO(str, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchRoom(String text, boolean isRefresh) {
        if (isRefresh) {
            this.pageIndex = 1;
        }
        getVm().searchRoom(text, this.pageIndex).observe(getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new OooOo00(isRefresh), new OooOo(this, isRefresh), new Oooo000(isRefresh), false, 8));
    }

    @Nullable
    public final Function0<Unit> getOnScrollListener() {
        return this.onScrollListener;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadRecommendRoom();
        observerSearchText();
    }

    public final void setOnScrollListener(@Nullable Function0<Unit> function0) {
        this.onScrollListener = function0;
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oO00OOo0 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oO00OOo0 oo00ooo0Inflate = oO00OOo0.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(oo00ooo0Inflate, "inflate(...)");
        return oo00ooo0Inflate;
    }
}
