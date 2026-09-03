package p156o00OoO00;

import android.util.Log;
import java.util.HashMap;
import java.util.NavigableMap;
import java.util.TreeMap;
import p174o00OooOo.o00OO00O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOo00 implements OooO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final OooOOO<OooO00o, Object> f37978OooO00o = new OooOOO<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f37979OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final HashMap f37980OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final HashMap f37981OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f37982OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f37983OooO0o0;

    public static final class OooO00o implements Oooo0 {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0 f37984OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f37985OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Class<?> f37986OooO0OO;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f37984OooO00o = oooO0O0;
        }

        @Override // p156o00OoO00.Oooo0
        public final void OooO00o() {
            this.f37984OooO00o.OooO0OO(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f37985OooO0O0 == oooO00o.f37985OooO0O0 && this.f37986OooO0OO == oooO00o.f37986OooO0OO;
        }

        public final int hashCode() {
            int i = this.f37985OooO0O0 * 31;
            Class<?> cls = this.f37986OooO0OO;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            return "Key{size=" + this.f37985OooO0O0 + "array=" + this.f37986OooO0OO + '}';
        }
    }

    public static final class OooO0O0 extends OooO<OooO00o> {
        @Override // p156o00OoO00.OooO
        public final Oooo0 OooO00o() {
            return new OooO00o(this);
        }
    }

    public OooOo00(int i) {
        this.f37983OooO0o0 = i;
    }

    public final NavigableMap<Integer, Integer> OooO(Class<?> cls) {
        HashMap map = this.f37980OooO0OO;
        NavigableMap<Integer, Integer> navigableMap = (NavigableMap) map.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        map.put(cls, treeMap);
        return treeMap;
    }

    @Override // p156o00OoO00.OooO0o
    public final synchronized void OooO00o(int i) {
        try {
            if (i >= 40) {
                OooO0O0();
            } else if (i >= 20 || i == 15) {
                OooO0o(this.f37983OooO0o0 / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p156o00OoO00.OooO0o
    public final synchronized void OooO0O0() {
        OooO0o(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p156o00OoO00.OooO0o
    public final synchronized <T> T OooO0OO(int i, Class<T> cls) {
        OooO00o oooO00oOooO0O0;
        Integer numCeilingKey = OooO(cls).ceilingKey(Integer.valueOf(i));
        boolean z = false;
        if (numCeilingKey != null) {
            int i2 = this.f37982OooO0o;
            if ((i2 == 0 || this.f37983OooO0o0 / i2 >= 2) || numCeilingKey.intValue() <= i * 8) {
                z = true;
            }
        }
        if (z) {
            OooO0O0 oooO0O0 = this.f37979OooO0O0;
            int iIntValue = numCeilingKey.intValue();
            oooO00oOooO0O0 = oooO0O0.OooO0O0();
            oooO00oOooO0O0.f37985OooO0O0 = iIntValue;
            oooO00oOooO0O0.f37986OooO0OO = cls;
        } else {
            OooO00o oooO00oOooO0O1 = this.f37979OooO0O0.OooO0O0();
            oooO00oOooO0O1.f37985OooO0O0 = i;
            oooO00oOooO0O1.f37986OooO0OO = cls;
            oooO00oOooO0O0 = oooO00oOooO0O1;
        }
        return (T) OooO0oo(oooO00oOooO0O0, cls);
    }

    @Override // p156o00OoO00.OooO0o
    public final synchronized Object OooO0Oo() {
        OooO00o oooO00oOooO0O0;
        oooO00oOooO0O0 = this.f37979OooO0O0.OooO0O0();
        oooO00oOooO0O0.f37985OooO0O0 = 8;
        oooO00oOooO0O0.f37986OooO0OO = byte[].class;
        return OooO0oo(oooO00oOooO0O0, byte[].class);
    }

    public final void OooO0o(int i) {
        while (this.f37982OooO0o > i) {
            Object objOooO0OO = this.f37978OooO00o.OooO0OO();
            o00OO00O.OooO0O0(objOooO0OO);
            OooO0OO OooO0oO2 = OooO0oO(objOooO0OO.getClass());
            this.f37982OooO0o -= OooO0oO2.OooO00o() * OooO0oO2.OooO0O0(objOooO0OO);
            OooO0o0(OooO0oO2.OooO0O0(objOooO0OO), objOooO0OO.getClass());
            if (Log.isLoggable(OooO0oO2.getTag(), 2)) {
                Log.v(OooO0oO2.getTag(), "evicted: " + OooO0oO2.OooO0O0(objOooO0OO));
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

    public final <T> OooO0OO<T> OooO0oO(Class<T> cls) {
        HashMap map = this.f37981OooO0Oo;
        OooO0OO<T> oooOOO0 = (OooO0OO) map.get(cls);
        if (oooOOO0 == null) {
            if (cls.equals(int[].class)) {
                oooOOO0 = new OooOOOO();
            } else {
                if (!cls.equals(byte[].class)) {
                    throw new IllegalArgumentException("No array pool found for: ".concat(cls.getSimpleName()));
                }
                oooOOO0 = new OooOOO0();
            }
            map.put(cls, oooOOO0);
        }
        return oooOOO0;
    }

    public final <T> T OooO0oo(OooO00o oooO00o, Class<T> cls) {
        OooO0OO<T> OooO0oO2 = OooO0oO(cls);
        T t = (T) this.f37978OooO00o.OooO00o(oooO00o);
        if (t != null) {
            this.f37982OooO0o -= OooO0oO2.OooO00o() * OooO0oO2.OooO0O0(t);
            OooO0o0(OooO0oO2.OooO0O0(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(OooO0oO2.getTag(), 2)) {
            Log.v(OooO0oO2.getTag(), "Allocated " + oooO00o.f37985OooO0O0 + " bytes");
        }
        return OooO0oO2.newArray(oooO00o.f37985OooO0O0);
    }

    @Override // p156o00OoO00.OooO0o
    public final synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        OooO0OO<T> OooO0oO2 = OooO0oO(cls);
        int iOooO0O0 = OooO0oO2.OooO0O0(t);
        int iOooO00o = OooO0oO2.OooO00o() * iOooO0O0;
        int iIntValue = 1;
        if (iOooO00o <= this.f37983OooO0o0 / 2) {
            OooO00o oooO00oOooO0O0 = this.f37979OooO0O0.OooO0O0();
            oooO00oOooO0O0.f37985OooO0O0 = iOooO0O0;
            oooO00oOooO0O0.f37986OooO0OO = cls;
            this.f37978OooO00o.OooO0O0(oooO00oOooO0O0, t);
            NavigableMap<Integer, Integer> navigableMapOooO = OooO(cls);
            Integer num = navigableMapOooO.get(Integer.valueOf(oooO00oOooO0O0.f37985OooO0O0));
            Integer numValueOf = Integer.valueOf(oooO00oOooO0O0.f37985OooO0O0);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapOooO.put(numValueOf, Integer.valueOf(iIntValue));
            this.f37982OooO0o += iOooO00o;
            OooO0o(this.f37983OooO0o0);
        }
    }
}
