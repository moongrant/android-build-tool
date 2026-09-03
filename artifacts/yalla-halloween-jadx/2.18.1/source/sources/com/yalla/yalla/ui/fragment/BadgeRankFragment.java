package com.yalla.yalla.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.app.base.view.ViewPagerFixed;
import com.app.base.view.indicator.YlTableLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.weieyu.yalla.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p649o0ooOOoo.hi;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeRankFragment;", "Lo0o00o00/OooO;", "Lo0ooOOoo/hi;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment;", "totalRankFragment", "Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment;", "quarterRankFragment", "", "fragments", "Ljava/util/List;", "Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", BadgeRankFragment.BADGE_TYPE, "Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", "<init>", "()V", "Companion", "BadgeType", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class BadgeRankFragment extends p503o0o00o00.OooO<hi> {
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

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/String;", "OooO00o", "()Ljava/lang/String;", "GlobalType", "FriendType", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
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
        @NotNull
        public final BadgeRankFragment OooO00o(@NotNull BadgeType badgeType) {
            Intrinsics.checkNotNullParameter(badgeType, "badgeType");
            BadgeRankFragment badgeRankFragment = new BadgeRankFragment();
            Bundle bundle = new Bundle();
            bundle.putString(BadgeRankFragment.BADGE_TYPE, badgeType.getValue());
            badgeRankFragment.setArguments(bundle);
            return badgeRankFragment;
        }
    }

    private final void initView() {
        BadgeRankDataFragment.Companion companion = BadgeRankDataFragment.INSTANCE;
        BadgeType badgeType = this.badgeType;
        BadgeRankDataFragment badgeRankDataFragment = null;
        if (badgeType == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            badgeType = null;
        }
        this.totalRankFragment = companion.OooO00o(badgeType, BadgeRankDataFragment.BadgeRank.TotalRank);
        BadgeType badgeType2 = this.badgeType;
        if (badgeType2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            badgeType2 = null;
        }
        this.quarterRankFragment = companion.OooO00o(badgeType2, BadgeRankDataFragment.BadgeRank.QuarterRank);
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
        getBinding().f49633OooO0OO.setAdapter(new p462o0Ooo0o.o0000O00(childFragmentManager, this.fragments));
        getBinding().f49633OooO0OO.setOffscreenPageLimit(1);
        Context context = getBinding().f49632OooO0O0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "binding.tlRank.context");
        Intrinsics.checkNotNullParameter(context, "context");
        o00o000O.OooO0O0.OooO00o oooO00o = new o00o000O.OooO0O0.OooO00o(context);
        oooO00o.f32980OooO0Oo = 14.0f;
        oooO00o.f32982OooO0o0 = 14.0f;
        oooO00o.OooO0O0(CollectionsKt.mutableListOf(p254o00ooO0O.o000O0O0.OooO0OO(R.string.user_badge_rank_table_total), p254o00ooO0O.o000O0O0.OooO0OO(R.string.user_badge_rank_table_quarter)));
        oooO00o.f32981OooO0o = p254o00ooO0O.o000O0O0.OooO00o(R.color.white);
        oooO00o.f32983OooO0oO = p254o00ooO0O.o000O0O0.OooO00o(R.color.color_white_70);
        ViewPagerFixed viewPagerFixed = getBinding().f49633OooO0OO;
        Intrinsics.checkNotNullExpressionValue(viewPagerFixed, "binding.vpRank");
        oooO00o.OooO0OO(viewPagerFixed);
        oooO00o.f32978OooO0O0.setAdjustMode(true);
        oooO00o.f32976OooO = p254o00ooO0O.o000O0O0.OooO00o(R.color.white);
        oooO00o.f32984OooO0oo = com.yalla.support.common.util.OooOo00.OooO00o(2.0f);
        oooO00o.f32985OooOO0 = com.yalla.support.common.util.OooOo00.OooO00o(15.0f);
        oooO00o.f32986OooOO0O = com.yalla.support.common.util.OooOo00.OooO00o(3.0f);
        YlTableLayout ylTableLayout = getBinding().f49632OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tlRank");
        oooO00o.OooO00o(ylTableLayout);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027  */
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

    @Override // p503o0o00o00.OooO
    @NotNull
    public hi getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        hi hiVarInflate = hi.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(hiVarInflate, "inflate(layoutInflater)");
        return hiVarInflate;
    }
}
