package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.common.ui.view.SVGAView;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.ui.activity.user.BadgeRankActivity;
import com.yalla.yalla.ui.view.materialdesign.FixGridLayoutManager;
import com.yalla.yalla.ui.vm.user.BadgeVM;
import java.util.Comparator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p393o0OOooOo.o0O00000;
import p540o0o0Oo0.ooo0Oo0;
import p581o0oOoOOo.oO0O00oO;
import p581o0oOoOOo.oOO0OO;
import p618o0oo0Ooo.oO0O000o;
import p623o0oo0o0o.oo00o;
import p651o0ooOOoo.ai;
import p651o0ooOOoo.bi;
import p651o0ooOOoo.ei;
import p651o0ooOOoo.ni;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002:;B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0007H\u0016R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R!\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006<"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/ei;", "", "initView", "initData", "showPopupWindow", "Landroid/view/View;", "orderView", "setCurrentOrderView", "Lcom/yalla/yalla/ui/fragment/BadgeFragment$OooO00o;", "orderType", "", "ignoreOrder", "", "Lcom/yalla/yalla/model/BadgeDataModel;", "dataList", "setOrderAchievementData", "", "position", "", "dataBean", "isFromMe", "showMedalDetailDialog", "showMedalHonorDetailDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onNoDoubleClick", "Lcom/yalla/yalla/ui/vm/user/BadgeVM;", "badgeVM$delegate", "Lkotlin/Lazy;", "getBadgeVM", "()Lcom/yalla/yalla/ui/vm/user/BadgeVM;", "badgeVM", "Lo00o00o0/OooO0OO;", "adapter$delegate", "getAdapter", "()Lo00o00o0/OooO0OO;", "adapter", "Landroid/widget/PopupWindow;", "popupWindow", "Landroid/widget/PopupWindow;", "currentOrderType", "Lcom/yalla/yalla/ui/fragment/BadgeFragment$OooO00o;", "currentOrderView", "Landroid/view/View;", "isHonor", "Z", "<init>", "()V", "Companion", "OooO00o", "OooO0O0", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class BadgeFragment extends p505o0o00o00.OooO<ei> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String HONOR_BADGE = "HONOR_BADGE";

    @Nullable
    private oO0O00oO achievementDetailDialog;

    @Nullable
    private View currentOrderView;

    @Nullable
    private oOO0OO honorDetailDialog;
    private boolean isHonor;
    private ni popupBinding;

    @Nullable
    private PopupWindow popupWindow;

    /* JADX INFO: renamed from: badgeVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy badgeVM = androidx.fragment.app.o0000OO0.OooO0O0(this, Reflection.getOrCreateKotlinClass(BadgeVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.BadgeFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.BadgeFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public final /* synthetic */ Function0 f23828Oooo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23828Oooo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.BadgeFragment$special$$inlined$activityViewModels$default$3
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

    /* JADX INFO: renamed from: adapter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter = LazyKt.lazy(new OooO0o());

    @NotNull
    private OooO00o currentOrderType = OooO00o.OrderDefault;

    public static final class OooO<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((BadgeDataModel) t).getSort()), Integer.valueOf(((BadgeDataModel) t2).getSort()));
        }
    }

    public enum OooO00o {
        OrderDefault,
        OrderTime,
        OrderLevel
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.BadgeFragment$OooO0O0, reason: from kotlin metadata */
    public static final class Companion {
    }

    public /* synthetic */ class OooO0OO {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OooO00o.values().length];
            iArr[OooO00o.OrderDefault.ordinal()] = 1;
            iArr[OooO00o.OrderTime.ordinal()] = 2;
            iArr[OooO00o.OrderLevel.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<com.yalla.yalla.ui.fragment.OooO00o> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.fragment.OooO00o invoke() {
            return new com.yalla.yalla.ui.fragment.OooO00o(BadgeFragment.this, BadgeFragment.this.requireContext());
        }
    }

    public static final class OooOO0<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((BadgeDataModel) t).getSort()), Integer.valueOf(((BadgeDataModel) t2).getSort()));
        }
    }

    public static final class OooOO0O<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(((BadgeDataModel) t2).getSetTime()), Long.valueOf(((BadgeDataModel) t).getSetTime()));
        }
    }

    public static final class OooOOO0<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((BadgeDataModel) t2).getType()), Integer.valueOf(((BadgeDataModel) t).getType()));
        }
    }

    private final p189o00o00o0.OooO0OO<BadgeDataModel> getAdapter() {
        return (p189o00o00o0.OooO0OO) this.adapter.getValue();
    }

    private final BadgeVM getBadgeVM() {
        return (BadgeVM) this.badgeVM.getValue();
    }

    private final void initData() {
        boolean z = this.isHonor;
        if (z) {
            getBadgeVM().getHonorList().observe(getViewLifecycleOwner(), new p160o00OoOO.o00000O(this, 4));
        } else {
            if (z) {
                return;
            }
            getBadgeVM().getAchievementList().observe(getViewLifecycleOwner(), new p160o00OoOO.o0000(this, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-5, reason: not valid java name */
    public static final void m306initData$lambda5(BadgeFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list == null) {
            return;
        }
        this$0.getAdapter().setNewData(list);
        this$0.getAdapter().setLoadComplete();
        this$0.getBinding().f49348OooO0oO.OooOOo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-6, reason: not valid java name */
    public static final void m307initData$lambda6(BadgeFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list == null) {
            return;
        }
        this$0.setOrderAchievementData(this$0.currentOrderType, false, list);
        this$0.getAdapter().setNewData(list);
        this$0.getAdapter().setLoadComplete();
        this$0.getBinding().f49348OooO0oO.OooOOo();
    }

    private final void initView() {
        Bundle arguments = getArguments();
        this.isHonor = arguments != null ? arguments.getBoolean(HONOR_BADGE) : false;
        getBinding().f49348OooO0oO.setOnRefreshListener(new p193o00o0O0.o0000(this));
        getBinding().f49348OooO0oO.OooOoOO(false);
        if (this.isHonor) {
            ConstraintLayout constraintLayout = getBinding().f49343OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clHeader");
            com.yalla.support.common.util.o00O0O.OooO00o(constraintLayout);
        } else {
            getBadgeVM().getCurrentStar().observe(getViewLifecycleOwner(), new p143o00OOooO.o0000O00(this, 7));
            getBadgeVM().getCurrentRank().observe(getViewLifecycleOwner(), new p160o00OoOO.o00000OO(this, 5));
            getBinding().f49347OooO0o0.setTextColor(getBadgeVM().getIsFromMe() ? -1 : com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_999999));
            if (getBadgeVM().getIsFromMe()) {
                AppCompatTextView appCompatTextView = getBinding().f49345OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.tvBadgeOrder");
                com.yalla.support.common.util.o00O0O.OooO(appCompatTextView);
                getBinding().f49347OooO0o0.setBackgroundResource(R.drawable.user_badge_header_no_me);
                getBinding().f49345OooO0Oo.setOnClickListener(this);
                getBinding().f49347OooO0o0.setOnClickListener(this);
            } else {
                getBinding().f49347OooO0o0.setBackgroundResource(R.drawable.user_badge_header_no_other);
                AppCompatTextView appCompatTextView2 = getBinding().f49345OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.tvBadgeOrder");
                com.yalla.support.common.util.o00O0O.OooO00o(appCompatTextView2);
            }
        }
        getAdapter().setOnItemChildClickListener(new OooO00o.OooOO0(this));
        getBinding().f49344OooO0OO.setLayoutManager(new FixGridLayoutManager(getContext(), 2));
        getBinding().f49344OooO0OO.setAdapter(getAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-0, reason: not valid java name */
    public static final void m308initView$lambda0(BadgeFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBadgeVM().requestBadgeInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-1, reason: not valid java name */
    public static final void m309initView$lambda1(BadgeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().f49346OooO0o.setText(String.valueOf(num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m310initView$lambda2(BadgeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AppCompatTextView appCompatTextView = this$0.getBinding().f49347OooO0o0;
        String strOooO0OO = com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_badge_my_Rank_num);
        String[] strArr = new String[1];
        strArr[0] = (num != null && num.intValue() == 0) ? "50+" : String.valueOf(num);
        appCompatTextView.setText(com.yalla.support.common.util.OooOo.OooO00o(strOooO0OO, strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-4, reason: not valid java name */
    public static final void m311initView$lambda4(BadgeFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0O00000.OooO0OO("Badge_details");
        if (this$0.isHonor) {
            Object obj = baseQuickAdapter.getData().get(i);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.BadgeDataModel");
            this$0.showMedalHonorDetailDialog((BadgeDataModel) obj);
        } else {
            List<BadgeDataModel> value = this$0.getBadgeVM().getAchievementList().getValue();
            if (value != null) {
                this$0.showMedalDetailDialog(i, value, this$0.getBadgeVM().getIsFromMe());
            }
        }
    }

    private final void setCurrentOrderView(View orderView) {
        View view = this.currentOrderView;
        if (view != null) {
            com.yalla.support.common.util.o00O0O.OooO0O0(view);
        }
        com.yalla.support.common.util.o00O0O.OooO(orderView);
        this.currentOrderView = orderView;
    }

    private final void setOrderAchievementData(OooO00o orderType, boolean ignoreOrder, List<BadgeDataModel> dataList) {
        if (this.currentOrderType == orderType && ignoreOrder) {
            return;
        }
        int i = OooO0OO.$EnumSwitchMapping$0[orderType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (dataList.size() > 1) {
                        CollectionsKt.sortWith(dataList, new OooOO0());
                    }
                    if (dataList.size() > 1) {
                        CollectionsKt.sortWith(dataList, new OooOOO0());
                    }
                }
            } else if (dataList.size() > 1) {
                CollectionsKt.sortWith(dataList, new OooOO0O());
            }
        } else if (dataList.size() > 1) {
            CollectionsKt.sortWith(dataList, new OooO());
        }
        this.currentOrderType = orderType;
    }

    public static /* synthetic */ void setOrderAchievementData$default(BadgeFragment badgeFragment, OooO00o oooO00o, boolean z, List list, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        badgeFragment.setOrderAchievementData(oooO00o, z, list);
    }

    private final void showMedalDetailDialog(int position, List<BadgeDataModel> dataBean, boolean isFromMe) {
        if (this.achievementDetailDialog == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            this.achievementDetailDialog = new oO0O00oO(fragmentActivityRequireActivity);
        }
        oO0O00oO oo0o00oo = this.achievementDetailDialog;
        if (oo0o00oo != null) {
            Intrinsics.checkNotNullParameter(dataBean, "data");
            oo0o00oo.f46046Ooooo00 = position;
            oo0o00oo.f46047Ooooo0o = isFromMe;
            p189o00o00o0.OooO0OO<BadgeDataModel> oooO0OO = oo0o00oo.f46044OoooOoO;
            ai aiVar = null;
            if (oooO0OO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO = null;
            }
            oooO0OO.setNewData(dataBean);
            ai aiVar2 = oo0o00oo.f46045OoooOoo;
            if (aiVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aiVar2 = null;
            }
            aiVar2.f49004OooO0o0.scrollToPosition(position);
            ai aiVar3 = oo0o00oo.f46045OoooOoo;
            if (aiVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                aiVar3 = null;
            }
            AppCompatImageView appCompatImageView = aiVar3.f49002OooO0OO;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            if (position == 0) {
                com.yalla.support.common.util.o00O0O.OooO00o(appCompatImageView);
            } else {
                com.yalla.support.common.util.o00O0O.OooO(appCompatImageView);
            }
            ai aiVar4 = oo0o00oo.f46045OoooOoo;
            if (aiVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                aiVar = aiVar4;
            }
            AppCompatImageView appCompatImageView2 = aiVar.f49003OooO0Oo;
            int size = dataBean.size() - 1;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            if (position == size) {
                com.yalla.support.common.util.o00O0O.OooO00o(appCompatImageView2);
            } else {
                com.yalla.support.common.util.o00O0O.OooO(appCompatImageView2);
            }
        }
        oO0O00oO oo0o00oo2 = this.achievementDetailDialog;
        if (oo0o00oo2 != null) {
            oo0o00oo2.f46048OooooO0 = Intrinsics.areEqual(p500o0o00Oo0.OooOOO.f41235OooO00o.OooOO0o().getValue(), Boolean.TRUE);
        }
        oO0O00oO oo0o00oo3 = this.achievementDetailDialog;
        if (oo0o00oo3 != null) {
            oo0o00oo3.show();
        }
    }

    private final void showMedalHonorDetailDialog(BadgeDataModel dataBean) {
        if (this.honorDetailDialog == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            this.honorDetailDialog = new oOO0OO(fragmentActivityRequireActivity);
        }
        oOO0OO ooo0oo = this.honorDetailDialog;
        if (ooo0oo != null) {
            Intrinsics.checkNotNullParameter(dataBean, "data");
            if (dataBean.getState() == 1) {
                ooo0oo.OooO0Oo(R.drawable.icon_medal_colour_bar);
                ooo0oo.OooO0o0(dataBean.getRanking(), p169o00Ooo0.o00oO0o.OooO0O0(dataBean.getMedalId()));
            } else {
                ooo0oo.OooO0Oo(0);
                ooo0oo.OooO0o0(0, R.color.color_7A46F9);
            }
            Uri uriOooO00o = p169o00Ooo0.o00oO0o.OooO00o(dataBean.getMedalId(), dataBean.getState());
            if (uriOooO00o == null) {
                bi biVar = ooo0oo.f46122OoooOo0;
                if (biVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    biVar = null;
                }
                biVar.f49050OooO0O0.setImageDrawable(null);
                bi biVar2 = ooo0oo.f46122OoooOo0;
                if (biVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    biVar2 = null;
                }
                AppCompatImageView appCompatImageView = biVar2.f49050OooO0O0;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivBadge");
                com.yalla.support.common.util.o00O0O.OooO0O0(appCompatImageView);
                bi biVar3 = ooo0oo.f46122OoooOo0;
                if (biVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    biVar3 = null;
                }
                SVGAView sVGAView = biVar3.f49052OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.sdvMedal");
                com.yalla.support.common.util.o00O0O.OooO0O0(sVGAView);
            } else {
                String string = uriOooO00o.toString();
                Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
                if (StringsKt.OooO0OO(string, ".svga")) {
                    bi biVar4 = ooo0oo.f46122OoooOo0;
                    if (biVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        biVar4 = null;
                    }
                    SVGAView sVGAView2 = biVar4.f49052OooO0Oo;
                    sVGAView2.f21029OooooOo = R.drawable.icon_badge_no_pic;
                    String string2 = uriOooO00o.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "uri.toString()");
                    sVGAView2.OooO0oo(string2, ooo0oo);
                    sVGAView2.OooO();
                    bi biVar5 = ooo0oo.f46122OoooOo0;
                    if (biVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        biVar5 = null;
                    }
                    AppCompatImageView appCompatImageView2 = biVar5.f49050OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.ivBadge");
                    com.yalla.support.common.util.o00O0O.OooO00o(appCompatImageView2);
                    bi biVar6 = ooo0oo.f46122OoooOo0;
                    if (biVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        biVar6 = null;
                    }
                    SVGAView sVGAView3 = biVar6.f49052OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(sVGAView3, "binding.sdvMedal");
                    com.yalla.support.common.util.o00O0O.OooO(sVGAView3);
                } else {
                    oO0O000o.OooO00o oooO00o = new oO0O000o.OooO00o(ooo0oo.getContext());
                    oooO00o.f48447OooO0OO = uriOooO00o.toString();
                    oooO00o.f48445OooO00o = 0;
                    bi biVar7 = ooo0oo.f46122OoooOo0;
                    if (biVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        biVar7 = null;
                    }
                    oooO00o.OooO0o(biVar7.f49050OooO0O0);
                    bi biVar8 = ooo0oo.f46122OoooOo0;
                    if (biVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        biVar8 = null;
                    }
                    AppCompatImageView appCompatImageView3 = biVar8.f49050OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "binding.ivBadge");
                    com.yalla.support.common.util.o00O0O.OooO(appCompatImageView3);
                    bi biVar9 = ooo0oo.f46122OoooOo0;
                    if (biVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        biVar9 = null;
                    }
                    SVGAView sVGAView4 = biVar9.f49052OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(sVGAView4, "binding.sdvMedal");
                    com.yalla.support.common.util.o00O0O.OooO00o(sVGAView4);
                }
            }
            String name = dataBean.getName();
            bi biVar10 = ooo0oo.f46122OoooOo0;
            if (biVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                biVar10 = null;
            }
            AppCompatTextView appCompatTextView = biVar10.f49055OooO0oO;
            if (StringsKt.isBlank(name)) {
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                com.yalla.support.common.util.o00O0O.OooO0O0(appCompatTextView);
                appCompatTextView.setText((CharSequence) null);
            } else {
                appCompatTextView.setText(name);
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
                com.yalla.support.common.util.o00O0O.OooO(appCompatTextView);
            }
            long setTime = dataBean.getSetTime();
            bi biVar11 = ooo0oo.f46122OoooOo0;
            if (biVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                biVar11 = null;
            }
            AppCompatTextView appCompatTextView2 = biVar11.f49048OooO;
            if (setTime > 0) {
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                com.yalla.support.common.util.o00O0O.OooO(appCompatTextView2);
                appCompatTextView2.setText(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_badge_time), oo00o.f48643OooO00o.OooO0OO(setTime, "dd/MM/yyyy")));
            } else {
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                com.yalla.support.common.util.o00O0O.OooO00o(appCompatTextView2);
            }
            String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(dataBean.getState() == 1 ? dataBean.getRemark1() : dataBean.getRemark(), dataBean.getRanking() + "");
            bi biVar12 = ooo0oo.f46122OoooOo0;
            if (biVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                biVar12 = null;
            }
            AppCompatTextView appCompatTextView3 = biVar12.f49053OooO0o;
            if (StringsKt.isBlank(strOooO00o)) {
                Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
                com.yalla.support.common.util.o00O0O.OooO0O0(appCompatTextView3);
                appCompatTextView3.setText((CharSequence) null);
            } else {
                appCompatTextView3.setText(strOooO00o);
                Intrinsics.checkNotNullExpressionValue(appCompatTextView3, "");
                com.yalla.support.common.util.o00O0O.OooO(appCompatTextView3);
            }
        }
        oOO0OO ooo0oo2 = this.honorDetailDialog;
        if (ooo0oo2 != null) {
            ooo0oo2.show();
        }
    }

    private final void showPopupWindow() {
        if (this.popupWindow == null) {
            ni niVarInflate = ni.inflate(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(niVarInflate, "inflate(layoutInflater)");
            this.popupBinding = niVarInflate;
            ni niVar = this.popupBinding;
            ni niVar2 = null;
            if (niVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                niVar = null;
            }
            int i = 1;
            PopupWindow popupWindow = new PopupWindow((View) niVar.f50153OooO00o, -2, -2, true);
            this.popupWindow = popupWindow;
            popupWindow.setAnimationStyle(R.anim.user_badge_right_enter);
            PopupWindow popupWindow2 = this.popupWindow;
            if (popupWindow2 != null) {
                popupWindow2.setTouchable(true);
            }
            PopupWindow popupWindow3 = this.popupWindow;
            if (popupWindow3 != null) {
                popupWindow3.setBackgroundDrawable(com.yalla.support.common.util.OooOOO.OooO0O0(R.drawable.user_shape_transparent));
            }
            ni niVar3 = this.popupBinding;
            if (niVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                niVar3 = null;
            }
            niVar3.f50158OooO0o0.setOnClickListener(new o00OO0O0.OooO0O0(this, 3));
            ni niVar4 = this.popupBinding;
            if (niVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                niVar4 = null;
            }
            niVar4.f50159OooO0oO.setOnClickListener(new ooo0Oo0(this, i));
            ni niVar5 = this.popupBinding;
            if (niVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                niVar5 = null;
            }
            niVar5.f50157OooO0o.setOnClickListener(new o00OO0O0.OooO00o(this, 2));
            ni niVar6 = this.popupBinding;
            if (niVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            } else {
                niVar2 = niVar6;
            }
            this.currentOrderView = niVar2.f50154OooO0O0;
        }
        View view = this.currentOrderView;
        if (view != null) {
            com.yalla.support.common.util.o00O0O.OooO(view);
        }
        PopupWindow popupWindow4 = this.popupWindow;
        if (popupWindow4 != null) {
            popupWindow4.getContentView().measure(0, 0);
            popupWindow4.showAsDropDown(getBinding().f49345OooO0Oo, p169o00Ooo0.oo000o.OooO0o0() ? (-getBinding().f49345OooO0Oo.getWidth()) - com.yalla.support.common.util.OooOo00.OooO00o(14.0f) : (getBinding().f49345OooO0Oo.getWidth() - popupWindow4.getContentView().getMeasuredWidth()) + com.yalla.support.common.util.OooOo00.OooO00o(14.0f), (-getBinding().f49345OooO0Oo.getHeight()) - com.yalla.support.common.util.OooOo00.OooO00o(2.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showPopupWindow$lambda-7, reason: not valid java name */
    public static final void m312showPopupWindow$lambda7(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ni niVar = this$0.popupBinding;
        if (niVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            niVar = null;
        }
        AppCompatImageView appCompatImageView = niVar.f50154OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "popupBinding.ivDefault");
        this$0.setCurrentOrderView(appCompatImageView);
        OooO00o oooO00o = OooO00o.OrderDefault;
        List<BadgeDataModel> data = this$0.getAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
        setOrderAchievementData$default(this$0, oooO00o, false, data, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f49345OooO0Oo.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_badge_pop_default));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showPopupWindow$lambda-8, reason: not valid java name */
    public static final void m313showPopupWindow$lambda8(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ni niVar = this$0.popupBinding;
        if (niVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            niVar = null;
        }
        AppCompatImageView appCompatImageView = niVar.f50156OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "popupBinding.ivTime");
        this$0.setCurrentOrderView(appCompatImageView);
        OooO00o oooO00o = OooO00o.OrderTime;
        List<BadgeDataModel> data = this$0.getAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
        setOrderAchievementData$default(this$0, oooO00o, false, data, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f49345OooO0Oo.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_badge_pop_time));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showPopupWindow$lambda-9, reason: not valid java name */
    public static final void m314showPopupWindow$lambda9(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        ni niVar = this$0.popupBinding;
        if (niVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            niVar = null;
        }
        AppCompatImageView appCompatImageView = niVar.f50155OooO0OO;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "popupBinding.ivLevel");
        this$0.setCurrentOrderView(appCompatImageView);
        OooO00o oooO00o = OooO00o.OrderLevel;
        List<BadgeDataModel> data = this$0.getAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
        setOrderAchievementData$default(this$0, oooO00o, false, data, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f49345OooO0Oo.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_badge_pop_level));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // p505o0o00o00.OooO
    public void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onNoDoubleClick(view);
        if (!Intrinsics.areEqual(view, getBinding().f49347OooO0o0)) {
            if (Intrinsics.areEqual(view, getBinding().f49345OooO0Oo)) {
                showPopupWindow();
            }
        } else {
            o0O00000.OooO0OO("Badge_ranking");
            BadgeRankActivity.OooO00o oooO00o = BadgeRankActivity.f23318OoooooO;
            Context context = getBinding().f49342OooO00o.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "binding.root.context");
            Intrinsics.checkNotNullParameter(context, "context");
            context.startActivity(new Intent(context, (Class<?>) BadgeRankActivity.class));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        initView();
        initData();
    }

    @Override // p505o0o00o00.OooO
    @NotNull
    public ei getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ei eiVarInflate = ei.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(eiVarInflate, "inflate(layoutInflater)");
        return eiVarInflate;
    }
}
