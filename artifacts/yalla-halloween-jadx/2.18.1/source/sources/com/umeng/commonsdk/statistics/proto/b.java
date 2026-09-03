package com.umeng.commonsdk.statistics.proto;

import OooO00o.OooO00o;
import com.facebook.internal.ServerProtocol;
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
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import o0O0O00.o0ooOOo;

/* JADX INFO: loaded from: classes2.dex */
public class b implements at<b, e>, Serializable, Cloneable {
    public static final Map<e, bf> d;
    private static final long e = -6496538196005191531L;
    private static final bx f = new bx("IdSnapshot");
    private static final bn g = new bn("identity", (byte) 11, 1);
    private static final bn h = new bn("ts", (byte) 10, 2);
    private static final bn i = new bn(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, (byte) 8, 3);
    private static final Map<Class<? extends ca>, cb> j;
    private static final int k = 0;
    private static final int l = 1;
    public String a;
    public long b;
    public int c;
    private byte m;

    public static class a extends cc<b> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, b bVar) throws az {
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
                        } else if (b == 8) {
                            bVar.c = bsVar.w();
                            bVar.c(true);
                        } else {
                            bv.a(bsVar, b);
                        }
                    } else if (b == 10) {
                        bVar.b = bsVar.x();
                        bVar.b(true);
                    } else {
                        bv.a(bsVar, b);
                    }
                } else if (b == 11) {
                    bVar.a = bsVar.z();
                    bVar.a(true);
                } else {
                    bv.a(bsVar, b);
                }
                bsVar.m();
            }
            bsVar.k();
            if (!bVar.g()) {
                StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Required field 'ts' was not found in serialized data! Struct: ");
                sbOooO0o0.append(toString());
                throw new bt(sbOooO0o0.toString());
            }
            if (bVar.j()) {
                bVar.k();
            } else {
                StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Required field 'version' was not found in serialized data! Struct: ");
                sbOooO0o1.append(toString());
                throw new bt(sbOooO0o1.toString());
            }
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, b bVar) throws az {
            bVar.k();
            bsVar.a(b.f);
            if (bVar.a != null) {
                bsVar.a(b.g);
                bsVar.a(bVar.a);
                bsVar.c();
            }
            bsVar.a(b.h);
            bsVar.a(bVar.b);
            bsVar.c();
            bsVar.a(b.i);
            bsVar.a(bVar.c);
            bsVar.c();
            bsVar.d();
            bsVar.b();
        }
    }

    /* JADX INFO: renamed from: com.umeng.commonsdk.statistics.proto.b$b, reason: collision with other inner class name */
    public static class C0195b implements cb {
        private C0195b() {
        }

        @Override // com.umeng.analytics.pro.cb
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a b() {
            return new a();
        }
    }

    public static class c extends cd<b> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.ca
        public void a(bs bsVar, b bVar) throws az {
            by byVar = (by) bsVar;
            byVar.a(bVar.a);
            byVar.a(bVar.b);
            byVar.a(bVar.c);
        }

        @Override // com.umeng.analytics.pro.ca
        public void b(bs bsVar, b bVar) throws az {
            by byVar = (by) bsVar;
            bVar.a = byVar.z();
            bVar.a(true);
            bVar.b = byVar.x();
            bVar.b(true);
            bVar.c = byVar.w();
            bVar.c(true);
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
        map.put(cc.class, new C0195b());
        map.put(cd.class, new d());
        EnumMap enumMap = new EnumMap(e.class);
        enumMap.put(e.IDENTITY, new bf("identity", (byte) 1, new bg((byte) 11)));
        enumMap.put(e.TS, new bf("ts", (byte) 1, new bg((byte) 10)));
        enumMap.put(e.VERSION, new bf(ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION, (byte) 1, new bg((byte) 8)));
        Map<e, bf> mapUnmodifiableMap = Collections.unmodifiableMap(enumMap);
        d = mapUnmodifiableMap;
        bf.a(b.class, mapUnmodifiableMap);
    }

    public b() {
        this.m = (byte) 0;
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public b deepCopy() {
        return new b(this);
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
        c(false);
        this.c = 0;
    }

    public boolean d() {
        return this.a != null;
    }

    public long e() {
        return this.b;
    }

    public void f() {
        this.m = aq.b(this.m, 0);
    }

    public boolean g() {
        return aq.a(this.m, 0);
    }

    public int h() {
        return this.c;
    }

    public void i() {
        this.m = aq.b(this.m, 1);
    }

    public boolean j() {
        return aq.a(this.m, 1);
    }

    public void k() throws az {
        if (this.a != null) {
            return;
        }
        StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Required field 'identity' was not present! Struct: ");
        sbOooO0o0.append(toString());
        throw new bt(sbOooO0o0.toString());
    }

    @Override // com.umeng.analytics.pro.at
    public void read(bs bsVar) throws az {
        j.get(bsVar.D()).b().b(bsVar, this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("IdSnapshot(");
        sb.append("identity:");
        String str = this.a;
        if (str == null) {
            sb.append("null");
        } else {
            sb.append(str);
        }
        sb.append(", ");
        sb.append("ts:");
        sb.append(this.b);
        sb.append(", ");
        sb.append("version:");
        return o0ooOOo.OooO00o(sb, this.c, ")");
    }

    @Override // com.umeng.analytics.pro.at
    public void write(bs bsVar) throws az {
        j.get(bsVar.D()).b().a(bsVar, this);
    }

    public b a(String str) {
        this.a = str;
        return this;
    }

    public void b(boolean z) {
        this.m = aq.a(this.m, 0, z);
    }

    public void c(boolean z) {
        this.m = aq.a(this.m, 1, z);
    }

    public enum e implements ba {
        IDENTITY(1, "identity"),
        TS(2, "ts"),
        VERSION(3, ServerProtocol.FALLBACK_DIALOG_PARAM_VERSION);

        private static final Map<String, e> d = new HashMap();
        private final short e;
        private final String f;

        static {
            for (e eVar : EnumSet.allOf(e.class)) {
                d.put(eVar.b(), eVar);
            }
        }

        e(short s, String str) {
            this.e = s;
            this.f = str;
        }

        public static e a(int i) {
            if (i == 1) {
                return IDENTITY;
            }
            if (i == 2) {
                return TS;
            }
            if (i != 3) {
                return null;
            }
            return VERSION;
        }

        public static e b(int i) {
            e eVarA = a(i);
            if (eVarA != null) {
                return eVarA;
            }
            throw new IllegalArgumentException(OooO0O0.OooO00o.OooO00o("Field ", i, " doesn't exist!"));
        }

        public static e a(String str) {
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

    public b(String str, long j2, int i2) {
        this();
        this.a = str;
        this.b = j2;
        b(true);
        this.c = i2;
        c(true);
    }

    public void a(boolean z) {
        if (z) {
            return;
        }
        this.a = null;
    }

    @Override // com.umeng.analytics.pro.at
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e fieldForId(int i2) {
        return e.a(i2);
    }

    public b a(long j2) {
        this.b = j2;
        b(true);
        return this;
    }

    public b a(int i2) {
        this.c = i2;
        c(true);
        return this;
    }

    private void a(ObjectOutputStream objectOutputStream) throws IOException {
        try {
            write(new bm(new ce(objectOutputStream)));
        } catch (az e2) {
            throw new IOException(e2.getMessage());
        }
    }

    public b(b bVar) {
        this.m = (byte) 0;
        this.m = bVar.m;
        if (bVar.d()) {
            this.a = bVar.a;
        }
        this.b = bVar.b;
        this.c = bVar.c;
    }

    private void a(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        try {
            this.m = (byte) 0;
            read(new bm(new ce(objectInputStream)));
        } catch (az e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
