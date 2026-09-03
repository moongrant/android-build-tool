package o00O00O;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import com.google.firebase.perf.metrics.resource.ResourceType;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes2.dex */
public final class OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static long f36024OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Method f36025OooO0O0;

    @SuppressLint({"NewApi"})
    public static boolean OooO00o() {
        try {
            if (f36025OooO0O0 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f36025OooO0O0 == null) {
                f36024OooO00o = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f36025OooO0O0 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f36025OooO0O0.invoke(null, Long.valueOf(f36024OooO00o))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v(ResourceType.TRACE, "Unable to call isTagEnabled via reflection", e);
                return false;
            }
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
