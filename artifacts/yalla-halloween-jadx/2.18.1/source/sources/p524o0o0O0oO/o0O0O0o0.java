package p524o0o0O0oO;

import android.app.Activity;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.app.base.fragment.MainMomentFragment;
import com.umeng.analytics.pro.d;
import com.weieyu.yalla.R;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import com.yalla.yalla.ui.fragment.MessageFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.ui.vm.main.MainVM;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p254o00ooO0O.o00000O;
import p462o0Ooo0o.o0000Ooo;
import p498o0o00Oo0.OooOOO;
import p503o0o00o00.OooO;
import p525o0o0O0oo.o0OO000o;
import p649o0ooOOoo.ha;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O0O0o0 extends o0OO000o {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public OooO<?> f43044OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MainActivity f43045OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public MutableLiveData<Integer> f43046OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f43047OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public MainRoomFragment f43048OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public MainMomentFragment f43049OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public MainExploreFragment f43050OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final OooO0O0 f43051OooOO0O;

    public static final class OooO00o extends Lambda implements Function0<Unit> {
        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0O0O0o0.this.OooO0o(3);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends FragmentManager.OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ ha f43053OooO00o;

        public OooO0O0(ha haVar) {
            this.f43053OooO00o = haVar;
        }

        @Override // androidx.fragment.app.FragmentManager.OooOo00
        public final void onFragmentResumed(@NotNull FragmentManager fm, @NotNull Fragment f) {
            Intrinsics.checkNotNullParameter(fm, "fm");
            Intrinsics.checkNotNullParameter(f, "f");
            super.onFragmentResumed(fm, f);
            this.f43053OooO00o.f49537OooO0o.setBackgroundColor(0);
        }
    }

    public o0O0O0o0(@NotNull MainActivity activity, @NotNull ha binding, @NotNull MainVM vm) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(vm, "vm");
        this.f43045OooO0Oo = activity;
        this.f43047OooO0o0 = -1;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(-1);
        mutableLiveData.observe(activity, new o0O0O0Oo(this, 0));
        this.f43046OooO0o = mutableLiveData;
        this.f43051OooOO0O = new OooO0O0(binding);
    }

    @Override // p525o0o0O0oo.o0OO000o
    public final void OooO00o() {
    }

    @Override // p525o0o0O0oo.o0OO000o
    public final void OooO0O0() {
        int intExtra = this.f43045OooO0Oo.getIntent().getIntExtra("page", -1);
        if (intExtra == -1 || intExtra == 0) {
            OooO0o(0);
        } else if (intExtra == 1) {
            OooO0o(2);
        } else if (intExtra == 2) {
            OooO00o onLogin = new OooO00o();
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            if (Intrinsics.areEqual(OooOOO.f41216OooO00o.OooOooO().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = o00000O.f34254OooO00o.OooO0O0();
                if (activityOooO0O0 != null) {
                    LoginActivity.OooO00o oooO00o = LoginActivity.f21752OooooO0;
                    o0OOO0o.OooO0O0(activityOooO0O0, d.R, activityOooO0O0, LoginActivity.class);
                }
            }
        } else if (intExtra == 3) {
            OooO0o(1);
        }
        this.f43045OooO0Oo.getSupportFragmentManager().OoooOo0(this.f43051OooOO0O, true);
    }

    public final void OooO0o(int i) {
        Fragment fragment;
        if (i == this.f43047OooO0o0) {
            return;
        }
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(this.f43045OooO0Oo.getSupportFragmentManager());
        Intrinsics.checkNotNullExpressionValue(oooO00o, "activity.supportFragmentManager.beginTransaction()");
        if (i != 0) {
            if (i == 1) {
                MainExploreFragment mainExploreFragment = this.f43050OooOO0;
                if (mainExploreFragment == null) {
                    MainExploreFragment mainExploreFragment2 = new MainExploreFragment();
                    this.f43050OooOO0 = mainExploreFragment2;
                    Intrinsics.checkNotNull(mainExploreFragment2);
                    o0000Ooo.OooO00o(oooO00o, R.id.flMain, mainExploreFragment2);
                } else {
                    Intrinsics.checkNotNull(mainExploreFragment);
                    o0000Ooo.OooO0OO(oooO00o, mainExploreFragment);
                }
                MainExploreFragment mainExploreFragment3 = this.f43050OooOO0;
                if (mainExploreFragment3 != null) {
                    mainExploreFragment3.uploadApiStatistical();
                }
            } else if (i == 2) {
                MainMomentFragment mainMomentFragment = this.f43049OooO0oo;
                if (mainMomentFragment == null) {
                    MainMomentFragment mainMomentFragment2 = new MainMomentFragment();
                    this.f43049OooO0oo = mainMomentFragment2;
                    Intrinsics.checkNotNull(mainMomentFragment2);
                    o0000Ooo.OooO00o(oooO00o, R.id.flMain, mainMomentFragment2);
                } else {
                    Intrinsics.checkNotNull(mainMomentFragment);
                    o0000Ooo.OooO0OO(oooO00o, mainMomentFragment);
                }
            } else if (i == 3) {
                OooO<?> oooO = this.f43044OooO;
                if (oooO == null) {
                    MessageFragment messageFragment = new MessageFragment();
                    this.f43044OooO = messageFragment;
                    Intrinsics.checkNotNull(messageFragment);
                    o0000Ooo.OooO00o(oooO00o, R.id.flMain, messageFragment);
                } else {
                    Intrinsics.checkNotNull(oooO);
                    o0000Ooo.OooO0OO(oooO00o, oooO);
                }
            }
        } else {
            MainRoomFragment mainRoomFragment = this.f43048OooO0oO;
            if (mainRoomFragment == null) {
                MainRoomFragment mainRoomFragment2 = new MainRoomFragment();
                this.f43048OooO0oO = mainRoomFragment2;
                Intrinsics.checkNotNull(mainRoomFragment2);
                o0000Ooo.OooO00o(oooO00o, R.id.flMain, mainRoomFragment2);
            } else {
                Intrinsics.checkNotNull(mainRoomFragment);
                o0000Ooo.OooO0OO(oooO00o, mainRoomFragment);
            }
        }
        int i2 = this.f43047OooO0o0;
        if (i2 == 0) {
            fragment = this.f43048OooO0oO;
        } else if (i2 == 1) {
            fragment = this.f43050OooOO0;
        } else if (i2 != 2) {
            fragment = i2 != 3 ? null : this.f43044OooO;
        } else {
            fragment = this.f43049OooO0oo;
        }
        if (fragment != null) {
            o0000Ooo.OooO0O0(oooO00o, fragment);
        }
        oooO00o.OooO0oo();
        this.f43047OooO0o0 = i;
        this.f43046OooO0o.setValue(Integer.valueOf(i));
    }

    @Override // p525o0o0O0oo.o0OO000o
    public final void OooO0o0() {
        super.OooO0o0();
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f43045OooO0Oo.getSupportFragmentManager().ooOO(this.f43051OooOO0O);
            Result.m502constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m502constructorimpl(ResultKt.createFailure(th));
        }
    }
}
