package p668o0oooOo0;

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
import p667o0oooOo.oO00o000;
import p669o0oooOoO.u3;
import p669o0oooOoO.w3;
import p669o0oooOoO.x3;
import p669o0oooOoO.y3;

/* JADX INFO: loaded from: classes5.dex */
public final class g1 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static volatile int f59899OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final x3 f59900OooO0O0 = new x3();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final u3 f59901OooO0OO = new u3();

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final String[] f59902OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final String f59903OooO0o0;

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
        f59902OooO0Oo = new String[]{"1.6", "1.7"};
        f59903OooO0o0 = "org/slf4j/impl/StaticLoggerBinder.class";
    }

    public static final void OooO() {
        try {
            String str = StaticLoggerBinder.REQUESTED_API_VERSION;
            boolean z = false;
            for (String str2 : f59902OooO0Oo) {
                if (str.startsWith(str2)) {
                    z = true;
                }
            }
            if (z) {
                return;
            }
            y3.OooO00o("The requested version " + str + " by your slf4j binding is not compatible with " + Arrays.asList(f59902OooO0Oo).toString());
            y3.OooO00o("See http://www.slf4j.org/codes.html#version_mismatch for further details.");
        } catch (NoSuchFieldError unused) {
        } catch (Throwable th) {
            y3.OooO0O0("Unexpected problem occured during version sanity check", th);
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
            f59899OooO00o = 3;
            OooO0oO(linkedHashSetOooO0O0);
            OooO0OO();
            OooO0o();
            f59900OooO0O0.OooO0O0();
        } catch (Exception e) {
            f59899OooO00o = 2;
            y3.OooO0O0("Failed to instantiate SLF4J LoggerFactory", e);
            throw new IllegalStateException("Unexpected initialization failure", e);
        } catch (NoClassDefFoundError e2) {
            String message = e2.getMessage();
            if (!(message != null && (message.contains("org/slf4j/impl/StaticLoggerBinder") || message.contains("org.slf4j.impl.StaticLoggerBinder")))) {
                f59899OooO00o = 2;
                y3.OooO0O0("Failed to instantiate SLF4J LoggerFactory", e2);
                throw e2;
            }
            f59899OooO00o = 4;
            y3.OooO00o("Failed to load class \"org.slf4j.impl.StaticLoggerBinder\".");
            y3.OooO00o("Defaulting to no-operation (NOP) logger implementation");
            y3.OooO00o("See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details.");
        } catch (NoSuchMethodError e3) {
            String message2 = e3.getMessage();
            if (message2 != null && message2.contains("org.slf4j.impl.StaticLoggerBinder.getSingleton()")) {
                f59899OooO00o = 2;
                y3.OooO00o("slf4j-api 1.6.x (or later) is incompatible with this binding.");
                y3.OooO00o("Your binding is version 1.5.5 or earlier.");
                y3.OooO00o("Upgrade your binding to version 1.6.x.");
            }
            throw e3;
        }
    }

    public static LinkedHashSet OooO0O0() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        try {
            ClassLoader classLoader = g1.class.getClassLoader();
            String str = f59903OooO0o0;
            Enumeration<URL> systemResources = classLoader == null ? ClassLoader.getSystemResources(str) : classLoader.getResources(str);
            while (systemResources.hasMoreElements()) {
                linkedHashSet.add(systemResources.nextElement());
            }
        } catch (IOException e) {
            y3.OooO0O0("Error getting resources from path", e);
        }
        return linkedHashSet;
    }

    public static void OooO0OO() {
        x3 x3Var = f59900OooO0O0;
        synchronized (x3Var) {
            x3Var.getClass();
            for (w3 w3Var : new ArrayList(x3Var.f59905OooO00o.values())) {
                OooO0Oo().OooO00o(w3Var.f59904OooO0Oo);
                w3Var.getClass();
            }
        }
    }

    public static ILoggerFactory OooO0Oo() {
        if (f59899OooO00o == 0) {
            synchronized (g1.class) {
                if (f59899OooO00o == 0) {
                    f59899OooO00o = 1;
                    OooO00o();
                    if (f59899OooO00o == 3) {
                        OooO();
                    }
                }
            }
        }
        int i = f59899OooO00o;
        if (i == 1) {
            return f59900OooO0O0;
        }
        if (i == 2) {
            throw new IllegalStateException("org.slf4j.LoggerFactory in failed state. Original exception was thrown EARLIER. See also http://www.slf4j.org/codes.html#unsuccessfulInit");
        }
        if (i == 3) {
            return StaticLoggerBinder.getSingleton().getLoggerFactory();
        }
        if (i == 4) {
            return f59901OooO0OO;
        }
        throw new IllegalStateException("Unreachable code");
    }

    public static void OooO0o() {
        LinkedBlockingQueue<oO00o000> linkedBlockingQueue = f59900OooO0O0.f59906OooO0O0;
        linkedBlockingQueue.size();
        ArrayList arrayList = new ArrayList(128);
        while (linkedBlockingQueue.drainTo(arrayList, 128) != 0) {
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                oO00o000 oo00o000 = (oO00o000) it.next();
                if (oo00o000 != null) {
                    throw null;
                }
                oo00o000.getClass();
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
                y3.OooO00o("Actual binding is of type [" + StaticLoggerBinder.getSingleton().getLoggerFactoryClassStr() + "]");
            }
        }
    }

    public static void OooO0oo(LinkedHashSet linkedHashSet) {
        if (linkedHashSet.size() > 1) {
            y3.OooO00o("Class path contains multiple SLF4J bindings.");
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                y3.OooO00o("Found binding in [" + ((URL) it.next()) + "]");
            }
            y3.OooO00o("See http://www.slf4j.org/codes.html#multiple_bindings for an explanation.");
        }
    }
}
