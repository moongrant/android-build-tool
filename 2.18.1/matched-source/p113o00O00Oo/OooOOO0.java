package p113o00O00Oo;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import com.app.base.application.App;
import com.facebook.appevents.AccessTokenAppIdPair;
import com.facebook.appevents.AppEvent;
import com.facebook.appevents.AppEventQueue;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class OooOOO0 implements Runnable {

    /* JADX INFO: renamed from: Oooo0o, reason: collision with root package name */
    public final /* synthetic */ int f30253Oooo0o;

    /* JADX INFO: renamed from: Oooo0oO, reason: collision with root package name */
    public final /* synthetic */ Object f30254Oooo0oO;

    /* JADX INFO: renamed from: Oooo0oo, reason: collision with root package name */
    public final /* synthetic */ Object f30255Oooo0oo;

    public /* synthetic */ OooOOO0(Object obj, Object obj2, int i) {
        this.f30253Oooo0o = i;
        this.f30254Oooo0oO = obj;
        this.f30255Oooo0oo = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30253Oooo0o) {
            case 0:
                OooOOO this$0 = (OooOOO) this.f30254Oooo0oO;
                Bitmap bitmap = (Bitmap) this.f30255Oooo0oo;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
                this$0.f30246OooO0O0.OooO0O0(bitmap);
                break;
            case 1:
                ((NotificationManager) App.f11458Oooo0oO.getSystemService("notification")).notify((String) this.f30254Oooo0oO, 0, ((Notification.Builder) this.f30255Oooo0oo).build());
                break;
            default:
                AppEventQueue.m111add$lambda3((AccessTokenAppIdPair) this.f30254Oooo0oO, (AppEvent) this.f30255Oooo0oo);
                break;
        }
    }
}
