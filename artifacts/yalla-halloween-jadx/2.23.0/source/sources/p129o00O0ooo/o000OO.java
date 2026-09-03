package p129o00O0ooo;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import p129o00O0ooo.o000O0o;

/* JADX INFO: loaded from: classes2.dex */
public final class o000OO<K extends o000O0o, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o<K, V> f36973OooO00o = new OooO00o<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f36974OooO0O0 = new HashMap();

    public static class OooO00o<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final K f36975OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList f36976OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooO00o<K, V> f36977OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO00o<K, V> f36978OooO0Oo;

        public OooO00o() {
            this(null);
        }

        public OooO00o(K k) {
            this.f36978OooO0Oo = this;
            this.f36977OooO0OO = this;
            this.f36975OooO00o = k;
        }
    }

    @Nullable
    public final V OooO00o(K k) {
        OooO00o oooO00o;
        HashMap map = this.f36974OooO0O0;
        OooO00o oooO00o2 = (OooO00o) map.get(k);
        if (oooO00o2 == null) {
            OooO00o oooO00o3 = new OooO00o(k);
            map.put(k, oooO00o3);
            oooO00o = oooO00o3;
        } else {
            k.OooO00o();
            oooO00o = oooO00o2;
        }
        OooO00o<K, V> oooO00o4 = oooO00o.f36978OooO0Oo;
        oooO00o4.f36977OooO0OO = oooO00o.f36977OooO0OO;
        oooO00o.f36977OooO0OO.f36978OooO0Oo = oooO00o4;
        OooO00o<K, V> oooO00o5 = this.f36973OooO00o;
        oooO00o.f36978OooO0Oo = oooO00o5;
        OooO00o<K, V> oooO00o6 = oooO00o5.f36977OooO0OO;
        oooO00o.f36977OooO0OO = oooO00o6;
        oooO00o6.f36978OooO0Oo = oooO00o;
        oooO00o.f36978OooO0Oo.f36977OooO0OO = oooO00o;
        ArrayList arrayList = oooO00o.f36976OooO0O0;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return (V) oooO00o.f36976OooO0O0.remove(size - 1);
        }
        return null;
    }

    public final void OooO0O0(K k, V v) {
        HashMap map = this.f36974OooO0O0;
        OooO00o oooO00o = (OooO00o) map.get(k);
        if (oooO00o == null) {
            oooO00o = new OooO00o(k);
            OooO00o<K, V> oooO00o2 = oooO00o.f36978OooO0Oo;
            oooO00o2.f36977OooO0OO = oooO00o.f36977OooO0OO;
            oooO00o.f36977OooO0OO.f36978OooO0Oo = oooO00o2;
            OooO00o<K, V> oooO00o3 = this.f36973OooO00o;
            oooO00o.f36978OooO0Oo = oooO00o3.f36978OooO0Oo;
            oooO00o.f36977OooO0OO = oooO00o3;
            oooO00o3.f36978OooO0Oo = oooO00o;
            oooO00o.f36978OooO0Oo.f36977OooO0OO = oooO00o;
            map.put(k, oooO00o);
        } else {
            k.OooO00o();
        }
        if (oooO00o.f36976OooO0O0 == null) {
            oooO00o.f36976OooO0O0 = new ArrayList();
        }
        oooO00o.f36976OooO0O0.add(v);
    }

    @Nullable
    public final V OooO0OO() {
        OooO00o<K, V> oooO00o = this.f36973OooO00o;
        OooO00o oooO00o2 = oooO00o.f36978OooO0Oo;
        while (true) {
            V v = null;
            if (oooO00o2.equals(oooO00o)) {
                return null;
            }
            ArrayList arrayList = oooO00o2.f36976OooO0O0;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                v = (V) oooO00o2.f36976OooO0O0.remove(size - 1);
            }
            if (v != null) {
                return v;
            }
            OooO00o<K, V> oooO00o3 = oooO00o2.f36978OooO0Oo;
            oooO00o3.f36977OooO0OO = oooO00o2.f36977OooO0OO;
            oooO00o2.f36977OooO0OO.f36978OooO0Oo = oooO00o3;
            HashMap map = this.f36974OooO0O0;
            Object obj = oooO00o2.f36975OooO00o;
            map.remove(obj);
            ((o000O0o) obj).OooO00o();
            oooO00o2 = oooO00o2.f36978OooO0Oo;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        OooO00o<K, V> oooO00o = this.f36973OooO00o;
        OooO00o oooO00o2 = oooO00o.f36977OooO0OO;
        boolean z = false;
        while (!oooO00o2.equals(oooO00o)) {
            sb.append('{');
            sb.append(oooO00o2.f36975OooO00o);
            sb.append(':');
            ArrayList arrayList = oooO00o2.f36976OooO0O0;
            sb.append(arrayList != null ? arrayList.size() : 0);
            sb.append("}, ");
            oooO00o2 = oooO00o2.f36977OooO0OO;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
