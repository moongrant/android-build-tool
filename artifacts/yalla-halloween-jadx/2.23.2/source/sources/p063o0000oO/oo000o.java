package p063o0000oO;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.lang.reflect.InvocationTargetException;
import p028Oooo0oO.o00;

/* JADX INFO: loaded from: classes.dex */
public final class oo000o {

    @RequiresApi(28)
    public static class OooO00o {
        public static Handler OooO00o(Looper looper) {
            return Handler.createAsync(looper);
        }

        public static boolean OooO0O0(Handler handler, o00 o00Var) {
            return handler.postDelayed(o00Var, "retry_token", 500L);
        }
    }

    @NonNull
    public static Handler OooO00o(@NonNull Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return OooO00o.OooO00o(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e) {
            e = e;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e2) {
            e = e2;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e3) {
            e = e3;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(cause);
        }
    }
}
