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
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.code.android.uikit.svga.SVGAView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p519o0o0O0oO.oO000O0;
import p579o0oOoo.oOo00o0o;
import p584o0oOooO0.oO000o00;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p587o0oOooo.o0OO000;
import p641o0ooOOOO.eb;
import p641o0ooOOOO.ra;
import p641o0ooOOOO.sa;
import p641o0ooOOOO.va;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002CDB\u0007¢\u0006\u0004\b@\u0010AJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0007H\u0016R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R!\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006E"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/va;", "", "initView", "initData", "showPopupWindow", "Landroid/view/View;", "orderView", "setCurrentOrderView", "Lcom/yalla/yalla/ui/fragment/BadgeFragment$OooO00o;", "orderType", "", "ignoreOrder", "", "Lcom/yalla/yalla/model/BadgeDataModel;", "dataList", "setOrderAchievementData", "", "position", "", "dataBean", "isFromMe", "showMedalDetailDialog", "showMedalHonorDetailDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onNoDoubleClick", "Lcom/yalla/yalla/ui/vm/user/BadgeVM;", "badgeVM$delegate", "Lkotlin/Lazy;", "getBadgeVM", "()Lcom/yalla/yalla/ui/vm/user/BadgeVM;", "badgeVM", "Lo0o0O0oO/o000;", "achievementDetailDialog", "Lo0o0O0oO/o000;", "Lo0o0O0oO/oO000O0;", "honorDetailDialog", "Lo0o0O0oO/oO000O0;", "Lo0oOo0OO/o000O;", "adapter$delegate", "getAdapter", "()Lo0oOo0OO/o000O;", "adapter", "Landroid/widget/PopupWindow;", "popupWindow", "Landroid/widget/PopupWindow;", "currentOrderType", "Lcom/yalla/yalla/ui/fragment/BadgeFragment$OooO00o;", "currentOrderView", "Landroid/view/View;", "isHonor", "Z", "Lo0ooOOOO/eb;", "popupBinding", "Lo0ooOOOO/eb;", "<init>", "()V", "Companion", "OooO00o", "OooO0O0", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadgeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n172#2,9:292\n1002#3,2:301\n1011#3,2:303\n1002#3,2:305\n1011#3,2:307\n*S KotlinDebug\n*F\n+ 1 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n*L\n45#1:292,9\n223#1:301,2\n227#1:303,2\n231#1:305,2\n232#1:307,2\n*E\n"})
public final class BadgeFragment extends p508o0o0O.OooOO0O<va> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String HONOR_BADGE = "HONOR_BADGE";

    @Nullable
    private p519o0o0O0oO.o000 achievementDetailDialog;

    @Nullable
    private View currentOrderView;

    @Nullable
    private oO000O0 honorDetailDialog;
    private boolean isHonor;
    private eb popupBinding;

    @Nullable
    private PopupWindow popupWindow;

    /* JADX INFO: renamed from: badgeVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy badgeVM = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(BadgeVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.BadgeFragment$special$$inlined$activityViewModels$default$1
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f28060OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28060OooO0Oo;
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

    public static final class OooO implements Observer<List<BadgeDataModel>> {
        public OooO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(List<BadgeDataModel> list) {
            List<BadgeDataModel> list2 = list;
            if (list2 == null) {
                return;
            }
            BadgeFragment badgeFragment = BadgeFragment.this;
            badgeFragment.getAdapter().OooOoO0(list2);
            badgeFragment.getAdapter().Oooo00o();
            badgeFragment.getBinding().f59086OooO0oO.OooOO0o(true);
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
            try {
                iArr[OooO00o.OrderDefault.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OooO00o.OrderTime.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OooO00o.OrderLevel.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class OooO0o extends Lambda implements Function0<com.yalla.yalla.ui.fragment.OooO0o> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.fragment.OooO0o invoke() {
            BadgeFragment badgeFragment = BadgeFragment.this;
            return new com.yalla.yalla.ui.fragment.OooO0o(badgeFragment, badgeFragment.requireContext(), oO00OO0O.user_item_badge);
        }
    }

    public static final class OooOO0 implements Observer<List<BadgeDataModel>> {
        public OooOO0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(List<BadgeDataModel> list) {
            List<BadgeDataModel> list2 = list;
            if (list2 == null) {
                return;
            }
            BadgeFragment badgeFragment = BadgeFragment.this;
            badgeFragment.setOrderAchievementData(badgeFragment.currentOrderType, false, list2);
            badgeFragment.getAdapter().OooOoO0(list2);
            badgeFragment.getAdapter().Oooo00o();
            badgeFragment.getBinding().f59086OooO0oO.OooOO0o(true);
        }
    }

    public static final class OooOO0O implements Observer<Integer> {
        public OooOO0O() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Integer num) {
            BadgeFragment.this.getBinding().f59084OooO0o.setText(String.valueOf(num));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n*L\n1#1,328:1\n223#2:329\n*E\n"})
    public static final class OooOOO<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((BadgeDataModel) t).getSort()), Integer.valueOf(((BadgeDataModel) t2).getSort()));
        }
    }

    public static final class OooOOO0 implements Observer<Integer> {
        public OooOOO0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(Integer num) {
            Integer num2 = num;
            AppCompatTextView appCompatTextView = BadgeFragment.this.getBinding().f59085OooO0o0;
            String strOooO0OO = com.code.android.util.o0000.OooO0OO(oO00OOo0.user_badge_my_Rank_num);
            String[] strArr = new String[1];
            strArr[0] = (num2 != null && num2.intValue() == 0) ? "50+" : String.valueOf(num2);
            appCompatTextView.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO, strArr));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n*L\n1#1,328:1\n231#2:329\n*E\n"})
    public static final class OooOOOO<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((BadgeDataModel) t).getSort()), Integer.valueOf(((BadgeDataModel) t2).getSort()));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n*L\n1#1,328:1\n232#2:329\n*E\n"})
    public static final class OooOo<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((BadgeDataModel) t2).getType()), Integer.valueOf(((BadgeDataModel) t).getType()));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n*L\n1#1,328:1\n227#2:329\n*E\n"})
    public static final class OooOo00<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(((BadgeDataModel) t2).getSetTime()), Long.valueOf(((BadgeDataModel) t).getSetTime()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p564o0oOo0OO.o000O<BadgeDataModel> getAdapter() {
        return (p564o0oOo0OO.o000O) this.adapter.getValue();
    }

    private final BadgeVM getBadgeVM() {
        return (BadgeVM) this.badgeVM.getValue();
    }

    private final void initData() {
        boolean z = this.isHonor;
        if (z) {
            getBadgeVM().getHonorList().observe(getViewLifecycleOwner(), new OooO());
        } else {
            if (z) {
                return;
            }
            getBadgeVM().getAchievementList().observe(getViewLifecycleOwner(), new OooOO0());
        }
    }

    private final void initView() {
        Bundle arguments = getArguments();
        this.isHonor = arguments != null ? arguments.getBoolean(HONOR_BADGE) : false;
        getBinding().f59086OooO0oO.setOnRefreshListener(new com.yalla.yalla.ui.fragment.OooO00o(this));
        getBinding().f59086OooO0oO.OooOo00(false);
        if (this.isHonor) {
            ConstraintLayout constraintLayout = getBinding().f59081OooO0O0;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "binding.clHeader");
            com.code.android.util.o000OO00.OooO0O0(constraintLayout);
        } else {
            getBadgeVM().getCurrentStar().observe(getViewLifecycleOwner(), new OooOO0O());
            getBadgeVM().getCurrentRank().observe(getViewLifecycleOwner(), new OooOOO0());
            getBinding().f59085OooO0o0.setTextColor(getBadgeVM().getIsFromMe() ? -1 : com.code.android.util.o0000.OooO00o(oO00O0o.color_999999));
            if (getBadgeVM().getIsFromMe()) {
                AppCompatTextView appCompatTextView = getBinding().f59083OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView, "binding.tvBadgeOrder");
                com.code.android.util.o000OO00.OooOOOO(appCompatTextView);
                getBinding().f59085OooO0o0.setBackgroundResource(oOo00OO0.user_badge_header_no_me);
                getBinding().f59083OooO0Oo.setOnClickListener(this);
                getBinding().f59085OooO0o0.setOnClickListener(this);
            } else {
                getBinding().f59085OooO0o0.setBackgroundResource(oOo00OO0.user_badge_header_no_other);
                AppCompatTextView appCompatTextView2 = getBinding().f59083OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "binding.tvBadgeOrder");
                com.code.android.util.o000OO00.OooO0O0(appCompatTextView2);
            }
        }
        getAdapter().f10101OooO0oo = new p345o0OOOOo.o0OoOo0(this);
        getBinding().f59082OooO0OO.setLayoutManager(new FixGridLayoutManager(getContext(), 2));
        getBinding().f59082OooO0OO.setAdapter(getAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(BadgeFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBadgeVM().requestBadgeInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(BadgeFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0OO000.OooO00o("105096");
        if (this$0.isHonor) {
            Object obj = baseQuickAdapter.f10111OooOOoo.get(i);
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
            com.code.android.util.o000OO00.OooO0OO(view);
        }
        com.code.android.util.o000OO00.OooOOOO(orderView);
        this.currentOrderView = orderView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setOrderAchievementData(OooO00o orderType, boolean ignoreOrder, List<BadgeDataModel> dataList) {
        if (this.currentOrderType == orderType && ignoreOrder) {
            return;
        }
        int i = OooO0OO.$EnumSwitchMapping$0[orderType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    if (dataList.size() > 1) {
                        CollectionsKt.sortWith(dataList, new OooOOOO());
                    }
                    if (dataList.size() > 1) {
                        CollectionsKt.sortWith(dataList, new OooOo());
                    }
                }
            } else if (dataList.size() > 1) {
                CollectionsKt.sortWith(dataList, new OooOo00());
            }
        } else if (dataList.size() > 1) {
            CollectionsKt.sortWith(dataList, new OooOOO());
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
            this.achievementDetailDialog = new p519o0o0O0oO.o000(fragmentActivityRequireActivity);
        }
        p519o0o0O0oO.o000 o000Var = this.achievementDetailDialog;
        if (o000Var != null) {
            Intrinsics.checkNotNullParameter(dataBean, "data");
            o000Var.f52451OooOOOo = position;
            o000Var.f52453OooOOo0 = isFromMe;
            p519o0o0O0oO.o0000O o0000o2 = o000Var.f52448OooOOO;
            ra raVar = null;
            if (o0000o2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o0000o2 = null;
            }
            o0000o2.OooOoO0(dataBean);
            ra raVar2 = o000Var.f52450OooOOOO;
            if (raVar2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                raVar2 = null;
            }
            raVar2.f58764OooO0o0.scrollToPosition(position);
            ra raVar3 = o000Var.f52450OooOOOO;
            if (raVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                raVar3 = null;
            }
            AppCompatImageView setData$lambda$1 = raVar3.f58762OooO0OO;
            Intrinsics.checkNotNullExpressionValue(setData$lambda$1, "setData$lambda$1");
            if (position == 0) {
                com.code.android.util.o000OO00.OooO0O0(setData$lambda$1);
            } else {
                com.code.android.util.o000OO00.OooOOOO(setData$lambda$1);
            }
            ra raVar4 = o000Var.f52450OooOOOO;
            if (raVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                raVar = raVar4;
            }
            AppCompatImageView setData$lambda$2 = raVar.f58763OooO0Oo;
            int size = dataBean.size() - 1;
            Intrinsics.checkNotNullExpressionValue(setData$lambda$2, "setData$lambda$2");
            if (position == size) {
                com.code.android.util.o000OO00.OooO0O0(setData$lambda$2);
            } else {
                com.code.android.util.o000OO00.OooOOOO(setData$lambda$2);
            }
        }
        p519o0o0O0oO.o000 o000Var2 = this.achievementDetailDialog;
        if (o000Var2 != null) {
            p464o0Oooo.o000000O o000000o2 = p464o0Oooo.o000000O.f46674OooO00o;
            o000Var2.f52452OooOOo = Intrinsics.areEqual(((MutableLiveData) p464o0Oooo.o000000O.f46709Oooo0O0.getValue()).getValue(), Boolean.TRUE);
        }
        p519o0o0O0oO.o000 o000Var3 = this.achievementDetailDialog;
        if (o000Var3 != null) {
            o000Var3.show();
        }
    }

    private final void showMedalHonorDetailDialog(BadgeDataModel dataBean) {
        if (this.honorDetailDialog == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            this.honorDetailDialog = new oO000O0(fragmentActivityRequireActivity);
        }
        oO000O0 oo000o0 = this.honorDetailDialog;
        if (oo000o0 != null) {
            Intrinsics.checkNotNullParameter(dataBean, "data");
            if (dataBean.getState() == 1) {
                oo000o0.OooO0Oo(oOo00o0o.f56707OooO00o);
                oo000o0.OooO0o0(dataBean.getRanking(), oOo00o0o.OooO0O0(dataBean.getMedalId()));
            } else {
                oo000o0.OooO0Oo(0);
                oo000o0.OooO0o0(0, oOo00o0o.f56708OooO0O0);
            }
            Uri uriOooO00o = oOo00o0o.OooO00o(dataBean.getMedalId(), dataBean.getState());
            if (uriOooO00o == null) {
                sa saVar = oo000o0.f52800OooOOO0;
                if (saVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    saVar = null;
                }
                saVar.f58815OooO0O0.setImageDrawable(null);
                sa saVar2 = oo000o0.f52800OooOOO0;
                if (saVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    saVar2 = null;
                }
                AppCompatImageView appCompatImageView = saVar2.f58815OooO0O0;
                Intrinsics.checkNotNullExpressionValue(appCompatImageView, "binding.ivBadge");
                com.code.android.util.o000OO00.OooO0OO(appCompatImageView);
                sa saVar3 = oo000o0.f52800OooOOO0;
                if (saVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    saVar3 = null;
                }
                SVGAView sVGAView = saVar3.f58817OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(sVGAView, "binding.sdvMedal");
                com.code.android.util.o000OO00.OooO0OO(sVGAView);
            } else {
                String string = uriOooO00o.toString();
                Intrinsics.checkNotNullExpressionValue(string, "uri.toString()");
                if (StringsKt.OooO0o(string, ".svga")) {
                    sa saVar4 = oo000o0.f52800OooOOO0;
                    if (saVar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        saVar4 = null;
                    }
                    SVGAView sVGAView2 = saVar4.f58817OooO0Oo;
                    int i = oOo00OO0.icon_badge_no_pic;
                    sVGAView2.f10172OooOooO = i;
                    sVGAView2.setImageResource(i);
                    String string2 = uriOooO00o.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "uri.toString()");
                    sVGAView2.OooOO0O(string2, oo000o0);
                    sVGAView2.OooOO0o();
                    sa saVar5 = oo000o0.f52800OooOOO0;
                    if (saVar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        saVar5 = null;
                    }
                    AppCompatImageView appCompatImageView2 = saVar5.f58815OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView2, "binding.ivBadge");
                    com.code.android.util.o000OO00.OooO0O0(appCompatImageView2);
                    sa saVar6 = oo000o0.f52800OooOOO0;
                    if (saVar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        saVar6 = null;
                    }
                    SVGAView sVGAView3 = saVar6.f58817OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(sVGAView3, "binding.sdvMedal");
                    com.code.android.util.o000OO00.OooOOOO(sVGAView3);
                } else {
                    o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(oo000o0.getContext());
                    oooO00o.f43911OooO0OO = uriOooO00o.toString();
                    oooO00o.f43909OooO00o = 0;
                    sa saVar7 = oo000o0.f52800OooOOO0;
                    if (saVar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        saVar7 = null;
                    }
                    oooO00o.OooO0Oo(saVar7.f58815OooO0O0);
                    sa saVar8 = oo000o0.f52800OooOOO0;
                    if (saVar8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        saVar8 = null;
                    }
                    AppCompatImageView appCompatImageView3 = saVar8.f58815OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(appCompatImageView3, "binding.ivBadge");
                    com.code.android.util.o000OO00.OooOOOO(appCompatImageView3);
                    sa saVar9 = oo000o0.f52800OooOOO0;
                    if (saVar9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        saVar9 = null;
                    }
                    SVGAView sVGAView4 = saVar9.f58817OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(sVGAView4, "binding.sdvMedal");
                    com.code.android.util.o000OO00.OooO0O0(sVGAView4);
                }
            }
            String name = dataBean.getName();
            sa saVar10 = oo000o0.f52800OooOOO0;
            if (saVar10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                saVar10 = null;
            }
            AppCompatTextView setBadgeName$lambda$3 = saVar10.f58820OooO0oO;
            if (StringsKt.isBlank(name)) {
                Intrinsics.checkNotNullExpressionValue(setBadgeName$lambda$3, "setBadgeName$lambda$3");
                com.code.android.util.o000OO00.OooO0OO(setBadgeName$lambda$3);
                setBadgeName$lambda$3.setText((CharSequence) null);
            } else {
                setBadgeName$lambda$3.setText(name);
                Intrinsics.checkNotNullExpressionValue(setBadgeName$lambda$3, "setBadgeName$lambda$3");
                com.code.android.util.o000OO00.OooOOOO(setBadgeName$lambda$3);
            }
            long setTime = dataBean.getSetTime();
            sa saVar11 = oo000o0.f52800OooOOO0;
            if (saVar11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                saVar11 = null;
            }
            AppCompatTextView setBadgeObtainTime$lambda$4 = saVar11.f58813OooO;
            if (setTime > 0) {
                Intrinsics.checkNotNullExpressionValue(setBadgeObtainTime$lambda$4, "setBadgeObtainTime$lambda$4");
                com.code.android.util.o000OO00.OooOOOO(setBadgeObtainTime$lambda$4);
                setBadgeObtainTime$lambda$4.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(oO00OOo0.user_badge_time), p601o0oo0O0.o0000oo.OooO0OO(setTime, "dd/MM/yyyy")));
            } else {
                Intrinsics.checkNotNullExpressionValue(setBadgeObtainTime$lambda$4, "setBadgeObtainTime$lambda$4");
                com.code.android.util.o000OO00.OooO0O0(setBadgeObtainTime$lambda$4);
            }
            String strOooO00o = com.code.android.util.o0000O.OooO00o(dataBean.getState() == 1 ? dataBean.getRemark1() : dataBean.getRemark(), p426o0OoOO.o0OOO0o.OooO00o(dataBean.getRanking()));
            sa saVar12 = oo000o0.f52800OooOOO0;
            if (saVar12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                saVar12 = null;
            }
            AppCompatTextView setBadgeContent$lambda$5 = saVar12.f58818OooO0o;
            if (StringsKt.isBlank(strOooO00o)) {
                Intrinsics.checkNotNullExpressionValue(setBadgeContent$lambda$5, "setBadgeContent$lambda$5");
                com.code.android.util.o000OO00.OooO0OO(setBadgeContent$lambda$5);
                setBadgeContent$lambda$5.setText((CharSequence) null);
            } else {
                setBadgeContent$lambda$5.setText(strOooO00o);
                Intrinsics.checkNotNullExpressionValue(setBadgeContent$lambda$5, "setBadgeContent$lambda$5");
                com.code.android.util.o000OO00.OooOOOO(setBadgeContent$lambda$5);
            }
        }
        oO000O0 oo000o1 = this.honorDetailDialog;
        if (oo000o1 != null) {
            oo000o1.show();
        }
    }

    private final void showPopupWindow() {
        int i = 2;
        int i2 = 0;
        if (this.popupWindow == null) {
            eb ebVarInflate = eb.inflate(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(ebVarInflate, "inflate(layoutInflater)");
            this.popupBinding = ebVarInflate;
            eb ebVar = this.popupBinding;
            eb ebVar2 = null;
            if (ebVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                ebVar = null;
            }
            PopupWindow popupWindow = new PopupWindow((View) ebVar.f57859OooO00o, -2, -2, true);
            this.popupWindow = popupWindow;
            popupWindow.setAnimationStyle(oO000o00.user_badge_right_enter);
            PopupWindow popupWindow2 = this.popupWindow;
            if (popupWindow2 != null) {
                popupWindow2.setTouchable(true);
            }
            PopupWindow popupWindow3 = this.popupWindow;
            if (popupWindow3 != null) {
                popupWindow3.setBackgroundDrawable(com.code.android.util.o0000.OooO0O0(oOo00OO0.user_shape_transparent));
            }
            eb ebVar3 = this.popupBinding;
            if (ebVar3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                ebVar3 = null;
            }
            ebVar3.f57864OooO0o0.setOnClickListener(new androidx.media3.ui.o0Oo0oo(this, i));
            eb ebVar4 = this.popupBinding;
            if (ebVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                ebVar4 = null;
            }
            ebVar4.f57865OooO0oO.setOnClickListener(new OooO0O0(this, i2));
            eb ebVar5 = this.popupBinding;
            if (ebVar5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                ebVar5 = null;
            }
            ebVar5.f57863OooO0o.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.OooO0OO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BadgeFragment.showPopupWindow$lambda$5(this.f28226OooO0Oo, view);
                }
            });
            eb ebVar6 = this.popupBinding;
            if (ebVar6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            } else {
                ebVar2 = ebVar6;
            }
            this.currentOrderView = ebVar2.f57860OooO0O0;
        }
        View view = this.currentOrderView;
        if (view != null) {
            com.code.android.util.o000OO00.OooOOOO(view);
        }
        PopupWindow popupWindow4 = this.popupWindow;
        if (popupWindow4 != null) {
            popupWindow4.getContentView().measure(0, 0);
            popupWindow4.showAsDropDown(getBinding().f59083OooO0Oo, p591o0oo000O.OooO.OooO0o0() ? (-getBinding().f59083OooO0Oo.getWidth()) - com.code.android.util.o0000O0.OooO00o(14) : (getBinding().f59083OooO0Oo.getWidth() - popupWindow4.getContentView().getMeasuredWidth()) + com.code.android.util.o0000O0.OooO00o(14), (-getBinding().f59083OooO0Oo.getHeight()) - com.code.android.util.o0000O0.OooO00o(2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPopupWindow$lambda$3(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        eb ebVar = this$0.popupBinding;
        if (ebVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            ebVar = null;
        }
        AppCompatImageView appCompatImageView = ebVar.f57860OooO0O0;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "popupBinding.ivDefault");
        this$0.setCurrentOrderView(appCompatImageView);
        OooO00o oooO00o = OooO00o.OrderDefault;
        List<BadgeDataModel> list = this$0.getAdapter().f10111OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "adapter.data");
        setOrderAchievementData$default(this$0, oooO00o, false, list, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f59083OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.user_badge_pop_default));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPopupWindow$lambda$4(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        eb ebVar = this$0.popupBinding;
        if (ebVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            ebVar = null;
        }
        AppCompatImageView appCompatImageView = ebVar.f57862OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "popupBinding.ivTime");
        this$0.setCurrentOrderView(appCompatImageView);
        OooO00o oooO00o = OooO00o.OrderTime;
        List<BadgeDataModel> list = this$0.getAdapter().f10111OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "adapter.data");
        setOrderAchievementData$default(this$0, oooO00o, false, list, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f59083OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.user_badge_pop_time));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPopupWindow$lambda$5(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        eb ebVar = this$0.popupBinding;
        if (ebVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            ebVar = null;
        }
        AppCompatImageView appCompatImageView = ebVar.f57861OooO0OO;
        Intrinsics.checkNotNullExpressionValue(appCompatImageView, "popupBinding.ivLevel");
        this$0.setCurrentOrderView(appCompatImageView);
        OooO00o oooO00o = OooO00o.OrderLevel;
        List<BadgeDataModel> list = this$0.getAdapter().f10111OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "adapter.data");
        setOrderAchievementData$default(this$0, oooO00o, false, list, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f59083OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(oO00OOo0.user_badge_pop_level));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // p508o0o0O.OooOO0O
    public void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onNoDoubleClick(view);
        if (!Intrinsics.areEqual(view, getBinding().f59085OooO0o0)) {
            if (Intrinsics.areEqual(view, getBinding().f59083OooO0Oo)) {
                showPopupWindow();
            }
        } else {
            o0OO000.OooO00o("105092");
            int i = BadgeRankActivity.f27087OooOo;
            Context context = getBinding().f59080OooO00o.getContext();
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

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public va getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        va vaVarInflate = va.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(vaVarInflate, "inflate(layoutInflater)");
        return vaVarInflate;
    }
}
