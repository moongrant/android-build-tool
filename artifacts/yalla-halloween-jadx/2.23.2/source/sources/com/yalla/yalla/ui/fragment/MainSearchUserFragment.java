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
import p405o0Oo0OOO.oO00Oo00;
import p405o0Oo0OOO.oO00o000;
import p405o0Oo0OOO.oOOoOOO0;
import p643o0ooOOOO.k3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bI\u0010JJ\u001a\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\b\u0010\u0010\u001a\u00020\fH\u0003J\u0018\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\b\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002R*\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R#\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0017048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b5\u0010#\u001a\u0004\b6\u00107R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010#\u001a\u0004\b;\u0010<R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010#\u001a\u0004\b@\u0010AR\u001b\u0010E\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bC\u0010#\u001a\u0004\bD\u0010AR#\u0010H\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0017048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010#\u001a\u0004\bG\u00107¨\u0006K"}, d2 = {"Lcom/yalla/yalla/ui/fragment/MainSearchUserFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/oO00Oo00;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "", "onViewCreated", "loadRecommendUser", "observerSearchText", "initView", "", ViewHierarchyConstants.TEXT_KEY, "", "isRefresh", "searchUser", "initSearchHistory", "Lcom/yalla/yalla/model/user/UserInfoModel;", "item", "userFollow", "Lkotlin/Function0;", "onScrollListener", "Lkotlin/jvm/functions/Function0;", "getOnScrollListener", "()Lkotlin/jvm/functions/Function0;", "setOnScrollListener", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/yalla/yalla/ui/vm/main/SearchVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/SearchVM;", "vm", "Lcom/yalla/yalla/ui/vm/user/UserInfoVM;", "userVM$delegate", "getUserVM", "()Lcom/yalla/yalla/ui/vm/user/UserInfoVM;", "userVM", "searchText", "Ljava/lang/String;", "", "pageIndex", "I", "Landroidx/recyclerview/widget/ConcatAdapter;", "adapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "Lo0oOoO0/o0000oo;", "searchAdapter$delegate", "getSearchAdapter", "()Lo0oOoO0/o0000oo;", "searchAdapter", "Lo0Oo0OOO/oOOoOOO0;", "historyInflate$delegate", "getHistoryInflate", "()Lo0Oo0OOO/oOOoOOO0;", "historyInflate", "Lo0ooOOOO/k3;", "historyAdapter$delegate", "getHistoryAdapter", "()Lo0ooOOOO/k3;", "historyAdapter", "recommendTitleAdapter$delegate", "getRecommendTitleAdapter", "recommendTitleAdapter", "recommendAdapter$delegate", "getRecommendAdapter", "recommendAdapter", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SuppressLint({"NotifyDataSetChanged"})
@SourceDebugExtension({"SMAP\nMainSearchUserFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSearchUserFragment.kt\ncom/yalla/yalla/ui/fragment/MainSearchUserFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,371:1\n172#2,9:372\n172#2,9:381\n*S KotlinDebug\n*F\n+ 1 MainSearchUserFragment.kt\ncom/yalla/yalla/ui/fragment/MainSearchUserFragment\n*L\n54#1:372,9\n55#1:381,9\n*E\n"})
public final class MainSearchUserFragment extends p527o0o0OO0o.o000O<oO00Oo00> {
    public static final int $stable = 8;

    @Nullable
    private Function0<Unit> onScrollListener;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(SearchVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MainSearchUserFragment$special$$inlined$activityViewModels$default$1
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
        public final /* synthetic */ Function0 f27732OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27732OooO0Oo;
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
    private final Lazy userVM = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(UserInfoVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MainSearchUserFragment$special$$inlined$activityViewModels$default$4
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
        public final /* synthetic */ Function0 f27736OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27736OooO0Oo;
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

    public static final class OooO extends Lambda implements Function1<List<? extends UserInfoModel>, Unit> {
        public OooO() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends UserInfoModel> list) {
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            mainSearchUserFragment.getRecommendAdapter().OooOoO0(list);
            if (mainSearchUserFragment.getRecommendAdapter().f13189OooOOoo.isEmpty() && mainSearchUserFragment.getHistoryInflate().f45192OooO0Oo.getChildCount() == 0) {
                mainSearchUserFragment.getBinding().f44823OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.no_data));
                mainSearchUserFragment.getBinding().f44823OooO0Oo.OooO0o0();
            } else {
                mainSearchUserFragment.getBinding().f44823OooO0Oo.OooO0Oo();
            }
            mainSearchUserFragment.getBinding().f44821OooO0O0.OooOoOO(true, true, true);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends Lambda implements Function0<k3> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final k3 invoke() {
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            FrameLayout frameLayout = mainSearchUserFragment.getHistoryInflate().f45189OooO00o;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
            k3 k3Var = new k3(frameLayout);
            mainSearchUserFragment.adapter.OooO0O0(k3Var);
            return k3Var;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<oOOoOOO0> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final oOOoOOO0 invoke() {
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            oOOoOOO0 ooooooo0Inflate = oOOoOOO0.inflate(mainSearchUserFragment.getLayoutInflater());
            ooooooo0Inflate.f45191OooO0OO.setOnClickListener(new com.yalla.yalla.ui.activity.message.o000oOoO(mainSearchUserFragment, 2));
            View bottomView = ooooooo0Inflate.f45190OooO0O0;
            Intrinsics.checkNotNullExpressionValue(bottomView, "bottomView");
            com.code.android.util.o000O.OooOOOO(bottomView);
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
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            mainSearchUserFragment.getHistoryInflate().f45192OooO0Oo.removeAllViews();
            for (SearchHistoryTable searchHistoryTable : list2) {
                View viewInflate = View.inflate(mainSearchUserFragment.getContext(), p562o0oOo000.oo0o0Oo.tv_search_history, null);
                Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(...)");
                RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(p562o0oOo000.o0OO00O.tag_item_relative);
                final TextView textView = (TextView) viewInflate.findViewById(p562o0oOo000.o0OO00O.tag_item);
                textView.setText(searchHistoryTable.getTag());
                textView.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_round_bg_white_r16);
                textView.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.o00000O
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LiveEventBus.get("MainSearchSetText").post(textView.getText().toString());
                    }
                });
                mainSearchUserFragment.getHistoryInflate().f45192OooO0Oo.addView(relativeLayout);
            }
            if (list2.isEmpty()) {
                mainSearchUserFragment.adapter.OooO0Oo(mainSearchUserFragment.getHistoryAdapter());
                mainSearchUserFragment.adapter.notifyDataSetChanged();
            } else if (StringsKt.isBlank(mainSearchUserFragment.searchText)) {
                mainSearchUserFragment.adapter.OooO00o(0, mainSearchUserFragment.getHistoryAdapter());
                mainSearchUserFragment.adapter.notifyDataSetChanged();
            }
            if (mainSearchUserFragment.getRecommendAdapter().f13189OooOOoo.isEmpty() && mainSearchUserFragment.getHistoryInflate().f45192OooO0Oo.getChildCount() == 0) {
                mainSearchUserFragment.getBinding().f44823OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.no_data));
                mainSearchUserFragment.getBinding().f44823OooO0Oo.OooO0o0();
            } else {
                mainSearchUserFragment.getBinding().f44823OooO0Oo.OooO0Oo();
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
            mainSearchUserFragment.getBinding().f44823OooO0Oo.OooO0oo();
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
            mainSearchUserFragment.getBinding().f44823OooO0Oo.OooO0o();
            mainSearchUserFragment.getBinding().f44821OooO0O0.OooOoOO(true, true, true);
            return Unit.INSTANCE;
        }
    }

    @SourceDebugExtension({"SMAP\nMainSearchUserFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSearchUserFragment.kt\ncom/yalla/yalla/ui/fragment/MainSearchUserFragment$recommendAdapter$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,371:1\n1#2:372\n*E\n"})
    public static final class OooOO0O extends Lambda implements Function0<o0000Ooo> {
        public OooOO0O() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000Ooo invoke() {
            final MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            final o0000Ooo o0000ooo = new o0000Ooo(mainSearchUserFragment, mainSearchUserFragment.getContext(), p562o0oOo000.oo0o0Oo.item_searchfriend_result);
            o0000ooo.f13184OooOOO0 = false;
            o0000ooo.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: com.yalla.yalla.ui.fragment.o00000OO
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    List listEmptyList;
                    UserInfoModel userInfoModel;
                    Context context;
                    MainSearchUserFragment this$0 = mainSearchUserFragment;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    o0000Ooo this_apply = o0000ooo;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    ArrayList arrayList = this$0.adapter.f10535OooO00o.f10600OooO0o0;
                    if (arrayList.isEmpty()) {
                        listEmptyList = Collections.emptyList();
                    } else {
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(((androidx.recyclerview.widget.o0Oo0oo) it.next()).f10937OooO0OO);
                        }
                        listEmptyList = arrayList2;
                    }
                    int size = (i - Collections.unmodifiableList(listEmptyList).size()) + 1;
                    if (size > this_apply.f13189OooOOoo.size() || (userInfoModel = (UserInfoModel) this_apply.f13189OooOOoo.get(size)) == null || (context = this_apply.f56423OooOo) == null) {
                        return;
                    }
                    UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, (Activity) context, String.valueOf(userInfoModel.getUserId()), false, 12);
                }
            };
            mainSearchUserFragment.adapter.OooO0O0(mainSearchUserFragment.getRecommendTitleAdapter());
            mainSearchUserFragment.adapter.OooO0O0(o0000ooo);
            return o0000ooo;
        }
    }

    public static final class OooOOO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f27720OooO0Oo;

        public OooOOO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f27720OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f27720OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f27720OooO0Oo;
        }

        public final int hashCode() {
            return this.f27720OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f27720OooO0Oo.invoke(obj);
        }
    }

    public static final class OooOOO0 extends Lambda implements Function0<k3> {
        public OooOOO0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final k3 invoke() {
            oO00o000 oo00o000Inflate = oO00o000.inflate(MainSearchUserFragment.this.getLayoutInflater());
            oo00o000Inflate.f44833OooO0O0.setBackgroundResource(p562o0oOo000.o0Oo0oo.bg_round_bg_white_top_r24);
            FrameLayout frameLayout = oo00o000Inflate.f44832OooO00o;
            Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
            return new k3(frameLayout);
        }
    }

    @SourceDebugExtension({"SMAP\nMainSearchUserFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainSearchUserFragment.kt\ncom/yalla/yalla/ui/fragment/MainSearchUserFragment$searchAdapter$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,371:1\n1#2:372\n*E\n"})
    public static final class OooOOOO extends Lambda implements Function0<o0000O00> {
        public OooOOOO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o0000O00 invoke() {
            final MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            final o0000O00 o0000o00 = new o0000O00(mainSearchUserFragment, mainSearchUserFragment.getContext(), p562o0oOo000.oo0o0Oo.item_search_user_search);
            o0000o00.f13176OooO0o = new BaseQuickAdapter.OooO0o() { // from class: com.yalla.yalla.ui.fragment.o0000
                @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0o
                public final void OooO0o(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                    o0000O00 this_apply = o0000o00;
                    Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
                    MainSearchUserFragment this$0 = mainSearchUserFragment;
                    Intrinsics.checkNotNullParameter(this$0, "this$0");
                    UserInfoModel userInfoModelOooOOO = this_apply.OooOOO(i);
                    if (userInfoModelOooOOO == null) {
                        return;
                    }
                    o0oo0000.OooO00o.OooO0O0("201014");
                    this$0.getVm().searchUserStatistic(userInfoModelOooOOO.getUserId());
                    Context context = this_apply.f56423OooOo;
                    if (context != null) {
                        UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, (Activity) context, String.valueOf(userInfoModelOooOOO.getUserId()), false, 12);
                    }
                }
            };
            new o0000oo(mainSearchUserFragment);
            return o0000o00;
        }
    }

    public static final class OooOo extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ boolean f27723OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainSearchUserFragment f27724OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo(MainSearchUserFragment mainSearchUserFragment, boolean z) {
            super(1);
            this.f27723OooO0Oo = z;
            this.f27724OooO0o0 = mainSearchUserFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f27723OooO0Oo) {
                this.f27724OooO0o0.getBinding().f44823OooO0Oo.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOo00 extends Lambda implements Function1<List<? extends UserInfoModel>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f27726OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOo00(boolean z) {
            super(1);
            this.f27726OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends UserInfoModel> list) {
            List<? extends UserInfoModel> list2 = list;
            boolean z = this.f27726OooO0o0;
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            if (list2 != null) {
                if (z) {
                    mainSearchUserFragment.getSearchAdapter().OooOoO0(list2);
                } else {
                    mainSearchUserFragment.getSearchAdapter().OooO0O0(list2);
                }
            }
            mainSearchUserFragment.adapter.notifyDataSetChanged();
            if (mainSearchUserFragment.getSearchAdapter().f13189OooOOoo.isEmpty()) {
                mainSearchUserFragment.getBinding().f44823OooO0Oo.OooO0o0();
            } else {
                if (z) {
                    mainSearchUserFragment.getBinding().f44822OooO0OO.scrollToPosition(0);
                }
                mainSearchUserFragment.getBinding().f44823OooO0Oo.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo0 extends Lambda implements Function1<ApiResult<OfficialActionModel>, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ UserInfoModel f27727OooO0Oo;

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ MainSearchUserFragment f27728OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo0(MainSearchUserFragment mainSearchUserFragment, UserInfoModel userInfoModel) {
            super(1);
            this.f27727OooO0Oo = userInfoModel;
            this.f27728OooO0o0 = mainSearchUserFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<OfficialActionModel> apiResult) {
            if (apiResult.isSuccess()) {
                UserInfoModel userInfoModel = this.f27727OooO0Oo;
                boolean z = true;
                userInfoModel.setFollow(!userInfoModel.getIsFollow());
                String strOooO0OO = com.code.android.util.o0000.OooO0OO(userInfoModel.getIsFollow() ? p562o0oOo000.o000000.Following : p562o0oOo000.o000000.Unfollowed);
                if (strOooO0OO != null && !StringsKt.isBlank(strOooO0OO)) {
                    z = false;
                }
                if (!z) {
                    com.code.android.util.o000Oo0 o000oo0OooO00o = androidx.activity.OooOo00.OooO00o(strOooO0OO, "runnable");
                    if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                        o000oo0OooO00o.run();
                    } else {
                        com.code.android.util.o000O00O.f13422OooO0O0.post(o000oo0OooO00o);
                    }
                }
                this.f27728OooO0o0.adapter.notifyDataSetChanged();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class Oooo000 extends Lambda implements Function1<ApiResult<List<? extends UserInfoModel>>, Unit> {

        /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
        public final /* synthetic */ boolean f27730OooO0o0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Oooo000(boolean z) {
            super(1);
            this.f27730OooO0o0 = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<? extends UserInfoModel>> apiResult) {
            ApiResult<List<? extends UserInfoModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
            RefreshLayout refreshLayout = mainSearchUserFragment.getBinding().f44821OooO0O0;
            boolean zIsSuccess = it.isSuccess();
            List<? extends UserInfoModel> data = it.getData();
            refreshLayout.OooOoOO(this.f27730OooO0o0, zIsSuccess, data == null || data.isEmpty());
            if (it.isSuccess()) {
                mainSearchUserFragment.pageIndex++;
                List<T> list = mainSearchUserFragment.getSearchAdapter().f13189OooOOoo;
                Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
                p423o0OoO0OO.o0000OO0.OooO0OO(list, o0000O0.f28367OooO0Oo);
                mainSearchUserFragment.getSearchAdapter().notifyDataSetChanged();
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
    public final p571o0oOoO0.o0000oo<UserInfoModel> getRecommendAdapter() {
        return (p571o0oOoO0.o0000oo) this.recommendAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final k3 getRecommendTitleAdapter() {
        return (k3) this.recommendTitleAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p571o0oOoO0.o0000oo<UserInfoModel> getSearchAdapter() {
        return (p571o0oOoO0.o0000oo) this.searchAdapter.getValue();
    }

    private final UserInfoVM getUserVM() {
        return (UserInfoVM) this.userVM.getValue();
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
        getBinding().f44822OooO0OO.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f44821OooO0O0.OooOoo0(new androidx.compose.ui.graphics.colorspace.OooOOO0(this));
        initSearchHistory();
        getBinding().f44822OooO0OO.setAdapter(this.adapter);
        getBinding().f44822OooO0OO.setOnTouchListener(new View.OnTouchListener() { // from class: com.yalla.yalla.ui.fragment.o00000O0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MainSearchUserFragment.initView$lambda$2(this.f28363OooO0Oo, view, motionEvent);
            }
        });
        getBinding().f44823OooO0Oo.setEmptyText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.No_search_results));
        StateLayout stateLayout = getBinding().f44823OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new OooO0o(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(MainSearchUserFragment this$0, o0OO0oO0.OooOOO0 it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (!StringsKt.isBlank(this$0.searchText)) {
            this$0.searchUser(this$0.searchText, false);
        } else {
            this$0.getBinding().f44821OooO0O0.OooOO0O(true);
            this$0.getBinding().f44821OooO0O0.setLoadSuccess(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean initView$lambda$2(MainSearchUserFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onScrollListener;
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return false;
    }

    private final void loadRecommendUser() {
        getVm().loadRecommendUser().observe(getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new OooO(), new OooOO0(), null, false, 12));
    }

    private final void observerSearchText() {
        LiveEventBus.get("MainSearch", String.class).observe(getViewLifecycleOwner(), new Observer() { // from class: com.yalla.yalla.ui.fragment.o00000
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                MainSearchUserFragment.observerSearchText$lambda$0(this.f28359OooO0Oo, (String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observerSearchText$lambda$0(MainSearchUserFragment this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (str == null || StringsKt.isBlank(str)) {
            this$0.getBinding().f44823OooO0Oo.OooO0Oo();
            this$0.adapter.OooO0Oo(this$0.getSearchAdapter());
            this$0.getSearchAdapter().OooOoO0(null);
            this$0.adapter.OooO0O0(this$0.getHistoryAdapter());
            this$0.adapter.OooO0O0(this$0.getRecommendTitleAdapter());
            this$0.adapter.OooO0O0(this$0.getRecommendAdapter());
            this$0.adapter.notifyDataSetChanged();
            this$0.getBinding().f44821OooO0O0.OooOo00(false);
        } else {
            this$0.adapter.OooO0Oo(this$0.getHistoryAdapter());
            this$0.adapter.OooO0Oo(this$0.getRecommendTitleAdapter());
            this$0.adapter.OooO0Oo(this$0.getRecommendAdapter());
            this$0.adapter.OooO0O0(this$0.getSearchAdapter());
            if (StringsKt.isBlank(this$0.searchText)) {
                this$0.getBinding().f44823OooO0Oo.OooO0oo();
            }
            Intrinsics.checkNotNull(str);
            this$0.searchUser(str, true);
        }
        this$0.searchText = com.code.android.util.o0OoOo0.OooOOO(str, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchUser(String text, boolean isRefresh) {
        if (isRefresh) {
            this.pageIndex = 1;
        }
        getVm().searchUser(text, this.pageIndex).observe(getViewLifecycleOwner(), new p384o0OOoo0O.o000oOoO(new OooOo00(isRefresh), new OooOo(this, isRefresh), new Oooo000(isRefresh), false, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void userFollow(UserInfoModel item) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            getUserVM().userFollow(com.code.android.util.o0OoOo0.OooOOO0("", Long.valueOf(item.getUserId())), item.getIsFollow()).observe(activity, new OooOOO(new Oooo0(this, item)));
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

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public oO00Oo00 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        oO00Oo00 oo00oo00Inflate = oO00Oo00.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(oo00oo00Inflate, "inflate(...)");
        return oo00oo00Inflate;
    }
}
