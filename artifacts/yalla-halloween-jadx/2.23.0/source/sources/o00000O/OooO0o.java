package o00000O;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class OooO0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f33933OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f33934OooO0o0;

    public OooO0o(Object obj, Object obj2) {
        this.f33933OooO0Oo = obj;
        this.f33934OooO0o0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = OooO.f33917OooO0Oo;
            Object obj = this.f33934OooO0o0;
            Object obj2 = this.f33933OooO0Oo;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                OooO.f33919OooO0o0.invoke(obj2, obj, Boolean.FALSE);
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
