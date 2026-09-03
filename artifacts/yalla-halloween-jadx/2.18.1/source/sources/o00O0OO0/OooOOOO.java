package o00O0OO0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class OooOOOO implements Iterable<Pair<? extends String, ? extends OooO0O0>>, KMappedMarker {

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final OooOOOO f30588Oooo0oO = new OooOOOO();

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    @NotNull
    public final Map<String, OooO0O0> f30589Oooo0o;

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Map<String, OooO0O0> f30590OooO00o;

        public OooO00o(@NotNull OooOOOO parameters) {
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            this.f30590OooO00o = MapsKt.toMutableMap(parameters.f30589Oooo0o);
        }
    }

    public static final class OooO0O0 {
        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OooO0O0)) {
                return false;
            }
            Objects.requireNonNull((OooO0O0) obj);
            return Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual((Object) null, (Object) null);
        }

        public final int hashCode() {
            return 0;
        }

        @NotNull
        public final String toString() {
            return "Entry(value=null, cacheKey=null)";
        }
    }

    public OooOOOO(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this.f30589Oooo0o = map;
    }

    @NotNull
    public final Map<String, String> OooO00o() {
        if (this.f30589Oooo0o.isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map<String, OooO0O0> map = this.f30589Oooo0o;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, OooO0O0>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Objects.requireNonNull(it.next().getValue());
        }
        return linkedHashMap;
    }

    @Nullable
    public final void OooO0O0(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.f30589Oooo0o.get(key);
    }

    public final boolean equals(@Nullable Object obj) {
        return this == obj || ((obj instanceof OooOOOO) && Intrinsics.areEqual(this.f30589Oooo0o, ((OooOOOO) obj).f30589Oooo0o));
    }

    public final int hashCode() {
        return this.f30589Oooo0o.hashCode();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Pair<? extends String, ? extends OooO0O0>> iterator() {
        Map<String, OooO0O0> map = this.f30589Oooo0o;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, OooO0O0> entry : map.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @NotNull
    public final String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Parameters(map=");
        sbOooO0o0.append(this.f30589Oooo0o);
        sbOooO0o0.append(')');
        return sbOooO0o0.toString();
    }

    public OooOOOO() {
        this.f30589Oooo0o = MapsKt.emptyMap();
    }
}
