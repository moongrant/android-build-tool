package androidx.savedstate;

import OooO0o.OooO0OO;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p016OooOoO0.OooOo00;
import p094o000o0OO.o00Oo0;
import p094o000o0OO.o0OoOo0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/LifecycleEventObserver;", "OooO00o", "savedstate_release"}, k = 1, mv = {1, 6, 0})
public final class Recreator implements LifecycleEventObserver {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final o00Oo0 f9316Oooo0o;

    public static final class OooO00o implements o0OoOo0.OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Set<String> f9317OooO00o;

        public OooO00o(@NotNull o0OoOo0 registry) {
            Intrinsics.checkNotNullParameter(registry, "registry");
            this.f9317OooO00o = new LinkedHashSet();
            registry.OooO0OO("androidx.savedstate.Restarter", this);
        }

        @Override // o000o0OO.o0OoOo0.OooO0O0
        @NotNull
        public final Bundle saveState() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f9317OooO00o));
            return bundle;
        }
    }

    public Recreator(@NotNull o00Oo0 owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.f9316Oooo0o = owner;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(@NotNull LifecycleOwner source, @NotNull Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != Lifecycle.Event.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().removeObserver(this);
        Bundle bundleOooO00o = this.f9316Oooo0o.getSavedStateRegistry().OooO00o("androidx.savedstate.Restarter");
        if (bundleOooO00o == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleOooO00o.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        for (String str : stringArrayList) {
            try {
                Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(o0OoOo0.OooO00o.class);
                Intrinsics.checkNotNullExpressionValue(clsAsSubclass, "{\n                Class.…class.java)\n            }");
                try {
                    Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                        Intrinsics.checkNotNullExpressionValue(objNewInstance, "{\n                constr…wInstance()\n            }");
                        ((o0OoOo0.OooO00o) objNewInstance).onRecreated(this.f9316Oooo0o);
                    } catch (Exception e) {
                        throw new RuntimeException(OooOo00.OooO0Oo("Failed to instantiate ", str), e);
                    }
                } catch (NoSuchMethodException e2) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Class ");
                    sbOooO0o0.append(clsAsSubclass.getSimpleName());
                    sbOooO0o0.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(sbOooO0o0.toString(), e2);
                }
            } catch (ClassNotFoundException e3) {
                throw new RuntimeException(OooO0OO.OooO00o("Class ", str, " wasn't found"), e3);
            }
        }
    }
}
