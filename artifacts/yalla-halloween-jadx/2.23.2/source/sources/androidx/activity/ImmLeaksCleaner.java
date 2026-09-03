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

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static Field f2151OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static int f2152OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static Field f2153OooO0oO;

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public static Field f2154OooO0oo;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final Activity f2155OooO0Oo;

    public ImmLeaksCleaner(Activity activity) {
        this.f2155OooO0Oo = activity;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(@NonNull LifecycleOwner lifecycleOwner, @NonNull Lifecycle.Event event) {
        if (event != Lifecycle.Event.ON_DESTROY) {
            return;
        }
        if (f2152OooO0o0 == 0) {
            try {
                f2152OooO0o0 = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                f2153OooO0oO = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                f2154OooO0oo = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                f2151OooO0o = declaredField3;
                declaredField3.setAccessible(true);
                f2152OooO0o0 = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (f2152OooO0o0 == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f2155OooO0Oo.getSystemService("input_method");
            try {
                Object obj = f2151OooO0o.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) f2153OooO0oO.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                f2154OooO0oo.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
