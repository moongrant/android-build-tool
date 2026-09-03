package com.umeng.commonsdk.statistics.proto;

import OooO00o.OooO00o;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.umeng.analytics.pro.aq;
import com.umeng.analytics.pro.at;
import com.umeng.analytics.pro.az;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bf;
import com.umeng.analytics.pro.bg;
import com.umeng.analytics.pro.bm;
import com.umeng.analytics.pro.bn;
import com.umeng.analytics.pro.bs;
import com.umeng.analytics.pro.bt;
import com.umeng.analytics.pro.bv;
import com.umeng.analytics.pro.bx;
import com.umeng.analytics.pro.by;
import com.umeng.analytics.pro.ca;
import com.umeng.analytics.pro.cb;
import com.umeng.analytics.pro.cc;
import com.umeng.analytics.pro.cd;
import com.umeng.analytics.pro.ce;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class e implements at<e, EnumC0198e>, Serializable, Cloneable {
    public static final Map<EnumC0198e, bf> d;
    private static final long e = 7501688097813630241L;
    private static final bx f = new bx("ImprintValue");
    private static final bn g = new bn(AppMeasurementSdk.ConditionalUserProperty.VALUE, (byte) 11, 1);
    private static final bn h = new bn("ts", (byte) 10, 2);
    private static final bn i = new bn("guid", (byte) 11, 3);
    private static final Map<Class<? extends ca>, cb> j;
    private static final int k = 0;
    public String a;
    public long b;
    public String c;
    private byte l;
    private EnumC0198e[] m;

    public static class a extends cc<e> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, e eVar) throws az {
            bsVar.j();
            while (true) {
                bn bnVarL = bsVar.l();
                byte b = bnVarL.b;
                if (b == 0) {
                    break;
                }
                short s = bnVarL.c;
                if (s != 1) {
                    if (s != 2) {
                        if (s != 3) {
                            bv.a(bsVar, b);
                        } else if (b == 11) {
                            eVar.c = bsVar.z();
                            eVar.c(true);
                        } else {
                            bv.a(bsVar, b);
                        }
                    } else if (b == 10) {
                        eVar.b = bsVar.x();
                        eVar.b(true);
                    } else {
                        bv.a(bsVar, b);
                    }
                } else if (b == 11) {
                    eVar.a = bsVar.z();
                    eVar.a(true);
                } else {
                    bv.a(bsVar, b);
                }
                bsVar.m();
            }
            bsVar.k();
            if (eVar.g()) {
                eVar.k();
            } else {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Required field 'ts' was not found in serialized data! Struct: ");
                sbOooO0o0.append(toString());
                throw new bt(sbOooO0o0.toString());
            }
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, e eVar) throws az {
            eVar.k();
            bsVar.a(e.f);
            if (eVar.a != null && eVar.d()) {
                bsVar.a(e.g);
                bsVar.a(eVar.a);
                bsVar.c();
            }
            bsVar.a(e.h);
            bsVar.a(eVar.b);
            bsVar.c();
            if (eVar.c != null) {
                bsVar.a(e.i);
                bsVar.a(eVar.c);
                bsVar.c();
            }
            bsVar.d();
            bsVar.b();
        }
    }

    public static class b implements cb {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    public static class c extends cd<e> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.ca
        public void a(bs bsVar, e eVar) throws az {
            by byVar = (by) bsVar;
            byVar.a(eVar.b);
            byVar.a(eVar.c);
            BitSet bitSet = new BitSet();
            if (eVar.d()) {
                bitSet.set(0);
            }
            byVar.a(bitSet, 1);
            if (eVar.d()) {
                byVar.a(eVar.a);
            }
        }

        @Override // com.umeng.analytics.pro.ca
        public void b(bs bsVar, e eVar) throws az {
            by byVar = (by) bsVar;
            eVar.b = byVar.x();
            eVar.b(true);
            eVar.c = byVar.z();
            eVar.c(true);
            if (byVar.b(1).get(0)) {
                eVar.a = byVar.z();
                eVar.a(true);
            }
        }
    }

    public static class d implements cb {
        private d() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public c b() {
            return new c();
        }
    }

    static {
        HashMap map = new HashMap();
        j = map;
        map.put(cc.class, new b());
        map.put(cd.class, new d());
        EnumMap enumMap = new EnumMap(EnumC0198e.class);
        enumMap.put(EnumC0198e.VALUE, new bf(AppMeasurementSdk.ConditionalUserProperty.VALUE, (byte) 2, new bg((byte) 11)));
        enumMap.put(EnumC0198e.TS, new bf("ts", (byte) 1, new bg((byte) 10)));
        enumMap.put(EnumC0198e.GUID, new bf("guid", (byte) 1, new bg((byte) 11)));
        Map<EnumC0198e, bf> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        d = mapUnmodifiableMap;
        bf.a(e.class, mapUnmodifiableMap);
    }

    public e() {
        this.l = (byte) 0;
        this.m = new EnumC0198e[]{EnumC0198e.VALUE};
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e deepCopy() {
        return new e(this);
    }

    public String b() {
        return this.a;
    }

    public void c() {
        this.a = null;
    }

    @Override // com.umeng.analytics.pro.at
    public void clear() {
        this.a = null;
        b(false);
        this.b = 0L;
        this.c = null;
    }

    public boolean d() {
        return this.a != null;
    }

    public long e() {
        return this.b;
    }

    public void f() {
        this.l = aq.b(this.l, 0);
    }

    public boolean g() {
        return aq.a(this.l, 0);
    }

    public String h() {
        return this.c;
    }

    public void i() {
        this.c = null;
    }

    public boolean j() {
        return this.c != null;
    }

    public void k() throws az {
        if (this.c != null) {
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Required field 'guid' was not present! Struct: ");
        sbOooO0o0.append(toString());
        throw new bt(sbOooO0o0.toString());
    }

    @Override // com.umeng.analytics.pro.at
    public void read(bs bsVar) throws az {
        j.get(bsVar.D()).b().b(bsVar, this);
    }

    public String toString() {
        boolean z;
        StringBuilder sb = new StringBuilder("ImprintValue(");
        if (d()) {
            sb.append("value:");
            String str = this.a;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            sb.append(", ");
        }
        sb.append("ts:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("guid:");
        String str2 = this.c;
        if (str2 == null) {
            sb.append("null");
        } else {
            sb.append(str2);
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // com.umeng.analytics.pro.at
    public void write(bs bsVar) throws az {
        j.get(bsVar.D()).b().a(bsVar, this);
    }

    public e a(String str) {
        this.a = str;
        return this;
    }

    public void b(boolean z) {
        this.l = aq.a(this.l, 0, z);
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        this.c = null;
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.e$e, reason: collision with other inner class name */
    public enum EnumC0198e implements ba {
        VALUE(1, AppMeasurementSdk.ConditionalUserProperty.VALUE),
        TS(2, "ts"),
        GUID(3, "guid");

        private static final Map<String, EnumC0198e> d = new HashMap();
        private final short e;
        private final String f;

        static {
            for (EnumC0198e enumC0198e : EnumSet.allOf(EnumC0198e.class)) {
                d.put(enumC0198e.b(), enumC0198e);
            }
        }

        EnumC0198e(short s, String str) {
            this.e = s;
            this.f = str;
        }

        public static EnumC0198e a(int i) {
            if (i == 1) {
                return VALUE;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return GUID;
        }

        public static EnumC0198e b(int i) {
            EnumC0198e enumC0198eA = a(i);
            if (enumC0198eA != null) {
                return enumC0198eA;
            }
            throw new IllegalArgumentException(OooO0O0.OooO00o.OooO00o("Field ", i, " doesn't exist!"));
        }

        public static EnumC0198e a(String str) {
            return d.get(str);
        }

        @Override // com.umeng.analytics.pro.ba
        public short a() {
            return this.e;
        }

        @Override // com.umeng.analytics.pro.ba
        public String b() {
            return this.f;
        }
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.a = null;
    }

    public e b(String str) {
        this.c = str;
        return this;
    }

    public e(long j2, String str) {
        this();
        this.b = j2;
        b(true);
        this.c = str;
    }

    public e a(long j2) {
        this.b = j2;
        b(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public EnumC0198e fieldForId(int i2) {
        return EnumC0198e.a(i2);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new bm(new ce(objectOutputStream)));
        } catch (az e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public e(e eVar) {
        this.l = (byte) 0;
        this.m = new EnumC0198e[]{EnumC0198e.VALUE};
        this.l = eVar.l;
        if (eVar.d()) {
            this.a = eVar.a;
        }
        this.b = eVar.b;
        if (eVar.j()) {
            this.c = eVar.c;
        }
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.l = (byte) 0;
            read(new bm(new ce(objectInputStream)));
        } catch (az e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
