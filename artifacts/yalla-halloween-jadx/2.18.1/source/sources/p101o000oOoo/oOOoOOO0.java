package p101o000oOoo;

import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class oOOoOOO0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static Method f29777OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static boolean f29778OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static Field f29779OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f29780OooO0Oo;

    public void OooO00o(@NonNull View view, int i, int i2, int i3, int i4) {
        if (!f29778OooO0O0) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                f29777OooO00o = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException e) {
                Log.i("ViewUtilsBase", "Failed to retrieve setFrame method", e);
            }
            f29778OooO0O0 = true;
        }
        Method method = f29777OooO00o;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused) {
            } catch (InvocationTargetException e2) {
                throw new RuntimeException(e2.getCause());
            }
        }
    }

    public void OooO0O0(@NonNull View view, int i) {
        if (!f29780OooO0Oo) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f29779OooO0OO = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsBase", "fetchViewFlagsField: ");
            }
            f29780OooO0Oo = true;
        }
        Field field = f29779OooO0OO;
        if (field != null) {
            try {
                f29779OooO0OO.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
