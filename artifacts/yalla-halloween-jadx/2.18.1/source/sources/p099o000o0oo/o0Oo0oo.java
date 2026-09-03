package p099o000o0oo;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class o0Oo0oo {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static long f29321OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public static Method f29322OooO0O0;

    @SuppressLint({"NewApi"})
    public static boolean OooO00o() {
        try {
            if (f29322OooO0O0 == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f29322OooO0O0 == null) {
                f29321OooO00o = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f29322OooO0O0 = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f29322OooO0O0.invoke(null, Long.valueOf(f29321OooO00o))).booleanValue();
        } catch (Exception e) {
            if (!(e instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
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
