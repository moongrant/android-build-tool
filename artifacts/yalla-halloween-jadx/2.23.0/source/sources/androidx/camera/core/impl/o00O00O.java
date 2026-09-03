package androidx.camera.core.impl;

import android.util.ArrayMap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o00O00O extends o00O0 implements o00O00 {

    /* JADX INFO: renamed from: Oooo00o, reason: collision with root package name */
    @NonNull
    public static final Config.OptionPriority f3722Oooo00o = Config.OptionPriority.OPTIONAL;

    @NonNull
    public static o00O00O Oooo0OO() {
        return new o00O00O(new TreeMap(o00O0.f3708Oooo000));
    }

    @NonNull
    public static o00O00O Oooo0o0(@NonNull Config config) {
        TreeMap treeMap = new TreeMap(o00O0.f3708Oooo000);
        for (Config.OooO00o<?> oooO00o : config.OooO0oo()) {
            Set<Config.OptionPriority> setOooOOO0 = config.OooOOO0(oooO00o);
            ArrayMap arrayMap = new ArrayMap();
            for (Config.OptionPriority optionPriority : setOooOOO0) {
                arrayMap.put(optionPriority, config.OooO0oO(oooO00o, optionPriority));
            }
            treeMap.put(oooO00o, arrayMap);
        }
        return new o00O00O(treeMap);
    }

    public final <ValueT> void Oooo0o(@NonNull Config.OooO00o<ValueT> oooO00o, @NonNull Config.OptionPriority optionPriority, @Nullable ValueT valuet) {
        Config.OptionPriority optionPriority2;
        TreeMap<Config.OooO00o<?>, Map<Config.OptionPriority, Object>> treeMap = this.f3710OooOooo;
        Map<Config.OptionPriority, Object> map = treeMap.get(oooO00o);
        if (map == null) {
            ArrayMap arrayMap = new ArrayMap();
            treeMap.put((Config.OooO00o<?>) oooO00o, arrayMap);
            arrayMap.put(optionPriority, valuet);
            return;
        }
        Config.OptionPriority optionPriority3 = (Config.OptionPriority) Collections.min(map.keySet());
        if (!Objects.equals(map.get(optionPriority3), valuet)) {
            Config.OptionPriority optionPriority4 = Config.OptionPriority.ALWAYS_OVERRIDE;
            boolean z = true;
            if ((optionPriority3 != optionPriority4 || optionPriority != optionPriority4) && (optionPriority3 != (optionPriority2 = Config.OptionPriority.REQUIRED) || optionPriority != optionPriority2)) {
                z = false;
            }
            if (z) {
                throw new IllegalArgumentException("Option values conflicts: " + oooO00o.OooO0O0() + ", existing value (" + optionPriority3 + ")=" + map.get(optionPriority3) + ", conflicting (" + optionPriority + ")=" + valuet);
            }
        }
        map.put(optionPriority, valuet);
    }

    public final <ValueT> void Oooo0oO(@NonNull Config.OooO00o<ValueT> oooO00o, @Nullable ValueT valuet) {
        Oooo0o(oooO00o, f3722Oooo00o, valuet);
    }
}
