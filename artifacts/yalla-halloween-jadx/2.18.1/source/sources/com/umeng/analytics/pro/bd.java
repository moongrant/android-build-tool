package com.umeng.analytics.pro;

import com.facebook.internal.security.CertificateUtil;
import com.umeng.analytics.pro.ba;
import com.umeng.analytics.pro.bd;
import com.zego.zegoavkit2.ZegoConstants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public abstract class bd<T extends bd<?, ?>, F extends ba> implements at<T, F> {
    private static final Map<Class<? extends ca>, cb> c;
    public Object a;
    public F b;

    public static class a extends cc<bd> {
        private a() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, bd bdVar) throws az {
            bdVar.b = null;
            bdVar.a = null;
            bsVar.j();
            bn bnVarL = bsVar.l();
            Object objA = bdVar.a(bsVar, bnVarL);
            bdVar.a = objA;
            if (objA != null) {
                bdVar.b = (F) bdVar.a(bnVarL.c);
            }
            bsVar.m();
            bsVar.l();
            bsVar.k();
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, bd bdVar) throws az {
            if (bdVar.a() == null || bdVar.b() == null) {
                throw new bt("Cannot write a TUnion with no set value!");
            }
            bsVar.a(bdVar.d());
            bsVar.a(bdVar.c(bdVar.b));
            bdVar.a(bsVar);
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
        public a b() {
            return new a();
        }
    }

    public static class c extends cd<bd> {
        private c() {
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void b(bs bsVar, bd bdVar) throws az {
            bdVar.b = null;
            bdVar.a = null;
            short sV = bsVar.v();
            Object objA = bdVar.a(bsVar, sV);
            bdVar.a = objA;
            if (objA != null) {
                bdVar.b = (F) bdVar.a(sV);
            }
        }

        @Override // com.umeng.analytics.pro.ca
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(bs bsVar, bd bdVar) throws az {
            if (bdVar.a() == null || bdVar.b() == null) {
                throw new bt("Cannot write a TUnion with no set value!");
            }
            bsVar.a(bdVar.b.a());
            bdVar.b(bsVar);
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
        c = map;
        map.put(cc.class, new b());
        map.put(cd.class, new d());
    }

    public bd() {
        this.b = null;
        this.a = null;
    }

    private static Object a(Object obj) {
        if (obj instanceof at) {
            return ((at) obj).deepCopy();
        }
        if (obj instanceof ByteBuffer) {
            return au.d((ByteBuffer) obj);
        }
        if (obj instanceof List) {
            return a((List) obj);
        }
        if (obj instanceof Set) {
            return a((Set) obj);
        }
        return obj instanceof Map ? a((Map<Object, Object>) obj) : obj;
    }

    public abstract F a(short s);

    public abstract Object a(bs bsVar, bn bnVar) throws az;

    public abstract Object a(bs bsVar, short s) throws az;

    public abstract void a(bs bsVar) throws az;

    public Object b() {
        return this.a;
    }

    public abstract void b(F f, Object obj) throws ClassCastException;

    public abstract void b(bs bsVar) throws az;

    public abstract bn c(F f);

    public boolean c() {
        return this.b != null;
    }

    @Override // com.umeng.analytics.pro.at
    public final void clear() {
        this.b = null;
        this.a = null;
    }

    public abstract bx d();

    @Override // com.umeng.analytics.pro.at
    public void read(bs bsVar) throws az {
        c.get(bsVar.D()).b().b(bsVar, this);
    }

    public String toString() {
        StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("<");
        sbOooO0o0.append(getClass().getSimpleName());
        sbOooO0o0.append(ZegoConstants.ZegoVideoDataAuxPublishingStream);
        if (a() != null) {
            Object objB = b();
            sbOooO0o0.append(c(a()).a);
            sbOooO0o0.append(CertificateUtil.DELIMITER);
            if (objB instanceof ByteBuffer) {
                au.a((ByteBuffer) objB, sbOooO0o0);
            } else {
                sbOooO0o0.append(objB.toString());
            }
        }
        sbOooO0o0.append(">");
        return sbOooO0o0.toString();
    }

    @Override // com.umeng.analytics.pro.at
    public void write(bs bsVar) throws az {
        c.get(bsVar.D()).b().a(bsVar, this);
    }

    public boolean b(F f) {
        return this.b == f;
    }

    public boolean b(int i) {
        return b(a((short) i));
    }

    public bd(F f, Object obj) {
        a(f, obj);
    }

    public bd(bd<T, F> bdVar) {
        if (bdVar.getClass().equals(getClass())) {
            this.b = bdVar.b;
            this.a = a(bdVar.a);
            return;
        }
        throw new ClassCastException();
    }

    private static Map a(Map<Object, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            map2.put(a(entry.getKey()), a(entry.getValue()));
        }
        return map2;
    }

    private static Set a(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(a(it.next()));
        }
        return hashSet;
    }

    private static List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a(it.next()));
        }
        return arrayList;
    }

    public F a() {
        return this.b;
    }

    public Object a(F f) {
        if (f == this.b) {
            return b();
        }
        throw new IllegalArgumentException("Cannot get the value of field " + f + " because union's set field is " + this.b);
    }

    public Object a(int i) {
        return a(a((short) i));
    }

    public void a(F f, Object obj) {
        b(f, obj);
        this.b = f;
        this.a = obj;
    }

    public void a(int i, Object obj) {
        a(a((short) i), obj);
    }
}
