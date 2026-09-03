package p109o000ooo;

import androidx.compose.foundation.layout.oo000o;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class o0OO00O implements Iterable<Pair<? extends String, ? extends OooO0O0>>, KMappedMarker {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o0OO00O f35856OooO0o0 = new o0OO00O();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Map<String, OooO0O0> f35857OooO0Oo;

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Object f35859OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final String f35860OooO0O0;

        public OooO0O0(@Nullable Serializable serializable, @Nullable String str) {
            this.f35859OooO00o = serializable;
            this.f35860OooO0O0 = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO0O0) {
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                if (Intrinsics.areEqual(this.f35859OooO00o, oooO0O0.f35859OooO00o) && Intrinsics.areEqual(this.f35860OooO0O0, oooO0O0.f35860OooO0O0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f35859OooO00o;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.f35860OooO0O0;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry(value=");
            sb.append(this.f35859OooO00o);
            sb.append(", memoryCacheKey=");
            return oo000o.OooO00o(sb, this.f35860OooO0O0, ')');
        }
    }

    public o0OO00O(Map<String, OooO0O0> map) {
        this.f35857OooO0Oo = map;
    }

    @Nullable
    public final <T> T OooO00o(@NotNull String str) {
        OooO0O0 oooO0O0 = this.f35857OooO0Oo.get(str);
        if (oooO0O0 != null) {
            return (T) oooO0O0.f35859OooO00o;
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o0OO00O) {
            if (Intrinsics.areEqual(this.f35857OooO0Oo, ((o0OO00O) obj).f35857OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f35857OooO0Oo.hashCode();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Pair<? extends String, ? extends OooO0O0>> iterator() {
        Map<String, OooO0O0> map = this.f35857OooO0Oo;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, OooO0O0> entry : map.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @NotNull
    public final String toString() {
        return "Parameters(entries=" + this.f35857OooO0Oo + ')';
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Map<String, OooO0O0> f35858OooO00o;

        public OooO00o() {
            this.f35858OooO00o = new LinkedHashMap();
        }

        public OooO00o(@NotNull o0OO00O o0oo00o2) {
            this.f35858OooO00o = MapsKt.toMutableMap(o0oo00o2.f35857OooO0Oo);
        }
    }

    public o0OO00O() {
        this(MapsKt.emptyMap());
    }
}
