package p351o0OOOOo;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.InvalidRegistrarException;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o000O00O.Oooo000;
import o0O0OOOo.o0OoOo0;
import p021OooOooo.Oooo0;
import p357o0OOOo0O.o00000OO;
import p357o0OOOo0O.o000OOo;
import p357o0OOOo0O.o0Oo0oo;
import p357o0OOOo0O.oo000o;
import p373o0OOo0o0.o0000Ooo;
import p380o0OOoOO.o0OOO0o;

/* JADX INFO: loaded from: classes2.dex */
public final class OooOOO {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Object f38259OooOO0 = new Object();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    public static final OooO0OO f38260OooOO0O = new OooO0OO();

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("LOCK")
    public static final Map<String, OooOOO> f38261OooOO0o = new Oooo0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f38263OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f38264OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final Oooo000 f38265OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000OOo f38266OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o00000OO<o0OOO0o> f38269OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final p375o0OOo0oo.o0OOO0o<com.google.firebase.heartbeatinfo.OooO00o> f38270OooO0oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f38268OooO0o0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f38267OooO0o = new AtomicBoolean();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final List<OooO00o> f38262OooO = new CopyOnWriteArrayList();

    @KeepForSdk
    public interface OooO00o {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @TargetApi(14)
    public static class OooO0O0 implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static AtomicReference<OooO0O0> f38271OooO00o = new AtomicReference<>();

        /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List<o0OOOOo.OooOOO$OooO00o>, java.util.concurrent.CopyOnWriteArrayList] */
        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            Object obj = OooOOO.f38259OooOO0;
            synchronized (OooOOO.f38259OooOO0) {
                for (OooOOO oooOOO : new ArrayList(OooOOO.f38261OooOO0o.values())) {
                    if (oooOOO.f38268OooO0o0.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = oooOOO.f38262OooO.iterator();
                        while (it.hasNext()) {
                            ((OooO00o) it.next()).onBackgroundStateChanged(z);
                        }
                    }
                }
            }
        }
    }

    public static class OooO0OO implements Executor {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public static final Handler f38272Oooo0o = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(@NonNull Runnable runnable) {
            f38272Oooo0o.post(runnable);
        }
    }

    @TargetApi(24)
    public static class OooO0o extends BroadcastReceiver {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static AtomicReference<OooO0o> f38273OooO0O0 = new AtomicReference<>();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f38274OooO00o;

        public OooO0o(Context context) {
            this.f38274OooO00o = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            Object obj = OooOOO.f38259OooOO0;
            synchronized (OooOOO.f38259OooOO0) {
                Iterator it = ((Oooo0.OooO) OooOOO.f38261OooOO0o.values()).iterator();
                while (it.hasNext()) {
                    ((OooOOO) it.next()).OooO0o0();
                }
            }
            this.f38274OooO00o.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x007e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0088  */
    /* JADX WARN: Code duplicated, block: B:18:0x009b  */
    /* JADX WARN: Code duplicated, block: B:26:0x00c9 A[LOOP:0: B:24:0x00c3->B:26:0x00c9, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v21, types: [java.util.List<o0OOOOo.OooOOO$OooO00o>, java.util.concurrent.CopyOnWriteArrayList] */
    /* JADX WARN: Type inference failed for: r11v25, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List] */
    public OooOOO(final Context context, String str, Oooo000 oooo000) {
        Bundle bundle;
        ?? arrayList;
        OooO00o oooO00o;
        new CopyOnWriteArrayList();
        this.f38263OooO00o = (Context) Preconditions.checkNotNull(context);
        this.f38264OooO0O0 = Preconditions.checkNotEmpty(str);
        this.f38265OooO0OO = (Oooo000) Preconditions.checkNotNull(oooo000);
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), 128);
                if (serviceInfo == null) {
                    Log.w("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
                if (bundle == null) {
                    Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                    arrayList = Collections.emptyList();
                } else {
                    arrayList = new ArrayList();
                    for (String str2 : bundle.keySet()) {
                        if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                            arrayList.add(str2.substring(31));
                        }
                    }
                }
                for (final String str3 : arrayList) {
                    arrayList2.add(new p375o0OOo0oo.o0OOO0o() { // from class: o0OOOo0O.o0ooOOo
                        @Override // p375o0OOo0oo.o0OOO0o
                        public final Object get() {
                            String str4 = str3;
                            try {
                                Class<?> cls = Class.forName(str4);
                                if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                                    return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                                }
                                throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str4, "com.google.firebase.components.ComponentRegistrar"));
                            } catch (ClassNotFoundException unused) {
                                Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str4));
                                return null;
                            } catch (IllegalAccessException e) {
                                throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str4), e);
                            } catch (InstantiationException e2) {
                                throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str4), e2);
                            } catch (NoSuchMethodException e3) {
                                throw new InvalidRegistrarException(String.format("Could not instantiate %s", str4), e3);
                            } catch (InvocationTargetException e4) {
                                throw new InvalidRegistrarException(String.format("Could not instantiate %s", str4), e4);
                            }
                        }
                    });
                }
                Trace.endSection();
                Trace.beginSection("Runtime");
                OooO0OO oooO0OO = f38260OooOO0O;
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                o0OoOo0 o0oooo1 = o0Oo0oo.f38364OooO0O0;
                arrayList3.addAll(arrayList2);
                final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
                arrayList3.add(new p375o0OOo0oo.o0OOO0o() { // from class: o0OOOo0O.o000000
                    @Override // p375o0OOo0oo.o0OOO0o
                    public final Object get() {
                        return firebaseCommonRegistrar;
                    }
                });
                arrayList4.add(oo000o.OooO0OO(context, Context.class, new Class[0]));
                arrayList4.add(oo000o.OooO0OO(this, OooOOO.class, new Class[0]));
                arrayList4.add(oo000o.OooO0OO(oooo000, Oooo000.class, new Class[0]));
                o000OOo o000ooo2 = new o000OOo(oooO0OO, arrayList3, arrayList4, new p385o0OOoo0.OooOOO(), null);
                this.f38266OooO0Oo = o000ooo2;
                Trace.endSection();
                this.f38269OooO0oO = new o00000OO<>(new p375o0OOo0oo.o0OOO0o() { // from class: o0OOOOo.OooOOO0
                    @Override // p375o0OOo0oo.o0OOO0o
                    public final Object get() {
                        OooOOO oooOOO = this.f38275OooO00o;
                        return new o0OOO0o(context, oooOOO.OooO0Oo(), (o0000Ooo) oooOOO.f38266OooO0Oo.OooO00o(o0000Ooo.class));
                    }
                });
                this.f38270OooO0oo = o000ooo2.OooO0O0(com.google.firebase.heartbeatinfo.OooO00o.class);
                oooO00o = new OooO00o() { // from class: o0OOOOo.OooOO0O
                    @Override // o0OOOOo.OooOOO.OooO00o
                    public final void onBackgroundStateChanged(boolean z) {
                        OooOOO oooOOO = this.f38258OooO00o;
                        Objects.requireNonNull(oooOOO);
                        if (z) {
                            return;
                        }
                        oooOOO.f38270OooO0oo.get().OooO0OO();
                    }
                };
                OooO00o();
                if (this.f38268OooO0o0.get() && BackgroundDetector.getInstance().isInBackground()) {
                    oooO00o.onBackgroundStateChanged(true);
                }
                this.f38262OooO.add(oooO00o);
                Trace.endSection();
            }
            Log.w("ComponentDiscovery", "Context has no PackageManager.");
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("ComponentDiscovery", "Application info not found.");
        }
        bundle = null;
        if (bundle == null) {
            Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList();
            while (r3.hasNext()) {
                if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2))) {
                }
            }
        }
        while (r11.hasNext()) {
            arrayList2.add(new p375o0OOo0oo.o0OOO0o() { // from class: o0OOOo0O.o0ooOOo
                @Override // p375o0OOo0oo.o0OOO0o
                public final Object get() {
                    String str4 = str3;
                    try {
                        Class<?> cls = Class.forName(str4);
                        if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                            return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        }
                        throw new InvalidRegistrarException(String.format("Class %s is not an instance of %s", str4, "com.google.firebase.components.ComponentRegistrar"));
                    } catch (ClassNotFoundException unused2) {
                        Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str4));
                        return null;
                    } catch (IllegalAccessException e) {
                        throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str4), e);
                    } catch (InstantiationException e2) {
                        throw new InvalidRegistrarException(String.format("Could not instantiate %s.", str4), e2);
                    } catch (NoSuchMethodException e3) {
                        throw new InvalidRegistrarException(String.format("Could not instantiate %s", str4), e3);
                    } catch (InvocationTargetException e4) {
                        throw new InvalidRegistrarException(String.format("Could not instantiate %s", str4), e4);
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        OooO0OO oooO0OO2 = f38260OooOO0O;
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        o0OoOo0 o0oooo2 = o0Oo0oo.f38364OooO0O0;
        arrayList5.addAll(arrayList2);
        final ComponentRegistrar firebaseCommonRegistrar2 = new FirebaseCommonRegistrar();
        arrayList5.add(new p375o0OOo0oo.o0OOO0o() { // from class: o0OOOo0O.o000000
            @Override // p375o0OOo0oo.o0OOO0o
            public final Object get() {
                return firebaseCommonRegistrar2;
            }
        });
        arrayList6.add(oo000o.OooO0OO(context, Context.class, new Class[0]));
        arrayList6.add(oo000o.OooO0OO(this, OooOOO.class, new Class[0]));
        arrayList6.add(oo000o.OooO0OO(oooo000, Oooo000.class, new Class[0]));
        o000OOo o000ooo3 = new o000OOo(oooO0OO2, arrayList5, arrayList6, new p385o0OOoo0.OooOOO(), null);
        this.f38266OooO0Oo = o000ooo3;
        Trace.endSection();
        this.f38269OooO0oO = new o00000OO<>(new p375o0OOo0oo.o0OOO0o() { // from class: o0OOOOo.OooOOO0
            @Override // p375o0OOo0oo.o0OOO0o
            public final Object get() {
                OooOOO oooOOO = this.f38275OooO00o;
                return new o0OOO0o(context, oooOOO.OooO0Oo(), (o0000Ooo) oooOOO.f38266OooO0Oo.OooO00o(o0000Ooo.class));
            }
        });
        this.f38270OooO0oo = o000ooo3.OooO0O0(com.google.firebase.heartbeatinfo.OooO00o.class);
        oooO00o = new OooO00o() { // from class: o0OOOOo.OooOO0O
            @Override // o0OOOOo.OooOOO.OooO00o
            public final void onBackgroundStateChanged(boolean z) {
                OooOOO oooOOO = this.f38258OooO00o;
                Objects.requireNonNull(oooOOO);
                if (z) {
                    return;
                }
                oooOOO.f38270OooO0oo.get().OooO0OO();
            }
        };
        OooO00o();
        if (this.f38268OooO0o0.get()) {
            oooO00o.onBackgroundStateChanged(true);
        }
        this.f38262OooO.add(oooO00o);
        Trace.endSection();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [OooOooo.o00oO0o, java.util.Map<java.lang.String, o0OOOOo.OooOOO>] */
    @NonNull
    public static OooOOO OooO0OO() {
        OooOOO oooOOO;
        synchronized (f38259OooOO0) {
            oooOOO = (OooOOO) f38261OooOO0o.getOrDefault("[DEFAULT]", null);
            if (oooOOO == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return oooOOO;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [OooOooo.o00oO0o, java.util.Map<java.lang.String, o0OOOOo.OooOOO>] */
    @NonNull
    public static OooOOO OooO0o(@NonNull Context context, @NonNull Oooo000 oooo000) {
        OooOOO oooOOO;
        AtomicReference<OooO0O0> atomicReference = OooO0O0.f38271OooO00o;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            if (OooO0O0.f38271OooO00o.get() == null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                if (OooO0O0.f38271OooO00o.compareAndSet(null, oooO0O0)) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(oooO0O0);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f38259OooOO0) {
            ?? r2 = f38261OooOO0o;
            Preconditions.checkState(!r2.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            oooOOO = new OooOOO(context, "[DEFAULT]", oooo000);
            r2.put("[DEFAULT]", oooOOO);
        }
        oooOOO.OooO0o0();
        return oooOOO;
    }

    public final void OooO00o() {
        Preconditions.checkState(!this.f38267OooO0o.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    public final <T> T OooO0O0(Class<T> cls) {
        OooO00o();
        return (T) this.f38266OooO0Oo.OooO00o(cls);
    }

    @KeepForSdk
    public final String OooO0Oo() {
        StringBuilder sb = new StringBuilder();
        OooO00o();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f38264OooO0O0.getBytes(Charset.defaultCharset())));
        sb.append("+");
        OooO00o();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f38265OooO0OO.f38283OooO0O0.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void OooO0o0() {
        HashMap map;
        if (!Oooo000.OooO00o(this.f38263OooO00o)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            OooO00o();
            sb.append(this.f38264OooO0O0);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f38263OooO00o;
            if (OooO0o.f38273OooO0O0.get() == null) {
                OooO0o oooO0o = new OooO0o(context);
                if (OooO0o.f38273OooO0O0.compareAndSet(null, oooO0o)) {
                    context.registerReceiver(oooO0o, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Device unlocked: initializing all Firebase APIs for app ");
        OooO00o();
        sb2.append(this.f38264OooO0O0);
        Log.i("FirebaseApp", sb2.toString());
        o000OOo o000ooo2 = this.f38266OooO0Oo;
        boolean zOooO0oo = OooO0oo();
        if (o000ooo2.f38357OooO0o.compareAndSet(null, Boolean.valueOf(zOooO0oo))) {
            synchronized (o000ooo2) {
                map = new HashMap(o000ooo2.f38353OooO00o);
            }
            o000ooo2.OooO0o(map, zOooO0oo);
        }
        this.f38270OooO0oo.get().OooO0OO();
    }

    @KeepForSdk
    public final boolean OooO0oO() {
        boolean z;
        OooO00o();
        o0OOO0o o0ooo0o2 = this.f38269OooO0oO.get();
        synchronized (o0ooo0o2) {
            z = o0ooo0o2.f38715OooO0O0;
        }
        return z;
    }

    @KeepForSdk
    @VisibleForTesting
    public final boolean OooO0oo() {
        OooO00o();
        return "[DEFAULT]".equals(this.f38264OooO0O0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOOO)) {
            return false;
        }
        String str = this.f38264OooO0O0;
        OooOOO oooOOO = (OooOOO) obj;
        oooOOO.OooO00o();
        return str.equals(oooOOO.f38264OooO0O0);
    }

    public final int hashCode() {
        return this.f38264OooO0O0.hashCode();
    }

    public final String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("name", this.f38264OooO0O0).add("options", this.f38265OooO0OO).toString();
    }
}
