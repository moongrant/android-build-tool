package p086o000OooO;

import OooO0o.OooO0OO;
import android.annotation.SuppressLint;
import androidx.annotation.CallSuper;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"TypeParameterUnusedInFormals"})
public final class o0000 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final OooO00o f28405OooO0O0 = new OooO00o();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Map<Class<?>, String> f28406OooO0OO = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Map<String, Navigator<? extends NavDestination>> f28407OooO00o = new LinkedHashMap();

    public static final class OooO00o {
        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @JvmStatic
        @NotNull
        public final String OooO00o(@NotNull Class<? extends Navigator<?>> navigatorClass) {
            Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
            Map<Class<?>, String> map = o0000.f28406OooO0OO;
            String strValue = map.get(navigatorClass);
            if (strValue == null) {
                Navigator.Name name = (Navigator.Name) navigatorClass.getAnnotation(Navigator.Name.class);
                strValue = name != null ? name.value() : null;
                if (!OooO0O0(strValue)) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("No @Navigator.Name annotation found for ");
                    sbOooO0o0.append(navigatorClass.getSimpleName());
                    throw new IllegalArgumentException(sbOooO0o0.toString().toString());
                }
                map.put(navigatorClass, strValue);
            }
            Intrinsics.checkNotNull(strValue);
            return strValue;
        }

        public final boolean OooO0O0(@Nullable String str) {
            if (str != null) {
                if (str.length() > 0) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>>] */
    @Nullable
    public final Navigator<? extends NavDestination> OooO00o(@NotNull Navigator<? extends NavDestination> navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        OooO00o oooO00o = f28405OooO0O0;
        String name = oooO00o.OooO00o(navigator.getClass());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (!oooO00o.OooO0O0(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        Navigator navigator2 = (Navigator) this.f28407OooO00o.get(name);
        if (Intrinsics.areEqual(navigator2, navigator)) {
            return navigator;
        }
        boolean z = false;
        if (navigator2 != null && navigator2.f8645OooO0O0) {
            z = true;
        }
        if (!(!z)) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        if (!navigator.f8645OooO0O0) {
            return this.f28407OooO00o.put(name, navigator);
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, androidx.navigation.Navigator<? extends androidx.navigation.NavDestination>>] */
    @CallSuper
    @NotNull
    public final <T extends Navigator<?>> T OooO0O0(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!f28405OooO0O0.OooO0O0(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        T t = (T) this.f28407OooO00o.get(name);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(OooO0OO.OooO00o("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
