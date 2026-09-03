package com.google.android.gms.internal.measurement;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o0OoO00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Logger f15590OooO00o = Logger.getLogger(zzki.class.getName());

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final String f15591OooO0O0 = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    public static zzkn OooO0O0() {
        String str;
        ClassLoader classLoader = o0OoO00O.class.getClassLoader();
        if (zzkn.class.equals(zzkn.class)) {
            str = f15591OooO0O0;
        } else {
            if (!zzkn.class.getPackage().equals(o0OoO00O.class.getPackage())) {
                throw new IllegalArgumentException(zzkn.class.getName());
            }
            str = String.format("%s.BlazeGenerated%sLoader", zzkn.class.getPackage().getName(), "zzkn");
        }
        try {
            try {
                try {
                    return (zzkn) zzkn.class.cast(((o0OoO00O) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).OooO00o());
                } catch (NoSuchMethodException e) {
                    throw new IllegalStateException(e);
                } catch (InvocationTargetException e2) {
                    throw new IllegalStateException(e2);
                }
            } catch (IllegalAccessException e3) {
                throw new IllegalStateException(e3);
            } catch (InstantiationException e4) {
                throw new IllegalStateException(e4);
            }
        } catch (ClassNotFoundException unused) {
            Iterator it = ServiceLoader.load(o0OoO00O.class, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add((zzkn) zzkn.class.cast(((o0OoO00O) it.next()).OooO00o()));
                } catch (ServiceConfigurationError e5) {
                    f15590OooO00o.logp(Level.SEVERE, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", "Unable to load ".concat("zzkn"), (Throwable) e5);
                }
            }
            if (arrayList.size() == 1) {
                return (zzkn) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (zzkn) zzkn.class.getMethod("combine", Collection.class).invoke(null, arrayList);
            } catch (IllegalAccessException e6) {
                throw new IllegalStateException(e6);
            } catch (NoSuchMethodException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    public abstract zzkn OooO00o();
}
