package o00000O;

import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class OooOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Object f33410OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f33411OooO0o0;

    public OooOO0(Object obj, Object obj2) {
        this.f33410OooO0Oo = obj;
        this.f33411OooO0o0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Method method = OooOO0O.f33415OooO0Oo;
            Object obj = this.f33411OooO0o0;
            Object obj2 = this.f33410OooO0Oo;
            if (method != null) {
                method.invoke(obj2, obj, Boolean.FALSE, "AppCompat recreation");
            } else {
                OooOO0O.f33417OooO0o0.invoke(obj2, obj, Boolean.FALSE);
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
