package p524o0o0O0oO;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import com.umeng.analytics.pro.d;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o00OO0O0.o0OOO0o;
import org.jetbrains.annotations.NotNull;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.oOO00O;
import p391o0OOooOo.o0O00000;
import p498o0o00Oo0.OooOOO;
import p525o0o0O0oo.o0OO000o;
import p649o0ooOOoo.ha;
import p649o0ooOOoo.ia;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
public final class o0O0oo0o extends o0OO000o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MainActivity f43088OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public ia f43089OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final ha f43090OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f43091Oooo0o = new OooO00o();

        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0O00000.OooO0OO("Log_in_anonymous");
            o0oO0O0o onLogin = o0oO0O0o.f43094Oooo0o;
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
            return Unit.INSTANCE;
        }
    }

    public o0O0oo0o(@NotNull MainActivity activity, @NotNull ha binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f43088OooO0Oo = activity;
        this.f43090OooO0o0 = binding;
    }

    @Override // p525o0o0O0oo.o0OO000o
    public final void OooO0O0() {
        ia iaVarOooO00o = ia.OooO00o(this.f43090OooO0o0.f49538OooO0o0.inflate());
        Intrinsics.checkNotNullExpressionValue(iaVarOooO00o, "bind(binding.loginViewStub.inflate())");
        this.f43089OooO0o = iaVarOooO00o;
        OooOOO.f41216OooO00o.OooOooO().observe(this.f43088OooO0Oo, new o0O0O0O(this, 0));
        ia iaVar = this.f43089OooO0o;
        if (iaVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
            iaVar = null;
        }
        FrameLayout frameLayout = iaVar.f49651OooO0O0;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "loginBinding.flLogin");
        oOO00O.OooO0oO(frameLayout, OooO00o.f43091Oooo0o);
    }
}
