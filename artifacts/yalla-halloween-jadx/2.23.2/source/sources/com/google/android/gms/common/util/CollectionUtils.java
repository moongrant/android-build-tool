package com.google.android.gms.common.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.compiler.plugins.kotlin.lower.OooO0O0;
import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.conscrypt.PSKKeyManager;
import p190o00o0O.OooO;
import p190o00o0O.OooOO0O;

/* JADX INFO: loaded from: classes3.dex */
@KeepForSdk
public final class CollectionUtils {
    public static Map OooO00o(int i) {
        return i <= 256 ? new OooO(i) : new HashMap(i, 1.0f);
    }

    public static Set OooO0O0(int i, boolean z) {
        return i <= (true != z ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128) ? new OooOO0O(i) : new HashSet(i, true != z ? 1.0f : 0.75f);
    }

    @KeepForSdk
    public static boolean isEmpty(@Nullable Collection<?> collection) {
        if (collection == null) {
            return true;
        }
        return collection.isEmpty();
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf() {
        return Collections.emptyList();
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k, @NonNull V v, @NonNull K k2, @NonNull V v2, @NonNull K k3, @NonNull V v3) {
        Map mapOooO00o = OooO00o(3);
        mapOooO00o.put(k, v);
        mapOooO00o.put(k2, v2);
        mapOooO00o.put(k3, v3);
        return Collections.unmodifiableMap(mapOooO00o);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOfKeyValueArrays(@NonNull K[] kArr, @NonNull V[] vArr) {
        int length = kArr.length;
        int length2 = vArr.length;
        if (length != length2) {
            throw new IllegalArgumentException(OooO0O0.OooO0O0("Key and values array lengths not equal: ", length, " != ", length2));
        }
        if (length == 0) {
            return Collections.emptyMap();
        }
        if (length == 1) {
            return Collections.singletonMap(kArr[0], vArr[0]);
        }
        Map mapOooO00o = OooO00o(length);
        for (int i = 0; i < kArr.length; i++) {
            mapOooO00o.put(kArr[i], vArr[i]);
        }
        return Collections.unmodifiableMap(mapOooO00o);
    }

    @NonNull
    @KeepForSdk
    public static <T> Set<T> mutableSetOfWithSize(int i) {
        return i == 0 ? new OooOO0O() : OooO0O0(i, true);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T t, @NonNull T t2, @NonNull T t3) {
        Set setOooO0O0 = OooO0O0(3, false);
        setOooO0O0.add(t);
        setOooO0O0.add(t2);
        setOooO0O0.add(t3);
        return Collections.unmodifiableSet(setOooO0O0);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T t) {
        return Collections.singletonList(t);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> List<T> listOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return listOf();
        }
        if (length != 1) {
            return Collections.unmodifiableList(Arrays.asList(tArr));
        }
        return listOf(tArr[0]);
    }

    @NonNull
    @KeepForSdk
    public static <K, V> Map<K, V> mapOf(@NonNull K k, @NonNull V v, @NonNull K k2, @NonNull V v2, @NonNull K k3, @NonNull V v3, @NonNull K k4, @NonNull V v4, @NonNull K k5, @NonNull V v5, @NonNull K k6, @NonNull V v6) {
        Map mapOooO00o = OooO00o(6);
        mapOooO00o.put(k, v);
        mapOooO00o.put(k2, v2);
        mapOooO00o.put(k3, v3);
        mapOooO00o.put(k4, v4);
        mapOooO00o.put(k5, v5);
        mapOooO00o.put(k6, v6);
        return Collections.unmodifiableMap(mapOooO00o);
    }

    @NonNull
    @KeepForSdk
    @Deprecated
    public static <T> Set<T> setOf(@NonNull T... tArr) {
        int length = tArr.length;
        if (length == 0) {
            return Collections.emptySet();
        }
        if (length == 1) {
            return Collections.singleton(tArr[0]);
        }
        if (length == 2) {
            T t = tArr[0];
            T t2 = tArr[1];
            Set setOooO0O0 = OooO0O0(2, false);
            setOooO0O0.add(t);
            setOooO0O0.add(t2);
            return Collections.unmodifiableSet(setOooO0O0);
        }
        if (length == 3) {
            return setOf(tArr[0], tArr[1], tArr[2]);
        }
        if (length != 4) {
            Set setOooO0O1 = OooO0O0(length, false);
            Collections.addAll(setOooO0O1, tArr);
            return Collections.unmodifiableSet(setOooO0O1);
        }
        T t3 = tArr[0];
        T t4 = tArr[1];
        T t5 = tArr[2];
        T t6 = tArr[3];
        Set setOooO0O2 = OooO0O0(4, false);
        setOooO0O2.add(t3);
        setOooO0O2.add(t4);
        setOooO0O2.add(t5);
        setOooO0O2.add(t6);
        return Collections.unmodifiableSet(setOooO0O2);
    }
}
