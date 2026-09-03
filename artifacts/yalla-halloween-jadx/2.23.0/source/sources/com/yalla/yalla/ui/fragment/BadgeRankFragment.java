package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.yalla.yalla.ui.view.ViewPagerFixed;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553o0oOOoo.o0oO0O0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p641o0ooOOOO.xa;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeRankFragment;", "Lo0o0O/OooOO0O;", "Lo0ooOOOO/xa;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment;", "totalRankFragment", "Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment;", "quarterRankFragment", "", "fragments", "Ljava/util/List;", "Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", BadgeRankFragment.BADGE_TYPE, "Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", "<init>", "()V", "Companion", "BadgeType", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
public final class BadgeRankFragment extends p508o0o0O.OooOO0O<xa> {
    public static final int $stable = 8;

    @NotNull
    private static final String BADGE_TYPE = "badgeType";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    private BadgeType badgeType;

    @NotNull
    private final List<BadgeRankDataFragment> fragments = new ArrayList();
    private BadgeRankDataFragment quarterRankFragment;
    private BadgeRankDataFragment totalRankFragment;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/String;", "OooO00o", "()Ljava/lang/String;", "GlobalType", "FriendType", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
    public enum BadgeType {
        GlobalType("global"),
        FriendType("friend");


        @NotNull
        private final String value;

        BadgeType(String str) {
            this.value = str;
        }

        @NotNull
        /* JADX INFO: renamed from: OooO00o, reason: from getter */
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: renamed from: com.yalla.yalla.ui.fragment.BadgeRankFragment$OooO00o, reason: from kotlin metadata */
    public static final class Companion {
    }

    private final void initView() {
        BadgeRankDataFragment.Companion oooO00o = BadgeRankDataFragment.INSTANCE;
        BadgeType badgeType = this.badgeType;
        BadgeRankDataFragment badgeRankDataFragment = null;
        if (badgeType == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            badgeType = null;
        }
        BadgeRankDataFragment.BadgeRank badgeRank = BadgeRankDataFragment.BadgeRank.TotalRank;
        oooO00o.getClass();
        this.totalRankFragment = BadgeRankDataFragment.Companion.OooO00o(badgeType, badgeRank);
        BadgeType badgeType2 = this.badgeType;
        if (badgeType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            badgeType2 = null;
        }
        this.quarterRankFragment = BadgeRankDataFragment.Companion.OooO00o(badgeType2, BadgeRankDataFragment.BadgeRank.QuarterRank);
        List<BadgeRankDataFragment> list = this.fragments;
        BadgeRankDataFragment badgeRankDataFragment2 = this.totalRankFragment;
        if (badgeRankDataFragment2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("totalRankFragment");
            badgeRankDataFragment2 = null;
        }
        list.add(badgeRankDataFragment2);
        List<BadgeRankDataFragment> list2 = this.fragments;
        BadgeRankDataFragment badgeRankDataFragment3 = this.quarterRankFragment;
        if (badgeRankDataFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("quarterRankFragment");
        } else {
            badgeRankDataFragment = badgeRankDataFragment3;
        }
        list2.add(badgeRankDataFragment);
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        getBinding().f59346OooO0OO.setAdapter(new p401o0Oo0OO0.o00Oo0(childFragmentManager, this.fragments));
        getBinding().f59346OooO0OO.setOffscreenPageLimit(1);
        Context context = getBinding().f59345OooO0O0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.tlRank.context");
        Intrinsics.checkNotNullParameter(context, "context");
        o0oO0O0o.OooO00o oooO00o2 = new o0oO0O0o.OooO00o(context);
        oooO00o2.f56019OooO0OO = 14.0f;
        oooO00o2.f56020OooO0Oo = 14.0f;
        oooO00o2.OooO0O0(CollectionsKt.mutableListOf(com.code.android.util.o0000.OooO0OO(oO00OOo0.user_badge_rank_table_total), com.code.android.util.o0000.OooO0OO(oO00OOo0.user_badge_rank_table_quarter)));
        int i = oO00O0o.white;
        oooO00o2.f56022OooO0o0 = com.code.android.util.o0000.OooO00o(i);
        oooO00o2.f56024OooO0oo = com.code.android.util.o0000.OooO00o(oO00O0o.color_white_70);
        ViewPagerFixed viewPagerFixed = getBinding().f59346OooO0OO;
        Intrinsics.checkNotNullExpressionValue(viewPagerFixed, "binding.vpRank");
        oooO00o2.OooO0Oo(viewPagerFixed);
        oooO00o2.f56017OooO00o.setAdjustMode(true);
        oooO00o2.f56025OooOO0 = com.code.android.util.o0000.OooO00o(i);
        oooO00o2.f56016OooO = com.code.android.util.o0000O0.OooO00o(2);
        oooO00o2.f56026OooOO0O = com.code.android.util.o0000O0.OooO00o(15);
        oooO00o2.f56027OooOO0o = com.code.android.util.o0000O0.OooO00o(3);
        YlTableLayout ylTableLayout = getBinding().f59345OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tlRank");
        oooO00o2.OooO00o(ylTableLayout);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle savedInstanceState) {
        BadgeType badgeType;
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString(BADGE_TYPE)) == null) {
            badgeType = BadgeType.GlobalType;
        } else {
            badgeType = BadgeType.GlobalType;
            if (!Intrinsics.areEqual(string, badgeType.getValue())) {
                badgeType = BadgeType.FriendType;
            }
            if (badgeType == null) {
                badgeType = BadgeType.GlobalType;
            }
        }
        this.badgeType = badgeType;
        initView();
    }

    @Override // p508o0o0O.OooOO0O
    @NotNull
    public xa getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        xa xaVarInflate = xa.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(xaVarInflate, "inflate(layoutInflater)");
        return xaVarInflate;
    }
}
