package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.Toolbar;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppCompatDelegate {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public static final p021OooOooo.o0OoOo0<WeakReference<AppCompatDelegate>> f4417Oooo0o = new p021OooOooo.o0OoOo0<>(0);

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static final Object f4418Oooo0oO = new Object();

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface NightMode {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void OooOOo0(@NonNull AppCompatDelegate appCompatDelegate) {
        synchronized (f4418Oooo0oO) {
            p021OooOooo.o0OoOo0<WeakReference<AppCompatDelegate>> o0oooo1 = f4417Oooo0o;
            Objects.requireNonNull(o0oooo1);
            OooOooo.o0OoOo0.OooO00o oooO00o = new OooOooo.o0OoOo0.OooO00o();
            while (oooO00o.hasNext()) {
                AppCompatDelegate appCompatDelegate2 = (AppCompatDelegate) ((WeakReference) oooO00o.next()).get();
                if (appCompatDelegate2 == appCompatDelegate || appCompatDelegate2 == null) {
                    oooO00o.remove();
                }
            }
        }
    }

    public abstract void OooO();

    public abstract void OooO0OO(View view, ViewGroup.LayoutParams layoutParams);

    @NonNull
    @CallSuper
    public Context OooO0Oo(@NonNull Context context) {
        return context;
    }

    public int OooO0o() {
        return -100;
    }

    @Nullable
    public abstract <T extends View> T OooO0o0(@IdRes int i);

    public abstract MenuInflater OooO0oO();

    @Nullable
    public abstract ActionBar OooO0oo();

    public abstract void OooOO0();

    public abstract void OooOO0O(Configuration configuration);

    public abstract void OooOO0o();

    public abstract void OooOOO();

    public abstract void OooOOO0();

    public abstract void OooOOOO();

    public abstract void OooOOOo();

    public abstract boolean OooOOo(int i);

    public abstract void OooOOoo(@LayoutRes int i);

    public abstract void OooOo(@Nullable CharSequence charSequence);

    public abstract void OooOo0(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void OooOo00(View view);

    public abstract void OooOo0O(@Nullable Toolbar toolbar);

    public void OooOo0o(@StyleRes int i) {
    }
}
