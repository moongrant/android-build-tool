package p070o0000ooO;

import android.app.Activity;
import android.app.Application;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class o0OOO0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Class<?> f28009OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static final Field f28010OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static final Field f28011OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static final Method f28012OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static final Method f28013OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static final Method f28014OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static final Handler f28015OooO0oO = new Handler(Looper.getMainLooper());

    public static final class OooO00o implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
        public Object f28017Oooo0o;

        /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
        public Activity f28018Oooo0oO;

        /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
        public final int f28019Oooo0oo;

        /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
        public boolean f28016Oooo = false;

        /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
        public boolean f28021OoooO00 = false;

        /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
        public boolean f28020OoooO0 = false;

        public OooO00o(@NonNull Activity activity) {
            this.f28018Oooo0oO = activity;
            this.f28019Oooo0oo = activity.hashCode();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (this.f28018Oooo0oO == activity) {
                this.f28018Oooo0oO = null;
                this.f28021OoooO00 = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            if (!this.f28021OoooO00 || this.f28020OoooO0 || this.f28016Oooo) {
                return;
            }
            Object obj = this.f28017Oooo0o;
            int i = this.f28019Oooo0oo;
            boolean z = false;
            try {
                Object obj2 = o0OOO0o.f28011OooO0OO.get(activity);
                if (obj2 == obj && activity.hashCode() == i) {
                    o0OOO0o.f28015OooO0oO.postAtFrontOfQueue(new o0ooOOo(o0OOO0o.f28010OooO0O0.get(activity), obj2));
                    z = true;
                }
            } catch (Throwable th) {
                Log.e("ActivityRecreator", "Exception while fetching field values", th);
            }
            if (z) {
                this.f28020OoooO0 = true;
                this.f28017Oooo0o = null;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            if (this.f28018Oooo0oO == activity) {
                this.f28016Oooo = true;
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
        }
    }

    static {
        Class<?> cls;
        Field declaredField;
        Field declaredField2;
        Method declaredMethod;
        Method declaredMethod2;
        Method method = null;
        try {
            cls = Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            cls = null;
        }
        f28009OooO00o = cls;
        try {
            declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
        } catch (Throwable unused2) {
            declaredField = null;
        }
        f28010OooO0O0 = declaredField;
        try {
            declaredField2 = Activity.class.getDeclaredField("mToken");
            declaredField2.setAccessible(true);
        } catch (Throwable unused3) {
            declaredField2 = null;
        }
        f28011OooO0OO = declaredField2;
        Class<?> cls2 = f28009OooO00o;
        if (cls2 == null) {
            declaredMethod = null;
        } else {
            try {
                declaredMethod = cls2.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
                declaredMethod.setAccessible(true);
            } catch (Throwable unused4) {
                declaredMethod = null;
            }
        }
        f28012OooO0Oo = declaredMethod;
        Class<?> cls3 = f28009OooO00o;
        if (cls3 == null) {
            declaredMethod2 = null;
        } else {
            try {
                declaredMethod2 = cls3.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
                declaredMethod2.setAccessible(true);
            } catch (Throwable unused5) {
                declaredMethod2 = null;
            }
        }
        f28014OooO0o0 = declaredMethod2;
        Class<?> cls4 = f28009OooO00o;
        if (OooO00o() && cls4 != null) {
            try {
                Class<?> cls5 = Boolean.TYPE;
                Method declaredMethod3 = cls4.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, Integer.TYPE, cls5, Configuration.class, Configuration.class, cls5, cls5);
                declaredMethod3.setAccessible(true);
                method = declaredMethod3;
            } catch (Throwable unused6) {
            }
        }
        f28013OooO0o = method;
    }

    public static boolean OooO00o() {
        int i = Build.VERSION.SDK_INT;
        return i == 26 || i == 27;
    }
}
