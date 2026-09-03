package p094o000o0OO;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.arch.core.internal.SafeIterableMap;
import androidx.savedstate.Recreator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public boolean f29290OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @Nullable
    public Bundle f29291OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f29292OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @Nullable
    public Recreator.OooO00o f29294OooO0o0;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final SafeIterableMap<String, OooO0O0> f29289OooO00o = new SafeIterableMap<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f29293OooO0o = true;

    public interface OooO00o {
        void onRecreated(@NotNull o00Oo0 o00oo1);
    }

    public interface OooO0O0 {
        @NotNull
        Bundle saveState();
    }

    @MainThread
    @Nullable
    public final Bundle OooO00o(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (!this.f29292OooO0Oo) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f29291OooO0OO;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f29291OooO0OO;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f29291OooO0OO;
        boolean z = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z = true;
        }
        if (!z) {
            this.f29291OooO0OO = null;
        }
        return bundle2;
    }

    @Nullable
    public final OooO0O0 OooO0O0() {
        Intrinsics.checkNotNullParameter("androidx.lifecycle.internal.SavedStateHandlesProvider", "key");
        for (Map.Entry<String, OooO0O0> components : this.f29289OooO00o) {
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
        if (!(this.f29289OooO00o.putIfAbsent(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    @MainThread
    public final void OooO0Oo(@NotNull Class<? extends OooO00o> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        if (!this.f29293OooO0o) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.OooO00o oooO00o = this.f29294OooO0o0;
        if (oooO00o == null) {
            oooO00o = new Recreator.OooO00o(this);
        }
        this.f29294OooO0o0 = oooO00o;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            Recreator.OooO00o oooO00o2 = this.f29294OooO0o0;
            if (oooO00o2 != null) {
                String className = clazz.getName();
                Intrinsics.checkNotNullExpressionValue(className, "clazz.name");
                Intrinsics.checkNotNullParameter(className, "className");
                oooO00o2.f9317OooO00o.add(className);
            }
        } catch (NoSuchMethodException e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Class ");
            sbOooO0o0.append(clazz.getSimpleName());
            sbOooO0o0.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(sbOooO0o0.toString(), e);
        }
    }
}
