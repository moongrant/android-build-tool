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
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p391o0OOooOo.o0O00000;
import p538o0o0Oo0.ooo0Oo0;
import p579o0oOoOOo.oO0O0;
import p579o0oOoOOo.oOO0OOO;
import p616o0oo0Ooo.oO0O00;
import p621o0oo0o0o.o00O0;
import p649o0ooOOoo.bi;
import p649o0ooOOoo.ci;
import p649o0ooOOoo.fi;
import p649o0ooOOoo.oi;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u0000 92\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002:;B\u0007¢\u0006\u0004\b7\u00108J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0007H\u0016R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R!\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010,R\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00103\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00105\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u0006<"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/fi;", "", "initView", "initData", "showPopupWindow", "Landroid/view/View;", "orderView", "setCurrentOrderView", "Lcom/yalla/yalla/ui/fragment/BadgeFragment$OooO00o;", "orderType", "", "ignoreOrder", "", "Lcom/yalla/yalla/model/BadgeDataModel;", "dataList", "setOrderAchievementData", "", "position", "", "dataBean", "isFromMe", "showMedalDetailDialog", "showMedalHonorDetailDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onNoDoubleClick", "Lcom/yalla/yalla/ui/vm/user/BadgeVM;", "badgeVM$delegate", "Lkotlin/Lazy;", "getBadgeVM", "()Lcom/yalla/yalla/ui/vm/user/BadgeVM;", "badgeVM", "Lo00o00o0/OooO0OO;", "adapter$delegate", "getAdapter", "()Lo00o00o0/OooO0OO;", "adapter", "Landroid/widget/PopupWindow;", "popupWindow", "Landroid/widget/PopupWindow;", "currentOrderType", "Lcom/yalla/yalla/ui/fragment/BadgeFragment$OooO00o;", "currentOrderView", "Landroid/view/View;", "isHonor", "Z", "<init>", "()V", "Companion", "OooO00o", "OooO0O0", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class BadgeFragment extends p503o0o00o00.OooO<fi> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String HONOR_BADGE = "HONOR_BADGE";

    @Nullable
    private oO0O0 achievementDetailDialog;

    @Nullable
    private View currentOrderView;

    @Nullable
    private oOO0OOO honorDetailDialog;
    private boolean isHonor;
    private oi popupBinding;

    @Nullable
    private PopupWindow popupWindow;

    /* JADX INFO: renamed from: badgeVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy badgeVM = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(BadgeVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.BadgeFragment$special$$inlined$activityViewModels$default$1
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23809Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23809Oooo0o;
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

    private final p188o00o00o0.OooO0OO<BadgeDataModel> getAdapter() {
        return (p188o00o00o0.OooO0OO) this.adapter.getValue();
    }

    private final BadgeVM getBadgeVM() {
        return (BadgeVM) this.badgeVM.getValue();
    }

    private final void initData() {
        boolean z = this.isHonor;
        if (z) {
            getBadgeVM().getHonorList().observe(getViewLifecycleOwner(), new p159o00OoOO.o00000O(this, 4));
        } else {
            if (z) {
                return;
            }
            getBadgeVM().getAchievementList().observe(getViewLifecycleOwner(), new p159o00OoOO.o0000(this, 5));
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
        this$0.getBinding().f49411OooO0oO.OooOOo();
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
        this$0.getBinding().f49411OooO0oO.OooOOo();
    }

    private final void initView() {
        Bundle arguments = getArguments();
        this.isHonor = arguments != null ? arguments.getBoolean(HONOR_BADGE) : false;
        getBinding().f49411OooO0oO.setOnRefreshListener(new p192o00o0O0.o0000(this));
        getBinding().f49411OooO0oO.OooOoOO(false);
        if (this.isHonor) {
            ConstraintLayout constraintLayout = getBinding().f49406OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clHeader");
            com.yalla.support.common.util.o00O0O.OooO00o(constraintLayout);
        } else {
            getBadgeVM().getCurrentStar().observe(getViewLifecycleOwner(), new p142o00OOooO.o0000O00(this, 7));
            getBadgeVM().getCurrentRank().observe(getViewLifecycleOwner(), new p159o00OoOO.o00000OO(this, 5));
            getBinding().f49410OooO0o0.setTextColor(getBadgeVM().getIsFromMe() ? -1 : com.yalla.support.common.util.OooOOO.OooO00o(R.color.color_999999));
            if (getBadgeVM().getIsFromMe()) {
                AppCompatTextView appCompatTextView = getBinding().f49408OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.tvBadgeOrder");
                com.yalla.support.common.util.o00O0O.OooO(appCompatTextView);
                getBinding().f49410OooO0o0.setBackgroundResource(R.drawable.user_badge_header_no_me);
                getBinding().f49408OooO0Oo.setOnClickListener(this);
                getBinding().f49410OooO0o0.setOnClickListener(this);
            } else {
                getBinding().f49410OooO0o0.setBackgroundResource(R.drawable.user_badge_header_no_other);
                AppCompatTextView appCompatTextView2 = getBinding().f49408OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.tvBadgeOrder");
                com.yalla.support.common.util.o00O0O.OooO00o(appCompatTextView2);
            }
        }
        getAdapter().setOnItemChildClickListener(new OooO00o.OooOO0(this));
        getBinding().f49407OooO0OO.setLayoutManager(new FixGridLayoutManager(getContext(), 2));
        getBinding().f49407OooO0OO.setAdapter(getAdapter());
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
        this$0.getBinding().f49409OooO0o.setText(String.valueOf(num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m310initView$lambda2(BadgeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AppCompatTextView appCompatTextView = this$0.getBinding().f49410OooO0o0;
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
            this.achievementDetailDialog = new oO0O0(fragmentActivityRequireActivity);
        }
        oO0O0 oo0o0 = this.achievementDetailDialog;
        if (oo0o0 != null) {
            Intrinsics.checkNotNullParameter(dataBean, "data");
            oo0o0.f46029OoooOo0 = position;
            oo0o0.f46030OoooOoO = isFromMe;
            p188o00o00o0.OooO0OO<BadgeDataModel> oooO0OO = oo0o0.f46027OoooOOO;
            bi biVar = null;
            if (oooO0OO == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                oooO0OO = null;
            }
            oooO0OO.setNewData(dataBean);
            bi biVar2 = oo0o0.f46028OoooOOo;
            if (biVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                biVar2 = null;
            }
            biVar2.f49067OooO0o0.scrollToPosition(position);
            bi biVar3 = oo0o0.f46028OoooOOo;
            if (biVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                biVar3 = null;
            }
            AppCompatImageView appCompatImageView = biVar3.f49065OooO0OO;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView, "");
            if (position == 0) {
                com.yalla.support.common.util.o00O0O.OooO00o(appCompatImageView);
            } else {
                com.yalla.support.common.util.o00O0O.OooO(appCompatImageView);
            }
            bi biVar4 = oo0o0.f46028OoooOOo;
            if (biVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                biVar = biVar4;
            }
            AppCompatImageView appCompatImageView2 = biVar.f49066OooO0Oo;
            int size = dataBean.size() - 1;
            Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "");
            if (position == size) {
                com.yalla.support.common.util.o00O0O.OooO00o(appCompatImageView2);
            } else {
                com.yalla.support.common.util.o00O0O.OooO(appCompatImageView2);
            }
        }
        oO0O0 oo0o1 = this.achievementDetailDialog;
        if (oo0o1 != null) {
            oo0o1.f46031OoooOoo = Intrinsics.areEqual(p498o0o00Oo0.OooOOO.f41216OooO00o.OooOO0o().getValue(), Boolean.TRUE);
        }
        oO0O0 oo0o2 = this.achievementDetailDialog;
        if (oo0o2 != null) {
            oo0o2.show();
        }
    }

    private final void showMedalHonorDetailDialog(BadgeDataModel dataBean) {
        if (this.honorDetailDialog == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            this.honorDetailDialog = new oOO0OOO(fragmentActivityRequireActivity);
        }
        oOO0OOO ooo0ooo = this.honorDetailDialog;
        if (ooo0ooo != null) {
            Intrinsics.checkNotNullParameter(dataBean, "data");
            if (dataBean.getState() == 1) {
                ooo0ooo.OooO0Oo(R.drawable.icon_medal_colour_bar);
                ooo0ooo.OooO0o0(dataBean.getRanking(), p168o00Ooo0.o00oO0o.OooO0O0(dataBean.getMedalId()));
            } else {
                ooo0ooo.OooO0Oo(0);
                ooo0ooo.OooO0o0(0, R.color.color_7A46F9);
            }
            Uri uriOooO00o = p168o00Ooo0.o00oO0o.OooO00o(dataBean.getMedalId(), dataBean.getState());
            if (uriOooO00o == null) {
                ci ciVar = ooo0ooo.f46097o000oOoO;
                if (ciVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ciVar = null;
                }
                ciVar.f49113OooO0O0.setImageDrawable(null);
                ci ciVar2 = ooo0ooo.f46097o000oOoO;
                if (ciVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ciVar2 = null;
                }
                AppCompatImageView appCompatImageView = ciVar2.f49113OooO0O0;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivBadge");
                com.yalla.support.common.util.o00O0O.OooO0O0(appCompatImageView);
                ci ciVar3 = ooo0ooo.f46097o000oOoO;
                if (ciVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    ciVar3 = null;
                }
                SVGAView sVGAView = ciVar3.f49115OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.sdvMedal");
                com.yalla.support.common.util.o00O0O.OooO0O0(sVGAView);
            } else {
                String string = uriOooO00o.toString();
                Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
                if (StringsKt__StringsKt.contains$default(string, ".svga", false, 2, (Object) null)) {
                    ci ciVar4 = ooo0ooo.f46097o000oOoO;
                    if (ciVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ciVar4 = null;
                    }
                    SVGAView sVGAView2 = ciVar4.f49115OooO0Oo;
                    sVGAView2.f21010OooooO0 = R.drawable.icon_badge_no_pic;
                    String string2 = uriOooO00o.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "uri.toString()");
                    sVGAView2.OooO0oo(string2, ooo0ooo);
                    sVGAView2.OooO();
                    ci ciVar5 = ooo0ooo.f46097o000oOoO;
                    if (ciVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ciVar5 = null;
                    }
                    AppCompatImageView appCompatImageView2 = ciVar5.f49113OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.ivBadge");
                    com.yalla.support.common.util.o00O0O.OooO00o(appCompatImageView2);
                    ci ciVar6 = ooo0ooo.f46097o000oOoO;
                    if (ciVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ciVar6 = null;
                    }
                    SVGAView sVGAView3 = ciVar6.f49115OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(sVGAView3, "binding.sdvMedal");
                    com.yalla.support.common.util.o00O0O.OooO(sVGAView3);
                } else {
                    oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(ooo0ooo.getContext());
                    oooO00o.f48429OooO0OO = uriOooO00o.toString();
                    oooO00o.f48427OooO00o = 0;
                    ci ciVar7 = ooo0ooo.f46097o000oOoO;
                    if (ciVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ciVar7 = null;
                    }
                    oooO00o.OooO0o(ciVar7.f49113OooO0O0);
                    ci ciVar8 = ooo0ooo.f46097o000oOoO;
                    if (ciVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ciVar8 = null;
                    }
                    AppCompatImageView appCompatImageView3 = ciVar8.f49113OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "binding.ivBadge");
                    com.yalla.support.common.util.o00O0O.OooO(appCompatImageView3);
                    ci ciVar9 = ooo0ooo.f46097o000oOoO;
                    if (ciVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        ciVar9 = null;
                    }
                    SVGAView sVGAView4 = ciVar9.f49115OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(sVGAView4, "binding.sdvMedal");
                    com.yalla.support.common.util.o00O0O.OooO00o(sVGAView4);
                }
            }
            String name = dataBean.getName();
            ci ciVar10 = ooo0ooo.f46097o000oOoO;
            if (ciVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ciVar10 = null;
            }
            AppCompatTextView appCompatTextView = ciVar10.f49118OooO0oO;
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
            ci ciVar11 = ooo0ooo.f46097o000oOoO;
            if (ciVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ciVar11 = null;
            }
            AppCompatTextView appCompatTextView2 = ciVar11.f49111OooO;
            if (setTime > 0) {
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                com.yalla.support.common.util.o00O0O.OooO(appCompatTextView2);
                appCompatTextView2.setText(com.yalla.support.common.util.OooOo.OooO00o(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_badge_time), o00O0.f48624OooO00o.OooO0OO(setTime, "dd/MM/yyyy")));
            } else {
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
                com.yalla.support.common.util.o00O0O.OooO00o(appCompatTextView2);
            }
            String strOooO00o = com.yalla.support.common.util.OooOo.OooO00o(dataBean.getState() == 1 ? dataBean.getRemark1() : dataBean.getRemark(), dataBean.getRanking() + "");
            ci ciVar12 = ooo0ooo.f46097o000oOoO;
            if (ciVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                ciVar12 = null;
            }
            AppCompatTextView appCompatTextView3 = ciVar12.f49116OooO0o;
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
        oOO0OOO ooo0ooo2 = this.honorDetailDialog;
        if (ooo0ooo2 != null) {
            ooo0ooo2.show();
        }
    }

    private final void showPopupWindow() {
        if (this.popupWindow == null) {
            oi oiVarInflate = oi.inflate(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(oiVarInflate, "inflate(layoutInflater)");
            this.popupBinding = oiVarInflate;
            oi oiVar = this.popupBinding;
            oi oiVar2 = null;
            if (oiVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                oiVar = null;
            }
            int i = 1;
            PopupWindow popupWindow = new PopupWindow((View) oiVar.f50216OooO00o, -2, -2, true);
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
            oi oiVar3 = this.popupBinding;
            if (oiVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                oiVar3 = null;
            }
            oiVar3.f50221OooO0o0.setOnClickListener(new o00OO0O0.OooO0O0(this, 3));
            oi oiVar4 = this.popupBinding;
            if (oiVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                oiVar4 = null;
            }
            oiVar4.f50222OooO0oO.setOnClickListener(new ooo0Oo0(this, i));
            oi oiVar5 = this.popupBinding;
            if (oiVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                oiVar5 = null;
            }
            oiVar5.f50220OooO0o.setOnClickListener(new o00OO0O0.OooO00o(this, 2));
            oi oiVar6 = this.popupBinding;
            if (oiVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            } else {
                oiVar2 = oiVar6;
            }
            this.currentOrderView = oiVar2.f50217OooO0O0;
        }
        View view = this.currentOrderView;
        if (view != null) {
            com.yalla.support.common.util.o00O0O.OooO(view);
        }
        PopupWindow popupWindow4 = this.popupWindow;
        if (popupWindow4 != null) {
            popupWindow4.getContentView().measure(0, 0);
            popupWindow4.showAsDropDown(getBinding().f49408OooO0Oo, p168o00Ooo0.oo000o.OooO0o0() ? (-getBinding().f49408OooO0Oo.getWidth()) - com.yalla.support.common.util.OooOo00.OooO00o(14.0f) : (getBinding().f49408OooO0Oo.getWidth() - popupWindow4.getContentView().getMeasuredWidth()) + com.yalla.support.common.util.OooOo00.OooO00o(14.0f), (-getBinding().f49408OooO0Oo.getHeight()) - com.yalla.support.common.util.OooOo00.OooO00o(2.0f));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showPopupWindow$lambda-7, reason: not valid java name */
    public static final void m312showPopupWindow$lambda7(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oi oiVar = this$0.popupBinding;
        if (oiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            oiVar = null;
        }
        AppCompatImageView appCompatImageView = oiVar.f50217OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "popupBinding.ivDefault");
        this$0.setCurrentOrderView(appCompatImageView);
        OooO00o oooO00o = OooO00o.OrderDefault;
        List<BadgeDataModel> data = this$0.getAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
        setOrderAchievementData$default(this$0, oooO00o, false, data, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f49408OooO0Oo.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_badge_pop_default));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showPopupWindow$lambda-8, reason: not valid java name */
    public static final void m313showPopupWindow$lambda8(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oi oiVar = this$0.popupBinding;
        if (oiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            oiVar = null;
        }
        AppCompatImageView appCompatImageView = oiVar.f50219OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "popupBinding.ivTime");
        this$0.setCurrentOrderView(appCompatImageView);
        OooO00o oooO00o = OooO00o.OrderTime;
        List<BadgeDataModel> data = this$0.getAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
        setOrderAchievementData$default(this$0, oooO00o, false, data, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f49408OooO0Oo.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_badge_pop_time));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: showPopupWindow$lambda-9, reason: not valid java name */
    public static final void m314showPopupWindow$lambda9(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        oi oiVar = this$0.popupBinding;
        if (oiVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            oiVar = null;
        }
        AppCompatImageView appCompatImageView = oiVar.f50218OooO0OO;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "popupBinding.ivLevel");
        this$0.setCurrentOrderView(appCompatImageView);
        OooO00o oooO00o = OooO00o.OrderLevel;
        List<BadgeDataModel> data = this$0.getAdapter().getData();
        Intrinsics.checkNotNullExpressionValue(data, "adapter.data");
        setOrderAchievementData$default(this$0, oooO00o, false, data, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f49408OooO0Oo.setText(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.user_badge_pop_level));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // p503o0o00o00.OooO
    public void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onNoDoubleClick(view);
        if (!Intrinsics.areEqual(view, getBinding().f49410OooO0o0)) {
            if (Intrinsics.areEqual(view, getBinding().f49408OooO0Oo)) {
                showPopupWindow();
            }
        } else {
            o0O00000.OooO0OO("Badge_ranking");
            BadgeRankActivity.OooO00o oooO00o = BadgeRankActivity.f23299OooooOo;
            Context context = getBinding().f49405OooO00o.getContext();
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

    @Override // p503o0o00o00.OooO
    @NotNull
    public fi getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        fi fiVarInflate = fi.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(fiVarInflate, "inflate(layoutInflater)");
        return fiVarInflate;
    }
}
