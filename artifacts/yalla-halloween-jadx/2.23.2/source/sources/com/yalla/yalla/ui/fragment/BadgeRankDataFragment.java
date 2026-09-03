package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.model.BadgePersonal;
import com.yalla.yalla.model.BadgeRankDataModel;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.n2;
import p491o0o00O0o.o0;
import p491o0o00O0o.o0O0o;
import p588o0oOooOo.a3;
import p588o0oOooOo.z2;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0014R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/n2;", "", "initView", "", "rank", "Lcom/yalla/yalla/ui/view/recyclerview/ViewHolder;", "helper", "showRankView", "getRankImageResourceId", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onLazyInit", "Lo0oOooOo/a3;", "badgeRankVM$delegate", "Lkotlin/Lazy;", "getBadgeRankVM", "()Lo0oOooOo/a3;", "badgeRankVM", "Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", BadgeRankDataFragment.BADGE_TYPE, "Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", "Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment$BadgeRank;", BadgeRankDataFragment.BADGE_RANK, "Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment$BadgeRank;", "Lo0oOoO0/o0000oo;", "Lcom/yalla/yalla/model/BadgeRankDataModel;", "adapter", "Lo0oOoO0/o0000oo;", "<init>", "()V", "Companion", "BadgeRank", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBadgeRankDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeRankDataFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeRankDataFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,185:1\n172#2,9:186\n*S KotlinDebug\n*F\n+ 1 BadgeRankDataFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeRankDataFragment\n*L\n34#1:186,9\n*E\n"})
public final class BadgeRankDataFragment extends p527o0o0OO0o.o000O<n2> {
    public static final int $stable = 8;

    @NotNull
    private static final String BADGE_RANK = "badgeRank";

    @NotNull
    private static final String BADGE_TYPE = "badgeType";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private p571o0oOoO0.o0000oo<BadgeRankDataModel> adapter;
    private BadgeRank badgeRank;

    /* JADX INFO: renamed from: badgeRankVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy badgeRankVM = androidx.fragment.app.o000Oo0.OooO0O0(this, Reflection.getOrCreateKotlinClass(a3.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.BadgeRankDataFragment$special$$inlined$activityViewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.requireActivity().getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.fragment.BadgeRankDataFragment$special$$inlined$activityViewModels$default$2

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f27599OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f27599OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.requireActivity().getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "requireActivity().defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.fragment.BadgeRankDataFragment$special$$inlined$activityViewModels$default$3
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
    private BadgeRankFragment.BadgeType badgeType;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 com.yalla.yalla.ui.fragment.BadgeRankDataFragment$BadgeRank[], still in use, count: 1, list:
      (r2v3 com.yalla.yalla.ui.fragment.BadgeRankDataFragment$BadgeRank[]) from 0x0021: INVOKE (r2v3 com.yalla.yalla.ui.fragment.BadgeRankDataFragment$BadgeRank[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:34)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment$BadgeRank;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/String;", "OooO00o", "()Ljava/lang/String;", "TotalRank", "QuarterRank", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class BadgeRank {
        TotalRank("totalRank"),
        QuarterRank("quarterRank");

        private static final /* synthetic */ EnumEntries $ENTRIES;

        @NotNull
        private final String value;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(badgeRankArr);
        }

        public BadgeRank(String str) {
            super(str, i);
            this.value = str;
        }

        public static BadgeRank valueOf(String str) {
            return (BadgeRank) Enum.valueOf(BadgeRank.class, str);
        }

        public static BadgeRank[] values() {
            return (BadgeRank[]) $VALUES.clone();
        }

        @NotNull
        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.BadgeRankDataFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public static BadgeRankDataFragment OooO00o(@NotNull BadgeRankFragment.BadgeType badgeType, @NotNull BadgeRank badgeRank) {
            Intrinsics.checkNotNullParameter(badgeType, "badgeType");
            Intrinsics.checkNotNullParameter(badgeRank, "badgeRank");
            BadgeRankDataFragment badgeRankDataFragment = new BadgeRankDataFragment();
            Bundle bundle = new Bundle();
            bundle.putString(BadgeRankDataFragment.BADGE_TYPE, badgeType.getValue());
            bundle.putString(BadgeRankDataFragment.BADGE_RANK, badgeRank.getValue());
            badgeRankDataFragment.setArguments(bundle);
            return badgeRankDataFragment;
        }
    }

    public static final class OooO0O0 extends p571o0oOoO0.o0000oo<BadgeRankDataModel> {
        public OooO0O0(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            BadgeRankDataModel badgeRankDataModel = (BadgeRankDataModel) obj;
            if (viewHolder == null || badgeRankDataModel == null) {
                return;
            }
            viewHolder.setVisible(p562o0oOo000.o0OO00O.vLine, true);
            int num = badgeRankDataModel.getNum();
            BadgeRankDataFragment badgeRankDataFragment = BadgeRankDataFragment.this;
            badgeRankDataFragment.showRankView(num, viewHolder);
            o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this.f56423OooOo);
            oooO00o.OooO00o(d1.OooO00o());
            oooO00o.f43126OooO0OO = badgeRankDataModel.getImageUrl();
            oooO00o.f43124OooO00o = 0;
            oooO00o.OooO0O0(1, com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_e2e2e2));
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(p562o0oOo000.o0OO00O.ivUserHead));
            viewHolder.setText(p562o0oOo000.o0OO00O.tvRankName, badgeRankDataModel.getNickName());
            if (badgeRankDataFragment.getBadgeRankVM().f57073OooO00o) {
                int i = p562o0oOo000.o0OO00O.tvRankDiamond;
                viewHolder.setText(i, String.valueOf(badgeRankDataModel.getDiamondNum()));
                viewHolder.setVisible(i, true);
            } else {
                viewHolder.setGone(p562o0oOo000.o0OO00O.tvRankDiamond, false);
            }
            viewHolder.setText(p562o0oOo000.o0OO00O.tvRankGold, String.valueOf(badgeRankDataModel.getGoldNum()));
            viewHolder.setText(p562o0oOo000.o0OO00O.tvRankSilver, String.valueOf(badgeRankDataModel.getSilverNum()));
            viewHolder.setText(p562o0oOo000.o0OO00O.tvRankBronze, String.valueOf(badgeRankDataModel.getCopperNum()));
            viewHolder.setText(p562o0oOo000.o0OO00O.tvRankNum, String.valueOf(badgeRankDataModel.getSumStars()));
            viewHolder.addOnClickListener(p562o0oOo000.o0OO00O.userBadgeItemRoot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a3 getBadgeRankVM() {
        return (a3) this.badgeRankVM.getValue();
    }

    private final int getRankImageResourceId(int rank) {
        if (rank != 1) {
            return rank != 2 ? p562o0oOo000.o0Oo0oo.user_support_three : p562o0oOo000.o0Oo0oo.user_support_two;
        }
        return p562o0oOo000.o0Oo0oo.user_support_one;
    }

    private final void initData() {
        a3 badgeRankVM = getBadgeRankVM();
        BadgeRankFragment.BadgeType type = this.badgeType;
        BadgeRank badgeRank = null;
        if (type == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            type = null;
        }
        BadgeRank rank = this.badgeRank;
        if (rank == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_RANK);
            rank = null;
        }
        badgeRankVM.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(rank, "rank");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(badgeRankVM), null, null, new z2(type, rank, badgeRankVM, null), 3, null);
        BadgeRankFragment.BadgeType badgeType = BadgeRankFragment.BadgeType.GlobalType;
        BadgeRankFragment.BadgeType badgeType2 = this.badgeType;
        if (badgeType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            badgeType2 = null;
        }
        int i = 1;
        if (badgeType == badgeType2) {
            BadgeRank badgeRank2 = BadgeRank.TotalRank;
            BadgeRank badgeRank3 = this.badgeRank;
            if (badgeRank3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BADGE_RANK);
                badgeRank3 = null;
            }
            if (badgeRank2 == badgeRank3) {
                getBadgeRankVM().f57079OooO0oO.observe(getViewLifecycleOwner(), new com.yalla.yalla.mixedroom.OooOOOO(this, i));
                return;
            }
        }
        BadgeRankFragment.BadgeType badgeType3 = this.badgeType;
        if (badgeType3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            badgeType3 = null;
        }
        if (badgeType == badgeType3) {
            BadgeRank badgeRank4 = BadgeRank.QuarterRank;
            BadgeRank badgeRank5 = this.badgeRank;
            if (badgeRank5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BADGE_RANK);
                badgeRank5 = null;
            }
            if (badgeRank4 == badgeRank5) {
                getBadgeRankVM().f57080OooO0oo.observe(getViewLifecycleOwner(), new o0O0o(this, i));
                return;
            }
        }
        BadgeRankFragment.BadgeType badgeType4 = BadgeRankFragment.BadgeType.FriendType;
        BadgeRankFragment.BadgeType badgeType5 = this.badgeType;
        if (badgeType5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            badgeType5 = null;
        }
        if (badgeType4 == badgeType5) {
            BadgeRank badgeRank6 = BadgeRank.TotalRank;
            BadgeRank badgeRank7 = this.badgeRank;
            if (badgeRank7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BADGE_RANK);
                badgeRank7 = null;
            }
            if (badgeRank6 == badgeRank7) {
                getBadgeRankVM().f57072OooO.observe(getViewLifecycleOwner(), new o0(this, 2));
                return;
            }
        }
        BadgeRankFragment.BadgeType badgeType6 = this.badgeType;
        if (badgeType6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            badgeType6 = null;
        }
        if (badgeType4 == badgeType6) {
            BadgeRank badgeRank8 = BadgeRank.QuarterRank;
            BadgeRank badgeRank9 = this.badgeRank;
            if (badgeRank9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BADGE_RANK);
            } else {
                badgeRank = badgeRank9;
            }
            if (badgeRank8 == badgeRank) {
                getBadgeRankVM().f57081OooOO0.observe(getViewLifecycleOwner(), new Observer() { // from class: com.yalla.yalla.ui.fragment.OooO0o
                    @Override // androidx.lifecycle.Observer
                    public final void onChanged(Object obj) {
                        BadgeRankDataFragment.initData$lambda$6(this.f27743OooO0Oo, (List) obj);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$3(BadgeRankDataFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar = this$0.adapter;
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar2 = null;
        if (o0000ooVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000ooVar = null;
        }
        o0000ooVar.OooOoO0(list);
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar3 = this$0.adapter;
        if (o0000ooVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o0000ooVar2 = o0000ooVar3;
        }
        o0000ooVar2.Oooo00o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$4(BadgeRankDataFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar = this$0.adapter;
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar2 = null;
        if (o0000ooVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000ooVar = null;
        }
        o0000ooVar.OooOoO0(list);
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar3 = this$0.adapter;
        if (o0000ooVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o0000ooVar2 = o0000ooVar3;
        }
        o0000ooVar2.Oooo00o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$5(BadgeRankDataFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar = this$0.adapter;
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar2 = null;
        if (o0000ooVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000ooVar = null;
        }
        o0000ooVar.OooOoO0(list);
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar3 = this$0.adapter;
        if (o0000ooVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o0000ooVar2 = o0000ooVar3;
        }
        o0000ooVar2.Oooo00o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initData$lambda$6(BadgeRankDataFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar = this$0.adapter;
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar2 = null;
        if (o0000ooVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000ooVar = null;
        }
        o0000ooVar.OooOoO0(list);
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar3 = this$0.adapter;
        if (o0000ooVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o0000ooVar2 = o0000ooVar3;
        }
        o0000ooVar2.Oooo00o();
    }

    private final void initView() {
        OooO0O0 oooO0O0 = new OooO0O0(getBinding().f44194OooO0O0.getContext(), p562o0oOo000.oo0o0Oo.user_item_badge_rank);
        this.adapter = oooO0O0;
        oooO0O0.f13179OooO0oo = new BaseQuickAdapter.OooO0O0() { // from class: com.yalla.yalla.ui.fragment.OooO
            @Override // com.chad.library.adapter.base.BaseQuickAdapter.OooO0O0
            public final void OooO0O0(BaseQuickAdapter baseQuickAdapter, View view, int i) {
                BadgeRankDataFragment.initView$lambda$2(this.f27739OooO0Oo, baseQuickAdapter, view, i);
            }
        };
        oooO0O0.OooOooo(p562o0oOo000.o0Oo0oo.ic_empty_message_system);
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar = this.adapter;
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar2 = null;
        if (o0000ooVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000ooVar = null;
        }
        o0000ooVar.OooOo0o();
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar3 = this.adapter;
        if (o0000ooVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o0000ooVar3 = null;
        }
        o0000ooVar3.OooOooO(true);
        getBinding().f44194OooO0O0.setLayoutManager(new FixLinearLayoutManager(getBinding().f44194OooO0O0.getContext(), 1));
        RecyclerView recyclerView = getBinding().f44194OooO0O0;
        p571o0oOoO0.o0000oo<BadgeRankDataModel> o0000ooVar4 = this.adapter;
        if (o0000ooVar4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o0000ooVar2 = o0000ooVar4;
        }
        recyclerView.setAdapter(o0000ooVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(BadgeRankDataFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.f13189OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.BadgeRankDataModel");
        BadgeRankDataModel badgeRankDataModel = (BadgeRankDataModel) obj;
        int i2 = BadgeActivity.f26604OooOo;
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        BadgeActivity.OooO00o.OooO00o(contextRequireContext, badgeRankDataModel.getUserId(), badgeRankDataModel.getNickName(), badgeRankDataModel.getImageUrl(), badgeRankDataModel.getMedal(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRankView(int rank, ViewHolder helper) {
        int i;
        AppCompatTextView appCompatTextView = (AppCompatTextView) helper.getView(p562o0oOo000.o0OO00O.tvRank);
        AppCompatImageView appCompatImageView = (AppCompatImageView) helper.getView(p562o0oOo000.o0OO00O.ivRank);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) helper.getView(p562o0oOo000.o0OO00O.ivUserMark);
        if (rank > 3 || rank == 0) {
            appCompatTextView.setText(rank > 50 ? "50+" : String.valueOf(rank));
            Intrinsics.checkNotNull(appCompatTextView);
            com.code.android.util.o000O.OooOOOO(appCompatTextView);
            Intrinsics.checkNotNull(appCompatImageView2);
            com.code.android.util.o000O.OooO0OO(appCompatImageView2);
            Intrinsics.checkNotNull(appCompatImageView);
            com.code.android.util.o000O.OooO0O0(appCompatImageView);
            return;
        }
        appCompatImageView.setImageResource(getRankImageResourceId(rank));
        Intrinsics.checkNotNull(appCompatImageView);
        com.code.android.util.o000O.OooOOOO(appCompatImageView);
        if (rank == 1) {
            i = p562o0oOo000.o0Oo0oo.user_badge_item_rank_first;
        } else if (rank != 2) {
            i = rank != 3 ? p562o0oOo000.o0Oo0oo.user_badge_item_rank_first : p562o0oOo000.o0Oo0oo.user_badge_item_rank_third;
        } else {
            i = p562o0oOo000.o0Oo0oo.user_badge_item_rank_second;
        }
        appCompatImageView2.setImageResource(i);
        Intrinsics.checkNotNull(appCompatImageView2);
        com.code.android.util.o000O.OooOOOO(appCompatImageView2);
        Intrinsics.checkNotNull(appCompatTextView);
        com.code.android.util.o000O.OooO0O0(appCompatTextView);
    }

    @Override // p586o0oOooO0.oO0Oo0o0
    public void onLazyInit() {
        super.onLazyInit();
        initData();
    }

    @Override // p527o0o0OO0o.o000O, p586o0oOooO0.oO0Oo0o0, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        a3 badgeRankVM = getBadgeRankVM();
        BadgeRankFragment.BadgeType type = this.badgeType;
        BadgeRank rank = null;
        if (type == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            type = null;
        }
        BadgeRank badgeRank = this.badgeRank;
        if (badgeRank == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_RANK);
        } else {
            rank = badgeRank;
        }
        badgeRankVM.getClass();
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(rank, "rank");
        BadgeRankFragment.BadgeType badgeType = BadgeRankFragment.BadgeType.GlobalType;
        MutableLiveData<BadgePersonal> mutableLiveData = badgeRankVM.f57074OooO0O0;
        if (badgeType == type && BadgeRank.TotalRank == rank) {
            mutableLiveData.postValue(badgeRankVM.f57075OooO0OO);
            return;
        }
        if (badgeType == type && BadgeRank.QuarterRank == rank) {
            mutableLiveData.postValue(badgeRankVM.f57076OooO0Oo);
            return;
        }
        BadgeRankFragment.BadgeType badgeType2 = BadgeRankFragment.BadgeType.FriendType;
        if (badgeType2 == type && BadgeRank.TotalRank == rank) {
            mutableLiveData.postValue(badgeRankVM.f57078OooO0o0);
        } else if (badgeType2 == type && BadgeRank.QuarterRank == rank) {
            mutableLiveData.postValue(badgeRankVM.f57077OooO0o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:21:0x004b  */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BadgeRankFragment.BadgeType badgeType;
        BadgeRank badgeRank;
        String string;
        String string2;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string2 = arguments.getString(BADGE_TYPE)) == null) {
            badgeType = BadgeRankFragment.BadgeType.GlobalType;
        } else {
            badgeType = BadgeRankFragment.BadgeType.GlobalType;
            if (!Intrinsics.areEqual(string2, badgeType.getValue())) {
                badgeType = BadgeRankFragment.BadgeType.FriendType;
            }
            if (badgeType == null) {
                badgeType = BadgeRankFragment.BadgeType.GlobalType;
            }
        }
        this.badgeType = badgeType;
        Bundle arguments2 = getArguments();
        if (arguments2 == null || (string = arguments2.getString(BADGE_RANK)) == null) {
            badgeRank = BadgeRank.TotalRank;
        } else {
            badgeRank = BadgeRank.TotalRank;
            if (!Intrinsics.areEqual(badgeRank.getValue(), string)) {
                badgeRank = BadgeRank.QuarterRank;
            }
            if (badgeRank == null) {
                badgeRank = BadgeRank.TotalRank;
            }
        }
        this.badgeRank = badgeRank;
        initView();
    }

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public n2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        n2 n2VarInflate = n2.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(n2VarInflate, "inflate(...)");
        return n2VarInflate;
    }
}
