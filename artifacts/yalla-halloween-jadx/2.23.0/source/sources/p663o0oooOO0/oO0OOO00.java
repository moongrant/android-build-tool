package p663o0oooOO0;

import com.facebook.internal.ServerProtocol;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import org.slf4j.impl.StaticLoggerBinder;
import p662o0oooOO.oO00O0o;
import p664o0oooOOo.rc;
import p664o0oooOOo.tc;
import p664o0oooOOo.uc;
import p664o0oooOOo.vc;

/* JADX INFO: loaded from: classes5.dex */
public final class oO0OOO00 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile int f60318OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final uc f60319OooO0O0 = new uc();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final rc f60320OooO0OO = new rc();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String[] f60321OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f60322OooO0o0;

    static {
        String property;
        try {
            property = System.getProperty("slf4j.detectLoggerNameMismatch");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property != null) {
            property.equalsIgnoreCase(ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
        }
        f60321OooO0Oo = new String[]{"1.6", "1.7"};
        f60322OooO0o0 = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void OooO() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f60321OooO0Oo) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            vc.OooO00o("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f60321OooO0Oo).toString());
            vc.OooO00o("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            vc.OooO0O0("Unexpected problem occured during version sanity check", th);
        }
    }

    public static final void OooO00o() {
        LinkedHashSet linkedHashSetOooO0O0;
        try {
            if (OooO0o0()) {
                linkedHashSetOooO0O0 = null;
            } else {
                linkedHashSetOooO0O0 = OooO0O0();
                OooO0oo(linkedHashSetOooO0O0);
            }
            StaticLoggerBinder.getSingleton();
            f60318OooO00o = 3;
            OooO0oO(linkedHashSetOooO0O0);
            OooO0OO();
            OooO0o();
            f60319OooO0O0.OooO0O0();
        } catch (Exception e) {
            f60318OooO00o = 2;
            vc.OooO0O0("Failed to instantiate SLF4J LoggerFactory", e);
            throw new IllegalStateException("Unexpected initialization failure", e);
        } catch (NoClassDefFoundError e2) {
            String message = e2.getMessage();
            if (!(message != null && (message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder")))) {
                f60318OooO00o = 2;
                vc.OooO0O0("Failed to instantiate SLF4J LoggerFactory", e2);
                throw e2;
            }
            f60318OooO00o = 4;
            vc.OooO00o("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            vc.OooO00o("Defaulting to no-operation (NOP) logger implementation");
            vc.OooO00o("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e3) {
            String message2 = e3.getMessage();
            if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f60318OooO00o = 2;
                vc.OooO00o("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                vc.OooO00o("Your binding is version 1.5.5 or earlier.");
                vc.OooO00o("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        }
    }

    public static LinkedHashSet OooO0O0() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = oO0OOO00.class.getClassLoader();
            String str = f60322OooO0o0;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            vc.OooO0O0("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    public static void OooO0OO() {
        uc ucVar = f60319OooO0O0;
        synchronized (ucVar) {
            ucVar.getClass();
            for (tc tcVar : new ArrayList(ucVar.f60324OooO00o.values())) {
                OooO0Oo().OooO00o(tcVar.f60323OooO0Oo);
                tcVar.getClass();
            }
        }
    }

    public static ILoggerFactory OooO0Oo() {
        if (f60318OooO00o == 0) {
            synchronized (oO0OOO00.class) {
                if (f60318OooO00o == 0) {
                    f60318OooO00o = 1;
                    OooO00o();
                    if (f60318OooO00o == 3) {
                        OooO();
                    }
                }
            }
        }
        int i = f60318OooO00o;
        if (i == 1) {
            return f60319OooO0O0;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f60320OooO0OO;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static void OooO0o() {
        LinkedBlockingQueue<oO00O0o> linkedBlockingQueue = f60319OooO0O0.f60325OooO0O0;
        linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                oO00O0o oo00o0o = (oO00O0o) it.next();
                if (oo00o0o != null) {
                    throw null;
                }
                oo00o0o.getClass();
                throw null;
            }
            arrayList.clear();
        }
    }

    public static boolean OooO0o0() {
        String property;
        try {
            property = System.getProperty("java.vendor.url");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            return false;
        }
        return property.toLowerCase().contains("android");
    }

    public static void OooO0oO(LinkedHashSet linkedHashSet) {
        if (linkedHashSet != null) {
            if (linkedHashSet.size() > 1) {
                vc.OooO00o("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
            }
        }
    }

    public static void OooO0oo(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            vc.OooO00o("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                vc.OooO00o("Found binding in [" + ((URL) it.next()) + "]");
            }
            vc.OooO00o("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
