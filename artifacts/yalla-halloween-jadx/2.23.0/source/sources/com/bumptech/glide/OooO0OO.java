package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.manager.o00Oo0;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p127o00O0oo.o0O0O00;
import p129o00O0ooo.o000;
import p129o00O0ooo.o0000;
import p129o00O0ooo.o0000O0;
import p129o00O0ooo.o0000OO0;
import p129o00O0ooo.o0000oo;
import p134o00OO0oo.o0Oo0oo;
import p134o00OO0oo.o0ooOOo;
import p134o00OO0oo.oo000o;
import p532o0o0Oo.o00000OO;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("Glide.class")
    public static volatile OooO0OO f9848OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static volatile boolean f9849OooOOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final o00Oo0 f9850OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o0O0O00 f9851OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00O.OooOOO f9852OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final o0000oo f9853OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO f9854OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final o0000 f9855OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final com.bumptech.glide.manager.OooO0o f9856OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("managers")
    public final ArrayList f9857OooOO0O = new ArrayList();

    public interface OooO00o {
    }

    public OooO0OO(@NonNull Context context, @NonNull o0O0O00 o0o0o00, @NonNull o00O.OooOOO oooOOO, @NonNull o0000oo o0000ooVar, @NonNull o0000 o0000Var, @NonNull o00Oo0 o00oo1, @NonNull com.bumptech.glide.manager.OooO0o oooO0o, int i, @NonNull OooO0o.OooO00o oooO00o, @NonNull p188o00o0O.OooOO0 oooOO1, @NonNull List list, @NonNull List list2, @Nullable oo000o oo000oVar, @NonNull OooOO0 oooOO2) {
        this.f9851OooO0Oo = o0o0o00;
        this.f9853OooO0o0 = o0000ooVar;
        this.f9855OooO0oo = o0000Var;
        this.f9852OooO0o = oooOOO;
        this.f9850OooO = o00oo1;
        this.f9856OooOO0 = oooO0o;
        this.f9854OooO0oO = new OooO(context, o0000Var, new OooOOO0(this, list2, oo000oVar), new o00OOO00.OooOO0(), oooO00o, oooOO1, list, o0o0o00, oooOO2, i);
    }

    @NonNull
    public static OooOo00 OooO(@NonNull View view) {
        o00Oo0 o00oo0OooO0Oo = OooO0Oo(view.getContext());
        o00oo0OooO0Oo.getClass();
        if (p532o0o0Oo.o0000oo.OooO0oo()) {
            return o00oo0OooO0Oo.OooO0o(view.getContext().getApplicationContext());
        }
        if (view.getContext() == null) {
            throw new NullPointerException("Unable to obtain a request manager for a view without a Context");
        }
        Activity activityOooO00o = o00Oo0.OooO00o(view.getContext());
        if (activityOooO00o == null) {
            return o00oo0OooO0Oo.OooO0o(view.getContext().getApplicationContext());
        }
        boolean z = activityOooO00o instanceof FragmentActivity;
        com.bumptech.glide.manager.OooOo00 oooOo00 = o00oo0OooO0Oo.f10037OooOO0o;
        if (!z) {
            p188o00o0O.OooOO0<View, Fragment> oooOO1 = o00oo0OooO0Oo.f10035OooOO0;
            oooOO1.clear();
            o00oo0OooO0Oo.OooO0O0(activityOooO00o.getFragmentManager(), oooOO1);
            View viewFindViewById = activityOooO00o.findViewById(R.id.content);
            Fragment orDefault = null;
            while (!view.equals(viewFindViewById) && (orDefault = oooOO1.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
                view = (View) view.getParent();
            }
            oooOO1.clear();
            if (orDefault == null) {
                return o00oo0OooO0Oo.OooO0o0(activityOooO00o);
            }
            if (orDefault.getActivity() == null) {
                throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
            }
            if (p532o0o0Oo.o0000oo.OooO0oo()) {
                return o00oo0OooO0Oo.OooO0o(orDefault.getActivity().getApplicationContext());
            }
            if (orDefault.getActivity() != null) {
                orDefault.getActivity();
                oooOo00.OooO00o();
            }
            return o00oo0OooO0Oo.OooO0Oo(orDefault.getActivity(), orDefault.getChildFragmentManager(), orDefault, orDefault.isVisible());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityOooO00o;
        p188o00o0O.OooOO0<View, androidx.fragment.app.Fragment> oooOO2 = o00oo0OooO0Oo.f10029OooO;
        oooOO2.clear();
        o00Oo0.OooO0OO(fragmentActivity.getSupportFragmentManager().Oooo00O(), oooOO2);
        View viewFindViewById2 = fragmentActivity.findViewById(R.id.content);
        androidx.fragment.app.Fragment orDefault2 = null;
        while (!view.equals(viewFindViewById2) && (orDefault2 = oooOO2.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        oooOO2.clear();
        if (orDefault2 == null) {
            return o00oo0OooO0Oo.OooO0oO(fragmentActivity);
        }
        if (orDefault2.getContext() == null) {
            throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
        }
        if (p532o0o0Oo.o0000oo.OooO0oo()) {
            return o00oo0OooO0Oo.OooO0o(orDefault2.getContext().getApplicationContext());
        }
        if (orDefault2.getActivity() != null) {
            orDefault2.getActivity();
            oooOo00.OooO00o();
        }
        FragmentManager childFragmentManager = orDefault2.getChildFragmentManager();
        Context context = orDefault2.getContext();
        return o00oo0OooO0Oo.f10038OooOOO0.OooO00o(context, OooO0O0(context.getApplicationContext()), orDefault2.getLifecycle(), childFragmentManager, orDefault2.isVisible());
    }

    @NonNull
    public static OooO0OO OooO0O0(@NonNull Context context) {
        if (f9848OooOO0o == null) {
            GeneratedAppGlideModule generatedAppGlideModuleOooO0OO = OooO0OO(context.getApplicationContext());
            synchronized (OooO0OO.class) {
                if (f9848OooOO0o == null) {
                    if (f9849OooOOO0) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f9849OooOOO0 = true;
                    try {
                        OooO0o0(context, new OooO0o(), generatedAppGlideModuleOooO0OO);
                        f9849OooOOO0 = false;
                    } catch (Throwable th) {
                        f9849OooOOO0 = false;
                        throw th;
                    }
                }
            }
        }
        return f9848OooOO0o;
    }

    @Nullable
    public static GeneratedAppGlideModule OooO0OO(Context context) {
        try {
            return (GeneratedAppGlideModule) GeneratedAppGlideModuleImpl.class.getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
        } catch (NoSuchMethodException e3) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
        }
    }

    @NonNull
    public static o00Oo0 OooO0Oo(@Nullable Context context) {
        if (context != null) {
            return OooO0O0(context).f9850OooO;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    @VisibleForTesting
    public static void OooO0o() {
        synchronized (OooO0OO.class) {
            if (f9848OooOO0o != null) {
                f9848OooOO0o.f9854OooO0oO.getBaseContext().getApplicationContext().unregisterComponentCallbacks(f9848OooOO0o);
                f9848OooOO0o.f9851OooO0Oo.OooO0oo();
            }
            f9848OooOO0o = null;
        }
    }

    @GuardedBy("Glide.class")
    public static void OooO0o0(@NonNull Context context, @NonNull OooO0o oooO0o, @Nullable GeneratedAppGlideModule generatedAppGlideModule) {
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.OooO0OO();
        }
        if (Log.isLoggable("ManifestParser", 3)) {
            Log.d("ManifestParser", "Loading Glide modules");
        }
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Log.v("ManifestParser", "Got app info metadata: " + applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        arrayList.add(o0Oo0oo.OooO00o(str));
                        if (Log.isLoggable("ManifestParser", 3)) {
                            Log.d("ManifestParser", "Loaded Glide module: " + str);
                        }
                    }
                }
                if (Log.isLoggable("ManifestParser", 3)) {
                    Log.d("ManifestParser", "Finished loading Glide modules");
                }
            } else if (Log.isLoggable("ManifestParser", 3)) {
                Log.d("ManifestParser", "Got null app info metadata");
            }
            if (generatedAppGlideModule != null && !generatedAppGlideModule.OooO0Oo().isEmpty()) {
                Set<Class<?>> setOooO0Oo = generatedAppGlideModule.OooO0Oo();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    o0ooOOo o0ooooo = (o0ooOOo) it.next();
                    if (setOooO0Oo.contains(o0ooooo.getClass())) {
                        if (Log.isLoggable("Glide", 3)) {
                            Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + o0ooooo);
                        }
                        it.remove();
                    }
                }
            }
            if (Log.isLoggable("Glide", 3)) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Log.d("Glide", "Discovered GlideModule from manifest: " + ((o0ooOOo) it2.next()).getClass());
                }
            }
            oooO0o.f9870OooOOO = generatedAppGlideModule != null ? generatedAppGlideModule.OooO0o0() : null;
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((o0ooOOo) it3.next()).OooO00o();
            }
            if (generatedAppGlideModule != null) {
                generatedAppGlideModule.OooO00o();
            }
            if (oooO0o.f9865OooO0oO == null) {
                o00OO000.OooO00o.ThreadFactoryC0424OooO00o threadFactoryC0424OooO00o = new o00OO000.OooO00o.ThreadFactoryC0424OooO00o();
                if (o00OO000.OooO00o.f37063OooO0o == 0) {
                    o00OO000.OooO00o.f37063OooO0o = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i = o00OO000.OooO00o.f37063OooO0o;
                if (TextUtils.isEmpty("source")) {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
                }
                oooO0o.f9865OooO0oO = new o00OO000.OooO00o(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o00OO000.OooO00o.OooO0O0(threadFactoryC0424OooO00o, "source", false)));
            }
            if (oooO0o.f9866OooO0oo == null) {
                int i2 = o00OO000.OooO00o.f37063OooO0o;
                o00OO000.OooO00o.ThreadFactoryC0424OooO00o threadFactoryC0424OooO00o2 = new o00OO000.OooO00o.ThreadFactoryC0424OooO00o();
                if (TextUtils.isEmpty("disk-cache")) {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
                }
                oooO0o.f9866OooO0oo = new o00OO000.OooO00o(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o00OO000.OooO00o.OooO0O0(threadFactoryC0424OooO00o2, "disk-cache", true)));
            }
            if (oooO0o.f9872OooOOOO == null) {
                if (o00OO000.OooO00o.f37063OooO0o == 0) {
                    o00OO000.OooO00o.f37063OooO0o = Math.min(4, Runtime.getRuntime().availableProcessors());
                }
                int i3 = o00OO000.OooO00o.f37063OooO0o >= 4 ? 2 : 1;
                o00OO000.OooO00o.ThreadFactoryC0424OooO00o threadFactoryC0424OooO00o3 = new o00OO000.OooO00o.ThreadFactoryC0424OooO00o();
                if (TextUtils.isEmpty("animation")) {
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                }
                oooO0o.f9872OooOOOO = new o00OO000.OooO00o(new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o00OO000.OooO00o.OooO0O0(threadFactoryC0424OooO00o3, "animation", true)));
            }
            if (oooO0o.f9867OooOO0 == null) {
                oooO0o.f9867OooOO0 = new o00O.OooOOOO(new o00O.OooOOOO.OooO00o(applicationContext));
            }
            if (oooO0o.f9868OooOO0O == null) {
                oooO0o.f9868OooOO0O = new com.bumptech.glide.manager.OooOO0();
            }
            if (oooO0o.f9862OooO0Oo == null) {
                int i4 = oooO0o.f9867OooOO0.f35954OooO00o;
                if (i4 > 0) {
                    oooO0o.f9862OooO0Oo = new o000(i4);
                } else {
                    oooO0o.f9862OooO0Oo = new o0000O0();
                }
            }
            if (oooO0o.f9864OooO0o0 == null) {
                oooO0o.f9864OooO0o0 = new o0000OO0(oooO0o.f9867OooOO0.f35956OooO0OO);
            }
            if (oooO0o.f9863OooO0o == null) {
                oooO0o.f9863OooO0o = new o00O.OooOOO0(oooO0o.f9867OooOO0.f35955OooO0O0);
            }
            if (oooO0o.f9858OooO == null) {
                oooO0o.f9858OooO = new o00O.OooOO0O(262144000L, "image_manager_disk_cache", applicationContext);
            }
            if (oooO0o.f9861OooO0OO == null) {
                oooO0o.f9861OooO0OO = new o0O0O00(oooO0o.f9863OooO0o, oooO0o.f9858OooO, oooO0o.f9866OooO0oo, oooO0o.f9865OooO0oO, new o00OO000.OooO00o(new ThreadPoolExecutor(0, Integer.MAX_VALUE, o00OO000.OooO00o.f37064OooO0o0, TimeUnit.MILLISECONDS, new SynchronousQueue(), new o00OO000.OooO00o.OooO0O0(new o00OO000.OooO00o.ThreadFactoryC0424OooO00o(), "source-unlimited", false))), oooO0o.f9872OooOOOO);
            }
            List<o00OO.OooO<Object>> list = oooO0o.f9873OooOOOo;
            if (list == null) {
                oooO0o.f9873OooOOOo = Collections.emptyList();
            } else {
                oooO0o.f9873OooOOOo = Collections.unmodifiableList(list);
            }
            OooOO0.OooO00o oooO00o = oooO0o.f9860OooO0O0;
            oooO00o.getClass();
            OooOO0 oooOO1 = new OooOO0(oooO00o);
            OooO0OO oooO0OO = new OooO0OO(applicationContext, oooO0o.f9861OooO0OO, oooO0o.f9863OooO0o, oooO0o.f9862OooO0Oo, oooO0o.f9864OooO0o0, new o00Oo0(oooO0o.f9870OooOOO, oooOO1), oooO0o.f9868OooOO0O, oooO0o.f9869OooOO0o, oooO0o.f9871OooOOO0, oooO0o.f9859OooO00o, oooO0o.f9873OooOOOo, arrayList, generatedAppGlideModule, oooOO1);
            applicationContext.registerComponentCallbacks(oooO0OO);
            f9848OooOO0o = oooO0OO;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    @NonNull
    public static OooOo00 OooO0oo(@NonNull Context context) {
        return OooO0Oo(context).OooO0o(context);
    }

    public final void OooO00o() {
        p532o0o0Oo.o0000oo.OooO00o();
        ((o00000OO) this.f9852OooO0o).OooO0o0(0L);
        this.f9853OooO0o0.OooO0O0();
        this.f9855OooO0oo.OooO0O0();
    }

    public final void OooO0oO(OooOo00 oooOo00) {
        synchronized (this.f9857OooOO0O) {
            if (!this.f9857OooOO0O.contains(oooOo00)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f9857OooOO0O.remove(oooOo00);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        OooO00o();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        p532o0o0Oo.o0000oo.OooO00o();
        synchronized (this.f9857OooOO0O) {
            Iterator it = this.f9857OooOO0O.iterator();
            while (it.hasNext()) {
                ((OooOo00) it.next()).getClass();
            }
        }
        ((o00O.OooOOO0) this.f9852OooO0o).OooO0o(i);
        this.f9853OooO0o0.OooO00o(i);
        this.f9855OooO0oo.OooO00o(i);
    }
}
