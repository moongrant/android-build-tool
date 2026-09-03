package p254o00ooO0O;

import android.app.Activity;
import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@StabilityInferred(parameters = 0)
public final class o00000O {

    /* JADX INFO: renamed from: OooO, reason: collision with root package name */
    public static int f34253OooO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    @Nullable
    public static WeakReference<Activity> f34257OooO0Oo;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static boolean f34260OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static int f34261OooO0oo;

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @NotNull
    public static final o00000O f34254OooO00o = new o00000O();

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @NotNull
    public static final Set<Class<?>> f34255OooO0O0 = new LinkedHashSet();

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NotNull
    public static final Stack<Activity> f34256OooO0OO = new Stack<>();

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    @NotNull
    public static final ArrayList<Application.ActivityLifecycleCallbacks> f34259OooO0o0 = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    @NotNull
    public static final CopyOnWriteArrayList<OooO00o> f34258OooO0o = new CopyOnWriteArrayList<>();

    public interface OooO00o {
        void onBackground();

        void onForeground();
    }

    public static final void OooO00o(Activity activity, boolean z) {
        CopyOnWriteArrayList<OooO00o> copyOnWriteArrayList = f34258OooO0o;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        for (OooO00o oooO00o : copyOnWriteArrayList) {
            if (z) {
                oooO00o.onForeground();
            } else {
                oooO00o.onBackground();
            }
        }
    }

    @Nullable
    public final Activity OooO0O0() {
        WeakReference<Activity> weakReference = f34257OooO0Oo;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }
}
