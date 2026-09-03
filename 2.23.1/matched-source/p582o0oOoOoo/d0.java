package p582o0oOoOoo;

import android.content.Context;
import android.widget.Toast;
import androidx.camera.core.CameraState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends Lambda implements Function1<CameraState, Unit> {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final /* synthetic */ Context f56482OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context) {
        super(1);
        this.f56482OooO0Oo = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(CameraState cameraState) {
        CameraState.OooO00o OooO00o2 = cameraState.OooO00o();
        if (OooO00o2 != null) {
            int iOooO0O0 = OooO00o2.OooO0O0();
            Context context = this.f56482OooO0Oo;
            switch (iOooO0O0) {
                case 1:
                    Toast.makeText(context, "Max cameras in use", 0).show();
                    break;
                case 2:
                    Toast.makeText(context, "Camera in use", 0).show();
                    break;
                case 3:
                    Toast.makeText(context, "Other recoverable error", 0).show();
                    break;
                case 4:
                    Toast.makeText(context, "Stream config error", 0).show();
                    break;
                case 5:
                    Toast.makeText(context, "Camera disabled", 0).show();
                    break;
                case 6:
                    Toast.makeText(context, "Fatal error", 0).show();
                    break;
                case 7:
                    Toast.makeText(context, "Do not disturb mode enabled", 0).show();
                    break;
            }
        }
        return Unit.INSTANCE;
    }
}
