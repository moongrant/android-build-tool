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
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.m2;
import p586o0oOooO0.oO0o0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u001a\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u001a\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeRankFragment;", "Lo0o0OO0o/o000O;", "Lo0Oo0OOO/m2;", "", "initView", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "getViewBinding", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment;", "totalRankFragment", "Lcom/yalla/yalla/ui/fragment/BadgeRankDataFragment;", "quarterRankFragment", "", "fragments", "Ljava/util/List;", "Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", BadgeRankFragment.BADGE_TYPE, "Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", "<init>", "()V", "Companion", "BadgeType", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
public final class BadgeRankFragment extends p527o0o0OO0o.o000O<m2> {
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

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v3 com.yalla.yalla.ui.fragment.BadgeRankFragment$BadgeType[], still in use, count: 1, list:
      (r2v3 com.yalla.yalla.ui.fragment.BadgeRankFragment$BadgeType[]) from 0x0021: INVOKE (r2v3 com.yalla.yalla.ui.fragment.BadgeRankFragment$BadgeType[]) STATIC call: kotlin.enums.EnumEntriesKt.enumEntries(java.lang.Enum[]):kotlin.enums.EnumEntries A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>[]):kotlin.enums.EnumEntries<E extends java.lang.Enum<E>> (m), WRAPPED] (LINE:34)
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
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/fragment/BadgeRankFragment$BadgeType;", "", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/String;", "OooO00o", "()Ljava/lang/String;", "GlobalType", "FriendType", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
    public static final class BadgeType {
        GlobalType("global"),
        FriendType("friend");

        private static final /* synthetic */ EnumEntries $ENTRIES;

        @NotNull
        private final String value;

        static {
            $ENTRIES = EnumEntriesKt.enumEntries(badgeTypeArr);
        }

        public BadgeType(String str) {
            super(str, i);
            this.value = str;
        }

        public static BadgeType valueOf(String str) {
            return (BadgeType) Enum.valueOf(BadgeType.class, str);
        }

        public static BadgeType[] values() {
            return (BadgeType[]) $VALUES.clone();
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
        BadgeRankDataFragment.Companion companion = BadgeRankDataFragment.INSTANCE;
        BadgeType badgeType = this.badgeType;
        BadgeRankDataFragment badgeRankDataFragment = null;
        if (badgeType == null) {
            Intrinsics.throwUninitializedPropertyAccessException(BADGE_TYPE);
            badgeType = null;
        }
        BadgeRankDataFragment.BadgeRank badgeRank = BadgeRankDataFragment.BadgeRank.TotalRank;
        companion.getClass();
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
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        getBinding().f44164OooO0OO.setAdapter(new oO0o0000(childFragmentManager, this.fragments));
        getBinding().f44164OooO0OO.setOffscreenPageLimit(1);
        Context context = getBinding().f44163OooO0O0.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Intrinsics.checkNotNullParameter(context, "context");
        o0oOo00O.o0O0O00.OooO00o oooO00o = new o0oOo00O.o0O0O00.OooO00o(context);
        oooO00o.f56259OooO0OO = 14.0f;
        oooO00o.f56260OooO0Oo = 14.0f;
        oooO00o.OooO0O0(CollectionsKt.mutableListOf(com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.user_badge_rank_table_total), com.code.android.util.o0000.OooO0OO(p562o0oOo000.o000000.user_badge_rank_table_quarter)));
        int i = p562o0oOo000.o0OOO0o.white;
        oooO00o.f56262OooO0o0 = com.code.android.util.o0000.OooO00o(i);
        oooO00o.f56264OooO0oo = com.code.android.util.o0000.OooO00o(p562o0oOo000.o0OOO0o.color_white_70);
        ViewPagerFixed vpRank = getBinding().f44164OooO0OO;
        Intrinsics.checkNotNullExpressionValue(vpRank, "vpRank");
        oooO00o.OooO0Oo(vpRank);
        oooO00o.f56257OooO00o.setAdjustMode(true);
        oooO00o.f56265OooOO0 = com.code.android.util.o0000.OooO00o(i);
        oooO00o.f56256OooO = com.code.android.util.o0000O0.OooO00o(2);
        oooO00o.f56266OooOO0O = com.code.android.util.o0000O0.OooO00o(15);
        oooO00o.f56267OooOO0o = com.code.android.util.o0000O0.OooO00o(3);
        YlTableLayout tlRank = getBinding().f44163OooO0O0;
        Intrinsics.checkNotNullExpressionValue(tlRank, "tlRank");
        oooO00o.OooO00o(tlRank);
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

    @Override // p527o0o0OO0o.o000O
    @NotNull
    public m2 getViewBinding(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        m2 m2VarInflate = m2.inflate(getLayoutInflater());
        Intrinsics.checkNotNullExpressionValue(m2VarInflate, "inflate(...)");
        return m2VarInflate;
    }
}
