package p433o0OoOOO0;

import android.app.Activity;
import android.os.Looper;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.MutableLiveData;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import com.yalla.yalla.ui.fragment.MainExploreFragment;
import com.yalla.yalla.ui.fragment.mainroom.MainRoomFragment;
import com.yalla.yalla.ui.fragment.message.MessageFragment;
import com.yalla.yalla.ui.fragment.moment.MainMomentFragment;
import com.yalla.yalla.ui.vm.main.MainVM;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p405o0Oo0OOO.oO0000Oo;
import p432o0OoOOO.o00000O;
import p475o0Ooooo0.o0O00oO0;
import p562o0oOo000.o0OO00O;
import p586o0oOooO0.oO0OO0O;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nMainTabManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MainTabManager.kt\ncom/yalla/yalla/manager/main/MainTabManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,512:1\n1#2:513\n*E\n"})
public final class o0000Ooo extends o00000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    @Nullable
    public MessageFragment f46869OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MainActivity f46870OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public final MutableLiveData<Integer> f46871OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public int f46872OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    @Nullable
    public MainRoomFragment f46873OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    @Nullable
    public MainMomentFragment f46874OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    @Nullable
    public MainExploreFragment f46875OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @NotNull
    public final OooO0OO f46876OooOO0O;

    public static final class OooO00o extends Lambda implements Function1<Integer, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Integer num) {
            Integer num2 = num;
            Intrinsics.checkNotNull(num2);
            if (num2.intValue() >= 0) {
                o0000Ooo.this.OooO0Oo(num2.intValue());
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<Unit> {
        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            o0000Ooo.this.OooO0Oo(3);
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO extends FragmentManager.OooOo00 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final /* synthetic */ oO0000Oo f46879OooO00o;

        public OooO0OO(oO0000Oo oo0000oo) {
            this.f46879OooO00o = oo0000oo;
        }

        @Override // androidx.fragment.app.FragmentManager.OooOo00
        public final void onFragmentResumed(@NotNull FragmentManager fm, @NotNull Fragment f) {
            Intrinsics.checkNotNullParameter(fm, "fm");
            Intrinsics.checkNotNullParameter(f, "f");
            super.onFragmentResumed(fm, f);
            this.f46879OooO00o.f44750OooO0o.setBackgroundColor(0);
        }
    }

    public o0000Ooo(@NotNull MainActivity activity, @NotNull oO0000Oo binding, @NotNull MainVM vm) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(vm, "vm");
        this.f46870OooO0Oo = activity;
        this.f46872OooO0o0 = -1;
        MutableLiveData<Integer> mutableLiveData = new MutableLiveData<>(-1);
        mutableLiveData.observe(activity, new o0000oo.Oooo0(new OooO00o()));
        this.f46871OooO0o = mutableLiveData;
        this.f46876OooOO0O = new OooO0OO(binding);
    }

    @Override // p432o0OoOOO.o00000O
    public final void OooO00o() {
    }

    @Override // p432o0OoOOO.o00000O
    public final void OooO0O0() {
        MainActivity mainActivity = this.f46870OooO0Oo;
        int intExtra = mainActivity.getIntent().getIntExtra("page", -1);
        if (intExtra == -1 || intExtra == 0) {
            OooO0Oo(0);
        } else if (intExtra == 1) {
            OooO0Oo(2);
        } else if (intExtra == 2) {
            OooO0O0 onLogin = new OooO0O0();
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.invoke();
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
        } else if (intExtra == 3) {
            OooO0Oo(1);
        }
        mainActivity.getSupportFragmentManager().OoooOO0(this.f46876OooOO0O, true);
    }

    public final void OooO0OO() {
        Looper.myQueue().removeIdleHandler(this.f46845OooO0OO);
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f46870OooO0Oo.getSupportFragmentManager().OoooooO(this.f46876OooOO0O);
            Result.m4215constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m4215constructorimpl(ResultKt.createFailure(th));
        }
    }

    public final void OooO0Oo(int i) {
        Fragment fragment;
        if (i == this.f46872OooO0o0) {
            return;
        }
        FragmentManager supportFragmentManager = this.f46870OooO0Oo.getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.OooO00o oooO00o = new androidx.fragment.app.OooO00o(supportFragmentManager);
        Intrinsics.checkNotNullExpressionValue(oooO00o, "beginTransaction(...)");
        if (i != 0) {
            if (i == 1) {
                MainExploreFragment mainExploreFragment = this.f46875OooOO0;
                if (mainExploreFragment == null) {
                    MainExploreFragment mainExploreFragment2 = new MainExploreFragment();
                    this.f46875OooOO0 = mainExploreFragment2;
                    int i2 = o0OO00O.flMain;
                    Intrinsics.checkNotNull(mainExploreFragment2);
                    oO0OO0O.OooO00o(oooO00o, i2, mainExploreFragment2);
                } else {
                    Intrinsics.checkNotNull(mainExploreFragment);
                    oO0OO0O.OooO0OO(oooO00o, mainExploreFragment);
                }
                MainExploreFragment mainExploreFragment3 = this.f46875OooOO0;
                if (mainExploreFragment3 != null) {
                    mainExploreFragment3.uploadApiStatistical();
                }
            } else if (i == 2) {
                MainMomentFragment mainMomentFragment = this.f46874OooO0oo;
                if (mainMomentFragment == null) {
                    MainMomentFragment mainMomentFragment2 = new MainMomentFragment();
                    this.f46874OooO0oo = mainMomentFragment2;
                    int i3 = o0OO00O.flMain;
                    Intrinsics.checkNotNull(mainMomentFragment2);
                    oO0OO0O.OooO00o(oooO00o, i3, mainMomentFragment2);
                } else {
                    Intrinsics.checkNotNull(mainMomentFragment);
                    oO0OO0O.OooO0OO(oooO00o, mainMomentFragment);
                }
            } else if (i == 3) {
                MessageFragment messageFragment = this.f46869OooO;
                if (messageFragment == null) {
                    MessageFragment messageFragment2 = new MessageFragment();
                    this.f46869OooO = messageFragment2;
                    int i4 = o0OO00O.flMain;
                    Intrinsics.checkNotNull(messageFragment2);
                    oO0OO0O.OooO00o(oooO00o, i4, messageFragment2);
                } else {
                    Intrinsics.checkNotNull(messageFragment);
                    oO0OO0O.OooO0OO(oooO00o, messageFragment);
                }
            }
        } else {
            MainRoomFragment mainRoomFragment = this.f46873OooO0oO;
            if (mainRoomFragment == null) {
                MainRoomFragment mainRoomFragment2 = new MainRoomFragment();
                this.f46873OooO0oO = mainRoomFragment2;
                int i5 = o0OO00O.flMain;
                Intrinsics.checkNotNull(mainRoomFragment2);
                oO0OO0O.OooO00o(oooO00o, i5, mainRoomFragment2);
            } else {
                Intrinsics.checkNotNull(mainRoomFragment);
                oO0OO0O.OooO0OO(oooO00o, mainRoomFragment);
            }
        }
        int i6 = this.f46872OooO0o0;
        if (i6 == 0) {
            fragment = this.f46873OooO0oO;
        } else if (i6 == 1) {
            fragment = this.f46875OooOO0;
        } else if (i6 != 2) {
            fragment = i6 != 3 ? null : this.f46869OooO;
        } else {
            fragment = this.f46874OooO0oo;
        }
        if (fragment != null) {
            oO0OO0O.OooO0O0(oooO00o, fragment);
        }
        oooO00o.OooO0o();
        this.f46872OooO0o0 = i;
        this.f46871OooO0o.setValue(Integer.valueOf(i));
    }
}
