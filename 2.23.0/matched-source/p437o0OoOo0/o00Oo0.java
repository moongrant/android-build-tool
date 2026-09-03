package p437o0OoOo0;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import androidx.camera.view.OooO0OO;
import java.lang.reflect.Method;
import o00000O.OooO;
import o00000O.OooO00o;
import o00000O.OooO0O0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Oo0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f46074OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f46075OooO0o0;

    public /* synthetic */ o00Oo0(Object obj, int i) {
        this.f46074OooO0Oo = i;
        this.f46075OooO0o0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        int i = this.f46074OooO0Oo;
        Object obj2 = this.f46075OooO0o0;
        switch (i) {
            case 0:
                ((o000oOoO) ((OooO0OO.OooO00o) obj2)).OooO00o();
                break;
            default:
                Activity activity = (Activity) obj2;
                int i2 = OooO00o.f33927OooO0OO;
                if (!activity.isFinishing()) {
                    int i3 = Build.VERSION.SDK_INT;
                    boolean z = true;
                    if (i3 >= 28) {
                        Class<?> cls = OooO.f33914OooO00o;
                        activity.recreate();
                    } else {
                        Class<?> cls2 = OooO.f33914OooO00o;
                        boolean z2 = i3 == 26 || i3 == 27;
                        Method method = OooO.f33918OooO0o;
                        if ((z2 && method == null) || (OooO.f33919OooO0o0 == null && OooO.f33917OooO0Oo == null)) {
                            z = false;
                        } else {
                            try {
                                Object obj3 = OooO.f33916OooO0OO.get(activity);
                                if (obj3 == null || (obj = OooO.f33915OooO0O0.get(activity)) == null) {
                                    z = false;
                                } else {
                                    Application application = activity.getApplication();
                                    OooO.OooO00o oooO00o = new OooO.OooO00o(activity);
                                    application.registerActivityLifecycleCallbacks(oooO00o);
                                    Handler handler = OooO.f33920OooO0oO;
                                    handler.post(new OooO0O0(oooO00o, obj3));
                                    try {
                                        if (i3 == 26 || i3 == 27) {
                                            Boolean bool = Boolean.FALSE;
                                            method.invoke(obj, obj3, null, null, 0, bool, null, null, bool, bool);
                                        } else {
                                            activity.recreate();
                                        }
                                        handler.post(new o00000O.OooO0OO(application, oooO00o));
                                    } catch (Throwable th) {
                                        handler.post(new o00000O.OooO0OO(application, oooO00o));
                                        throw th;
                                    }
                                }
                            } catch (Throwable unused) {
                                z = false;
                            }
                        }
                    }
                    if (!z) {
                        activity.recreate();
                    }
                }
                break;
        }
    }
}
