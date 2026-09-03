package p114o00O00Oo;

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

    /* JADX INFO: renamed from: Oooo, reason: collision with root package name */
    public final /* synthetic */ int f30271Oooo;

    /* JADX INFO: renamed from: OoooO0, reason: collision with root package name */
    public final /* synthetic */ Object f30272OoooO0;

    /* JADX INFO: renamed from: OoooO00, reason: collision with root package name */
    public final /* synthetic */ Object f30273OoooO00;

    public /* synthetic */ OooOOO0(Object obj, Object obj2, int i) {
        this.f30271Oooo = i;
        this.f30273OoooO00 = obj;
        this.f30272OoooO0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30271Oooo) {
            case 0:
                OooOOO this$0 = (OooOOO) this.f30273OoooO00;
                Bitmap bitmap = (Bitmap) this.f30272OoooO0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Intrinsics.checkNotNullParameter(bitmap, "$bitmap");
                this$0.f30264OooO0O0.OooO0O0(bitmap);
                break;
            case 1:
                ((NotificationManager) App.f11473OoooO00.getSystemService("notification")).notify((String) this.f30273OoooO00, 0, ((Notification.Builder) this.f30272OoooO0).build());
                break;
            default:
                AppEventQueue.m111add$lambda3((AccessTokenAppIdPair) this.f30273OoooO00, (AppEvent) this.f30272OoooO0);
                break;
        }
    }
}
