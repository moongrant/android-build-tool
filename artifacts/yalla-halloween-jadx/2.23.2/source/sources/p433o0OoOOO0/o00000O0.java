package p433o0OoOOO0;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.Observer;
import com.code.android.util.o000O;
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
import p405o0Oo0OOO.oO0000Oo;
import p405o0Oo0OOO.oO0000o0;
import p432o0OoOOO.o00000O;
import p475o0Ooooo0.o0O00oO0;
import p595o0oo00O.OooOo00;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
public final class o00000O0 extends o00000O {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final MainActivity f46853OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public oO0000o0 f46854OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public final oO0000Oo f46855OooO0o0;

    public static final class OooO00o extends Lambda implements Function1<Boolean, Unit> {
        public OooO00o() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Boolean bool) {
            Boolean bool2 = bool;
            Intrinsics.checkNotNull(bool2);
            boolean zBooleanValue = bool2.booleanValue();
            oO0000o0 oo0000o0 = null;
            o00000O0 o00000o1 = o00000O0.this;
            if (zBooleanValue) {
                oO0000o0 oo0000o1 = o00000o1.f46854OooO0o;
                if (oo0000o1 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                } else {
                    oo0000o0 = oo0000o1;
                }
                FrameLayout frameLayout = oo0000o0.f44754OooO00o;
                Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
                o000O.OooO0O0(frameLayout);
            } else {
                oO0000o0 oo0000o2 = o00000o1.f46854OooO0o;
                if (oo0000o2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                    oo0000o2 = null;
                }
                FrameLayout frameLayout2 = oo0000o2.f44754OooO00o;
                Intrinsics.checkNotNullExpressionValue(frameLayout2, "getRoot(...)");
                o000O.OooOOOO(frameLayout2);
                if (OooOo00.OooO0o0()) {
                    oO0000o0 oo0000o3 = o00000o1.f46854OooO0o;
                    if (oo0000o3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                    } else {
                        oo0000o0 = oo0000o3;
                    }
                    oo0000o0.f44756OooO0OO.setRotationY(180.0f);
                } else {
                    oO0000o0 oo0000o4 = o00000o1.f46854OooO0o;
                    if (oo0000o4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
                    } else {
                        oo0000o0 = oo0000o4;
                    }
                    oo0000o0.f44756OooO0OO.setRotationY(0.0f);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0O0 extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f46857OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(View view) {
            View it = view;
            Intrinsics.checkNotNullParameter(it, "it");
            o0oo0000.OooO00o.OooO0O0("101061");
            o00000O onLogin = o00000O.f46852OooO0Oo;
            Intrinsics.checkNotNullParameter(onLogin, "onLogin");
            o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
            if (Intrinsics.areEqual(o0O00oO0.OooOo0O().getValue(), Boolean.TRUE)) {
                onLogin.getClass();
                Unit unit = Unit.INSTANCE;
            } else {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 != null) {
                    int i = LoginActivity.f24727OooOo0O;
                    LoginActivity.OooO00o.OooO00o(activityOooO0O0);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final class OooO0OO implements Observer, FunctionAdapter {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final /* synthetic */ Function1 f46858OooO0Oo;

        public OooO0OO(Function1 function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f46858OooO0Oo = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof Observer) || !(obj instanceof FunctionAdapter)) {
                return false;
            }
            return Intrinsics.areEqual(this.f46858OooO0Oo, ((FunctionAdapter) obj).getFunctionDelegate());
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f46858OooO0Oo;
        }

        public final int hashCode() {
            return this.f46858OooO0Oo.hashCode();
        }

        @Override // androidx.lifecycle.Observer
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46858OooO0Oo.invoke(obj);
        }
    }

    public o00000O0(@NotNull MainActivity activity, @NotNull oO0000Oo binding) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(binding, "binding");
        this.f46853OooO0Oo = activity;
        this.f46855OooO0o0 = binding;
    }

    @Override // p432o0OoOOO.o00000O
    public final void OooO0O0() {
        oO0000o0 oo0000o0OooO00o = oO0000o0.OooO00o(this.f46855OooO0o0.f44751OooO0o0.inflate());
        Intrinsics.checkNotNullExpressionValue(oo0000o0OooO00o, "bind(...)");
        this.f46854OooO0o = oo0000o0OooO00o;
        o0O00oO0 o0o00oo1 = o0O00oO0.f47936OooO00o;
        o0O00oO0.OooOo0O().observe(this.f46853OooO0Oo, new OooO0OO(new OooO00o()));
        oO0000o0 oo0000o0 = this.f46854OooO0o;
        if (oo0000o0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("loginBinding");
            oo0000o0 = null;
        }
        FrameLayout flLogin = oo0000o0.f44755OooO0O0;
        Intrinsics.checkNotNullExpressionValue(flLogin, "flLogin");
        o000O.OooO(flLogin, OooO0O0.f46857OooO0Oo);
    }
}
