package p025Oooo0OO;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.params.SessionConfigurationCompat;
import androidx.camera.core.impl.oo0o0O0;
import com.google.common.util.concurrent.OooOO0O;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p022Oooo00O.o0O0o0;
import p022Oooo00O.o0oO0O0o;
import p024Oooo0O0.o0000oo;
import p030OoooO.OooOO0;
import p030OoooO.OooOOO;
import p030OoooO.OooOo;
import p033OoooO0O.o00oO0o;
import p639o0ooOO0.o000Oo0;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class o000O0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final boolean f1046OooO00o;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    @NonNull
    public final OooOO0O<Void> f1048OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public o000Oo0.OooO00o<Void> f1049OooO0Oo;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f1051OooO0o0;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Object f1047OooO0O0 = new Object();

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public final OooO00o f1050OooO0o = new OooO00o();

    public class OooO00o extends CameraCaptureSession.CaptureCallback {
        public OooO00o() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i) {
            o000O0o o000o0o2 = o000O0o.this;
            o000Oo0.OooO00o<Void> oooO00o = o000o0o2.f1049OooO0Oo;
            if (oooO00o != null) {
                oooO00o.f57739OooO0Oo = true;
                o000Oo0.OooO0o<Void> oooO0o = oooO00o.f57737OooO0O0;
                if (oooO0o != null && oooO0o.f57741OooO0o0.cancel(true)) {
                    oooO00o.f57736OooO00o = null;
                    oooO00o.f57737OooO0O0 = null;
                    oooO00o.f57738OooO0OO = null;
                }
                o000o0o2.f1049OooO0Oo = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j, long j2) {
            o000O0o o000o0o2 = o000O0o.this;
            o000Oo0.OooO00o<Void> oooO00o = o000o0o2.f1049OooO0Oo;
            if (oooO00o != null) {
                oooO00o.OooO0O0(null);
                o000o0o2.f1049OooO0Oo = null;
            }
        }
    }

    @FunctionalInterface
    public interface OooO0O0 {
    }

    public o000O0o(@NonNull oo0o0O0 oo0o0o0) {
        boolean zOooO00o = oo0o0o0.OooO00o(o0000oo.class);
        this.f1046OooO00o = zOooO00o;
        if (zOooO00o) {
            this.f1048OooO0OO = o000Oo0.OooO00o(new o000O000(this));
        } else {
            this.f1048OooO0OO = OooOo.OooO0Oo(null);
        }
    }

    @NonNull
    public static OooOOO OooO00o(@NonNull final CameraDevice cameraDevice, @NonNull final SessionConfigurationCompat sessionConfigurationCompat, @NonNull final o0O0o0 o0o0o0, @NonNull final List list, @NonNull ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((o0oO0O0o) it.next()).OooO());
        }
        return OooOOO.OooO00o(OooOo.OooO0oO(arrayList2)).OooO0OO(new OooOO0() { // from class: Oooo0OO.o000
            @Override // p030OoooO.OooOO0
            public final OooOO0O apply(Object obj) {
                return super/*Oooo00O.o0O0OOOo*/.OooO00o(cameraDevice, sessionConfigurationCompat, list);
            }
        }, o00oO0o.OooO00o());
    }
}
