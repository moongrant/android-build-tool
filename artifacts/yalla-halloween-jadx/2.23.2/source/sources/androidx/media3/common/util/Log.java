package androidx.media3.common.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;
import org.checkerframework.dataflow.qual.Pure;
import p037OoooOo0.o000O0o;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Log {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f6941OooO00o = new Object();

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    @Pure
    public static String OooO00o(String str, @Nullable Throwable th) {
        boolean z;
        String strReplace;
        synchronized (f6941OooO00o) {
            try {
                if (th == null) {
                    strReplace = null;
                } else {
                    Throwable cause = th;
                    while (true) {
                        if (cause == null) {
                            z = false;
                            break;
                        }
                        if (cause instanceof UnknownHostException) {
                            z = true;
                            break;
                        }
                        cause = cause.getCause();
                    }
                    strReplace = z ? "UnknownHostException (no network)" : android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbOooO0O0 = o000O0o.OooO0O0(str, "\n  ");
        sbOooO0O0.append(strReplace.replace("\n", "\n  "));
        sbOooO0O0.append('\n');
        return sbOooO0O0.toString();
    }

    @Pure
    public static void OooO0O0(@Size(max = 23) String str, String str2) {
        synchronized (f6941OooO00o) {
            android.util.Log.d(str, str2);
        }
    }

    @Pure
    public static void OooO0OO(@Size(max = 23) String str, String str2) {
        synchronized (f6941OooO00o) {
            android.util.Log.e(str, str2);
        }
    }

    @Pure
    public static void OooO0Oo(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        OooO0OO(str, OooO00o(str2, th));
    }

    @Pure
    public static void OooO0o(@Size(max = 23) String str, String str2) {
        synchronized (f6941OooO00o) {
            android.util.Log.w(str, str2);
        }
    }

    @Pure
    public static void OooO0o0(@Size(max = 23) String str, String str2) {
        synchronized (f6941OooO00o) {
            android.util.Log.i(str, str2);
        }
    }

    @Pure
    public static void OooO0oO(@Size(max = 23) String str, String str2, @Nullable Throwable th) {
        OooO0o(str, OooO00o(str2, th));
    }
}
