package p532o0o0OOo0;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.navigation.NavBackStackEntry;
import com.yalla.yalla.util.ReflectUtils;
import java.lang.reflect.Field;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p063o0000oO.o000oOoO;
import p105o000oo0o.o00O00OO;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nScreenRouter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScreenRouter.kt\ncom/yalla/yalla/ui/screen/ScreenRouterKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,226:1\n76#2:227\n25#3:228\n1097#4,6:229\n*S KotlinDebug\n*F\n+ 1 ScreenRouter.kt\ncom/yalla/yalla/ui/screen/ScreenRouterKt\n*L\n29#1:227\n40#1:228\n40#1:229,6\n*E\n"})
public final class o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<NavBackStackEntry> f53500OooO00o = CompositionLocalKt.compositionLocalOf$default(null, OooO00o.f53502OooO0Oo, 1, null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<o00O00OO> f53501OooO0O0 = CompositionLocalKt.compositionLocalOf$default(null, OooO0O0.f53503OooO0Oo, 1, null);

    public static final class OooO00o extends Lambda implements Function0<NavBackStackEntry> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO00o f53502OooO0Oo = new OooO00o();

        public OooO00o() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final NavBackStackEntry invoke() {
            throw new IllegalStateException(("CompositionLocal " + NavBackStackEntry.INSTANCE + " not present").toString());
        }
    }

    public static final class OooO0O0 extends Lambda implements Function0<o00O00OO> {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public static final OooO0O0 f53503OooO0Oo = new OooO0O0();

        public OooO0O0() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final o00O00OO invoke() {
            throw new IllegalStateException("CompositionLocal LocalNavHostControl not present".toString());
        }
    }

    public static final Bundle OooO00o(NavBackStackEntry navBackStackEntry) {
        try {
            Field fieldOooO0OO = new ReflectUtils(NavBackStackEntry.class, navBackStackEntry).OooO0OO("immutableArgs");
            fieldOooO0OO.getType();
            Object obj = fieldOooO0OO.get(navBackStackEntry);
            if (obj instanceof Bundle) {
                return (Bundle) obj;
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new ReflectUtils.ReflectException(e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    @Composable
    @NotNull
    public static final Bundle OooO0O0(@NotNull NavBackStackEntry navBackStackEntry, @Nullable Composer composer) {
        Bundle bundleOooO00o;
        Bundle bundle;
        Intent intent;
        Intrinsics.checkNotNullParameter(navBackStackEntry, "<this>");
        composer.startReplaceableGroup(-724096253);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-724096253, 8, -1, "com.yalla.yalla.ui.screen.rememberParams (ScreenRouter.kt:27)");
        }
        o00O00OO o00o00oo2 = (o00O00OO) composer.consume(f53501OooO0O0);
        composer.startReplaceableGroup(-492369756);
        Object objRememberedValue = composer.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            if (o00o00oo2.OooO0oo() == null) {
                Activity activityOooO0O0 = com.code.android.util.OooO0O0.OooO0O0();
                if (activityOooO0O0 == null || (intent = activityOooO0O0.getIntent()) == null) {
                    bundle = null;
                } else {
                    bundle = intent.getBundleExtra("compose_params");
                }
            } else {
                NavBackStackEntry navBackStackEntryOooO0oo = o00o00oo2.OooO0oo();
                if (navBackStackEntryOooO0oo == null || (bundleOooO00o = OooO00o(navBackStackEntryOooO0oo)) == null) {
                    bundle = null;
                } else {
                    bundle = bundleOooO00o.getBundle("compose_params");
                }
            }
            if (bundle == null) {
                bundle = o000oOoO.OooO00o();
            }
            objRememberedValue = bundle;
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        Intrinsics.checkNotNullExpressionValue(objRememberedValue, "remember(...)");
        Bundle bundle2 = (Bundle) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return bundle2;
    }
}
