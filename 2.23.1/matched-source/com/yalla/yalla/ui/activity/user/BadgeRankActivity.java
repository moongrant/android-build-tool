package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.code.android.util.o0000;
import com.code.android.util.o000O0;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.BadgeRankFragment;
import com.yalla.yalla.ui.view.HeaderLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p381o0OOoOOO.o00O00o0;
import p407o0Oo0OOO.o1;
import p459o0Ooo0O.o0000oo;
import p565o0oOo000.o000OOo;
import p565o0oOo000.o0OOO0o;
import p565o0oOo000.o0ooOOo;
import p583o0oOoo.o000O00O;
import p588o0oOooO0.o0O00oO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeRankActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBadgeRankActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeRankActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeRankActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n22#2,2:175\n75#3,13:177\n1#4:190\n*S KotlinDebug\n*F\n+ 1 BadgeRankActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeRankActivity\n*L\n33#1:175,2\n34#1:177,13\n*E\n"})
public final class BadgeRankActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f26622OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public BadgeRankFragment f26624OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public BadgeRankFragment f26626OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public BadgeRankFragment f26627OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26623OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(o1.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26625OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(o000O00O.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.BadgeRankActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelStore invoke() {
            ViewModelStore viewModelStore = this.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.yalla.yalla.ui.activity.user.BadgeRankActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewModelProvider.Factory invoke() {
            ViewModelProvider.Factory defaultViewModelProviderFactory = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }, new Function0<CreationExtras>() { // from class: com.yalla.yalla.ui.activity.user.BadgeRankActivity$special$$inlined$viewModels$default$3

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function0 f26630OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26630OooO0Oo;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    public /* synthetic */ class OooO00o {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeRankFragment.BadgeType.values().length];
            try {
                iArr[BadgeRankFragment.BadgeType.GlobalType.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeRankFragment.BadgeType.FriendType.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final o1 OooOo() {
        return (o1) this.f26623OooOOoo.getValue();
    }

    public final void OooOoO(BadgeRankFragment.BadgeType badgeType) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(supportFragmentManager);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "beginTransaction(...)");
        BadgeRankFragment badgeRankFragment = this.f26624OooOo0;
        if (badgeRankFragment != null) {
            o0O00oO0.OooO0O0(oooO00o, badgeRankFragment);
        }
        int i = OooO00o.$EnumSwitchMapping$0[badgeType.ordinal()];
        if (i == 1) {
            BadgeRankFragment badgeRankFragment2 = this.f26626OooOo0O;
            if (badgeRankFragment2 == null) {
                BadgeRankFragment.Companion companion = BadgeRankFragment.INSTANCE;
                BadgeRankFragment.BadgeType badgeType2 = BadgeRankFragment.BadgeType.GlobalType;
                companion.getClass();
                Intrinsics.checkNotNullParameter(badgeType2, "badgeType");
                BadgeRankFragment badgeRankFragment3 = new BadgeRankFragment();
                Bundle bundle = new Bundle();
                bundle.putString("badgeType", badgeType2.getValue());
                badgeRankFragment3.setArguments(bundle);
                this.f26626OooOo0O = badgeRankFragment3;
                int id = OooOo().f44706OooO0Oo.getId();
                BadgeRankFragment badgeRankFragment4 = this.f26626OooOo0O;
                Intrinsics.checkNotNull(badgeRankFragment4);
                o0O00oO0.OooO00o(oooO00o, id, badgeRankFragment4);
            } else {
                Intrinsics.checkNotNull(badgeRankFragment2);
                o0O00oO0.OooO0OO(oooO00o, badgeRankFragment2);
            }
            OooOo().f44705OooO0OO.setSelected(true);
            this.f26624OooOo0 = this.f26626OooOo0O;
        } else if (i == 2) {
            BadgeRankFragment badgeRankFragment5 = this.f26627OooOo0o;
            if (badgeRankFragment5 == null) {
                BadgeRankFragment.Companion companion2 = BadgeRankFragment.INSTANCE;
                BadgeRankFragment.BadgeType badgeType3 = BadgeRankFragment.BadgeType.FriendType;
                companion2.getClass();
                Intrinsics.checkNotNullParameter(badgeType3, "badgeType");
                BadgeRankFragment badgeRankFragment6 = new BadgeRankFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putString("badgeType", badgeType3.getValue());
                badgeRankFragment6.setArguments(bundle2);
                this.f26627OooOo0o = badgeRankFragment6;
                int id2 = OooOo().f44706OooO0Oo.getId();
                BadgeRankFragment badgeRankFragment7 = this.f26627OooOo0o;
                Intrinsics.checkNotNull(badgeRankFragment7);
                o0O00oO0.OooO00o(oooO00o, id2, badgeRankFragment7);
            } else {
                Intrinsics.checkNotNull(badgeRankFragment5);
                o0O00oO0.OooO0OO(oooO00o, badgeRankFragment5);
            }
            this.f26624OooOo0 = this.f26627OooOo0o;
        }
        oooO00o.OooO0o0();
    }

    public final void OooOoO0(boolean z) {
        OooOo().f44705OooO0OO.setEnabled(!z);
        OooOo().f44704OooO0O0.setEnabled(z);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p402o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f44705OooO0OO)) {
            OooOoO0(true);
            OooOoO(BadgeRankFragment.BadgeType.GlobalType);
        } else if (Intrinsics.areEqual(view, OooOo().f44704OooO0O0)) {
            OooOoO0(false);
            OooOoO(BadgeRankFragment.BadgeType.FriendType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44703OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        o00O00o0.OooO0OO(window, 0);
        HeaderLayout headerLayout = this.f22289OooOO0;
        int i = 1;
        if (headerLayout != null) {
            o00O00o0.OooO00o(headerLayout, true, 2);
        }
        View vBg = OooOo().f44710OooO0oo;
        Intrinsics.checkNotNullExpressionValue(vBg, "vBg");
        o00O00o0.OooO0O0(vBg);
        OooOo00(getString(o000OOo.user_badge_rank_title));
        HeaderLayout headerLayout2 = this.f22289OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.setBackgroundColor(o0000.OooO00o(o0ooOOo.transparent));
        }
        HeaderLayout headerLayout3 = this.f22289OooOO0;
        if (headerLayout3 != null) {
            headerLayout3.OooOo(o0OOO0o.icon_aristocracy_doubt, new p505o0o00oO.Oooo0(this));
        }
        OooOoO0(true);
        OooOoO(BadgeRankFragment.BadgeType.GlobalType);
        OooOo().f44705OooO0OO.setOnClickListener(this);
        OooOo().f44704OooO0O0.setOnClickListener(this);
        ((o000O00O) this.f26625OooOo00.getValue()).f56521OooO0O0.observe(this, new o0000oo(i, this));
    }
}
