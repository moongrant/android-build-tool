package p281o0O0O0oO;

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
import android.os.Trace;
import android.util.Log;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.OooOOOO;
import com.google.firebase.components.o000oOoO;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.concurrent.UiExecutor;
import com.google.firebase.provider.FirebaseInitProvider;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import o0O0o000.OooO0OO;
import p063o0000oO.o00000O;
import p302o0O0o0o.OooO0o;
import p315o0O0oOoO.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class OooOO0 {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Object f41946OooOO0 = new Object();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("LOCK")
    public static final p188o00o0O.OooOO0 f41947OooOO0O = new p188o00o0O.OooOO0();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f41949OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f41950OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final OooOOO0 f41951OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOOOO f41952OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o000oOoO<OooO0o> f41955OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final p298o0O0o00o.OooO0OO<com.google.firebase.heartbeatinfo.OooO00o> f41956OooO0oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f41954OooO0o0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f41953OooO0o = new AtomicBoolean();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final CopyOnWriteArrayList f41948OooO = new CopyOnWriteArrayList();

    @KeepForSdk
    public interface OooO00o {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @TargetApi(14)
    public static class OooO0O0 implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final AtomicReference<OooO0O0> f41957OooO00o = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            synchronized (OooOO0.f41946OooOO0) {
                for (OooOO0 oooOO1 : new ArrayList(OooOO0.f41947OooOO0O.values())) {
                    if (oooOO1.f41954OooO0o0.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = oooOO1.f41948OooO.iterator();
                        while (it.hasNext()) {
                            ((OooO00o) it.next()).onBackgroundStateChanged(z);
                        }
                    }
                }
            }
        }
    }

    @TargetApi(24)
    public static class OooO0OO extends BroadcastReceiver {

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public static final AtomicReference<OooO0OO> f41958OooO0O0 = new AtomicReference<>();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f41959OooO00o;

        public OooO0OO(Context context) {
            this.f41959OooO00o = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (OooOO0.f41946OooOO0) {
                Iterator it = ((o00o0O.OooOO0.OooO) OooOO0.f41947OooOO0O.values()).iterator();
                while (it.hasNext()) {
                    ((OooOO0) it.next()).OooO0o0();
                }
            }
            this.f41959OooO00o.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0080  */
    /* JADX WARN: Code duplicated, block: B:15:0x008a  */
    /* JADX WARN: Code duplicated, block: B:18:0x009d  */
    /* JADX WARN: Code duplicated, block: B:26:0x00cb A[LOOP:0: B:24:0x00c5->B:26:0x00cb, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    public OooOO0(final Context context, OooOOO0 oooOOO0, String str) {
        Bundle bundle;
        ?? arrayList;
        ArrayList arrayList2;
        OooO00o oooO00o;
        new CopyOnWriteArrayList();
        this.f41949OooO00o = (Context) Preconditions.checkNotNull(context);
        this.f41950OooO0O0 = Preconditions.checkNotEmpty(str);
        this.f41951OooO0OO = (OooOOO0) Preconditions.checkNotNull(oooOOO0);
        p281o0O0O0oO.OooO0O0 oooO0O0 = FirebaseInitProvider.f20502OooO0Oo;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList3 = new ArrayList();
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
                    arrayList3.add(new p298o0O0o00o.OooO0OO() { // from class: com.google.firebase.components.OooO0o
                        @Override // p298o0O0o00o.OooO0OO
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
                UiExecutor uiExecutor = UiExecutor.INSTANCE;
                ArrayList arrayList4 = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList4.addAll(arrayList3);
                final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
                arrayList4.add(new p298o0O0o00o.OooO0OO() { // from class: com.google.firebase.components.OooOOO
                    @Override // p298o0O0o00o.OooO0OO
                    public final Object get() {
                        return firebaseCommonRegistrar;
                    }
                });
                final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
                arrayList4.add(new p298o0O0o00o.OooO0OO() { // from class: com.google.firebase.components.OooOOO
                    @Override // p298o0O0o00o.OooO0OO
                    public final Object get() {
                        return executorsRegistrar;
                    }
                });
                arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(context, Context.class, new Class[0]));
                arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(this, OooOO0.class, new Class[0]));
                arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(oooOOO0, OooOOO0.class, new Class[0]));
                o00OO00O o00oo00o = new o00OO00O();
                if (o00000O.OooO00o(context) && FirebaseInitProvider.f20503OooO0o0.get()) {
                    arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(oooO0O0, OooOOO.class, new Class[0]));
                }
                OooOOOO oooOOOO = new OooOOOO(uiExecutor, arrayList4, arrayList2, o00oo00o);
                this.f41952OooO0Oo = oooOOOO;
                Trace.endSection();
                this.f41955OooO0oO = new o000oOoO<>(new p298o0O0o00o.OooO0OO() { // from class: o0O0O0oO.OooO0o
                    @Override // p298o0O0o00o.OooO0OO
                    public final Object get() {
                        OooOO0 oooOO1 = this.f41944OooO00o;
                        return new p302o0O0o0o.OooO0o(context, oooOO1.OooO0Oo(), (OooO0OO) oooOO1.f41952OooO0Oo.OooO00o(OooO0OO.class));
                    }
                });
                this.f41956OooO0oo = oooOOOO.OooO0o0(com.google.firebase.heartbeatinfo.OooO00o.class);
                oooO00o = new OooO00o() { // from class: o0O0O0oO.OooO
                    @Override // o0O0O0oO.OooOO0.OooO00o
                    public final void onBackgroundStateChanged(boolean z) {
                        OooOO0 oooOO1 = this.f41940OooO00o;
                        if (z) {
                            oooOO1.getClass();
                        } else {
                            oooOO1.f41956OooO0oo.get().OooO0OO();
                        }
                    }
                };
                OooO00o();
                if (this.f41954OooO0o0.get() && BackgroundDetector.getInstance().isInBackground()) {
                    oooO00o.onBackgroundStateChanged(true);
                }
                this.f41948OooO.add(oooO00o);
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
            while (r4.hasNext()) {
                if (!"com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2))) {
                }
            }
        }
        while (r0.hasNext()) {
            arrayList3.add(new p298o0O0o00o.OooO0OO() { // from class: com.google.firebase.components.OooO0o
                @Override // p298o0O0o00o.OooO0OO
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
        UiExecutor uiExecutor2 = UiExecutor.INSTANCE;
        ArrayList arrayList5 = new ArrayList();
        arrayList2 = new ArrayList();
        arrayList5.addAll(arrayList3);
        final ComponentRegistrar firebaseCommonRegistrar2 = new FirebaseCommonRegistrar();
        arrayList5.add(new p298o0O0o00o.OooO0OO() { // from class: com.google.firebase.components.OooOOO
            @Override // p298o0O0o00o.OooO0OO
            public final Object get() {
                return firebaseCommonRegistrar2;
            }
        });
        final ComponentRegistrar executorsRegistrar2 = new ExecutorsRegistrar();
        arrayList5.add(new p298o0O0o00o.OooO0OO() { // from class: com.google.firebase.components.OooOOO
            @Override // p298o0O0o00o.OooO0OO
            public final Object get() {
                return executorsRegistrar2;
            }
        });
        arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(context, Context.class, new Class[0]));
        arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(this, OooOO0.class, new Class[0]));
        arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(oooOOO0, OooOOO0.class, new Class[0]));
        o00OO00O o00oo00o2 = new o00OO00O();
        if (o00000O.OooO00o(context)) {
            arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(oooO0O0, OooOOO.class, new Class[0]));
        }
        OooOOOO oooOOOO2 = new OooOOOO(uiExecutor2, arrayList5, arrayList2, o00oo00o2);
        this.f41952OooO0Oo = oooOOOO2;
        Trace.endSection();
        this.f41955OooO0oO = new o000oOoO<>(new p298o0O0o00o.OooO0OO() { // from class: o0O0O0oO.OooO0o
            @Override // p298o0O0o00o.OooO0OO
            public final Object get() {
                OooOO0 oooOO1 = this.f41944OooO00o;
                return new p302o0O0o0o.OooO0o(context, oooOO1.OooO0Oo(), (OooO0OO) oooOO1.f41952OooO0Oo.OooO00o(OooO0OO.class));
            }
        });
        this.f41956OooO0oo = oooOOOO2.OooO0o0(com.google.firebase.heartbeatinfo.OooO00o.class);
        oooO00o = new OooO00o() { // from class: o0O0O0oO.OooO
            @Override // o0O0O0oO.OooOO0.OooO00o
            public final void onBackgroundStateChanged(boolean z) {
                OooOO0 oooOO1 = this.f41940OooO00o;
                if (z) {
                    oooOO1.getClass();
                } else {
                    oooOO1.f41956OooO0oo.get().OooO0OO();
                }
            }
        };
        OooO00o();
        if (this.f41954OooO0o0.get()) {
            oooO00o.onBackgroundStateChanged(true);
        }
        this.f41948OooO.add(oooO00o);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static OooOO0 OooO0OO() {
        OooOO0 oooOO1;
        synchronized (f41946OooOO0) {
            oooOO1 = (OooOO0) f41947OooOO0O.getOrDefault("[DEFAULT]", null);
            if (oooOO1 == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            oooOO1.f41956OooO0oo.get().OooO0OO();
        }
        return oooOO1;
    }

    @Nullable
    public static OooOO0 OooO0o(@NonNull Context context) {
        synchronized (f41946OooOO0) {
            if (f41947OooOO0O.containsKey("[DEFAULT]")) {
                return OooO0OO();
            }
            OooOOO0 oooOOO0OooO00o = OooOOO0.OooO00o(context);
            if (oooOOO0OooO00o == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return OooO0oO(context, oooOOO0OooO00o);
        }
    }

    @NonNull
    public static OooOO0 OooO0oO(@NonNull Context context, @NonNull OooOOO0 oooOOO0) {
        OooOO0 oooOO1;
        boolean z;
        AtomicReference<OooO0O0> atomicReference = OooO0O0.f41957OooO00o;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<OooO0O0> atomicReference2 = OooO0O0.f41957OooO00o;
            if (atomicReference2.get() == null) {
                OooO0O0 oooO0O0 = new OooO0O0();
                while (true) {
                    if (atomicReference2.compareAndSet(null, oooO0O0)) {
                        z = true;
                        break;
                    }
                    if (atomicReference2.get() != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    BackgroundDetector.initialize(application);
                    BackgroundDetector.getInstance().addListener(oooO0O0);
                }
            }
        }
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (f41946OooOO0) {
            p188o00o0O.OooOO0 oooOO2 = f41947OooOO0O;
            Preconditions.checkState(true ^ oooOO2.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            oooOO1 = new OooOO0(context, oooOOO0, "[DEFAULT]");
            oooOO2.put("[DEFAULT]", oooOO1);
        }
        oooOO1.OooO0o0();
        return oooOO1;
    }

    public final void OooO00o() {
        Preconditions.checkState(!this.f41953OooO0o.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    public final <T> T OooO0O0(Class<T> cls) {
        OooO00o();
        return (T) this.f41952OooO0Oo.OooO00o(cls);
    }

    @KeepForSdk
    public final String OooO0Oo() {
        StringBuilder sb = new StringBuilder();
        OooO00o();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f41950OooO0O0.getBytes(Charset.defaultCharset())));
        sb.append("+");
        OooO00o();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f41951OooO0OO.f41961OooO0O0.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void OooO0o0() {
        HashMap map;
        boolean z = true;
        if (!o00000O.OooO00o(this.f41949OooO00o)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            OooO00o();
            sb.append(this.f41950OooO0O0);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f41949OooO00o;
            AtomicReference<OooO0OO> atomicReference = OooO0OO.f41958OooO0O0;
            if (atomicReference.get() == null) {
                OooO0OO oooO0OO = new OooO0OO(context);
                while (!atomicReference.compareAndSet(null, oooO0OO)) {
                    if (atomicReference.get() != null) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    context.registerReceiver(oooO0OO, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder("Device unlocked: initializing all Firebase APIs for app ");
        OooO00o();
        sb2.append(this.f41950OooO0O0);
        Log.i("FirebaseApp", sb2.toString());
        OooOOOO oooOOOO = this.f41952OooO0Oo;
        OooO00o();
        boolean zEquals = "[DEFAULT]".equals(this.f41950OooO0O0);
        AtomicReference<Boolean> atomicReference2 = oooOOOO.f19818OooO0o0;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                z = false;
                break;
            }
        }
        if (z) {
            synchronized (oooOOOO) {
                map = new HashMap(oooOOOO.f19813OooO00o);
            }
            oooOOOO.OooO0oO(map, zEquals);
        }
        this.f41956OooO0oo.get().OooO0OO();
    }

    @KeepForSdk
    public final boolean OooO0oo() {
        boolean z;
        OooO00o();
        OooO0o oooO0o = this.f41955OooO0oO.get();
        synchronized (oooO0o) {
            z = oooO0o.f42407OooO0O0;
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof OooOO0)) {
            return false;
        }
        OooOO0 oooOO1 = (OooOO0) obj;
        oooOO1.OooO00o();
        return this.f41950OooO0O0.equals(oooOO1.f41950OooO0O0);
    }

    public final int hashCode() {
        return this.f41950OooO0O0.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.f41950OooO0O0).add("options", this.f41951OooO0OO).toString();
    }
}
