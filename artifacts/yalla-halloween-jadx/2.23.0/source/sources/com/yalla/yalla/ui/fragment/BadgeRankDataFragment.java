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
import com.yalla.yalla.ui.activity.room.o0O0o0;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.view.recyclerview.ViewHolder;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p582o0oOoo0O.o00O0OO0;
import p582o0oOoo0O.oo0o0O0;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00O0oO;
import p584o0oOooO0.oO00OO0O;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.ya;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 *2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002+,B\u0007¢\u0006\u0004\b(\u0010)J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0014R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006-"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/ya;", "", "initView", "", "rank", "Lcom/yalla/yalla/ui/view/recyclerview/ViewHolder;", "helper", "showRankView", "getRankImageResourceId", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onLazyInit", "Lo0oOoo0O/oo0o0O0;", "badgeRankVM$delegate", "Lkotlin/Lazy;", "getBadgeRankVM", "()Lo0oOoo0O/oo0o0O0;", "badgeRankVM", "Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", BadgeRankDataFragment.BADGE_TYPE, "Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", "Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment$BadgeRank;", BadgeRankDataFragment.BADGE_RANK, "Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment$BadgeRank;", "Lo0oOo0OO/o000O;", "Lcom/yalla/yalla/model/BadgeRankDataModel;", "adapter", "Lo0oOo0OO/o000O;", "<init>", "()V", "Companion", "BadgeRank", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadgeRankDataFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeRankDataFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeRankDataFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,185:1\n172#2,9:186\n*S KotlinDebug\n*F\n+ 1 BadgeRankDataFragment.kt\ncom/yalla/yalla/ui/fragment/BadgeRankDataFragment\n*L\n34#1:186,9\n*E\n"})
public final class BadgeRankDataFragment extends p508o0o0O.OooOO0O<ya> {
    public static final int $stable = 8;

    @NotNull
    private static final String BADGE_RANK = "badgeRank";

    @NotNull
    private static final String BADGE_TYPE = "badgeType";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private p564o0oOo0OO.o000O<BadgeRankDataModel> adapter;
    private BadgeRank badgeRank;

    /* JADX INFO: renamed from: badgeRankVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy badgeRankVM = androidx.fragment.app.o000O0o.OooO0O0(this, Reflection.getOrCreateKotlinClass(oo0o0O0.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.BadgeRankDataFragment$special$$inlined$activityViewModels$default$1
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
        public final /* synthetic */ Function0 f28080OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f28080OooO0Oo;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment$BadgeRank;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/String;", "OooO00o", "()Ljava/lang/String;", "TotalRank", "QuarterRank", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum BadgeRank {
        TotalRank("totalRank"),
        QuarterRank("quarterRank");


        @NotNull
        private final String value;

        BadgeRank(String str) {
            this.value = str;
        }

        @NotNull
        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    public static final class OooO implements Observer<List<BadgeRankDataModel>> {
        public OooO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(List<BadgeRankDataModel> list) {
            List<BadgeRankDataModel> list2 = list;
            BadgeRankDataFragment badgeRankDataFragment = BadgeRankDataFragment.this;
            p564o0oOo0OO.o000O o000o = badgeRankDataFragment.adapter;
            p564o0oOo0OO.o000O o000o2 = null;
            if (o000o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000o = null;
            }
            o000o.OooOoO0(list2);
            p564o0oOo0OO.o000O o000o3 = badgeRankDataFragment.adapter;
            if (o000o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                o000o2 = o000o3;
            }
            o000o2.Oooo00o();
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

    public static final class OooO0O0 implements Observer<List<BadgeRankDataModel>> {
        public OooO0O0() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(List<BadgeRankDataModel> list) {
            List<BadgeRankDataModel> list2 = list;
            BadgeRankDataFragment badgeRankDataFragment = BadgeRankDataFragment.this;
            p564o0oOo0OO.o000O o000o = badgeRankDataFragment.adapter;
            p564o0oOo0OO.o000O o000o2 = null;
            if (o000o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000o = null;
            }
            o000o.OooOoO0(list2);
            p564o0oOo0OO.o000O o000o3 = badgeRankDataFragment.adapter;
            if (o000o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                o000o2 = o000o3;
            }
            o000o2.Oooo00o();
        }
    }

    public static final class OooO0OO implements Observer<List<BadgeRankDataModel>> {
        public OooO0OO() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(List<BadgeRankDataModel> list) {
            List<BadgeRankDataModel> list2 = list;
            BadgeRankDataFragment badgeRankDataFragment = BadgeRankDataFragment.this;
            p564o0oOo0OO.o000O o000o = badgeRankDataFragment.adapter;
            p564o0oOo0OO.o000O o000o2 = null;
            if (o000o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000o = null;
            }
            o000o.OooOoO0(list2);
            p564o0oOo0OO.o000O o000o3 = badgeRankDataFragment.adapter;
            if (o000o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                o000o2 = o000o3;
            }
            o000o2.Oooo00o();
        }
    }

    public static final class OooO0o implements Observer<List<BadgeRankDataModel>> {
        public OooO0o() {
        }

        @Override // androidx.lifecycle.Observer
        public final void onChanged(List<BadgeRankDataModel> list) {
            List<BadgeRankDataModel> list2 = list;
            BadgeRankDataFragment badgeRankDataFragment = BadgeRankDataFragment.this;
            p564o0oOo0OO.o000O o000o = badgeRankDataFragment.adapter;
            p564o0oOo0OO.o000O o000o2 = null;
            if (o000o == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
                o000o = null;
            }
            o000o.OooOoO0(list2);
            p564o0oOo0OO.o000O o000o3 = badgeRankDataFragment.adapter;
            if (o000o3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("adapter");
            } else {
                o000o2 = o000o3;
            }
            o000o2.Oooo00o();
        }
    }

    public static final class OooOO0 extends p564o0oOo0OO.o000O<BadgeRankDataModel> {
        public OooOO0(Context context, int i) {
            super(context, i);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void OooO0oO(BaseViewHolder baseViewHolder, Object obj) {
            ViewHolder viewHolder = (ViewHolder) baseViewHolder;
            BadgeRankDataModel badgeRankDataModel = (BadgeRankDataModel) obj;
            if (viewHolder == null || badgeRankDataModel == null) {
                return;
            }
            viewHolder.setVisible(oO00O0oO.vLine, true);
            int num = badgeRankDataModel.getNum();
            BadgeRankDataFragment badgeRankDataFragment = BadgeRankDataFragment.this;
            badgeRankDataFragment.showRankView(num, viewHolder);
            o0OOo0O.OooOO0.OooO00o oooO00o = new o0OOo0O.OooOO0.OooO00o(this.f56196OooOo);
            oooO00o.OooO00o(p543o0oO0O00.OooO.OooO00o());
            oooO00o.f43911OooO0OO = badgeRankDataModel.getImageUrl();
            oooO00o.f43909OooO00o = 0;
            oooO00o.OooO0O0(1, com.code.android.util.o0000.OooO00o(oO00O0o.color_e2e2e2));
            oooO00o.OooO0Oo((ImageView) viewHolder.getView(oO00O0oO.ivUserHead));
            viewHolder.setText(oO00O0oO.tvRankName, badgeRankDataModel.getNickName());
            if (badgeRankDataFragment.getBadgeRankVM().f56748OooO00o) {
                int i = oO00O0oO.tvRankDiamond;
                viewHolder.setText(i, String.valueOf(badgeRankDataModel.getDiamondNum()));
                viewHolder.setVisible(i, true);
            } else {
                viewHolder.setGone(oO00O0oO.tvRankDiamond, false);
            }
            viewHolder.setText(oO00O0oO.tvRankGold, String.valueOf(badgeRankDataModel.getGoldNum()));
            viewHolder.setText(oO00O0oO.tvRankSilver, String.valueOf(badgeRankDataModel.getSilverNum()));
            viewHolder.setText(oO00O0oO.tvRankBronze, String.valueOf(badgeRankDataModel.getCopperNum()));
            viewHolder.setText(oO00O0oO.tvRankNum, String.valueOf(badgeRankDataModel.getSumStars()));
            viewHolder.addOnClickListener(oO00O0oO.userBadgeItemRoot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oo0o0O0 getBadgeRankVM() {
        return (oo0o0O0) this.badgeRankVM.getValue();
    }

    private final int getRankImageResourceId(int rank) {
        if (rank != 1) {
            return rank != 2 ? oOo00OO0.user_support_three : oOo00OO0.user_support_two;
        }
        return oOo00OO0.user_support_one;
    }

    private final void initData() {
        oo0o0O0 badgeRankVM = getBadgeRankVM();
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
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(badgeRankVM), null, null, new o00O0OO0(type, rank, badgeRankVM, null), 3, null);
        BadgeRankFragment.BadgeType badgeType = BadgeRankFragment.BadgeType.GlobalType;
        BadgeRankFragment.BadgeType badgeType2 = this.badgeType;
        if (badgeType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            badgeType2 = null;
        }
        if (badgeType == badgeType2) {
            BadgeRank badgeRank2 = BadgeRank.TotalRank;
            BadgeRank badgeRank3 = this.badgeRank;
            if (badgeRank3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BADGE_RANK);
                badgeRank3 = null;
            }
            if (badgeRank2 == badgeRank3) {
                getBadgeRankVM().f56754OooO0oO.observe(getViewLifecycleOwner(), new OooO0O0());
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
                getBadgeRankVM().f56755OooO0oo.observe(getViewLifecycleOwner(), new OooO0OO());
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
                getBadgeRankVM().f56747OooO.observe(getViewLifecycleOwner(), new OooO0o());
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
                getBadgeRankVM().f56756OooOO0.observe(getViewLifecycleOwner(), new OooO());
            }
        }
    }

    private final void initView() {
        OooOO0 oooOO1 = new OooOO0(getBinding().f59414OooO0O0.getContext(), oO00OO0O.user_item_badge_rank);
        this.adapter = oooOO1;
        oooOO1.f10101OooO0oo = new o0O0o0(this);
        oooOO1.OooOooo(oOo00OO0.ic_empty_message_system);
        p564o0oOo0OO.o000O<BadgeRankDataModel> o000o = this.adapter;
        p564o0oOo0OO.o000O<BadgeRankDataModel> o000o2 = null;
        if (o000o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000o = null;
        }
        o000o.OooOo0o();
        p564o0oOo0OO.o000O<BadgeRankDataModel> o000o3 = this.adapter;
        if (o000o3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            o000o3 = null;
        }
        o000o3.OooOooO(true);
        getBinding().f59414OooO0O0.setLayoutManager(new FixLinearLayoutManager(getBinding().f59414OooO0O0.getContext(), 1));
        RecyclerView recyclerView = getBinding().f59414OooO0O0;
        p564o0oOo0OO.o000O<BadgeRankDataModel> o000o4 = this.adapter;
        if (o000o4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            o000o2 = o000o4;
        }
        recyclerView.setAdapter(o000o2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$2(BadgeRankDataFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.f10111OooOOoo.get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.BadgeRankDataModel");
        BadgeRankDataModel badgeRankDataModel = (BadgeRankDataModel) obj;
        int i2 = BadgeActivity.f27070OooOo;
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        BadgeActivity.OooO00o.OooO00o(contextRequireContext, badgeRankDataModel.getUserId(), badgeRankDataModel.getNickName(), badgeRankDataModel.getImageUrl(), badgeRankDataModel.getMedal(), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRankView(int rank, ViewHolder helper) {
        int i;
        AppCompatTextView rankText = (AppCompatTextView) helper.getView(oO00O0oO.tvRank);
        AppCompatImageView rankImageView = (AppCompatImageView) helper.getView(oO00O0oO.ivRank);
        AppCompatImageView markImageView = (AppCompatImageView) helper.getView(oO00O0oO.ivUserMark);
        if (rank > 3 || rank == 0) {
            rankText.setText(rank > 50 ? "50+" : String.valueOf(rank));
            Intrinsics.checkNotNullExpressionValue(rankText, "rankText");
            com.code.android.util.o000OO00.OooOOOO(rankText);
            Intrinsics.checkNotNullExpressionValue(markImageView, "markImageView");
            com.code.android.util.o000OO00.OooO0OO(markImageView);
            Intrinsics.checkNotNullExpressionValue(rankImageView, "rankImageView");
            com.code.android.util.o000OO00.OooO0O0(rankImageView);
            return;
        }
        rankImageView.setImageResource(getRankImageResourceId(rank));
        Intrinsics.checkNotNullExpressionValue(rankImageView, "rankImageView");
        com.code.android.util.o000OO00.OooOOOO(rankImageView);
        if (rank == 1) {
            i = oOo00OO0.user_badge_item_rank_first;
        } else if (rank != 2) {
            i = rank != 3 ? oOo00OO0.user_badge_item_rank_first : oOo00OO0.user_badge_item_rank_third;
        } else {
            i = oOo00OO0.user_badge_item_rank_second;
        }
        markImageView.setImageResource(i);
        Intrinsics.checkNotNullExpressionValue(markImageView, "markImageView");
        com.code.android.util.o000OO00.OooOOOO(markImageView);
        Intrinsics.checkNotNullExpressionValue(rankText, "rankText");
        com.code.android.util.o000OO00.OooO0O0(rankText);
    }

    @Override // p401o0Oo0OO0.o00O0O
    public void onLazyInit() {
        super.onLazyInit();
        initData();
    }

    @Override // p508o0o0O.OooOO0O, p401o0Oo0OO0.o00O0O, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        oo0o0O0 badgeRankVM = getBadgeRankVM();
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
        MutableLiveData<BadgePersonal> mutableLiveData = badgeRankVM.f56749OooO0O0;
        if (badgeType == type && BadgeRank.TotalRank == rank) {
            mutableLiveData.postValue(badgeRankVM.f56750OooO0OO);
            return;
        }
        if (badgeType == type && BadgeRank.QuarterRank == rank) {
            mutableLiveData.postValue(badgeRankVM.f56751OooO0Oo);
            return;
        }
        BadgeRankFragment.BadgeType badgeType2 = BadgeRankFragment.BadgeType.FriendType;
        if (badgeType2 == type && BadgeRank.TotalRank == rank) {
            mutableLiveData.postValue(badgeRankVM.f56753OooO0o0);
        } else if (badgeType2 == type && BadgeRank.QuarterRank == rank) {
            mutableLiveData.postValue(badgeRankVM.f56752OooO0o);
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

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public ya getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ya yaVarInflate = ya.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(yaVarInflate, "inflate(layoutInflater)");
        return yaVarInflate;
    }
}
