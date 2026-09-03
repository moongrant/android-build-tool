package p584o0oOoo;

import android.os.Bundle;
import androidx.compose.runtime.Composable;
import androidx.navigation.NavBackStackEntry;
import com.yalla.yalla.util.ReflectUtils;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import o000O00O.OooO0OO;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p086o000OooO.o000000;
import p100o000oOoO.o;
import p100o000oOoO.o00O000;
import p100o000oOoO.o00OO0O0;
import p100o000oOoO.o00OOOOo;
import p100o000oOoO.o0O0O0o0;
import p100o000oOoO.o0OO000o;
import p100o000oOoO.o0OO0o00;
import p100o000oOoO.oOO00O;
import p100o000oOoO.oo0o0O0;

/* JADX INFO: loaded from: classes3.dex */
public final class o000OO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<NavBackStackEntry> f46954OooO00o = (o00OOOOo) o00OO0O0.OooO0O0(o.f29323OooO00o, OooO00o.f46956Oooo0o);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final o0O0O0o0<o000000> f46955OooO0O0 = (o00OOOOo) o00OO0O0.OooO0O0(o.f29323OooO00o, OooO0O0.f46957Oooo0o);

    public static final class OooO00o extends Lambda implements Function0<NavBackStackEntry> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO00o f46956Oooo0o = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NavBackStackEntry invoke() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("CompositionLocal ");
            sbOooO0o0.append(NavBackStackEntry.INSTANCE);
            sbOooO0o0.append(" not present");
            throw new IllegalStateException(sbOooO0o0.toString().toString());
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o000000> {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final OooO0O0 f46957Oooo0o = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o000000 invoke() {
            throw new IllegalStateException("CompositionLocal LocalNavHostControl not present".toString());
        }
    }

    public static final void OooO00o(@Nullable NavBackStackEntry navBackStackEntry, @Nullable Bundle bundle) {
        if ((navBackStackEntry != null ? navBackStackEntry.getArguments() : null) == null) {
            new ReflectUtils(navBackStackEntry == null ? Object.class : NavBackStackEntry.class, navBackStackEntry).OooO0O0("arguments", bundle);
        }
    }

    @Composable
    @NotNull
    public static final Bundle OooO0O0(@NotNull NavBackStackEntry navBackStackEntry, @Nullable oOO00O ooo00o) {
        Bundle arguments;
        Bundle arguments2;
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        ooo00o.OooO0o0(-724096253);
        Function3<o00O000<?>, o0OO0o00, o0OO000o, Unit> function3 = oo0o0O0.f29705OooO00o;
        o000000 o000000Var = (o000000) ooo00o.OooOO0o(f46955OooO0O0);
        Bundle arguments3 = navBackStackEntry.getArguments();
        NavBackStackEntry navBackStackEntryOooOO0 = o000000Var.OooOO0();
        Bundle arguments4 = navBackStackEntryOooOO0 != null ? navBackStackEntryOooOO0.getArguments() : null;
        ooo00o.OooO0o0(511388516);
        boolean zOooo0oo = ooo00o.Oooo0oo(arguments3) | ooo00o.Oooo0oo(arguments4);
        Object objOooO0o = ooo00o.OooO0o();
        if (zOooo0oo || objOooO0o == oOO00O.OooO00o.f29689OooO0O0) {
            NavBackStackEntry navBackStackEntryOooOO1 = o000000Var.OooOO0();
            if ((navBackStackEntryOooOO1 == null || (arguments2 = navBackStackEntryOooOO1.getArguments()) == null || !arguments2.containsKey("compose_params_extra")) ? false : true) {
                NavBackStackEntry navBackStackEntryOooOO2 = o000000Var.OooOO0();
                Bundle arguments5 = navBackStackEntryOooOO2 != null ? navBackStackEntryOooOO2.getArguments() : null;
                Intrinsics.checkNotNull(arguments5);
                arguments = arguments5.getBundle("compose_params_extra");
                if (arguments == null) {
                    arguments = OooO0OO.OooO00o();
                }
            } else {
                arguments = navBackStackEntry.getArguments();
                if (arguments == null) {
                    arguments = OooO0OO.OooO00o();
                }
            }
            objOooO0o = arguments;
            ooo00o.Oooo00o(objOooO0o);
        }
        ooo00o.Oooo0o0();
        Intrinsics.checkNotNullExpressionValue(objOooO0o, "remember(arguments, loca…undleOf()\n        }\n    }");
        Bundle bundle = (Bundle) objOooO0o;
        ooo00o.Oooo0o0();
        return bundle;
    }
}
