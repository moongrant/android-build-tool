package p039OoooOoo;

import android.os.Looper;
import androidx.camera.video.OooOO0O;
import androidx.camera.video.VideoRecordEvent;
import androidx.media3.common.OooOO0;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager;
import androidx.media3.session.o000OO;
import androidx.media3.session.o000OO00;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import o00O0O0O.OooO00o;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o00OOO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1677OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1678OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1679OooO0o0;

    public /* synthetic */ o00OOO0(int i, Object obj, Object obj2) {
        this.f1677OooO0Oo = i;
        this.f1679OooO0o0 = obj;
        this.f1678OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f1677OooO0Oo;
        Object obj = this.f1678OooO0o;
        Object obj2 = this.f1679OooO0o0;
        switch (i) {
            case 0:
                ((OooOO0O.OooOOO0) obj2).OooOOoo().accept((VideoRecordEvent) obj);
                break;
            case 1:
                DefaultDrmSessionManager.OooO0OO oooO0OO = (DefaultDrmSessionManager.OooO0OO) obj2;
                OooOO0 oooOO1 = (OooOO0) obj;
                DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
                if (defaultDrmSessionManager.f7615OooOOOo != 0 && !oooO0OO.f7629OooO0o) {
                    Looper looper = defaultDrmSessionManager.f7621OooOo00;
                    looper.getClass();
                    oooO0OO.f7630OooO0o0 = defaultDrmSessionManager.OooO0o(looper, oooO0OO.f7628OooO0Oo, oooOO1, false);
                    defaultDrmSessionManager.f7612OooOOO.add(oooO0OO);
                    break;
                }
                break;
            case 2:
                o000OO o000oo2 = (o000OO) obj2;
                int i2 = o000OO00.f9327OooO0o0;
                o000oo2.getClass();
                ((o000OO00.OooO00o) obj).OooO0OO(o000oo2);
                break;
            default:
                List listenersList = (List) obj2;
                o00O0OO0.OooOO0O this$0 = (o00O0OO0.OooOO0O) obj;
                Intrinsics.checkNotNullParameter(listenersList, "$listenersList");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                Iterator it = listenersList.iterator();
                while (it.hasNext()) {
                    ((OooO00o) it.next()).OooO00o(this$0.f36256OooO0o0);
                }
                break;
        }
    }
}
