package com.yalla.yalla.ui.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.ConcatAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.model.ApiError;
import com.yalla.yalla.common.model.ApiResult;
import com.yalla.yalla.common.model.UserInfoModel;
import com.yalla.yalla.common.ui.view.StateLayout;
import com.yalla.yalla.common.ui.view.UserPrettyIdView;
import com.yalla.yalla.common.ui.view.UserTagView;
import com.yalla.yalla.common.ui.view.refresh.RefreshLayout;
import com.yalla.yalla.data.db.model.SearchHistoryTable;
import com.yalla.yalla.ui.activity.user.UserInfoActivity;
import com.yalla.yalla.ui.fragment.MainSearchUserFragment;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.main.SearchVM;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p391o0OOooOo.o0O00000;
import p407o0Oo0OOo.oO000Oo;
import p558o0oOOoo.o0O00oO0;
import p582o0oOoOoO.d2;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.ib;
import p649o0ooOOoo.kb;
import p649o0ooOOoo.lb;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b,\u0010-J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\u001a\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\u001a\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016R*\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/yalla/yalla/ui/fragment/MainSearchUserFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/ib;", "", "loadRecommendUser", "observerSearchText", "initView", "", ViewHierarchyConstants.TEXT_KEY, "", "isRefresh", "searchUser", "initSearchHistory", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lkotlin/Function0;", "onScrollListener", "Lkotlin/jvm/functions/Function0;", "getOnScrollListener", "()Lkotlin/jvm/functions/Function0;", "setOnScrollListener", "(Lkotlin/jvm/functions/Function0;)V", "searchText", "Ljava/lang/String;", "", "pageIndex", "I", "Lcom/yalla/yalla/ui/vm/main/SearchVM;", "vm$delegate", "Lkotlin/Lazy;", "getVm", "()Lcom/yalla/yalla/ui/vm/main/SearchVM;", "vm", "Landroidx/recyclerview/widget/ConcatAdapter;", "adapter", "Landroidx/recyclerview/widget/ConcatAdapter;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class MainSearchUserFragment extends p503o0o00o00.OooO<ib> {
    public static final int $stable = 8;

    @Nullable
    private p464o0Ooo0oO.o0000OO0 historyAdapter;

    @Nullable
    private p464o0Ooo0oO.o0000OO0 hotTagAdapter;

    @Nullable
    private Function0<Unit> onScrollListener;

    @Nullable
    private p188o00o00o0.OooO0OO<UserInfoModel> recommendAdapter;

    @Nullable
    private p188o00o00o0.OooO0OO<UserInfoModel> searchAdapter;

    @Nullable
    private String searchText;
    private int pageIndex = 1;

    /* JADX INFO: renamed from: vm$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy vm = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(SearchVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.MainSearchUserFragment$special$$inlined$activityViewModels$default$1
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f24009Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f24009Oooo0o;
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

    @NotNull
    private final ConcatAdapter adapter = new ConcatAdapter(new RecyclerView.Adapter[0]);

    public static final class OooO extends Lambda implements Function1<List<? extends UserInfoModel>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24000Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooO(boolean z) {
            super(1);
            this.f24000Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends UserInfoModel> list) {
            List<? extends UserInfoModel> list2 = list;
            if (list2 != null) {
                boolean z = this.f24000Oooo0oO;
                MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
                if (z) {
                    p188o00o00o0.OooO0OO oooO0OO = mainSearchUserFragment.searchAdapter;
                    if (oooO0OO != null) {
                        oooO0OO.setNewData(list2);
                    }
                } else {
                    p188o00o00o0.OooO0OO oooO0OO2 = mainSearchUserFragment.searchAdapter;
                    if (oooO0OO2 != null) {
                        oooO0OO2.addData((Collection) list2);
                    }
                }
            }
            MainSearchUserFragment.this.adapter.notifyDataSetChanged();
            p188o00o00o0.OooO0OO oooO0OO3 = MainSearchUserFragment.this.searchAdapter;
            Collection data = oooO0OO3 != null ? oooO0OO3.getData() : null;
            if (data == null || data.isEmpty()) {
                MainSearchUserFragment.this.getBinding().f49656OooO0Oo.OooO0o0();
            } else {
                if (this.f24000Oooo0oO) {
                    MainSearchUserFragment.this.getBinding().f49655OooO0OO.scrollToPosition(0);
                }
                MainSearchUserFragment.this.getBinding().f49656OooO0Oo.OooO0Oo();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO00o extends p188o00o00o0.OooO0OO<UserInfoModel> {
        public OooO00o(Context context) {
            super(context, R.layout.item_searchfriend_result);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            UserInfoModel userInfoModel = (UserInfoModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            if (userInfoModel == null) {
                return;
            }
            UserTagView userTagView = (UserTagView) helper.OooO0Oo(R.id.searchUserTagView);
            userTagView.OooO0oO(userInfoModel.isPremium(), userInfoModel.getPremiumLevel());
            userTagView.setSex(userInfoModel.getSex());
            userTagView.setName(userInfoModel.getUserName());
            helper.OooO0oO(R.id.iv_officials, userInfoModel.isOfficialRole());
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
            oooO00o2.f48429OooO0OO = userInfoModel.getUserHeader();
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.fr_icon));
        }
    }

    public static final class OooO0O0 extends p188o00o00o0.OooO0OO<UserInfoModel> {
        public OooO0O0(Context context) {
            super(context, R.layout.item_search_user_search);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o helper = (p188o00o00o0.OooO0o) oooO00o;
            UserInfoModel userInfoModel = (UserInfoModel) obj;
            Intrinsics.checkNotNullParameter(helper, "helper");
            if (userInfoModel == null) {
                return;
            }
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(this.mContext);
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
            oooO00o2.f48429OooO0OO = userInfoModel.getUserHeader();
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0o((ImageView) helper.OooO0Oo(R.id.fr_icon));
            helper.OooO0oO(R.id.iv_officials, userInfoModel.isOfficialRole());
            UserTagView userTagView = (UserTagView) helper.OooO0Oo(R.id.userSearch_userTagView);
            SpannableString spannableStringOooO0O0 = p168o00Ooo0.o0O0O00.OooO0O0(p254o00ooO0O.o000O0O0.OooO00o(R.color.color_00d8c9), userInfoModel.getUserName(), MainSearchUserFragment.this.searchText);
            Intrinsics.checkNotNullExpressionValue(spannableStringOooO0O0, "colourStringIgnoreCase(c…tem.userName, searchText)");
            userTagView.setName(spannableStringOooO0O0);
            userTagView.OooO0oO(userInfoModel.isPremium(), userInfoModel.getPremiumLevel());
            userTagView.setSex(userInfoModel.getSex());
            userTagView.setKaVip(userInfoModel.getVipLevel());
            TextView textView = (TextView) helper.OooO0Oo(R.id.tv_id);
            ((UserPrettyIdView) helper.OooO0Oo(R.id.iv_id)).setUserPrettyId(userInfoModel.getIdLevel());
            if (userInfoModel.getIdLevel() != 0) {
                textView.setText(p168o00Ooo0.o0O0O00.OooO0O0(p254o00ooO0O.o000O0O0.OooO00o(R.color.color_00d8c9), userInfoModel.getUserIdx(), MainSearchUserFragment.this.searchText));
                return;
            }
            int iOooO00o = p254o00ooO0O.o000O0O0.OooO00o(R.color.color_00d8c9);
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("ID:");
            sbOooO0o0.append(userInfoModel.getUserIdx());
            textView.setText(p168o00Ooo0.o0O0O00.OooO0O0(iOooO00o, sbOooO0o0.toString(), MainSearchUserFragment.this.searchText));
        }
    }

    public static final class OooO0OO extends Lambda implements Function0<Unit> {
        public OooO0OO() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            String str = MainSearchUserFragment.this.searchText;
            if (str != null) {
                MainSearchUserFragment mainSearchUserFragment = MainSearchUserFragment.this;
                mainSearchUserFragment.getBinding().f49656OooO0Oo.OooO0oo();
                mainSearchUserFragment.searchUser(str, true);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0o extends Lambda implements Function1<List<? extends UserInfoModel>, Unit> {
        public OooO0o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(List<? extends UserInfoModel> list) {
            List<? extends UserInfoModel> list2 = list;
            p188o00o00o0.OooO0OO oooO0OO = MainSearchUserFragment.this.recommendAdapter;
            if (oooO0OO != null) {
                oooO0OO.setNewData(list2);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0 extends Lambda implements Function1<ApiError, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ boolean f24004Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ MainSearchUserFragment f24005Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0(boolean z, MainSearchUserFragment mainSearchUserFragment) {
            super(1);
            this.f24004Oooo0o = z;
            this.f24005Oooo0oO = mainSearchUserFragment;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiError apiError) {
            ApiError it = apiError;
            Intrinsics.checkNotNullParameter(it, "it");
            if (this.f24004Oooo0o) {
                this.f24005Oooo0oO.getBinding().f49656OooO0Oo.OooO0o();
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooOO0O extends Lambda implements Function1<ApiResult<List<? extends UserInfoModel>>, Unit> {

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public final /* synthetic */ boolean f24007Oooo0oO;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OooOO0O(boolean z) {
            super(1);
            this.f24007Oooo0oO = z;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ApiResult<List<? extends UserInfoModel>> apiResult) {
            List<T> data;
            ApiResult<List<? extends UserInfoModel>> it = apiResult;
            Intrinsics.checkNotNullParameter(it, "it");
            RefreshLayout refreshLayout = MainSearchUserFragment.this.getBinding().f49654OooO0O0;
            boolean z = this.f24007Oooo0oO;
            boolean zIsSuccess = it.isSuccess();
            List<? extends UserInfoModel> data2 = it.getData();
            refreshLayout.Oooo00o(z, zIsSuccess, data2 == null || data2.isEmpty());
            if (it.isSuccess()) {
                MainSearchUserFragment.this.pageIndex++;
                p188o00o00o0.OooO0OO oooO0OO = MainSearchUserFragment.this.searchAdapter;
                if (oooO0OO != null && (data = oooO0OO.getData()) != 0) {
                    p522o0o0O0o.o000O0.OooO0Oo(data, OooOOO0.f24065Oooo0o);
                }
                p188o00o00o0.OooO0OO oooO0OO2 = MainSearchUserFragment.this.searchAdapter;
                if (oooO0OO2 != null) {
                    oooO0OO2.notifyDataSetChanged();
                }
            }
            return Unit.INSTANCE;
        }
    }

    private final SearchVM getVm() {
        return (SearchVM) this.vm.getValue();
    }

    private final void initSearchHistory() {
        kb kbVarInflate = kb.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(kbVarInflate, "inflate(layoutInflater)");
        kbVarInflate.f49854OooO0O0.setOnClickListener(new p502o0o00o0.o0000(this, 2));
        FrameLayout frameLayout = kbVarInflate.f49853OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "inflateHistory.root");
        p464o0Ooo0oO.o0000OO0 o0000oo1 = new p464o0Ooo0oO.o0000OO0(frameLayout);
        this.historyAdapter = o0000oo1;
        ConcatAdapter concatAdapter = this.adapter;
        Intrinsics.checkNotNull(o0000oo1);
        concatAdapter.OooO0O0(o0000oo1);
        getVm().getSearchHistoryList().observe(getViewLifecycleOwner(), new o0O00oO0(kbVarInflate, this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initSearchHistory$lambda-15, reason: not valid java name */
    public static final void m371initSearchHistory$lambda15(MainSearchUserFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getVm().clearSearchHistory();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initSearchHistory$lambda-19, reason: not valid java name */
    public static final void m372initSearchHistory$lambda19(kb inflateHistory, MainSearchUserFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(inflateHistory, "$inflateHistory");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        inflateHistory.f49855OooO0OO.removeAllViews();
        Iterator it = list.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            SearchHistoryTable searchHistoryTable = (SearchHistoryTable) it.next();
            View viewInflate = View.inflate(this$0.getContext(), R.layout.tv_search_history, null);
            Intrinsics.checkNotNullExpressionValue(viewInflate, "inflate(context, R.layout.tv_search_history, null)");
            RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.tag_item_relative);
            View childAt = relativeLayout.getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) childAt).setText(searchHistoryTable.getTag());
            relativeLayout.setOnClickListener(new d2(this$0, i));
            inflateHistory.f49855OooO0OO.addView(relativeLayout);
        }
        boolean zIsEmpty = list.isEmpty();
        boolean z = true;
        if (zIsEmpty) {
            p464o0Ooo0oO.o0000OO0 o0000oo1 = this$0.historyAdapter;
            if (o0000oo1 != null) {
                this$0.adapter.OooO0Oo(o0000oo1);
            }
            this$0.adapter.notifyDataSetChanged();
            return;
        }
        String str = this$0.searchText;
        if (str != null && !StringsKt.isBlank(str)) {
            z = false;
        }
        if (z) {
            p464o0Ooo0oO.o0000OO0 o0000oo2 = this$0.historyAdapter;
            if (o0000oo2 != null) {
                this$0.adapter.OooO00o(0, o0000oo2);
            }
            this$0.adapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initSearchHistory$lambda-19$lambda-16, reason: not valid java name */
    public static final void m373initSearchHistory$lambda19$lambda16(MainSearchUserFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view instanceof RelativeLayout) {
            View childAt = ((RelativeLayout) view).getChildAt(0);
            Intrinsics.checkNotNull(childAt, "null cannot be cast to non-null type android.widget.TextView");
            CharSequence text = ((TextView) childAt).getText();
            Intrinsics.checkNotNull(text, "null cannot be cast to non-null type kotlin.String");
            this$0.getVm().getSearchText().postValue((String) text);
        }
    }

    private final void initView() {
        getBinding().f49655OooO0OO.setLayoutManager(new FixLinearLayoutManager(getContext()));
        getBinding().f49654OooO0O0.Oooo0(new o0O0OOO.OooOo00(this));
        initSearchHistory();
        lb lbVarInflate = lb.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(lbVarInflate, "inflate(layoutInflater)");
        FrameLayout frameLayout = lbVarInflate.f49949OooO00o;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "inflateHot.root");
        p464o0Ooo0oO.o0000OO0 o0000oo1 = new p464o0Ooo0oO.o0000OO0(frameLayout);
        this.hotTagAdapter = o0000oo1;
        ConcatAdapter concatAdapter = this.adapter;
        Intrinsics.checkNotNull(o0000oo1);
        concatAdapter.OooO0O0(o0000oo1);
        OooO00o oooO00o = new OooO00o(getContext());
        this.recommendAdapter = oooO00o;
        oooO00o.isUseEmpty(false);
        p188o00o00o0.OooO0OO<UserInfoModel> oooO0OO = this.recommendAdapter;
        if (oooO0OO != null) {
            oooO0OO.setOnItemClickListener(new p142o00OOooO.o0OO00O(this, 2));
        }
        ConcatAdapter concatAdapter2 = this.adapter;
        p188o00o00o0.OooO0OO<UserInfoModel> oooO0OO2 = this.recommendAdapter;
        Intrinsics.checkNotNull(oooO0OO2);
        concatAdapter2.OooO0O0(oooO0OO2);
        getBinding().f49655OooO0OO.setAdapter(this.adapter);
        getBinding().f49655OooO0OO.setOnTouchListener(new View.OnTouchListener() { // from class: o0oOoOoO.e2
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return MainSearchUserFragment.m375initView$lambda12(this.f46849Oooo0o, view, motionEvent);
            }
        });
        OooO0O0 oooO0O0 = new OooO0O0(getContext());
        this.searchAdapter = oooO0O0;
        oooO0O0.setOnItemClickListener(new p192o00o0O0.o00000O(this));
        getBinding().f49656OooO0Oo.setEmptyText(p254o00ooO0O.o000O0O0.OooO0OO(R.string.No_search_results));
        StateLayout stateLayout = getBinding().f49656OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(stateLayout, "binding.stateLayout");
        StateLayout.OooOO0(stateLayout, 0, new OooO0OO(), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.ArrayList, java.util.List<androidx.recyclerview.widget.o0OOO0o>] */
    /* JADX INFO: renamed from: initView$lambda-11, reason: not valid java name */
    public static final void m374initView$lambda11(MainSearchUserFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        List listEmptyList;
        List<UserInfoModel> data;
        UserInfoModel userInfoModel;
        Context context;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        androidx.recyclerview.widget.OooO oooO = this$0.adapter.f8823OooO00o;
        if (oooO.f8867OooO0o0.isEmpty()) {
            listEmptyList = Collections.emptyList();
        } else {
            ArrayList arrayList = new ArrayList(oooO.f8867OooO0o0.size());
            Iterator it = oooO.f8867OooO0o0.iterator();
            while (it.hasNext()) {
                arrayList.add(((androidx.recyclerview.widget.o0OOO0o) it.next()).f9201OooO0OO);
            }
            listEmptyList = arrayList;
        }
        int size = (i - Collections.unmodifiableList(listEmptyList).size()) + 1;
        p188o00o00o0.OooO0OO<UserInfoModel> oooO0OO = this$0.recommendAdapter;
        if (oooO0OO == null || (data = oooO0OO.getData()) == null || (userInfoModel = data.get(size)) == null || (context = this$0.getContext()) == null) {
            return;
        }
        UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, (Activity) context, String.valueOf(userInfoModel.getUserId()), false, 12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-12, reason: not valid java name */
    public static final boolean m375initView$lambda12(MainSearchUserFragment this$0, View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Function0<Unit> function0 = this$0.onScrollListener;
        if (function0 == null) {
            return false;
        }
        function0.invoke();
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-14, reason: not valid java name */
    public static final void m376initView$lambda14(MainSearchUserFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        UserInfoModel item;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p188o00o00o0.OooO0OO<UserInfoModel> oooO0OO = this$0.searchAdapter;
        if (oooO0OO == null || (item = oooO0OO.getItem(i)) == null) {
            return;
        }
        o0O00000.OooO0OO("Search_user");
        this$0.getVm().searchUserStatistic(item.getUserId());
        Context context = this$0.getContext();
        if (context != null) {
            UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, (Activity) context, String.valueOf(item.getUserId()), false, 12);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-9, reason: not valid java name */
    public static final void m377initView$lambda9(MainSearchUserFragment this$0, oO000Oo it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        String str = this$0.searchText;
        if (str == null || StringsKt.isBlank(str)) {
            this$0.getBinding().f49654OooO0O0.setLoadComplete(true);
            return;
        }
        String str2 = this$0.searchText;
        Intrinsics.checkNotNull(str2);
        this$0.searchUser(str2, false);
    }

    private final void loadRecommendUser() {
        getVm().loadRecommendUser().observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO0o(), null, null, false, 14));
    }

    private final void observerSearchText() {
        getVm().getSearchText().observe(getViewLifecycleOwner(), new p142o00OOooO.oo000o(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: observerSearchText$lambda-8, reason: not valid java name */
    public static final void m378observerSearchText$lambda8(MainSearchUserFragment this$0, String text) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (text == null || StringsKt.isBlank(text)) {
            this$0.getBinding().f49656OooO0Oo.OooO0Oo();
            p188o00o00o0.OooO0OO<UserInfoModel> oooO0OO = this$0.searchAdapter;
            if (oooO0OO != null) {
                this$0.adapter.OooO0Oo(oooO0OO);
            }
            p188o00o00o0.OooO0OO<UserInfoModel> oooO0OO2 = this$0.searchAdapter;
            if (oooO0OO2 != null) {
                oooO0OO2.setNewData(null);
            }
            p464o0Ooo0oO.o0000OO0 o0000oo1 = this$0.historyAdapter;
            if (o0000oo1 != null) {
                this$0.adapter.OooO0O0(o0000oo1);
            }
            p464o0Ooo0oO.o0000OO0 o0000oo2 = this$0.hotTagAdapter;
            if (o0000oo2 != null) {
                this$0.adapter.OooO0O0(o0000oo2);
            }
            p188o00o00o0.OooO0OO<UserInfoModel> oooO0OO3 = this$0.recommendAdapter;
            if (oooO0OO3 != null) {
                this$0.adapter.OooO0O0(oooO0OO3);
            }
            this$0.adapter.notifyDataSetChanged();
            this$0.getBinding().f49654OooO0O0.OooOoOO(false);
        } else {
            p464o0Ooo0oO.o0000OO0 o0000oo3 = this$0.historyAdapter;
            if (o0000oo3 != null) {
                this$0.adapter.OooO0Oo(o0000oo3);
            }
            p464o0Ooo0oO.o0000OO0 o0000oo4 = this$0.hotTagAdapter;
            if (o0000oo4 != null) {
                this$0.adapter.OooO0Oo(o0000oo4);
            }
            p188o00o00o0.OooO0OO<UserInfoModel> oooO0OO4 = this$0.recommendAdapter;
            if (oooO0OO4 != null) {
                this$0.adapter.OooO0Oo(oooO0OO4);
            }
            p188o00o00o0.OooO0OO<UserInfoModel> oooO0OO5 = this$0.searchAdapter;
            if (oooO0OO5 != null) {
                this$0.adapter.OooO0O0(oooO0OO5);
            }
            String str = this$0.searchText;
            if (str == null || StringsKt.isBlank(str)) {
                this$0.getBinding().f49656OooO0Oo.OooO0oo();
            }
            Intrinsics.checkNotNullExpressionValue(text, "text");
            this$0.searchUser(text, true);
        }
        this$0.searchText = text;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void searchUser(String text, boolean isRefresh) {
        if (isRefresh) {
            this.pageIndex = 1;
        }
        getVm().searchUser(text, this.pageIndex).observe(getViewLifecycleOwner(), new o0o0000.OooOo(new OooO(isRefresh), new OooOO0(isRefresh, this), new OooOO0O(isRefresh), false, 8));
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
        observerSearchText();
        loadRecommendUser();
    }

    public final void setOnScrollListener(@Nullable Function0<Unit> function0) {
        this.onScrollListener = function0;
    }

    @Override // p503o0o00o00.OooO
    @NotNull
    public ib getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ib ibVarInflate = ib.inflate(inflater);
        Intrinsics.checkNotNullExpressionValue(ibVarInflate, "inflate(inflater)");
        return ibVarInflate;
    }
}
