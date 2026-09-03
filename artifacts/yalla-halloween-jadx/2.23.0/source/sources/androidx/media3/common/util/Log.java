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
import p037OoooOo0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public final class Log {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final Object f6261OooO00o = new Object();

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    @Pure
    public static void OooO00o(String str, @Nullable GlUtil.GlException glException) {
        boolean z;
        String strReplace;
        synchronized (f6261OooO00o) {
            Throwable cause = glException;
            while (true) {
                if (cause == null) {
                    z = false;
                    break;
                }
                try {
                    if (cause instanceof UnknownHostException) {
                        z = true;
                        break;
                    }
                    cause = cause.getCause();
                } catch (Throwable th) {
                    throw th;
                }
            }
            strReplace = z ? "UnknownHostException (no network)" : android.util.Log.getStackTraceString(glException).trim().replace("\t", "    ");
        }
        if (!TextUtils.isEmpty(strReplace)) {
            StringBuilder sbOooO0O0 = o000Oo0.OooO0O0(str, "\n  ");
            sbOooO0O0.append(strReplace.replace("\n", "\n  "));
            sbOooO0O0.append('\n');
            str = sbOooO0O0.toString();
        }
        OooO0O0("SceneRenderer", str);
    }

    @Pure
    public static void OooO0O0(@Size(max = 23) String str, String str2) {
        synchronized (f6261OooO00o) {
            android.util.Log.e(str, str2);
        }
    }

    @Pure
    public static void OooO0OO(@Size(max = 23) String str, String str2) {
        synchronized (f6261OooO00o) {
            android.util.Log.w(str, str2);
        }
    }
}
