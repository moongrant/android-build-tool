package com.yalla.yalla.ui.activity.user;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.app.base.view.HeaderLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.BaseActivityK;
import com.yalla.yalla.ui.fragment.BadgeRankFragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p143o00OOooo.o00OO00O;
import p254o00ooO0O.o000O0O0;
import p254o00ooO0O.o00O000o;
import p462o0Ooo0o.o0000Ooo;
import p478o0OooooO.oO0OoOO0;
import p566o0oOo00O.o00000O;
import p609o0oo0O0o.o00O00;
import p649o0ooOOoo.ih;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/yalla/yalla/ui/activity/user/BadgeRankActivity;", "Lcom/yalla/yalla/ui/activity/BaseActivityK;", "Landroid/view/View;", ViewHierarchyConstants.VIEW_KEY, "", "onClickNotDouble", "<init>", "()V", "OooO00o", "app_YallaRelease"}, k = 1, mv = {1, 7, 1})
public final class BadgeRankActivity extends BaseActivityK {

    /* JADX INFO: renamed from: OooooOo, reason: collision with root package name */
    @NotNull
    public static final OooO00o f23299OooooOo = new OooO00o();

    /* JADX INFO: renamed from: OoooOoo, reason: collision with root package name */
    @NotNull
    public final o00O000o f23300OoooOoo = new o00O000o(Reflection.getOrCreateKotlinClass(ih.class), this, null);

    /* JADX INFO: renamed from: Ooooo00, reason: collision with root package name */
    @NotNull
    public final ViewModelLazy f23301Ooooo00 = new ViewModelLazy(Reflection.getOrCreateKotlinClass(o00O00.class), new Function0<ViewModelStore>() { // from class: com.yalla.yalla.ui.activity.user.BadgeRankActivity$special$$inlined$viewModels$default$2
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

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public final /* synthetic */ Function0 f23307Oooo0o = null;

        {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            Function0 function0 = this.f23307Oooo0o;
            if (function0 != null && (creationExtras = (CreationExtras) function0.invoke()) != null) {
                return creationExtras;
            }
            CreationExtras defaultViewModelCreationExtras = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    });

    /* JADX INFO: renamed from: Ooooo0o, reason: collision with root package name */
    @Nullable
    public BadgeRankFragment f23302Ooooo0o;

    /* JADX INFO: renamed from: OooooO0, reason: collision with root package name */
    @Nullable
    public BadgeRankFragment f23303OooooO0;

    /* JADX INFO: renamed from: OooooOO, reason: collision with root package name */
    @Nullable
    public BadgeRankFragment f23304OooooOO;

    public static final class OooO00o {
    }

    public /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BadgeRankFragment.BadgeType.values().length];
            iArr[BadgeRankFragment.BadgeType.GlobalType.ordinal()] = 1;
            iArr[BadgeRankFragment.BadgeType.FriendType.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final ih OooOoo() {
        return (ih) this.f23300OoooOoo.getValue();
    }

    public final void OooOooO(boolean z) {
        OooOoo().f49683OooO0OO.setEnabled(!z);
        OooOoo().f49682OooO0O0.setEnabled(z);
    }

    public final void OooOooo(BadgeRankFragment.BadgeType badgeType) {
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(getSupportFragmentManager());
        Intrinsics.checkNotNullExpressionValue(oooO00o, "supportFragmentManager.beginTransaction()");
        BadgeRankFragment badgeRankFragment = this.f23302Ooooo0o;
        if (badgeRankFragment != null) {
            o0000Ooo.OooO0O0(oooO00o, badgeRankFragment);
        }
        int i = OooO0O0.$EnumSwitchMapping$0[badgeType.ordinal()];
        if (i == 1) {
            BadgeRankFragment badgeRankFragment2 = this.f23303OooooO0;
            if (badgeRankFragment2 == null) {
                this.f23303OooooO0 = BadgeRankFragment.INSTANCE.OooO00o(BadgeRankFragment.BadgeType.GlobalType);
                int id = OooOoo().f49684OooO0Oo.getId();
                BadgeRankFragment badgeRankFragment3 = this.f23303OooooO0;
                Intrinsics.checkNotNull(badgeRankFragment3);
                o0000Ooo.OooO00o(oooO00o, id, badgeRankFragment3);
            } else {
                Intrinsics.checkNotNull(badgeRankFragment2);
                o0000Ooo.OooO0OO(oooO00o, badgeRankFragment2);
            }
            OooOoo().f49683OooO0OO.setSelected(true);
            this.f23302Ooooo0o = this.f23303OooooO0;
        } else if (i == 2) {
            BadgeRankFragment badgeRankFragment4 = this.f23304OooooOO;
            if (badgeRankFragment4 == null) {
                this.f23304OooooOO = BadgeRankFragment.INSTANCE.OooO00o(BadgeRankFragment.BadgeType.FriendType);
                int id2 = OooOoo().f49684OooO0Oo.getId();
                BadgeRankFragment badgeRankFragment5 = this.f23304OooooOO;
                Intrinsics.checkNotNull(badgeRankFragment5);
                o0000Ooo.OooO00o(oooO00o, id2, badgeRankFragment5);
            } else {
                Intrinsics.checkNotNull(badgeRankFragment4);
                o0000Ooo.OooO0OO(oooO00o, badgeRankFragment4);
            }
            this.f23302Ooooo0o = this.f23304OooooOO;
        }
        oooO00o.OooO0oO();
    }

    @Override // com.app.base.base.activity.BaseFragmentActivity, o00Oo00.OooO00o
    public void onClickNotDouble(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onClickNotDouble(view);
        if (Intrinsics.areEqual(view, OooOoo().f49683OooO0OO)) {
            OooOooO(true);
            OooOooo(BadgeRankFragment.BadgeType.GlobalType);
        } else if (Intrinsics.areEqual(view, OooOoo().f49682OooO0O0)) {
            OooOooO(false);
            OooOooo(BadgeRankFragment.BadgeType.FriendType);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.app.base.base.activity.BaseFragmentActivity, com.yalla.yalla.ui.activity.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        setContentView(OooOoo().f49681OooO00o);
        Window window = getWindow();
        Intrinsics.checkNotNullExpressionValue(window, "window");
        oO0OoOO0.OooO0Oo(window, 0);
        HeaderLayout headerLayout = this.f11463OoooO;
        if (headerLayout != null) {
            oO0OoOO0.OooO0O0(headerLayout, true, 2);
        }
        View view = OooOoo().f49688OooO0oo;
        Intrinsics.checkNotNullExpressionValue(view, "binding.vBg");
        oO0OoOO0.OooO0OO(view);
        OooOoO0(getString(R.string.user_badge_rank_title));
        HeaderLayout headerLayout2 = this.f11463OoooO;
        if (headerLayout2 != null) {
            headerLayout2.setBackgroundColor(o000O0O0.OooO00o(R.color.transparent));
        }
        HeaderLayout headerLayout3 = this.f11463OoooO;
        if (headerLayout3 != null) {
            headerLayout3.OooOoOO(R.drawable.icon_aristocracy_doubt, new o00000O(this));
        }
        OooOooO(true);
        OooOooo(BadgeRankFragment.BadgeType.GlobalType);
        OooOoo().f49683OooO0OO.setOnClickListener(this);
        OooOoo().f49682OooO0O0.setOnClickListener(this);
        ((o00O00) this.f23301Ooooo00.getValue()).f48345OooO0O0.observe(this, new o00OO00O(this, 5));
    }
}
