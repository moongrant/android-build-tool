package p045OooooOo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00O0OOO implements o00O0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public final Function1<Object, Boolean> f4032OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public final Map<String, List<Object>> f4033OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public final Map<String, List<Function0<Object>>> f4034OooO0OO;

    public static final class OooO00o implements o00O0OO.OooO00o {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final /* synthetic */ String f4036OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final /* synthetic */ Function0<Object> f4037OooO0OO;

        public OooO00o(String str, Function0<? extends Object> function0) {
            this.f4036OooO0O0 = str;
            this.f4037OooO0OO = function0;
        }

        @Override // OooooOo.o00O0OO.OooO00o
        public final void OooO00o() {
            List<Function0<Object>> listRemove = o00O0OOO.this.f4034OooO0OO.remove(this.f4036OooO0O0);
            if (listRemove != null) {
                listRemove.remove(this.f4037OooO0OO);
            }
            if (listRemove == null || !(!listRemove.isEmpty())) {
                return;
            }
            o00O0OOO.this.f4034OooO0OO.put(this.f4036OooO0O0, listRemove);
        }
    }

    public o00O0OOO(@Nullable Map<String, ? extends List<? extends Object>> map, @NotNull Function1<Object, Boolean> canBeSaved) {
        Map<String, List<Object>> mutableMap;
        Intrinsics.checkNotNullParameter(canBeSaved, "canBeSaved");
        this.f4032OooO00o = canBeSaved;
        this.f4033OooO0O0 = (map == null || (mutableMap = MapsKt.toMutableMap(map)) == null) ? new LinkedHashMap<>() : mutableMap;
        this.f4034OooO0OO = new LinkedHashMap();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.LinkedHashMap, java.util.Map<java.lang.String, java.util.List<kotlin.jvm.functions.Function0<java.lang.Object>>>] */
    @Override // p045OooooOo.o00O0OO
    @NotNull
    public final Map<String, List<Object>> OooO00o() {
        Map<String, List<Object>> mutableMap = MapsKt.toMutableMap(this.f4033OooO0O0);
        for (Map.Entry entry : this.f4034OooO0OO.entrySet()) {
            String str = (String) entry.getKey();
            List list = (List) entry.getValue();
            if (list.size() == 1) {
                Object objInvoke = ((Function0) list.get(0)).invoke();
                if (objInvoke == null) {
                    continue;
                } else {
                    if (!canBeSaved(objInvoke)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    mutableMap.put(str, CollectionsKt.arrayListOf(objInvoke));
                }
            } else {
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    Object objInvoke2 = ((Function0) list.get(i)).invoke();
                    if (objInvoke2 != null && !canBeSaved(objInvoke2)) {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                    arrayList.add(objInvoke2);
                }
                mutableMap.put(str, arrayList);
            }
        }
        return mutableMap;
    }

    @Override // p045OooooOo.o00O0OO
    @Nullable
    public final Object OooO0O0(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        List<Object> listRemove = this.f4033OooO0O0.remove(key);
        if (listRemove == null || !(!listRemove.isEmpty())) {
            return null;
        }
        if (listRemove.size() > 1) {
            this.f4033OooO0O0.put(key, listRemove.subList(1, listRemove.size()));
        }
        return listRemove.get(0);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p045OooooOo.o00O0OO
    @NotNull
    public final o00O0OO.OooO00o OooO0OO(@NotNull String key, @NotNull Function0<? extends Object> valueProvider) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(valueProvider, "valueProvider");
        if (!(!StringsKt.isBlank(key))) {
            throw new IllegalArgumentException("Registered key is empty or blank".toString());
        }
        Map<String, List<Function0<Object>>> map = this.f4034OooO0OO;
        Collection arrayList = map.get(key);
        if (arrayList == null) {
            arrayList = new ArrayList();
            map.put(key, (List<Function0<Object>>) arrayList);
        }
        ((List) arrayList).add(valueProvider);
        return new OooO00o(key, valueProvider);
    }

    @Override // p045OooooOo.o00O0OO
    public final boolean canBeSaved(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f4032OooO00o.invoke(value).booleanValue();
    }
}
