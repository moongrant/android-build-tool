package p029Oooo0oo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageCaptureException;
import p030OoooO.OooOOO0;
import p031OoooO0.o0Oo0oo;

/* JADX INFO: loaded from: classes.dex */
public final class o0OOOO00 implements OooOOO0<Void> {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final /* synthetic */ o0OoO00O f1321OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final /* synthetic */ o0OOOO0o f1322OooO0O0;

    public o0OOOO00(o0OOOO0o o0oooo0o, o0OoO00O o0ooo00o2) {
        this.f1322OooO0O0 = o0oooo0o;
        this.f1321OooO00o = o0ooo00o2;
    }

    @Override // p030OoooO.OooOOO0
    public final void OooO00o(@NonNull Throwable th) {
        if (((o0OO00OO) this.f1321OooO00o.f1334OooO0O0).f1301OooO0oO) {
            return;
        }
        boolean z = th instanceof ImageCaptureException;
        o0OOOO0o o0oooo0o = this.f1322OooO0O0;
        if (z) {
            o0oO0O0o o0oo0o0o2 = o0oooo0o.f1325OooO0OO;
            o0oo0o0o2.getClass();
            o0Oo0oo.OooO00o();
            o0oo0o0o2.f1345OooO0o.f1230OooO.accept((ImageCaptureException) th);
        } else {
            o0oO0O0o o0oo0o0o3 = o0oooo0o.f1325OooO0OO;
            ImageCaptureException imageCaptureException = new ImageCaptureException(th, "Failed to submit capture request");
            o0oo0o0o3.getClass();
            o0Oo0oo.OooO00o();
            o0oo0o0o3.f1345OooO0o.f1230OooO.accept(imageCaptureException);
        }
        ((ImageCapture.OooO00o) o0oooo0o.f1324OooO0O0).OooO00o();
    }

    @Override // p030OoooO.OooOOO0
    public final void onSuccess(@Nullable Void r1) {
        ((ImageCapture.OooO00o) this.f1322OooO0O0.f1324OooO0O0).OooO00o();
    }
}
