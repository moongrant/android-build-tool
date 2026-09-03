package p023Oooo00o;

import android.hardware.camera2.CameraDevice;
import androidx.media3.exoplayer.audio.OooO0O0;
import com.yalla.yalla.model.RoomRunWayModel;
import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.metrics.export.IntervalMetricReader;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;
import p080o000OoO.o000OO00;
import p558o0oOOoo.o0O;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oO00O0o implements Runnable {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ int f948OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final /* synthetic */ Object f949OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final /* synthetic */ Object f950OooO0o0;

    public /* synthetic */ oO00O0o(int i, Object obj, Object obj2) {
        this.f948OooO0Oo = i;
        this.f950OooO0o0 = obj;
        this.f949OooO0o = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long jRound;
        int i = this.f948OooO0Oo;
        Object obj = this.f949OooO0o;
        Object obj2 = this.f950OooO0o0;
        switch (i) {
            case 0:
                ((oO0O0OoO.OooO0O0) obj2).f972OooO00o.onOpened((CameraDevice) obj);
                break;
            case 1:
                OooO0O0.OooO00o oooO00o = (OooO0O0.OooO00o) obj2;
                oooO00o.getClass();
                int i2 = o000OO00.f34965OooO00o;
                oooO00o.f7535OooO0O0.OooO0OO((String) obj);
                break;
            case 2:
                RoomRunWayModel roomRunWayModel = (RoomRunWayModel) obj2;
                o0O this$0 = (o0O) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                int i3 = 1;
                while (i3 <= roomRunWayModel.getGiftNum()) {
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
                        i3 += (int) jRound;
                        if (i3 >= giftNum - 1) {
                            i3 = giftNum;
                        }
                    }
                    if (this$0.f56076OooOO0O) {
                        this$0.f56075OooOO0.obtainMessage(this$0.f56074OooO0oo, Integer.valueOf(i3)).sendToTarget();
                        try {
                            Thread.sleep(300L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        i3++;
                    }
                    break;
                }
                this$0.f56075OooOO0.obtainMessage(this$0.f56066OooO).sendToTarget();
                break;
            default:
                CompletableResultCode completableResultCode = (CompletableResultCode) obj;
                Logger logger = IntervalMetricReader.f32765OooO0o0;
                if (!((CompletableResultCode) obj2).OooO0O0()) {
                    completableResultCode.OooO00o();
                } else {
                    completableResultCode.OooO0o0();
                }
                break;
        }
    }
}
