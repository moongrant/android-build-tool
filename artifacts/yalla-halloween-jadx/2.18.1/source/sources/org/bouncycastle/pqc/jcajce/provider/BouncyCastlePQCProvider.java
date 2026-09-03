package org.bouncycastle.pqc.jcajce.provider;

import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Provider;
import java.util.HashMap;
import java.util.Objects;
import p699oO0OOooo.OooO;
import p708oo000o.Oooo0;

/* JADX INFO: loaded from: classes3.dex */
public class BouncyCastlePQCProvider extends Provider {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final String[] f53717Oooo0o;

    public class OooO00o implements PrivilegedAction {
        public OooO00o() {
        }

        @Override // java.security.PrivilegedAction
        public final Object run() {
            BouncyCastlePQCProvider bouncyCastlePQCProvider = BouncyCastlePQCProvider.this;
            String[] strArr = BouncyCastlePQCProvider.f53717Oooo0o;
            Objects.requireNonNull(bouncyCastlePQCProvider);
            String[] strArr2 = BouncyCastlePQCProvider.f53717Oooo0o;
            int i = 0;
            while (true) {
                Class<?> cls = null;
                if (i == strArr2.length) {
                    return null;
                }
                try {
                    ClassLoader classLoader = bouncyCastlePQCProvider.getClass().getClassLoader();
                    if (classLoader != null) {
                        cls = classLoader.loadClass("org.bouncycastle.pqc.jcajce.provider." + strArr2[i] + "$Mappings");
                    } else {
                        cls = Class.forName("org.bouncycastle.pqc.jcajce.provider." + strArr2[i] + "$Mappings");
                    }
                } catch (ClassNotFoundException unused) {
                }
                if (cls != null) {
                    try {
                        ((OooO) cls.newInstance()).OooO00o();
                    } catch (Exception e) {
                        StringBuilder sbOooO00o = Oooo0.OooO00o("cannot create instance of ", "org.bouncycastle.pqc.jcajce.provider.");
                        sbOooO00o.append(strArr2[i]);
                        sbOooO00o.append("$Mappings : ");
                        sbOooO00o.append(e);
                        throw new InternalError(sbOooO00o.toString());
                    }
                }
                i++;
            }
        }
    }

    static {
        new HashMap();
        f53717Oooo0o = new String[]{"Rainbow", "McEliece", "SPHINCS", "NH"};
    }

    public BouncyCastlePQCProvider() {
        super("BCPQC", 1.57d, "BouncyCastle Post-Quantum Security Provider v1.57");
        AccessController.doPrivileged(new OooO00o());
    }
}
