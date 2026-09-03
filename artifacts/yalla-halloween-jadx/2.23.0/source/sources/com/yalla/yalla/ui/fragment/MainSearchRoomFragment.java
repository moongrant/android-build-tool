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
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.o4;
import p641o0ooOOOO.r4;
import p641o0ooOOOO.s4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bD\u0010EJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0003J\b\u0010\u0011\u001a\u00020\fH\u0002J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002R*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R!\u00101\u001a\b\u0012\u0004\u0012\u00020-0,8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010 \u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010 \u001a\u0004\b9\u0010:R\u001b\u0010>\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010 \u001a\u0004\b=\u0010:R!\u0010C\u001a\b\u0012\u0004\u0012\u00020-0?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010 \u001a\u0004\bA\u0010B¨\u0006F"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MainSearchRoomFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/o4;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "loadRecommendRoom", "observerSearchText", "initView", "initSearchHistory", "", ViewHierarchyConstants.TEXT_KEY, "", "isRefresh", "searchRoom", "Lkotlin/Function0;", "onScrollListener", "Lkotlin/jvm/functions/Function0;", "getOnScrollListener", "()Lkotlin/jvm/functions/Function0;", "setOnScrollListener", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/yalla/yalla/ui/vm/main/SearchVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/SearchVM;", "vm", "searchText", "Ljava/lang/String;", "", "pageIndex", "I", "Landroidx/recyclerview/widget/ConcatAdapter;", "adapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "Lo0oOo0OO/o000O;", "Lcom/yalla/yalla/model/room/RoomIndexModel;", "searchAdapter$delegate", "getSearchAdapter", "()Lo0oOo0OO/o000O;", "searchAdapter", "Lo0ooOOOO/r4;", "historyInflate$delegate", "getHistoryInflate", "()Lo0ooOOOO/r4;", "historyInflate", "Lo0Oo0OO/OooOOOO;", "historyAdapter$delegate", "getHistoryAdapter", "()Lo0Oo0OO/OooOOOO;", "historyAdapter", "recommendTitleAdapter$delegate", "getRecommendTitleAdapter", "recommendTitleAdapter", "Lcom/yalla/yalla/ui/adapter/room/RoomBaseAdapter;", "recommendAdapter$delegate", "getRecommendAdapter", "()Lcom/yalla/yalla/ui/adapter/room/RoomBaseAdapter;", "recommendAdapter", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"NotifyDataSetChanged"})
@SourceDebugExtension({"SMAP\nMainSearchRoomFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSearchRoomFragment.kt\ncom/yalla/yalla/ui/fragment/MainSearchRoomFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,301:1\n172#2,9:302\n*S KotlinDebug\n*F\n+ 1 MainSearchRoomFragment.kt\ncom/yalla/yalla/ui/fragment/MainSearchRoomFragment\n*L\n53#1:302,9\n*E\n"})
public final class MainSearchRoomFragment extends p508o0o0O.OooOO0O<o4> {
    public static final int $stable = 8;

    @Nullable
    private Function0<Unit> onScrollListener;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(SearchVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MainSearchRoomFragment$special$$inlined$activityViewModels$default$1
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
        public final /* synthetic */ Function0 f28193OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28193OooO0Oo;
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
    private final Lazy searchAdapter = LazyKt.lazy(new OooOo00());

    /* JADX INFO: renamed from: historyInflate$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy historyInflate = LazyKt.lazy(new OooO0O0());

    /* JADX INFO: renamed from: historyAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy historyAdapter = LazyKt.lazy(new OooO00o());

    /* JADX INFO: renamed from: recommendTitleAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recommendTitleAdapter = LazyKt.lazy(new OooOOO());

    /* JADX INFO: renamed from: recommendAdapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy recommendAdapter = LazyKt.lazy(new OooOOO0());

    public static final class OooO extends Lambda implements Function1<List<? extends RoomIndexModel>, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends RoomIndexModel> list) {
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            mainSearchRoomFragment.getRecommendAdapter().OooOoO0(list);
            if (mainSearchRoomFragment.getRecommendAdapter().f10111OooOOoo.isEmpty() && mainSearchRoomFragment.getHistoryInflate().f58723OooO0Oo.getChildCount() == 0) {
                mainSearchRoomFragment.getBinding().f58515OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.no_data));
                mainSearchRoomFragment.getBinding().f58515OooO0Oo.OooO0o0();
            } else {
                mainSearchRoomFragment.getBinding().f58515OooO0Oo.OooO0Oo();
            }
            mainSearchRoomFragment.getBinding().f58513OooO0O0.OooOoOO(true, true, true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<p400o0Oo0OO.OooOOOO> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p400o0Oo0OO.OooOOOO invoke() {
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            FrameLayout frameLayout = mainSearchRoomFragment.getHistoryInflate().f58720OooO00o;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "historyInflate.root");
            p400o0Oo0OO.OooOOOO oooOOOO = new p400o0Oo0OO.OooOOOO(frameLayout);
            mainSearchRoomFragment.adapter.OooO0O0(oooOOOO);
            return oooOOOO;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<r4> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r4 invoke() {
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            r4 r4VarInflate = r4.inflate(mainSearchRoomFragment.getLayoutInflater());
            r4VarInflate.f58722OooO0OO.setOnClickListener(new p358o0OOOooO.o00000O0(mainSearchRoomFragment, 1));
            return r4VarInflate;
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
            mainSearchRoomFragment.getHistoryInflate().f58723OooO0Oo.removeAllViews();
            for (SearchHistoryTable searchHistoryTable : list2) {
                View viewInflate = View.inflate(mainSearchRoomFragment.getContext(), oO00OO0O.tv_search_history, null);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(context, R.layout.tv_search_history, null)");
                RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(oO00O0oO.tag_item_relative);
                final TextView textView = (TextView) viewInflate.findViewById(oO00O0oO.tag_item);
                textView.setText(searchHistoryTable.getTag());
                textView.setBackgroundResource(oOo00OO0.bg_round_bg_white_r16);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.o0OO00O
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LiveEventBus.get("MainSearchSetText").post(textView.getText().toString());
                    }
                });
                mainSearchRoomFragment.getHistoryInflate().f58723OooO0Oo.addView(relativeLayout);
            }
            if (list2.isEmpty()) {
                mainSearchRoomFragment.adapter.OooO0Oo(mainSearchRoomFragment.getHistoryAdapter());
                mainSearchRoomFragment.adapter.notifyDataSetChanged();
            } else if (StringsKt.isBlank(mainSearchRoomFragment.searchText)) {
                mainSearchRoomFragment.adapter.OooO00o(0, mainSearchRoomFragment.getHistoryAdapter());
                mainSearchRoomFragment.adapter.notifyDataSetChanged();
            }
            if (mainSearchRoomFragment.getRecommendAdapter().f10111OooOOoo.isEmpty() && mainSearchRoomFragment.getHistoryInflate().f58723OooO0Oo.getChildCount() == 0) {
                mainSearchRoomFragment.getBinding().f58515OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.no_data));
                mainSearchRoomFragment.getBinding().f58515OooO0Oo.OooO0o0();
            } else {
                mainSearchRoomFragment.getBinding().f58515OooO0Oo.OooO0Oo();
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
            mainSearchRoomFragment.getBinding().f58515OooO0Oo.OooO0oo();
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
            mainSearchRoomFragment.getBinding().f58515OooO0Oo.OooO0o();
            mainSearchRoomFragment.getBinding().f58513OooO0O0.OooOoOO(true, true, true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O implements Observer<String> {
        public OooOO0O() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(String str) {
            String text = str;
            boolean z = text == null || StringsKt.isBlank(text);
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            if (z) {
                mainSearchRoomFragment.getBinding().f58515OooO0Oo.OooO0Oo();
                mainSearchRoomFragment.adapter.OooO0Oo(mainSearchRoomFragment.getSearchAdapter());
                mainSearchRoomFragment.getSearchAdapter().OooOoO0(null);
                mainSearchRoomFragment.adapter.OooO0O0(mainSearchRoomFragment.getHistoryAdapter());
                mainSearchRoomFragment.adapter.OooO0O0(mainSearchRoomFragment.getRecommendTitleAdapter());
                mainSearchRoomFragment.adapter.OooO0O0(mainSearchRoomFragment.getRecommendAdapter());
                mainSearchRoomFragment.adapter.notifyDataSetChanged();
                mainSearchRoomFragment.getBinding().f58513OooO0O0.OooOo00(false);
            } else {
                mainSearchRoomFragment.adapter.OooO0Oo(mainSearchRoomFragment.getHistoryAdapter());
                mainSearchRoomFragment.adapter.OooO0Oo(mainSearchRoomFragment.getRecommendTitleAdapter());
                mainSearchRoomFragment.adapter.OooO0Oo(mainSearchRoomFragment.getRecommendAdapter());
                mainSearchRoomFragment.adapter.OooO0O0(mainSearchRoomFragment.getSearchAdapter());
                if (StringsKt.isBlank(mainSearchRoomFragment.searchText)) {
                    mainSearchRoomFragment.getBinding().f58515OooO0Oo.OooO0oo();
                }
                Intrinsics.checkNotNullExpressionValue(text, "text");
                mainSearchRoomFragment.searchRoom(text, true);
            }
            mainSearchRoomFragment.searchText = com.code.android.util.o0OoOo0.OooOOO(text, "");
        }
    }

    public static final class OooOOO extends Lambda implements Function0<p400o0Oo0OO.OooOOOO> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p400o0Oo0OO.OooOOOO invoke() {
            FrameLayout frameLayout = s4.inflate(MainSearchRoomFragment.this.getLayoutInflater()).f58797OooO00o;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "inflate(layoutInflater).apply {\n        }.root");
            return new p400o0Oo0OO.OooOOOO(frameLayout);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<RoomBaseAdapter<RoomIndexModel>> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final RoomBaseAdapter<RoomIndexModel> invoke() {
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            RoomBaseAdapter<RoomIndexModel> roomBaseAdapter = new RoomBaseAdapter<>(mainSearchRoomFragment.getContext());
            roomBaseAdapter.f10106OooOOO0 = false;
            roomBaseAdapter.f27704OooOooo = EnterRoomParentPage.Search_RecommendRoom;
            mainSearchRoomFragment.adapter.OooO0O0(mainSearchRoomFragment.getRecommendTitleAdapter());
            mainSearchRoomFragment.adapter.OooO0O0(roomBaseAdapter);
            return roomBaseAdapter;
        }
    }

    public static final class OooOOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28184OooO0Oo;

        public OooOOOO(OooO0OO function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28184OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28184OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28184OooO0Oo;
        }

        public final int hashCode() {
            return this.f28184OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28184OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOo extends Lambda implements Function1<List<? extends RoomIndexModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28186OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(boolean z) {
            super(1);
            this.f28186OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends RoomIndexModel> list) {
            List<? extends RoomIndexModel> list2 = list;
            boolean z = this.f28186OooO0o0;
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            if (list2 != null) {
                if (z) {
                    mainSearchRoomFragment.getSearchAdapter().OooOoO0(list2);
                } else {
                    mainSearchRoomFragment.getSearchAdapter().OooO0O0(list2);
                }
            }
            mainSearchRoomFragment.adapter.notifyDataSetChanged();
            if (mainSearchRoomFragment.getSearchAdapter().f10111OooOOoo.isEmpty()) {
                mainSearchRoomFragment.getBinding().f58515OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.No_search_results));
                mainSearchRoomFragment.getBinding().f58515OooO0Oo.OooO0o0();
            } else {
                if (z) {
                    mainSearchRoomFragment.getBinding().f58514OooO0OO.scrollToPosition(0);
                }
                mainSearchRoomFragment.getBinding().f58515OooO0Oo.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function0<o0O0O00> {
        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0O0O00 invoke() {
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            return new o0O0O00(mainSearchRoomFragment, mainSearchRoomFragment.getContext(), oO00OO0O.item_search_room_search);
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<ApiResult<List<? extends RoomIndexModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28189OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(boolean z) {
            super(1);
            this.f28189OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<? extends RoomIndexModel>> apiResult) {
            ApiResult<List<? extends RoomIndexModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MainSearchRoomFragment mainSearchRoomFragment = MainSearchRoomFragment.this;
            RefreshLayout refreshLayout = mainSearchRoomFragment.getBinding().f58513OooO0O0;
            boolean zIsSuccess = it.isSuccess();
            List<? extends RoomIndexModel> data = it.getData();
            refreshLayout.OooOoOO(this.f28189OooO0o0, zIsSuccess, data == null || data.isEmpty());
            if (it.isSuccess()) {
                mainSearchRoomFragment.pageIndex++;
                List<T> list = mainSearchRoomFragment.getSearchAdapter().f10111OooOOoo;
                Intrinsics.checkNotNullExpressionValue(list, "searchAdapter.data");
                p417o0OoO0.oo000o.OooO0OO(list, o000OOo.f28927OooO0Oo);
                mainSearchRoomFragment.getSearchAdapter().notifyDataSetChanged();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28190OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainSearchRoomFragment f28191OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MainSearchRoomFragment mainSearchRoomFragment, boolean z) {
            super(1);
            this.f28190OooO0Oo = z;
            this.f28191OooO0o0 = mainSearchRoomFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f28190OooO0Oo) {
                this.f28191OooO0o0.getBinding().f58515OooO0Oo.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p400o0Oo0OO.OooOOOO getHistoryAdapter() {
        return (p400o0Oo0OO.OooOOOO) this.historyAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r4 getHistoryInflate() {
        return (r4) this.historyInflate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RoomBaseAdapter<RoomIndexModel> getRecommendAdapter() {
        return (RoomBaseAdapter) this.recommendAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p400o0Oo0OO.OooOOOO getRecommendTitleAdapter() {
        return (p400o0Oo0OO.OooOOOO) this.recommendTitleAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p564o0oOo0OO.o000O<RoomIndexModel> getSearchAdapter() {
        return (p564o0oOo0OO.o000O) this.searchAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SearchVM getVm() {
        return (SearchVM) this.vm.getValue();
    }

    private final void initSearchHistory() {
        getVm().getSearchHistoryList().observe(getViewLifecycleOwner(), new OooOOOO(new OooO0OO()));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void initView() {
        getBinding().f58513OooO0O0.OooOoo0(new androidx.compose.ui.graphics.colorspace.OooO0o(this));
        initSearchHistory();
        getBinding().f58514OooO0OO.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f58514OooO0OO.setAdapter(this.adapter);
        getBinding().f58514OooO0OO.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.fragment.o0Oo0oo
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MainSearchRoomFragment.initView$lambda$1(this.f28947OooO0Oo, view, motionEvent);
            }
        });
        getBinding().f58515OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.No_search_results));
        getBinding().f58515OooO0Oo.setEmptyImage(oOo00OO0.ic_empty_search);
        StateLayout stateLayout = getBinding().f58515OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new OooO0o(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MainSearchRoomFragment this$0, o0OO0o.OooOOO0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!StringsKt.isBlank(this$0.searchText)) {
            this$0.searchRoom(this$0.searchText, false);
        } else {
            this$0.getBinding().f58513OooO0O0.OooOO0O(true);
            this$0.getBinding().f58513OooO0O0.setLoadSuccess(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$1(MainSearchRoomFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onScrollListener;
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return false;
    }

    private final void loadRecommendRoom() {
        getVm().loadRecommendRoom().observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(new OooO(), new OooOO0(), null, false, 12));
    }

    private final void observerSearchText() {
        LiveEventBus.get("MainSearch", String.class).observe(getViewLifecycleOwner(), new OooOO0O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchRoom(String text, boolean isRefresh) {
        if (isRefresh) {
            this.pageIndex = 1;
        }
        getVm().searchRoom(text, this.pageIndex).observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(new OooOo(isRefresh), new Oooo000(this, isRefresh), new Oooo0(isRefresh), false, 8));
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

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public o4 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        o4 o4VarInflate = o4.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(o4VarInflate, "inflate(inflater)");
        return o4VarInflate;
    }
}
