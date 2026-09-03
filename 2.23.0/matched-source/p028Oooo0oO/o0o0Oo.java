package p028Oooo0oO;

import android.app.Notification;
import android.app.NotificationManager;
import androidx.camera.core.SurfaceRequest;
import com.yalla.yalla.app.application.App;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o0o0Oo implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1199OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1200OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1201OooO0o0;

    public /* synthetic */ o0o0Oo(int i, Object obj, Object obj2) {
        this.f1199OooO0Oo = i;
        this.f1201OooO0o0 = obj;
        this.f1200OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1199OooO0Oo;
        Object obj = this.f1200OooO0o;
        Object obj2 = this.f1201OooO0o0;
        switch (i) {
            case 0:
                ((SurfaceRequest.OooO0o) obj2).OooO00o((SurfaceRequest.OooO0OO) obj);
                break;
            default:
                ((NotificationManager) App.f22702OooO0o.getSystemService("notification")).notify((String) obj2, 0, ((Notification.Builder) obj).build());
                break;
        }
    }
}
