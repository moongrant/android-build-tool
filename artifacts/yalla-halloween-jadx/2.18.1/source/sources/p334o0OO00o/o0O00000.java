package p334o0OO00o;

import com.google.android.gms.internal.measurement.zzjl;
import com.google.android.gms.internal.measurement.zzjq;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o0O00000 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f37357OooO00o = Logger.getLogger(zzjl.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f37358OooO0O0 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static zzjq OooO0O0() {
        String str;
        ClassLoader classLoader = o0O00000.class.getClassLoader();
        if (zzjq.class.equals(zzjq.class)) {
            str = f37358OooO0O0;
        } else {
            if (!zzjq.class.getPackage().equals(o0O00000.class.getPackage())) {
                throw new IllegalArgumentException(zzjq.class.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", zzjq.class.getPackage().getName(), "zzjq");
        }
        try {
            try {
                try {
                    try {
                        return (zzjq) zzjq.class.cast(((o0O00000) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).OooO00o());
                    } catch (InstantiationException e) {
                        throw new IllegalStateException(e);
                    }
                } catch (IllegalAccessException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException(e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(o0O00000.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(zzjq.class.cast(((o0O00000) it.next()).OooO00o()));
                } catch (ServiceConfigurationError e5) {
                    f37357OooO00o.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zzjq"), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (zzjq) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzjq) zzjq.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    public abstract zzjq OooO00o();
}
