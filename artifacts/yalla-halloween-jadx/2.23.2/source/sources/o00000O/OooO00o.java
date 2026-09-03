package o00000O;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class OooO00o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f33403OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f33404OooO0o0;

    public /* synthetic */ OooO00o(Object obj, int i) {
        this.f33403OooO0Oo = i;
        this.f33404OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = this.f33403OooO0Oo;
        Object obj2 = this.f33404OooO0o0;
        switch (i) {
            case 0:
                Activity activity = (Activity) obj2;
                if (activity.isFinishing()) {
                    return;
                }
                int i2 = Build.VERSION.SDK_INT;
                boolean z = true;
                if (i2 >= 28) {
                    Class<?> cls = OooOO0O.f33412OooO00o;
                    activity.recreate();
                } else {
                    Class<?> cls2 = OooOO0O.f33412OooO00o;
                    boolean z2 = i2 == 26 || i2 == 27;
                    Method method = OooOO0O.f33416OooO0o;
                    if ((z2 && method == null) || (OooOO0O.f33417OooO0o0 == null && OooOO0O.f33415OooO0Oo == null)) {
                        z = false;
                    } else {
                        try {
                            Object obj3 = OooOO0O.f33414OooO0OO.get(activity);
                            if (obj3 == null || (obj = OooOO0O.f33413OooO0O0.get(activity)) == null) {
                                z = false;
                            } else {
                                Application application = activity.getApplication();
                                OooOO0O.OooO00o oooO00o = new OooOO0O.OooO00o(activity);
                                application.registerActivityLifecycleCallbacks(oooO00o);
                                Handler handler = OooOO0O.f33418OooO0oO;
                                handler.post(new OooO0o(oooO00o, obj3));
                                try {
                                    if (i2 == 26 || i2 == 27) {
                                        Boolean bool = Boolean.FALSE;
                                        method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                    } else {
                                        activity.recreate();
                                    }
                                    handler.post(new OooO(application, oooO00o));
                                } catch (Throwable th) {
                                    handler.post(new OooO(application, oooO00o));
                                    throw th;
                                }
                            }
                            break;
                        } catch (Throwable unused) {
                        }
                    }
                }
                if (z) {
                    return;
                }
                activity.recreate();
                return;
            case 1:
                ((DefaultDrmSession) obj2).OooO0o0(null);
                return;
            default:
                ((androidx.media3.session.o000oOoO) obj2).release();
                return;
        }
    }
}
