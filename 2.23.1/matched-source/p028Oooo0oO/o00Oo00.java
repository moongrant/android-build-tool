package p028Oooo0oO;

import android.app.Notification;
import android.app.NotificationManager;
import android.view.Surface;
import androidx.camera.core.OooO;
import com.yalla.yalla.app.application.App;
import o000OO.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00Oo00 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1159OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1160OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1161OooO0o0;

    public /* synthetic */ o00Oo00(int i, Object obj, Object obj2) {
        this.f1159OooO0Oo = i;
        this.f1161OooO0o0 = obj;
        this.f1160OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1159OooO0Oo;
        Object obj = this.f1160OooO0o;
        Object obj2 = this.f1161OooO0o0;
        switch (i) {
            case 0:
                ((OooO00o) obj2).accept(new OooO(4, (Surface) obj));
                break;
            default:
                ((NotificationManager) App.f22236OooO0o.getSystemService("notification")).notify((String) obj2, 0, ((Notification.Builder) obj).build());
                break;
        }
    }
}
