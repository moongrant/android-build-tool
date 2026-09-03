package p626o0ooO;

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
import com.google.firebase.components.OooOo00;
import com.google.firebase.components.o0OoOo0;
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
import o0O0o00O.OooO0OO;
import p063o0000oO.o000000;
import p190o00o0O.OooO;
import p301o0O0o0O.OooO0o;
import p306o0O0o0oO.o000O00O;
import p320o0O0oo0.o00OO00O;

/* JADX INFO: loaded from: classes3.dex */
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public static final Object f57659OooOO0 = new Object();

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("LOCK")
    public static final OooO f57660OooOO0O = new OooO();

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f57662OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final String f57663OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final oo0o0Oo f57664OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final OooOo00 f57665OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final o0OoOo0<o000O00O> f57668OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO0o<com.google.firebase.heartbeatinfo.OooO00o> f57669OooO0oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final AtomicBoolean f57667OooO0o0 = new AtomicBoolean(false);

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final AtomicBoolean f57666OooO0o = new AtomicBoolean();

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final CopyOnWriteArrayList f57661OooO = new CopyOnWriteArrayList();

    @KeepForSdk
    public interface OooO00o {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @TargetApi(14)
    public static class OooO0O0 implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public static final AtomicReference<OooO0O0> f57670OooO00o = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            synchronized (o0OOO0o.f57659OooOO0) {
                for (o0OOO0o o0ooo0o2 : new ArrayList(o0OOO0o.f57660OooOO0O.values())) {
                    if (o0ooo0o2.f57667OooO0o0.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = o0ooo0o2.f57661OooO.iterator();
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
        public static final AtomicReference<OooO0OO> f57671OooO0O0 = new AtomicReference<>();

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final Context f57672OooO00o;

        public OooO0OO(Context context) {
            this.f57672OooO00o = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (o0OOO0o.f57659OooOO0) {
                Iterator it = ((OooO.C0432OooO) o0OOO0o.f57660OooOO0O.values()).iterator();
                while (it.hasNext()) {
                    ((o0OOO0o) it.next()).OooO0o0();
                }
            }
            this.f57672OooO00o.unregisterReceiver(this);
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
    public o0OOO0o(final Context context, oo0o0Oo oo0o0oo, String str) {
        Bundle bundle;
        ?? arrayList;
        ArrayList arrayList2;
        OooO00o oooO00o;
        new CopyOnWriteArrayList();
        this.f57662OooO00o = (Context) Preconditions.checkNotNull(context);
        this.f57663OooO0O0 = Preconditions.checkNotEmpty(str);
        this.f57664OooO0OO = (oo0o0Oo) Preconditions.checkNotNull(oo0o0oo);
        o00Ooo o00ooo2 = FirebaseInitProvider.f20029OooO0Oo;
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
                    arrayList3.add(new OooO0o() { // from class: com.google.firebase.components.OooO0o
                        @Override // p301o0O0o0O.OooO0o
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
                arrayList4.add(new OooO0o() { // from class: com.google.firebase.components.OooOOOO
                    @Override // p301o0O0o0O.OooO0o
                    public final Object get() {
                        return firebaseCommonRegistrar;
                    }
                });
                final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
                arrayList4.add(new OooO0o() { // from class: com.google.firebase.components.OooOOOO
                    @Override // p301o0O0o0O.OooO0o
                    public final Object get() {
                        return executorsRegistrar;
                    }
                });
                arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(context, Context.class, new Class[0]));
                arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(this, o0OOO0o.class, new Class[0]));
                arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(oo0o0oo, oo0o0Oo.class, new Class[0]));
                o00OO00O o00oo00o = new o00OO00O();
                if (o000000.OooO00o(context) && FirebaseInitProvider.f20030OooO0o0.get()) {
                    arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(o00ooo2, o0O0O00.class, new Class[0]));
                }
                OooOo00 oooOo00 = new OooOo00(uiExecutor, arrayList4, arrayList2, o00oo00o);
                this.f57665OooO0Oo = oooOo00;
                Trace.endSection();
                this.f57668OooO0oO = new o0OoOo0<>(new OooO0o() { // from class: o0ooO.o00oO0o
                    @Override // p301o0O0o0O.OooO0o
                    public final Object get() {
                        o0OOO0o o0ooo0o2 = this.f57657OooO00o;
                        return new o000O00O(context, o0ooo0o2.OooO0Oo(), (OooO0OO) o0ooo0o2.f57665OooO0Oo.OooO00o(OooO0OO.class));
                    }
                });
                this.f57669OooO0oo = oooOo00.OooO0o0(com.google.firebase.heartbeatinfo.OooO00o.class);
                oooO00o = new OooO00o() { // from class: o0ooO.o0ooOOo
                    @Override // o0ooO.o0OOO0o.OooO00o
                    public final void onBackgroundStateChanged(boolean z) {
                        o0OOO0o o0ooo0o2 = this.f57673OooO00o;
                        if (z) {
                            o0ooo0o2.getClass();
                        } else {
                            o0ooo0o2.f57669OooO0oo.get().OooO0OO();
                        }
                    }
                };
                OooO00o();
                if (this.f57667OooO0o0.get() && BackgroundDetector.getInstance().isInBackground()) {
                    oooO00o.onBackgroundStateChanged(true);
                }
                this.f57661OooO.add(oooO00o);
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
            arrayList3.add(new OooO0o() { // from class: com.google.firebase.components.OooO0o
                @Override // p301o0O0o0O.OooO0o
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
        arrayList5.add(new OooO0o() { // from class: com.google.firebase.components.OooOOOO
            @Override // p301o0O0o0O.OooO0o
            public final Object get() {
                return firebaseCommonRegistrar2;
            }
        });
        final ComponentRegistrar executorsRegistrar2 = new ExecutorsRegistrar();
        arrayList5.add(new OooO0o() { // from class: com.google.firebase.components.OooOOOO
            @Override // p301o0O0o0O.OooO0o
            public final Object get() {
                return executorsRegistrar2;
            }
        });
        arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(context, Context.class, new Class[0]));
        arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(this, o0OOO0o.class, new Class[0]));
        arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(oo0o0oo, oo0o0Oo.class, new Class[0]));
        o00OO00O o00oo00o2 = new o00OO00O();
        if (o000000.OooO00o(context)) {
            arrayList2.add(com.google.firebase.components.OooO0O0.OooO0O0(o00ooo2, o0O0O00.class, new Class[0]));
        }
        OooOo00 oooOo01 = new OooOo00(uiExecutor2, arrayList5, arrayList2, o00oo00o2);
        this.f57665OooO0Oo = oooOo01;
        Trace.endSection();
        this.f57668OooO0oO = new o0OoOo0<>(new OooO0o() { // from class: o0ooO.o00oO0o
            @Override // p301o0O0o0O.OooO0o
            public final Object get() {
                o0OOO0o o0ooo0o2 = this.f57657OooO00o;
                return new o000O00O(context, o0ooo0o2.OooO0Oo(), (OooO0OO) o0ooo0o2.f57665OooO0Oo.OooO00o(OooO0OO.class));
            }
        });
        this.f57669OooO0oo = oooOo01.OooO0o0(com.google.firebase.heartbeatinfo.OooO00o.class);
        oooO00o = new OooO00o() { // from class: o0ooO.o0ooOOo
            @Override // o0ooO.o0OOO0o.OooO00o
            public final void onBackgroundStateChanged(boolean z) {
                o0OOO0o o0ooo0o2 = this.f57673OooO00o;
                if (z) {
                    o0ooo0o2.getClass();
                } else {
                    o0ooo0o2.f57669OooO0oo.get().OooO0OO();
                }
            }
        };
        OooO00o();
        if (this.f57667OooO0o0.get()) {
            oooO00o.onBackgroundStateChanged(true);
        }
        this.f57661OooO.add(oooO00o);
        Trace.endSection();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    public static o0OOO0o OooO0OO() {
        o0OOO0o o0ooo0o2;
        synchronized (f57659OooOO0) {
            o0ooo0o2 = (o0OOO0o) f57660OooOO0O.getOrDefault("[DEFAULT]", null);
            if (o0ooo0o2 == null) {
                throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
            o0ooo0o2.f57669OooO0oo.get().OooO0OO();
        }
        return o0ooo0o2;
    }

    @Nullable
    public static o0OOO0o OooO0o(@NonNull Context context) {
        synchronized (f57659OooOO0) {
            if (f57660OooOO0O.containsKey("[DEFAULT]")) {
                return OooO0OO();
            }
            oo0o0Oo oo0o0ooOooO00o = oo0o0Oo.OooO00o(context);
            if (oo0o0ooOooO00o == null) {
                Log.w("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                return null;
            }
            return OooO0oO(context, oo0o0ooOooO00o);
        }
    }

    @NonNull
    public static o0OOO0o OooO0oO(@NonNull Context context, @NonNull oo0o0Oo oo0o0oo) {
        o0OOO0o o0ooo0o2;
        boolean z;
        AtomicReference<OooO0O0> atomicReference = OooO0O0.f57670OooO00o;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<OooO0O0> atomicReference2 = OooO0O0.f57670OooO00o;
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
        synchronized (f57659OooOO0) {
            OooO oooO = f57660OooOO0O;
            Preconditions.checkState(true ^ oooO.containsKey("[DEFAULT]"), "FirebaseApp name [DEFAULT] already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            o0ooo0o2 = new o0OOO0o(context, oo0o0oo, "[DEFAULT]");
            oooO.put("[DEFAULT]", o0ooo0o2);
        }
        o0ooo0o2.OooO0o0();
        return o0ooo0o2;
    }

    public final void OooO00o() {
        Preconditions.checkState(!this.f57666OooO0o.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    public final <T> T OooO0O0(Class<T> cls) {
        OooO00o();
        return (T) this.f57665OooO0Oo.OooO00o(cls);
    }

    @KeepForSdk
    public final String OooO0Oo() {
        StringBuilder sb = new StringBuilder();
        OooO00o();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f57663OooO0O0.getBytes(Charset.defaultCharset())));
        sb.append("+");
        OooO00o();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.f57664OooO0OO.f57675OooO0O0.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void OooO0o0() {
        HashMap map;
        boolean z = true;
        if (!o000000.OooO00o(this.f57662OooO00o)) {
            StringBuilder sb = new StringBuilder("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ");
            OooO00o();
            sb.append(this.f57663OooO0O0);
            Log.i("FirebaseApp", sb.toString());
            Context context = this.f57662OooO00o;
            AtomicReference<OooO0OO> atomicReference = OooO0OO.f57671OooO0O0;
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
        sb2.append(this.f57663OooO0O0);
        Log.i("FirebaseApp", sb2.toString());
        OooOo00 oooOo00 = this.f57665OooO0Oo;
        OooO00o();
        boolean zEquals = "[DEFAULT]".equals(this.f57663OooO0O0);
        AtomicReference<Boolean> atomicReference2 = oooOo00.f19351OooO0o0;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                z = false;
                break;
            }
        }
        if (z) {
            synchronized (oooOo00) {
                map = new HashMap(oooOo00.f19346OooO00o);
            }
            oooOo00.OooO0oO(map, zEquals);
        }
        this.f57669OooO0oo.get().OooO0OO();
    }

    @KeepForSdk
    public final boolean OooO0oo() {
        boolean z;
        OooO00o();
        o000O00O o000o00o2 = this.f57668OooO0oO.get();
        synchronized (o000o00o2) {
            z = o000o00o2.f41768OooO0O0;
        }
        return z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o0OOO0o)) {
            return false;
        }
        o0OOO0o o0ooo0o2 = (o0OOO0o) obj;
        o0ooo0o2.OooO00o();
        return this.f57663OooO0O0.equals(o0ooo0o2.f57663OooO0O0);
    }

    public final int hashCode() {
        return this.f57663OooO0O0.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add("name", this.f57663OooO0O0).add("options", this.f57664OooO0OO).toString();
    }
}
