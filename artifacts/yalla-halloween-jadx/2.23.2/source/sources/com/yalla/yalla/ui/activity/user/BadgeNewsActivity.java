package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.booking.rtlviewpager.RtlViewPager;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
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
import p405o0Oo0OOO.m1;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p563o0oOo00O.o0O0O00;
import p586o0oOooO0.oO0o0000;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeNewsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBadgeNewsActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeNewsActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeNewsActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n*L\n1#1,82:1\n22#2,2:83\n*S KotlinDebug\n*F\n+ 1 BadgeNewsActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeNewsActivity\n*L\n23#1:83,2\n*E\n"})
public final class BadgeNewsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public boolean f26616OooOo;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public BadgeNewsFragment f26617OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    public BadgeNewsFragment f26619OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public BadgeNewsFragment f26620OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26615OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(m1.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ArrayList f26618OooOo00 = new ArrayList();

    public final m1 OooOo() {
        return (m1) this.f26615OooOOoo.getValue();
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44158OooO00o);
        this.f26616OooOo = getIntent().getBooleanExtra("openDiamondMedal", false);
        OooOOoo(o000000.user_badge_moment_toolbar);
        OooOOo0(1);
        List listMutableListOf = CollectionsKt.mutableListOf(o0000.OooO0OO(o000000.user_badge_moment_gold_medal), o0000.OooO0OO(o000000.user_badge_moment_silver_medal), o0000.OooO0OO(o000000.user_badge_moment_bronze_medal));
        BadgeNewsFragment.Companion companion = BadgeNewsFragment.INSTANCE;
        BadgeNewsFragment.MedalType medalType = BadgeNewsFragment.MedalType.GoldMedal;
        companion.getClass();
        this.f26617OooOo0 = BadgeNewsFragment.Companion.OooO00o(medalType);
        this.f26619OooOo0O = BadgeNewsFragment.Companion.OooO00o(BadgeNewsFragment.MedalType.SilverMedal);
        this.f26620OooOo0o = BadgeNewsFragment.Companion.OooO00o(BadgeNewsFragment.MedalType.BronzeMedal);
        ArrayList arrayList = this.f26618OooOo00;
        BadgeNewsFragment badgeNewsFragment = this.f26617OooOo0;
        BadgeNewsFragment badgeNewsFragment2 = null;
        if (badgeNewsFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGoldMedalFragment");
            badgeNewsFragment = null;
        }
        arrayList.add(badgeNewsFragment);
        BadgeNewsFragment badgeNewsFragment3 = this.f26619OooOo0O;
        if (badgeNewsFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSilverMedalFragment");
            badgeNewsFragment3 = null;
        }
        arrayList.add(badgeNewsFragment3);
        BadgeNewsFragment badgeNewsFragment4 = this.f26620OooOo0o;
        if (badgeNewsFragment4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBronzeMedalFragment");
        } else {
            badgeNewsFragment2 = badgeNewsFragment4;
        }
        arrayList.add(badgeNewsFragment2);
        if (this.f26616OooOo) {
            arrayList.add(0, BadgeNewsFragment.Companion.OooO00o(BadgeNewsFragment.MedalType.DiamondMedal));
            listMutableListOf.add(0, o0000.OooO0OO(o000000.user_badge_moment_diamond_medal));
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        OooOo().f44161OooO0Oo.setAdapter(new oO0o0000(supportFragmentManager, arrayList));
        OooOo().f44161OooO0Oo.setOffscreenPageLimit(arrayList.size());
        Intrinsics.checkNotNullParameter(this, "context");
        o0O0O00.OooO00o oooO00o = new o0O0O00.OooO00o(this);
        oooO00o.f56259OooO0OO = 14.0f;
        oooO00o.f56260OooO0Oo = 14.0f;
        oooO00o.OooO0O0(listMutableListOf);
        oooO00o.f56262OooO0o0 = o0000.OooO00o(o0OOO0o.white);
        oooO00o.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_666666);
        RtlViewPager vpMainMoment = OooOo().f44161OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(vpMainMoment, "vpMainMoment");
        oooO00o.OooO0Oo(vpMainMoment);
        oooO00o.f56257OooO00o.setAdjustMode(true);
        oooO00o.f56272OooOOo = o0Oo0oo.user_shape_badge_moment_table;
        oooO00o.f56265OooOO0 = o0000.OooO00o(o0OOO0o.transparent);
        YlTableLayout tlBadgeTable = OooOo().f44159OooO0O0;
        Intrinsics.checkNotNullExpressionValue(tlBadgeTable, "tlBadgeTable");
        oooO00o.OooO00o(tlBadgeTable);
    }
}
