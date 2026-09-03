package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import com.app.base.view.indicator.YlTableLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.BadgeNewsFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p462o0Ooo0o.o0000O00;
import p649o0ooOOoo.hh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeNewsActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "<init>", "()V", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class BadgeNewsActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23293OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(hh.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final List<BadgeNewsFragment> f23294Ooooo00 = new ArrayList();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public BadgeNewsFragment f23295Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    public BadgeNewsFragment f23296OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public BadgeNewsFragment f23297OooooOO;

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    public boolean f23298OooooOo;

    public final hh OooOoo() {
        return (hh) this.f23293OoooOoo.getValue();
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.ui.fragment.BadgeNewsFragment>] */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.ui.fragment.BadgeNewsFragment>] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.ui.fragment.BadgeNewsFragment>] */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.ui.fragment.BadgeNewsFragment>] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.ui.fragment.BadgeNewsFragment>] */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49627OooO00o);
        this.f23298OooooOo = getIntent().getBooleanExtra("openDiamondMedal", false);
        OooOo(R.string.user_badge_moment_toolbar);
        OooOo0O(1);
        List<String> listMutableListOf = CollectionsKt.mutableListOf(o000O0O0.OooO0OO(R.string.user_badge_moment_gold_medal), o000O0O0.OooO0OO(R.string.user_badge_moment_silver_medal), o000O0O0.OooO0OO(R.string.user_badge_moment_bronze_medal));
        BadgeNewsFragment.Companion companion = BadgeNewsFragment.INSTANCE;
        this.f23295Ooooo0o = companion.OooO00o(BadgeNewsFragment.MedalType.GoldMedal);
        this.f23296OooooO0 = companion.OooO00o(BadgeNewsFragment.MedalType.SilverMedal);
        this.f23297OooooOO = companion.OooO00o(BadgeNewsFragment.MedalType.BronzeMedal);
        ?? r3 = this.f23294Ooooo00;
        BadgeNewsFragment badgeNewsFragment = this.f23295Ooooo0o;
        BadgeNewsFragment badgeNewsFragment2 = null;
        if (badgeNewsFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGoldMedalFragment");
            badgeNewsFragment = null;
        }
        r3.add(badgeNewsFragment);
        ?? r4 = this.f23294Ooooo00;
        BadgeNewsFragment badgeNewsFragment3 = this.f23296OooooO0;
        if (badgeNewsFragment3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSilverMedalFragment");
            badgeNewsFragment3 = null;
        }
        r4.add(badgeNewsFragment3);
        ?? r5 = this.f23294Ooooo00;
        BadgeNewsFragment badgeNewsFragment4 = this.f23297OooooOO;
        if (badgeNewsFragment4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mBronzeMedalFragment");
        } else {
            badgeNewsFragment2 = badgeNewsFragment4;
        }
        r5.add(badgeNewsFragment2);
        if (this.f23298OooooOo) {
            this.f23294Ooooo00.add(0, companion.OooO00o(BadgeNewsFragment.MedalType.DiamondMedal));
            listMutableListOf.add(0, o000O0O0.OooO0OO(R.string.user_badge_moment_diamond_medal));
        }
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        OooOoo().f49630OooO0Oo.setAdapter(new o0000O00(supportFragmentManager, this.f23294Ooooo00));
        OooOoo().f49630OooO0Oo.setOffscreenPageLimit(this.f23294Ooooo00.size());
        Intrinsics.checkNotNullParameter(this, "context");
        o00o000O.OooO0O0.OooO00o oooO00o = new o00o000O.OooO0O0.OooO00o(this);
        oooO00o.f32980OooO0Oo = 14.0f;
        oooO00o.f32982OooO0o0 = 14.0f;
        oooO00o.OooO0O0(listMutableListOf);
        oooO00o.f32981OooO0o = o000O0O0.OooO00o(R.color.white);
        oooO00o.f32983OooO0oO = o000O0O0.OooO00o(R.color.color_666666);
        RtlViewPager rtlViewPager = OooOoo().f49630OooO0Oo;
        Intrinsics.checkNotNullExpressionValue(rtlViewPager, "binding.vpMainMoment");
        oooO00o.OooO0OO(rtlViewPager);
        oooO00o.f32978OooO0O0.setAdjustMode(true);
        oooO00o.f32993OooOOo0 = R.drawable.user_shape_badge_moment_table;
        oooO00o.f32976OooO = o000O0O0.OooO00o(R.color.transparent);
        YlTableLayout ylTableLayout = OooOoo().f49628OooO0O0;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tlBadgeTable");
        oooO00o.OooO00o(ylTableLayout);
    }
}
