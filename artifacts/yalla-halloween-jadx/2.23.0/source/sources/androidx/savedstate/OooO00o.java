package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.lifecycle.LegacySavedStateHandleController;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o000OO00.OooO0o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"RestrictedApi"})
@SourceDebugExtension({"SMAP\nSavedStateRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateRegistry.kt\nandroidx/savedstate/SavedStateRegistry\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,272:1\n1#2:273\n*E\n"})
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f7947OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Bundle f7948OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f7949OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Recreator.OooO00o f7951OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final SafeIterableMap<String, OooO0O0> f7946OooO00o = new SafeIterableMap<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f7950OooO0o = true;

    /* JADX INFO: renamed from: androidx.savedstate.OooO00o$OooO00o, reason: collision with other inner class name */
    public interface InterfaceC0163OooO00o {
        void onRecreated(@NotNull OooO0o oooO0o);
    }

    public interface OooO0O0 {
        @NotNull
        Bundle saveState();
    }

    @MainThread
    @Nullable
    public final Bundle OooO00o(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f7949OooO0Oo) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f7948OooO0OO;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f7948OooO0OO;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f7948OooO0OO;
        boolean z = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z = true;
        }
        if (!z) {
            this.f7948OooO0OO = null;
        }
        return bundle2;
    }

    @Nullable
    public final OooO0O0 OooO0O0() {
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        for (Map.Entry<String, OooO0O0> components : this.f7946OooO00o) {
            Intrinsics.checkNotNullExpressionValue(components, "components");
            String key = components.getKey();
            OooO0O0 value = components.getValue();
            if (Intrinsics.areEqual(key, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                return value;
            }
        }
        return null;
    }

    @MainThread
    public final void OooO0OO(@NotNull String key, @NotNull OooO0O0 provider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(provider, "provider");
        if (!(this.f7946OooO00o.putIfAbsent(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @MainThread
    public final void OooO0Oo() {
        Intrinsics.checkNotNullParameter(LegacySavedStateHandleController.OnRecreation.class, "clazz");
        if (!this.f7950OooO0o) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.OooO00o oooO00o = this.f7951OooO0o0;
        if (oooO00o == null) {
            oooO00o = new Recreator.OooO00o(this);
        }
        this.f7951OooO0o0 = oooO00o;
        try {
            LegacySavedStateHandleController.OnRecreation.class.getDeclaredConstructor(new Class[0]);
            Recreator.OooO00o oooO00o2 = this.f7951OooO0o0;
            if (oooO00o2 != null) {
                String className = LegacySavedStateHandleController.OnRecreation.class.getName();
                Intrinsics.checkNotNullExpressionValue(className, "clazz.name");
                Intrinsics.checkNotNullParameter(className, "className");
                oooO00o2.f7953OooO00o.add(className);
            }
        } catch (NoSuchMethodException e) {
            throw new IllegalArgumentException("Class " + LegacySavedStateHandleController.OnRecreation.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
        }
    }
}
