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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.g2;
import p405o0Oo0OOO.h2;
import p405o0Oo0OOO.k2;
import p405o0Oo0OOO.t2;
import p475o0Ooooo0.o0O00oO0;
import p492o0o00OO0.oO0OO00;
import p506o0o00oOo.v0;
import p590o0oOooo0.O0O0;
import p606o0oo0O0o.o0O0O0o0;
import p650o0ooo.o0oOo0O0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002CDB\u0007¢\u0006\u0004\b@\u0010AJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0007H\u0016R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R!\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006E"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/k2;", "", "initView", "initData", "showPopupWindow", "Landroid/view/View;", "orderView", "setCurrentOrderView", "Lcom/yalla/yalla/ui/fragment/BadgeFragment$OooO00o;", "orderType", "", "ignoreOrder", "", "Lcom/yalla/yalla/model/BadgeDataModel;", "dataList", "setOrderAchievementData", "", "position", "", "dataBean", "isFromMe", "showMedalDetailDialog", "showMedalHonorDetailDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onNoDoubleClick", "Lcom/yalla/yalla/ui/vm/user/BadgeVM;", "badgeVM$delegate", "Lkotlin/Lazy;", "getBadgeVM", "()Lcom/yalla/yalla/ui/vm/user/BadgeVM;", "badgeVM", "Lo0ooo/o0000Ooo;", "achievementDetailDialog", "Lo0ooo/o0000Ooo;", "Lo0ooo/o0oOo0O0;", "honorDetailDialog", "Lo0ooo/o0oOo0O0;", "Lo0oOoO0/o0000oo;", "adapter$delegate", "getAdapter", "()Lo0oOoO0/o0000oo;", "adapter", "Landroid/widget/PopupWindow;", "popupWindow", "Landroid/widget/PopupWindow;", "currentOrderType", "Lcom/yalla/yalla/ui/fragment/BadgeFragment$OooO00o;", "currentOrderView", "Landroid/view/View;", "isHonor", "Z", "Lo0Oo0OOO/t2;", "popupBinding", "Lo0Oo0OOO/t2;", "<init>", "()V", "Companion", "OooO00o", "OooO0O0", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBadgeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n172#2,9:292\n1002#3,2:301\n1011#3,2:303\n1002#3,2:305\n1011#3,2:307\n*S KotlinDebug\n*F\n+ 1 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n*L\n45#1:292,9\n223#1:301,2\n227#1:303,2\n231#1:305,2\n232#1:307,2\n*E\n"})
public final class BadgeFragment extends p527o0o0OO0o.o000O<k2> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String HONOR_BADGE = "HONOR_BADGE";

    @Nullable
    private p650o0ooo.o0000Ooo achievementDetailDialog;

    @Nullable
    private View currentOrderView;

    @Nullable
    private o0oOo0O0 honorDetailDialog;
    private boolean isHonor;
    private t2 popupBinding;

    @Nullable
    private PopupWindow popupWindow;

    /* JADX INFO: renamed from: badgeVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy badgeVM = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(BadgeVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.BadgeFragment$special$$inlined$activityViewModels$default$1
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
        public final /* synthetic */ Function0 f27583OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27583OooO0Oo;
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

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n*L\n1#1,328:1\n223#2:329\n*E\n"})
    public static final class OooO<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((BadgeDataModel) t).getSort()), Integer.valueOf(((BadgeDataModel) t2).getSort()));
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v2 com.yalla.yalla.ui.fragment.BadgeFragment$OooO00o[], still in use, count: 1, list:
      (r5v2 com.yalla.yalla.ui.fragment.BadgeFragment$OooO00o[]) from 0x0029: INVOKE (r5v2 com.yalla.yalla.ui.fragment.BadgeFragment$OooO00o[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:42)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class OooO00o {
        OrderDefault,
        OrderTime,
        OrderLevel;

        private static final /* synthetic */ EnumEntries $ENTRIES;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(oooO00oArr);
        }

        public OooO00o() {
            super(str, i);
        }

        public static OooO00o valueOf(String str) {
            return (OooO00o) Enum.valueOf(OooO00o.class, str);
        }

        public static OooO00o[] values() {
            return (OooO00o[]) $VALUES.clone();
        }
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

    public static final class OooO0o extends Lambda implements Function0<com.yalla.yalla.ui.fragment.OooO0OO> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.fragment.OooO0OO invoke() {
            BadgeFragment badgeFragment = BadgeFragment.this;
            return new com.yalla.yalla.ui.fragment.OooO0OO(badgeFragment, badgeFragment.requireContext(), p562o0oOo000.oo0o0Oo.user_item_badge);
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareBy$2\n+ 2 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n*L\n1#1,328:1\n231#2:329\n*E\n"})
    public static final class OooOO0<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((BadgeDataModel) t).getSort()), Integer.valueOf(((BadgeDataModel) t2).getSort()));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n*L\n1#1,328:1\n227#2:329\n*E\n"})
    public static final class OooOO0O<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Long.valueOf(((BadgeDataModel) t2).getSetTime()), Long.valueOf(((BadgeDataModel) t).getSetTime()));
        }
    }

    @SourceDebugExtension({"SMAP\nComparisons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Comparisons.kt\nkotlin/comparisons/ComparisonsKt__ComparisonsKt$compareByDescending$1\n+ 2 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n*L\n1#1,328:1\n232#2:329\n*E\n"})
    public static final class OooOOO0<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return ComparisonsKt.compareValues(Integer.valueOf(((BadgeDataModel) t2).getType()), Integer.valueOf(((BadgeDataModel) t).getType()));
        }
    }

    private final p571o0oOoO0.o0000oo<BadgeDataModel> getAdapter() {
        return (p571o0oOoO0.o0000oo) this.adapter.getValue();
    }

    private final BadgeVM getBadgeVM() {
        return (BadgeVM) this.badgeVM.getValue();
    }

    private final void initData() {
        boolean z = this.isHonor;
        int i = 1;
        if (z) {
            getBadgeVM().getHonorList().observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO0o(this, i));
        } else {
            if (z) {
                return;
            }
            getBadgeVM().getAchievementList().observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO(this, 2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$5(BadgeFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list == null) {
            return;
        }
        this$0.getAdapter().OooOoO0(list);
        this$0.getAdapter().Oooo00o();
        this$0.getBinding().f44083OooO0oO.OooOO0o(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$6(BadgeFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (list == null) {
            return;
        }
        this$0.setOrderAchievementData(this$0.currentOrderType, false, list);
        this$0.getAdapter().OooOoO0(list);
        this$0.getAdapter().Oooo00o();
        this$0.getBinding().f44083OooO0oO.OooOO0o(true);
    }

    private final void initView() {
        Bundle arguments = getArguments();
        this.isHonor = arguments != null ? arguments.getBoolean(HONOR_BADGE) : false;
        int i = 1;
        getBinding().f44083OooO0oO.setOnRefreshListener(new v0(this, i));
        getBinding().f44083OooO0oO.OooOo00(false);
        if (this.isHonor) {
            ConstraintLayout clHeader = getBinding().f44078OooO0O0;
            Intrinsics.checkNotNullExpressionValue(clHeader, "clHeader");
            com.code.android.util.o000O.OooO0O0(clHeader);
        } else {
            getBadgeVM().getCurrentStar().observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.o0000Ooo(this, 3));
            getBadgeVM().getCurrentRank().observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO0O0(this, i));
            getBinding().f44082OooO0o0.setTextColor(getBadgeVM().getIsFromMe() ? -1 : com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_999999));
            if (getBadgeVM().getIsFromMe()) {
                AppCompatTextView tvBadgeOrder = getBinding().f44080OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(tvBadgeOrder, "tvBadgeOrder");
                com.code.android.util.o000O.OooOOOO(tvBadgeOrder);
                getBinding().f44082OooO0o0.setBackgroundResource(p562o0oOo000.o0Oo0oo.user_badge_header_no_me);
                getBinding().f44080OooO0Oo.setOnClickListener(this);
                getBinding().f44082OooO0o0.setOnClickListener(this);
            } else {
                getBinding().f44082OooO0o0.setBackgroundResource(p562o0oOo000.o0Oo0oo.user_badge_header_no_other);
                AppCompatTextView tvBadgeOrder2 = getBinding().f44080OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(tvBadgeOrder2, "tvBadgeOrder");
                com.code.android.util.o000O.OooO0O0(tvBadgeOrder2);
            }
        }
        getAdapter().f13179OooO0oo = new oO0OO00(this);
        getBinding().f44079OooO0OO.setLayoutManager(new FixGridLayoutManager(getContext(), 2));
        getBinding().f44079OooO0OO.setAdapter(getAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(BadgeFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBadgeVM().requestBadgeInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(BadgeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().f44081OooO0o.setText(String.valueOf(num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(BadgeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AppCompatTextView appCompatTextView = this$0.getBinding().f44082OooO0o0;
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.user_badge_my_Rank_num);
        String[] strArr = new String[1];
        strArr[0] = (num != null && num.intValue() == 0) ? "50+" : String.valueOf(num);
        appCompatTextView.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO, strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(BadgeFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        o0oo0000.OooO00o.OooO0O0("105096");
        if (this$0.isHonor) {
            Object obj = baseQuickAdapter.f13189OooOOoo.get(i);
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
            com.code.android.util.o000O.OooO0OO(view);
        }
        com.code.android.util.o000O.OooOOOO(orderView);
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
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            this.achievementDetailDialog = new p650o0ooo.o0000Ooo(fragmentActivityRequireActivity);
        }
        p650o0ooo.o0000Ooo o0000ooo = this.achievementDetailDialog;
        if (o0000ooo != null) {
            Intrinsics.checkNotNullParameter(dataBean, "data");
            o0000ooo.f58473OooOOOo = position;
            o0000ooo.f58475OooOOo0 = isFromMe;
            p650o0ooo.o00000O o00000o = o0000ooo.f58470OooOOO;
            g2 g2Var = null;
            if (o00000o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00000o = null;
            }
            o00000o.OooOoO0(dataBean);
            g2 g2Var2 = o0000ooo.f58472OooOOOO;
            if (g2Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g2Var2 = null;
            }
            g2Var2.f43878OooO0o0.scrollToPosition(position);
            g2 g2Var3 = o0000ooo.f58472OooOOOO;
            if (g2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                g2Var3 = null;
            }
            AppCompatImageView appCompatImageView = g2Var3.f43876OooO0OO;
            Intrinsics.checkNotNull(appCompatImageView);
            if (position == 0) {
                com.code.android.util.o000O.OooO0O0(appCompatImageView);
            } else {
                com.code.android.util.o000O.OooOOOO(appCompatImageView);
            }
            g2 g2Var4 = o0000ooo.f58472OooOOOO;
            if (g2Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                g2Var = g2Var4;
            }
            AppCompatImageView appCompatImageView2 = g2Var.f43877OooO0Oo;
            int size = dataBean.size() - 1;
            Intrinsics.checkNotNull(appCompatImageView2);
            if (position == size) {
                com.code.android.util.o000O.OooO0O0(appCompatImageView2);
            } else {
                com.code.android.util.o000O.OooOOOO(appCompatImageView2);
            }
        }
        p650o0ooo.o0000Ooo o0000ooo2 = this.achievementDetailDialog;
        if (o0000ooo2 != null) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0000ooo2.f58474OooOOo = Intrinsics.areEqual(((MutableLiveData) o0O00oO0.f47971Oooo0O0.getValue()).getValue(), Boolean.TRUE);
        }
        p650o0ooo.o0000Ooo o0000ooo3 = this.achievementDetailDialog;
        if (o0000ooo3 != null) {
            o0000ooo3.show();
        }
    }

    private final void showMedalHonorDetailDialog(BadgeDataModel dataBean) {
        if (this.honorDetailDialog == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            this.honorDetailDialog = new o0oOo0O0(fragmentActivityRequireActivity);
        }
        o0oOo0O0 o0ooo0o1 = this.honorDetailDialog;
        if (o0ooo0o1 != null) {
            Intrinsics.checkNotNullParameter(dataBean, "data");
            if (dataBean.getState() == 1) {
                o0ooo0o1.OooO0Oo(O0O0.f57095OooO00o);
                o0ooo0o1.OooO0o0(dataBean.getRanking(), O0O0.OooO0O0(dataBean.getMedalId()));
            } else {
                o0ooo0o1.OooO0Oo(0);
                o0ooo0o1.OooO0o0(0, O0O0.f57096OooO0O0);
            }
            Uri uriOooO00o = O0O0.OooO00o(dataBean.getMedalId(), dataBean.getState());
            if (uriOooO00o == null) {
                h2 h2Var = o0ooo0o1.f58755OooOOO0;
                if (h2Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    h2Var = null;
                }
                h2Var.f43909OooO0O0.setImageDrawable(null);
                h2 h2Var2 = o0ooo0o1.f58755OooOOO0;
                if (h2Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    h2Var2 = null;
                }
                AppCompatImageView ivBadge = h2Var2.f43909OooO0O0;
                Intrinsics.checkNotNullExpressionValue(ivBadge, "ivBadge");
                com.code.android.util.o000O.OooO0OO(ivBadge);
                h2 h2Var3 = o0ooo0o1.f58755OooOOO0;
                if (h2Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    h2Var3 = null;
                }
                SVGAView sdvMedal = h2Var3.f43911OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(sdvMedal, "sdvMedal");
                com.code.android.util.o000O.OooO0OO(sdvMedal);
            } else {
                String string = uriOooO00o.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (StringsKt__StringsKt.contains$default(string, ".svga", false, 2, (Object) null)) {
                    h2 h2Var4 = o0ooo0o1.f58755OooOOO0;
                    if (h2Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        h2Var4 = null;
                    }
                    SVGAView sVGAView = h2Var4.f43911OooO0Oo;
                    int i = p562o0oOo000.o0Oo0oo.icon_badge_no_pic;
                    sVGAView.f13232OooOooO = i;
                    sVGAView.setImageResource(i);
                    String string2 = uriOooO00o.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    sVGAView.OooOO0O(string2, o0ooo0o1);
                    sVGAView.OooOO0o();
                    h2 h2Var5 = o0ooo0o1.f58755OooOOO0;
                    if (h2Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        h2Var5 = null;
                    }
                    AppCompatImageView ivBadge2 = h2Var5.f43909OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(ivBadge2, "ivBadge");
                    com.code.android.util.o000O.OooO0O0(ivBadge2);
                    h2 h2Var6 = o0ooo0o1.f58755OooOOO0;
                    if (h2Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        h2Var6 = null;
                    }
                    SVGAView sdvMedal2 = h2Var6.f43911OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(sdvMedal2, "sdvMedal");
                    com.code.android.util.o000O.OooOOOO(sdvMedal2);
                } else {
                    o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(o0ooo0o1.getContext());
                    oooO00o.f43126OooO0OO = uriOooO00o.toString();
                    oooO00o.f43124OooO00o = 0;
                    h2 h2Var7 = o0ooo0o1.f58755OooOOO0;
                    if (h2Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        h2Var7 = null;
                    }
                    oooO00o.OooO0Oo(h2Var7.f43909OooO0O0);
                    h2 h2Var8 = o0ooo0o1.f58755OooOOO0;
                    if (h2Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        h2Var8 = null;
                    }
                    AppCompatImageView ivBadge3 = h2Var8.f43909OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(ivBadge3, "ivBadge");
                    com.code.android.util.o000O.OooOOOO(ivBadge3);
                    h2 h2Var9 = o0ooo0o1.f58755OooOOO0;
                    if (h2Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        h2Var9 = null;
                    }
                    SVGAView sdvMedal3 = h2Var9.f43911OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(sdvMedal3, "sdvMedal");
                    com.code.android.util.o000O.OooO0O0(sdvMedal3);
                }
            }
            String name = dataBean.getName();
            h2 h2Var10 = o0ooo0o1.f58755OooOOO0;
            if (h2Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                h2Var10 = null;
            }
            AppCompatTextView appCompatTextView = h2Var10.f43914OooO0oO;
            if (StringsKt.isBlank(name)) {
                Intrinsics.checkNotNull(appCompatTextView);
                com.code.android.util.o000O.OooO0OO(appCompatTextView);
                appCompatTextView.setText((CharSequence) null);
            } else {
                appCompatTextView.setText(name);
                Intrinsics.checkNotNull(appCompatTextView);
                com.code.android.util.o000O.OooOOOO(appCompatTextView);
            }
            long setTime = dataBean.getSetTime();
            h2 h2Var11 = o0ooo0o1.f58755OooOOO0;
            if (h2Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                h2Var11 = null;
            }
            AppCompatTextView appCompatTextView2 = h2Var11.f43907OooO;
            if (setTime > 0) {
                Intrinsics.checkNotNull(appCompatTextView2);
                com.code.android.util.o000O.OooOOOO(appCompatTextView2);
                appCompatTextView2.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.user_badge_time), o0O0O0o0.OooO0OO(setTime, "dd/MM/yyyy")));
            } else {
                Intrinsics.checkNotNull(appCompatTextView2);
                com.code.android.util.o000O.OooO0O0(appCompatTextView2);
            }
            String strOooO00o = com.code.android.util.o0000O.OooO00o(dataBean.getState() == 1 ? dataBean.getRemark1() : dataBean.getRemark(), androidx.compose.foundation.layout.oo000o.OooO00o(dataBean.getRanking()));
            h2 h2Var12 = o0ooo0o1.f58755OooOOO0;
            if (h2Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                h2Var12 = null;
            }
            AppCompatTextView appCompatTextView3 = h2Var12.f43912OooO0o;
            if (StringsKt.isBlank(strOooO00o)) {
                Intrinsics.checkNotNull(appCompatTextView3);
                com.code.android.util.o000O.OooO0OO(appCompatTextView3);
                appCompatTextView3.setText((CharSequence) null);
            } else {
                appCompatTextView3.setText(strOooO00o);
                Intrinsics.checkNotNull(appCompatTextView3);
                com.code.android.util.o000O.OooOOOO(appCompatTextView3);
            }
        }
        o0oOo0O0 o0ooo0o2 = this.honorDetailDialog;
        if (o0ooo0o2 != null) {
            o0ooo0o2.show();
        }
    }

    private final void showPopupWindow() {
        if (this.popupWindow == null) {
            t2 t2VarInflate = t2.inflate(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(t2VarInflate, "inflate(...)");
            this.popupBinding = t2VarInflate;
            t2 t2Var = this.popupBinding;
            t2 t2Var2 = null;
            if (t2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                t2Var = null;
            }
            int i = 1;
            PopupWindow popupWindow = new PopupWindow((View) t2Var.f45557OooO00o, -2, -2, true);
            this.popupWindow = popupWindow;
            popupWindow.setAnimationStyle(p562o0oOo000.oo000o.user_badge_right_enter);
            PopupWindow popupWindow2 = this.popupWindow;
            if (popupWindow2 != null) {
                popupWindow2.setTouchable(true);
            }
            PopupWindow popupWindow3 = this.popupWindow;
            if (popupWindow3 != null) {
                popupWindow3.setBackgroundDrawable(com.code.android.util.o0000.OooO0O0(p562o0oOo000.o0Oo0oo.user_shape_transparent));
            }
            t2 t2Var3 = this.popupBinding;
            if (t2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                t2Var3 = null;
            }
            t2Var3.f45562OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.OooO00o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BadgeFragment.showPopupWindow$lambda$7(this.f27740OooO0Oo, view);
                }
            });
            t2 t2Var4 = this.popupBinding;
            if (t2Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                t2Var4 = null;
            }
            t2Var4.f45563OooO0oO.setOnClickListener(new com.yalla.yalla.ui.adapter.o000000(this, i));
            t2 t2Var5 = this.popupBinding;
            if (t2Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                t2Var5 = null;
            }
            t2Var5.f45561OooO0o.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.OooO0O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BadgeFragment.showPopupWindow$lambda$9(this.f27741OooO0Oo, view);
                }
            });
            t2 t2Var6 = this.popupBinding;
            if (t2Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            } else {
                t2Var2 = t2Var6;
            }
            this.currentOrderView = t2Var2.f45558OooO0O0;
        }
        View view = this.currentOrderView;
        if (view != null) {
            com.code.android.util.o000O.OooOOOO(view);
        }
        PopupWindow popupWindow4 = this.popupWindow;
        if (popupWindow4 != null) {
            popupWindow4.getContentView().measure(0, 0);
            popupWindow4.showAsDropDown(getBinding().f44080OooO0Oo, p595o0oo00O.OooOo00.OooO0o0() ? (-getBinding().f44080OooO0Oo.getWidth()) - com.code.android.util.o0000O0.OooO00o(14) : (getBinding().f44080OooO0Oo.getWidth() - popupWindow4.getContentView().getMeasuredWidth()) + com.code.android.util.o0000O0.OooO00o(14), (-getBinding().f44080OooO0Oo.getHeight()) - com.code.android.util.o0000O0.OooO00o(2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPopupWindow$lambda$7(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        t2 t2Var = this$0.popupBinding;
        if (t2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            t2Var = null;
        }
        AppCompatImageView ivDefault = t2Var.f45558OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ivDefault, "ivDefault");
        this$0.setCurrentOrderView(ivDefault);
        OooO00o oooO00o = OooO00o.OrderDefault;
        List<BadgeDataModel> list = this$0.getAdapter().f13189OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
        setOrderAchievementData$default(this$0, oooO00o, false, list, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f44080OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.user_badge_pop_default));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPopupWindow$lambda$8(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        t2 t2Var = this$0.popupBinding;
        if (t2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            t2Var = null;
        }
        AppCompatImageView ivTime = t2Var.f45560OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ivTime, "ivTime");
        this$0.setCurrentOrderView(ivTime);
        OooO00o oooO00o = OooO00o.OrderTime;
        List<BadgeDataModel> list = this$0.getAdapter().f13189OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
        setOrderAchievementData$default(this$0, oooO00o, false, list, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f44080OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.user_badge_pop_time));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPopupWindow$lambda$9(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        t2 t2Var = this$0.popupBinding;
        if (t2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            t2Var = null;
        }
        AppCompatImageView ivLevel = t2Var.f45559OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivLevel, "ivLevel");
        this$0.setCurrentOrderView(ivLevel);
        OooO00o oooO00o = OooO00o.OrderLevel;
        List<BadgeDataModel> list = this$0.getAdapter().f13189OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
        setOrderAchievementData$default(this$0, oooO00o, false, list, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f44080OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.user_badge_pop_level));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // p527o0o0OO0o.o000O
    public void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onNoDoubleClick(view);
        if (!Intrinsics.areEqual(view, getBinding().f44082OooO0o0)) {
            if (Intrinsics.areEqual(view, getBinding().f44080OooO0Oo)) {
                showPopupWindow();
            }
        } else {
            o0oo0000.OooO00o.OooO0O0("105092");
            int i = BadgeRankActivity.f26621OooOo;
            Context context = getBinding().f44077OooO00o.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
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

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public k2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        k2 k2VarInflate = k2.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(k2VarInflate, "inflate(...)");
        return k2VarInflate;
    }
}
