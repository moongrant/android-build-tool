package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class bf implements Serializable {
    private static Map<Class<? extends at>, Map<? extends ba, bf>> d = new HashMap();
    public final String a;
    public final byte b;
    public final bg c;

    public bf(String str, byte b, bg bgVar) {
        this.a = str;
        this.b = b;
        this.c = bgVar;
    }

    public static void a(Class<? extends at> cls, Map<? extends ba, bf> map) {
        d.put(cls, map);
    }

    public static Map<? extends ba, bf> a(Class<? extends at> cls) {
        if (!d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (IllegalAccessException e) {
                StringBuilder sbOooO0o0 = OooO00o.OooO00o.OooO0o0("IllegalAccessException for TBase class: ");
                sbOooO0o0.append(cls.getName());
                sbOooO0o0.append(", message: ");
                sbOooO0o0.append(e.getMessage());
                throw new RuntimeException(sbOooO0o0.toString());
            } catch (InstantiationException e2) {
                StringBuilder sbOooO0o1 = OooO00o.OooO00o.OooO0o0("InstantiationException for TBase class: ");
                sbOooO0o1.append(cls.getName());
                sbOooO0o1.append(", message: ");
                sbOooO0o1.append(e2.getMessage());
                throw new RuntimeException(sbOooO0o1.toString());
            }
        }
        return d.get(cls);
    }
}
