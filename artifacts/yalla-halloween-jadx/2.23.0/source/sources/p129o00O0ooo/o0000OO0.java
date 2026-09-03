package p129o00O0ooo;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import p532o0o0Oo.o0000O00;

/* JADX INFO: loaded from: classes2.dex */
public final class o0000OO0 implements o0000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o000OO<OooO00o, Object> f36964OooO00o = new o000OO<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f36965OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f36966OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f36967OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f36968OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f36969OooO0o0;

    public static final class OooO00o implements o000O0o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0 f36970OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f36971OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Class<?> f36972OooO0OO;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f36970OooO00o = oooO0O0;
        }

        @Override // p129o00O0ooo.o000O0o
        public final void OooO00o() {
            this.f36970OooO00o.OooO0OO(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f36971OooO0O0 == oooO00o.f36971OooO0O0 && this.f36972OooO0OO == oooO00o.f36972OooO0OO;
        }

        public final int hashCode() {
            int i = this.f36971OooO0O0 * 31;
            Class<?> cls = this.f36972OooO0OO;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f36971OooO0O0 + "array=" + this.f36972OooO0OO + '}';
        }
    }

    public static final class OooO0O0 extends o0000O00<OooO00o> {
        @Override // p129o00O0ooo.o0000O00
        public final o000O0o OooO00o() {
            return new OooO00o(this);
        }
    }

    public o0000OO0(int i) {
        this.f36969OooO0o0 = i;
    }

    public final NavigableMap<Integer, Integer> OooO(Class<?> cls) {
        HashMap map = this.f36966OooO0OO;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    @Override // p129o00O0ooo.o0000
    public final synchronized void OooO00o(int i) {
        try {
            if (i >= 40) {
                OooO0O0();
            } else if (i >= 20 || i == 15) {
                OooO0o(this.f36969OooO0o0 / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p129o00O0ooo.o0000
    public final synchronized void OooO0O0() {
        OooO0o(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p129o00O0ooo.o0000
    public final synchronized <T> T OooO0OO(int i, Class<T> cls) {
        OooO00o oooO00oOooO0O0;
        Integer numCeilingKey = OooO(cls).ceilingKey(Integer.valueOf(i));
        boolean z = false;
        if (numCeilingKey != null) {
            int i2 = this.f36968OooO0o;
            if ((i2 == 0 || this.f36969OooO0o0 / i2 >= 2) || numCeilingKey.intValue() <= i * 8) {
                z = true;
            }
        }
        if (z) {
            OooO0O0 oooO0O0 = this.f36965OooO0O0;
            int iIntValue = numCeilingKey.intValue();
            oooO00oOooO0O0 = oooO0O0.OooO0O0();
            oooO00oOooO0O0.f36971OooO0O0 = iIntValue;
            oooO00oOooO0O0.f36972OooO0OO = cls;
        } else {
            OooO00o oooO00oOooO0O1 = this.f36965OooO0O0.OooO0O0();
            oooO00oOooO0O1.f36971OooO0O0 = i;
            oooO00oOooO0O1.f36972OooO0OO = cls;
            oooO00oOooO0O0 = oooO00oOooO0O1;
        }
        return (T) OooO0oo(oooO00oOooO0O0, cls);
    }

    @Override // p129o00O0ooo.o0000
    public final synchronized Object OooO0Oo() {
        OooO00o oooO00oOooO0O0;
        oooO00oOooO0O0 = this.f36965OooO0O0.OooO0O0();
        oooO00oOooO0O0.f36971OooO0O0 = 8;
        oooO00oOooO0O0.f36972OooO0OO = byte[].class;
        return OooO0oo(oooO00oOooO0O0, byte[].class);
    }

    public final void OooO0o(int i) {
        while (this.f36968OooO0o > i) {
            Object objOooO0OO = this.f36964OooO00o.OooO0OO();
            o0000O00.OooO0O0(objOooO0OO);
            o0000Ooo o0000oooOooO0oO = OooO0oO(objOooO0OO.getClass());
            this.f36968OooO0o -= o0000oooOooO0oO.OooO00o() * o0000oooOooO0oO.OooO0O0(objOooO0OO);
            OooO0o0(o0000oooOooO0oO.OooO0O0(objOooO0OO), objOooO0OO.getClass());
            if (Log.isLoggable(o0000oooOooO0oO.getTag(), 2)) {
                Log.v(o0000oooOooO0oO.getTag(), "evicted: " + o0000oooOooO0oO.OooO0O0(objOooO0OO));
            }
        }
    }

    public final void OooO0o0(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapOooO = OooO(cls);
        Integer num = navigableMapOooO.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapOooO.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapOooO.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final <T> o0000Ooo<T> OooO0oO(Class<T> cls) {
        HashMap map = this.f36967OooO0Oo;
        o0000Ooo<T> o0000o0o2 = (o0000Ooo) map.get(cls);
        if (o0000o0o2 == null) {
            if (cls.equals(int[].class)) {
                o0000o0o2 = new o0000O();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                o0000o0o2 = new o0000O0O();
            }
            map.put(cls, o0000o0o2);
        }
        return o0000o0o2;
    }

    public final <T> T OooO0oo(OooO00o oooO00o, Class<T> cls) {
        o0000Ooo<T> o0000oooOooO0oO = OooO0oO(cls);
        T t = (T) this.f36964OooO00o.OooO00o(oooO00o);
        if (t != null) {
            this.f36968OooO0o -= o0000oooOooO0oO.OooO00o() * o0000oooOooO0oO.OooO0O0(t);
            OooO0o0(o0000oooOooO0oO.OooO0O0(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(o0000oooOooO0oO.getTag(), 2)) {
            Log.v(o0000oooOooO0oO.getTag(), "Allocated " + oooO00o.f36971OooO0O0 + " bytes");
        }
        return o0000oooOooO0oO.newArray(oooO00o.f36971OooO0O0);
    }

    @Override // p129o00O0ooo.o0000
    public final synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        o0000Ooo<T> o0000oooOooO0oO = OooO0oO(cls);
        int iOooO0O0 = o0000oooOooO0oO.OooO0O0(t);
        int iOooO00o = o0000oooOooO0oO.OooO00o() * iOooO0O0;
        int iIntValue = 1;
        if (iOooO00o <= this.f36969OooO0o0 / 2) {
            OooO00o oooO00oOooO0O0 = this.f36965OooO0O0.OooO0O0();
            oooO00oOooO0O0.f36971OooO0O0 = iOooO0O0;
            oooO00oOooO0O0.f36972OooO0OO = cls;
            this.f36964OooO00o.OooO0O0(oooO00oOooO0O0, t);
            NavigableMap<Integer, Integer> navigableMapOooO = OooO(cls);
            Integer num = navigableMapOooO.get(Integer.valueOf(oooO00oOooO0O0.f36971OooO0O0));
            Integer numValueOf = Integer.valueOf(oooO00oOooO0O0.f36971OooO0O0);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapOooO.put(numValueOf, Integer.valueOf(iIntValue));
            this.f36968OooO0o += iOooO00o;
            OooO0o(this.f36969OooO0o0);
        }
    }
}
