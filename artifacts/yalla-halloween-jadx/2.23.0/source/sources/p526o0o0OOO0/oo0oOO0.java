package p526o0o0OOO0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.OooO;
import com.code.android.util.OooO0O0;
import com.code.android.util.o000O0;
import com.yalla.yalla.ui.screen.ScreenNavigationActivity;
import com.yalla.yalla.util.ReflectUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.StateFlow;
import o000O00.o00000O;
import o000O00.o0O0O00;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o00Ooo;
import p188o00o0O.OooOO0;
import p592o0oo00O.OooOOO0;

/* JADX INFO: loaded from: classes4.dex */
@StabilityInferred(parameters = 0)
@SourceDebugExtension({"SMAP\nScreenRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenRouter.kt\ncom/yalla/yalla/ui/screen/ScreenRouter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ArrayMap.kt\nandroidx/collection/ArrayMapKt\n*L\n1#1,226:1\n1855#2:227\n1855#2,2:228\n1856#2:230\n1855#2:231\n1856#2:233\n1#3:232\n22#4:234\n*S KotlinDebug\n*F\n+ 1 ScreenRouter.kt\ncom/yalla/yalla/ui/screen/ScreenRouter\n*L\n179#1:227\n181#1:228,2\n179#1:230\n197#1:231\n197#1:233\n56#1:234\n*E\n"})
public final class oo0oOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooOO0<Activity, o00000O> f53618OooO00o = new OooOO0<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f53619OooO0O0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final ArrayList f53620OooO0OO = new ArrayList();

    public static boolean OooO00o(@NotNull o00O00O screen) {
        o00000O orDefault;
        StateFlow<List<NavBackStackEntry>> stateFlow;
        List<NavBackStackEntry> value;
        Intrinsics.checkNotNullParameter(screen, "screen");
        for (Activity activity : CollectionsKt.toList(OooO0O0.f10254OooO00o)) {
            if ((activity instanceof ScreenNavigationActivity) && (orDefault = f53618OooO00o.getOrDefault(activity, null)) != null && (stateFlow = orDefault.f6844OooO) != null && (value = stateFlow.getValue()) != null) {
                Iterator<T> it = value.iterator();
                while (it.hasNext()) {
                    if (Intrinsics.areEqual(((NavBackStackEntry) it.next()).getDestination().f6822OooOO0O, screen.routerName())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void OooO0O0(@NotNull o00O00O screen) {
        NavBackStackEntry navBackStackEntry;
        StateFlow<List<NavBackStackEntry>> stateFlow;
        List<NavBackStackEntry> value;
        Object next;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (OooO00o(screen)) {
            for (Activity activity : CollectionsKt.reversed(CollectionsKt.toList(OooO0O0.f10254OooO00o))) {
                if (activity instanceof ScreenNavigationActivity) {
                    OooOO0<Activity, o00000O> oooOO1 = f53618OooO00o;
                    o00000O orDefault = oooOO1.getOrDefault(activity, null);
                    if (orDefault == null || (stateFlow = orDefault.f6844OooO) == null || (value = stateFlow.getValue()) == null) {
                        navBackStackEntry = null;
                    } else {
                        Iterator<T> it = value.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            }
                            next = it.next();
                        } while (!Intrinsics.areEqual(((NavBackStackEntry) next).getDestination().f6822OooOO0O, screen.routerName()));
                        navBackStackEntry = (NavBackStackEntry) next;
                    }
                    if (navBackStackEntry != null) {
                        o00000O orDefault2 = oooOO1.getOrDefault(activity, null);
                        if (orDefault2 != null) {
                            androidx.navigation.OooO0O0.OooOO0o(orDefault2, screen.routerName(), false);
                            return;
                        }
                        return;
                    }
                    activity.finish();
                } else {
                    activity.finish();
                }
            }
        }
    }

    @Nullable
    public static String OooO0OO(@NotNull ScreenNavigationActivity activity) {
        NavDestination destination;
        String str;
        StateFlow<List<NavBackStackEntry>> stateFlow;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(activity, "activity");
        o00000O orDefault = f53618OooO00o.getOrDefault(activity, null);
        List<NavBackStackEntry> value = (orDefault == null || (stateFlow = orDefault.f6844OooO) == null) ? null : stateFlow.getValue();
        if (value == null || value.isEmpty()) {
            return null;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt.getOrNull(value, value.size() - 1);
        return (navBackStackEntry == null || (destination = navBackStackEntry.getDestination()) == null || (str = destination.f6822OooOO0O) == null) ? "" : str;
    }

    @JvmStatic
    public static final void OooO0Oo(@NotNull String name, @Nullable Bundle bundle, boolean z, @Nullable Function1<Object, Unit> function1) {
        Bundle bundleOooO00o;
        Intrinsics.checkNotNullParameter(name, "name");
        boolean z2 = OooO0O0.OooO0O0() instanceof ScreenNavigationActivity;
        LinkedHashMap linkedHashMap = f53619OooO0O0;
        if (!z2 || z) {
            Context context = o000O0.f10354OooO00o;
            Activity activity = OooO0O0.OooO0O0();
            if (activity != null) {
                if (bundle == null) {
                    bundle = o00Ooo.OooO00o();
                }
                if (function1 != null) {
                    String string = UUID.randomUUID().toString();
                    Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                    bundle.putString("compose_params_result_key", string);
                }
                int i = ScreenNavigationActivity.f29156OooO0oo;
                Intrinsics.checkNotNullParameter(activity, "activity");
                Intrinsics.checkNotNullParameter(name, "name");
                Intent intent = new Intent(activity, (Class<?>) ScreenNavigationActivity.class);
                intent.putExtra("screen", name);
                intent.putExtra("compose_params", bundle);
                activity.startActivity(intent);
                return;
            }
            return;
        }
        o00000O orDefault = f53618OooO00o.getOrDefault(OooO0O0.OooO0O0(), null);
        if (orDefault != null) {
            ArrayDeque<NavBackStackEntry> arrayDeque = orDefault.f6851OooO0oO;
            NavBackStackEntry navBackStackEntryLastOrNull = arrayDeque.lastOrNull();
            Bundle bundle2 = new Bundle();
            ProvidableCompositionLocal<NavBackStackEntry> providableCompositionLocal = o00O.f53592OooO00o;
            if ((navBackStackEntryLastOrNull != null ? navBackStackEntryLastOrNull.getArguments() : null) == null) {
                new ReflectUtils(navBackStackEntryLastOrNull == null ? Object.class : NavBackStackEntry.class, navBackStackEntryLastOrNull).OooO0O0(bundle2, "immutableArgs");
            }
            if (bundle == null) {
                bundle = o00Ooo.OooO00o();
            }
            if (function1 != null) {
                String string2 = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string2, "randomUUID().toString()");
                bundle.putString("compose_params_result_key", string2);
            }
            NavBackStackEntry navBackStackEntryLastOrNull2 = arrayDeque.lastOrNull();
            if (navBackStackEntryLastOrNull2 != null && (bundleOooO00o = o00O.OooO00o(navBackStackEntryLastOrNull2)) != null) {
                bundleOooO00o.putBundle("compose_params", bundle);
            }
            Intrinsics.checkNotNullParameter(name, "route");
            int i2 = NavDestination.f6814OooOO0o;
            Uri uri = Uri.parse(NavDestination.OooO00o.OooO00o(name));
            Intrinsics.checkExpressionValueIsNotNull(uri, "Uri.parse(this)");
            Intrinsics.checkNotNullParameter(uri, "uri");
            Intrinsics.checkNotNullParameter(uri, "uri");
            o0O0O00 request = new o0O0O00(null, uri, null);
            Intrinsics.checkNotNullParameter(request, "request");
            OooO oooO = orDefault.f6847OooO0OO;
            if (oooO == null) {
                throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + orDefault + '.').toString());
            }
            Intrinsics.checkNotNull(oooO);
            NavDestination.OooO0O0 OooO0o1 = oooO.OooO0o0(request);
            if (OooO0o1 == null) {
                throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + orDefault.f6847OooO0OO);
            }
            NavDestination navDestination = OooO0o1.f6825OooO0Oo;
            Bundle bundleOooO0O0 = navDestination.OooO0O0(OooO0o1.f6827OooO0o0);
            if (bundleOooO0O0 == null) {
                bundleOooO0O0 = new Bundle();
            }
            Intent intent2 = new Intent();
            intent2.setDataAndType(uri, null);
            intent2.setAction(null);
            bundleOooO0O0.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
            orDefault.OooOO0(navDestination, bundleOooO0O0, null, null);
        }
    }

    public static void OooO0o(@Nullable Object obj) {
        String string;
        NavBackStackEntry navBackStackEntryOooO0oo;
        Bundle bundleOooO00o;
        Activity activityOooO0O0 = OooO0O0.OooO0O0();
        if (activityOooO0O0 instanceof ScreenNavigationActivity) {
            OooOO0<Activity, o00000O> oooOO1 = f53618OooO00o;
            Bundle bundleExtra = null;
            o00000O orDefault = oooOO1.getOrDefault(OooO0O0.OooO0O0(), null);
            if ((orDefault != null ? orDefault.OooO0oo() : null) != null) {
                o00000O orDefault2 = oooOO1.getOrDefault(OooO0O0.OooO0O0(), null);
                if (orDefault2 != null && (navBackStackEntryOooO0oo = orDefault2.OooO0oo()) != null && (bundleOooO00o = o00O.OooO00o(navBackStackEntryOooO0oo)) != null) {
                    bundleExtra = bundleOooO00o.getBundle("compose_params");
                }
            } else {
                bundleExtra = ((ScreenNavigationActivity) activityOooO0O0).getIntent().getBundleExtra("compose_params");
            }
            if (bundleExtra != null && (string = bundleExtra.getString("compose_params_result_key")) != null) {
                OooOOO0.OooO0OO("21212a", "get resultKey = ".concat(string));
                if (!StringsKt.isBlank(string)) {
                    LinkedHashMap linkedHashMap = f53619OooO0O0;
                    Function1 function1 = (Function1) linkedHashMap.get(string);
                    if (function1 != null) {
                    }
                    linkedHashMap.remove(string);
                }
            }
        }
        Activity activityOooO0O1 = OooO0O0.OooO0O0();
        if (activityOooO0O1 != null) {
            activityOooO0O1.onBackPressed();
        }
    }

    public static void OooO0o0(o00O00O screen, Bundle bundle, boolean z, Function1 function1, int i) {
        if ((i & 2) != 0) {
            bundle = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            function1 = null;
        }
        Intrinsics.checkNotNullParameter(screen, "screen");
        OooO0Oo(screen.routerName(), bundle, z, function1);
    }

    public static void OooO0oO(@NotNull o00O00O screen) {
        Activity activityOooO0O0;
        Intrinsics.checkNotNullParameter(screen, "screen");
        if (OooO0O0.OooO0O0() instanceof ScreenNavigationActivity) {
            o00000O orDefault = f53618OooO00o.getOrDefault(OooO0O0.OooO0O0(), null);
            if (orDefault == null) {
                Activity activityOooO0O1 = OooO0O0.OooO0O0();
                if (activityOooO0O1 != null) {
                    activityOooO0O1.finish();
                    return;
                }
                return;
            }
            List<NavBackStackEntry> value = orDefault.f6844OooO.getValue();
            if ((!value.isEmpty()) && Intrinsics.areEqual(screen.routerName(), value.get(1).getDestination().f6822OooOO0O)) {
                Activity activityOooO0O2 = OooO0O0.OooO0O0();
                if (activityOooO0O2 != null) {
                    activityOooO0O2.finish();
                    return;
                }
                return;
            }
            if (androidx.navigation.OooO0O0.OooOO0o(orDefault, screen.routerName(), true) || (activityOooO0O0 = OooO0O0.OooO0O0()) == null) {
                return;
            }
            activityOooO0O0.finish();
        }
    }

    public static void OooO0oo(@NotNull o00O00O screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        f53620OooO0OO.add(screen);
    }
}
