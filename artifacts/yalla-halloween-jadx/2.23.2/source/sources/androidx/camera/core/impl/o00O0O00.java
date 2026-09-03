package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class o00O0O00 implements Config {

    /* JADX INFO: renamed from: Oooo000, reason: collision with root package name */
    public static final o00O0 f3721Oooo000;

    /* JADX INFO: renamed from: Oooo00O, reason: collision with root package name */
    public static final o00O0O00 f3722Oooo00O;

    /* JADX INFO: renamed from: OooOooo, reason: collision with root package name */
    public final TreeMap<Config.OooO00o<?>, Map<Config.OptionPriority, Object>> f3723OooOooo;

    static {
        o00O0 o00o1 = new o00O0();
        f3721Oooo000 = o00o1;
        f3722Oooo00O = new o00O0O00(new TreeMap(o00o1));
    }

    public o00O0O00(TreeMap<Config.OooO00o<?>, Map<Config.OptionPriority, Object>> treeMap) {
        this.f3723OooOooo = treeMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static o00O0O00 Oooo0O0(@NonNull o00O00O o00o00o2) {
        if (o00O0O00.class.equals(o00o00o2.getClass())) {
            return (o00O0O00) o00o00o2;
        }
        TreeMap treeMap = new TreeMap(f3721Oooo000);
        o00O0O00 o00o0o01 = (o00O0O00) o00o00o2;
        for (Config.OooO00o<?> oooO00o : o00o0o01.OooO0oo()) {
            Set<Config.OptionPriority> setOooOOO0 = o00o0o01.OooOOO0(oooO00o);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : setOooOOO0) {
                arrayMap.put(optionPriority, o00o0o01.OooO0oO(oooO00o, optionPriority));
            }
            treeMap.put(oooO00o, arrayMap);
        }
        return new o00O0O00(treeMap);
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    public final <ValueT> ValueT OooO0O0(@NonNull Config.OooO00o<ValueT> oooO00o) {
        Map<Config.OptionPriority, Object> map = this.f3723OooOooo.get(oooO00o);
        if (map != null) {
            return (ValueT) map.get((Config.OptionPriority) Collections.min(map.keySet()));
        }
        throw new IllegalArgumentException("Option does not exist: " + oooO00o);
    }

    @Override // androidx.camera.core.impl.Config
    public final boolean OooO0o0(@NonNull Config.OooO00o<?> oooO00o) {
        return this.f3723OooOooo.containsKey(oooO00o);
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    public final <ValueT> ValueT OooO0oO(@NonNull Config.OooO00o<ValueT> oooO00o, @NonNull Config.OptionPriority optionPriority) {
        Map<Config.OptionPriority, Object> map = this.f3723OooOooo.get(oooO00o);
        if (map == null) {
            throw new IllegalArgumentException("Option does not exist: " + oooO00o);
        }
        if (map.containsKey(optionPriority)) {
            return (ValueT) map.get(optionPriority);
        }
        throw new IllegalArgumentException("Option does not exist: " + oooO00o + " with priority=" + optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    @NonNull
    public final Set<Config.OooO00o<?>> OooO0oo() {
        return Collections.unmodifiableSet(this.f3723OooOooo.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public final void OooOO0o(@NonNull p026Oooo0o.OooOOOO oooOOOO) {
        for (Map.Entry<Config.OooO00o<?>, Map<Config.OptionPriority, Object>> entry : this.f3723OooOooo.tailMap(Config.OooO00o.OooO00o(Void.class, "camera2.captureRequest.option.")).entrySet()) {
            if (!entry.getKey().OooO0O0().startsWith("camera2.captureRequest.option.")) {
                return;
            }
            Config.OooO00o<?> key = entry.getKey();
            oOO00O ooo00o = oooOOOO.f1081OooO00o.f1084OooO00o;
            Config config = oooOOOO.f1082OooO0O0;
            ooo00o.Oooo0o(key, config.OooOoo(key), config.OooO0O0(key));
        }
    }

    @Override // androidx.camera.core.impl.Config
    @NonNull
    public final Set<Config.OptionPriority> OooOOO0(@NonNull Config.OooO00o<?> oooO00o) {
        Map<Config.OptionPriority, Object> map = this.f3723OooOooo.get(oooO00o);
        return map == null ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    @Nullable
    public final <ValueT> ValueT OooOoO(@NonNull Config.OooO00o<ValueT> oooO00o, @Nullable ValueT valuet) {
        try {
            return (ValueT) OooO0O0(oooO00o);
        } catch (IllegalArgumentException unused) {
            return valuet;
        }
    }

    @Override // androidx.camera.core.impl.Config
    @NonNull
    public final Config.OptionPriority OooOoo(@NonNull Config.OooO00o<?> oooO00o) {
        Map<Config.OptionPriority, Object> map = this.f3723OooOooo.get(oooO00o);
        if (map != null) {
            return (Config.OptionPriority) Collections.min(map.keySet());
        }
        throw new IllegalArgumentException("Option does not exist: " + oooO00o);
    }
}
