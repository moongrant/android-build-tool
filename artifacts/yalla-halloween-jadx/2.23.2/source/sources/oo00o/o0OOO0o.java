package oo00o;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Object f60285OooO00o = new Object();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f60286OooO0O0 = new LinkedHashMap();

    public final boolean OooO00o(@NotNull o00O0OO.OooOo id) {
        boolean zContainsKey;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f60285OooO00o) {
            zContainsKey = this.f60286OooO0O0.containsKey(id);
        }
        return zContainsKey;
    }

    @NotNull
    public final List<o0ooOOo> OooO0O0(@NotNull String workSpecId) {
        List<o0ooOOo> list;
        Intrinsics.checkNotNullParameter(workSpecId, "workSpecId");
        synchronized (this.f60285OooO00o) {
            LinkedHashMap linkedHashMap = this.f60286OooO0O0;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                if (Intrinsics.areEqual(((o00O0OO.OooOo) entry.getKey()).f36202OooO00o, workSpecId)) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it = linkedHashMap2.keySet().iterator();
            while (it.hasNext()) {
                this.f60286OooO0O0.remove((o00O0OO.OooOo) it.next());
            }
            list = CollectionsKt.toList(linkedHashMap2.values());
        }
        return list;
    }

    @Nullable
    public final o0ooOOo OooO0OO(@NotNull o00O0OO.OooOo id) {
        o0ooOOo o0ooooo;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f60285OooO00o) {
            o0ooooo = (o0ooOOo) this.f60286OooO0O0.remove(id);
        }
        return o0ooooo;
    }

    @NotNull
    public final o0ooOOo OooO0Oo(@NotNull o00O0OO.OooOo id) {
        o0ooOOo o0ooooo;
        Intrinsics.checkNotNullParameter(id, "id");
        synchronized (this.f60285OooO00o) {
            LinkedHashMap linkedHashMap = this.f60286OooO0O0;
            Object o0ooooo2 = linkedHashMap.get(id);
            if (o0ooooo2 == null) {
                o0ooooo2 = new o0ooOOo(id);
                linkedHashMap.put(id, o0ooooo2);
            }
            o0ooooo = (o0ooOOo) o0ooooo2;
        }
        return o0ooooo;
    }
}
