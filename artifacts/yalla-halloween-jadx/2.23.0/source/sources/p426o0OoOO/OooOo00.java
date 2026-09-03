package p426o0OoOO;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.code.android.util.o000OO00;
import com.yalla.yalla.ui.activity.account.LoginActivity;
import com.yalla.yalla.ui.activity.main.MainActivity;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p435o0OoOOoO.o0O00O;
import p464o0Oooo.o000000O;
import p587o0oOooo.o0OO000;
import p591o0oo000O.OooO;
import p641o0ooOOOO.q3;
import p641o0ooOOOO.r3;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class OooOo00 extends o0O00O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MainActivity f45594OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public r3 f45595OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final q3 f45596OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean isLogin = bool;
            Intrinsics.checkNotNullExpressionValue(isLogin, "isLogin");
            boolean zBooleanValue = isLogin.booleanValue();
            r3 r3Var = null;
            OooOo00 oooOo00 = OooOo00.this;
            if (zBooleanValue) {
                r3 r3Var2 = oooOo00.f45595OooO0o;
                if (r3Var2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                } else {
                    r3Var = r3Var2;
                }
                FrameLayout frameLayout = r3Var.f58717OooO00o;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "loginBinding.root");
                o000OO00.OooO0O0(frameLayout);
            } else {
                r3 r3Var3 = oooOo00.f45595OooO0o;
                if (r3Var3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                    r3Var3 = null;
                }
                FrameLayout frameLayout2 = r3Var3.f58717OooO00o;
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "loginBinding.root");
                o000OO00.OooOOOO(frameLayout2);
                if (OooO.OooO0o0()) {
                    r3 r3Var4 = oooOo00.f45595OooO0o;
                    if (r3Var4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                    } else {
                        r3Var = r3Var4;
                    }
                    r3Var.f58719OooO0OO.setRotationY(180.0f);
                } else {
                    r3 r3Var5 = oooOo00.f45595OooO0o;
                    if (r3Var5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                    } else {
                        r3Var = r3Var5;
                    }
                    r3Var.f58719OooO0OO.setRotationY(0.0f);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f45598OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0OO000.OooO00o("101061");
            OooOo onLogin = OooOo.f45593OooO0Oo;
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o000000O o000000o2 = o000000O.f46674OooO00o;
            if (Intrinsics.areEqual(o000000O.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.getClass();
                Unit unit = Unit.INSTANCE;
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f25186OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f45599OooO0Oo;

        public OooO0OO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f45599OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f45599OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f45599OooO0Oo;
        }

        public final int hashCode() {
            return this.f45599OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f45599OooO0Oo.invoke(obj);
        }
    }

    public OooOo00(@NotNull MainActivity activity, @NotNull q3 binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f45594OooO0Oo = activity;
        this.f45596OooO0o0 = binding;
    }

    @Override // p435o0OoOOoO.o0O00O
    public final void OooO0O0() {
        r3 r3VarOooO00o = r3.OooO00o(this.f45596OooO0o0.f58659OooO0o0.inflate());
        Intrinsics.checkNotNullExpressionValue(r3VarOooO00o, "bind(binding.loginViewStub.inflate())");
        this.f45595OooO0o = r3VarOooO00o;
        o000000O o000000o2 = o000000O.f46674OooO00o;
        o000000O.OooOo0O().observe(this.f45594OooO0Oo, new OooO0OO(new OooO00o()));
        r3 r3Var = this.f45595OooO0o;
        if (r3Var == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
            r3Var = null;
        }
        FrameLayout frameLayout = r3Var.f58718OooO0O0;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "loginBinding.flLogin");
        o000OO00.OooO(frameLayout, OooO0O0.f45598OooO0Oo);
    }
}
