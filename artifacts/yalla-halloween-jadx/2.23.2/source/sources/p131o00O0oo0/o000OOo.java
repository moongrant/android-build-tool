package p131o00O0oo0;

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
public final class o000OOo implements Iterable<Pair<? extends String, ? extends OooO0O0>>, KMappedMarker {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @JvmField
    @NotNull
    public static final o000OOo f36799OooO0o0 = new o000OOo();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @NotNull
    public final Map<String, OooO0O0> f36800OooO0Oo;

    public static final class OooO0O0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @Nullable
        public final Object f36802OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        @Nullable
        public final String f36803OooO0O0;

        public OooO0O0(@Nullable Serializable serializable, @Nullable String str) {
            this.f36802OooO00o = serializable;
            this.f36803OooO0O0 = str;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof OooO0O0) {
                OooO0O0 oooO0O0 = (OooO0O0) obj;
                if (Intrinsics.areEqual(this.f36802OooO00o, oooO0O0.f36802OooO00o) && Intrinsics.areEqual(this.f36803OooO0O0, oooO0O0.f36803OooO0O0)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f36802OooO00o;
            int iHashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.f36803OooO0O0;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            StringBuilder sb = new StringBuilder("Entry(value=");
            sb.append(this.f36802OooO00o);
            sb.append(", memoryCacheKey=");
            return oo000o.OooO0O0(sb, this.f36803OooO0O0, ')');
        }
    }

    public o000OOo(Map<String, OooO0O0> map) {
        this.f36800OooO0Oo = map;
    }

    @Nullable
    public final <T> T OooO00o(@NotNull String str) {
        OooO0O0 oooO0O0 = this.f36800OooO0Oo.get(str);
        if (oooO0O0 != null) {
            return (T) oooO0O0.f36802OooO00o;
        }
        return null;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o000OOo) {
            if (Intrinsics.areEqual(this.f36800OooO0Oo, ((o000OOo) obj).f36800OooO0Oo)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f36800OooO0Oo.hashCode();
    }

    @Override // java.lang.Iterable
    @NotNull
    public final Iterator<Pair<? extends String, ? extends OooO0O0>> iterator() {
        Map<String, OooO0O0> map = this.f36800OooO0Oo;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, OooO0O0> entry : map.entrySet()) {
            arrayList.add(TuplesKt.to(entry.getKey(), entry.getValue()));
        }
        return arrayList.iterator();
    }

    @NotNull
    public final String toString() {
        return "Parameters(entries=" + this.f36800OooO0Oo + ')';
    }

    public static final class OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        @NotNull
        public final Map<String, OooO0O0> f36801OooO00o;

        public OooO00o() {
            this.f36801OooO00o = new LinkedHashMap();
        }

        public OooO00o(@NotNull o000OOo o000ooo2) {
            this.f36801OooO00o = MapsKt.toMutableMap(o000ooo2.f36800OooO0Oo);
        }
    }

    public o000OOo() {
        this(MapsKt.emptyMap());
    }
}
