package p219o00oO0O0;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p219o00oO0O0.o0O000Oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0O00000<K extends o0O000Oo, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o<K, V> f33647OooO00o = new OooO00o<>(null);

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Map<K, OooO00o<K, V>> f33648OooO0O0 = new HashMap();

    public static class OooO00o<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final K f33649OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public List<V> f33650OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooO00o<K, V> f33651OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO00o<K, V> f33652OooO0Oo;

        public OooO00o() {
            this(null);
        }

        @Nullable
        public final V OooO00o() {
            List<V> list = this.f33650OooO0O0;
            int size = list != null ? list.size() : 0;
            if (size > 0) {
                return (V) this.f33650OooO0O0.remove(size - 1);
            }
            return null;
        }

        public OooO00o(K k) {
            this.f33652OooO0Oo = this;
            this.f33651OooO0OO = this;
            this.f33649OooO00o = k;
        }
    }

    public static <K, V> void OooO0OO(OooO00o<K, V> oooO00o) {
        OooO00o<K, V> oooO00o2 = oooO00o.f33652OooO0Oo;
        oooO00o2.f33651OooO0OO = oooO00o.f33651OooO0OO;
        oooO00o.f33651OooO0OO.f33652OooO0Oo = oooO00o2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Nullable
    public final V OooO00o(K k) {
        OooO00o<K, V> oooO00o = this.f33648OooO0O0.get(k);
        if (oooO00o == null) {
            oooO00o = new OooO00o<>(k);
            this.f33648OooO0O0.put(k, oooO00o);
        } else {
            k.OooO00o();
        }
        OooO0OO(oooO00o);
        OooO00o<K, V> oooO00o2 = this.f33647OooO00o;
        oooO00o.f33652OooO0Oo = oooO00o2;
        OooO00o<K, V> oooO00o3 = oooO00o2.f33651OooO0OO;
        oooO00o.f33651OooO0OO = oooO00o3;
        oooO00o3.f33652OooO0Oo = oooO00o;
        oooO00o.f33652OooO0Oo.f33651OooO0OO = oooO00o;
        return oooO00o.OooO00o();
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO0O0(K k, V v) {
        OooO00o<K, V> oooO00o = this.f33648OooO0O0.get(k);
        if (oooO00o == null) {
            oooO00o = new OooO00o<>(k);
            OooO0OO(oooO00o);
            OooO00o<K, V> oooO00o2 = this.f33647OooO00o;
            oooO00o.f33652OooO0Oo = oooO00o2.f33652OooO0Oo;
            oooO00o.f33651OooO0OO = oooO00o2;
            oooO00o2.f33652OooO0Oo = oooO00o;
            oooO00o.f33652OooO0Oo.f33651OooO0OO = oooO00o;
            this.f33648OooO0O0.put(k, oooO00o);
        } else {
            k.OooO00o();
        }
        if (oooO00o.f33650OooO0O0 == null) {
            oooO00o.f33650OooO0O0 = new ArrayList();
        }
        oooO00o.f33650OooO0O0.add(v);
    }

    @Nullable
    public final V OooO0Oo() {
        for (OooO00o oooO00o = this.f33647OooO00o.f33652OooO0Oo; !oooO00o.equals(this.f33647OooO00o); oooO00o = oooO00o.f33652OooO0Oo) {
            V v = (V) oooO00o.OooO00o();
            if (v != null) {
                return v;
            }
            OooO0OO(oooO00o);
            this.f33648OooO0O0.remove(oooO00o.f33649OooO00o);
            ((o0O000Oo) oooO00o.f33649OooO00o).OooO00o();
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        boolean z = false;
        for (OooO00o oooO00o = this.f33647OooO00o.f33651OooO0OO; !oooO00o.equals(this.f33647OooO00o); oooO00o = oooO00o.f33651OooO0OO) {
            z = true;
            sb.append('{');
            sb.append(oooO00o.f33649OooO00o);
            sb.append(':');
            List<V> list = oooO00o.f33650OooO0O0;
            sb.append(list != null ? list.size() : 0);
            sb.append("}, ");
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
