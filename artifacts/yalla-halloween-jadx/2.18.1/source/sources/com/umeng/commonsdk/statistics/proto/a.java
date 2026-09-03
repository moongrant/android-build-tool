package com.umeng.commonsdk.statistics.proto;

import OooO00o.OooO00o;
import android.support.v4.media.session.OooOOO0;
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
public class a implements at<a, e>, Serializable, Cloneable {
    public static final Map<e, bf> e;
    private static final long f = 9132678615281394583L;
    private static final bx g = new bx("IdJournal");
    private static final bn h = new bn("domain", (byte) 11, 1);
    private static final bn i = new bn("old_id", (byte) 11, 2);
    private static final bn j = new bn("new_id", (byte) 11, 3);
    private static final bn k = new bn("ts", (byte) 10, 4);
    private static final Map<Class<? extends ca>, cb> l;
    private static final int m = 0;
    public String a;
    public String b;
    public String c;
    public long d;
    private byte n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private e[] f20255o;

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.a$a, reason: collision with other inner class name */
    public static class C0194a extends cc<a> {
        private C0194a() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, a aVar) throws az {
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
                            if (s != 4) {
                                bv.a(bsVar, b);
                            } else if (b == 10) {
                                aVar.d = bsVar.x();
                                aVar.d(true);
                            } else {
                                bv.a(bsVar, b);
                            }
                        } else if (b == 11) {
                            aVar.c = bsVar.z();
                            aVar.c(true);
                        } else {
                            bv.a(bsVar, b);
                        }
                    } else if (b == 11) {
                        aVar.b = bsVar.z();
                        aVar.b(true);
                    } else {
                        bv.a(bsVar, b);
                    }
                } else if (b == 11) {
                    aVar.a = bsVar.z();
                    aVar.a(true);
                } else {
                    bv.a(bsVar, b);
                }
                bsVar.m();
            }
            bsVar.k();
            if (aVar.m()) {
                aVar.n();
            } else {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Required field 'ts' was not found in serialized data! Struct: ");
                sbOooO0o0.append(toString());
                throw new bt(sbOooO0o0.toString());
            }
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, a aVar) throws az {
            aVar.n();
            bsVar.a(a.g);
            if (aVar.a != null) {
                bsVar.a(a.h);
                bsVar.a(aVar.a);
                bsVar.c();
            }
            if (aVar.b != null && aVar.g()) {
                bsVar.a(a.i);
                bsVar.a(aVar.b);
                bsVar.c();
            }
            if (aVar.c != null) {
                bsVar.a(a.j);
                bsVar.a(aVar.c);
                bsVar.c();
            }
            bsVar.a(a.k);
            bsVar.a(aVar.d);
            bsVar.c();
            bsVar.d();
            bsVar.b();
        }
    }

    public static class b implements cb {
        private b() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0194a b() {
            return new C0194a();
        }
    }

    public static class c extends cd<a> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.ca
        public void a(bs bsVar, a aVar) throws az {
            by byVar = (by) bsVar;
            byVar.a(aVar.a);
            byVar.a(aVar.c);
            byVar.a(aVar.d);
            BitSet bitSet = new BitSet();
            if (aVar.g()) {
                bitSet.set(0);
            }
            byVar.a(bitSet, 1);
            if (aVar.g()) {
                byVar.a(aVar.b);
            }
        }

        @Override // com.umeng.analytics.pro.ca
        public void b(bs bsVar, a aVar) throws az {
            by byVar = (by) bsVar;
            aVar.a = byVar.z();
            aVar.a(true);
            aVar.c = byVar.z();
            aVar.c(true);
            aVar.d = byVar.x();
            aVar.d(true);
            if (byVar.b(1).get(0)) {
                aVar.b = byVar.z();
                aVar.b(true);
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
        l = map;
        map.put(cc.class, new b());
        map.put(cd.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.DOMAIN, new bf("domain", (byte) 1, new bg((byte) 11)));
        enumMap.put(e.OLD_ID, new bf("old_id", (byte) 2, new bg((byte) 11)));
        enumMap.put(e.NEW_ID, new bf("new_id", (byte) 1, new bg((byte) 11)));
        enumMap.put(e.TS, new bf("ts", (byte) 1, new bg((byte) 10)));
        Map<e, bf> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        e = mapUnmodifiableMap;
        bf.a(a.class, mapUnmodifiableMap);
    }

    public a() {
        this.n = (byte) 0;
        this.f20255o = new e[]{e.OLD_ID};
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public a deepCopy() {
        return new a(this);
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
        this.b = null;
        this.c = null;
        d(false);
        this.d = 0L;
    }

    public boolean d() {
        return this.a != null;
    }

    public String e() {
        return this.b;
    }

    public void f() {
        this.b = null;
    }

    public boolean g() {
        return this.b != null;
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

    public long k() {
        return this.d;
    }

    public void l() {
        this.n = aq.b(this.n, 0);
    }

    public boolean m() {
        return aq.a(this.n, 0);
    }

    public void n() throws az {
        if (this.a == null) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Required field 'domain' was not present! Struct: ");
            sbOooO0o0.append(toString());
            throw new bt(sbOooO0o0.toString());
        }
        if (this.c != null) {
            return;
        }
        StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Required field 'new_id' was not present! Struct: ");
        sbOooO0o1.append(toString());
        throw new bt(sbOooO0o1.toString());
    }

    @Override // com.umeng.analytics.pro.at
    public void read(bs bsVar) throws az {
        l.get(bsVar.D()).b().b(bsVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdJournal(");
        sb.append("domain:");
        String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        if (g()) {
            sb.append(", ");
            sb.append("old_id:");
            String str2 = this.b;
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append(str2);
            }
        }
        sb.append(", ");
        sb.append("new_id:");
        String str3 = this.c;
        if (str3 == null) {
            sb.append("null");
        } else {
            sb.append(str3);
        }
        sb.append(", ");
        sb.append("ts:");
        return OooOOO0.OooO00o(sb, this.d, ")");
    }

    @Override // com.umeng.analytics.pro.at
    public void write(bs bsVar) throws az {
        l.get(bsVar.D()).b().a(bsVar, this);
    }

    public a a(String str) {
        this.a = str;
        return this;
    }

    public a b(String str) {
        this.b = str;
        return this;
    }

    public a c(String str) {
        this.c = str;
        return this;
    }

    public void d(boolean z) {
        this.n = aq.a(this.n, 0, z);
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.a = null;
    }

    public void b(boolean z) {
        if (z) {
            return;
        }
        this.b = null;
    }

    public void c(boolean z) {
        if (z) {
            return;
        }
        this.c = null;
    }

    public enum e implements ba {
        DOMAIN(1, "domain"),
        OLD_ID(2, "old_id"),
        NEW_ID(3, "new_id"),
        TS(4, "ts");

        private static final Map<String, e> e = new HashMap();
        private final short f;
        private final String g;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                e.put(eVar.b(), eVar);
            }
        }

        e(short s, String str) {
            this.f = s;
            this.g = str;
        }

        public static e a(int i) {
            if (i == 1) {
                return DOMAIN;
            }
            if (i == 2) {
                return OLD_ID;
            }
            if (i == 3) {
                return NEW_ID;
            }
            if (i != 4) {
                return null;
            }
            return TS;
        }

        public static e b(int i) {
            e eVarA = a(i);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalArgumentException(OooO0O0.OooO00o.OooO00o("Field ", i, " doesn't exist!"));
        }

        public static e a(String str) {
            return e.get(str);
        }

        @Override // com.umeng.analytics.pro.ba
        public short a() {
            return this.f;
        }

        @Override // com.umeng.analytics.pro.ba
        public String b() {
            return this.g;
        }
    }

    public a(String str, String str2, long j2) {
        this();
        this.a = str;
        this.c = str2;
        this.d = j2;
        d(true);
    }

    public a a(long j2) {
        this.d = j2;
        d(true);
        return this;
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new bm(new ce(objectOutputStream)));
        } catch (az e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public a(a aVar) {
        this.n = (byte) 0;
        this.f20255o = new e[]{e.OLD_ID};
        this.n = aVar.n;
        if (aVar.d()) {
            this.a = aVar.a;
        }
        if (aVar.g()) {
            this.b = aVar.b;
        }
        if (aVar.j()) {
            this.c = aVar.c;
        }
        this.d = aVar.d;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.n = (byte) 0;
            read(new bm(new ce(objectInputStream)));
        } catch (az e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
