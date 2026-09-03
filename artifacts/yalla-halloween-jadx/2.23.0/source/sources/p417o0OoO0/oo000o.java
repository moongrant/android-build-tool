package p417o0OoO0;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@SourceDebugExtension({"SMAP\nCollectionExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionExt.kt\ncom/yalla/yalla/ext/CollectionExtKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,224:1\n1855#2,2:225\n1855#2,2:227\n1855#2,2:229\n1864#2,3:231\n1864#2,3:234\n*S KotlinDebug\n*F\n+ 1 CollectionExt.kt\ncom/yalla/yalla/ext/CollectionExtKt\n*L\n36#1:225,2\n78#1:227,2\n82#1:229,2\n154#1:231,3\n169#1:234,3\n*E\n"})
public final class oo000o {
    public static final void OooO00o(@NotNull List list, @Nullable List list2, @NotNull Function1 checkKey) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(checkKey, "checkKey");
        if (list2.isEmpty()) {
            return;
        }
        LinkedHashMap linkedHashMapOooO0Oo = OooO0Oo(list, new o00Ooo(checkKey));
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (!linkedHashMapOooO0Oo.containsKey(checkKey.invoke(obj))) {
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

    public static final <K, V> void OooO0OO(@NotNull List<V> list, @NotNull Function1<? super V, ? extends K> checkKey) {
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
    public static final LinkedHashMap OooO0Oo(@Nullable List list, @NotNull Function1 checkKey) {
        Intrinsics.checkNotNullParameter(checkKey, "checkKey");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null) {
            for (Object obj : list) {
                linkedHashMap.put(checkKey.invoke(obj), obj);
            }
        }
        return linkedHashMap;
    }
}
