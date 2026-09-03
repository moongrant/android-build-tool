package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public final class o0OoOo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f5468OooO00o = false;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Method f5469OooO0O0 = null;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f5470OooO0OO = false;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static Field f5471OooO0Oo;

    public interface OooO00o {
        boolean superDispatchKeyEvent(@NonNull KeyEvent keyEvent);
    }

    public static boolean OooO00o(@NonNull View view, @NonNull KeyEvent keyEvent) {
        WeakReference<View> weakReferenceValueAt;
        int iIndexOfKey;
        WeakHashMap<View, o000OOo0> weakHashMap = ViewCompat.f5341OooO00o;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList<WeakReference<View>> arrayList = ViewCompat.o00Ooo.f5356OooO0Oo;
            int i = o00000O0.OooO.tag_unhandled_key_event_manager;
            ViewCompat.o00Ooo o00ooo2 = (ViewCompat.o00Ooo) view.getTag(i);
            if (o00ooo2 == null) {
                o00ooo2 = new ViewCompat.o00Ooo();
                view.setTag(i, o00ooo2);
            }
            WeakReference<KeyEvent> weakReference = o00ooo2.f5359OooO0OO;
            if (weakReference == null || weakReference.get() != keyEvent) {
                o00ooo2.f5359OooO0OO = new WeakReference<>(keyEvent);
                if (o00ooo2.f5358OooO0O0 == null) {
                    o00ooo2.f5358OooO0O0 = new SparseArray<>();
                }
                SparseArray<WeakReference<View>> sparseArray = o00ooo2.f5358OooO0O0;
                if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) < 0) {
                    weakReferenceValueAt = null;
                } else {
                    weakReferenceValueAt = sparseArray.valueAt(iIndexOfKey);
                    sparseArray.removeAt(iIndexOfKey);
                }
                if (weakReferenceValueAt == null) {
                    weakReferenceValueAt = sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReferenceValueAt != null) {
                    View view2 = weakReferenceValueAt.get();
                    if (view2 == null || !ViewCompat.OooOO0O.OooO0O0(view2)) {
                        return true;
                    }
                    ViewCompat.o00Ooo.OooO0O0(view2, keyEvent);
                    return true;
                }
            }
        }
        return false;
    }

    @SuppressLint({"LambdaLast"})
    public static boolean OooO0O0(@NonNull OooO00o oooO00o, @Nullable View view, @Nullable Window.Callback callback, @NonNull KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        boolean zBooleanValue = false;
        if (oooO00o == null) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return oooO00o.superDispatchKeyEvent(keyEvent);
        }
        if (callback instanceof Activity) {
            Activity activity = (Activity) callback;
            activity.onUserInteraction();
            Window window = activity.getWindow();
            if (window.hasFeature(8)) {
                ActionBar actionBar = activity.getActionBar();
                if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                    if (!f5468OooO00o) {
                        try {
                            f5469OooO0O0 = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                        } catch (NoSuchMethodException unused) {
                        }
                        f5468OooO00o = true;
                    }
                    Method method = f5469OooO0O0;
                    if (method != null) {
                        try {
                            Object objInvoke = method.invoke(actionBar, keyEvent);
                            if (objInvoke != null) {
                                zBooleanValue = ((Boolean) objInvoke).booleanValue();
                            }
                        } catch (IllegalAccessException | InvocationTargetException unused2) {
                        }
                    }
                    if (zBooleanValue) {
                        return true;
                    }
                }
            }
            if (window.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
            View decorView = window.getDecorView();
            if (ViewCompat.OooO0OO(decorView, keyEvent)) {
                return true;
            }
            return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
        }
        if (!(callback instanceof Dialog)) {
            return (view != null && ViewCompat.OooO0OO(view, keyEvent)) || oooO00o.superDispatchKeyEvent(keyEvent);
        }
        Dialog dialog = (Dialog) callback;
        if (!f5470OooO0OO) {
            try {
                Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                f5471OooO0Oo = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused3) {
            }
            f5470OooO0OO = true;
        }
        Field field = f5471OooO0Oo;
        if (field != null) {
            try {
                onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
            } catch (IllegalAccessException unused4) {
                onKeyListener = null;
            }
        } else {
            onKeyListener = null;
        }
        if (onKeyListener != null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window2 = dialog.getWindow();
        if (window2.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window2.getDecorView();
        if (ViewCompat.OooO0OO(decorView2, keyEvent)) {
            return true;
        }
        return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
    }
}
