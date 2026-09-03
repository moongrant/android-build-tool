package p023Oooo00o;

import android.hardware.camera2.CameraDevice;
import com.yalla.yalla.model.RoomRunWayModel;
import kotlin.jvm.internal.Intrinsics;
import p552o0oOOoOo.o0OO0o00;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oOo00OO0 implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f1003OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f1004OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f1005OooO0o0;

    public /* synthetic */ oOo00OO0(int i, Object obj, Object obj2) {
        this.f1003OooO0Oo = i;
        this.f1005OooO0o0 = obj;
        this.f1004OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jRound;
        int i = this.f1003OooO0Oo;
        Object obj = this.f1004OooO0o;
        Object obj2 = this.f1005OooO0o0;
        switch (i) {
            case 0:
                ((oO00O0o.OooO0O0) obj2).f957OooO00o.onDisconnected((CameraDevice) obj);
                break;
            default:
                RoomRunWayModel roomRunWayModel = (RoomRunWayModel) obj2;
                o0OO0o00 this$0 = (o0OO0o00) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i2 = 1;
                while (i2 <= roomRunWayModel.getGiftNum()) {
                    int giftNum = roomRunWayModel.getGiftNum();
                    this$0.getClass();
                    if (giftNum >= 77) {
                        if (giftNum == 77) {
                            double d = 2;
                            jRound = Math.round((Math.random() * d) + d);
                        } else {
                            double d2 = 10;
                            jRound = Math.round((Math.random() * d2) + d2);
                        }
                        i2 += (int) jRound;
                        if (i2 >= giftNum - 1) {
                            i2 = giftNum;
                        }
                    }
                    if (this$0.f55979OooOO0O) {
                        this$0.f55978OooOO0.obtainMessage(this$0.f55977OooO0oo, Integer.valueOf(i2)).sendToTarget();
                        try {
                            Thread.sleep(300L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        i2++;
                    }
                    break;
                }
                this$0.f55978OooOO0.obtainMessage(this$0.f55969OooO).sendToTarget();
                break;
        }
    }
}
