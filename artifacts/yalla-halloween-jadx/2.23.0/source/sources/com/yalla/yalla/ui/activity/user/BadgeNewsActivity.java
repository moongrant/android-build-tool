package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.booking.rtlviewpager.RtlViewPager;
import com.code.android.util.o0000;
import com.code.android.util.o000O0Oo;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.BadgeNewsFragment;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p553o0oOOoo.o0oO0O0o;
import p584o0oOooO0.oO00O0o;
import p584o0oOooO0.oO00OOo0;
import p584o0oOooO0.oOo00OO0;
import p641o0ooOOOO.x9;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeNewsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBadgeNewsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeNewsActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeNewsActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,82:1\n22#2,2:83\n*S KotlinDebug\n*F\n+ 1 BadgeNewsActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeNewsActivity\n*L\n23#1:83,2\n*E\n"})
public final class BadgeNewsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f27082OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public BadgeNewsFragment f27083OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public BadgeNewsFragment f27085OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public BadgeNewsFragment f27086OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0Oo f27081OooOOoo = new o000O0Oo(Reflection.getOrCreateKotlinClass(x9.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ArrayList f27084OooOo00 = new ArrayList();

    public final x9 OooOo() {
        return (x9) this.f27081OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f59340OooO00o);
        this.f27082OooOo = getIntent().getBooleanExtra("openDiamondMedal", false);
        OooOOoo(oO00OOo0.user_badge_moment_toolbar);
        OooOOo0(1);
        List listMutableListOf = CollectionsKt.mutableListOf(o0000.OooO0OO(oO00OOo0.user_badge_moment_gold_medal), o0000.OooO0OO(oO00OOo0.user_badge_moment_silver_medal), o0000.OooO0OO(oO00OOo0.user_badge_moment_bronze_medal));
        BadgeNewsFragment.Companion companion = BadgeNewsFragment.INSTANCE;
        BadgeNewsFragment.MedalType medalType = BadgeNewsFragment.MedalType.GoldMedal;
        companion.getClass();
        this.f27083OooOo0 = BadgeNewsFragment.Companion.OooO00o(medalType);
        this.f27085OooOo0O = BadgeNewsFragment.Companion.OooO00o(BadgeNewsFragment.MedalType.SilverMedal);
        this.f27086OooOo0o = BadgeNewsFragment.Companion.OooO00o(BadgeNewsFragment.MedalType.BronzeMedal);
        ArrayList arrayList = this.f27084OooOo00;
        BadgeNewsFragment badgeNewsFragment = this.f27083OooOo0;
        BadgeNewsFragment badgeNewsFragment2 = null;
        if (badgeNewsFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGoldMedalFragment");
            badgeNewsFragment = null;
        }
        arrayList.add(badgeNewsFragment);
        BadgeNewsFragment badgeNewsFragment3 = this.f27085OooOo0O;
        if (badgeNewsFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSilverMedalFragment");
            badgeNewsFragment3 = null;
        }
        arrayList.add(badgeNewsFragment3);
        BadgeNewsFragment badgeNewsFragment4 = this.f27086OooOo0o;
        if (badgeNewsFragment4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBronzeMedalFragment");
        } else {
            badgeNewsFragment2 = badgeNewsFragment4;
        }
        arrayList.add(badgeNewsFragment2);
        if (this.f27082OooOo) {
            arrayList.add(0, BadgeNewsFragment.Companion.OooO00o(BadgeNewsFragment.MedalType.DiamondMedal));
            listMutableListOf.add(0, o0000.OooO0OO(oO00OOo0.user_badge_moment_diamond_medal));
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        OooOo().f59343OooO0Oo.setAdapter(new p401o0Oo0OO0.o00Oo0(supportFragmentManager, arrayList));
        OooOo().f59343OooO0Oo.setOffscreenPageLimit(arrayList.size());
        Intrinsics.checkNotNullParameter(this, "context");
        o0oO0O0o.OooO00o oooO00o = new o0oO0O0o.OooO00o(this);
        oooO00o.f56019OooO0OO = 14.0f;
        oooO00o.f56020OooO0Oo = 14.0f;
        oooO00o.OooO0O0(listMutableListOf);
        oooO00o.f56022OooO0o0 = o0000.OooO00o(oO00O0o.white);
        oooO00o.f56024OooO0oo = o0000.OooO00o(oO00O0o.color_666666);
        RtlViewPager rtlViewPager = OooOo().f59343OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(rtlViewPager, "binding.vpMainMoment");
        oooO00o.OooO0Oo(rtlViewPager);
        oooO00o.f56017OooO00o.setAdjustMode(true);
        oooO00o.f56032OooOOo = oOo00OO0.user_shape_badge_moment_table;
        oooO00o.f56025OooOO0 = o0000.OooO00o(oO00O0o.transparent);
        YlTableLayout ylTableLayout = OooOo().f59341OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tlBadgeTable");
        oooO00o.OooO00o(ylTableLayout);
    }
}
