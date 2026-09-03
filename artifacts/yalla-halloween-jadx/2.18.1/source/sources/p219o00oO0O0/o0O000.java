package p219o00oO0O0;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
import p243o00oo00O.o000;

/* JADX INFO: loaded from: classes.dex */
public final class o0O000 implements o0O00o0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final o0O00000<OooO00o, Object> f33638OooO00o = new o0O00000<>();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final OooO0O0 f33639OooO0O0 = new OooO0O0();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Map<Class<?>, NavigableMap<Integer, Integer>> f33640OooO0OO = new HashMap();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Map<Class<?>, o0oOO<?>> f33641OooO0Oo = new HashMap();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public int f33642OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final int f33643OooO0o0;

    public static final class OooO00o implements o0O000Oo {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final OooO0O0 f33644OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public int f33645OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public Class<?> f33646OooO0OO;

        public OooO00o(OooO0O0 oooO0O0) {
            this.f33644OooO00o = oooO0O0;
        }

        @Override // p219o00oO0O0.o0O000Oo
        public final void OooO00o() {
            this.f33644OooO00o.OooO0OO(this);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof OooO00o)) {
                return false;
            }
            OooO00o oooO00o = (OooO00o) obj;
            return this.f33645OooO0O0 == oooO00o.f33645OooO0O0 && this.f33646OooO0OO == oooO00o.f33646OooO0OO;
        }

        public final int hashCode() {
            int i = this.f33645OooO0O0 * 31;
            Class<?> cls = this.f33646OooO0OO;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Key{size=");
            sbOooO0o0.append(this.f33645OooO0O0);
            sbOooO0o0.append("array=");
            sbOooO0o0.append(this.f33646OooO0OO);
            sbOooO0o0.append('}');
            return sbOooO0o0.toString();
        }
    }

    public static final class OooO0O0 extends oo00oO<OooO00o> {
        @Override // p219o00oO0O0.oo00oO
        public final o0O000Oo OooO00o() {
            return new OooO00o(this);
        }

        public final OooO00o OooO0Oo(int i, Class<?> cls) {
            OooO00o oooO00oOooO0O0 = OooO0O0();
            oooO00oOooO0O0.f33645OooO0O0 = i;
            oooO00oOooO0O0.f33646OooO0OO = cls;
            return oooO00oOooO0O0;
        }
    }

    public o0O000(int i) {
        this.f33643OooO0o0 = i;
    }

    public final <T> T OooO(OooO00o oooO00o, Class<T> cls) {
        o0oOO<T> o0oooOooO0Oo = OooO0Oo(cls);
        T t = (T) this.f33638OooO00o.OooO00o(oooO00o);
        if (t != null) {
            this.f33642OooO0o -= o0oooOooO0Oo.OooO00o() * o0oooOooO0Oo.OooO0OO(t);
            OooO0O0(o0oooOooO0Oo.OooO0OO(t), cls);
        }
        if (t != null) {
            return t;
        }
        if (Log.isLoggable(o0oooOooO0Oo.OooO0O0(), 2)) {
            String strOooO0O0 = o0oooOooO0Oo.OooO0O0();
            StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("Allocated ");
            sbOooO0o0.append(oooO00o.f33645OooO0O0);
            sbOooO0o0.append(" bytes");
            Log.v(strOooO0O0, sbOooO0o0.toString());
        }
        return o0oooOooO0Oo.newArray(oooO00o.f33645OooO0O0);
    }

    @Override // p219o00oO0O0.o0O00o0
    public final synchronized void OooO00o(int i) {
        try {
            if (i >= 40) {
                synchronized (this) {
                    OooO0OO(0);
                }
            } else if (i >= 20 || i == 15) {
                OooO0OO(this.f33643OooO0o0 / 2);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void OooO0O0(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMapOooOO0 = OooOO0(cls);
        Integer num = navigableMapOooOO0.get(Integer.valueOf(i));
        if (num != null) {
            if (num.intValue() == 1) {
                navigableMapOooOO0.remove(Integer.valueOf(i));
                return;
            } else {
                navigableMapOooOO0.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
    }

    public final void OooO0OO(int i) {
        while (this.f33642OooO0o > i) {
            Object objOooO0Oo = this.f33638OooO00o.OooO0Oo();
            o000.OooO0O0(objOooO0Oo);
            o0oOO o0oooOooO0Oo = OooO0Oo(objOooO0Oo.getClass());
            this.f33642OooO0o -= o0oooOooO0Oo.OooO00o() * o0oooOooO0Oo.OooO0OO(objOooO0Oo);
            OooO0O0(o0oooOooO0Oo.OooO0OO(objOooO0Oo), objOooO0Oo.getClass());
            if (Log.isLoggable(o0oooOooO0Oo.OooO0O0(), 2)) {
                String strOooO0O0 = o0oooOooO0Oo.OooO0O0();
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("evicted: ");
                sbOooO0o0.append(o0oooOooO0Oo.OooO0OO(objOooO0Oo));
                Log.v(strOooO0O0, sbOooO0o0.toString());
            }
        }
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final <T> o0oOO<T> OooO0Oo(Class<T> cls) {
        o0oOO<T> o0Var = (o0oOO) this.f33641OooO0Oo.get(cls);
        if (o0Var == null) {
            if (cls.equals(int[].class)) {
                o0Var = new o0O0000O();
            } else {
                if (!cls.equals(byte[].class)) {
                    StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("No array pool found for: ");
                    sbOooO0o0.append(cls.getSimpleName());
                    throw new IllegalArgumentException(sbOooO0o0.toString());
                }
                o0Var = new o0();
            }
            this.f33641OooO0Oo.put((Class<?>) cls, (o0oOO<?>) o0Var);
        }
        return o0Var;
    }

    @Override // p219o00oO0O0.o0O00o0
    public final synchronized <T> void OooO0o(T t) {
        Class<?> cls = t.getClass();
        o0oOO<T> o0oooOooO0Oo = OooO0Oo(cls);
        int iOooO0OO = o0oooOooO0Oo.OooO0OO(t);
        int iOooO00o = o0oooOooO0Oo.OooO00o() * iOooO0OO;
        int iIntValue = 1;
        if (iOooO00o <= this.f33643OooO0o0 / 2) {
            OooO00o oooO00oOooO0Oo = this.f33639OooO0O0.OooO0Oo(iOooO0OO, cls);
            this.f33638OooO00o.OooO0O0(oooO00oOooO0Oo, t);
            NavigableMap<Integer, Integer> navigableMapOooOO0 = OooOO0(cls);
            Integer num = navigableMapOooOO0.get(Integer.valueOf(oooO00oOooO0Oo.f33645OooO0O0));
            Integer numValueOf = Integer.valueOf(oooO00oOooO0Oo.f33645OooO0O0);
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            navigableMapOooOO0.put(numValueOf, Integer.valueOf(iIntValue));
            this.f33642OooO0o += iOooO00o;
            OooO0OO(this.f33643OooO0o0);
        }
    }

    @Override // p219o00oO0O0.o0O00o0
    public final synchronized void OooO0o0() {
        OooO0OO(0);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002c  */
    @Override // p219o00oO0O0.o0O00o0
    public final synchronized <T> T OooO0oO(int i, Class<T> cls) {
        Integer numCeilingKey;
        boolean z;
        numCeilingKey = OooOO0(cls).ceilingKey(Integer.valueOf(i));
        z = true;
        if (numCeilingKey == null) {
            z = false;
        } else {
            int i2 = this.f33642OooO0o;
            if (!(i2 == 0 || this.f33643OooO0o0 / i2 >= 2) && numCeilingKey.intValue() > i * 8) {
                z = false;
            }
        }
        return (T) OooO(z ? this.f33639OooO0O0.OooO0Oo(numCeilingKey.intValue(), cls) : this.f33639OooO0O0.OooO0Oo(i, cls), cls);
    }

    @Override // p219o00oO0O0.o0O00o0
    public final synchronized Object OooO0oo() {
        return OooO(this.f33639OooO0O0.OooO0Oo(8, byte[].class), byte[].class);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final NavigableMap<Integer, Integer> OooOO0(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f33640OooO0OO.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f33640OooO0OO.put(cls, treeMap);
        return treeMap;
    }
}
