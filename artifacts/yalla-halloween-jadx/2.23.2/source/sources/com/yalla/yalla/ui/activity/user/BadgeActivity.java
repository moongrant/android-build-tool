package com.yalla.yalla.ui.activity.user;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.booking.rtlviewpager.RtlViewPager;
import com.code.android.util.o0000;
import com.code.android.util.o0000O0;
import com.code.android.util.o000O;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.jeremyliao.liveeventbus.LiveEventBus;
import com.yalla.netimage.NetImageView;
import com.yalla.yalla.model.BadgeDataModel;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.activity.user.BadgeActivity;
import com.yalla.yalla.ui.fragment.BadgeFragment;
import com.yalla.yalla.ui.view.HeaderLayout;
import com.yalla.yalla.ui.view.MarqueeRecyclerView;
import com.yalla.yalla.ui.view.indicator.YlTableLayout;
import com.yalla.yalla.ui.view.materialdesign.FixLinearLayoutManager;
import com.yalla.yalla.ui.vm.user.BadgeVM;
import java.util.ArrayList;
import java.util.List;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.l1;
import p475o0Ooooo0.o0O00oO0;
import p506o0o00oOo.oO000;
import p506o0o00oOo.oO0000O;
import p506o0o00oOo.oO0000Oo;
import p506o0o00oOo.oO0000o0;
import p506o0o00oOo.oO000O0;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p562o0oOo000.oo0o0Oo;
import p563o0oOo00O.o0O0O00;
import p586o0oOooO0.oO0o0000;
import p642o0ooOOO0.d1;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBadgeActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,267:1\n22#2,2:268\n75#3,13:270\n*S KotlinDebug\n*F\n+ 1 BadgeActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeActivity\n*L\n47#1:268,2\n48#1:270,13\n*E\n"})
public final class BadgeActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f26604OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    public oO0000O f26606OooOo0;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public BadgeFragment f26609OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26605OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(l1.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26607OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BadgeVM.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.BadgeActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26613OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26613OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @NotNull
    public final ArrayList f26608OooOo0O = new ArrayList();

    public static final class OooO00o {
        public static void OooO00o(@NotNull Context context, long j, @NotNull String userName, @NotNull String userImageUrl, @NotNull String medal, boolean z) {
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

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f26611OooO0Oo;

        public OooO0OO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f26611OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f26611OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f26611OooO0Oo;
        }

        public final int hashCode() {
            return this.f26611OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f26611OooO0Oo.invoke(obj);
        }
    }

    static {
        new OooO00o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final BadgeVM OooOo() {
        return (BadgeVM) this.f26607OooOo00.getValue();
    }

    public final l1 OooOoO0() {
        return (l1) this.f26605OooOOoo.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoO0().f44113OooO0O0.f45387OooO0Oo)) {
            o0oo0000.OooO00o.OooO0O0("105091");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            Boolean bool = (Boolean) ((MutableLiveData) o0O00oO0.f47971Oooo0O0.getValue()).getValue();
            Intrinsics.checkNotNullParameter(this, "context");
            Intent intent = new Intent(this, (Class<?>) BadgeNewsActivity.class);
            intent.putExtra("openDiamondMedal", bool != null ? bool.booleanValue() : false);
            startActivity(intent);
            return;
        }
        if (Intrinsics.areEqual(view, OooOoO0().f44113OooO0O0.f45385OooO0O0)) {
            UserInfoActivity.OooO00o.OooO0OO(UserInfoActivity.f26775Oooo0o, this, String.valueOf(OooOo().getCurrentId()), false, 12);
            return;
        }
        if (!Intrinsics.areEqual(view, OooOoO0().f44113OooO0O0.f45390OooO0oO)) {
            if (Intrinsics.areEqual(view, OooOoO0().f44115OooO0Oo)) {
                o0oo0000.OooO00o.OooO0O0("105094");
                o0O00oO0 o0o00oo2 = o0O00oO0.f47936OooO00o;
                Long l = (Long) o0O00oO0.OooOOo0().getValue();
                if (l == null) {
                    l = 0L;
                }
                OooO00o.OooO00o(this, l.longValue(), String.valueOf(o0O00oO0.OooOOoo().getValue()), String.valueOf(o0O00oO0.OooO().getValue()), String.valueOf(o0O00oO0.OooOO0O().getValue()), false);
                return;
            }
            return;
        }
        o0oo0000.OooO00o.OooO0O0("105093");
        List<BadgeDataModel> value = OooOo().getAchievementList().getValue();
        List<BadgeDataModel> value2 = OooOo().getHonorList().getValue();
        if (value == null || value2 == null) {
            return;
        }
        ArrayList badgeList = new ArrayList();
        badgeList.addAll(value);
        badgeList.addAll(value2);
        Intrinsics.checkNotNullParameter(this, "context");
        Intrinsics.checkNotNullParameter(badgeList, "badgeList");
        LiveEventBus.get("Wear_badge_page").post(badgeList);
        startActivity(new Intent(this, (Class<?>) BadgeWearActivity.class));
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoO0().f44112OooO00o);
        OooOOoo(o000000.UserInfo_Badge);
        HeaderLayout headerLayout = this.f22282OooOO0;
        if (headerLayout != null) {
            headerLayout.OooOo(o0Oo0oo.icon_aristocracy_doubt, new oO000(this));
        }
        this.f26606OooOo0 = new oO0000O(this, oo0o0Oo.user_item_badge_banner);
        OooOoO0().f44113OooO0O0.f45389OooO0o0.post(new Runnable() { // from class: o0o00oOo.oO00000o
            @Override // java.lang.Runnable
            public final void run() {
                int i = BadgeActivity.f26604OooOo;
                BadgeActivity this$0 = this.f50434OooO0Oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                MarqueeRecyclerView rvBanner = this$0.OooOoO0().f44113OooO0O0.f45389OooO0o0;
                Intrinsics.checkNotNullExpressionValue(rvBanner, "rvBanner");
                o000O.OooOO0O(rvBanner, this$0.OooOoO0().f44113OooO0O0.f45389OooO0o0.getMeasuredWidth() - 1);
            }
        });
        OooOoO0().f44113OooO0O0.f45389OooO0o0.setLayoutManager(new FixLinearLayoutManager(this, 0));
        MarqueeRecyclerView marqueeRecyclerView = OooOoO0().f44113OooO0O0.f45389OooO0o0;
        oO0000O oo0000o = this.f26606OooOo0;
        BadgeFragment badgeFragment = null;
        if (oo0000o == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            oo0000o = null;
        }
        marqueeRecyclerView.setAdapter(oo0000o);
        OooOo().getMedalBannerRank().observe(this, new OooO0OO(new oO0000Oo(this)));
        OooOoO0().f44113OooO0O0.f45387OooO0Oo.setOnClickListener(this);
        NetImageView netImageView = OooOoO0().f44113OooO0O0.f45385OooO0O0;
        o0OOo0Oo.Oooo000.OooO00o oooO00o = new o0OOo0Oo.Oooo000.OooO00o(this);
        oooO00o.OooO00o(d1.OooO00o());
        oooO00o.f43126OooO0OO = getIntent().getStringExtra("USER_IMAGE_URL");
        oooO00o.f43124OooO00o = 0;
        oooO00o.f43138OooOOOo = o0Oo0oo.icon_head_default;
        oooO00o.OooO0Oo(netImageView);
        netImageView.setBordTrimSrc(true);
        netImageView.setBorderWidth(o0000O0.OooO00o((float) 2.5d));
        netImageView.setBorderColor(o0000.OooO00o(o0OOO0o.color_6ed));
        netImageView.setOnClickListener(this);
        OooOoO0().f44113OooO0O0.f45388OooO0o.setText(getIntent().getStringExtra("USER_NAME"));
        OooOoO0().f44113OooO0O0.f45386OooO0OO.setShowHolder(true);
        if (OooOo().getIsFromMe()) {
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            o0O00oO0.OooOO0O().observe(this, new OooO0OO(new oO0000o0(this)));
        } else {
            OooOoO0().f44113OooO0O0.f45386OooO0OO.OooO00o(getIntent().getStringExtra("USER_MEDAL"), this);
        }
        AppCompatTextView appCompatTextView = OooOoO0().f44113OooO0O0.f45390OooO0oO;
        boolean zIsFromMe = OooOo().getIsFromMe();
        Intrinsics.checkNotNull(appCompatTextView);
        if (zIsFromMe) {
            o000O.OooOOOO(appCompatTextView);
        } else {
            o000O.OooO0O0(appCompatTextView);
        }
        appCompatTextView.setOnClickListener(this);
        BadgeFragment.INSTANCE.getClass();
        BadgeFragment badgeFragment2 = new BadgeFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("HONOR_BADGE", true);
        badgeFragment2.setArguments(bundle2);
        this.f26609OooOo0o = badgeFragment2;
        BadgeFragment badgeFragment3 = new BadgeFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putBoolean("HONOR_BADGE", false);
        badgeFragment3.setArguments(bundle3);
        ArrayList arrayList = this.f26608OooOo0O;
        arrayList.add(badgeFragment3);
        BadgeFragment badgeFragment4 = this.f26609OooOo0o;
        if (badgeFragment4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("honorFragment");
        } else {
            badgeFragment = badgeFragment4;
        }
        arrayList.add(badgeFragment);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
        OooOoO0().f44116OooO0o0.setAdapter(new oO0o0000(supportFragmentManager, arrayList));
        OooOoO0().f44116OooO0o0.setOffscreenPageLimit(2);
        OooOoO0().f44116OooO0o0.OooO0O0(new oO000O0());
        Intrinsics.checkNotNullParameter(this, "context");
        o0O0O00.OooO00o oooO00o2 = new o0O0O00.OooO00o(this);
        oooO00o2.f56272OooOOo = o0Oo0oo.user_shape_badge_indicator_bg;
        oooO00o2.f56259OooO0OO = 14.0f;
        oooO00o2.f56260OooO0Oo = 14.0f;
        oooO00o2.OooO0O0(CollectionsKt.mutableListOf(o0000.OooO0OO(o000000.achievement_medal), o0000.OooO0OO(o000000.kudos_medal)));
        oooO00o2.f56262OooO0o0 = o0000.OooO00o(o0OOO0o.theme_00c5b8);
        oooO00o2.f56264OooO0oo = o0000.OooO00o(o0OOO0o.color_f5f5f5);
        oooO00o2.f56274OooOOoo = 14.0f;
        RtlViewPager vpMainMoment = OooOoO0().f44116OooO0o0;
        Intrinsics.checkNotNullExpressionValue(vpMainMoment, "vpMainMoment");
        oooO00o2.OooO0Oo(vpMainMoment);
        oooO00o2.f56257OooO00o.setAdjustMode(true);
        oooO00o2.f56265OooOO0 = o0000.OooO00o(o0OOO0o.transparent);
        YlTableLayout tlBadgeTable = OooOoO0().f44114OooO0OO;
        Intrinsics.checkNotNullExpressionValue(tlBadgeTable, "tlBadgeTable");
        oooO00o2.OooO00o(tlBadgeTable);
        if (getIntent().getBooleanExtra("IS_HONOR", false)) {
            OooOoO0().f44116OooO0o0.setCurrentItem(1);
        }
        AppCompatTextView appCompatTextView2 = OooOoO0().f44115OooO0Oo;
        boolean zIsFromMe2 = OooOo().getIsFromMe();
        Intrinsics.checkNotNull(appCompatTextView2);
        if (zIsFromMe2) {
            o000O.OooO0O0(appCompatTextView2);
        } else {
            o000O.OooOOOO(appCompatTextView2);
        }
        appCompatTextView2.setOnClickListener(this);
    }
}
