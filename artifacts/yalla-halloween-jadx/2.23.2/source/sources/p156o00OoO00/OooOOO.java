package p156o00OoO00;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import p156o00OoO00.Oooo0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO<K extends Oooo0, V> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooO00o<K, V> f37962OooO00o = new OooO00o<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final HashMap f37963OooO0O0 = new HashMap();

    public static class OooO00o<K, V> {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final K f37964OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public ArrayList f37965OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public OooO00o<K, V> f37966OooO0OO;

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public OooO00o<K, V> f37967OooO0Oo;

        public OooO00o() {
            this(null);
        }

        public OooO00o(K k) {
            this.f37967OooO0Oo = this;
            this.f37966OooO0OO = this;
            this.f37964OooO00o = k;
        }
    }

    @Nullable
    public final V OooO00o(K k) {
        OooO00o oooO00o;
        HashMap map = this.f37963OooO0O0;
        OooO00o oooO00o2 = (OooO00o) map.get(k);
        if (oooO00o2 == null) {
            OooO00o oooO00o3 = new OooO00o(k);
            map.put(k, oooO00o3);
            oooO00o = oooO00o3;
        } else {
            k.OooO00o();
            oooO00o = oooO00o2;
        }
        OooO00o<K, V> oooO00o4 = oooO00o.f37967OooO0Oo;
        oooO00o4.f37966OooO0OO = oooO00o.f37966OooO0OO;
        oooO00o.f37966OooO0OO.f37967OooO0Oo = oooO00o4;
        OooO00o<K, V> oooO00o5 = this.f37962OooO00o;
        oooO00o.f37967OooO0Oo = oooO00o5;
        OooO00o<K, V> oooO00o6 = oooO00o5.f37966OooO0OO;
        oooO00o.f37966OooO0OO = oooO00o6;
        oooO00o6.f37967OooO0Oo = oooO00o;
        oooO00o.f37967OooO0Oo.f37966OooO0OO = oooO00o;
        ArrayList arrayList = oooO00o.f37965OooO0O0;
        int size = arrayList != null ? arrayList.size() : 0;
        if (size > 0) {
            return (V) oooO00o.f37965OooO0O0.remove(size - 1);
        }
        return null;
    }

    public final void OooO0O0(K k, V v) {
        HashMap map = this.f37963OooO0O0;
        OooO00o oooO00o = (OooO00o) map.get(k);
        if (oooO00o == null) {
            oooO00o = new OooO00o(k);
            OooO00o<K, V> oooO00o2 = oooO00o.f37967OooO0Oo;
            oooO00o2.f37966OooO0OO = oooO00o.f37966OooO0OO;
            oooO00o.f37966OooO0OO.f37967OooO0Oo = oooO00o2;
            OooO00o<K, V> oooO00o3 = this.f37962OooO00o;
            oooO00o.f37967OooO0Oo = oooO00o3.f37967OooO0Oo;
            oooO00o.f37966OooO0OO = oooO00o3;
            oooO00o3.f37967OooO0Oo = oooO00o;
            oooO00o.f37967OooO0Oo.f37966OooO0OO = oooO00o;
            map.put(k, oooO00o);
        } else {
            k.OooO00o();
        }
        if (oooO00o.f37965OooO0O0 == null) {
            oooO00o.f37965OooO0O0 = new ArrayList();
        }
        oooO00o.f37965OooO0O0.add(v);
    }

    @Nullable
    public final V OooO0OO() {
        OooO00o<K, V> oooO00o = this.f37962OooO00o;
        OooO00o oooO00o2 = oooO00o.f37967OooO0Oo;
        while (true) {
            V v = null;
            if (oooO00o2.equals(oooO00o)) {
                return null;
            }
            ArrayList arrayList = oooO00o2.f37965OooO0O0;
            int size = arrayList != null ? arrayList.size() : 0;
            if (size > 0) {
                v = (V) oooO00o2.f37965OooO0O0.remove(size - 1);
            }
            if (v != null) {
                return v;
            }
            OooO00o<K, V> oooO00o3 = oooO00o2.f37967OooO0Oo;
            oooO00o3.f37966OooO0OO = oooO00o2.f37966OooO0OO;
            oooO00o2.f37966OooO0OO.f37967OooO0Oo = oooO00o3;
            HashMap map = this.f37963OooO0O0;
            Object obj = oooO00o2.f37964OooO00o;
            map.remove(obj);
            ((Oooo0) obj).OooO00o();
            oooO00o2 = oooO00o2.f37967OooO0Oo;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        OooO00o<K, V> oooO00o = this.f37962OooO00o;
        OooO00o oooO00o2 = oooO00o.f37966OooO0OO;
        boolean z = false;
        while (!oooO00o2.equals(oooO00o)) {
            sb.append('{');
            sb.append(oooO00o2.f37964OooO00o);
            sb.append(':');
            ArrayList arrayList = oooO00o2.f37965OooO0O0;
            sb.append(arrayList != null ? arrayList.size() : 0);
            sb.append("}, ");
            oooO00o2 = oooO00o2.f37966OooO0OO;
            z = true;
        }
        if (z) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
