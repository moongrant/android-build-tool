package o00000O0;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.oOO00O;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class OooOOOO implements o0OO00O, Iterable<Map.Entry<? extends o0Oo0oo<?>, ? extends Object>>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Map<o0Oo0oo<?>, Object> f26934Oooo0o = new LinkedHashMap();

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public boolean f26935Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public boolean f26936Oooo0oo;

    @Override // o00000O0.o0OO00O
    public final <T> void OooO00o(@NotNull o0Oo0oo<T> key, T t) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f26934Oooo0o.put(key, t);
    }

    public final <T> boolean OooO0O0(@NotNull o0Oo0oo<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f26934Oooo0o.containsKey(key);
    }

    @NotNull
    public final OooOOOO OooO0OO() {
        OooOOOO oooOOOO = new OooOOOO();
        oooOOOO.f26935Oooo0oO = this.f26935Oooo0oO;
        oooOOOO.f26936Oooo0oo = this.f26936Oooo0oo;
        oooOOOO.f26934Oooo0o.putAll(this.f26934Oooo0o);
        return oooOOOO;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.LinkedHashMap, java.util.Map<o00000O0.o0Oo0oo<?>, java.lang.Object>] */
    public final <T> T OooO0o0(@NotNull o0Oo0oo<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        T t = (T) this.f26934Oooo0o.get(key);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.LinkedHashMap, java.util.Map<o00000O0.o0Oo0oo<?>, java.lang.Object>] */
    public final <T> T OooO0oO(@NotNull o0Oo0oo<T> key, @NotNull Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = (T) this.f26934Oooo0o.get(key);
        return t == null ? defaultValue.invoke() : t;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OooOOOO)) {
            return false;
        }
        OooOOOO oooOOOO = (OooOOOO) obj;
        return Intrinsics.areEqual(this.f26934Oooo0o, oooOOOO.f26934Oooo0o) && this.f26935Oooo0oO == oooOOOO.f26935Oooo0oO && this.f26936Oooo0oo == oooOOOO.f26936Oooo0oo;
    }

    public final int hashCode() {
        return (((this.f26934Oooo0o.hashCode() * 31) + (this.f26935Oooo0oO ? 1231 : 1237)) * 31) + (this.f26936Oooo0oo ? 1231 : 1237);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.LinkedHashMap, java.util.Map<o00000O0.o0Oo0oo<?>, java.lang.Object>] */
    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Map.Entry<? extends o0Oo0oo<?>, ? extends Object>> iterator() {
        return this.f26934Oooo0o.entrySet().iterator();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.LinkedHashMap, java.util.Map<o00000O0.o0Oo0oo<?>, java.lang.Object>] */
    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f26935Oooo0oO) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.f26936Oooo0oo) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.f26934Oooo0o.entrySet()) {
            o0Oo0oo o0oo0oo2 = (o0Oo0oo) entry.getKey();
            Object value = entry.getValue();
            sb.append(str);
            sb.append(o0oo0oo2.f26957OooO00o);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return oOO00O.OooO00o(this) + "{ " + ((Object) sb) + " }";
    }
}
