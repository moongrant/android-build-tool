package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.annotation.CallSuper;
import java.util.LinkedHashMap;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p004OooO0oO.o000oOoO;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"TypeParameterUnusedInFormals"})
@SourceDebugExtension({"SMAP\nNavigatorProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorProvider.kt\nandroidx/navigation/NavigatorProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,183:1\n1#2:184\n*E\n"})
public final class OooOOOO {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final LinkedHashMap f6915OooO0O0 = new LinkedHashMap();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f6916OooO00o = new LinkedHashMap();

    public static final class OooO00o {
        @JvmStatic
        @NotNull
        public static String OooO00o(@NotNull Class navigatorClass) {
            Intrinsics.checkNotNullParameter(navigatorClass, "navigatorClass");
            LinkedHashMap linkedHashMap = OooOOOO.f6915OooO0O0;
            String strValue = (String) linkedHashMap.get(navigatorClass);
            if (strValue == null) {
                Navigator.Name name = (Navigator.Name) navigatorClass.getAnnotation(Navigator.Name.class);
                strValue = name != null ? name.value() : null;
                if (!OooO0O0(strValue)) {
                    throw new IllegalArgumentException("No @Navigator.Name annotation found for ".concat(navigatorClass.getSimpleName()).toString());
                }
                linkedHashMap.put(navigatorClass, strValue);
            }
            Intrinsics.checkNotNull(strValue);
            return strValue;
        }

        public static boolean OooO0O0(@Nullable String str) {
            if (str != null) {
                return str.length() > 0;
            }
            return false;
        }
    }

    @Nullable
    public final void OooO00o(@NotNull Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        String name = OooO00o.OooO00o(navigator.getClass());
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        if (!OooO00o.OooO0O0(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        LinkedHashMap linkedHashMap = this.f6916OooO00o;
        Navigator navigator2 = (Navigator) linkedHashMap.get(name);
        if (Intrinsics.areEqual(navigator2, navigator)) {
            return;
        }
        if (!(!(navigator2 != null && navigator2.f6832OooO0O0))) {
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + navigator2).toString());
        }
        if (!navigator.f6832OooO0O0) {
            return;
        }
        throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
    }

    @CallSuper
    @NotNull
    public final <T extends Navigator<?>> T OooO0O0(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (!OooO00o.OooO0O0(name)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string".toString());
        }
        T t = (T) this.f6916OooO00o.get(name);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException(o000oOoO.OooO00o("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
    }
}
