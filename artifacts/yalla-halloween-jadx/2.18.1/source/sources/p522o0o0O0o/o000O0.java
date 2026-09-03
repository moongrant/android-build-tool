package p522o0o0O0o;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o000O0 {
    public static final void OooO00o(@NotNull List list, @Nullable List list2, @NotNull Function1 checkKey) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(checkKey, "checkKey");
        if (list2.isEmpty()) {
            return;
        }
        Map mapOooO0o0 = OooO0o0(list, new o000O00O(checkKey));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!mapOooO0o0.containsKey(checkKey.invoke(obj))) {
                arrayList.add(obj);
            }
        }
        list.addAll(arrayList);
    }

    public static final boolean OooO0O0(@Nullable List list, @Nullable List list2, @NotNull Function1 checkKey) {
        Intrinsics.checkNotNullParameter(checkKey, "checkKey");
        if (list == null || list.isEmpty()) {
            return list2 == null || list2.isEmpty();
        }
        if ((list2 == null || list2.isEmpty()) || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (!Intrinsics.areEqual(checkKey.invoke(list.get(i)), checkKey.invoke(list2.get(i)))) {
                return false;
            }
        }
        return true;
    }

    public static final <V> void OooO0OO(@NotNull List<V> list, @NotNull Function1<? super V, Boolean> checkKey) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(checkKey, "checkKey");
        int i = 0;
        while (i < list.size()) {
            V v = list.get(i);
            if (v != null && checkKey.invoke(v).booleanValue()) {
                list.remove(i);
            } else {
                i++;
            }
        }
    }

    public static final <K, V> void OooO0Oo(@NotNull List<V> list, @NotNull Function1<? super V, ? extends K> checkKey) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(checkKey, "checkKey");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i < list.size()) {
            V v = list.get(i);
            if (v != null) {
                K kInvoke = checkKey.invoke(v);
                if (linkedHashMap.containsKey(kInvoke)) {
                    list.remove(i);
                } else {
                    linkedHashMap.put(kInvoke, v);
                }
            }
            i++;
        }
    }

    @NotNull
    public static final <K, V> Map<K, V> OooO0o0(@Nullable List<V> list, @NotNull Function1<? super V, ? extends K> checkKey) {
        Intrinsics.checkNotNullParameter(checkKey, "checkKey");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (V v : list) {
                linkedHashMap.put(checkKey.invoke(v), v);
            }
        }
        return linkedHashMap;
    }
}
