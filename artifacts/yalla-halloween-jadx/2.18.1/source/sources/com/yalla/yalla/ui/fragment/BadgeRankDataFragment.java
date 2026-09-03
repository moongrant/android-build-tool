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
import androidx.lifecycle.ViewModelKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.weieyu.yalla.R;
import com.yalla.yalla.model.BadgeRankDataModel;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p142o00OOooO.o000O;
import p254o00ooO0O.oOO00O;
import p582o0oOoOoO.u1;
import p609o0oo0O0o.o00O00;
import p609o0oo0O0o.o00O000o;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.ii;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 &2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002'(B\u0007¢\u0006\u0004\b$\u0010%J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u001a\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0014R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/ii;", "", "initView", "", "rank", "Lo00o00o0/OooO0o;", "helper", "showRankView", "getRankImageResourceId", "initData", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "onResume", "onLazyInit", "Lo0oo0O0o/o00O00;", "badgeRankVM$delegate", "Lkotlin/Lazy;", "getBadgeRankVM", "()Lo0oo0O0o/o00O00;", "badgeRankVM", "Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", BadgeRankDataFragment.BADGE_TYPE, "Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", "Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment$BadgeRank;", BadgeRankDataFragment.BADGE_RANK, "Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment$BadgeRank;", "<init>", "()V", "Companion", "BadgeRank", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class BadgeRankDataFragment extends p503o0o00o00.OooO<ii> {
    public static final int $stable = 8;

    @NotNull
    private static final String BADGE_RANK = "badgeRank";

    @NotNull
    private static final String BADGE_TYPE = "badgeType";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private p188o00o00o0.OooO0OO<BadgeRankDataModel> adapter;
    private BadgeRank badgeRank;

    /* JADX INFO: renamed from: badgeRankVM$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy badgeRankVM = androidx.fragment.app.o0000O.OooO0O0(this, Reflection.getOrCreateKotlinClass(o00O00.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.fragment.BadgeRankDataFragment$special$$inlined$activityViewModels$default$1
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23823Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23823Oooo0o;
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

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment$BadgeRank;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/String;", "OooO00o", "()Ljava/lang/String;", "TotalRank", "QuarterRank", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
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

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.BadgeRankDataFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
        @NotNull
        public final BadgeRankDataFragment OooO00o(@NotNull BadgeRankFragment.BadgeType badgeType, @NotNull BadgeRank badgeRank) {
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

    public static final class OooO0O0 extends p188o00o00o0.OooO0OO<BadgeRankDataModel> {
        public OooO0O0(Context context) {
            super(context, R.layout.user_item_badge_rank);
        }

        @Override // com.chad.library.adapter.base.BaseQuickAdapter
        public final void convert(com.chad.library.adapter.base.OooO00o oooO00o, Object obj) {
            p188o00o00o0.OooO0o oooO0o = (p188o00o00o0.OooO0o) oooO00o;
            BadgeRankDataModel badgeRankDataModel = (BadgeRankDataModel) obj;
            if (oooO0o == null || badgeRankDataModel == null) {
                return;
            }
            oooO0o.OooOO0o(R.id.vLine, true);
            BadgeRankDataFragment.this.showRankView(badgeRankDataModel.getNum(), oooO0o);
            oO0O00.OooO00o oooO00o2 = new oO0O00.OooO00o(getContext());
            oooO00o2.OooO00o(o00OOO.OooO00o.OooO00o());
            oooO00o2.f48429OooO0OO = badgeRankDataModel.getImageUrl();
            oooO00o2.f48427OooO00o = 0;
            oooO00o2.OooO0OO(1, p254o00ooO0O.o000O0O0.OooO00o(R.color.color_e2e2e2));
            oooO00o2.OooO0o((ImageView) oooO0o.OooO0Oo(R.id.ivUserHead));
            oooO0o.OooOO0(R.id.tvRankName, badgeRankDataModel.getNickName());
            if (BadgeRankDataFragment.this.getBadgeRankVM().f48344OooO00o) {
                oooO0o.OooOO0(R.id.tvRankDiamond, String.valueOf(badgeRankDataModel.getDiamondNum()));
                oooO0o.OooOO0o(R.id.tvRankDiamond, true);
            } else {
                oooO0o.OooO0oO(R.id.tvRankDiamond, false);
            }
            oooO0o.OooOO0(R.id.tvRankGold, String.valueOf(badgeRankDataModel.getGoldNum()));
            oooO0o.OooOO0(R.id.tvRankSilver, String.valueOf(badgeRankDataModel.getSilverNum()));
            oooO0o.OooOO0(R.id.tvRankBronze, String.valueOf(badgeRankDataModel.getCopperNum()));
            oooO0o.OooOO0(R.id.tvRankNum, String.valueOf(badgeRankDataModel.getSumStars()));
            oooO0o.OooO0O0(R.id.userBadgeItemRoot);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final o00O00 getBadgeRankVM() {
        return (o00O00) this.badgeRankVM.getValue();
    }

    private final int getRankImageResourceId(int rank) {
        if (rank != 1) {
            return rank != 2 ? R.drawable.user_support_three : R.drawable.user_support_two;
        }
        return R.drawable.user_support_one;
    }

    private final void initData() {
        o00O00 badgeRankVM = getBadgeRankVM();
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
        Objects.requireNonNull(badgeRankVM);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(rank, "rank");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(badgeRankVM), null, null, new o00O000o(type, rank, badgeRankVM, null), 3, null);
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
                getBadgeRankVM().f48350OooO0oO.observe(getViewLifecycleOwner(), new p142o00OOooO.o000O000(this, 6));
                return;
            }
        }
        BadgeRankFragment.BadgeType badgeType3 = this.badgeType;
        if (badgeType3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            badgeType3 = null;
        }
        int i = 5;
        if (badgeType == badgeType3) {
            BadgeRank badgeRank4 = BadgeRank.QuarterRank;
            BadgeRank badgeRank5 = this.badgeRank;
            if (badgeRank5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(BADGE_RANK);
                badgeRank5 = null;
            }
            if (badgeRank4 == badgeRank5) {
                getBadgeRankVM().f48351OooO0oo.observe(getViewLifecycleOwner(), new p501o0o00o.o0ooOOo(this, i));
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
                getBadgeRankVM().f48343OooO.observe(getViewLifecycleOwner(), new o000O(this, i));
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
                getBadgeRankVM().f48352OooOO0.observe(getViewLifecycleOwner(), new p142o00OOooO.o000OO0O(this, i));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-3, reason: not valid java name */
    public static final void m317initData$lambda3(BadgeRankDataFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO = this$0.adapter;
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setNewData(list);
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO3 = this$0.adapter;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO2 = oooO0OO3;
        }
        oooO0OO2.setLoadComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-4, reason: not valid java name */
    public static final void m318initData$lambda4(BadgeRankDataFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO = this$0.adapter;
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setNewData(list);
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO3 = this$0.adapter;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO2 = oooO0OO3;
        }
        oooO0OO2.setLoadComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-5, reason: not valid java name */
    public static final void m319initData$lambda5(BadgeRankDataFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO = this$0.adapter;
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setNewData(list);
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO3 = this$0.adapter;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO2 = oooO0OO3;
        }
        oooO0OO2.setLoadComplete();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initData$lambda-6, reason: not valid java name */
    public static final void m320initData$lambda6(BadgeRankDataFragment this$0, List list) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO = this$0.adapter;
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setNewData(list);
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO3 = this$0.adapter;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO2 = oooO0OO3;
        }
        oooO0OO2.setLoadComplete();
    }

    private final void initView() {
        OooO0O0 oooO0O0 = new OooO0O0(getBinding().f49690OooO0O0.getContext());
        this.adapter = oooO0O0;
        oooO0O0.setOnItemChildClickListener(new u1(this));
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO = this.adapter;
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO2 = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        oooO0OO.setEmptyImageRes(R.drawable.ic_empty_message_system);
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO3 = this.adapter;
        if (oooO0OO3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO3 = null;
        }
        oooO0OO3.setHeaderAndEmpty(true);
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO4 = this.adapter;
        if (oooO0OO4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO4 = null;
        }
        oooO0OO4.setEmptyFullScreen(true);
        getBinding().f49690OooO0O0.setLayoutManager(new FixLinearLayoutManager(getBinding().f49690OooO0O0.getContext(), 1));
        RecyclerView recyclerView = getBinding().f49690OooO0O0;
        p188o00o00o0.OooO0OO<BadgeRankDataModel> oooO0OO5 = this.adapter;
        if (oooO0OO5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
        } else {
            oooO0OO2 = oooO0OO5;
        }
        recyclerView.setAdapter(oooO0OO2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: initView$lambda-2, reason: not valid java name */
    public static final void m321initView$lambda2(BadgeRankDataFragment this$0, BaseQuickAdapter baseQuickAdapter, View view, int i) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Object obj = baseQuickAdapter.getData().get(i);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.yalla.yalla.model.BadgeRankDataModel");
        BadgeRankDataModel badgeRankDataModel = (BadgeRankDataModel) obj;
        BadgeActivity.OooO00o oooO00o = BadgeActivity.f23283OooooOo;
        Context contextRequireContext = this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext()");
        BadgeActivity.OooO00o.OooO0O0(contextRequireContext, badgeRankDataModel.getUserId(), badgeRankDataModel.getNickName(), badgeRankDataModel.getImageUrl(), badgeRankDataModel.getMedal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showRankView(int rank, p188o00o00o0.OooO0o helper) {
        AppCompatTextView rankText = (AppCompatTextView) helper.OooO0Oo(R.id.tvRank);
        AppCompatImageView rankImageView = (AppCompatImageView) helper.OooO0Oo(R.id.ivRank);
        AppCompatImageView markImageView = (AppCompatImageView) helper.OooO0Oo(R.id.ivUserMark);
        if (rank > 3 || rank == 0) {
            rankText.setText(rank > 50 ? "50+" : String.valueOf(rank));
            Intrinsics.checkNotNullExpressionValue(rankText, "rankText");
            oOO00O.OooO(rankText);
            Intrinsics.checkNotNullExpressionValue(markImageView, "markImageView");
            oOO00O.OooO0O0(markImageView);
            Intrinsics.checkNotNullExpressionValue(rankImageView, "rankImageView");
            oOO00O.OooO00o(rankImageView);
            return;
        }
        rankImageView.setImageResource(getRankImageResourceId(rank));
        Intrinsics.checkNotNullExpressionValue(rankImageView, "rankImageView");
        oOO00O.OooO(rankImageView);
        int i = R.drawable.user_badge_item_rank_first;
        if (rank != 1) {
            if (rank == 2) {
                i = R.drawable.user_badge_item_rank_second;
            } else if (rank == 3) {
                i = R.drawable.user_badge_item_rank_third;
            }
        }
        markImageView.setImageResource(i);
        Intrinsics.checkNotNullExpressionValue(markImageView, "markImageView");
        oOO00O.OooO(markImageView);
        Intrinsics.checkNotNullExpressionValue(rankText, "rankText");
        oOO00O.OooO00o(rankText);
    }

    @Override // p462o0Ooo0o.o0000
    public void onLazyInit() {
        super.onLazyInit();
        initData();
    }

    @Override // p503o0o00o00.OooO, p462o0Ooo0o.o0000, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        o00O00 badgeRankVM = getBadgeRankVM();
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
        Objects.requireNonNull(badgeRankVM);
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(rank, "rank");
        BadgeRankFragment.BadgeType badgeType = BadgeRankFragment.BadgeType.GlobalType;
        if (badgeType == type && BadgeRank.TotalRank == rank) {
            badgeRankVM.f48345OooO0O0.postValue(badgeRankVM.f48346OooO0OO);
            return;
        }
        if (badgeType == type && BadgeRank.QuarterRank == rank) {
            badgeRankVM.f48345OooO0O0.postValue(badgeRankVM.f48347OooO0Oo);
            return;
        }
        BadgeRankFragment.BadgeType badgeType2 = BadgeRankFragment.BadgeType.FriendType;
        if (badgeType2 == type && BadgeRank.TotalRank == rank) {
            badgeRankVM.f48345OooO0O0.postValue(badgeRankVM.f48349OooO0o0);
        } else if (badgeType2 == type && BadgeRank.QuarterRank == rank) {
            badgeRankVM.f48345OooO0O0.postValue(badgeRankVM.f48348OooO0o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
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

    @Override // p503o0o00o00.OooO
    @NotNull
    public ii getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        ii iiVarInflate = ii.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(iiVarInflate, "inflate(layoutInflater)");
        return iiVarInflate;
    }
}
