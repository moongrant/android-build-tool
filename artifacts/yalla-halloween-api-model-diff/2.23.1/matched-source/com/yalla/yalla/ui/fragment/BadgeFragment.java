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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p022Oooo00O.o00O000;
import p407o0Oo0OOO.h2;
import p407o0Oo0OOO.i2;
import p407o0Oo0OOO.l2;
import p407o0Oo0OOO.u2;
import p474o0OoooOO.oo0oO0;
import p527o0o0OO0.o00OO0O0;
import p569o0oOo0Oo.o0O0OO0;
import p587o0oOooO.oO0O000;
import p593o0oOoooO.h0;
import p675oO0Oo.o00OOOOo;
import p675oO0Oo.o0oOO;
import p675oO0Oo.oO00Oo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002CDB\u0007¢\u0006\u0004\b@\u0010AJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J(\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002J&\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u000fH\u0002J\u001a\u0010\u001d\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J\u001a\u0010!\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0007H\u0016R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010-\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R!\u00103\u001a\b\u0012\u0004\u0012\u00020\u000f0/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010%\u001a\u0004\b1\u00102R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u00109\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006E"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeFragment;", "Lo0o0OO0/o00OO0O0;", "Lo0Oo0OOO/l2;", "", "initView", "initData", "showPopupWindow", "Landroid/view/View;", "orderView", "setCurrentOrderView", "Lcom/yalla/yalla/ui/fragment/BadgeFragment$OooO00o;", "orderType", "", "ignoreOrder", "", "Lcom/yalla/yalla/model/BadgeDataModel;", "dataList", "setOrderAchievementData", "", "position", "", "dataBean", "isFromMe", "showMedalDetailDialog", "showMedalHonorDetailDialog", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onNoDoubleClick", "Lcom/yalla/yalla/ui/vm/user/BadgeVM;", "badgeVM$delegate", "Lkotlin/Lazy;", "getBadgeVM", "()Lcom/yalla/yalla/ui/vm/user/BadgeVM;", "badgeVM", "LoO0Oo/o0oOO;", "achievementDetailDialog", "LoO0Oo/o0oOO;", "LoO0Oo/oO00Oo00;", "honorDetailDialog", "LoO0Oo/oO00Oo00;", "Lo0oOo0o/o000O0;", "adapter$delegate", "getAdapter", "()Lo0oOo0o/o000O0;", "adapter", "Landroid/widget/PopupWindow;", "popupWindow", "Landroid/widget/PopupWindow;", "currentOrderType", "Lcom/yalla/yalla/ui/fragment/BadgeFragment$OooO00o;", "currentOrderView", "Landroid/view/View;", "isHonor", "Z", "Lo0Oo0OOO/u2;", "popupBinding", "Lo0Oo0OOO/u2;", "<init>", "()V", "Companion", "OooO00o", "OooO0O0", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBadgeFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,291:1\n172#2,9:292\n1002#3,2:301\n1011#3,2:303\n1002#3,2:305\n1011#3,2:307\n*S KotlinDebug\n*F\n+ 1 BadgeFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeFragment\n*L\n45#1:292,9\n223#1:301,2\n227#1:303,2\n231#1:305,2\n232#1:307,2\n*E\n"})
public final class BadgeFragment extends o00OO0O0<l2> {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    private static final String HONOR_BADGE = "HONOR_BADGE";

    @Nullable
    private o0oOO achievementDetailDialog;

    @Nullable
    private View currentOrderView;

    @Nullable
    private oO00Oo00 honorDetailDialog;
    private boolean isHonor;
    private u2 popupBinding;

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
        public final /* synthetic */ Function0 f27592OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27592OooO0Oo;
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

    public static final class OooO0o extends Lambda implements Function0<com.yalla.yalla.ui.fragment.OooO0o> {
        public OooO0o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final com.yalla.yalla.ui.fragment.OooO0o invoke() {
            BadgeFragment badgeFragment = BadgeFragment.this;
            return new com.yalla.yalla.ui.fragment.OooO0o(badgeFragment, badgeFragment.requireContext(), p565o0oOo000.o0OO00O.user_item_badge);
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

    private final p570o0oOo0o.o000O0<BadgeDataModel> getAdapter() {
        return (p570o0oOo0o.o000O0) this.adapter.getValue();
    }

    private final BadgeVM getBadgeVM() {
        return (BadgeVM) this.badgeVM.getValue();
    }

    private final void initData() {
        boolean z = this.isHonor;
        int i = 1;
        if (z) {
            getBadgeVM().getHonorList().observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO0o(this, 2));
        } else {
            if (z) {
                return;
            }
            getBadgeVM().getAchievementList().observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO(this, i));
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
        this$0.getBinding().f44101OooO0oO.OooOO0o(true);
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
        this$0.getBinding().f44101OooO0oO.OooOO0o(true);
    }

    private final void initView() {
        Bundle arguments = getArguments();
        this.isHonor = arguments != null ? arguments.getBoolean(HONOR_BADGE) : false;
        getBinding().f44101OooO0oO.setOnRefreshListener(new o0O0OO0() { // from class: com.yalla.yalla.ui.fragment.OooO00o
            @Override // p569o0oOo0Oo.o0O0OO0
            public final void OooO0Oo() {
                BadgeFragment.initView$lambda$0(this.f27749OooO0Oo);
            }
        });
        getBinding().f44101OooO0oO.OooOo00(false);
        int i = 2;
        if (this.isHonor) {
            ConstraintLayout clHeader = getBinding().f44096OooO0O0;
            Intrinsics.checkNotNullExpressionValue(clHeader, "clHeader");
            com.code.android.util.o000O.OooO0O0(clHeader);
        } else {
            getBadgeVM().getCurrentStar().observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.o0000(this, i));
            getBadgeVM().getCurrentRank().observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooO0O0(this, 3));
            getBinding().f44100OooO0o0.setTextColor(getBadgeVM().getIsFromMe() ? -1 : com.code.android.util.o0000.OooO00o(p565o0oOo000.o0ooOOo.color_999999));
            if (getBadgeVM().getIsFromMe()) {
                AppCompatTextView tvBadgeOrder = getBinding().f44098OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(tvBadgeOrder, "tvBadgeOrder");
                com.code.android.util.o000O.OooOOOO(tvBadgeOrder);
                getBinding().f44100OooO0o0.setBackgroundResource(p565o0oOo000.o0OOO0o.user_badge_header_no_me);
                getBinding().f44098OooO0Oo.setOnClickListener(this);
                getBinding().f44100OooO0o0.setOnClickListener(this);
            } else {
                getBinding().f44100OooO0o0.setBackgroundResource(p565o0oOo000.o0OOO0o.user_badge_header_no_other);
                AppCompatTextView tvBadgeOrder2 = getBinding().f44098OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(tvBadgeOrder2, "tvBadgeOrder");
                com.code.android.util.o000O.OooO0O0(tvBadgeOrder2);
            }
        }
        getAdapter().f13190OooO0oo = new o00O000(this);
        getBinding().f44097OooO0OO.setLayoutManager(new FixGridLayoutManager(getContext(), 2));
        getBinding().f44097OooO0OO.setAdapter(getAdapter());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(BadgeFragment this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBadgeVM().requestBadgeInfo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$1(BadgeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.getBinding().f44099OooO0o.setText(String.valueOf(num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(BadgeFragment this$0, Integer num) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        AppCompatTextView appCompatTextView = this$0.getBinding().f44100OooO0o0;
        String strOooO0OO = com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.user_badge_my_Rank_num);
        String[] strArr = new String[1];
        strArr[0] = (num != null && num.intValue() == 0) ? "50+" : String.valueOf(num);
        appCompatTextView.setText(com.code.android.util.o0000O.OooO00o(strOooO0OO, strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$4(BadgeFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        h0.OooO0O0("105096");
        if (this$0.isHonor) {
            Object obj = baseQuickAdapter.f13200OooOOoo.get(i);
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
            this.achievementDetailDialog = new o0oOO(fragmentActivityRequireActivity);
        }
        o0oOO o0ooo2 = this.achievementDetailDialog;
        if (o0ooo2 != null) {
            Intrinsics.checkNotNullParameter(dataBean, "data");
            o0ooo2.f59583OooOOOo = position;
            o0ooo2.f59585OooOOo0 = isFromMe;
            o00OOOOo o00ooooo2 = o0ooo2.f59580OooOOO;
            h2 h2Var = null;
            if (o00ooooo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o00ooooo2 = null;
            }
            o00ooooo2.OooOoO0(dataBean);
            h2 h2Var2 = o0ooo2.f59582OooOOOO;
            if (h2Var2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                h2Var2 = null;
            }
            h2Var2.f43896OooO0o0.scrollToPosition(position);
            h2 h2Var3 = o0ooo2.f59582OooOOOO;
            if (h2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                h2Var3 = null;
            }
            AppCompatImageView appCompatImageView = h2Var3.f43894OooO0OO;
            Intrinsics.checkNotNull(appCompatImageView);
            if (position == 0) {
                com.code.android.util.o000O.OooO0O0(appCompatImageView);
            } else {
                com.code.android.util.o000O.OooOOOO(appCompatImageView);
            }
            h2 h2Var4 = o0ooo2.f59582OooOOOO;
            if (h2Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
            } else {
                h2Var = h2Var4;
            }
            AppCompatImageView appCompatImageView2 = h2Var.f43895OooO0Oo;
            int size = dataBean.size() - 1;
            Intrinsics.checkNotNull(appCompatImageView2);
            if (position == size) {
                com.code.android.util.o000O.OooO0O0(appCompatImageView2);
            } else {
                com.code.android.util.o000O.OooOOOO(appCompatImageView2);
            }
        }
        o0oOO o0ooo3 = this.achievementDetailDialog;
        if (o0ooo3 != null) {
            oo0oO0 oo0oo0 = oo0oO0.f47967OooO00o;
            o0ooo3.f59584OooOOo = Intrinsics.areEqual(((MutableLiveData) oo0oO0.f48002Oooo0O0.getValue()).getValue(), Boolean.TRUE);
        }
        o0oOO o0ooo4 = this.achievementDetailDialog;
        if (o0ooo4 != null) {
            o0ooo4.show();
        }
    }

    private final void showMedalHonorDetailDialog(BadgeDataModel dataBean) {
        if (this.honorDetailDialog == null) {
            FragmentActivity fragmentActivityRequireActivity = requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            this.honorDetailDialog = new oO00Oo00(fragmentActivityRequireActivity);
        }
        oO00Oo00 oo00oo00 = this.honorDetailDialog;
        if (oo00oo00 != null) {
            Intrinsics.checkNotNullParameter(dataBean, "data");
            if (dataBean.getState() == 1) {
                oo00oo00.OooO0Oo(oO0O000.f56709OooO00o);
                oo00oo00.OooO0o0(dataBean.getRanking(), oO0O000.OooO0O0(dataBean.getMedalId()));
            } else {
                oo00oo00.OooO0Oo(0);
                oo00oo00.OooO0o0(0, oO0O000.f56710OooO0O0);
            }
            Uri uriOooO00o = oO0O000.OooO00o(dataBean.getMedalId(), dataBean.getState());
            if (uriOooO00o == null) {
                i2 i2Var = oo00oo00.f59657OooOOO0;
                if (i2Var == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    i2Var = null;
                }
                i2Var.f43927OooO0O0.setImageDrawable(null);
                i2 i2Var2 = oo00oo00.f59657OooOOO0;
                if (i2Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    i2Var2 = null;
                }
                AppCompatImageView ivBadge = i2Var2.f43927OooO0O0;
                Intrinsics.checkNotNullExpressionValue(ivBadge, "ivBadge");
                com.code.android.util.o000O.OooO0OO(ivBadge);
                i2 i2Var3 = oo00oo00.f59657OooOOO0;
                if (i2Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("binding");
                    i2Var3 = null;
                }
                SVGAView sdvMedal = i2Var3.f43929OooO0Oo;
                Intrinsics.checkNotNullExpressionValue(sdvMedal, "sdvMedal");
                com.code.android.util.o000O.OooO0OO(sdvMedal);
            } else {
                String string = uriOooO00o.toString();
                Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                if (StringsKt.OooO0o(string, ".svga")) {
                    i2 i2Var4 = oo00oo00.f59657OooOOO0;
                    if (i2Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        i2Var4 = null;
                    }
                    SVGAView sVGAView = i2Var4.f43929OooO0Oo;
                    int i = p565o0oOo000.o0OOO0o.icon_badge_no_pic;
                    sVGAView.f13243OooOooO = i;
                    sVGAView.setImageResource(i);
                    String string2 = uriOooO00o.toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    sVGAView.OooOO0O(string2, oo00oo00);
                    sVGAView.OooOO0o();
                    i2 i2Var5 = oo00oo00.f59657OooOOO0;
                    if (i2Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        i2Var5 = null;
                    }
                    AppCompatImageView ivBadge2 = i2Var5.f43927OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(ivBadge2, "ivBadge");
                    com.code.android.util.o000O.OooO0O0(ivBadge2);
                    i2 i2Var6 = oo00oo00.f59657OooOOO0;
                    if (i2Var6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        i2Var6 = null;
                    }
                    SVGAView sdvMedal2 = i2Var6.f43929OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(sdvMedal2, "sdvMedal");
                    com.code.android.util.o000O.OooOOOO(sdvMedal2);
                } else {
                    o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(oo00oo00.getContext());
                    oooO00o.f43127OooO0OO = uriOooO00o.toString();
                    oooO00o.f43125OooO00o = 0;
                    i2 i2Var7 = oo00oo00.f59657OooOOO0;
                    if (i2Var7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        i2Var7 = null;
                    }
                    oooO00o.OooO0Oo(i2Var7.f43927OooO0O0);
                    i2 i2Var8 = oo00oo00.f59657OooOOO0;
                    if (i2Var8 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        i2Var8 = null;
                    }
                    AppCompatImageView ivBadge3 = i2Var8.f43927OooO0O0;
                    Intrinsics.checkNotNullExpressionValue(ivBadge3, "ivBadge");
                    com.code.android.util.o000O.OooOOOO(ivBadge3);
                    i2 i2Var9 = oo00oo00.f59657OooOOO0;
                    if (i2Var9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("binding");
                        i2Var9 = null;
                    }
                    SVGAView sdvMedal3 = i2Var9.f43929OooO0Oo;
                    Intrinsics.checkNotNullExpressionValue(sdvMedal3, "sdvMedal");
                    com.code.android.util.o000O.OooO0O0(sdvMedal3);
                }
            }
            String name = dataBean.getName();
            i2 i2Var10 = oo00oo00.f59657OooOOO0;
            if (i2Var10 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i2Var10 = null;
            }
            AppCompatTextView appCompatTextView = i2Var10.f43932OooO0oO;
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
            i2 i2Var11 = oo00oo00.f59657OooOOO0;
            if (i2Var11 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i2Var11 = null;
            }
            AppCompatTextView appCompatTextView2 = i2Var11.f43925OooO;
            if (setTime > 0) {
                Intrinsics.checkNotNull(appCompatTextView2);
                com.code.android.util.o000O.OooOOOO(appCompatTextView2);
                appCompatTextView2.setText(com.code.android.util.o0000O.OooO00o(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.user_badge_time), p606o0oo0O0.OooOOOO.OooO0OO(setTime, "dd/MM/yyyy")));
            } else {
                Intrinsics.checkNotNull(appCompatTextView2);
                com.code.android.util.o000O.OooO0O0(appCompatTextView2);
            }
            String strOooO00o = com.code.android.util.o0000O.OooO00o(dataBean.getState() == 1 ? dataBean.getRemark1() : dataBean.getRemark(), p435o0OoOOO0.o000.OooO00o(dataBean.getRanking()));
            i2 i2Var12 = oo00oo00.f59657OooOOO0;
            if (i2Var12 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("binding");
                i2Var12 = null;
            }
            AppCompatTextView appCompatTextView3 = i2Var12.f43930OooO0o;
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
        oO00Oo00 oo00oo01 = this.honorDetailDialog;
        if (oo00oo01 != null) {
            oo00oo01.show();
        }
    }

    private final void showPopupWindow() {
        if (this.popupWindow == null) {
            u2 u2VarInflate = u2.inflate(getLayoutInflater());
            Intrinsics.checkNotNullExpressionValue(u2VarInflate, "inflate(...)");
            this.popupBinding = u2VarInflate;
            u2 u2Var = this.popupBinding;
            u2 u2Var2 = null;
            if (u2Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                u2Var = null;
            }
            int i = 1;
            PopupWindow popupWindow = new PopupWindow((View) u2Var.f45572OooO00o, -2, -2, true);
            this.popupWindow = popupWindow;
            popupWindow.setAnimationStyle(p565o0oOo000.o00Ooo.user_badge_right_enter);
            PopupWindow popupWindow2 = this.popupWindow;
            if (popupWindow2 != null) {
                popupWindow2.setTouchable(true);
            }
            PopupWindow popupWindow3 = this.popupWindow;
            if (popupWindow3 != null) {
                popupWindow3.setBackgroundDrawable(com.code.android.util.o0000.OooO0O0(p565o0oOo000.o0OOO0o.user_shape_transparent));
            }
            u2 u2Var3 = this.popupBinding;
            if (u2Var3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                u2Var3 = null;
            }
            u2Var3.f45577OooO0o0.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.OooO0O0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BadgeFragment.showPopupWindow$lambda$7(this.f27750OooO0Oo, view);
                }
            });
            u2 u2Var4 = this.popupBinding;
            if (u2Var4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                u2Var4 = null;
            }
            u2Var4.f45578OooO0oO.setOnClickListener(new View.OnClickListener() { // from class: com.yalla.yalla.ui.fragment.OooO0OO
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BadgeFragment.showPopupWindow$lambda$8(this.f27751OooO0Oo, view);
                }
            });
            u2 u2Var5 = this.popupBinding;
            if (u2Var5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
                u2Var5 = null;
            }
            u2Var5.f45576OooO0o.setOnClickListener(new com.yalla.yalla.ui.adapter.o000000(this, i));
            u2 u2Var6 = this.popupBinding;
            if (u2Var6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            } else {
                u2Var2 = u2Var6;
            }
            this.currentOrderView = u2Var2.f45573OooO0O0;
        }
        View view = this.currentOrderView;
        if (view != null) {
            com.code.android.util.o000O.OooOOOO(view);
        }
        PopupWindow popupWindow4 = this.popupWindow;
        if (popupWindow4 != null) {
            popupWindow4.getContentView().measure(0, 0);
            popupWindow4.showAsDropDown(getBinding().f44098OooO0Oo, p596o0oo000O.OooO0o.OooO0o0() ? (-getBinding().f44098OooO0Oo.getWidth()) - com.code.android.util.o0000O0.OooO00o(14) : (getBinding().f44098OooO0Oo.getWidth() - popupWindow4.getContentView().getMeasuredWidth()) + com.code.android.util.o0000O0.OooO00o(14), (-getBinding().f44098OooO0Oo.getHeight()) - com.code.android.util.o0000O0.OooO00o(2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPopupWindow$lambda$7(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        u2 u2Var = this$0.popupBinding;
        if (u2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            u2Var = null;
        }
        AppCompatImageView ivDefault = u2Var.f45573OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ivDefault, "ivDefault");
        this$0.setCurrentOrderView(ivDefault);
        OooO00o oooO00o = OooO00o.OrderDefault;
        List<BadgeDataModel> list = this$0.getAdapter().f13200OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
        setOrderAchievementData$default(this$0, oooO00o, false, list, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f44098OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.user_badge_pop_default));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPopupWindow$lambda$8(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        u2 u2Var = this$0.popupBinding;
        if (u2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            u2Var = null;
        }
        AppCompatImageView ivTime = u2Var.f45575OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(ivTime, "ivTime");
        this$0.setCurrentOrderView(ivTime);
        OooO00o oooO00o = OooO00o.OrderTime;
        List<BadgeDataModel> list = this$0.getAdapter().f13200OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
        setOrderAchievementData$default(this$0, oooO00o, false, list, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f44098OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.user_badge_pop_time));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showPopupWindow$lambda$9(BadgeFragment this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        u2 u2Var = this$0.popupBinding;
        if (u2Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("popupBinding");
            u2Var = null;
        }
        AppCompatImageView ivLevel = u2Var.f45574OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ivLevel, "ivLevel");
        this$0.setCurrentOrderView(ivLevel);
        OooO00o oooO00o = OooO00o.OrderLevel;
        List<BadgeDataModel> list = this$0.getAdapter().f13200OooOOoo;
        Intrinsics.checkNotNullExpressionValue(list, "getData(...)");
        setOrderAchievementData$default(this$0, oooO00o, false, list, 2, null);
        this$0.getAdapter().notifyDataSetChanged();
        this$0.getBinding().f44098OooO0Oo.setText(com.code.android.util.o0000.OooO0OO(p565o0oOo000.o000OOo.user_badge_pop_level));
        PopupWindow popupWindow = this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // p527o0o0OO0.o00OO0O0
    public void onNoDoubleClick(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onNoDoubleClick(view);
        if (!Intrinsics.areEqual(view, getBinding().f44100OooO0o0)) {
            if (Intrinsics.areEqual(view, getBinding().f44098OooO0Oo)) {
                showPopupWindow();
            }
        } else {
            h0.OooO0O0("105092");
            int i = BadgeRankActivity.f26622OooOo;
            Context context = getBinding().f44095OooO00o.getContext();
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

    @Override // p527o0o0OO0.o00OO0O0
    @NotNull
    public l2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        l2 l2VarInflate = l2.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(l2VarInflate, "inflate(...)");
        return l2VarInflate;
    }
}
