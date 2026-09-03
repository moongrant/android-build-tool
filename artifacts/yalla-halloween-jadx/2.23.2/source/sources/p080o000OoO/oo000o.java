package p080o000OoO;

import android.os.Bundle;
import android.os.IBinder;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p069o0000ooO.o000000O;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class oo000o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    @Nullable
    public static Method f34998OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    @Nullable
    public static Method f34999OooO0O0;

    @Nullable
    public static IBinder OooO00o(Bundle bundle, @Nullable String str) {
        if (o00.f34910OooO00o >= 18) {
            return bundle.getBinder(str);
        }
        Method method = f34998OooO00o;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", String.class);
                f34998OooO00o = method2;
                method2.setAccessible(true);
                method = f34998OooO00o;
            } catch (NoSuchMethodException e) {
                Log.OooO0o0("BundleUtil", Log.OooO00o("Failed to retrieve getIBinder method", e));
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.OooO0o0("BundleUtil", Log.OooO00o("Failed to invoke getIBinder via reflection", e2));
            return null;
        }
    }

    public static void OooO0O0(Bundle bundle, @Nullable String str, @Nullable o000000O o000000o2) {
        if (o00.f34910OooO00o >= 18) {
            bundle.putBinder(str, o000000o2);
            return;
        }
        Method method = f34999OooO0O0;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                f34999OooO0O0 = method2;
                method2.setAccessible(true);
                method = f34999OooO0O0;
            } catch (NoSuchMethodException e) {
                Log.OooO0o0("BundleUtil", Log.OooO00o("Failed to retrieve putIBinder method", e));
                return;
            }
        }
        try {
            method.invoke(bundle, str, o000000o2);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
            Log.OooO0o0("BundleUtil", Log.OooO00o("Failed to invoke putIBinder via reflection", e2));
        }
    }
}
