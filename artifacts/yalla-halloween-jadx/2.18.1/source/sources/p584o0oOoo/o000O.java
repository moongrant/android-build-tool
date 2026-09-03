package p584o0oOoo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.OooO0OO;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p021OooOooo.Oooo0;
import p086o000OooO.o000000;
import p086o000OooO.oo0o0Oo;
import p254o00ooO0O.o00000O;
import p254o00ooO0O.o00O000;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class o000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o000O f46945OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Oooo0<Activity, o000000> f46946OooO0O0 = new Oooo0<>();

    @JvmStatic
    public static final void OooO00o(@NotNull o0000O screen, @Nullable Bundle bundle) {
        Bundle arguments;
        Intrinsics.checkNotNullParameter(screen, "screen");
        o00000O o00000o = o00000O.f34254OooO00o;
        if (!(o00000o.OooO0O0() instanceof ScreenNavigationActivity)) {
            o00O000 o00o001 = o00O000.f34346OooO00o;
            Activity activity = o00O000.OooO0O0();
            if (activity != null) {
                ScreenNavigationActivity.OooO00o oooO00o = ScreenNavigationActivity.f24560Oooo0oo;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(screen, "screen");
                Intent intent = new Intent(activity, (Class<?>) ScreenNavigationActivity.class);
                intent.putExtra("screen", screen.getClass().getName());
                intent.putExtra("compose_params", bundle);
                activity.startActivity(intent);
                return;
            }
            return;
        }
        o000000 orDefault = f46946OooO0O0.getOrDefault(o00000o.OooO0O0(), null);
        if (orDefault != null) {
            if (bundle != null) {
                o000OO00.OooO00o(orDefault.OooO0o(), new Bundle());
                NavBackStackEntry navBackStackEntryOooO0o = orDefault.OooO0o();
                if (navBackStackEntryOooO0o != null && (arguments = navBackStackEntryOooO0o.getArguments()) != null) {
                    arguments.putBundle("compose_params_extra", bundle);
                }
            }
            String route = screen.getClass().getName();
            Intrinsics.checkNotNullExpressionValue(route, "screen.javaClass.name");
            Intrinsics.checkNotNullParameter(route, "route");
            Uri uri = Uri.parse(NavDestination.f8629OoooOO0.OooO00o(route));
            Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(uri, "uri");
            oo0o0Oo request = new oo0o0Oo(uri);
            Intrinsics.checkNotNullParameter(request, "request");
            OooO0OO oooO0OO = orDefault.f28454OooO0OO;
            Intrinsics.checkNotNull(oooO0OO);
            NavDestination.OooO0O0 OooO0o1 = oooO0OO.OooO0o0(request);
            if (OooO0o1 == null) {
                throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + orDefault.f28454OooO0OO);
            }
            Bundle bundleOooO0O0 = OooO0o1.f8640Oooo0o.OooO0O0(OooO0o1.f8641Oooo0oO);
            if (bundleOooO0O0 == null) {
                bundleOooO0O0 = new Bundle();
            }
            NavDestination navDestination = OooO0o1.f8640Oooo0o;
            Intent intent2 = new Intent();
            intent2.setDataAndType(uri, null);
            intent2.setAction(null);
            bundleOooO0O0.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
            orDefault.OooOO0o(navDestination, bundleOooO0O0, null, null);
        }
    }

    public static final void OooO0O0() {
        Activity activityOooO0O0;
        o00000O o00000o = o00000O.f34254OooO00o;
        if (o00000o.OooO0O0() instanceof ScreenNavigationActivity) {
            o000000 orDefault = f46946OooO0O0.getOrDefault(o00000o.OooO0O0(), null);
            if (orDefault == null) {
                Activity activityOooO0O1 = o00000o.OooO0O0();
                if (activityOooO0O1 != null) {
                    activityOooO0O1.finish();
                    return;
                }
                return;
            }
            if (orDefault.OooOOO0() || (activityOooO0O0 = o00000o.OooO0O0()) == null) {
                return;
            }
            activityOooO0O0.finish();
        }
    }

    public static final void OooO0OO(@NotNull o0000O screen) {
        Activity activityOooO0O0;
        Intrinsics.checkNotNullParameter(screen, "screen");
        o00000O o00000o = o00000O.f34254OooO00o;
        if (o00000o.OooO0O0() instanceof ScreenNavigationActivity) {
            o000000 orDefault = f46946OooO0O0.getOrDefault(o00000o.OooO0O0(), null);
            if (orDefault == null) {
                Activity activityOooO0O1 = o00000o.OooO0O0();
                if (activityOooO0O1 != null) {
                    activityOooO0O1.finish();
                    return;
                }
                return;
            }
            if (orDefault.f28458OooO0oO.size() >= 1 && Intrinsics.areEqual(screen.OooO0Oo(), orDefault.f28458OooO0oO.get(1).getDestination().f8634OoooO)) {
                Activity activityOooO0O2 = o00000o.OooO0O0();
                if (activityOooO0O2 != null) {
                    activityOooO0O2.finish();
                    return;
                }
                return;
            }
            String route = screen.OooO0Oo();
            Intrinsics.checkNotNullParameter(route, "route");
            if ((orDefault.OooOOO(NavDestination.f8629OoooOO0.OooO00o(route).hashCode(), true, false) && orDefault.OooO0O0()) || (activityOooO0O0 = o00000o.OooO0O0()) == null) {
                return;
            }
            activityOooO0O0.finish();
        }
    }
}
