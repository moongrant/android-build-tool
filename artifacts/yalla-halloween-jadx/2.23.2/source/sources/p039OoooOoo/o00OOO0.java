package p039OoooOoo;

import android.os.Looper;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.VideoRecordEvent;
import androidx.media3.common.OooOO0;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.session.o0000OO0;
import androidx.media3.session.o000OOo0;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o00O0O0O.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1674OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1675OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1676OooO0o0;

    public /* synthetic */ o00OOO0(int i, Object obj, Object obj2) {
        this.f1674OooO0Oo = i;
        this.f1676OooO0o0 = obj;
        this.f1675OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1674OooO0Oo;
        Object obj = this.f1675OooO0o;
        Object obj2 = this.f1676OooO0o0;
        switch (i) {
            case 0:
                ((OooOO0O.OooOOO0) obj2).OooOOo().accept((VideoRecordEvent) obj);
                break;
            case 1:
                DefaultDrmSessionManager.OooO0OO oooO0OO = (DefaultDrmSessionManager.OooO0OO) obj2;
                OooOO0 oooOO1 = (OooOO0) obj;
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager.f7610OooOOOo != 0 && !oooO0OO.f7624OooO0o) {
                    Looper looper = defaultDrmSessionManager.f7616OooOo00;
                    looper.getClass();
                    oooO0OO.f7625OooO0o0 = defaultDrmSessionManager.OooO0o(looper, oooO0OO.f7623OooO0Oo, oooOO1, false);
                    defaultDrmSessionManager.f7607OooOOO.add(oooO0OO);
                    break;
                }
                break;
            case 2:
                o0000OO0 o0000oo1 = (o0000OO0) obj2;
                int i2 = o000OOo0.f9318OooO0o0;
                o0000oo1.getClass();
                ((o000OOo0.OooO00o) obj).OooO0O0(o0000oo1);
                break;
            default:
                List listenersList = (List) obj2;
                o00O0OO0.OooOO0O this$0 = (o00O0OO0.OooOO0O) obj;
                Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Iterator it = listenersList.iterator();
                while (it.hasNext()) {
                    ((OooO00o) it.next()).OooO00o(this$0.f36260OooO0o0);
                }
                break;
        }
    }
}
