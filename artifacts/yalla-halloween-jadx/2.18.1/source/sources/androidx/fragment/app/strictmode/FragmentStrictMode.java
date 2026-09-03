package androidx.fragment.app.strictmode;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.fragment.app.strictmode.Violation;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentStrictMode {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final FragmentStrictMode f8532OooO00o = null;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static OooO0O0 f8533OooO0O0 = OooO0O0.f8534OooO0Oo;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 6, 0})
    public enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER
    }

    public interface OooO00o {
        void OooO00o();
    }

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        @JvmField
        @NotNull
        public static final OooO0O0 f8534OooO0Oo = new OooO0O0(SetsKt.emptySet(), MapsKt.emptyMap());

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Set<Flag> f8535OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final OooO00o f8536OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        @NotNull
        public final Map<String, Set<Class<? extends Violation>>> f8537OooO0OO;

        public OooO0O0(@NotNull Set flags, @NotNull Map allowedViolations) {
            Intrinsics.checkNotNullParameter(flags, "flags");
            Intrinsics.checkNotNullParameter(allowedViolations, "allowedViolations");
            this.f8535OooO00o = flags;
            this.f8536OooO0O0 = null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : allowedViolations.entrySet()) {
                linkedHashMap.put((String) entry.getKey(), (Set) entry.getValue());
            }
            this.f8537OooO0OO = linkedHashMap;
        }
    }

    public static final OooO0O0 OooO00o(Fragment fragment) {
        while (fragment != null) {
            if (fragment.isAdded()) {
                FragmentManager parentFragmentManager = fragment.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "declaringFragment.parentFragmentManager");
                Objects.requireNonNull(parentFragmentManager);
            }
            fragment = fragment.getParentFragment();
        }
        return f8533OooO0O0;
    }

    public static final void OooO0O0(final OooO0O0 oooO0O0, final Violation violation) {
        Fragment fragment = violation.f8538Oooo0o;
        final String name = fragment.getClass().getName();
        if (oooO0O0.f8535OooO00o.contains(Flag.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + name, violation);
        }
        if (oooO0O0.f8536OooO0O0 != null) {
            OooO0o0(fragment, new Runnable() { // from class: o000Oo0o.o000oOoO
                @Override // java.lang.Runnable
                public final void run() {
                    FragmentStrictMode.OooO0O0 policy = oooO0O0;
                    Violation violation2 = violation;
                    Intrinsics.checkNotNullParameter(policy, "$policy");
                    Intrinsics.checkNotNullParameter(violation2, "$violation");
                    policy.f8536OooO0O0.OooO00o();
                }
            });
        }
        if (oooO0O0.f8535OooO00o.contains(Flag.PENALTY_DEATH)) {
            OooO0o0(fragment, new Runnable() { // from class: o000Oo0o.o0OoOo0
                @Override // java.lang.Runnable
                public final void run() {
                    String str = name;
                    Violation violation2 = violation;
                    Intrinsics.checkNotNullParameter(violation2, "$violation");
                    Log.e("FragmentStrictMode", "Policy violation with PENALTY_DEATH in " + str, violation2);
                    throw violation2;
                }
            });
        }
    }

    public static final void OooO0OO(Violation violation) {
        if (FragmentManager.Oooo0oO(3)) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("StrictMode violation in ");
            sbOooO0o0.append(violation.f8538Oooo0o.getClass().getName());
            Log.d("FragmentManager", sbOooO0o0.toString(), violation);
        }
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final void OooO0Oo(@NotNull Fragment fragment, @NotNull String previousFragmentId) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(previousFragmentId, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation = new FragmentReuseViolation(fragment, previousFragmentId);
        OooO0OO(fragmentReuseViolation);
        OooO0O0 oooO0O0OooO00o = OooO00o(fragment);
        if (oooO0O0OooO00o.f8535OooO00o.contains(Flag.DETECT_FRAGMENT_REUSE) && OooO0o(oooO0O0OooO00o, fragment.getClass(), fragmentReuseViolation.getClass())) {
            OooO0O0(oooO0O0OooO00o, fragmentReuseViolation);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.util.Set<java.lang.Class<? extends androidx.fragment.app.strictmode.Violation>>>] */
    public static final boolean OooO0o(OooO0O0 oooO0O0, Class cls, Class cls2) {
        Set set = (Set) oooO0O0.f8537OooO0OO.get(cls.getName());
        if (set == null) {
            return true;
        }
        if (Intrinsics.areEqual(cls2.getSuperclass(), Violation.class) || !CollectionsKt.contains(set, cls2.getSuperclass())) {
            return !set.contains(cls2);
        }
        return false;
    }

    public static final void OooO0o0(Fragment fragment, Runnable runnable) {
        if (!fragment.isAdded()) {
            runnable.run();
            return;
        }
        Handler handler = fragment.getParentFragmentManager().f8306OooOo0.f8530Oooo0oo;
        Intrinsics.checkNotNullExpressionValue(handler, "fragment.parentFragmentManager.host.handler");
        if (Intrinsics.areEqual(handler.getLooper(), Looper.myLooper())) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }
}
