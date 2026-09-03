package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import o00O0000.OooO0o;
import org.jetbrains.annotations.NotNull;
import p004OooO0oO.o000oOoO;
import p022Oooo00O.o00O00OO;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "OooO00o", "savedstate_release"}, k = 1, mv = {1, 8, 0})
public final class Recreator implements LifecycleEventObserver {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final OooO0o f11046OooO0Oo;

    public static final class OooO00o implements androidx.savedstate.OooO00o.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final LinkedHashSet f11047OooO00o;

        public OooO00o(@NotNull androidx.savedstate.OooO00o registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.f11047OooO00o = new LinkedHashSet();
            registry.OooO0OO("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.OooO00o.OooO0O0
        @NotNull
        public final Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f11047OooO00o));
            return bundle;
        }
    }

    public Recreator(@NotNull OooO0o owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f11046OooO0Oo = owner;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().removeObserver(this);
        OooO0o oooO0o = this.f11046OooO0Oo;
        Bundle bundleOooO00o = oooO0o.getSavedStateRegistry().OooO00o("androidx.savedstate.Restarter");
        if (bundleOooO00o == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleOooO00o.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(androidx.savedstate.OooO00o.InterfaceC0182OooO00o.class);
                Intrinsics.checkNotNullExpressionValue(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((androidx.savedstate.OooO00o.InterfaceC0182OooO00o) objNewInstance).onRecreated(oooO0o);
                    } catch (Exception e) {
                        throw new RuntimeException(o00O00OO.OooO00o("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(o000oOoO.OooO0O0("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
