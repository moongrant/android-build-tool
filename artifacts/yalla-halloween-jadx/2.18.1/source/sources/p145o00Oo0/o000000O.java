package p145o00Oo0;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class o000000O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public static Method f32058OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Method f32059OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public static boolean f32060OooO0OO;

    @SuppressLint({"SoonBlockedPrivateApi"})
    public static final void OooO00o(@NotNull Canvas canvas, boolean z) {
        Method method;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            o00000.f32057OooO00o.OooO00o(canvas, z);
            return;
        }
        if (!f32060OooO0OO) {
            try {
                if (i == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f32058OooO00o = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f32059OooO0O0 = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f32058OooO00o = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    f32059OooO0O0 = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                }
                Method method2 = f32058OooO00o;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f32059OooO0O0;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f32060OooO0OO = true;
        }
        if (z) {
            try {
                Method method4 = f32058OooO00o;
                if (method4 != null) {
                    Intrinsics.checkNotNull(method4);
                    method4.invoke(canvas, new Object[0]);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = f32059OooO0O0) == null) {
            return;
        }
        Intrinsics.checkNotNull(method);
        method.invoke(canvas, new Object[0]);
    }
}
