package com.amazonaws.auth;

import OooO00o.OooO00o;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class SignerFactory {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Map<String, Class<? extends Signer>> f10368OooO00o;

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        f10368OooO00o = concurrentHashMap;
        concurrentHashMap.put("QueryStringSignerType", QueryStringSigner.class);
        concurrentHashMap.put("AWS3SignerType", AWS3Signer.class);
        concurrentHashMap.put("AWS4SignerType", AWS4Signer.class);
        concurrentHashMap.put("NoOpSignerType", NoOpSigner.class);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map<java.lang.String, java.lang.Class<? extends com.amazonaws.auth.Signer>>, java.util.concurrent.ConcurrentHashMap] */
    public static Signer OooO00o(String str, String str2) {
        Class cls = (Class) f10368OooO00o.get(str);
        if (cls == null) {
            throw new IllegalArgumentException();
        }
        try {
            Signer signer = (Signer) cls.newInstance();
            if (signer instanceof ServiceAwareSigner) {
                ((ServiceAwareSigner) signer).OooO00o(str2);
            }
            return signer;
        } catch (IllegalAccessException e) {
            StringBuilder sbOooO0o0 = OooO00o.OooO0o0("Cannot create an instance of ");
            sbOooO0o0.append(cls.getName());
            throw new IllegalStateException(sbOooO0o0.toString(), e);
        } catch (InstantiationException e2) {
            StringBuilder sbOooO0o1 = OooO00o.OooO0o0("Cannot create an instance of ");
            sbOooO0o1.append(cls.getName());
            throw new IllegalStateException(sbOooO0o1.toString(), e2);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Map<java.lang.String, java.lang.Class<? extends com.amazonaws.auth.Signer>>, java.util.concurrent.ConcurrentHashMap] */
    public static void OooO0O0(String str, Class<? extends Signer> cls) {
        f10368OooO00o.put(str, cls);
    }
}
