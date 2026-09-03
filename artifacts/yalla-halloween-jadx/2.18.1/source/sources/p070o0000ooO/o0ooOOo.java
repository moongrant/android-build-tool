package p070o0000ooO;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class o0ooOOo implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ Object f28022Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f28023Oooo0oO;

    public o0ooOOo(Object obj, Object obj2) {
        this.f28022Oooo0o = obj;
        this.f28023Oooo0oO = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = o0OOO0o.f28012OooO0Oo;
            if (method != null) {
                method.invoke(this.f28022Oooo0o, this.f28023Oooo0oO, Boolean.FALSE, "AppCompat recreation");
            } else {
                o0OOO0o.f28014OooO0o0.invoke(this.f28022Oooo0o, this.f28023Oooo0oO, Boolean.FALSE);
            }
        } catch (RuntimeException e) {
            if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                throw e;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
        }
    }
}
