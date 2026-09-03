package p460o0Ooo0o;

import android.view.ScaleGestureDetector;
import androidx.camera.core.CameraControl;
import androidx.camera.core.CameraInfo;
import androidx.lifecycle.LiveData;
import com.yalla.yalla.module.media.camera.CameraViewModel;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p028Oooo0oO.o000O0Oo;
import p028Oooo0oO.o0O0o;

/* JADX INFO: loaded from: classes4.dex */
public final class o00O0OOO extends ScaleGestureDetector.SimpleOnScaleGestureListener {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ CameraViewModel f47785OooO00o;

    public o00O0OOO(CameraViewModel cameraViewModel) {
        this.f47785OooO00o = cameraViewModel;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(@NotNull ScaleGestureDetector detector) {
        float fOooO00o;
        CameraControl cameraControlOooO0OO;
        CameraInfo cameraInfoOooO00o;
        Intrinsics.checkNotNullParameter(detector, "detector");
        CameraViewModel cameraViewModel = this.f47785OooO00o;
        o000O0Oo o000o0oo2 = cameraViewModel.f23771OooOOo0;
        LiveData<o0O0o> liveDataOooOOOo = (o000o0oo2 == null || (cameraInfoOooO00o = o000o0oo2.OooO00o()) == null) ? null : cameraInfoOooO00o.OooOOOo();
        try {
            Intrinsics.checkNotNull(liveDataOooOOOo);
            o0O0o value = liveDataOooOOOo.getValue();
            Intrinsics.checkNotNull(value);
            fOooO00o = value.OooO00o();
        } catch (NullPointerException unused) {
            fOooO00o = 0.0f;
        }
        float scaleFactor = detector.getScaleFactor();
        o000O0Oo o000o0oo3 = cameraViewModel.f23771OooOOo0;
        if (o000o0oo3 == null || (cameraControlOooO0OO = o000o0oo3.OooO0OO()) == null) {
            return true;
        }
        cameraControlOooO0OO.OooO0O0(fOooO00o * scaleFactor);
        return true;
    }
}
