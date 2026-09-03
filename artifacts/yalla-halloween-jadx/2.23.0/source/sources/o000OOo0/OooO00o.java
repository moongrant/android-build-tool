package o000OOo0;

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
import p077o000Oo00.OooOO0O;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO00o {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static volatile OooO00o f34892OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Object f34893OooO0o0 = new Object();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final Context f34896OooO0OO;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NonNull
    public final HashSet f34895OooO0O0 = new HashSet();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NonNull
    public final HashMap f34894OooO00o = new HashMap();

    public OooO00o(@NonNull Context context) {
        this.f34896OooO0OO = context.getApplicationContext();
    }

    @NonNull
    public static OooO00o OooO0OO(@NonNull Context context) {
        if (f34892OooO0Oo == null) {
            synchronized (f34893OooO0o0) {
                if (f34892OooO0Oo == null) {
                    f34892OooO0Oo = new OooO00o(context);
                }
            }
        }
        return f34892OooO0Oo;
    }

    public final void OooO00o(@Nullable Bundle bundle) {
        HashSet hashSet;
        String string = this.f34896OooO0OO.getString(OooO0OO.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean zHasNext = it.hasNext();
                    hashSet = this.f34895OooO0O0;
                    if (!zHasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (OooO0O0.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    OooO0O0((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new StartupException(e);
            }
        }
    }

    @NonNull
    public final Object OooO0O0(@NonNull Class cls, @NonNull HashSet hashSet) {
        Object objCreate;
        if (OooOO0O.OooO00o()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        HashMap map = this.f34894OooO00o;
        if (map.containsKey(cls)) {
            objCreate = map.get(cls);
        } else {
            hashSet.add(cls);
            try {
                OooO0O0 oooO0O0 = (OooO0O0) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends OooO0O0<?>>> listDependencies = oooO0O0.dependencies();
                if (!listDependencies.isEmpty()) {
                    for (Class<? extends OooO0O0<?>> cls2 : listDependencies) {
                        if (!map.containsKey(cls2)) {
                            OooO0O0(cls2, hashSet);
                        }
                    }
                }
                objCreate = oooO0O0.create(this.f34896OooO0OO);
                hashSet.remove(cls);
                map.put(cls, objCreate);
            } catch (Throwable th2) {
                throw new StartupException(th2);
            }
        }
        Trace.endSection();
        return objCreate;
    }
}
