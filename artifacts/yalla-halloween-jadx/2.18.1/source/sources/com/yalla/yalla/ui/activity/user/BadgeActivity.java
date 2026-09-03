package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.app.base.view.indicator.YlTableLayout;
import com.booking.rtlviewpager.RtlViewPager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.weieyu.yalla.R;
import com.yalla.support.common.util.o00O0O;
import com.yalla.yalla.model.BadgeBannerModel;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.view.MarqueeRecyclerView;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.user.BadgeVM;
import com.yalla.yalla.util.netimage.NetImageView;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p159o00OoOO.o000O;
import p176o00OoooO.oO00o000;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p391o0OOooOo.o0O00000;
import p462o0Ooo0o.o0000O00;
import p566o0oOo00O.o00000;
import p566o0oOo00O.o000000O;
import p566o0oOo00O.o00000O0;
import p616o0oo0Ooo.oO0O00;
import p649o0ooOOoo.gh;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class BadgeActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23283OooooOo = new OooO00o();

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    public p188o00o00o0.OooO0OO<BadgeBannerModel> f23286Ooooo0o;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    public BadgeFragment f23288OooooOO;

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23284OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(gh.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23285Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BadgeVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.BadgeActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new OooO0O0(), new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.BadgeActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23291Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23291Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @NotNull
    public final List<BadgeFragment> f23287OooooO0 = new ArrayList();

    public static final class OooO00o {
        public static /* synthetic */ void OooO0O0(Context context, long j, String str, String str2, String str3) {
            BadgeActivity.f23283OooooOo.OooO00o(context, j, str, str2, str3, false);
        }

        public final void OooO00o(@NotNull Context context, long j, @NotNull String userName, @NotNull String userImageUrl, @NotNull String medal, boolean z) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(userName, "userName");
            Intrinsics.checkNotNullParameter(userImageUrl, "userImageUrl");
            Intrinsics.checkNotNullParameter(medal, "medal");
            Intent intent = new Intent(context, (Class<?>) BadgeActivity.class);
            intent.putExtra("USER_ID", j);
            intent.putExtra("USER_NAME", userName);
            intent.putExtra("USER_IMAGE_URL", userImageUrl);
            intent.putExtra("USER_MEDAL", medal);
            intent.putExtra("IS_HONOR", z);
            context.startActivity(intent);
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<ViewModelProvider.Factory> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            return new com.yalla.yalla.ui.activity.user.OooO00o(BadgeActivity.this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BadgeVM OooOoo() {
        return (BadgeVM) this.f23285Ooooo00.getValue();
    }

    public final gh OooOooO() {
        return (gh) this.f23284OoooOoo.getValue();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOooO().f49495OooO0O0.f49901OooO0Oo)) {
            o0O00000.OooO0OO("Badge_viewAll");
            Boolean value = p498o0o00Oo0.OooOOO.f41216OooO00o.OooOO0o().getValue();
            Intrinsics.checkNotNullParameter(this, "context");
            Intent intent = new Intent(this, (Class<?>) BadgeNewsActivity.class);
            intent.putExtra("openDiamondMedal", value != null ? value.booleanValue() : false);
            startActivity(intent);
            return;
        }
        if (Intrinsics.areEqual(view, OooOooO().f49495OooO0O0.f49899OooO0O0)) {
            UserInfoActivity.OooO00o.OooO0Oo(UserInfoActivity.f23452o0ooOO0, this, String.valueOf(OooOoo().getCurrentId()), false, 12);
            return;
        }
        if (!Intrinsics.areEqual(view, OooOooO().f49495OooO0O0.f49904OooO0oO)) {
            if (Intrinsics.areEqual(view, OooOooO().f49497OooO0Oo)) {
                o0O00000.OooO0OO("Badge_myBadge");
                p498o0o00Oo0.OooOOO oooOOO = p498o0o00Oo0.OooOOO.f41216OooO00o;
                Long value2 = oooOOO.OooOo().getValue();
                if (value2 == null) {
                    value2 = 0L;
                }
                OooO00o.OooO0O0(this, value2.longValue(), String.valueOf(oooOOO.OooOoO().getValue()), String.valueOf(oooOOO.OooO0oo().getValue()), String.valueOf(oooOOO.OooOO0O().getValue()));
                return;
            }
            return;
        }
        o0O00000.OooO0OO("Badge_wearBadge");
        List<BadgeDataModel> value3 = OooOoo().getAchievementList().getValue();
        List<BadgeDataModel> value4 = OooOoo().getHonorList().getValue();
        if (value3 == null || value4 == null) {
            return;
        }
        ArrayList badgeList = new ArrayList();
        badgeList.addAll(value3);
        badgeList.addAll(value4);
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(badgeList, "badgeList");
        LiveEventBus.get("Wear_badge_page").post(badgeList);
        startActivity(new Intent(this, (Class<?>) BadgeWearActivity.class));
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.ui.fragment.BadgeFragment>] */
    /* JADX WARN: Type inference failed for: r7v40, types: [java.util.ArrayList, java.util.List<com.yalla.yalla.ui.fragment.BadgeFragment>] */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOooO().f49494OooO00o);
        OooOo(R.string.UserInfo_Badge);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            headerLayout.OooOoOO(R.drawable.icon_aristocracy_doubt, new o00000(this));
        }
        this.f23286Ooooo0o = new o000000O(this);
        int i = 4;
        OooOooO().f49495OooO0O0.f49903OooO0o0.post(new androidx.core.widget.OooO(this, 4));
        OooOooO().f49495OooO0O0.f49903OooO0o0.setLayoutManager(new FixLinearLayoutManager(this, 0));
        MarqueeRecyclerView marqueeRecyclerView = OooOooO().f49495OooO0O0.f49903OooO0o0;
        p188o00o00o0.OooO0OO<BadgeBannerModel> oooO0OO = this.f23286Ooooo0o;
        BadgeFragment badgeFragment = null;
        if (oooO0OO == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oooO0OO = null;
        }
        marqueeRecyclerView.setAdapter(oooO0OO);
        OooOoo().getMedalBannerRank().observe(this, new oO00o000(this, i));
        OooOooO().f49495OooO0O0.f49901OooO0Oo.setOnClickListener(this);
        NetImageView netImageView = OooOooO().f49495OooO0O0.f49899OooO0O0;
        oO0O00.OooO00o oooO00o = new oO0O00.OooO00o(this);
        oooO00o.OooO00o(o00OOO.OooO00o.OooO00o());
        oooO00o.f48429OooO0OO = getIntent().getStringExtra("USER_IMAGE_URL");
        oooO00o.f48427OooO00o = 0;
        oooO00o.f48441OooOOOo = R.drawable.icon_head_default;
        oooO00o.OooO0o(netImageView);
        netImageView.setBordTrimSrc(true);
        netImageView.setBorderWidth(com.yalla.support.common.util.OooOo00.OooO00o(2.5f));
        netImageView.setBorderColor(o000O0O0.OooO00o(R.color.color_6ed));
        netImageView.setOnClickListener(this);
        OooOooO().f49495OooO0O0.f49902OooO0o.setText(getIntent().getStringExtra("USER_NAME"));
        OooOooO().f49495OooO0O0.f49900OooO0OO.setShowHolder(true);
        if (OooOoo().getIsFromMe()) {
            p498o0o00Oo0.OooOOO.f41216OooO00o.OooOO0O().observe(this, new o000O(this, 5));
        } else {
            OooOooO().f49495OooO0O0.f49900OooO0OO.OooO0O0(getIntent().getStringExtra("USER_MEDAL"), this);
        }
        AppCompatTextView appCompatTextView = OooOooO().f49495OooO0O0.f49904OooO0oO;
        boolean zIsFromMe = OooOoo().getIsFromMe();
        Intrinsics.checkNotNullExpressionValue(appCompatTextView, "");
        if (zIsFromMe) {
            o00O0O.OooO(appCompatTextView);
        } else {
            o00O0O.OooO00o(appCompatTextView);
        }
        appCompatTextView.setOnClickListener(this);
        Objects.requireNonNull(BadgeFragment.INSTANCE);
        BadgeFragment badgeFragment2 = new BadgeFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("HONOR_BADGE", true);
        badgeFragment2.setArguments(bundle2);
        this.f23288OooooOO = badgeFragment2;
        BadgeFragment badgeFragment3 = new BadgeFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("HONOR_BADGE", false);
        badgeFragment3.setArguments(bundle3);
        this.f23287OooooO0.add(badgeFragment3);
        ?? r7 = this.f23287OooooO0;
        BadgeFragment badgeFragment4 = this.f23288OooooOO;
        if (badgeFragment4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("honorFragment");
        } else {
            badgeFragment = badgeFragment4;
        }
        r7.add(badgeFragment);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        OooOooO().f49498OooO0o0.setAdapter(new o0000O00(supportFragmentManager, this.f23287OooooO0));
        OooOooO().f49498OooO0o0.setOffscreenPageLimit(2);
        OooOooO().f49498OooO0o0.OooO0O0(new o00000O0());
        Intrinsics.checkNotNullParameter(this, "context");
        o00o000O.OooO0O0.OooO00o oooO00o2 = new o00o000O.OooO0O0.OooO00o(this);
        oooO00o2.f32993OooOOo0 = R.drawable.user_shape_badge_indicator_bg;
        oooO00o2.f32980OooO0Oo = 14.0f;
        oooO00o2.f32982OooO0o0 = 14.0f;
        oooO00o2.OooO0O0(CollectionsKt.mutableListOf(com.yalla.support.common.util.OooOOO.OooO0OO(R.string.achievement_medal), com.yalla.support.common.util.OooOOO.OooO0OO(R.string.kudos_medal)));
        oooO00o2.f32981OooO0o = o000O0O0.OooO00o(R.color.theme_00c5b8);
        oooO00o2.f32983OooO0oO = o000O0O0.OooO00o(R.color.color_f5f5f5);
        oooO00o2.f32992OooOOo = 14.0f;
        RtlViewPager rtlViewPager = OooOooO().f49498OooO0o0;
        Intrinsics.checkNotNullExpressionValue(rtlViewPager, "binding.vpMainMoment");
        oooO00o2.OooO0OO(rtlViewPager);
        oooO00o2.f32978OooO0O0.setAdjustMode(true);
        oooO00o2.f32976OooO = o000O0O0.OooO00o(R.color.transparent);
        YlTableLayout ylTableLayout = OooOooO().f49496OooO0OO;
        Intrinsics.checkNotNullExpressionValue(ylTableLayout, "binding.tlBadgeTable");
        oooO00o2.OooO00o(ylTableLayout);
        if (getIntent().getBooleanExtra("IS_HONOR", false)) {
            OooOooO().f49498OooO0o0.setCurrentItem(1);
        }
        AppCompatTextView appCompatTextView2 = OooOooO().f49497OooO0Oo;
        boolean zIsFromMe2 = OooOoo().getIsFromMe();
        Intrinsics.checkNotNullExpressionValue(appCompatTextView2, "");
        if (zIsFromMe2) {
            o00O0O.OooO00o(appCompatTextView2);
        } else {
            o00O0O.OooO(appCompatTextView2);
        }
        appCompatTextView2.setOnClickListener(this);
    }
}
