package com.yalla.yalla.ui.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import com.yalla.yalla.model.http.ApiError;
import com.yalla.yalla.model.http.ApiResult;
import com.yalla.yalla.model.user.OfficialActionModel;
import com.yalla.yalla.model.user.UserInfoModel;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.view.StateLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.refresh.RefreshLayout;
import com.yalla.yalla.ui.vm.main.SearchVM;
import com.yalla.yalla.ui.vm.user.UserInfoVM;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.p4;
import p641o0ooOOOO.r4;
import p641o0ooOOOO.s4;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bI\u0010JJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0003J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R#\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0017048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010#\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010#\u001a\u0004\b@\u0010AR\u001b\u0010E\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010#\u001a\u0004\bD\u0010AR#\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0017048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010#\u001a\u0004\bG\u00107¨\u0006K"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MainSearchUserFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/p4;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "loadRecommendUser", "observerSearchText", "initView", "", ViewHierarchyConstants.TEXT_KEY, "", "isRefresh", "searchUser", "initSearchHistory", "Lcom/yalla/yalla/model/user/UserInfoModel;", "item", "userFollow", "Lkotlin/Function0;", "onScrollListener", "Lkotlin/jvm/functions/Function0;", "getOnScrollListener", "()Lkotlin/jvm/functions/Function0;", "setOnScrollListener", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/yalla/yalla/ui/vm/main/SearchVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/SearchVM;", "vm", "Lcom/yalla/yalla/ui/vm/user/UserInfoVM;", "userVM$delegate", "getUserVM", "()Lcom/yalla/yalla/ui/vm/user/UserInfoVM;", "userVM", "searchText", "Ljava/lang/String;", "", "pageIndex", "I", "Landroidx/recyclerview/widget/ConcatAdapter;", "adapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "Lo0oOo0OO/o000O;", "searchAdapter$delegate", "getSearchAdapter", "()Lo0oOo0OO/o000O;", "searchAdapter", "Lo0ooOOOO/r4;", "historyInflate$delegate", "getHistoryInflate", "()Lo0ooOOOO/r4;", "historyInflate", "Lo0Oo0OO/OooOOOO;", "historyAdapter$delegate", "getHistoryAdapter", "()Lo0Oo0OO/OooOOOO;", "historyAdapter", "recommendTitleAdapter$delegate", "getRecommendTitleAdapter", "recommendTitleAdapter", "recommendAdapter$delegate", "getRecommendAdapter", "recommendAdapter", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SuppressLint({"NotifyDataSetChanged"})
@SourceDebugExtension({"SMAP\nMainSearchUserFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSearchUserFragment.kt\ncom/yalla/yalla/ui/fragment/MainSearchUserFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,370:1\n172#2,9:371\n172#2,9:380\n*S KotlinDebug\n*F\n+ 1 MainSearchUserFragment.kt\ncom/yalla/yalla/ui/fragment/MainSearchUserFragment\n*L\n54#1:371,9\n55#1:380,9\n*E\n"})
public final class MainSearchUserFragment extends p508o0o0O.OooOO0O<p4> {
    public static final int $stable = 8;

    @Nullable
    private Function0<Unit> onScrollListener;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(SearchVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MainSearchUserFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.MainSearchUserFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f28216OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28216OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.MainSearchUserFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: userVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userVM = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(UserInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MainSearchUserFragment$special$$inlined$activityViewModels$default$4
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.MainSearchUserFragment$special$$inlined$activityViewModels$default$5

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f28220OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28220OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.MainSearchUserFragment$special$$inlined$activityViewModels$default$6
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

    public static final class OooO extends Lambda implements Function1<List<? extends UserInfoModel>, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends UserInfoModel> list) {
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            mainSearchUserFragment.getRecommendAdapter().OooOoO0(list);
            if (mainSearchUserFragment.getRecommendAdapter().f10111OooOOoo.isEmpty() && mainSearchUserFragment.getHistoryInflate().f58723OooO0Oo.getChildCount() == 0) {
                mainSearchUserFragment.getBinding().f58589OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.no_data));
                mainSearchUserFragment.getBinding().f58589OooO0Oo.OooO0o0();
            } else {
                mainSearchUserFragment.getBinding().f58589OooO0Oo.OooO0Oo();
            }
            mainSearchUserFragment.getBinding().f58587OooO0O0.OooOoOO(true, true, true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<p400o0Oo0OO.OooOOOO> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p400o0Oo0OO.OooOOOO invoke() {
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            FrameLayout frameLayout = mainSearchUserFragment.getHistoryInflate().f58720OooO00o;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "historyInflate.root");
            p400o0Oo0OO.OooOOOO oooOOOO = new p400o0Oo0OO.OooOOOO(frameLayout);
            mainSearchUserFragment.adapter.OooO0O0(oooOOOO);
            return oooOOOO;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<r4> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r4 invoke() {
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            r4 r4VarInflate = r4.inflate(mainSearchUserFragment.getLayoutInflater());
            r4VarInflate.f58722OooO0OO.setOnClickListener(new p358o0OOOooO.o0000oo(mainSearchUserFragment, 2));
            View view = r4VarInflate.f58721OooO0O0;
            Intrinsics.checkNotNullExpressionValue(view, "this.bottomView");
            com.code.android.util.o000OO00.OooOOOO(view);
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
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            mainSearchUserFragment.getHistoryInflate().f58723OooO0Oo.removeAllViews();
            for (SearchHistoryTable searchHistoryTable : list2) {
                View viewInflate = View.inflate(mainSearchUserFragment.getContext(), oO00OO0O.tv_search_history, null);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(context, R.layout.tv_search_history, null)");
                RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(oO00O0oO.tag_item_relative);
                final TextView textView = (TextView) viewInflate.findViewById(oO00O0oO.tag_item);
                textView.setText(searchHistoryTable.getTag());
                textView.setBackgroundResource(oOo00OO0.bg_round_bg_white_r16);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.o000000O
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LiveEventBus.get("MainSearchSetText").post(textView.getText().toString());
                    }
                });
                mainSearchUserFragment.getHistoryInflate().f58723OooO0Oo.addView(relativeLayout);
            }
            if (list2.isEmpty()) {
                mainSearchUserFragment.adapter.OooO0Oo(mainSearchUserFragment.getHistoryAdapter());
                mainSearchUserFragment.adapter.notifyDataSetChanged();
            } else if (StringsKt.isBlank(mainSearchUserFragment.searchText)) {
                mainSearchUserFragment.adapter.OooO00o(0, mainSearchUserFragment.getHistoryAdapter());
                mainSearchUserFragment.adapter.notifyDataSetChanged();
            }
            if (mainSearchUserFragment.getRecommendAdapter().f10111OooOOoo.isEmpty() && mainSearchUserFragment.getHistoryInflate().f58723OooO0Oo.getChildCount() == 0) {
                mainSearchUserFragment.getBinding().f58589OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.no_data));
                mainSearchUserFragment.getBinding().f58589OooO0Oo.OooO0o0();
            } else {
                mainSearchUserFragment.getBinding().f58589OooO0Oo.OooO0Oo();
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
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            String str = mainSearchUserFragment.searchText;
            mainSearchUserFragment.getBinding().f58589OooO0Oo.OooO0oo();
            mainSearchUserFragment.searchUser(str, true);
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
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            mainSearchUserFragment.getBinding().f58589OooO0Oo.OooO0o();
            mainSearchUserFragment.getBinding().f58587OooO0O0.OooOoOO(true, true, true);
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
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            if (z) {
                mainSearchUserFragment.getBinding().f58589OooO0Oo.OooO0Oo();
                mainSearchUserFragment.adapter.OooO0Oo(mainSearchUserFragment.getSearchAdapter());
                mainSearchUserFragment.getSearchAdapter().OooOoO0(null);
                mainSearchUserFragment.adapter.OooO0O0(mainSearchUserFragment.getHistoryAdapter());
                mainSearchUserFragment.adapter.OooO0O0(mainSearchUserFragment.getRecommendTitleAdapter());
                mainSearchUserFragment.adapter.OooO0O0(mainSearchUserFragment.getRecommendAdapter());
                mainSearchUserFragment.adapter.notifyDataSetChanged();
                mainSearchUserFragment.getBinding().f58587OooO0O0.OooOo00(false);
            } else {
                mainSearchUserFragment.adapter.OooO0Oo(mainSearchUserFragment.getHistoryAdapter());
                mainSearchUserFragment.adapter.OooO0Oo(mainSearchUserFragment.getRecommendTitleAdapter());
                mainSearchUserFragment.adapter.OooO0Oo(mainSearchUserFragment.getRecommendAdapter());
                mainSearchUserFragment.adapter.OooO0O0(mainSearchUserFragment.getSearchAdapter());
                if (StringsKt.isBlank(mainSearchUserFragment.searchText)) {
                    mainSearchUserFragment.getBinding().f58589OooO0Oo.OooO0oo();
                }
                Intrinsics.checkNotNullExpressionValue(text, "text");
                mainSearchUserFragment.searchUser(text, true);
            }
            mainSearchUserFragment.searchText = com.code.android.util.o0OoOo0.OooOOO(text, "");
        }
    }

    public static final class OooOOO extends Lambda implements Function0<p400o0Oo0OO.OooOOOO> {
        public OooOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final p400o0Oo0OO.OooOOOO invoke() {
            s4 s4VarInflate = s4.inflate(MainSearchUserFragment.this.getLayoutInflater());
            s4VarInflate.f58798OooO0O0.setBackgroundResource(oOo00OO0.bg_round_bg_white_top_r24);
            FrameLayout frameLayout = s4VarInflate.f58797OooO00o;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "inflate(layoutInflater).…e_top_r24)\n        }.root");
            return new p400o0Oo0OO.OooOOOO(frameLayout);
        }
    }

    @SourceDebugExtension({"SMAP\nMainSearchUserFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSearchUserFragment.kt\ncom/yalla/yalla/ui/fragment/MainSearchUserFragment$recommendAdapter$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
    public static final class OooOOO0 extends Lambda implements Function0<o00000O0> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000O0 invoke() {
            final MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            final o00000O0 o00000o1 = new o00000O0(mainSearchUserFragment, mainSearchUserFragment.getContext(), oO00OO0O.item_searchfriend_result);
            o00000o1.f10106OooOOO0 = false;
            o00000o1.f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: com.yalla.yalla.ui.fragment.o00000
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    List listEmptyList;
                    Context context;
                    MainSearchUserFragment this$0 = mainSearchUserFragment;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    o00000O0 this_apply = o00000o1;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    ArrayList arrayList = this$0.adapter.f7441OooO00o.f7485OooO0o0;
                    if (arrayList.isEmpty()) {
                        listEmptyList = Collections.emptyList();
                    } else {
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((androidx.recyclerview.widget.o0OOO0o) it.next()).f7818OooO0OO);
                        }
                        listEmptyList = arrayList2;
                    }
                    UserInfoModel userInfoModel = (UserInfoModel) this_apply.f10111OooOOoo.get((i - Collections.unmodifiableList(listEmptyList).size()) + 1);
                    if (userInfoModel == null || (context = this_apply.f56196OooOo) == null) {
                        return;
                    }
                    UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, (Activity) context, String.valueOf(userInfoModel.getUserId()), false, 12);
                }
            };
            mainSearchUserFragment.adapter.OooO0O0(mainSearchUserFragment.getRecommendTitleAdapter());
            mainSearchUserFragment.adapter.OooO0O0(o00000o1);
            return o00000o1;
        }
    }

    public static final class OooOOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f28205OooO0Oo;

        public OooOOOO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f28205OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f28205OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f28205OooO0Oo;
        }

        public final int hashCode() {
            return this.f28205OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f28205OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOo extends Lambda implements Function1<List<? extends UserInfoModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28207OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(boolean z) {
            super(1);
            this.f28207OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends UserInfoModel> list) {
            List<? extends UserInfoModel> list2 = list;
            boolean z = this.f28207OooO0o0;
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            if (list2 != null) {
                if (z) {
                    mainSearchUserFragment.getSearchAdapter().OooOoO0(list2);
                } else {
                    mainSearchUserFragment.getSearchAdapter().OooO0O0(list2);
                }
            }
            mainSearchUserFragment.adapter.notifyDataSetChanged();
            if (mainSearchUserFragment.getSearchAdapter().f10111OooOOoo.isEmpty()) {
                mainSearchUserFragment.getBinding().f58589OooO0Oo.OooO0o0();
            } else {
                if (z) {
                    mainSearchUserFragment.getBinding().f58588OooO0OO.scrollToPosition(0);
                }
                mainSearchUserFragment.getBinding().f58589OooO0Oo.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMainSearchUserFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSearchUserFragment.kt\ncom/yalla/yalla/ui/fragment/MainSearchUserFragment$searchAdapter$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,370:1\n1#2:371\n*E\n"})
    public static final class OooOo00 extends Lambda implements Function0<o00000OO> {
        public OooOo00() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00000OO invoke() {
            final MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            final o00000OO o00000oo2 = new o00000OO(mainSearchUserFragment, mainSearchUserFragment.getContext(), oO00OO0O.item_search_user_search);
            o00000oo2.f10098OooO0o = new BaseQuickAdapter.OooO0o() { // from class: com.yalla.yalla.ui.fragment.o00000O
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    o00000OO this_apply = o00000oo2;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    MainSearchUserFragment this$0 = mainSearchUserFragment;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    UserInfoModel userInfoModelOooOOO = this_apply.OooOOO(i);
                    if (userInfoModelOooOOO == null) {
                        return;
                    }
                    o0OO000.OooO00o("201014");
                    this$0.getVm().searchUserStatistic(userInfoModelOooOOO.getUserId());
                    Context context = this_apply.f56196OooOo;
                    if (context != null) {
                        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f27240Oooo0o, (Activity) context, String.valueOf(userInfoModelOooOOO.getUserId()), false, 12);
                    }
                }
            };
            new o0000Ooo(mainSearchUserFragment);
            return o00000oo2;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<ApiResult<List<? extends UserInfoModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f28210OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(boolean z) {
            super(1);
            this.f28210OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<? extends UserInfoModel>> apiResult) {
            ApiResult<List<? extends UserInfoModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            RefreshLayout refreshLayout = mainSearchUserFragment.getBinding().f58587OooO0O0;
            boolean zIsSuccess = it.isSuccess();
            List<? extends UserInfoModel> data = it.getData();
            refreshLayout.OooOoOO(this.f28210OooO0o0, zIsSuccess, data == null || data.isEmpty());
            if (it.isSuccess()) {
                mainSearchUserFragment.pageIndex++;
                List<T> list = mainSearchUserFragment.getSearchAdapter().f10111OooOOoo;
                Intrinsics.checkNotNullExpressionValue(list, "searchAdapter.data");
                p417o0OoO0.oo000o.OooO0OO(list, o0000.f28889OooO0Oo);
                mainSearchUserFragment.getSearchAdapter().notifyDataSetChanged();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f28211OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainSearchUserFragment f28212OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(MainSearchUserFragment mainSearchUserFragment, boolean z) {
            super(1);
            this.f28211OooO0Oo = z;
            this.f28212OooO0o0 = mainSearchUserFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f28211OooO0Oo) {
                this.f28212OooO0o0.getBinding().f58589OooO0Oo.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class o000oOoO extends Lambda implements Function1<ApiResult<OfficialActionModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserInfoModel f28213OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainSearchUserFragment f28214OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o000oOoO(MainSearchUserFragment mainSearchUserFragment, UserInfoModel userInfoModel) {
            super(1);
            this.f28213OooO0Oo = userInfoModel;
            this.f28214OooO0o0 = mainSearchUserFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<OfficialActionModel> apiResult) {
            if (apiResult.isSuccess()) {
                UserInfoModel userInfoModel = this.f28213OooO0Oo;
                boolean z = true;
                userInfoModel.setFollow(!userInfoModel.getIsFollow());
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(userInfoModel.getIsFollow() ? oO00OOo0.Following : oO00OOo0.Unfollowed);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    com.code.android.util.o000Oo0 o000oo0OooO00o = com.code.android.util.o000O00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        com.code.android.util.o000O0.f10355OooO0O0.post(o000oo0OooO00o);
                    }
                }
                this.f28214OooO0o0.adapter.notifyDataSetChanged();
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
    public final p564o0oOo0OO.o000O<UserInfoModel> getRecommendAdapter() {
        return (p564o0oOo0OO.o000O) this.recommendAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p400o0Oo0OO.OooOOOO getRecommendTitleAdapter() {
        return (p400o0Oo0OO.OooOOOO) this.recommendTitleAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p564o0oOo0OO.o000O<UserInfoModel> getSearchAdapter() {
        return (p564o0oOo0OO.o000O) this.searchAdapter.getValue();
    }

    private final UserInfoVM getUserVM() {
        return (UserInfoVM) this.userVM.getValue();
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
        getBinding().f58588OooO0OO.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f58587OooO0O0.OooOoo0(new p025Oooo0OO.o000(this));
        initSearchHistory();
        getBinding().f58588OooO0OO.setAdapter(this.adapter);
        getBinding().f58588OooO0OO.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.fragment.o000000
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MainSearchUserFragment.initView$lambda$1(this.f28892OooO0Oo, view, motionEvent);
            }
        });
        getBinding().f58589OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(oO00OOo0.No_search_results));
        StateLayout stateLayout = getBinding().f58589OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new OooO0o(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(MainSearchUserFragment this$0, o0OO0o.OooOOO0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!StringsKt.isBlank(this$0.searchText)) {
            this$0.searchUser(this$0.searchText, false);
        } else {
            this$0.getBinding().f58587OooO0O0.OooOO0O(true);
            this$0.getBinding().f58587OooO0O0.setLoadSuccess(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$1(MainSearchUserFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onScrollListener;
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return false;
    }

    private final void loadRecommendUser() {
        getVm().loadRecommendUser().observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(new OooO(), new OooOO0(), null, false, 12));
    }

    private final void observerSearchText() {
        LiveEventBus.get("MainSearch", String.class).observe(getViewLifecycleOwner(), new OooOO0O());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchUser(String text, boolean isRefresh) {
        if (isRefresh) {
            this.pageIndex = 1;
        }
        getVm().searchUser(text, this.pageIndex).observe(getViewLifecycleOwner(), new p377o0OOoOo.o0000OO0(new OooOo(isRefresh), new Oooo000(this, isRefresh), new Oooo0(isRefresh), false, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void userFollow(UserInfoModel item) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            getUserVM().userFollow(com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(item.getUserId())), item.getIsFollow()).observe(activity, new OooOOOO(new o000oOoO(this, item)));
        }
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
        loadRecommendUser();
        observerSearchText();
    }

    public final void setOnScrollListener(@Nullable Function0<Unit> function0) {
        this.onScrollListener = function0;
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public p4 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        p4 p4VarInflate = p4.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(p4VarInflate, "inflate(inflater)");
        return p4VarInflate;
    }
}
