package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(19)
final class ImmLeaksCleaner implements LifecycleEventObserver {

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public static Field f4302Oooo;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public static int f4303Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public static Field f4304Oooo0oo;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public static Field f4305OoooO00;

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public Activity f4306Oooo0o;

    public ImmLeaksCleaner(Activity activity) {
        this.f4306Oooo0o = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f4303Oooo0oO == 0) {
            try {
                f4303Oooo0oO = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f4302Oooo = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f4305OoooO00 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f4304Oooo0oo = declaredField3;
                declaredField3.setAccessible(true);
                f4303Oooo0oO = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f4303Oooo0oO == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f4306Oooo0o.getSystemService("input_method");
            try {
                Object obj = f4304Oooo0oo.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f4302Oooo.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f4305OoooO00.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    } catch (ClassCastException unused3) {
                    } catch (IllegalAccessException unused4) {
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
