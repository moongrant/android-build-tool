package p254o00ooO0O;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o00000OO implements Application.ActivityLifecycleCallbacks {
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!o00000O.f34255OooO0O0.contains(activity.getClass())) {
            o00000O.f34256OooO0OO.add(activity);
            o00000O o00000o = o00000O.f34254OooO00o;
            o00000O.f34257OooO0Oo = new WeakReference<>(activity);
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = o00000O.f34259OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().onActivityCreated(activity, bundle);
        }
        if (o00000O.f34256OooO0OO.size() == 0) {
            o00000O o00000o2 = o00000O.f34254OooO00o;
            o00000O.OooO00o(activity, true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<Application.ActivityLifecycleCallbacks> it = o00000O.f34259OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().onActivityDestroyed(activity);
        }
        if (o00000O.f34255OooO0O0.contains(activity.getClass())) {
            return;
        }
        o00000O.f34256OooO0OO.remove(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Iterator<T> it = o00000O.f34259OooO0o0.iterator();
        while (it.hasNext()) {
            ((Application.ActivityLifecycleCallbacks) it.next()).onActivityPaused(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!o00000O.f34255OooO0O0.contains(activity.getClass())) {
            WeakReference<Activity> weakReference = o00000O.f34257OooO0Oo;
            if (!Intrinsics.areEqual(weakReference != null ? weakReference.get() : null, activity)) {
                o00000O o00000o = o00000O.f34254OooO00o;
                o00000O.f34257OooO0Oo = new WeakReference<>(activity);
            }
        }
        if (o00000O.f34260OooO0oO) {
            o00000O o00000o2 = o00000O.f34254OooO00o;
            o00000O.f34260OooO0oO = false;
            o00000O.OooO00o(activity, true);
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = o00000O.f34259OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().onActivityResumed(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
        Iterator<T> it = o00000O.f34259OooO0o0.iterator();
        while (it.hasNext()) {
            ((Application.ActivityLifecycleCallbacks) it.next()).onActivitySaveInstanceState(activity, outState);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (o00000O.f34253OooO < 0) {
            o00000O o00000o = o00000O.f34254OooO00o;
            o00000O.f34253OooO++;
            o00000O o00000o2 = o00000O.f34254OooO00o;
        } else {
            o00000O o00000o3 = o00000O.f34254OooO00o;
            o00000O.f34261OooO0oo++;
            o00000O o00000o4 = o00000O.f34254OooO00o;
        }
        Iterator<T> it = o00000O.f34259OooO0o0.iterator();
        while (it.hasNext()) {
            ((Application.ActivityLifecycleCallbacks) it.next()).onActivityStarted(activity);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity.isChangingConfigurations()) {
            o00000O o00000o = o00000O.f34254OooO00o;
            o00000O.f34253OooO--;
            o00000O o00000o2 = o00000O.f34254OooO00o;
        } else {
            o00000O o00000o3 = o00000O.f34254OooO00o;
            o00000O.f34261OooO0oo--;
            o00000O o00000o4 = o00000O.f34254OooO00o;
            if (o00000O.f34261OooO0oo <= 0) {
                o00000O.f34260OooO0oO = true;
                o00000O.OooO00o(activity, false);
            }
        }
        Iterator<Application.ActivityLifecycleCallbacks> it = o00000O.f34259OooO0o0.iterator();
        while (it.hasNext()) {
            it.next().onActivityStopped(activity);
        }
    }
}
