package p096o000o0o;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.startup.StartupException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p099o000o0oo.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile oo000o f29296OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Object f29297OooO0o0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Context f29300OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final Set<Class<? extends o00oO0o<?>>> f29299OooO0O0 = new HashSet();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final Map<Class<?>, Object> f29298OooO00o = new HashMap();

    public oo000o(@NonNull Context context) {
        this.f29300OooO0OO = context.getApplicationContext();
    }

    @NonNull
    public static oo000o OooO0OO(@NonNull Context context) {
        if (f29296OooO0Oo == null) {
            synchronized (f29297OooO0o0) {
                if (f29296OooO0Oo == null) {
                    f29296OooO0Oo = new oo000o(context);
                }
            }
        }
        return f29296OooO0Oo;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void OooO00o(@Nullable Bundle bundle) {
        String string = this.f29300OooO0OO.getString(o0ooOOo.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (o00oO0o.class.isAssignableFrom(cls)) {
                            this.f29299OooO0O0.add((Class<? extends o00oO0o<?>>) cls);
                        }
                    }
                }
                Iterator<Class<? extends o00oO0o<?>>> it = this.f29299OooO0O0.iterator();
                while (it.hasNext()) {
                    OooO0O0(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Object>] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.HashMap, java.util.Map<java.lang.Class<?>, java.lang.Object>] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @NonNull
    public final <T> T OooO0O0(@NonNull Class<? extends o00oO0o<?>> cls, @NonNull Set<Class<?>> set) {
        T t;
        if (o0Oo0oo.OooO00o()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f29298OooO00o.containsKey(cls)) {
            t = (T) this.f29298OooO00o.get(cls);
        } else {
            set.add(cls);
            try {
                o00oO0o<?> o00oo0oNewInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends o00oO0o<?>>> listDependencies = o00oo0oNewInstance.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends o00oO0o<?>> cls2 : listDependencies) {
                        if (!this.f29298OooO00o.containsKey(cls2)) {
                            OooO0O0(cls2, set);
                        }
                    }
                }
                t = (T) o00oo0oNewInstance.create(this.f29300OooO0OO);
                set.remove(cls);
                this.f29298OooO00o.put(cls, t);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return t;
    }
}
