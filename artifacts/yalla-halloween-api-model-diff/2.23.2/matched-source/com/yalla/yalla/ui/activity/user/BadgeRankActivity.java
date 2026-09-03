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
import p379o0OOoOOO.oOO00O;
import p405o0Oo0OOO.n1;
import p471o0OoooO0.o0O000;
import p506o0o00oOo.oO000O0O;
import p562o0oOo000.o000000;
import p562o0oOo000.o0OOO0o;
import p562o0oOo000.o0Oo0oo;
import p586o0oOooO0.oO0OO0O;
import p588o0oOooOo.a3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeRankActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "Common_YallaRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nBadgeRankActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BadgeRankActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeRankActivity\n+ 2 ViewBindingUtil.kt\ncom/code/android/util/ViewBindingUtilKt\n+ 3 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n22#2,2:175\n75#3,13:177\n1#4:190\n*S KotlinDebug\n*F\n+ 1 BadgeRankActivity.kt\ncom/yalla/yalla/ui/activity/user/BadgeRankActivity\n*L\n33#1:175,2\n34#1:177,13\n*E\n"})
public final class BadgeRankActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooOo, reason: collision with root package name */
    public static final /* synthetic */ int f26621OooOo = 0;

    /* JADX INFO: renamed from: OooOo0, reason: collision with root package name */
    @Nullable
    public BadgeRankFragment f26623OooOo0;

    /* JADX INFO: renamed from: OooOo0O, reason: collision with root package name */
    @Nullable
    public BadgeRankFragment f26625OooOo0O;

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    @Nullable
    public BadgeRankFragment f26626OooOo0o;

    /* JADX INFO: renamed from: OooOOoo, reason: collision with root package name */
    @NotNull
    public final o000O0 f26622OooOOoo = new o000O0(Reflection.getOrCreateKotlinClass(n1.class), this, null);

    /* JADX INFO: renamed from: OooOo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f26624OooOo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(a3.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.BadgeRankActivity$special$$inlined$viewModels$default$2
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
        public final /* synthetic */ Function0 f26629OooO0Oo = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f26629OooO0Oo;
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

    public final n1 OooOo() {
        return (n1) this.f26622OooOOoo.getValue();
    }

    public final void OooOoO(BadgeRankFragment.BadgeType badgeType) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(supportFragmentManager);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "beginTransaction(...)");
        BadgeRankFragment badgeRankFragment = this.f26623OooOo0;
        if (badgeRankFragment != null) {
            oO0OO0O.OooO0O0(oooO00o, badgeRankFragment);
        }
        int i = OooO00o.$EnumSwitchMapping$0[badgeType.ordinal()];
        if (i == 1) {
            BadgeRankFragment badgeRankFragment2 = this.f26625OooOo0O;
            if (badgeRankFragment2 == null) {
                BadgeRankFragment.Companion companion = BadgeRankFragment.INSTANCE;
                BadgeRankFragment.BadgeType badgeType2 = BadgeRankFragment.BadgeType.GlobalType;
                companion.getClass();
                Intrinsics.checkNotNullParameter(badgeType2, "badgeType");
                BadgeRankFragment badgeRankFragment3 = new BadgeRankFragment();
                Bundle bundle = new Bundle();
                bundle.putString("badgeType", badgeType2.getValue());
                badgeRankFragment3.setArguments(bundle);
                this.f26625OooOo0O = badgeRankFragment3;
                int id = OooOo().f44188OooO0Oo.getId();
                BadgeRankFragment badgeRankFragment4 = this.f26625OooOo0O;
                Intrinsics.checkNotNull(badgeRankFragment4);
                oO0OO0O.OooO00o(oooO00o, id, badgeRankFragment4);
            } else {
                Intrinsics.checkNotNull(badgeRankFragment2);
                oO0OO0O.OooO0OO(oooO00o, badgeRankFragment2);
            }
            OooOo().f44187OooO0OO.setSelected(true);
            this.f26623OooOo0 = this.f26625OooOo0O;
        } else if (i == 2) {
            BadgeRankFragment badgeRankFragment5 = this.f26626OooOo0o;
            if (badgeRankFragment5 == null) {
                BadgeRankFragment.Companion companion2 = BadgeRankFragment.INSTANCE;
                BadgeRankFragment.BadgeType badgeType3 = BadgeRankFragment.BadgeType.FriendType;
                companion2.getClass();
                Intrinsics.checkNotNullParameter(badgeType3, "badgeType");
                BadgeRankFragment badgeRankFragment6 = new BadgeRankFragment();
                Bundle bundle2 = new Bundle();
                bundle2.putString("badgeType", badgeType3.getValue());
                badgeRankFragment6.setArguments(bundle2);
                this.f26626OooOo0o = badgeRankFragment6;
                int id2 = OooOo().f44188OooO0Oo.getId();
                BadgeRankFragment badgeRankFragment7 = this.f26626OooOo0o;
                Intrinsics.checkNotNull(badgeRankFragment7);
                oO0OO0O.OooO00o(oooO00o, id2, badgeRankFragment7);
            } else {
                Intrinsics.checkNotNull(badgeRankFragment5);
                oO0OO0O.OooO0OO(oooO00o, badgeRankFragment5);
            }
            this.f26623OooOo0 = this.f26626OooOo0o;
        }
        oooO00o.OooO0o0();
    }

    public final void OooOoO0(boolean z) {
        OooOo().f44187OooO0OO.setEnabled(!z);
        OooOo().f44186OooO0O0.setEnabled(z);
    }

    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, p400o0Oo0O0.OooOO0O
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOo().f44187OooO0OO)) {
            OooOoO0(true);
            OooOoO(BadgeRankFragment.BadgeType.GlobalType);
        } else if (Intrinsics.areEqual(view, OooOo().f44186OooO0O0)) {
            OooOoO0(false);
            OooOoO(BadgeRankFragment.BadgeType.FriendType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.yalla.yalla.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOo().f44185OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "getWindow(...)");
        oOO00O.OooO0OO(window, 0);
        HeaderLayout headerLayout = this.f22282OooOO0;
        int i = 1;
        if (headerLayout != null) {
            oOO00O.OooO00o(headerLayout, true, 2);
        }
        View vBg = OooOo().f44192OooO0oo;
        Intrinsics.checkNotNullExpressionValue(vBg, "vBg");
        oOO00O.OooO0O0(vBg);
        OooOo00(getString(o000000.user_badge_rank_title));
        HeaderLayout headerLayout2 = this.f22282OooOO0;
        if (headerLayout2 != null) {
            headerLayout2.setBackgroundColor(o0000.OooO00o(o0OOO0o.transparent));
        }
        HeaderLayout headerLayout3 = this.f22282OooOO0;
        if (headerLayout3 != null) {
            headerLayout3.OooOo(o0Oo0oo.icon_aristocracy_doubt, new oO000O0O(this));
        }
        OooOoO0(true);
        OooOoO(BadgeRankFragment.BadgeType.GlobalType);
        OooOo().f44187OooO0OO.setOnClickListener(this);
        OooOo().f44186OooO0O0.setOnClickListener(this);
        ((a3) this.f26624OooOo00.getValue()).f57074OooO0O0.observe(this, new o0O000(i, this));
    }
}
