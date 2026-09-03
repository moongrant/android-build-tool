package p245o00oo0o;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p203o00o0o0o.o000;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class o00O00O {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public static Method f40561OooO00o;

    public static void OooO00o(Bundle bundle, @Nullable String str, @Nullable o000 o000Var) {
        if (o0O00.f40595OooO00o >= 18) {
            bundle.putBinder(str, o000Var);
            return;
        }
        Method method = f40561OooO00o;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f40561OooO00o = method2;
                method2.setAccessible(true);
                method = f40561OooO00o;
            } catch (NoSuchMethodException e) {
                Log.OooO0o0("BundleUtil", Log.OooO00o("Failed to retrieve putIBinder method", e));
                return;
            }
        }
        try {
            method.invoke(bundle, str, o000Var);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.OooO0o0("BundleUtil", Log.OooO00o("Failed to invoke putIBinder via reflection", e2));
        }
    }
}
