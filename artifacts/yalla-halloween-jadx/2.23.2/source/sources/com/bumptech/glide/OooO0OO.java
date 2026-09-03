package com.bumptech.glide;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.manager.Oooo0;
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
import p144o00Oo.o000O0;
import p155o00OoO0.o00O0O;
import p155o00OoO0.o00Oo0;
import p155o00OoO0.o00Ooo;
import p155o00OoO0.o0OoOo0;
import p167o00Ooo0.o00oO0o;
import p167o00Ooo0.o0OO00O;
import p167o00Ooo0.o0OOO0o;
import p172o00OooO0.o00000O0;
import p174o00OooOo.o00OO0O0;
import p174o00OooOo.oo0oOO0;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0OO implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: OooOO0o, reason: collision with root package name */
    @GuardedBy("Glide.class")
    public static volatile OooO0OO f12939OooOO0o;

    /* JADX INFO: renamed from: OooOOO0, reason: collision with root package name */
    public static volatile boolean f12940OooOOO0;

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public final Oooo0 f12941OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final o000O0 f12942OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final o00Oo0 f12943OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final p156o00OoO00.OooOO0 f12944OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final OooO f12945OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final p156o00OoO00.OooO0o f12946OooO0oo;

    /* JADX INFO: renamed from: OooOO0, reason: collision with root package name */
    public final com.bumptech.glide.manager.OooO0OO f12947OooOO0;

    /* JADX INFO: renamed from: OooOO0O, reason: collision with root package name */
    @GuardedBy("managers")
    public final ArrayList f12948OooOO0O = new ArrayList();

    public interface OooO00o {
    }

    public OooO0OO(@NonNull Context context, @NonNull o000O0 o000o0, @NonNull o00Oo0 o00oo1, @NonNull p156o00OoO00.OooOO0 oooOO1, @NonNull p156o00OoO00.OooO0o oooO0o, @NonNull Oooo0 oooo0, @NonNull com.bumptech.glide.manager.OooO0OO oooO0OO, int i, @NonNull OooO0o.OooO00o oooO00o, @NonNull p190o00o0O.OooO oooO, @NonNull List list, @NonNull List list2, @Nullable o00oO0o o00oo0o2, @NonNull OooOO0 oooOO2) {
        this.f12942OooO0Oo = o000o0;
        this.f12944OooO0o0 = oooOO1;
        this.f12946OooO0oo = oooO0o;
        this.f12943OooO0o = o00oo1;
        this.f12941OooO = oooo0;
        this.f12947OooOO0 = oooO0OO;
        this.f12945OooO0oO = new OooO(context, oooO0o, new OooOOO0(this, list2, o00oo0o2), new o00000O0(), oooO00o, oooO, list, o000o0, oooOO2, i);
    }

    @NonNull
    public static OooOo00 OooO(@NonNull View view) {
        Oooo0 oooo0OooO0Oo = OooO0Oo(view.getContext());
        oooo0OooO0Oo.getClass();
        char[] cArr = o00OO0O0.f38351OooO00o;
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return oooo0OooO0Oo.OooO0OO(view.getContext().getApplicationContext());
        }
        if (view.getContext() == null) {
            throw new NullPointerException("Unable to obtain a request manager for a view without a Context");
        }
        Activity activityOooO00o = Oooo0.OooO00o(view.getContext());
        if (activityOooO00o == null) {
            return oooo0OooO0Oo.OooO0OO(view.getContext().getApplicationContext());
        }
        if (!(activityOooO00o instanceof FragmentActivity)) {
            return oooo0OooO0Oo.OooO0OO(view.getContext().getApplicationContext());
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activityOooO00o;
        p190o00o0O.OooO<View, Fragment> oooO = oooo0OooO0Oo.f13124OooO0o;
        oooO.clear();
        Oooo0.OooO0O0(fragmentActivity.getSupportFragmentManager().Oooo00O(), oooO);
        View viewFindViewById = fragmentActivity.findViewById(R.id.content);
        Fragment orDefault = null;
        while (!view.equals(viewFindViewById) && (orDefault = oooO.getOrDefault(view, null)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        oooO.clear();
        if (orDefault == null) {
            return oooo0OooO0Oo.OooO0Oo(fragmentActivity);
        }
        if (orDefault.getContext() == null) {
            throw new NullPointerException("You cannot start a load on a fragment before it is attached or after it is destroyed");
        }
        if (!(Looper.myLooper() == Looper.getMainLooper())) {
            return oooo0OooO0Oo.OooO0OO(orDefault.getContext().getApplicationContext());
        }
        if (orDefault.getActivity() != null) {
            oooo0OooO0Oo.f13126OooO0oO.OooO00o(orDefault.getActivity());
        }
        FragmentManager childFragmentManager = orDefault.getChildFragmentManager();
        Context context = orDefault.getContext();
        return oooo0OooO0Oo.f13127OooO0oo.OooO00o(context, OooO0O0(context.getApplicationContext()), orDefault.getLifecycle(), childFragmentManager, orDefault.isVisible());
    }

    @NonNull
    public static OooO0OO OooO0O0(@NonNull Context context) {
        if (f12939OooOO0o == null) {
            GeneratedAppGlideModule generatedAppGlideModuleOooO0OO = OooO0OO(context.getApplicationContext());
            synchronized (OooO0OO.class) {
                if (f12939OooOO0o == null) {
                    if (f12940OooOOO0) {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                    f12940OooOOO0 = true;
                    try {
                        OooO0o0(context, new OooO0o(), generatedAppGlideModuleOooO0OO);
                        f12940OooOOO0 = false;
                    } catch (Throwable th) {
                        f12940OooOOO0 = false;
                        throw th;
                    }
                }
            }
        }
        return f12939OooOO0o;
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
    public static Oooo0 OooO0Oo(@Nullable Context context) {
        if (context != null) {
            return OooO0O0(context).f12941OooO;
        }
        throw new NullPointerException("You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
    }

    @VisibleForTesting
    public static void OooO0o() {
        synchronized (OooO0OO.class) {
            if (f12939OooOO0o != null) {
                f12939OooOO0o.f12945OooO0oO.getBaseContext().getApplicationContext().unregisterComponentCallbacks(f12939OooOO0o);
                f12939OooOO0o.f12942OooO0Oo.OooO0oo();
            }
            f12939OooOO0o = null;
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
                        arrayList.add(o0OO00O.OooO00o(str));
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
        } catch (PackageManager.NameNotFoundException e) {
            if (Log.isLoggable("ManifestParser", 6)) {
                Log.e("ManifestParser", "Failed to parse glide modules", e);
            }
        }
        if (generatedAppGlideModule != null && !generatedAppGlideModule.OooO0Oo().isEmpty()) {
            Set<Class<?>> setOooO0Oo = generatedAppGlideModule.OooO0Oo();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                o0OOO0o o0ooo0o2 = (o0OOO0o) it.next();
                if (setOooO0Oo.contains(o0ooo0o2.getClass())) {
                    if (Log.isLoggable("Glide", 3)) {
                        Log.d("Glide", "AppGlideModule excludes manifest GlideModule: " + o0ooo0o2);
                    }
                    it.remove();
                }
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Log.d("Glide", "Discovered GlideModule from manifest: " + ((o0OOO0o) it2.next()).getClass());
            }
        }
        oooO0o.f12961OooOOO = generatedAppGlideModule != null ? generatedAppGlideModule.OooO0o0() : null;
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            ((o0OOO0o) it3.next()).OooO00o();
        }
        if (generatedAppGlideModule != null) {
            generatedAppGlideModule.OooO00o();
        }
        if (oooO0o.f12956OooO0oO == null) {
            o00OoO0o.OooO.OooO00o oooO00o = new o00OoO0o.OooO.OooO00o();
            if (p157o00OoO0o.OooO.f37999OooO0o == 0) {
                p157o00OoO0o.OooO.f37999OooO0o = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i = p157o00OoO0o.OooO.f37999OooO0o;
            if (TextUtils.isEmpty("source")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
            }
            oooO0o.f12956OooO0oO = new p157o00OoO0o.OooO(new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o00OoO0o.OooO.OooO0O0(oooO00o, "source", false)));
        }
        if (oooO0o.f12957OooO0oo == null) {
            int i2 = p157o00OoO0o.OooO.f37999OooO0o;
            o00OoO0o.OooO.OooO00o oooO00o2 = new o00OoO0o.OooO.OooO00o();
            if (TextUtils.isEmpty("disk-cache")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            oooO0o.f12957OooO0oo = new p157o00OoO0o.OooO(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o00OoO0o.OooO.OooO0O0(oooO00o2, "disk-cache", true)));
        }
        if (oooO0o.f12963OooOOOO == null) {
            if (p157o00OoO0o.OooO.f37999OooO0o == 0) {
                p157o00OoO0o.OooO.f37999OooO0o = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i3 = p157o00OoO0o.OooO.f37999OooO0o >= 4 ? 2 : 1;
            o00OoO0o.OooO.OooO00o oooO00o3 = new o00OoO0o.OooO.OooO00o();
            if (TextUtils.isEmpty("animation")) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
            }
            oooO0o.f12963OooOOOO = new p157o00OoO0o.OooO(new ThreadPoolExecutor(i3, i3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new o00OoO0o.OooO.OooO0O0(oooO00o3, "animation", true)));
        }
        if (oooO0o.f12958OooOO0 == null) {
            oooO0o.f12958OooOO0 = new o00Ooo(new o00Ooo.OooO00o(applicationContext));
        }
        if (oooO0o.f12959OooOO0O == null) {
            oooO0o.f12959OooOO0O = new com.bumptech.glide.manager.OooO();
        }
        if (oooO0o.f12953OooO0Oo == null) {
            int i4 = oooO0o.f12958OooOO0.f37948OooO00o;
            if (i4 > 0) {
                oooO0o.f12953OooO0Oo = new p156o00OoO00.OooOo(i4);
            } else {
                oooO0o.f12953OooO0Oo = new p156o00OoO00.OooOO0O();
            }
        }
        if (oooO0o.f12955OooO0o0 == null) {
            oooO0o.f12955OooO0o0 = new p156o00OoO00.OooOo00(oooO0o.f12958OooOO0.f37950OooO0OO);
        }
        if (oooO0o.f12954OooO0o == null) {
            oooO0o.f12954OooO0o = new o00O0O(oooO0o.f12958OooOO0.f37949OooO0O0);
        }
        if (oooO0o.f12949OooO == null) {
            oooO0o.f12949OooO = new o0OoOo0(262144000L, "image_manager_disk_cache", applicationContext);
        }
        if (oooO0o.f12952OooO0OO == null) {
            oooO0o.f12952OooO0OO = new o000O0(oooO0o.f12954OooO0o, oooO0o.f12949OooO, oooO0o.f12957OooO0oo, oooO0o.f12956OooO0oO, new p157o00OoO0o.OooO(new ThreadPoolExecutor(0, Integer.MAX_VALUE, p157o00OoO0o.OooO.f38000OooO0o0, TimeUnit.MILLISECONDS, new SynchronousQueue(), new o00OoO0o.OooO.OooO0O0(new o00OoO0o.OooO.OooO00o(), "source-unlimited", false))), oooO0o.f12963OooOOOO);
        }
        List<p170o00Ooo0o.o0OoOo0<Object>> list = oooO0o.f12964OooOOOo;
        if (list == null) {
            oooO0o.f12964OooOOOo = Collections.emptyList();
        } else {
            oooO0o.f12964OooOOOo = Collections.unmodifiableList(list);
        }
        OooOO0.OooO00o oooO00o4 = oooO0o.f12951OooO0O0;
        oooO00o4.getClass();
        OooO0OO oooO0OO = new OooO0OO(applicationContext, oooO0o.f12952OooO0OO, oooO0o.f12954OooO0o, oooO0o.f12953OooO0Oo, oooO0o.f12955OooO0o0, new Oooo0(oooO0o.f12961OooOOO), oooO0o.f12959OooOO0O, oooO0o.f12960OooOO0o, oooO0o.f12962OooOOO0, oooO0o.f12950OooO00o, oooO0o.f12964OooOOOo, arrayList, generatedAppGlideModule, new OooOO0(oooO00o4));
        applicationContext.registerComponentCallbacks(oooO0OO);
        f12939OooOO0o = oooO0OO;
    }

    @NonNull
    public static OooOo00 OooO0oo(@NonNull Context context) {
        return OooO0Oo(context).OooO0OO(context);
    }

    public final void OooO00o() {
        o00OO0O0.OooO00o();
        ((oo0oOO0) this.f12943OooO0o).OooO0o0(0L);
        this.f12944OooO0o0.OooO0O0();
        this.f12946OooO0oo.OooO0O0();
    }

    public final void OooO0oO(OooOo00 oooOo00) {
        synchronized (this.f12948OooOO0O) {
            if (!this.f12948OooOO0O.contains(oooOo00)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            this.f12948OooOO0O.remove(oooOo00);
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
        o00OO0O0.OooO00o();
        synchronized (this.f12948OooOO0O) {
            Iterator it = this.f12948OooOO0O.iterator();
            while (it.hasNext()) {
                ((OooOo00) it.next()).getClass();
            }
        }
        ((o00O0O) this.f12943OooO0o).OooO0o(i);
        this.f12944OooO0o0.OooO00o(i);
        this.f12946OooO0oo.OooO00o(i);
    }
}
