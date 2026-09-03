package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p022Oooo00O.o0OOO0o;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentStrictMode {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final OooO00o f6044OooO00o = OooO00o.f6045OooO0OO;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_WRONG_NESTED_HIERARCHY", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 8, 0})
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final OooO00o f6045OooO0OO = new OooO00o(SetsKt.emptySet(), MapsKt.emptyMap());

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Set<Flag> f6046OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @NotNull
        public final LinkedHashMap f6047OooO0O0;

        public OooO00o(@NotNull Set flags, @NotNull Map allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.f6046OooO00o = flags;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f6047OooO0O0 = linkedHashMap;
        }
    }

    public static OooO00o OooO00o(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                parentFragmentManager.getClass();
            }
            fragment = fragment.getParentFragment();
        }
        return f6044OooO00o;
    }

    public static void OooO0O0(OooO00o oooO00o, Violation violation) {
        Fragment fragment = violation.f6048OooO0Oo;
        String name = fragment.getClass().getName();
        Flag flag = Flag.PENALTY_LOG;
        Set<Flag> set = oooO00o.f6046OooO00o;
        if (set.contains(flag)) {
            Log.d("FragmentStrictMode", "Policy violation in ".concat(name), violation);
        }
        if (set.contains(Flag.PENALTY_DEATH)) {
            o0OOO0o o0ooo0o2 = new o0OOO0o(1, name, violation);
            if (!fragment.isAdded()) {
                o0ooo0o2.run();
                return;
            }
            Handler handler = fragment.getParentFragmentManager().f5822OooOo0.f6035OooO0o;
            Intrinsics.checkNotNullExpressionValue(handler, "fragment.parentFragmentManager.host.handler");
            if (Intrinsics.areEqual(handler.getLooper(), Looper.myLooper())) {
                o0ooo0o2.run();
            } else {
                handler.post(o0ooo0o2);
            }
        }
    }

    public static void OooO0OO(Violation violation) {
        if (FragmentManager.Oooo0O0(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(violation.f6048OooO0Oo.getClass().getName()), violation);
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void OooO0Oo(@NotNull Fragment fragment, @NotNull String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        OooO0OO(fragmentReuseViolation);
        OooO00o OooO00o2 = OooO00o(fragment);
        if (OooO00o2.f6046OooO00o.contains(Flag.DETECT_FRAGMENT_REUSE) && OooO0o0(OooO00o2, fragment.getClass(), FragmentReuseViolation.class)) {
            OooO0O0(OooO00o2, fragmentReuseViolation);
        }
    }

    public static boolean OooO0o0(OooO00o oooO00o, Class cls, Class cls2) {
        Set set = (Set) oooO00o.f6047OooO0O0.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), Violation.class) || !CollectionsKt.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }
}
